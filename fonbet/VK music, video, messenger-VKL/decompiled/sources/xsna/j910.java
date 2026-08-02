package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;

/* compiled from: MarketOpenChatParams.kt */
/* loaded from: classes18.dex */
public final class j910 {
    public final UserId a;
    public final UserId b;
    public final String c;
    public final long d;
    public final String e;
    public final Image f;
    public final String g;

    public j910(UserId userId, UserId userId2, String str, long j, String str2, Image image, String str3) {
        this.a = userId;
        this.b = userId2;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = image;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j910)) {
            return false;
        }
        j910 j910Var = (j910) obj;
        return epx.f(this.a, j910Var.a) && epx.f(this.b, j910Var.b) && epx.f(this.c, j910Var.c) && this.d == j910Var.d && epx.f(this.e, j910Var.e) && epx.f(this.f, j910Var.f) && epx.f(this.g, j910Var.g);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(urd0.a(bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b.b), 31, this.c), 31, this.d), 31, this.e);
        Image image = this.f;
        return this.g.hashCode() + ((a + (image == null ? 0 : image.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketOpenChatParams(ownerId=");
        sb.append(this.a);
        sb.append(", dialogId=");
        sb.append(this.b);
        sb.append(", message=");
        sb.append(this.c);
        sb.append(", marketItemId=");
        sb.append(this.d);
        sb.append(", marketItemTitle=");
        sb.append(this.e);
        sb.append(", marketItemImage=");
        sb.append(this.f);
        sb.append(", marketItemPriceText=");
        return ho8.a(sb, this.g, ')');
    }
}
