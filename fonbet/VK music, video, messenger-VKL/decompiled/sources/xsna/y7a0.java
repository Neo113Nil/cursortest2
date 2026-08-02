package xsna;

import com.vk.dto.photo.Photo;

/* compiled from: PhotoFlowItem.kt */
/* loaded from: classes4.dex */
public final class y7a0 {
    public final Photo a;
    public final Boolean b;
    public final boolean c;
    public final boolean d;

    public y7a0(Photo photo, Boolean bool, boolean z, boolean z2) {
        this.a = photo;
        this.b = bool;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7a0)) {
            return false;
        }
        y7a0 y7a0Var = (y7a0) obj;
        return epx.f(this.a, y7a0Var.a) && epx.f(this.b, y7a0Var.b) && this.c == y7a0Var.c && this.d == y7a0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return Boolean.hashCode(this.d) + qoy.b((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoFlowItem(photo=");
        sb.append(this.a);
        sb.append(", selected=");
        sb.append(this.b);
        sb.append(", pinned=");
        sb.append(this.c);
        sb.append(", hasRestriction=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
