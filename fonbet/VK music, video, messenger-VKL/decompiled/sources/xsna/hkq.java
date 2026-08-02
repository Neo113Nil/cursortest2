package xsna;

import com.vk.ads.easypromote.impl.domain.model.FaqSource;
import java.util.List;

/* compiled from: FaqAction.kt */
/* loaded from: classes14.dex */
public interface hkq extends kj50 {

    /* compiled from: FaqAction.kt */
    public static final class a implements hkq {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 889602514;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: FaqAction.kt */
    public static final class b implements hkq {
        public final List<jfz> b;
        public final FaqSource c;

        public b(List<jfz> list, FaqSource faqSource) {
            this.b = list;
            this.c = faqSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Init(items=" + this.b + ", faqSource=" + this.c + ')';
        }
    }
}
