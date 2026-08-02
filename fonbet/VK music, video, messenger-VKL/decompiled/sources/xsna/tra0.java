package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import xsna.ura0;

/* compiled from: Placeable.kt */
/* loaded from: classes11.dex */
public abstract class tra0 implements jp10 {
    public int b;
    public int c;
    public long d;
    public long e = ura0.b;
    public long f = 0;

    /* compiled from: Placeable.kt */
    public static abstract class a implements azl {
        public boolean b;

        public static void D(a aVar, tra0 tra0Var, long j) {
            ura0.a aVar2 = ura0.a;
            if (aVar.k() == LayoutDirection.Ltr || aVar.p() == 0) {
                c(aVar, tra0Var);
                tra0Var.p0(h9x.d(j, tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2);
            } else {
                int p = (aVar.p() - tra0Var.b) - ((int) (j >> 32));
                c(aVar, tra0Var);
                tra0Var.p0(h9x.d((((int) (j & 4294967295L)) & 4294967295L) | (p << 32), tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2);
            }
        }

        public static void F(a aVar, tra0 tra0Var, long j, mdu mduVar) {
            if (aVar.k() == LayoutDirection.Ltr || aVar.p() == 0) {
                c(aVar, tra0Var);
                tra0Var.q0(h9x.d(j, tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, mduVar);
            } else {
                int p = (aVar.p() - tra0Var.b) - ((int) (j >> 32));
                c(aVar, tra0Var);
                tra0Var.q0(h9x.d((((int) (j & 4294967295L)) & 4294967295L) | (p << 32), tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, mduVar);
            }
        }

        public static /* synthetic */ void K(a aVar, tra0 tra0Var, int i, int i2, izs izsVar, int i3) {
            if ((i3 & 8) != 0) {
                izsVar = ura0.a;
            }
            aVar.H(tra0Var, i, i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, izsVar);
        }

        public static void L(a aVar, tra0 tra0Var, long j) {
            ura0.a aVar2 = ura0.a;
            aVar.getClass();
            c(aVar, tra0Var);
            tra0Var.p0(h9x.d(j, tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void c(a aVar, tra0 tra0Var) {
            aVar.getClass();
            if (tra0Var instanceof jb30) {
                ((jb30) tra0Var).v(aVar.b);
            }
        }

        public static void w(a aVar, tra0 tra0Var, long j) {
            aVar.getClass();
            c(aVar, tra0Var);
            tra0Var.p0(h9x.d(j, tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        }

        public static void x(a aVar, tra0 tra0Var, int i, int i2) {
            long j = (i << 32) | (i2 & 4294967295L);
            if (aVar.k() == LayoutDirection.Ltr || aVar.p() == 0) {
                c(aVar, tra0Var);
                tra0Var.p0(h9x.d(j, tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
            } else {
                int p = (aVar.p() - tra0Var.b) - ((int) (j >> 32));
                c(aVar, tra0Var);
                tra0Var.p0(h9x.d((p << 32) | (((int) (j & 4294967295L)) & 4294967295L), tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
            }
        }

        public static void y(a aVar, tra0 tra0Var, long j) {
            if (aVar.k() == LayoutDirection.Ltr || aVar.p() == 0) {
                c(aVar, tra0Var);
                tra0Var.p0(h9x.d(j, tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
            } else {
                int p = (aVar.p() - tra0Var.b) - ((int) (j >> 32));
                c(aVar, tra0Var);
                tra0Var.p0(h9x.d((((int) (j & 4294967295L)) & 4294967295L) | (p << 32), tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
            }
        }

        public static void z(a aVar, tra0 tra0Var, int i, int i2) {
            ura0.a aVar2 = ura0.a;
            long j = (i << 32) | (i2 & 4294967295L);
            if (aVar.k() == LayoutDirection.Ltr || aVar.p() == 0) {
                c(aVar, tra0Var);
                tra0Var.p0(h9x.d(j, tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2);
            } else {
                int p = (aVar.p() - tra0Var.b) - ((int) (j >> 32));
                c(aVar, tra0Var);
                tra0Var.p0(h9x.d((p << 32) | (((int) (j & 4294967295L)) & 4294967295L), tra0Var.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2);
            }
        }

        public final void H(tra0 tra0Var, int i, int i2, float f, izs<? super tdu, s3q0> izsVar) {
            c(this, tra0Var);
            tra0Var.p0(h9x.d((i2 & 4294967295L) | (i << 32), tra0Var.f), f, izsVar);
        }

        public float e(qrg0 qrg0Var) {
            return Float.NaN;
        }

        @Override // xsna.azl
        public float getDensity() {
            return 1.0f;
        }

        @Override // xsna.azl
        public float getFontScale() {
            return 1.0f;
        }

        public abstract LayoutDirection k();

        public abstract int p();

        public final void q(tra0 tra0Var, int i, int i2, float f) {
            c(this, tra0Var);
            tra0Var.p0(h9x.d((i2 & 4294967295L) | (i << 32), tra0Var.f), f, null);
        }
    }

    public tra0() {
        long j = 0;
        this.d = (j & 4294967295L) | (j << 32);
    }

    public int m0() {
        return (int) (this.d & 4294967295L);
    }

    public int n0() {
        return (int) (this.d >> 32);
    }

    public final void o0() {
        this.b = swe0.g((int) (this.d >> 32), o6j.k(this.e), o6j.i(this.e));
        this.c = swe0.g((int) (this.d & 4294967295L), o6j.j(this.e), o6j.h(this.e));
        int i = this.b;
        long j = this.d;
        this.f = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void p0(long j, float f, izs<? super tdu, s3q0> izsVar);

    public void q0(long j, float f, mdu mduVar) {
        p0(j, f, null);
    }

    public final void s0(long j) {
        if (q9x.b(this.d, j)) {
            return;
        }
        this.d = j;
        o0();
    }

    public final void v0(long j) {
        if (o6j.c(this.e, j)) {
            return;
        }
        this.e = j;
        o0();
    }
}
