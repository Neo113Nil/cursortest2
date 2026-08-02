package xsna;

import com.vk.dto.common.Image;

/* compiled from: AvatarInfo.kt */
/* loaded from: classes15.dex */
public final class tr5 {
    public final String a;
    public final Image b;
    public final boolean c;

    public tr5(String str, Image image, boolean z) {
        this.a = str;
        this.b = image;
        this.c = z;
    }

    public final Image a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr5)) {
            return false;
        }
        tr5 tr5Var = (tr5) obj;
        return epx.f(this.a, tr5Var.a) && epx.f(this.b, tr5Var.b) && this.c == tr5Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (image != null ? image.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarInfo(photoUrl=");
        sb.append(this.a);
        sb.append(", photoImage=");
        sb.append(this.b);
        sb.append(", isNft=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
