package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class f5r0 implements g5r0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final bgc e;
    public final wp01 f;

    public f5r0(String str, String str2, boolean z, boolean z2, wp01 wp01Var) {
        bgc bgcVar = new bgc(12);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = bgcVar;
        this.f = wp01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f5r0) {
            f5r0 f5r0Var = (f5r0) obj;
            return jl40.l(this.a, f5r0Var.a) && this.b.equals(f5r0Var.b) && this.c == f5r0Var.c && this.d == f5r0Var.d && this.e == f5r0Var.e && this.f == f5r0Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("VoiceDownloadButton(id=", this.a, ", title=", this.b, ", isDownloading=");
        nnm.v(", drawDivider=", ", onClick=", v, this.c, this.d);
        v.append(this.e);
        v.append(", onDownloadClick=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
