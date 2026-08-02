package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class m24 {
    public final Text a;
    public final rbv b;
    public final Text c;
    public final boolean d;
    public final Text e;

    public m24(Text text, rbv rbvVar, Text text2, boolean z, Text text3) {
        this.a = text;
        this.b = rbvVar;
        this.c = text2;
        this.d = z;
        this.e = text3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m24)) {
            return false;
        }
        m24 m24Var = (m24) obj;
        return jl40.l(this.a, m24Var.a) && jl40.l(this.b, m24Var.b) && jl40.l(this.c, m24Var.c) && this.d == m24Var.d && jl40.l(this.e, m24Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rbv rbvVar = this.b;
        int hashCode2 = (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        Text text = this.c;
        int e = unr0.e((hashCode2 + (text == null ? 0 : text.hashCode())) * 31, 31, this.d);
        Text text2 = this.e;
        return e + (text2 != null ? text2.hashCode() : 0);
    }

    public final String toString() {
        return "AutoTopupToggleViewState(title=" + this.a + ", titleEndBadgeImageModel=" + this.b + ", subtitle=" + this.c + ", isChecked=" + this.d + ", info=" + this.e + Extension.C_BRAKE;
    }
}
