package xsna;

import org.msgpack.value.ValueType;

/* compiled from: ImmutableNilValueImpl.java */
/* loaded from: classes8.dex */
public final class fpw extends re implements kjr0 {
    public static final fpw b = new fpw();

    @Override // xsna.kjr0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjr0) {
            return ((kjr0) obj).B();
        }
        return false;
    }

    @Override // xsna.kjr0
    public final ValueType h() {
        return ValueType.NIL;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // xsna.kjr0
    public final String toJson() {
        return "null";
    }

    public final String toString() {
        return "null";
    }
}
