package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class do60 implements pre {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final sbv e;
    public final boolean f;
    public final String g;
    public final z0w h;

    public do60(String str, String str2, String str3, String str4, sbv sbvVar, boolean z, String str5, z0w z0wVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = sbvVar;
        this.f = z;
        this.g = str5;
        this.h = z0wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do60)) {
            return false;
        }
        do60 do60Var = (do60) obj;
        return jl40.l(this.a, do60Var.a) && jl40.l(this.b, do60Var.b) && jl40.l(this.c, do60Var.c) && jl40.l(this.d, do60Var.d) && jl40.l(this.e, do60Var.e) && this.f == do60Var.f && jl40.l(this.g, do60Var.g) && this.h.equals(do60Var.h);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "numeric-input";
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        sbv sbvVar = this.e;
        int e = unr0.e((b + (sbvVar == null ? 0 : sbvVar.hashCode())) * 31, 31, this.f);
        String str = this.g;
        return this.h.hashCode() + ((e + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("NumericInputRemoteCoreWidget(id=", this.a, ", placeholder=", this.b, ", caption=");
        g8e.D(v, this.c, ", formStateKey=", this.d, ", leadIcon=");
        v.append(this.e);
        v.append(", forceOpenKeyboard=");
        v.append(this.f);
        v.append(", metricaLabel=");
        v.append(this.g);
        v.append(", inputType=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
