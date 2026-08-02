package defpackage;

/* loaded from: classes.dex */
public final class llz0 implements olz0 {
    public final boolean a;

    public /* synthetic */ llz0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof llz0) {
            return this.a == ((llz0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "Bool(value=" + this.a + ')';
    }
}
