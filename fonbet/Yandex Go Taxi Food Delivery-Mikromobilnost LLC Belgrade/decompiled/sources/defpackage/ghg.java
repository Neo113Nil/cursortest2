package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ghg extends hhg {
    public final String a;
    public final sls b;

    public /* synthetic */ ghg(String str) {
        this(new bgc(12), str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghg)) {
            return false;
        }
        ghg ghgVar = (ghg) obj;
        return jl40.l(this.a, ghgVar.a) && jl40.l(this.b, ghgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebViewAction(url=" + this.a + ", onClose=" + this.b + Extension.C_BRAKE;
    }

    public ghg(sls slsVar, String str) {
        this.a = str;
        this.b = slsVar;
    }
}
