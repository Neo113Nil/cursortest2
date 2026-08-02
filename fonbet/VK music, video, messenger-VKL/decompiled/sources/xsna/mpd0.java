package xsna;

import com.vk.dto.common.Image;

/* compiled from: ProductLabel.kt */
/* loaded from: classes18.dex */
public final class mpd0 extends ppd0 {
    public final String a;
    public final String b;
    public final String c;
    public final Image d;

    public mpd0(String str, String str2, String str3, Image image) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpd0)) {
            return false;
        }
        mpd0 mpd0Var = (mpd0) obj;
        return epx.f(this.a, mpd0Var.a) && epx.f(this.b, mpd0Var.b) && epx.f(this.c, mpd0Var.c) && epx.f(this.d, mpd0Var.d);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Image image = this.d;
        return a + (image == null ? 0 : image.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApproveInfo(title=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", buttonText=");
        sb.append(this.c);
        sb.append(", image=");
        return er.d(sb, this.d, ')');
    }
}
