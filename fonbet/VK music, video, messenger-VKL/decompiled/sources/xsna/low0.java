package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.SocialButtonType;
import com.vk.im.ui.views.avatars.a;
import com.vk.im.ui.views.online.OnlineMode;
import java.util.List;

/* compiled from: VoipGlobalUserItem.kt */
/* loaded from: classes7.dex */
public final class low0 implements hfz {
    public final UserId b;
    public final kr5 c;
    public final a.b.C1179b d;
    public final String e;
    public final OnlineMode f;
    public final String g;
    public final List<String> h;
    public final String i;
    public final boolean j;
    public final SocialButtonType k;
    public final boolean l;
    public final String m;

    public low0(UserId userId, kr5 kr5Var, a.b.C1179b c1179b, String str, OnlineMode onlineMode, String str2, List list, String str3, boolean z, SocialButtonType socialButtonType, boolean z2, String str4) {
        this.b = userId;
        this.c = kr5Var;
        this.d = c1179b;
        this.e = str;
        this.f = onlineMode;
        this.g = str2;
        this.h = list;
        this.i = str3;
        this.j = z;
        this.k = socialButtonType;
        this.l = z2;
        this.m = str4;
    }

    public static low0 a(low0 low0Var, boolean z, boolean z2, int i) {
        UserId userId = low0Var.b;
        kr5 kr5Var = low0Var.c;
        a.b.C1179b c1179b = low0Var.d;
        String str = low0Var.e;
        OnlineMode onlineMode = low0Var.f;
        String str2 = low0Var.g;
        List<String> list = low0Var.h;
        String str3 = low0Var.i;
        if ((i & 256) != 0) {
            z = low0Var.j;
        }
        SocialButtonType socialButtonType = low0Var.k;
        String str4 = low0Var.m;
        low0Var.getClass();
        return new low0(userId, kr5Var, c1179b, str, onlineMode, str2, list, str3, z, socialButtonType, z2, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof low0)) {
            return false;
        }
        low0 low0Var = (low0) obj;
        return epx.f(this.b, low0Var.b) && this.c.equals(low0Var.c) && this.d.equals(low0Var.d) && this.e.equals(low0Var.e) && this.f == low0Var.f && epx.f(this.g, low0Var.g) && epx.f(this.h, low0Var.h) && epx.f(this.i, low0Var.i) && this.j == low0Var.j && this.k == low0Var.k && this.l == low0Var.l && epx.f(this.m, low0Var.m);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + urd0.a(urd0.a((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31, 31, this.d.a), 31, this.e)) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.h;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.i;
        int b = qoy.b((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j);
        SocialButtonType socialButtonType = this.k;
        int b2 = qoy.b((b + (socialButtonType == null ? 0 : socialButtonType.hashCode())) * 31, 31, this.l);
        String str3 = this.m;
        return b2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipGlobalUserItem(id=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", placeholder=");
        sb.append(this.d);
        sb.append(", fullName=");
        sb.append(this.e);
        sb.append(", onlineMode=");
        sb.append(this.f);
        sb.append(", userDescription=");
        sb.append(this.g);
        sb.append(", mutualFriendsAvatars=");
        sb.append(this.h);
        sb.append(", mutualFriendsDescription=");
        sb.append(this.i);
        sb.append(", isFriendAdded=");
        sb.append(this.j);
        sb.append(", socialButtonType=");
        sb.append(this.k);
        sb.append(", isSocialButtonEnabled=");
        sb.append(this.l);
        sb.append(", trackCode=");
        return ho8.a(sb, this.m, ')');
    }
}
