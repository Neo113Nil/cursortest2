package xsna;

/* compiled from: EmojiModels.kt */
/* loaded from: classes6.dex */
public final class vcp {
    public final String a;

    public vcp(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vcp) && epx.f(this.a, ((vcp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Emoji(keyword="), this.a, ')');
    }
}
