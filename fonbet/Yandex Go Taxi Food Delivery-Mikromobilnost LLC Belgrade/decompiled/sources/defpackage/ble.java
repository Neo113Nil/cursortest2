package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class ble extends kr {
    public static final ale Companion = new ale();
    public final String a;

    public /* synthetic */ ble(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, zke.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ble.class == obj.getClass() && jl40.l(this.a, ((ble) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return oyr.p("ContinueLoadingAction(forcedPageToken=", this.a, Extension.C_BRAKE);
    }
}
