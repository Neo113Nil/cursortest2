package xsna;

import xsna.tlo0;

/* compiled from: DisclaimerBannerState.kt */
/* loaded from: classes17.dex */
public interface r0n {

    /* compiled from: DisclaimerBannerState.kt */
    public static final class a implements r0n {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1124182254;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: DisclaimerBannerState.kt */
    public static final class b implements r0n {
        public final int a;
        public final tlo0.f b;
        public final float c;
        public final int d;

        public b(int i, tlo0.f fVar, float f, int i2) {
            this.a = i;
            this.b = fVar;
            this.c = f;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b) && Float.compare(this.c, bVar.c) == 0 && this.d == bVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b.a, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(bannerResId=");
            sb.append(this.a);
            sb.append(", contentDescription=");
            sb.append(this.b);
            sb.append(", heightRatio=");
            sb.append(this.c);
            sb.append(", minHeight=");
            return vu5.b(sb, this.d, ')');
        }
    }
}
