package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.filter.ImageQuality;
import java.util.List;
import kotlin.Pair;

/* compiled from: BehaviourImageSizeFilter.kt */
/* loaded from: classes18.dex */
public final class hx6 extends igl {
    public ImageQuality a = ImageQuality.TRAFFIC_FIT;
    public Pair<a, ImageSize> b;

    /* compiled from: BehaviourImageSizeFilter.kt */
    public static final class a {
        public final ImageQuality a;
        public final List<ImageSize> b;
        public final riw c;

        public a(ImageQuality imageQuality, List<ImageSize> list, riw riwVar) {
            this.a = imageQuality;
            this.b = list;
            this.c = riwVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Request(strategy=" + this.a + ", sizes=" + this.b + ", data=" + this.c + ')';
        }
    }
}
