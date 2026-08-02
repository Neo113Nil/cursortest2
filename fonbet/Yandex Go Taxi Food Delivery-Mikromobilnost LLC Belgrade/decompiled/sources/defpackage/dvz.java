package defpackage;

import com.yandex.go.loyalty.impl.selector.domain.model.LoyaltyProgramState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dvz {
    public final String a;
    public final String b;
    public final String c;
    public final LoyaltyProgramState d;
    public final String e;
    public final ovz f;

    public dvz(String str, String str2, String str3, LoyaltyProgramState loyaltyProgramState, String str4, ovz ovzVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = loyaltyProgramState;
        this.e = str4;
        this.f = ovzVar;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final LoyaltyProgramState c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvz)) {
            return false;
        }
        dvz dvzVar = (dvz) obj;
        return jl40.l(this.a, dvzVar.a) && jl40.l(this.b, dvzVar.b) && jl40.l(this.c, dvzVar.c) && this.d == dvzVar.d && this.e.equals(dvzVar.e) && this.f.equals(dvzVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("LoyaltyProgram(programName=", this.a, ", header=", this.b, ", text=");
        v.append(this.c);
        v.append(", state=");
        v.append(this.d);
        v.append(", iconUrl=");
        v.append(this.e);
        v.append(", selectorState=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
