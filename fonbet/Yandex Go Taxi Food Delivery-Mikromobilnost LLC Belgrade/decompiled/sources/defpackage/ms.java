package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ms {
    public final Text.Constant a;
    public final String b;

    public ms(Text.Constant constant, String str) {
        this.a = constant;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms)) {
            return false;
        }
        ms msVar = (ms) obj;
        return this.a.equals(msVar.a) && jl40.l(this.b, msVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionButtonEntity(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
