package xsna;

/* compiled from: StickerSettingsItem.kt */
/* loaded from: classes6.dex */
public final class n6l0 extends bk7 {
    public final boolean c;

    public n6l0(boolean z) {
        super(1);
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6l0) && this.c == ((n6l0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("StickerSettingsPopupItem(isEnabled="), this.c, ')');
    }
}
