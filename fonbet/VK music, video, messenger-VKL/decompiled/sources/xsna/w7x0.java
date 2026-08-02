package xsna;

import com.ironsource.B5;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.logging.Logger;
import ru.ok.tracer.opentelemetry.traceparent.TraceParentUtil;

/* compiled from: W3CTraceContextPropagator.java */
/* loaded from: classes8.dex */
public final class w7x0 {
    public static final List<String> a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final HashSet e;
    public static final w7x0 f;

    static {
        Logger.getLogger(w7x0.class.getName());
        a = Collections.unmodifiableList(Arrays.asList(TraceParentUtil.HTTP_HEADER_TRACE_PARENT, TraceParentUtil.HTTP_HEADER_TRACE_STATE));
        b = 36;
        c = 53;
        d = 55;
        f = new w7x0();
        e = new HashSet();
        for (int i = 0; i < 255; i++) {
            String hexString = Long.toHexString(i);
            if (hexString.length() < 2) {
                hexString = "0".concat(hexString);
            }
            e.add(hexString);
        }
    }

    public static void a(wmj wmjVar, Object obj, ujo0 ujo0Var) {
        String sb;
        if (wmjVar != null) {
            sm5 sm5Var = (sm5) ohk0.o(wmjVar).i();
            if (sm5Var.f) {
                int i = d;
                char[] a2 = s9o0.a(i);
                a2[0] = "00".charAt(0);
                a2[1] = "00".charAt(1);
                a2[2] = '-';
                String str = sm5Var.b;
                str.getChars(0, str.length(), a2, 3);
                int i2 = b;
                a2[i2 - 1] = '-';
                String str2 = sm5Var.c;
                str2.getChars(0, str2.length(), a2, i2);
                int i3 = c;
                a2[i3 - 1] = '-';
                String str3 = ((qpw) sm5Var.d).a;
                a2[i3] = str3.charAt(0);
                a2[i3 + 1] = str3.charAt(1);
                ujo0Var.a(obj, TraceParentUtil.HTTP_HEADER_TRACE_PARENT, new String(a2, 0, i));
                ok3 ok3Var = sm5Var.e;
                if (ok3Var.b().isEmpty()) {
                    return;
                }
                int i4 = v7x0.a;
                if (ok3Var.b().isEmpty()) {
                    sb = "";
                } else {
                    final StringBuilder sb2 = new StringBuilder(512);
                    ok3Var.a(new BiConsumer() { // from class: xsna.u7x0
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj2, Object obj3) {
                            String str4 = (String) obj2;
                            String str5 = (String) obj3;
                            StringBuilder sb3 = sb2;
                            if (sb3.length() != 0) {
                                sb3.append(',');
                            }
                            sb3.append(str4);
                            sb3.append(B5.U);
                            sb3.append(str5);
                        }
                    });
                    sb = sb2.toString();
                }
                ujo0Var.a(obj, TraceParentUtil.HTTP_HEADER_TRACE_STATE, sb);
            }
        }
    }

    public final String toString() {
        return "W3CTraceContextPropagator";
    }
}
