package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: PollVoteController.kt */
/* loaded from: classes18.dex */
public interface gtb0 {

    /* compiled from: PollVoteController.kt */
    public static final class a {
        public final UserId a;
        public final int b;
        public final boolean c;
        public final String d;
        public final String e;
        public final asb0 f;

        public a(UserId userId, int i, boolean z, String str, String str2, asb0 asb0Var) {
            this.a = userId;
            this.b = i;
            this.c = z;
            this.d = str;
            this.e = str2;
            this.f = asb0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int a = urd0.a(qoy.b(shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31, this.c), 31, this.d);
            String str = this.e;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            asb0 asb0Var = this.f;
            return hashCode + (asb0Var != null ? asb0Var.hashCode() : 0);
        }

        public final String toString() {
            return "PollVote(ownerId=" + this.a + ", pollId=" + this.b + ", isBoard=" + this.c + ", ref=" + this.d + ", trackCode=" + this.e + ", pollUpdater=" + this.f + ')';
        }
    }

    void a(a aVar, List<Long> list, String str);

    void b(a aVar);
}
