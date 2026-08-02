package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class k8q0 {
    public final s8q0 a;
    public final s8q0 b;
    public final String c;
    public final w7q0 d;
    public final jls e;
    public final v8q0 f;

    public k8q0(s8q0 s8q0Var, s8q0 s8q0Var2, String str, w7q0 w7q0Var, jls jlsVar, v8q0 v8q0Var) {
        this.a = s8q0Var;
        this.b = s8q0Var2;
        this.c = str;
        this.d = w7q0Var;
        this.e = jlsVar;
        this.f = v8q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8q0)) {
            return false;
        }
        k8q0 k8q0Var = (k8q0) obj;
        return jl40.l(this.a, k8q0Var.a) && jl40.l(this.b, k8q0Var.b) && jl40.l(this.c, k8q0Var.c) && jl40.l(this.d, k8q0Var.d) && jl40.l(this.e, k8q0Var.e) && this.f.equals(k8q0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        w7q0 w7q0Var = this.d;
        int hashCode3 = (hashCode2 + (w7q0Var == null ? 0 : w7q0Var.hashCode())) * 31;
        jls jlsVar = this.e;
        return this.f.hashCode() + ((hashCode3 + (jlsVar != null ? jlsVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SegmentElementState(selectedText=" + this.a + ", unselectedText=" + this.b + ", contentDescription=" + this.c + ", badge=" + this.d + ", fullsizePopup=" + this.e + ", widgetAction=" + this.f + Extension.C_BRAKE;
    }
}
