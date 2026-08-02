package xsna;

/* compiled from: DialogsListModels.kt */
/* loaded from: classes2.dex */
public final class w9j0 implements ogm {
    public final int b;

    public w9j0(int i) {
        this.b = i;
    }

    @Override // xsna.ogm
    public final int Za() {
        return 21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9j0) && this.b == ((w9j0) obj).b;
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return 2147483635;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("SharedChatsCountItem(count="), this.b, ')');
    }
}
