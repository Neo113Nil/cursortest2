package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class da8 extends ea8 {
    public final Text a;

    public da8(Text text) {
        this.a = text;
    }

    @Override // defpackage.ea8
    public final Text a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da8) && this.a.equals(((da8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Regular(message=" + this.a + Extension.C_BRAKE;
    }
}
