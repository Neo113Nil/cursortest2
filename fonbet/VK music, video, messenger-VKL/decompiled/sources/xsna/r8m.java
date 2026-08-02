package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiagnosticsWorker.kt */
/* loaded from: classes12.dex */
public final class r8m {
    public static final /* synthetic */ int a = 0;

    static {
        m100.d("DiagnosticsWrkr");
    }

    public static final void a(kwx0 kwx0Var, cyx0 cyx0Var, hqn0 hqn0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fxx0 fxx0Var = (fxx0) it.next();
            svx0 c = bdl.c(fxx0Var);
            String str = fxx0Var.a;
            gqn0 c2 = hqn0Var.c(c);
            Integer valueOf = c2 != null ? Integer.valueOf(c2.c) : null;
            String g0 = j5g.g0(kwx0Var.a(str), StringUtils.COMMA, null, null, 0, null, 62);
            String g02 = j5g.g0(cyx0Var.c(str), StringUtils.COMMA, null, null, 0, null, 62);
            StringBuilder a2 = t33.a("\n", str, "\t ");
            kr.b(valueOf, fxx0Var.c, "\t ", "\t ", a2);
            a2.append(fxx0Var.b.name());
            a2.append("\t ");
            a2.append(g0);
            a2.append("\t ");
            a2.append(g02);
            a2.append('\t');
        }
    }
}
