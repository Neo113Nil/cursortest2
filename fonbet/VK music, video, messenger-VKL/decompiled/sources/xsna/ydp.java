package xsna;

/* compiled from: EmojiSupportMatch.android.kt */
@vby
/* loaded from: classes11.dex */
public final class ydp {
    public final int a;

    public static String a(int i) {
        return i == 0 ? "EmojiSupportMatch.Default" : i == 1 ? "EmojiSupportMatch.None" : i == 2 ? "EmojiSupportMatch.All" : uqi.a("Invalid(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ydp) {
            return this.a == ((ydp) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
