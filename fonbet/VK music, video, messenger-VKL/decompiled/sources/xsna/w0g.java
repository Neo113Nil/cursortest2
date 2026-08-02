package xsna;

import android.graphics.Path;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.Map;

/* compiled from: CollageGrid.kt */
/* loaded from: classes4.dex */
public interface w0g {

    /* compiled from: CollageGrid.kt */
    public static final class a {
        public final n2k0 a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;

        public a(n2k0 n2k0Var, float f, float f2, float f3, float f4) {
            this.a = n2k0Var;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && Float.compare(this.e, aVar.e) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.e) + io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Slot(id=");
            sb.append(this.a);
            sb.append(", x=");
            sb.append(this.b);
            sb.append(", y=");
            gq.h(sb, this.c, ", w=", this.d, ", h=");
            return shy.c(this.e, ")", sb);
        }
    }

    Map<n2k0, a> a();

    default Path b(Size size, float f, float f2) {
        Path path = new Path();
        Iterator<Map.Entry<n2k0, a>> it = a().entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            float f3 = value.b;
            float f4 = value.c;
            float f5 = value.d + f3;
            float f6 = value.e + f4;
            float max = Math.max(size.getWidth(), size.getHeight()) * 0.08f;
            float f7 = 100;
            float f8 = (f / f7) * max;
            float f9 = max * (f2 / f7);
            float b = an10.b(size.getWidth() * f3) + (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f8 : f8 / 2);
            float b2 = an10.b(size.getHeight() * f4) + (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f8 : f8 / 2);
            float b3 = an10.b(size.getWidth() * f5) - (f5 == 1.0f ? f8 : f8 / 2);
            float b4 = an10.b(size.getHeight() * f6);
            if (f6 != 1.0f) {
                f8 /= 2;
            }
            path.addRoundRect(b, b2, b3, b4 - f8, f9, f9, Path.Direction.CW);
        }
        path.close();
        return path;
    }
}
