package defpackage;

import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class d5j0 {
    public final kwu a;
    public final String b;
    public final meu c;
    public final m5j0 d;
    public final dai0 e;
    public za7 f;

    public d5j0(t4j0 t4j0Var) {
        kwu kwuVar = t4j0Var.a;
        if (kwuVar == null) {
            ny61.r("url == null");
            throw null;
        }
        this.a = kwuVar;
        this.b = t4j0Var.b;
        this.c = t4j0Var.c.d();
        this.d = t4j0Var.d;
        this.e = t4j0Var.e;
    }

    public final za7 a() {
        za7 za7Var = this.f;
        if (za7Var != null) {
            return za7Var;
        }
        za7 za7Var2 = za7.n;
        za7 R = d6z.R(this.c);
        this.f = R;
        return R;
    }

    public final t4j0 b() {
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = this.a;
        t4j0Var.b = this.b;
        t4j0Var.d = this.d;
        t4j0Var.e = this.e;
        t4j0Var.c = this.c.d();
        return t4j0Var;
    }

    public final Object c(Class cls) {
        g0c a = qoi0.a(cls);
        return a.a().cast(this.e.o(a));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        meu meuVar = this.c;
        if (meuVar.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : meuVar) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.getFirst();
                String str2 = (String) pair.getSecond();
                if (i > 0) {
                    sb.append(Extension.FIX_SPACE);
                }
                sb.append(str);
                sb.append(':');
                if (yf61.l(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        kxn kxnVar = kxn.d;
        dai0 dai0Var = this.e;
        if (!jl40.l(dai0Var, kxnVar)) {
            sb.append(", tags=");
            sb.append(dai0Var);
        }
        sb.append('}');
        return sb.toString();
    }
}
