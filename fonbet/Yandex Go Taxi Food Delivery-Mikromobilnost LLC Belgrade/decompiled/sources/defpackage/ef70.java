package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ef70 extends t4z0 {
    public final v4v a;

    public ef70(ra90 ra90Var) {
        this.a = ra90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef70) && jl40.l(this.a, ((ef70) obj).a);
    }

    public final int hashCode() {
        v4v v4vVar = this.a;
        if (v4vVar == null) {
            return 0;
        }
        return v4vVar.hashCode();
    }

    public final String toString() {
        return "OptionTileFooterState(optionIcon=" + this.a + Extension.C_BRAKE;
    }

    public ef70() {
        this(null);
    }
}
