package xsna;

/* compiled from: MultiPickerMarketPlaceholderItem.kt */
/* loaded from: classes18.dex */
public final class v540 implements hfz {
    public final q810 b;

    public v540(q810 q810Var) {
        this.b = q810Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v540) && epx.f(this.b, ((v540) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "MultiPickerMarketPlaceholderItem(placeholderState=" + this.b + ')';
    }
}
