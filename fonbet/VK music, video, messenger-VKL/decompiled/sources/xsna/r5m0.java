package xsna;

/* compiled from: StoryLinkStickerInfo.kt */
/* loaded from: classes5.dex */
public final class r5m0 {
    public final String a;
    public final String b;
    public final com.vk.stickers.api.styles.a c;
    public final int d;

    public r5m0(String str, String str2, com.vk.stickers.api.styles.a aVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5m0)) {
            return false;
        }
        r5m0 r5m0Var = (r5m0) obj;
        return epx.f(this.a, r5m0Var.a) && epx.f(this.b, r5m0Var.b) && epx.f(this.c, r5m0Var.c) && this.d == r5m0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryLinkStickerInfo(link=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", styleInfo=");
        sb.append(this.c);
        sb.append(", linkIconResId=");
        return vu5.b(sb, this.d, ')');
    }
}
