package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gys0 implements hys0 {
    public final wbf a;

    public gys0(wbf wbfVar) {
        this.a = wbfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gys0) && this.a.equals(((gys0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ValidatePreselectedImage(cropInfo=" + this.a + Extension.C_BRAKE;
    }
}
