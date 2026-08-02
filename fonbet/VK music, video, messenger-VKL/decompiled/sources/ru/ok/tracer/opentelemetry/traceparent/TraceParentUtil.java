package ru.ok.tracer.opentelemetry.traceparent;

import com.ironsource.B5;
import java.util.function.BiConsumer;
import ru.ok.tracer.opentelemetry.traceparent.TraceParentUtil;
import xsna.ok3;
import xsna.qhk0;
import xsna.rdp0;
import xsna.sm5;
import xsna.xe9;

/* compiled from: TraceParentUtil.kt */
/* loaded from: classes9.dex */
public final class TraceParentUtil {
    public static final String HTTP_HEADER_TRACE_PARENT = "traceparent";
    public static final String HTTP_HEADER_TRACE_STATE = "tracestate";
    private static final String TRACE_PARENT_HEADER_VERSION = "00";

    public static final String getTraceParentHeader(qhk0 qhk0Var) {
        sm5 sm5Var = (sm5) qhk0Var;
        if (!sm5Var.f) {
            return null;
        }
        String str = sm5Var.b;
        String str2 = sm5Var.c;
        rdp0 rdp0Var = sm5Var.d;
        StringBuilder a = xe9.a("00-", str, "-", str2, "-");
        a.append(rdp0Var);
        return a.toString();
    }

    public static final String getTraceStateHeader(qhk0 qhk0Var) {
        sm5 sm5Var = (sm5) qhk0Var;
        ok3 ok3Var = sm5Var.e;
        if (!sm5Var.f || ok3Var.b().isEmpty()) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        ok3Var.a(new BiConsumer() { // from class: xsna.udp0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TraceParentUtil.getTraceStateHeader$lambda$1$lambda$0(sb, (String) obj, (String) obj2);
            }
        });
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getTraceStateHeader$lambda$1$lambda$0(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append(',');
        }
        sb.append(str);
        sb.append(B5.U);
        sb.append(str2);
    }

    public static /* synthetic */ void getHTTP_HEADER_TRACE_PARENT$annotations() {
    }

    public static /* synthetic */ void getHTTP_HEADER_TRACE_STATE$annotations() {
    }
}
