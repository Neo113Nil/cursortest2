package defpackage;

import com.yandex.div.json.expressions.Expression;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class a1s0 {
    public static final kvo g = ngd0.m(Boolean.TRUE);
    public static final kvo h = ngd0.m(Double.valueOf(0.0d));
    public static final kvo i = ngd0.m(Double.valueOf(1.5d));
    public static final t6e j = new t6e(EmptyList.a);
    public static final kvo k = ngd0.m(0L);
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final pvo d;
    public final Expression e;
    public final jkk f;

    public a1s0(Expression expression, Expression expression2, Expression expression3, pvo pvoVar, Expression expression4, jkk jkkVar) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = pvoVar;
        this.e = expression4;
        this.f = jkkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1s0)) {
            return false;
        }
        a1s0 a1s0Var = (a1s0) obj;
        return jl40.l(this.a, a1s0Var.a) && jl40.l(this.b, a1s0Var.b) && jl40.l(this.c, a1s0Var.c) && jl40.l(this.d, a1s0Var.d) && jl40.l(this.e, a1s0Var.e) && jl40.l(this.f, a1s0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        jkk jkkVar = this.f;
        return hashCode + (jkkVar == null ? 0 : jkkVar.hashCode());
    }

    public final String toString() {
        return "ShortcutShimmerData(enabled=" + this.a + ", angle=" + this.b + ", duration=" + this.c + ", colors=" + this.d + ", width=" + this.e + ", cornersRadius=" + this.f + Extension.C_BRAKE;
    }

    public a1s0() {
        this(0);
    }

    public /* synthetic */ a1s0(int i2) {
        this(g, h, i, j, k, null);
    }
}
