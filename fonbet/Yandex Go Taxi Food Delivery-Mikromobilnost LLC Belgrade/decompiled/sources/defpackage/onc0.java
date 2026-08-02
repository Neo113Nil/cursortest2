package defpackage;

/* loaded from: classes2.dex */
public final class onc0 {
    public final String a;
    public final woc0 b;

    public onc0(String str, woc0 woc0Var) {
        this.a = str;
        this.b = woc0Var;
    }

    public final woc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onc0)) {
            return false;
        }
        onc0 onc0Var = (onc0) obj;
        return this.a.equals(onc0Var.a) && this.b.equals(onc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EndPoint(__typename=" + this.a + ", plaquePoint=" + this.b + ')';
    }
}
