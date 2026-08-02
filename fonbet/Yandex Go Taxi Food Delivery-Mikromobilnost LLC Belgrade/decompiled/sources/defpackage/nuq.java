package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nuq {
    public final String a;
    public final String b;
    public final String c;
    public final qye0 d;

    public nuq(String str, String str2, String str3, qye0 qye0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qye0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuq)) {
            return false;
        }
        nuq nuqVar = (nuq) obj;
        return jl40.l(this.a, nuqVar.a) && jl40.l(this.b, nuqVar.b) && jl40.l(this.c, nuqVar.c) && this.d.equals(nuqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("FeedbackSent(title=", this.a, ", subtitle=", this.b, ", imageTag=");
        v.append(this.c);
        v.append(", buttons=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
