package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f3i implements uni {
    public final String a;
    public final String b;
    public final String c;
    public final String w;
    public final String x;
    public final String y;
    public final Integer z;

    public f3i(String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.w = str4;
        this.x = str5;
        this.y = str6;
        this.z = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3i)) {
            return false;
        }
        f3i f3iVar = (f3i) obj;
        return this.a.equals(f3iVar.a) && this.b.equals(f3iVar.b) && this.c.equals(f3iVar.c) && this.w.equals(f3iVar.w) && this.x.equals(f3iVar.x) && this.y.equals(f3iVar.y) && jl40.l(this.z, f3iVar.z);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.w), 31, this.x), 31, this.y), 31, false);
        Integer num = this.z;
        return e + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryCourierCommentArgs(title=", this.a, ", description=", this.b, ", textInputHint=");
        g8e.D(v, this.c, ", textInputInitialValue=", this.w, ", btnOkTitle=");
        g8e.D(v, this.x, ", dismissButtonTitle=", this.y, ", showAttachmentIcon=false, maxCommentLength=");
        return oo31.j(v, this.z, Extension.C_BRAKE);
    }
}
