package xsna;

import com.vk.dto.polls.Poll;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;

/* compiled from: PollV3Patch.kt */
/* loaded from: classes4.dex */
public interface osb0 extends xl50 {

    /* compiled from: PollV3Patch.kt */
    public static final class a implements osb0 {
        public final Integer b;
        public final Poll c;

        public a() {
            this((Poll) null, 3);
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
            Integer num = this.b;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Poll poll = this.c;
            return hashCode + (poll != null ? poll.hashCode() : 0);
        }

        public final String toString() {
            return "Error(toastMessage=" + this.b + ", poll=" + this.c + ')';
        }

        public /* synthetic */ a(Poll poll, int i) {
            this((i & 1) != 0 ? null : Integer.valueOf(R.string.poll_user_didnt_vote), (i & 2) != 0 ? null : poll);
        }

        public a(Integer num, Poll poll) {
            this.b = num;
            this.c = poll;
        }
    }

    /* compiled from: PollV3Patch.kt */
    public static final class b implements osb0 {
        public final PollAttachment b;
        public final String c;
        public final String d;
        public final String e;

        public b(PollAttachment pollAttachment, String str, String str2, String str3) {
            this.b = pollAttachment;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int hashCode = this.b.f.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(attachment=");
            sb.append(this.b);
            sb.append(", ref=");
            sb.append(this.c);
            sb.append(", trackCode=");
            sb.append(this.d);
            sb.append(", voteContext=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: PollV3Patch.kt */
    public static final class c implements osb0 {
        public final long b;

        public c(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OptionSelected(answerId="));
        }
    }

    /* compiled from: PollV3Patch.kt */
    public static final class d implements osb0 {
    }

    /* compiled from: PollV3Patch.kt */
    public static final class e implements osb0 {
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

    /* compiled from: PollV3Patch.kt */
    public static final class f implements osb0 {
        public final Poll b;

        public f(Poll poll) {
            this.b = poll;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "VoteDeleted(poll=" + this.b + ')';
        }
    }

    /* compiled from: PollV3Patch.kt */
    public static final class g implements osb0 {
        public final Poll b;

        public g(Poll poll) {
            this.b = poll;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "VoteSuccess(poll=" + this.b + ')';
        }
    }
}
