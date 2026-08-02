package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bws0 implements hz {
    public final FormattedText a;
    public final String b;
    public final x2s c;
    public final r9x0 d;

    public bws0(FormattedText formattedText, String str, x2s x2sVar, r9x0 r9x0Var) {
        this.a = formattedText;
        this.b = str;
        this.c = x2sVar;
        this.d = r9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bws0)) {
            return false;
        }
        bws0 bws0Var = (bws0) obj;
        return this.a.equals(bws0Var.a) && jl40.l(this.b, bws0Var.b) && this.c.equals(bws0Var.c) && this.d.equals(bws0Var.d);
    }

    @Override // defpackage.hz
    public final r9x0 getAction() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + tse0.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "Button(title=" + this.a + ", accessibilityLabel=" + this.b + ", analyticsData=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }
}
