package xsna;

import com.vk.dto.common.Image;

/* compiled from: ProductPropertyItem.kt */
/* loaded from: classes18.dex */
public final class krd0 {
    public final int a;
    public final Long b;
    public final String c;
    public final String d;
    public final Image e;
    public final boolean f;

    public krd0(int i, Long l, String str, String str2, Image image, boolean z) {
        this.a = i;
        this.b = l;
        this.c = str;
        this.d = str2;
        this.e = image;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krd0)) {
            return false;
        }
        krd0 krd0Var = (krd0) obj;
        return this.a == krd0Var.a && epx.f(this.b, krd0Var.b) && epx.f(this.c, krd0Var.c) && epx.f(this.d, krd0Var.d) && epx.f(this.e, krd0Var.e) && this.f == krd0Var.f;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Long l = this.b;
        int a = urd0.a((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        String str = this.d;
        int hashCode2 = (a + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (image != null ? image.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductPropertyVariant(id=");
        sb.append(this.a);
        sb.append(", itemId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", value=");
        sb.append(this.d);
        sb.append(", image=");
        sb.append(this.e);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
