package xsna;

import java.util.LinkedHashMap;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public abstract class d5q {
    public static final e5q a = new e5q(new gmp0((ciq) null, (b0k0) null, (vsa) null, (h4h0) null, (LinkedHashMap) null, 127));
    public static final e5q b = new e5q(new gmp0((ciq) null, (b0k0) null, (vsa) null, (h4h0) null, (LinkedHashMap) null, 95));

    public abstract gmp0 a();

    public final e5q b(d5q d5qVar) {
        ciq ciqVar = d5qVar.a().a;
        if (ciqVar == null) {
            ciqVar = a().a;
        }
        b0k0 b0k0Var = d5qVar.a().b;
        if (b0k0Var == null) {
            b0k0Var = a().b;
        }
        vsa vsaVar = d5qVar.a().c;
        if (vsaVar == null) {
            vsaVar = a().c;
        }
        h4h0 h4h0Var = d5qVar.a().d;
        if (h4h0Var == null) {
            h4h0Var = a().d;
        }
        d5qVar.a().getClass();
        a().getClass();
        return new e5q(new gmp0(ciqVar, b0k0Var, vsaVar, h4h0Var, d5qVar.a().e || a().e, pn00.n(a().f, d5qVar.a().f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d5q) && epx.f(((d5q) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "ExitTransition.None";
        }
        if (equals(b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        gmp0 a2 = a();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(a2.e);
        return sb.toString();
    }
}
