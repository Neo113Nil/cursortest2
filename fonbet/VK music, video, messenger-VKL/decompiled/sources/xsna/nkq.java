package xsna;

import com.vk.ads.easypromote.impl.domain.model.FaqSource;
import java.util.List;

/* compiled from: FaqState.kt */
/* loaded from: classes14.dex */
public interface nkq extends km50 {

    /* compiled from: FaqState.kt */
    public static final class a implements nkq {
        public final List<jfz> b;
        public final FaqSource c;

        public a(List<jfz> list, FaqSource faqSource) {
            this.b = list;
            this.c = faqSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Main(items=" + this.b + ", faqSource=" + this.c + ')';
        }
    }
}
