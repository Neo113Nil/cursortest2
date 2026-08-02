package xsna;

/* compiled from: DialogsListModels.kt */
/* loaded from: classes2.dex */
public final class tv30 implements lge0 {
    public final int b;

    public tv30(int i) {
        this.b = i;
    }

    @Override // xsna.ogm
    public final int Za() {
        return 12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv30) && this.b == ((tv30) obj).b;
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return 2147483646;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("MsgRequestCountItem(count="), this.b, ')');
    }
}
