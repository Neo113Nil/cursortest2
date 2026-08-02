package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ktv {
    public final Text a;
    public final Integer b;

    public ktv(Text text, Integer num) {
        this.a = text;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktv)) {
            return false;
        }
        ktv ktvVar = (ktv) obj;
        return jl40.l(this.a, ktvVar.a) && jl40.l(this.b, ktvVar.b);
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "InfoMessage(text=" + this.a + ", colorId=" + this.b + Extension.C_BRAKE;
    }

    public ktv() {
        this(null, null);
    }
}
