package xsna;

import com.vk.dto.common.Image;

/* compiled from: ArtistItem.kt */
/* loaded from: classes3.dex */
public final class yq3 {
    public final String a;
    public final String b;
    public final Image c;
    public final int d;

    public yq3(String str, String str2, Image image, int i) {
        this.a = str;
        this.b = str2;
        this.c = image;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq3)) {
            return false;
        }
        yq3 yq3Var = (yq3) obj;
        return epx.f(this.a, yq3Var.a) && epx.f(this.b, yq3Var.b) && epx.f(this.c, yq3Var.c) && this.d == yq3Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.c;
        return Integer.hashCode(this.d) + ((hashCode2 + (image != null ? image.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ArtistItem(id=" + this.a + ", name=" + this.b + ", photo=" + this.c + ", contextFlags=" + ((Object) ("ContextFlags(mask=" + this.d + ')')) + ')';
    }
}
