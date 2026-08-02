package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nas {
    public final sl a;

    public nas(sl slVar) {
        this.a = slVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nas) && jl40.l(this.a, ((nas) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FpsPayBottomSheetState(selectedAccount=" + this.a + Extension.C_BRAKE;
    }
}
