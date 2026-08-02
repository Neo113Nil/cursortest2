package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class df70 extends s4z0 {
    public final w4v a;

    public df70(w4v w4vVar) {
        this.a = w4vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df70) && jl40.l(this.a, ((df70) obj).a);
    }

    public final int hashCode() {
        w4v w4vVar = this.a;
        if (w4vVar == null) {
            return 0;
        }
        return w4vVar.hashCode();
    }

    public final String toString() {
        return "OptionTileFooterModel(optionIcon=" + this.a + Extension.C_BRAKE;
    }

    public df70() {
        this(null);
    }
}
