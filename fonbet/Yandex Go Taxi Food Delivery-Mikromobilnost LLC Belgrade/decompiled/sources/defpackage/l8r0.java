package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l8r0 implements e9r0 {
    public final String a;
    public final Text b;

    public l8r0(String str, Text text) {
        this.a = str;
        this.b = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8r0)) {
            return false;
        }
        l8r0 l8r0Var = (l8r0) obj;
        return jl40.l(this.a, l8r0Var.a) && this.b.equals(l8r0Var.b);
    }

    @Override // defpackage.e9r0
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SettingsHeaderViewItem(key=" + this.a + ", text=" + this.b + Extension.C_BRAKE;
    }
}
