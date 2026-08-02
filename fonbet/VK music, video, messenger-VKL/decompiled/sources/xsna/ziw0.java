package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.SocialButtonType;
import com.vk.im.ui.views.avatars.a;
import com.vk.im.ui.views.online.OnlineMode;
import java.util.List;

/* compiled from: VoipCallServiceUser.kt */
/* loaded from: classes7.dex */
public final class ziw0 {
    public final UserId a;
    public final kr5 b;
    public final a.b.C1179b c;
    public final String d;
    public final OnlineMode e;
    public final String f;
    public final List<String> g;
    public final String h;
    public final SocialButtonType i;
    public final String j;

    public ziw0(UserId userId, kr5 kr5Var, a.b.C1179b c1179b, String str, OnlineMode onlineMode, String str2, List list, String str3, SocialButtonType socialButtonType, String str4) {
        this.a = userId;
        this.b = kr5Var;
        this.c = c1179b;
        this.d = str;
        this.e = onlineMode;
        this.f = str2;
        this.g = list;
        this.h = str3;
        this.i = socialButtonType;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziw0)) {
            return false;
        }
        ziw0 ziw0Var = (ziw0) obj;
        return epx.f(this.a, ziw0Var.a) && this.b.equals(ziw0Var.b) && this.c.equals(ziw0Var.c) && this.d.equals(ziw0Var.d) && this.e == ziw0Var.e && epx.f(this.f, ziw0Var.f) && epx.f(this.g, ziw0Var.g) && epx.f(this.h, ziw0Var.h) && this.i == ziw0Var.i && epx.f(this.j, ziw0Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + urd0.a(urd0.a((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31, 31, this.c.a), 31, this.d)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SocialButtonType socialButtonType = this.i;
        int hashCode5 = (hashCode4 + (socialButtonType == null ? 0 : socialButtonType.hashCode())) * 31;
        String str3 = this.j;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipCallServiceUser(id=");
        sb.append(this.a);
        sb.append(", avatar=");
        sb.append(this.b);
        sb.append(", placeholder=");
        sb.append(this.c);
        sb.append(", fullName=");
        sb.append(this.d);
        sb.append(", onlineMode=");
        sb.append(this.e);
        sb.append(", userDescription=");
        sb.append(this.f);
        sb.append(", mutualFriendsAvatars=");
        sb.append(this.g);
        sb.append(", mutualFriendsDescription=");
        sb.append(this.h);
        sb.append(", socialButtonType=");
        sb.append(this.i);
        sb.append(", trackCode=");
        return ho8.a(sb, this.j, ')');
    }
}
