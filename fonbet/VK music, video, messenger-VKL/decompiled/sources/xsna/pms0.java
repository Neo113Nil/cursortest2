package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.media.filters.model.FilterItem;

/* compiled from: VideoFramesProcessor.kt */
/* loaded from: classes3.dex */
public interface pms0 {

    /* compiled from: VideoFramesProcessor.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final boolean c;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
            this.c = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CornerRadiusParams(cornerRadiusW=");
            sb.append(this.a);
            sb.append(", cornerRadiusH=");
            return xq.c(')', this.b, sb);
        }
    }

    void a();

    boolean b();

    void c(FilterItem filterItem, float[] fArr, a aVar);

    boolean d(float[] fArr, long j, int i, int i2, int i3, boolean z);
}
