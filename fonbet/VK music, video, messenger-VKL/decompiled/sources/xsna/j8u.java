package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ToolbarClickListenerImpl.kt */
/* loaded from: classes18.dex */
public final class j8u {
    public long a;
    public UserId b;
    public String c;
    public boolean d;
    public boolean e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8u)) {
            return false;
        }
        j8u j8uVar = (j8u) obj;
        return this.a == j8uVar.a && epx.f(this.b, j8uVar.b) && epx.f(this.c, j8uVar.c) && this.d == j8uVar.d && this.e == j8uVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(urd0.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodScreenSettings(itemId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", itemLink=");
        sb.append(this.c);
        sb.append(", isCanEditAndDelete=");
        sb.append(this.d);
        sb.append(", allowWishlists=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
