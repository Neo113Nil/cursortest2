package xsna;

/* compiled from: StickersKeyboardItems.kt */
/* loaded from: classes6.dex */
public final class ufy extends rf6 {
    public final String b;

    public ufy(String str) {
        this.b = str;
    }

    @Override // xsna.rf6
    public final int a() {
        return -9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufy) && epx.f(this.b, ((ufy) obj).b);
    }

    @Override // xsna.rf6, xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return -1;
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("KeyboardHeaderOpenCatalogItem(ref="), this.b, ')');
    }

    public ufy() {
        this(null);
    }
}
