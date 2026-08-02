package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: LottieClipSpec.kt */
/* loaded from: classes12.dex */
public abstract class h700 {

    /* compiled from: LottieClipSpec.kt */
    public static final class a extends h700 {
        public final Integer a;
        public final Integer b;
        public final boolean c;
        public final Integer d;

        public a() {
            this(7, null, null);
        }

        @Override // xsna.h700
        public final float a(i700 i700Var) {
            if (this.d == null) {
                return 1.0f;
            }
            return swe0.f(r1.intValue() / i700Var.m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        }

        @Override // xsna.h700
        public final float b(i700 i700Var) {
            return this.a == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : swe0.f(r1.intValue() / i700Var.m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return n23.b(wr.a(this.a, "Frame(min=", this.b, ", max=", ", maxInclusive="), this.c, ")");
        }

        public a(int i, Integer num, Integer num2) {
            num = (i & 1) != 0 ? null : num;
            num2 = (i & 2) != 0 ? null : num2;
            this.a = num;
            this.b = num2;
            this.c = true;
            this.d = num2 != null ? num2 : null;
        }
    }

    public abstract float a(i700 i700Var);

    public abstract float b(i700 i700Var);
}
