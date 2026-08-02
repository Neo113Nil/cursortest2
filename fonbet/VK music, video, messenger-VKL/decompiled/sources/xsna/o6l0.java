package xsna;

/* compiled from: StickerSettingsItem.kt */
/* loaded from: classes6.dex */
public final class o6l0 extends bk7 {
    public final boolean c;

    public o6l0(boolean z) {
        super(1);
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6l0) && this.c == ((o6l0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("StickerSettingsReloadItem(isRefreshing="), this.c, ')');
    }
}
