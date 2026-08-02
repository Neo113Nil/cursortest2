package xsna;

import java.util.Arrays;
import org.msgpack.value.ValueType;

/* compiled from: ImmutableStringValueImpl.java */
/* loaded from: classes8.dex */
public final class npw extends qe implements mpw {
    @Override // xsna.kjr0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjr0)) {
            return false;
        }
        kjr0 kjr0Var = (kjr0) obj;
        if (!kjr0Var.i()) {
            return false;
        }
        boolean z = kjr0Var instanceof npw;
        byte[] bArr = this.b;
        return z ? Arrays.equals(bArr, ((npw) kjr0Var).b) : Arrays.equals(bArr, ((qe) kjr0Var.x()).O());
    }

    @Override // xsna.kjr0
    public final ValueType h() {
        return ValueType.STRING;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    @Override // xsna.re
    /* renamed from: M */
    public final mpw x() {
        return this;
    }

    @Override // xsna.re, xsna.kjr0
    public final mpw x() {
        return this;
    }
}
