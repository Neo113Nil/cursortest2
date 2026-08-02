package xsna;

import com.vk.dto.common.restrictions.Restriction;

/* compiled from: AttachmentImageInfo.kt */
/* loaded from: classes15.dex */
public final class w64 {
    public final String a;
    public final float b;
    public final Restriction c;
    public final boolean d;

    public w64(String str, float f, Restriction restriction, boolean z) {
        this.a = str;
        this.b = f;
        this.c = restriction;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w64)) {
            return false;
        }
        w64 w64Var = (w64) obj;
        return epx.f(this.a, w64Var.a) && Float.compare(this.b, w64Var.b) == 0 && epx.f(this.c, w64Var.c) && this.d == w64Var.d;
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31);
        Restriction restriction = this.c;
        return Boolean.hashCode(this.d) + ((a + (restriction == null ? 0 : restriction.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachmentImageInfo(url=");
        sb.append(this.a);
        sb.append(", ratio=");
        sb.append(this.b);
        sb.append(", restriction=");
        sb.append(this.c);
        sb.append(", isPhotoBlurred=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
