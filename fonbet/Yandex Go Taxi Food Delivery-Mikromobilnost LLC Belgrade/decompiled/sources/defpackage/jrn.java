package defpackage;

import android.text.TextUtils;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jrn extends w4a1 {
    public final int b;
    public final TextUtils.TruncateAt c;

    public jrn(int i) {
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        this.b = i;
        this.c = truncateAt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrn)) {
            return false;
        }
        jrn jrnVar = (jrn) obj;
        return this.b == jrnVar.b && this.c == jrnVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "OnMaxLines(lines=" + this.b + ", truncationMode=" + this.c + Extension.C_BRAKE;
    }
}
