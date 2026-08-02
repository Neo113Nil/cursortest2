package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: Order.kt */
/* loaded from: classes18.dex */
public final class ww80 {
    public final long a;
    public final UserId b;
    public final Image c;
    public final String d;
    public final List<String> e;
    public final int f;
    public final String g;
    public final boolean h;

    public ww80(long j, UserId userId, Image image, String str, List<String> list, int i, String str2, boolean z) {
        this.a = j;
        this.b = userId;
        this.c = image;
        this.d = str;
        this.e = list;
        this.f = i;
        this.g = str2;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww80)) {
            return false;
        }
        ww80 ww80Var = (ww80) obj;
        return this.a == ww80Var.a && epx.f(this.b, ww80Var.b) && epx.f(this.c, ww80Var.c) && epx.f(this.d, ww80Var.d) && epx.f(this.e, ww80Var.e) && this.f == ww80Var.f && epx.f(this.g, ww80Var.g) && this.h == ww80Var.h;
    }

    public final int hashCode() {
        int a = bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
        Image image = this.c;
        return Boolean.hashCode(this.h) + urd0.a(shy.a(this.f, fw3.a(urd0.a((a + (image == null ? 0 : image.hashCode())) * 31, 31, this.d), 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderProduct(productId=");
        sb.append(this.a);
        sb.append(", groupId=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", properties=");
        sb.append(this.e);
        sb.append(", amount=");
        sb.append(this.f);
        sb.append(", pricePerItem=");
        sb.append(this.g);
        sb.append(", canReview=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
