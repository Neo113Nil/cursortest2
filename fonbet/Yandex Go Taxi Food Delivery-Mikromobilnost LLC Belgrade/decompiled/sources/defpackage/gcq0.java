package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gcq0 {
    public final sl a;

    public gcq0(sl slVar) {
        this.a = slVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcq0) && jl40.l(this.a, ((gcq0) obj).a);
    }

    public final int hashCode() {
        sl slVar = this.a;
        if (slVar == null) {
            return 0;
        }
        return slVar.hashCode();
    }

    public final String toString() {
        return "SelectMe2MeAccountOptionState(selectedAccountBottomSheet=" + this.a + Extension.C_BRAKE;
    }
}
