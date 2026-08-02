package xsna;

/* compiled from: StoryGeoStickerInfo.kt */
/* loaded from: classes5.dex */
public final class d4m0 {
    public final String a;
    public final String b;
    public final com.vk.stickers.api.styles.a c;
    public final int d;
    public final Integer e;

    public d4m0(String str, String str2, com.vk.stickers.api.styles.a aVar, int i, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = i;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4m0)) {
            return false;
        }
        d4m0 d4m0Var = (d4m0) obj;
        return epx.f(this.a, d4m0Var.a) && epx.f(this.b, d4m0Var.b) && epx.f(this.c, d4m0Var.c) && this.d == d4m0Var.d && epx.f(this.e, d4m0Var.e);
    }

    public final int hashCode() {
        int a = shy.a(this.d, (this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        Integer num = this.e;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryGeoStickerInfo(text=");
        sb.append(this.a);
        sb.append(", address=");
        sb.append(this.b);
        sb.append(", styleInfo=");
        sb.append(this.c);
        sb.append(", placeId=");
        sb.append(this.d);
        sb.append(", categoryId=");
        return uqi.b(sb, this.e, ')');
    }
}
