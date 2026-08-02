package androidx.datastore.preferences.protobuf;

import defpackage.b64;
import defpackage.h72;
import defpackage.ny61;
import defpackage.omb1;
import defpackage.omy0;
import defpackage.oyr;
import defpackage.q77;
import defpackage.seu;
import defpackage.t77;
import defpackage.tqw;
import defpackage.xfo;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString a = new LiteralByteString(tqw.b);
    public static final t77 b;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    /* loaded from: classes10.dex */
    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.b(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte a(int i) {
            int i2 = this.bytesLength;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.bytes[this.bytesOffset + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(oyr.i(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(oyr.h(i, i2, "Index > length: ", Extension.FIX_SPACE));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final void g(int i, byte[] bArr) {
            System.arraycopy(this.bytes, this.bytesOffset, bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte h(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        public final int j() {
            return this.bytesOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            byte[] bArr;
            int size = size();
            if (size == 0) {
                bArr = tqw.b;
            } else {
                byte[] bArr2 = new byte[size];
                g(size, bArr2);
                bArr = bArr2;
            }
            return new LiteralByteString(bArr);
        }
    }

    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        @Override // java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new q77(this);
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte a(int i) {
            return this.bytes[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof ByteString) && size() == ((ByteString) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (!(obj instanceof LiteralByteString)) {
                    return obj.equals(this);
                }
                LiteralByteString literalByteString = (LiteralByteString) obj;
                int i = i();
                int i2 = literalByteString.i();
                if (i == 0 || i2 == 0 || i == i2) {
                    int size = size();
                    if (size > literalByteString.size()) {
                        ny61.d(size, size());
                        return false;
                    }
                    if (size > literalByteString.size()) {
                        xfo.k(b64.t(size, "Ran off end of other: 0, ", Extension.FIX_SPACE), literalByteString.size());
                        return false;
                    }
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = literalByteString.bytes;
                    int j = j() + size;
                    int j2 = j();
                    int j3 = literalByteString.j();
                    while (j2 < j) {
                        if (bArr[j2] == bArr2[j3]) {
                            j2++;
                            j3++;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void g(int i, byte[] bArr) {
            System.arraycopy(this.bytes, 0, bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte h(int i) {
            return this.bytes[i];
        }

        public int j() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }
    }

    static {
        b = h72.a() ? new seu(18) : new omy0();
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            ny61.m(oyr.j(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            ny61.m(oyr.h(i, i2, "Beginning index larger than ending index: ", Extension.FIX_SPACE));
            return 0;
        }
        ny61.m(oyr.h(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static ByteString f(int i, int i2, byte[] bArr) {
        b(i, i + i2, bArr.length);
        return new LiteralByteString(b.b(i, i2, bArr));
    }

    public abstract byte a(int i);

    public abstract boolean equals(Object obj);

    public abstract void g(int i, byte[] bArr);

    public abstract byte h(int i);

    public final int hashCode() {
        int i = this.hash;
        if (i != 0) {
            return i;
        }
        int size = size();
        LiteralByteString literalByteString = (LiteralByteString) this;
        byte[] bArr = literalByteString.bytes;
        int j = literalByteString.j();
        int i2 = size;
        for (int i3 = j; i3 < j + size; i3++) {
            i2 = (i2 * 31) + bArr[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.hash = i2;
        return i2;
    }

    public final int i() {
        return this.hash;
    }

    public abstract int size();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = omb1.c(this);
        } else {
            LiteralByteString literalByteString = (LiteralByteString) this;
            int b2 = b(0, 47, literalByteString.size());
            concat = omb1.c(b2 == 0 ? a : new BoundedByteString(literalByteString.bytes, literalByteString.j(), b2)).concat("...");
        }
        return oyr.t(b64.u(size, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
