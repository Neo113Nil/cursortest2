package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dqv0 implements iqv0 {
    public final y62 a;

    public dqv0(y62 y62Var) {
        this.a = y62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqv0) && jl40.l(this.a, ((dqv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AnchoredSummaryAction(anchoredSummaryUiAction=" + this.a + Extension.C_BRAKE;
    }
}
