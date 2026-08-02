package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class arj0 extends rma1 {
    public final Text a;

    public arj0(Text text) {
        this.a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof arj0) && jl40.l(this.a, ((arj0) obj).a);
    }

    public final int hashCode() {
        Text text = this.a;
        if (text == null) {
            return 0;
        }
        return text.hashCode();
    }

    public final String toString() {
        return "Error(message=" + this.a + Extension.C_BRAKE;
    }
}
