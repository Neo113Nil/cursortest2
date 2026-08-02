package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MiniAppLaunchDto.kt */
/* loaded from: classes7.dex */
public final class aq20 {
    public final Long a;
    public final Long b;
    public final UserId c;
    public Boolean d;
    public final Integer e;
    public final Integer f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;

    public aq20() {
        this(null, null, null, null, null, null, null, false, null, false, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq20)) {
            return false;
        }
        aq20 aq20Var = (aq20) obj;
        return epx.f(this.a, aq20Var.a) && epx.f(this.b, aq20Var.b) && epx.f(this.c, aq20Var.c) && epx.f(this.d, aq20Var.d) && epx.f(this.e, aq20Var.e) && epx.f(this.f, aq20Var.f) && epx.f(this.g, aq20Var.g) && this.h == aq20Var.h && this.i == aq20Var.i && epx.f(this.j, aq20Var.j) && this.k == aq20Var.k;
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        UserId userId = this.c;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.e;
        int b = qoy.b((hashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31, false);
        Integer num2 = this.f;
        int hashCode5 = (b + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.g;
        int b2 = qoy.b(qoy.b((hashCode5 + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i);
        String str2 = this.j;
        return Boolean.hashCode(this.k) + ((b2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiniAppParams(dialogId=");
        sb.append(this.a);
        sb.append(", groupId=");
        sb.append(this.b);
        sb.append(", communityId=");
        sb.append(this.c);
        sb.append(", withoutBottomNavigation=");
        sb.append(this.d);
        sb.append(", requestCode=");
        sb.append(this.e);
        sb.append(", isNested=false, screenOrientation=");
        sb.append(this.f);
        sb.append(", hash=");
        sb.append(this.g);
        sb.append(", openInNewActivity=");
        sb.append(this.h);
        sb.append(", isBottomSheet=");
        sb.append(this.i);
        sb.append(", appOwnerId=");
        sb.append(this.j);
        sb.append(", clearTop=");
        return defpackage.q0.a(sb, this.k, ')');
    }

    public aq20(Long l, Long l2, UserId userId, Boolean bool, Integer num, Integer num2, String str, boolean z, String str2, boolean z2, int i) {
        l = (i & 1) != 0 ? null : l;
        l2 = (i & 2) != 0 ? null : l2;
        userId = (i & 4) != 0 ? null : userId;
        bool = (i & 8) != 0 ? null : bool;
        num = (i & 16) != 0 ? null : num;
        num2 = (i & 64) != 0 ? null : num2;
        str = (i & 128) != 0 ? null : str;
        boolean z3 = (i & 256) == 0;
        z = (i & 512) != 0 ? false : z;
        str2 = (i & 1024) != 0 ? null : str2;
        z2 = (i & 2048) != 0 ? false : z2;
        this.a = l;
        this.b = l2;
        this.c = userId;
        this.d = bool;
        this.e = num;
        this.f = num2;
        this.g = str;
        this.h = z3;
        this.i = z;
        this.j = str2;
        this.k = z2;
    }
}
