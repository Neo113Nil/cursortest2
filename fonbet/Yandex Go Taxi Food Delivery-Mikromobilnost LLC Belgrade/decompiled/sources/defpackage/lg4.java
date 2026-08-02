package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lg4 implements qg4 {
    public final yiy a;
    public final yiy b;

    public lg4(yiy yiyVar, yiy yiyVar2) {
        this.a = yiyVar;
        this.b = yiyVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg4)) {
            return false;
        }
        lg4 lg4Var = (lg4) obj;
        return this.a.equals(lg4Var.a) && jl40.l(this.b, lg4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yiy yiyVar = this.b;
        return hashCode + (yiyVar == null ? 0 : yiyVar.hashCode());
    }

    public final String toString() {
        return "GradientBackground(lightGradient=" + this.a + ", darkGradient=" + this.b + Extension.C_BRAKE;
    }
}
