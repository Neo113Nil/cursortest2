package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class bz31 implements g2r {
    public final String a;
    public final String b;
    public final boolean c;
    public final Uri d;

    public bz31(Uri uri, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = uri;
    }

    @Override // defpackage.g2r
    public final Uri a() {
        return this.d;
    }

    @Override // defpackage.g2r
    public final boolean b() {
        return false;
    }

    @Override // defpackage.g2r
    public final Object c(jdj jdjVar) {
        t2r t2rVar = (t2r) jdjVar.c;
        a1r a1rVar = t2rVar.e;
        a1rVar.d.post(new v0r(a1rVar, this.b, 2));
        h2r h2rVar = new h2r(1, t2rVar, this);
        hzq b = t2rVar.d.b((izq) jdjVar.w, 0L);
        q2r q2rVar = (q2r) jdjVar.b;
        q2rVar.x = b.b;
        oif0 oif0Var = new oif0(b.a, h2rVar);
        to3 to3Var = t2rVar.a;
        return to3Var.a.a(new so3(to3Var, this.a, oif0Var, this.c, q2rVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz31)) {
            return false;
        }
        bz31 bz31Var = (bz31) obj;
        return jl40.l(this.a, bz31Var.a) && jl40.l(this.b, bz31Var.b) && this.c == bz31Var.c && this.d.equals(bz31Var.d);
    }

    @Override // defpackage.g2r
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("VoiceMessageUploadRequest(chatId=", this.a, ", messageId=", this.b, ", wasRecognized=");
        v.append(this.c);
        v.append(", fileUri=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
