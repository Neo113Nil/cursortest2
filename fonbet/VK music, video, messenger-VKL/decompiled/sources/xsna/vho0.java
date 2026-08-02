package xsna;

/* compiled from: TextForegroundStyle.kt */
/* loaded from: classes11.dex */
public interface vho0 {

    /* compiled from: TextForegroundStyle.kt */
    public static final class a implements vho0 {
        public static final a a = new a();

        @Override // xsna.vho0
        public final float a() {
            return Float.NaN;
        }

        @Override // xsna.vho0
        public final long c() {
            int i = l5g.l;
            return l5g.k;
        }

        @Override // xsna.vho0
        public final yk8 e() {
            return null;
        }
    }

    float a();

    default vho0 b(gzs<? extends vho0> gzsVar) {
        return !equals(a.a) ? this : gzsVar.invoke();
    }

    long c();

    default vho0 d(vho0 vho0Var) {
        boolean z = vho0Var instanceof dl8;
        if (!z || !(this instanceof dl8)) {
            return (!z || (this instanceof dl8)) ? (z || !(this instanceof dl8)) ? vho0Var.b(new uho0(this, 0)) : this : vho0Var;
        }
        dl8 dl8Var = (dl8) vho0Var;
        n4j0 n4j0Var = dl8Var.a;
        float f = dl8Var.b;
        if (Float.isNaN(f)) {
            f = ((dl8) this).b;
        }
        return new dl8(n4j0Var, f);
    }

    yk8 e();
}
