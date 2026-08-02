package xsna;

import android.content.Context;

/* compiled from: MusicKidsModeOnboardingModal.kt */
/* loaded from: classes3.dex */
public final class km40 extends vpi {
    public final a.C3187a g1;

    /* compiled from: MusicKidsModeOnboardingModal.kt */
    public static final class a extends wpi {
        public final pk g;
        public final yl40 h;

        /* compiled from: MusicKidsModeOnboardingModal.kt */
        /* renamed from: xsna.km40$a$a, reason: collision with other inner class name */
        public static final class C3187a {
            public final gzs<s3q0> a;
            public final gzs<s3q0> b;

            public C3187a(pk pkVar, yl40 yl40Var) {
                this.a = pkVar;
                this.b = yl40Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3187a)) {
                    return false;
                }
                C3187a c3187a = (C3187a) obj;
                return epx.f(this.a, c3187a.a) && epx.f(this.b, c3187a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Params(onSetPinCodeButtonClicked=");
                sb.append(this.a);
                sb.append(", onDetailsButtonClicked=");
                return uf3.d(sb, this.b, ')');
            }
        }

        public a(Context context, pk pkVar, yl40 yl40Var) {
            super(context, tzp0.a(null, 3));
            this.g = pkVar;
            this.h = yl40Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new km40(new C3187a(this.g, this.h));
        }
    }

    public km40(a.C3187a c3187a) {
        this.g1 = c3187a;
    }

    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(440602915);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(440602915, i2, -1, "com.vk.musc.kidsmode.impl.MusicKidsModeOnboardingModal.Content (MusicKidsModeOnboardingModal.kt:44)");
            }
            rrv0.d(null, null, null, null, kai.c(714004872, new yb1(6, this, nr2.G(6, 2, M, null)), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u05(this, i, 7);
        }
    }
}
