package xsna;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class cm7 implements hki0 {
    public final boolean b;

    public cm7(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm7)) {
            return false;
        }
        cm7 cm7Var = (cm7) obj;
        cm7Var.getClass();
        return this.b == cm7Var.b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(100) * 31);
    }

    @Override // xsna.hki0, xsna.jjv0
    public final int n1(int i) {
        return 2;
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("BonusesInfoItem(amount=100, isExpanded="), this.b, ')');
    }
}
