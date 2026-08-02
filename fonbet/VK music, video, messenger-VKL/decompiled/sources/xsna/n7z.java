package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.gift.GiftRarity;

/* compiled from: LimitedGiftModalPage.kt */
/* loaded from: classes6.dex */
public final class n7z {
    public final String a;
    public final GiftRarity.Type b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final String g;
    public final zk2 h;
    public final Image i;

    public n7z(String str, GiftRarity.Type type, Integer num, Integer num2, Integer num3, Integer num4, String str2, zk2 zk2Var, Image image) {
        this.a = str;
        this.b = type;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = num4;
        this.g = str2;
        this.h = zk2Var;
        this.i = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7z)) {
            return false;
        }
        n7z n7zVar = (n7z) obj;
        return epx.f(this.a, n7zVar.a) && this.b == n7zVar.b && epx.f(this.c, n7zVar.c) && epx.f(this.d, n7zVar.d) && epx.f(this.e, n7zVar.e) && epx.f(this.f, n7zVar.f) && epx.f(this.g, n7zVar.g) && epx.f(this.h, n7zVar.h) && epx.f(this.i, n7zVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.g;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        zk2 zk2Var = this.h;
        int hashCode7 = (hashCode6 + (zk2Var == null ? 0 : zk2Var.hashCode())) * 31;
        Image image = this.i;
        return hashCode7 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitedGiftModalPageModel(title=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", totalCount=");
        sb.append(this.c);
        sb.append(", leftCount=");
        sb.append(this.d);
        sb.append(", releaseYear=");
        sb.append(this.e);
        sb.append(", serialNumber=");
        sb.append(this.f);
        sb.append(", giftImageUrl=");
        sb.append(this.g);
        sb.append(", giftAnimations=");
        sb.append(this.h);
        sb.append(", giftBgImage=");
        return er.d(sb, this.i, ')');
    }
}
