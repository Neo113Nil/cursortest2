package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d9r0 implements e9r0 {
    public final String a;
    public final Text b;
    public final Text c;

    public d9r0(Text text, Text text2, String str) {
        this.a = str;
        this.b = text;
        this.c = text2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9r0)) {
            return false;
        }
        d9r0 d9r0Var = (d9r0) obj;
        return jl40.l(this.a, d9r0Var.a) && jl40.l(this.b, d9r0Var.b) && jl40.l(this.c, d9r0Var.c);
    }

    @Override // defpackage.e9r0
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.c;
        return hashCode2 + (text2 != null ? text2.hashCode() : 0);
    }

    public final String toString() {
        return "SettingsListInfoItem(key=" + this.a + ", title=" + this.b + ", description=" + this.c + Extension.C_BRAKE;
    }
}
