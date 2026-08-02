package xsna;

import java.time.Instant;
import java.util.Arrays;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.value.ValueType;

/* compiled from: ImmutableTimestampValueImpl.java */
/* loaded from: classes8.dex */
public final class ppw extends re implements low, eyo0 {
    public final Instant b;
    public byte[] c;

    public ppw(Instant instant) {
        this.b = instant;
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
        return v instanceof eyo0 ? this.b.equals(((eyo0) v).toInstant()) : -1 == v.getType() && Arrays.equals(getData(), v.getData());
    }

    @Override // xsna.fdq
    public final byte[] getData() {
        byte[] bArr;
        if (this.c == null) {
            Instant instant = this.b;
            long epochSecond = instant.getEpochSecond();
            int nano = instant.getNano();
            if ((epochSecond >>> 34) == 0) {
                long j = (nano << 34) | epochSecond;
                if (((-4294967296L) & j) == 0) {
                    bArr = new byte[4];
                    MessageBuffer.wrap(bArr).putInt(0, (int) epochSecond);
                } else {
                    bArr = new byte[8];
                    MessageBuffer.wrap(bArr).putLong(0, j);
                }
            } else {
                byte[] bArr2 = new byte[12];
                MessageBuffer wrap = MessageBuffer.wrap(bArr2);
                wrap.putInt(0, nano);
                wrap.putLong(4, epochSecond);
                bArr = bArr2;
            }
            this.c = bArr;
        }
        return this.c;
    }

    @Override // xsna.fdq
    public final byte getType() {
        return (byte) -1;
    }

    @Override // xsna.kjr0
    public final ValueType h() {
        return ValueType.EXTENSION;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.eyo0
    public final Instant toInstant() {
        return this.b;
    }

    @Override // xsna.kjr0
    public final String toJson() {
        return "\"" + this.b.toString() + "\"";
    }

    public final String toString() {
        return this.b.toString();
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
