package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lij implements qas0 {
    public final Text a;
    public final Text b;

    public lij(Text text, Text text2) {
        this.a = text;
        this.b = text2;
    }

    public final Text a() {
        return this.b;
    }

    public final Text b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lij)) {
            return false;
        }
        lij lijVar = (lij) obj;
        return jl40.l(this.a, lijVar.a) && jl40.l(this.b, lijVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowDayTooltip(title=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
    }
}
