package xsna;

import com.vk.dto.common.Image;

/* compiled from: OnboardingCardItem.kt */
/* loaded from: classes5.dex */
public final class gd80 {
    public final Image a;
    public final String b;
    public final String c;
    public final String d;

    public gd80(String str, String str2, String str3, Image image) {
        this.a = image;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd80)) {
            return false;
        }
        gd80 gd80Var = (gd80) obj;
        return epx.f(this.a, gd80Var.a) && epx.f(this.b, gd80Var.b) && epx.f(this.c, gd80Var.c) && epx.f(this.d, gd80Var.d);
    }

    public final int hashCode() {
        Image image = this.a;
        int a = urd0.a(urd0.a((image == null ? 0 : image.hashCode()) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingCardItem(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", action=");
        return ho8.a(sb, this.d, ')');
    }
}
