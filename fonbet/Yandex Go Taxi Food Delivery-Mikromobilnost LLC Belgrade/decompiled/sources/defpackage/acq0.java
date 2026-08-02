package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class acq0 implements gav0 {
    public final Text a;
    public final Text b;

    public acq0(Text text, Text text2) {
        this.a = text;
        this.b = text2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acq0)) {
            return false;
        }
        acq0 acq0Var = (acq0) obj;
        return jl40.l(this.a, acq0Var.a) && this.b.equals(acq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectHeaderItem(title=" + this.a + ", description=" + this.b + Extension.C_BRAKE;
    }
}
