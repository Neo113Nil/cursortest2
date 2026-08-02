package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hqv0 implements iqv0 {
    public final udv0 a;

    public hqv0(udv0 udv0Var) {
        this.a = udv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqv0) && jl40.l(this.a, ((hqv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SummaryBottomSheetAction(bottomSheetUiAction=" + this.a + Extension.C_BRAKE;
    }
}
