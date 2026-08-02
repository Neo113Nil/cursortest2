package defpackage;

/* loaded from: classes.dex */
public final class nlz0 implements olz0 {
    public final String a;

    public /* synthetic */ nlz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nlz0) {
            return this.a.equals(((nlz0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.l(')', "Str(value=", this.a);
    }
}
