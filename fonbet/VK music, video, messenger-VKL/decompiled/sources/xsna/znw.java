package xsna;

import java.util.Arrays;
import org.msgpack.value.ValueType;

/* compiled from: ImmutableBinaryValueImpl.java */
/* loaded from: classes8.dex */
public final class znw extends qe implements ynw {
    @Override // xsna.kjr0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjr0)) {
            return false;
        }
        kjr0 kjr0Var = (kjr0) obj;
        if (!kjr0Var.q()) {
            return false;
        }
        boolean z = kjr0Var instanceof znw;
        byte[] bArr = this.b;
        return z ? Arrays.equals(bArr, ((znw) kjr0Var).b) : Arrays.equals(bArr, ((qe) kjr0Var.k()).O());
    }

    @Override // xsna.kjr0
    public final ValueType h() {
        return ValueType.BINARY;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    @Override // xsna.re
    /* renamed from: I */
    public final ynw k() {
        return this;
    }

    @Override // xsna.re, xsna.kjr0
    public final ynw k() {
        return this;
    }
}
