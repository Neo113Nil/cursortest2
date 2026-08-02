package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MsgClipProducts.kt */
/* loaded from: classes18.dex */
public final class th30 {
    public final long a;
    public final UserId b;
    public final String c;
    public final boolean d;
    public final String e;

    public th30(long j, UserId userId, String str, boolean z) {
        this.a = j;
        this.b = userId;
        this.c = str;
        this.d = z;
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(j);
        this.e = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th30)) {
            return false;
        }
        th30 th30Var = (th30) obj;
        return this.a == th30Var.a && epx.f(this.b, th30Var.b) && epx.f(this.c, th30Var.c) && this.d == th30Var.d;
    }

    public final int hashCode() {
        int a = bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgClipProduct(productId=");
        sb.append(this.a);
        sb.append(", productOwnerId=");
        sb.append(this.b);
        sb.append(", adsLabel=");
        sb.append(this.c);
        sb.append(", isService=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
