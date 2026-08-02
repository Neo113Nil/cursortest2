package defpackage;

/* loaded from: classes.dex */
public final class mun {
    public final int a;

    public /* synthetic */ mun(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return i == 0 ? "EmojiSupportMatch.Default" : i == 1 ? "EmojiSupportMatch.None" : i == 2 ? "EmojiSupportMatch.All" : oyr.e(')', i, "Invalid(value=");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mun) {
            return this.a == ((mun) obj).a;
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
