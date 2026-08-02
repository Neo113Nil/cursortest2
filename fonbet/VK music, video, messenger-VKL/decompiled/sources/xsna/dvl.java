package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.common.domain.model.LikableItemType;

/* compiled from: PostAction.kt */
/* loaded from: classes4.dex */
public final class dvl {
    public final LikableItemType a;
    public final long b;
    public final UserId c;
    public final String d;
    public final String e;
    public final String f;

    public dvl(LikableItemType likableItemType, long j, UserId userId, String str, String str2, String str3) {
        this.a = likableItemType;
        this.b = j;
        this.c = userId;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final String a() {
        return this.d;
    }

    public final long b() {
        return this.b;
    }

    public final LikableItemType c() {
        return this.a;
    }

    public final UserId d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dvl) {
            dvl dvlVar = (dvl) obj;
            if (this.a == dvlVar.a && this.b == dvlVar.b && epx.f(this.c, dvlVar.c) && epx.f(this.d, dvlVar.d) && epx.f(this.e, dvlVar.e) && epx.f(this.f, dvlVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        int a = bh10.a(this.a.hashCode() * 31, 31, this.b);
        UserId userId = this.c;
        int hashCode = (a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteLikeAction(itemType=");
        sb.append(this.a);
        sb.append(", itemId=");
        sb.append((Object) ("LikableItemId(value=" + this.b + ')'));
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", accessKey=");
        sb.append(this.d);
        sb.append(", ref=");
        sb.append(this.e);
        sb.append(", trackCode=");
        return ho8.a(sb, this.f, ')');
    }
}
