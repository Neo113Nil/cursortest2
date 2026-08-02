package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: WritebarOverlayOptions.kt */
/* loaded from: classes4.dex */
public final class o3y0 {
    public final UserId a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public o3y0(UserId userId, int i, String str, String str2, boolean z, int i2) {
        this.a = userId;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3y0)) {
            return false;
        }
        o3y0 o3y0Var = (o3y0) obj;
        return epx.f(this.a, o3y0Var.a) && this.b == o3y0Var.b && this.c.equals(o3y0Var.c) && epx.f(this.d, o3y0Var.d) && this.e == o3y0Var.e && this.f == o3y0Var.f;
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(0, shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31), 31, this.c);
        String str = this.d;
        return shy.a(this.f, qoy.b((a + (str != null ? str.hashCode() : 0)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WritebarOverlayOptions(ownerId=");
        sb.append(this.a);
        sb.append(", itemId=");
        sb.append(this.b);
        sb.append(", itemType=0, referer=");
        sb.append(this.c);
        sb.append(", trackCode=");
        sb.append(this.d);
        sb.append(", canGroupComment=");
        sb.append(this.e);
        sb.append(", parentScrollPosition=");
        return h5s.c(this.f, ", replyToComment=null)", sb);
    }
}
