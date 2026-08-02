package xsna;

/* compiled from: BackgroundChooseItem.kt */
/* loaded from: classes2.dex */
public final class p4t extends mw5 {
    public final String b;

    public p4t() {
        this(0);
    }

    @Override // xsna.mw5
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4t)) {
            return false;
        }
        ((p4t) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }

    @Override // xsna.t1c
    public final boolean isChecked() {
        return false;
    }

    public final String toString() {
        return "GalleryItem(isChecked=false)";
    }

    public p4t(int i) {
        this.b = "";
    }
}
