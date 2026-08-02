package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cvk0 implements fvk0 {
    public final String a;

    public cvk0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvk0) && this.a.equals(((cvk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CloseAndDeclineOrder(analyticsName=", this.a, Extension.C_BRAKE);
    }
}
