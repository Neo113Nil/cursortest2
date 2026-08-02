package xsna;

import com.vk.dto.common.Attachment;
import java.util.List;

/* compiled from: MarketItemReviewsEvent.kt */
/* loaded from: classes18.dex */
public abstract class t310 {

    /* compiled from: MarketItemReviewsEvent.kt */
    public static final class a extends t310 {
        public final String a;

        public a(String str) {
            this.a = str;
        }
    }

    /* compiled from: MarketItemReviewsEvent.kt */
    public static final class b extends t310 {
        public final List<efk0> a;

        public b(List<efk0> list) {
            this.a = list;
        }
    }

    /* compiled from: MarketItemReviewsEvent.kt */
    public static final class c extends t310 {
        public final Integer a;

        public c(Integer num) {
            this.a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return uqi.b(new StringBuilder("ScrollToComment(id="), this.a, ')');
        }
    }

    /* compiled from: MarketItemReviewsEvent.kt */
    public static final class d extends t310 {
        public final String a = "";
        public final List<Attachment> b;

        public d(List list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetCommentBarData(text=");
            sb.append(this.a);
            sb.append(", attachments=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: MarketItemReviewsEvent.kt */
    public static final class e extends t310 {
        public final tlo0 a;

        public e(tlo0 tlo0Var) {
            this.a = tlo0Var;
        }
    }
}
