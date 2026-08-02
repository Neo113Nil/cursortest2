package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: MusicLoudnessNormalizationConfig.kt */
/* loaded from: classes6.dex */
public interface hn40 {

    /* compiled from: MusicLoudnessNormalizationConfig.kt */
    public static final class a implements hn40 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 76724035;
        }

        public final String toString() {
            return "Disabled";
        }
    }

    /* compiled from: MusicLoudnessNormalizationConfig.kt */
    public static final class b implements hn40 {
        public final boolean a;
        public final boolean b;
        public final float c;

        public b(float f, boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
            this.c = f;
        }

        public final boolean b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && Float.compare(this.c, bVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Enabled(isOnByDefault=");
            sb.append(this.a);
            sb.append(", isAvailableForFreeUsers=");
            sb.append(this.b);
            sb.append(", targetLufs=");
            return xq.c(')', this.c, sb);
        }
    }

    default float a(Float f) {
        return (!(this instanceof b) || f == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : Float.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((b) this).c - f.floatValue());
    }
}
