package xsna;

/* compiled from: VmojiCharacterItem.kt */
/* loaded from: classes7.dex */
public final class t6w0 extends z6w0 {
    public final boolean b;

    public t6w0(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t6w0) && this.b == ((t6w0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("VmojiCharacterHeaderLoadingItem(isMyCharacter="), this.b, ')');
    }
}
