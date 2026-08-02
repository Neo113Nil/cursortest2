package xsna;

import com.vk.dto.common.Image;
import java.util.List;

/* compiled from: ProductLabel.kt */
/* loaded from: classes18.dex */
public final class npd0 extends ppd0 {
    public final String a;
    public final String b;
    public final String c;
    public final Image d;
    public final List<ihj> e;

    public npd0(String str, String str2, String str3, Image image, List<ihj> list) {
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
        if (!(obj instanceof npd0)) {
            return false;
        }
        npd0 npd0Var = (npd0) obj;
        return epx.f(this.a, npd0Var.a) && epx.f(this.b, npd0Var.b) && epx.f(this.c, npd0Var.c) && epx.f(this.d, npd0Var.d) && epx.f(this.e, npd0Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Image image = this.d;
        return this.e.hashCode() + ((a + (image == null ? 0 : image.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OzonFullSize(title=");
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
