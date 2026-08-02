package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.air;
import xsna.brm0;
import xsna.c;
import xsna.e;
import xsna.emb;
import xsna.jw5;
import xsna.lhg;
import xsna.s3q0;
import xsna.vl8;
import xsna.vu5;

/* compiled from: ByteString.kt */
/* loaded from: classes11.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final ByteString d = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    public transient int b;
    public transient String c;
    private final byte[] data;

    /* compiled from: ByteString.kt */
    public static final class a {
        public static ByteString a(String str) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (c.a(str.charAt(i2 + 1)) + (c.a(str.charAt(i2)) << 4));
            }
            return new ByteString(bArr);
        }

        public static ByteString b(String str) {
            ByteString byteString = new ByteString(str.getBytes(emb.b));
            byteString.c = str;
            return byteString;
        }

        public static ByteString c(byte[] bArr) {
            vl8.c cVar = e.a;
            int length = bArr.length;
            e.b(bArr.length, 0, length);
            return new ByteString(jw5.l(0, length, bArr));
        }
    }

    public ByteString(byte[] bArr) {
        this.data = bArr;
    }

    public static int q(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        return byteString.p(0, byteString2.r());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new IllegalArgumentException(lhg.a(readInt, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = objectInputStream.read(bArr, i, readInt - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
        ByteString byteString = new ByteString(bArr);
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public static ByteString x(ByteString byteString, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = e.b;
        }
        return byteString.w(i, i2);
    }

    public final String A() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String str2 = new String(r(), emb.b);
        this.c = str2;
        return str2;
    }

    public void B(vl8 vl8Var, int i) {
        vl8Var.write(this.data, 0, i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int n = byteString.n();
            byte[] bArr = this.data;
            if (n == bArr.length && byteString.u(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        String b;
        b = okio.a.b(this.data, okio.a.a);
        return b;
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.b = hashCode;
        return hashCode;
    }

    public String i() {
        return okio.a.b(this.data, okio.a.d());
    }

    @Override // java.lang.Comparable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ByteString byteString) {
        int n = n();
        int n2 = byteString.n();
        int min = Math.min(n, n2);
        for (int i = 0; i < min; i++) {
            int s = s(i) & 255;
            int s2 = byteString.s(i) & 255;
            if (s != s2) {
                return s < s2 ? -1 : 1;
            }
        }
        if (n == n2) {
            return 0;
        }
        return n < n2 ? -1 : 1;
    }

    public void k(int i, int i2, int i3, byte[] bArr) {
        jw5.f(this.data, i2, i, bArr, i3 + i);
    }

    public ByteString l(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, n());
        return new ByteString(messageDigest.digest());
    }

    public final byte[] m() {
        return this.data;
    }

    public int n() {
        return this.data.length;
    }

    public String o() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = c.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & AmfConstants.TYPE_XML_DOCUMENT_MARKER];
        }
        return new String(cArr);
    }

    public int p(int i, byte[] bArr) {
        int length = this.data.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!e.a(this.data, max, 0, bArr, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public byte[] r() {
        return this.data;
    }

    public byte s(int i) {
        return this.data[i];
    }

    public int t(int i, byte[] bArr) {
        if (i == e.b) {
            i = n();
        }
        for (int min = Math.min(i, this.data.length - bArr.length); -1 < min; min--) {
            if (e.a(this.data, min, 0, bArr, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00f8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0138, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00d8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0177, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x017e, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0170, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01b6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0144, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01b9, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0100, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            s3q0 s3q0Var = s3q0.a;
                            i2 += 2;
                            i4 = i;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << AmfConstants.TYPE_LONG_STRING_MARKER);
                            if (i9 >= 2048) {
                                if (55296 > i9 || i9 >= 57344) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    s3q0 s3q0Var2 = s3q0.a;
                                    i2 += 3;
                                    i4 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << AmfConstants.TYPE_LONG_STRING_MARKER)) ^ (b2 << 18);
                                if (i11 <= 1114111) {
                                    if (55296 > i11 || i11 >= 57344) {
                                        if (i11 >= 65536) {
                                            i = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                                break;
                                            }
                                            i3 += i11 < 65536 ? 1 : 2;
                                            s3q0 s3q0Var3 = s3q0.a;
                                            i2 += 4;
                                            i4 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 != -1) {
            String A = A();
            String y = brm0.y(brm0.y(brm0.y(A.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= A.length()) {
                return air.b(']', "[text=", y);
            }
            return "[size=" + this.data.length + " text=" + y + "…]";
        }
        if (this.data.length <= 64) {
            return "[hex=" + o() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(this.data.length);
        sb.append(" hex=");
        int n = 64 == e.b ? n() : 64;
        byte[] bArr2 = this.data;
        if (n > bArr2.length) {
            throw new IllegalArgumentException(vu5.b(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        if (n < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb.append((n == bArr2.length ? this : new ByteString(jw5.l(0, n, bArr2))).o());
        sb.append("…]");
        return sb.toString();
    }

    public boolean u(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.data;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && e.a(bArr2, i, i2, bArr, i3);
    }

    public boolean v(int i, ByteString byteString, int i2) {
        return byteString.u(0, i, i2, this.data);
    }

    public ByteString w(int i, int i2) {
        if (i2 == e.b) {
            i2 = n();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.data;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException(vu5.b(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new ByteString(jw5.l(i, i2, bArr));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public ByteString y() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
            i++;
        }
    }

    public byte[] z() {
        byte[] bArr = this.data;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
