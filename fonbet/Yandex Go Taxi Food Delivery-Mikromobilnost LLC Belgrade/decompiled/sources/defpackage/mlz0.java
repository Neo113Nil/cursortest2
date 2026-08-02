package defpackage;

/* loaded from: classes.dex */
public final class mlz0 implements olz0 {
    public final Number a;

    public /* synthetic */ mlz0(Number number) {
        this.a = number;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mlz0) {
            return this.a.equals(((mlz0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Num(value=" + this.a + ')';
    }
}
