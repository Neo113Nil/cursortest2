package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pg00 implements tg00 {
    public final v81 a;

    public pg00(v81 v81Var) {
        this.a = v81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg00) && jl40.l(this.a, ((pg00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddressAction(addressUiAction=" + this.a + Extension.C_BRAKE;
    }
}
