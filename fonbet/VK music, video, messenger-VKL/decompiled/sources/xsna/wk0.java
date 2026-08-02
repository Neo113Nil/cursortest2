package xsna;

/* compiled from: MethodItems.kt */
/* loaded from: classes3.dex */
public final class wk0 implements hfz {
    public final String b;

    public wk0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk0) && epx.f(this.b, ((wk0) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AddCardItem(addCardUrl="), this.b, ')');
    }
}
