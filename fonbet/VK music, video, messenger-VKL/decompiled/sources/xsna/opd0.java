package xsna;

import com.vk.dto.common.Image;
import java.util.List;

/* compiled from: ProductLabel.kt */
/* loaded from: classes18.dex */
public final class opd0 extends ppd0 {
    public final String a;
    public final String b;
    public final String c;
    public final Image d;
    public final List<ihj> e;

    public opd0(String str, String str2, String str3, Image image, List<ihj> list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = image;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opd0)) {
            return false;
        }
        opd0 opd0Var = (opd0) obj;
        return epx.f(this.a, opd0Var.a) && epx.f(this.b, opd0Var.b) && epx.f(this.c, opd0Var.c) && epx.f(this.d, opd0Var.d) && epx.f(this.e, opd0Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Image image = this.d;
        return this.e.hashCode() + ((a + (image == null ? 0 : image.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerIntegrationFullSize(title=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", buttonText=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", content=");
        return ms9.a(')', sb, this.e);
    }
}
