package xsna;

import com.vk.dto.common.Attachment;
import java.util.List;

/* compiled from: CommunityReviewsEvent.kt */
/* loaded from: classes18.dex */
public abstract class vyh {

    /* compiled from: CommunityReviewsEvent.kt */
    public static final class a extends vyh {
        public final String a;

        public a(String str) {
            this.a = str;
        }
    }

    /* compiled from: CommunityReviewsEvent.kt */
    public static final class b extends vyh {
        public final List<efk0> a;

        public b(List<efk0> list) {
            this.a = list;
        }
    }

    /* compiled from: CommunityReviewsEvent.kt */
    public static final class c extends vyh {
        public final Integer a;
        public final boolean b;
        public final boolean c;

        public c(Integer num, boolean z, boolean z2) {
            this.a = num;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            Integer num = this.a;
            return Boolean.hashCode(this.c) + qoy.b((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ScrollTo(id=");
            sb.append(this.a);
            sb.append(", isReviewItem=");
            sb.append(this.b);
            sb.append(", withOpenKeyboard=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityReviewsEvent.kt */
    public static final class d extends vyh {
        public final String a;
        public final List<Attachment> b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, List<? extends Attachment> list) {
            this.a = str;
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

    /* compiled from: CommunityReviewsEvent.kt */
    public static final class e extends vyh {
        public static final e a = new e();
    }

    /* compiled from: CommunityReviewsEvent.kt */
    public static final class f extends vyh {
        public final tlo0 a;

        public f(tlo0 tlo0Var) {
            this.a = tlo0Var;
        }
    }
}
