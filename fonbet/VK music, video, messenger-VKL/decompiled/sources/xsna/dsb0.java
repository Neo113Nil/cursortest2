package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.attachments.PollAttachment;

/* compiled from: PollV3Action.kt */
/* loaded from: classes4.dex */
public interface dsb0 extends kj50 {

    /* compiled from: PollV3Action.kt */
    public static final class a implements dsb0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1894601584;
        }

        public final String toString() {
            return "DeleteVote";
        }
    }

    /* compiled from: PollV3Action.kt */
    public static final class b implements dsb0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1204292580;
        }

        public final String toString() {
            return "EditPoll";
        }
    }

    /* compiled from: PollV3Action.kt */
    public static final class c implements dsb0 {
        public final PollAttachment b;
        public final Integer c;
        public final UserId d;
        public final String e;
        public final String f;
        public final String g;

        public c(PollAttachment pollAttachment, Integer num, UserId userId, String str, String str2, String str3) {
            this.b = pollAttachment;
            this.c = num;
            this.d = userId;
            this.e = str;
            this.f = str2;
            this.g = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g);
        }

        public final int hashCode() {
            PollAttachment pollAttachment = this.b;
            int hashCode = (pollAttachment == null ? 0 : pollAttachment.f.hashCode()) * 31;
            Integer num = this.c;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            UserId userId = this.d;
            int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str = this.e;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.g;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(attachment=");
            sb.append(this.b);
            sb.append(", pollId=");
            sb.append(this.c);
            sb.append(", ownerId=");
            sb.append(this.d);
            sb.append(", ref=");
            sb.append(this.e);
            sb.append(", trackCode=");
            sb.append(this.f);
            sb.append(", voteContext=");
            return ho8.a(sb, this.g, ')');
        }
    }

    /* compiled from: PollV3Action.kt */
    public static final class d implements dsb0 {
        public final long b;

        public d(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OptionClicked(answerId="));
        }
    }

    /* compiled from: PollV3Action.kt */
    public static final class e implements dsb0 {
        public final PollAttachment b;

        public e(PollAttachment pollAttachment) {
            this.b = pollAttachment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.f.hashCode();
        }

        public final String toString() {
            return "UpdateAttachment(attachment=" + this.b + ')';
        }
    }

    /* compiled from: PollV3Action.kt */
    public static final class f implements dsb0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1322864944;
        }

        public final String toString() {
            return "VoteButtonClicked";
        }
    }
}
