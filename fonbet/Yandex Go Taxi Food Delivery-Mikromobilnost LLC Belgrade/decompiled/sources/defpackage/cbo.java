package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class cbo implements tt11 {
    public final jm91 a;
    public final int b;

    public cbo(jm91 jm91Var, int i) {
        this.a = jm91Var;
        this.b = i;
    }

    public static cbo a(cbo cboVar, jm91 jm91Var) {
        int i = cboVar.b;
        cboVar.getClass();
        return new cbo(jm91Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbo)) {
            return false;
        }
        cbo cboVar = (cbo) obj;
        return jl40.l(this.a, cboVar.a) && this.b == cboVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EsiaAuthEbsState(webViewState=" + this.a + ", processingTitleRes=" + this.b + Extension.C_BRAKE;
    }

    public cbo() {
        this(zt41.b, kzh0.ebssdk_processing_tv_text);
    }
}
