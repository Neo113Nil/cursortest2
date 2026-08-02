package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: AuthGetExchangeItemsCommand.kt */
/* loaded from: classes6.dex */
public final class k35 extends y1q {
    public static final List<String> b = e43.l("first_name", "photo_100", "photo_base", "profile_type");

    /* compiled from: AuthGetExchangeItemsCommand.kt */
    public static final class a {
    }

    /* compiled from: AuthGetExchangeItemsCommand.kt */
    public static final class b {
        public final UserId a;
        public final AccountProfileType b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public b(UserId userId, AccountProfileType accountProfileType, String str, String str2, String str3, String str4) {
            this.a = userId;
            this.b = accountProfileType;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31;
            String str = this.c;
            return this.f.hashCode() + urd0.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkAuthExchangeLoginInfo(userId=");
            sb.append(this.a);
            sb.append(", profileType=");
            sb.append(this.b);
            sb.append(", avatarUrl=");
            sb.append(this.c);
            sb.append(", firstName=");
            sb.append(this.d);
            sb.append(", fullName=");
            sb.append(this.e);
            sb.append(", exchangeToken=");
            return ho8.a(sb, this.f, ')');
        }
    }
}
