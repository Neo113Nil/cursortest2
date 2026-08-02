package androidx.compose.runtime.tooling;

import defpackage.bhd;
import defpackage.edz;
import defpackage.j73;
import defpackage.jl40;
import defpackage.rcc;
import defpackage.u1l;
import defpackage.ycc;
import defpackage.zf0;
import defpackage.zgd;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lzgd;", "trace", "Lzgd;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DiagnosticComposeException extends RuntimeException {
    private final zgd trace;

    public DiagnosticComposeException(zgd zgdVar) {
        this.trace = zgdVar;
        if (zgdVar.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, HProv.PP_DELETE_KEYSET, -127, 126665345, 200};
        List list = zgdVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            bhd bhdVar = (bhd) list.get(i);
            if (!j73.w(bhdVar.a, iArr)) {
                if (bhdVar.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((bhd) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        ycc.A(arrayList);
                    }
                } else {
                    arrayList.add(bhdVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((bhd) arrayList.get(i4)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        if (!this.trace.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        zgd zgdVar = this.trace;
        ListBuilder a = rcc.a();
        u1l u1lVar = new u1l(2, zgdVar.a);
        int size = u1lVar.size();
        String str = null;
        String str2 = null;
        for (int i = 0; i < size; i++) {
            bhd bhdVar = (bhd) u1lVar.get(i);
            zf0 zf0Var = bhdVar.b;
            Integer num = bhdVar.c;
            if (zf0Var != null) {
                boolean z = zf0Var.a;
                String str3 = (String) zf0Var.c;
                if (str3 == null) {
                    String str4 = z ? "<lambda>" : null;
                    if (str4 != null) {
                        str = str4;
                    } else if (str == null) {
                        str = "<unknown function>";
                    }
                } else {
                    str = str3;
                }
                String str5 = (String) zf0Var.d;
                if (str5 != null) {
                    str2 = str5;
                } else if (str2 == null) {
                    str2 = "<unknown file>";
                }
                List list = (List) zf0Var.g;
                String str6 = str + '(' + str2 + ':' + ((num == null || num.intValue() >= list.size()) ? "<unknown line>" : String.valueOf(((edz) list.get(num.intValue())).a)) + ')';
                if (!z) {
                }
                if (!jl40.l(str3, "rememberCompositionContext") || !jl40.l((String) zf0Var.f, "9igjgp")) {
                    a.add(str6);
                }
            }
        }
        u1l u1lVar2 = new u1l(2, a.j());
        int size2 = u1lVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str7 = (String) u1lVar2.get(i2);
            sb.append("\tat ");
            sb.append(str7);
            sb.append('\n');
        }
        return sb.toString();
    }
}
