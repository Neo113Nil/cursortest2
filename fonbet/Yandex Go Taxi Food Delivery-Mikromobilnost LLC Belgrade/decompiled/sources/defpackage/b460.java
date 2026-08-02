package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class b460 implements f460 {
    public final h360 a;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public b460(h360 h360Var) {
        this.a = h360Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b460) && jl40.l(this.a, ((b460) obj).a);
    }

    public final int hashCode() {
        h360 h360Var = this.a;
        if (h360Var == null) {
            return 0;
        }
        return h360Var.hashCode();
    }

    public final String toString() {
        return "EditingStage(labels=" + this.a + Extension.C_BRAKE;
    }
}
