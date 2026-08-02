package xsna;

/* compiled from: StickerSettingsItem.kt */
/* loaded from: classes6.dex */
public final class f6l0 extends bk7 {
    public final int c;

    public f6l0(int i) {
        super(1);
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6l0) && this.c == ((f6l0) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("StickerSettingsCaptionItem(stringRes="), this.c, ')');
    }
}
