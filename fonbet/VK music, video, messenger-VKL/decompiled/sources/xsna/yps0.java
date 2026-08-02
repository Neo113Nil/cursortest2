package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;

/* compiled from: TopCommentBlockLoader.kt */
/* loaded from: classes7.dex */
public final class yps0 {
    public final int a;
    public final UserId b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final Owner g;
    public final String h;

    public yps0(int i, UserId userId, String str, boolean z, boolean z2, int i2, Owner owner, String str2) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = owner;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yps0)) {
            return false;
        }
        yps0 yps0Var = (yps0) obj;
        return this.a == yps0Var.a && epx.f(this.b, yps0Var.b) && epx.f(this.c, yps0Var.c) && this.d == yps0Var.d && this.e == yps0Var.e && this.f == yps0Var.f && epx.f(this.g, yps0Var.g) && epx.f(this.h, yps0Var.h);
    }

    public final int hashCode() {
        int a = shy.a(this.f, qoy.b(qoy.b(urd0.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31, this.c), 31, this.d), 31, this.e), 31);
        Owner owner = this.g;
        int hashCode = (a + (owner == null ? 0 : owner.hashCode())) * 31;
        String str = this.h;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoInfo(vid=");
        sb.append(this.a);
        sb.append(", oid=");
        sb.append(this.b);
        sb.append(", accessKey=");
        sb.append(this.c);
        sb.append(", canPlay=");
        sb.append(this.d);
        sb.append(", canComment=");
        sb.append(this.e);
        sb.append(", amountOfComments=");
        sb.append(this.f);
        sb.append(", videoOwner=");
        sb.append(this.g);
        sb.append(", ownerPhoto=");
        return ho8.a(sb, this.h, ')');
    }
}
