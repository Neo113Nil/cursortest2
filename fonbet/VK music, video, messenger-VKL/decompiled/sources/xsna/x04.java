package xsna;

import com.vk.dto.common.Attachment;

/* compiled from: AttachArrangerModel.kt */
/* loaded from: classes3.dex */
public final class x04 {
    public final Attachment a;
    public final String b;
    public final boolean c;

    public x04(Attachment attachment, String str, boolean z) {
        this.a = attachment;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x04)) {
            return false;
        }
        x04 x04Var = (x04) obj;
        return epx.f(this.a, x04Var.a) && this.b.equals(x04Var.b) && this.c == x04Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachArrangerModel(attachment=");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", isGrid=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
