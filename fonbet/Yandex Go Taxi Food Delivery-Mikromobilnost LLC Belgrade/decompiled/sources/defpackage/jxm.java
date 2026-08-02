package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jxm {
    public final String a;
    public final String b;
    public final jvm c;
    public final pwm d;
    public final fvm e;
    public final fvm f;

    public jxm(String str, String str2, jvm jvmVar, pwm pwmVar, fvm fvmVar, fvm fvmVar2) {
        this.a = str;
        this.b = str2;
        this.c = jvmVar;
        this.d = pwmVar;
        this.e = fvmVar;
        this.f = fvmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxm)) {
            return false;
        }
        jxm jxmVar = (jxm) obj;
        return jl40.l(this.a, jxmVar.a) && jl40.l(this.b, jxmVar.b) && this.c.equals(jxmVar.c) && this.d.equals(jxmVar.d) && this.e.equals(jxmVar.e) && jl40.l(this.f, jxmVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        fvm fvmVar = this.f;
        return hashCode2 + (fvmVar != null ? fvmVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DueScreenState(title=", this.a, ", subtitle=", this.b, ", description=");
        v.append(this.c);
        v.append(", pickerState=");
        v.append(this.d);
        v.append(", continueButton=");
        v.append(this.e);
        v.append(", deleteButton=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
