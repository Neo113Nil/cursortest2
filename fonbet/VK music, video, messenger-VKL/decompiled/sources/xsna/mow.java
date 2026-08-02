package xsna;

import com.ironsource.X3;
import java.util.Arrays;
import org.msgpack.value.ValueType;

/* compiled from: ImmutableExtensionValueImpl.java */
/* loaded from: classes8.dex */
public final class mow extends re implements low {
    public final byte b;
    public final byte[] c;

    public mow(byte b, byte[] bArr) {
        this.b = b;
        this.c = bArr;
    }

    @Override // xsna.kjr0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kjr0)) {
            return false;
        }
        kjr0 kjr0Var = (kjr0) obj;
        if (!kjr0Var.D()) {
            return false;
        }
        fdq v = kjr0Var.v();
        return this.b == v.getType() && Arrays.equals(this.c, v.getData());
    }

    @Override // xsna.fdq
    public final byte[] getData() {
        return this.c;
    }

    @Override // xsna.fdq
    public final byte getType() {
        return this.b;
    }

    @Override // xsna.kjr0
    public final ValueType h() {
        return ValueType.EXTENSION;
    }

    public final int hashCode() {
        int i = this.b + 31;
        for (byte b : this.c) {
            i = (i * 31) + b;
        }
        return i;
    }

    @Override // xsna.kjr0
    public final String toJson() {
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(Byte.toString(this.b));
        sb.append(",\"");
        for (byte b : this.c) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append("\"]");
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Byte.toString(this.b));
        sb.append(",0x");
        for (byte b : this.c) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // xsna.re
    /* renamed from: K */
    public final low v() {
        return this;
    }

    @Override // xsna.re, xsna.kjr0
    public final fdq v() {
        return this;
    }
}
