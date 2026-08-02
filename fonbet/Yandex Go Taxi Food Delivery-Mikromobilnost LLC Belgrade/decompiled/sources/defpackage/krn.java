package defpackage;

import android.text.TextUtils;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class krn extends w4a1 {
    public final TextUtils.TruncateAt b;

    public krn(TextUtils.TruncateAt truncateAt) {
        this.b = truncateAt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof krn) && this.b == ((krn) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OnOverflow(truncationMode=" + this.b + Extension.C_BRAKE;
    }

    public krn() {
        this(0);
    }

    public /* synthetic */ krn(int i) {
        this(TextUtils.TruncateAt.END);
    }
}
