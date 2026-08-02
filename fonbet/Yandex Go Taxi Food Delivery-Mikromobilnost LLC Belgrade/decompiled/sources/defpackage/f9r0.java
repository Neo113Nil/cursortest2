package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class f9r0 implements e9r0 {
    public final String a;
    public final boolean b;
    public final Text c;

    public f9r0(String str, boolean z, Text text) {
        this.a = str;
        this.b = z;
        this.c = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9r0)) {
            return false;
        }
        f9r0 f9r0Var = (f9r0) obj;
        return jl40.l(this.a, f9r0Var.a) && this.b == f9r0Var.b && jl40.l(this.c, f9r0Var.c);
    }

    @Override // defpackage.e9r0
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = oo31.l("SettingsListSoonItem(key=", this.a, ", clickable=", ", title=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
