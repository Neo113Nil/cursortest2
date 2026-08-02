package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class eqv0 implements iqv0 {
    public final epo a;

    public eqv0(epo epoVar) {
        this.a = epoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqv0) && jl40.l(this.a, ((eqv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ExpandedSummaryAction(expandedSummaryUiAction=" + this.a + Extension.C_BRAKE;
    }
}
