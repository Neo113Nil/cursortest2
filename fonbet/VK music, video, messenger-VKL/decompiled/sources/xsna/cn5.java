package xsna;

/* compiled from: AutoValue_KeyValueImpl.java */
/* loaded from: classes8.dex */
public final class cn5 extends jey {
    public final String a;
    public final ljr0<?> b;

    public cn5(String str, ljr0<?> ljr0Var) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.a = str;
        if (ljr0Var == null) {
            throw new NullPointerException("Null value");
        }
        this.b = ljr0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jey) {
            jey jeyVar = (jey) obj;
            if (this.a.equals(((cn5) jeyVar).a)) {
                if (this.b.equals(((cn5) jeyVar).b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.iey
    public final String getKey() {
        return this.a;
    }

    @Override // xsna.iey
    public final ljr0<?> getValue() {
        return this.b;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "KeyValueImpl{key=" + this.a + ", value=" + this.b + "}";
    }
}
