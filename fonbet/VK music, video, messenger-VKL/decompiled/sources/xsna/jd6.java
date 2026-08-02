package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.friends.api.presentation.FriendsListType;

/* compiled from: BaseFriendsListPresenterParams.kt */
/* loaded from: classes15.dex */
public final class jd6 {
    public final FriendsListType a;
    public final UserId b;
    public final String c;
    public final boolean d;

    public jd6(FriendsListType friendsListType, UserId userId, String str, boolean z) {
        this.a = friendsListType;
        this.b = userId;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd6)) {
            return false;
        }
        jd6 jd6Var = (jd6) obj;
        return this.a == jd6Var.a && epx.f(this.b, jd6Var.b) && epx.f(this.c, jd6Var.c) && this.d == jd6Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        UserId userId = this.b;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseFriendsListPresenterParams(listType=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", referrer=");
        sb.append(this.c);
        sb.append(", globalSearchEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
