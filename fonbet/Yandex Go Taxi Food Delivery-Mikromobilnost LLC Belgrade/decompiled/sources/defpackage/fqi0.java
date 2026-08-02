package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class fqi0 extends gqi0 {
    public final Text a;
    public final Text b;

    public /* synthetic */ fqi0(Text.Resource resource, int i) {
        this((i & 1) != 0 ? null : resource, (Text) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqi0)) {
            return false;
        }
        fqi0 fqi0Var = (fqi0) obj;
        return jl40.l(this.a, fqi0Var.a) && jl40.l(this.b, fqi0Var.b);
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.b;
        return hashCode + (text2 != null ? text2.hashCode() : 0);
    }

    public final String toString() {
        return "Loading(progressTitle=" + this.a + ", progressSubtitle=" + this.b + Extension.C_BRAKE;
    }

    public fqi0(Text text, Text text2) {
        this.a = text;
        this.b = text2;
    }

    public fqi0() {
        this((Text.Resource) null, 3);
    }
}
