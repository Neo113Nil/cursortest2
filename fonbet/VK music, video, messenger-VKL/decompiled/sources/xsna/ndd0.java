package xsna;

import com.vk.dto.donut.DonutLevel;
import java.util.List;

/* compiled from: PrivacyEditDonutLevelsPatch.kt */
/* loaded from: classes18.dex */
public interface ndd0 extends xl50 {

    /* compiled from: PrivacyEditDonutLevelsPatch.kt */
    public static final class a implements ndd0 {
        public final List<DonutLevel> b;
        public final DonutLevel c;

        public a(DonutLevel donutLevel, List list) {
            this.b = list;
            this.c = donutLevel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Init(levels=" + this.b + ", selectedLevel=" + this.c + ')';
        }
    }

    /* compiled from: PrivacyEditDonutLevelsPatch.kt */
    public static final class b implements ndd0 {
        public final DonutLevel b;

        public b(DonutLevel donutLevel) {
            this.b = donutLevel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectLevel(selectedLevel=" + this.b + ')';
        }
    }
}
