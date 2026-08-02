package xsna;

/* compiled from: BonusRewardsPageItem.kt */
/* loaded from: classes5.dex */
public final class tl7 implements hfz {
    public final boolean b;

    public tl7(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tl7) && this.b == ((tl7) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("BonusRewardsPageItem(inactive="), this.b, ')');
    }
}
