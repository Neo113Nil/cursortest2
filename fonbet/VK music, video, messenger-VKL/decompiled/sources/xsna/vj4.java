package xsna;

import com.vk.dto.common.Image;

/* compiled from: ComposeAudioBookSliderVh.kt */
/* loaded from: classes16.dex */
public final class vj4 {
    public final String a;
    public final String b;
    public final Image c;
    public final boolean d;
    public final boolean e;

    public vj4(String str, String str2, Image image, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = image;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj4)) {
            return false;
        }
        vj4 vj4Var = (vj4) obj;
        return epx.f(this.a, vj4Var.a) && epx.f(this.b, vj4Var.b) && epx.f(this.c, vj4Var.c) && this.d == vj4Var.d && this.e == vj4Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.c;
        return Boolean.hashCode(this.e) + qoy.b((hashCode2 + (image != null ? image.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookSliderTileModel(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", cover=");
        sb.append(this.c);
        sb.append(", isFree=");
        sb.append(this.d);
        sb.append(", isSearch=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
