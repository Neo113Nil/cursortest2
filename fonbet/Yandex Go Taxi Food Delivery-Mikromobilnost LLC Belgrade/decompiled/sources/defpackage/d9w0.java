package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class d9w0 {
    public final String a;
    public final String b;
    public final String c;
    public final float d;
    public final String e;
    public final String f;
    public final Integer g;
    public final boolean h;

    public d9w0(String str, String str2, String str3, float f, String str4, String str5, Integer num, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = str4;
        this.f = str5;
        this.g = num;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9w0)) {
            return false;
        }
        d9w0 d9w0Var = (d9w0) obj;
        return jl40.l(this.a, d9w0Var.a) && this.b.equals(d9w0Var.b) && this.c.equals(d9w0Var.c) && Float.compare(this.d, d9w0Var.d) == 0 && jl40.l(this.e, d9w0Var.e) && jl40.l(this.f, d9w0Var.f) && jl40.l(this.g, d9w0Var.g) && this.h == d9w0Var.h;
    }

    public final int hashCode() {
        String str = this.a;
        int c = g8e.c(this.d, unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31);
        String str2 = this.e;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.g;
        return Boolean.hashCode(this.h) + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SuperappAzimuthRotatableIcon(buttonId=", this.a, ", backgroundImageTag=", this.b, ", rotatableImageTag=");
        v.append(this.c);
        v.append(", rotationCompensation=");
        v.append(this.d);
        v.append(", animationUrlLight=");
        g8e.D(v, this.e, ", animationUrlDark=", this.f, ", animationRepeatCount=");
        v.append(this.g);
        v.append(", animationRemoveAfterPlaying=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
