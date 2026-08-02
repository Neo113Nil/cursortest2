package xsna;

/* compiled from: VoipHistoryMenuAdapter.kt */
/* loaded from: classes7.dex */
public final class dqw0 implements hfz {
    public final boolean b;

    public dqw0(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqw0) && this.b == ((dqw0) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ClearAll(hasHistory="), this.b, ')');
    }
}
