package xsna;

/* compiled from: VideoPickerItem.kt */
/* loaded from: classes16.dex */
public final class m2t0 implements hfz {
    public final n2t0 b;

    public m2t0(n2t0 n2t0Var) {
        this.b = n2t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2t0) && epx.f(this.b, ((m2t0) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.a.hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "VideoPickerItem(videoPickerItemData=" + this.b + ')';
    }
}
