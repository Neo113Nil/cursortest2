package xsna;

import java.util.LinkedHashMap;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public abstract class qpp {
    public static final rpp a = new rpp(new gmp0((ciq) null, (b0k0) null, (vsa) null, (h4h0) null, (LinkedHashMap) null, 127));

    public abstract gmp0 a();

    public final rpp b(qpp qppVar) {
        ciq ciqVar = qppVar.a().a;
        if (ciqVar == null) {
            ciqVar = a().a;
        }
        b0k0 b0k0Var = qppVar.a().b;
        if (b0k0Var == null) {
            b0k0Var = a().b;
        }
        vsa vsaVar = qppVar.a().c;
        if (vsaVar == null) {
            vsaVar = a().c;
        }
        h4h0 h4h0Var = qppVar.a().d;
        if (h4h0Var == null) {
            h4h0Var = a().d;
        }
        qppVar.a().getClass();
        a().getClass();
        return new rpp(new gmp0(ciqVar, b0k0Var, vsaVar, h4h0Var, pn00.n(a().f, qppVar.a().f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qpp) && epx.f(((qpp) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "EnterTransition.None";
        }
        gmp0 a2 = a();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        ciq ciqVar = a2.a;
        sb.append(ciqVar != null ? ciqVar.toString() : null);
        sb.append(",\nSlide - ");
        b0k0 b0k0Var = a2.b;
        sb.append(b0k0Var != null ? b0k0Var.toString() : null);
        sb.append(",\nShrink - ");
        vsa vsaVar = a2.c;
        sb.append(vsaVar != null ? vsaVar.toString() : null);
        sb.append(",\nScale - ");
        h4h0 h4h0Var = a2.d;
        sb.append(h4h0Var != null ? h4h0Var.toString() : null);
        return sb.toString();
    }
}
