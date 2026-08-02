package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VkAuthSyncManager.kt */
/* loaded from: classes.dex */
public interface xcu0 {

    /* compiled from: VkAuthSyncManager.kt */
    /* loaded from: classes14.dex */
    public static final class a {
        public final h7r0 a;
        public final String b;
        public final int c;
        public final AccountProfileType d;
        public final UserId e;

        public a(h7r0 h7r0Var, String str, int i, AccountProfileType accountProfileType, UserId userId) {
            this.a = h7r0Var;
            this.b = str;
            this.c = i;
            this.d = accountProfileType;
            this.e = userId;
        }

        public final h7r0 a() {
            return this.a;
        }

        public final int b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31)) * 31;
            UserId userId = this.e;
            return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthDataInternal(credentials=");
            sb.append(this.a);
            sb.append(", username=");
            sb.append(this.b);
            sb.append(", ordinal=");
            sb.append(this.c);
            sb.append(", accountProfileType=");
            sb.append(this.d);
            sb.append(", masterAccountId=");
            return gp.b(sb, this.e, ')');
        }
    }

    /* compiled from: VkAuthSyncManager.kt */
    /* loaded from: classes14.dex */
    public static final class b {
        public static final /* synthetic */ b a = new b();
        private static final xcu0 STUB = new a();

        /* compiled from: VkAuthSyncManager.kt */
        public static final class a implements xcu0 {
            @Override // xsna.xcu0
            public final List a(ArrayList arrayList) {
                return gn00.c(arrayList);
            }
        }

        public final xcu0 getSTUB() {
            return STUB;
        }
    }

    List a(ArrayList arrayList);
}
