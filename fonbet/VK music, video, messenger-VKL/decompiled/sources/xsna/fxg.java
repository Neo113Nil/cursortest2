package xsna;

/* compiled from: CommunityClosedItemModel.kt */
/* loaded from: classes5.dex */
public final class fxg extends s4h {
    public final boolean b;

    public fxg(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxg) && this.b == ((fxg) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("CommunityClosedItemModel(isClosed="), this.b, ')');
    }
}
