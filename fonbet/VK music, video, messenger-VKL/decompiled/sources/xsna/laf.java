package xsna;

import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.clips.VideoTransform;
import kotlin.Pair;

/* compiled from: ClipsTransformUtils.kt */
/* loaded from: classes16.dex */
public final class laf {
    public static final laf a = new laf();

    /* compiled from: ClipsTransformUtils.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SizeParams(originalWidth=");
            sb.append(this.a);
            sb.append(", originalHeight=");
            sb.append(this.b);
            sb.append(", sceneWidth=");
            sb.append(this.c);
            sb.append(", sceneHeight=");
            return xq.c(')', this.d, sb);
        }
    }

    public static Pair a(VideoTransform videoTransform, a aVar) {
        float f = aVar.b;
        float f2 = aVar.d;
        float f3 = aVar.a;
        float f4 = aVar.c;
        Matrix matrix = new Matrix();
        Float f5 = videoTransform.f;
        float floatValue = f5 != null ? (f5.floatValue() * f4) / f3 : 1.0f;
        matrix.postScale(floatValue, floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float c = (f4 / 2.0f) - ((pov.c(matrix) * f3) / 2.0f);
        float d = (f2 / 2.0f) - ((pov.d(matrix) * f) / 2.0f);
        float f6 = (f4 * videoTransform.c) + c;
        float f7 = (f2 * videoTransform.d) + d;
        matrix.postTranslate(f6, f7);
        matrix.postRotate(-videoTransform.b, uq.a(floatValue, f3, 2.0f, f6), uq.a(floatValue, f, 2.0f, f7));
        return new Pair(matrix, Float.valueOf(floatValue));
    }
}
