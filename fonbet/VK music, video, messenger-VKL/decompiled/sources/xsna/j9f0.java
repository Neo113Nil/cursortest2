package xsna;

import com.vk.dto.common.Image;

/* compiled from: RecentGifEntity.kt */
/* loaded from: classes2.dex */
public final class j9f0 {
    public final String a;
    public final Image b;
    public final String c;

    public j9f0(String str, Image image, String str2) {
        this.a = str;
        this.b = image;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9f0)) {
            return false;
        }
        j9f0 j9f0Var = (j9f0) obj;
        return epx.f(this.a, j9f0Var.a) && epx.f(this.b, j9f0Var.b) && epx.f(this.c, j9f0Var.c);
    }

    public final int hashCode() {
        int b = fq.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentGifEntity(id=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", preview=");
        return ho8.a(sb, this.c, ')');
    }
}
