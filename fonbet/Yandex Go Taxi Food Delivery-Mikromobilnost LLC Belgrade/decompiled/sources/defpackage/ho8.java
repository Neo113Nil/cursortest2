package defpackage;

import com.ybsdk.widgets.common.k;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ho8 implements jo8 {
    public final k a;

    public ho8(k kVar) {
        this.a = kVar;
    }

    public final k a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ho8) && this.a.equals(((ho8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(progressState=" + this.a + Extension.C_BRAKE;
    }
}
