package com.google.protobuf;

import defpackage.b64;
import defpackage.eac;
import defpackage.g72;
import defpackage.imb1;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.q77;
import defpackage.rqw;
import defpackage.s77;
import defpackage.wly0;
import defpackage.x4c;
import defpackage.xfo;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString a = new LiteralByteString(rqw.b);
    public static final s77 b;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    /* loaded from: classes11.dex */
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

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
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

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final void h(int i, byte[] bArr) {
            System.arraycopy(this.bytes, this.bytesOffset, bArr, 0, i);
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final byte i(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final int size() {
            return this.bytesLength;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        public final int t() {
            return this.bytesOffset;
        }

        public Object writeReplace() {
            return new LiteralByteString(p());
        }
    }

    /* loaded from: classes11.dex */
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

        @Override // com.google.protobuf.ByteString
        public byte a(int i) {
            return this.bytes[i];
        }

        @Override // com.google.protobuf.ByteString
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
                int m = m();
                int m2 = literalByteString.m();
                if (m == 0 || m2 == 0 || m == m2) {
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
                    int t = t() + size;
                    int t2 = t();
                    int t3 = literalByteString.t();
                    while (t2 < t) {
                        if (bArr[t2] == bArr2[t3]) {
                            t2++;
                            t3++;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString
        public void h(int i, byte[] bArr) {
            System.arraycopy(this.bytes, 0, bArr, 0, i);
        }

        @Override // com.google.protobuf.ByteString
        public byte i(int i) {
            return this.bytes[i];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean j() {
            int t = t();
            return x.a.m(t, size() + t, this.bytes) == 0;
        }

        @Override // com.google.protobuf.ByteString
        public final eac k() {
            return eac.g(this.bytes, t(), size(), true);
        }

        @Override // com.google.protobuf.ByteString
        public final int l(int i, int i2) {
            byte[] bArr = this.bytes;
            int t = t();
            Charset charset = rqw.a;
            for (int i3 = t; i3 < t + i2; i3++) {
                i = (i * 31) + bArr[i3];
            }
            return i;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString n(int i) {
            int b = ByteString.b(0, i, size());
            return b == 0 ? ByteString.a : new BoundedByteString(this.bytes, t(), b);
        }

        @Override // com.google.protobuf.ByteString
        public final String q(Charset charset) {
            return new String(this.bytes, t(), size(), charset);
        }

        @Override // com.google.protobuf.ByteString
        public final void s(l lVar) {
            lVar.a(t(), size(), this.bytes);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        public int t() {
            return 0;
        }
    }

    static {
        b = g72.a() ? new x4c(18) : new wly0();
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

    public static ByteString g(String str) {
        return new LiteralByteString(str.getBytes(rqw.a));
    }

    public abstract byte a(int i);

    public abstract boolean equals(Object obj);

    public abstract void h(int i, byte[] bArr);

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = l(size, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public abstract byte i(int i);

    public abstract boolean j();

    public abstract eac k();

    public abstract int l(int i, int i2);

    public final int m() {
        return this.hash;
    }

    public abstract ByteString n(int i);

    public final byte[] p() {
        int size = size();
        if (size == 0) {
            return rqw.b;
        }
        byte[] bArr = new byte[size];
        h(size, bArr);
        return bArr;
    }

    public abstract String q(Charset charset);

    public final String r() {
        return size() == 0 ? "" : q(rqw.a);
    }

    public abstract void s(l lVar);

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return oyr.t(b64.u(size(), "<ByteString@", hexString, " size=", " contents=\""), size() <= 50 ? imb1.a(this) : imb1.a(n(47)).concat("..."), "\">");
    }
}
