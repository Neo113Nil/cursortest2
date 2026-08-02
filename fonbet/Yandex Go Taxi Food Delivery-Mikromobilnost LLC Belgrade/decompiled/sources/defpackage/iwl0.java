package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class iwl0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final hwl0 e;
    public final dwl0 f;
    public final ewl0 g;

    public iwl0(String str, String str2, String str3, String str4, hwl0 hwl0Var, dwl0 dwl0Var, ewl0 ewl0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hwl0Var;
        this.f = dwl0Var;
        this.g = ewl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwl0)) {
            return false;
        }
        iwl0 iwl0Var = (iwl0) obj;
        return this.a.equals(iwl0Var.a) && this.b.equals(iwl0Var.b) && this.c.equals(iwl0Var.c) && jl40.l(this.d, iwl0Var.d) && this.e.equals(iwl0Var.e) && this.f.equals(iwl0Var.f) && this.g.equals(iwl0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SafetyNameInputUiState(title=", this.a, ", text=", this.b, ", hint=");
        g8e.D(v, this.c, ", name=", this.d, ", validationState=");
        v.append(this.e);
        v.append(", buttonsState=");
        v.append(this.f);
        v.append(", logo=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
