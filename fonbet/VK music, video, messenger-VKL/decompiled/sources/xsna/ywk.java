package xsna;

import com.ironsource.X3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import one.video.streaming.oktp.TransportWriter;

/* compiled from: DatagramWriter.java */
/* loaded from: classes8.dex */
public final class ywk implements lhx {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ ywk(int i) {
        this.a = i;
    }

    @Override // xsna.lhx
    public void a(char c) {
        f(this.b, 1);
        char[] cArr = (char[]) this.c;
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }

    @Override // xsna.lhx
    public void b(String str) {
        int i;
        f(this.b, str.length() + 2);
        char[] cArr = (char[]) this.c;
        int i2 = this.b;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = jqm0.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    f(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = jqm0.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) this.c)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = jqm0.a[charAt];
                                f(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.c, i5);
                                int length3 = str2.length() + i5;
                                this.b = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) this.c;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                this.b = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) this.c)[i5] = charAt;
                    }
                    i5 = i;
                }
                f(i5, 1);
                ((char[]) this.c)[i5] = '\"';
                this.b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        this.b = i4 + 1;
    }

    @Override // xsna.lhx
    public void c(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public void d(long j) {
        if (e(j)) {
            return;
        }
        int i = this.b;
        long[] jArr = (long[]) this.c;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            this.c = jArr;
        }
        jArr[i] = j;
        if (i >= this.b) {
            this.b = i + 1;
        }
    }

    public boolean e(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.c)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void f(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public void g(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.c)[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public boolean h(TransportWriter transportWriter, ByteBuffer byteBuffer, int i, boolean z, boolean z2, boolean z3) throws IOException {
        int position = byteBuffer.position();
        byteBuffer.remaining();
        vm9 vm9Var = (vm9) this.c;
        int i2 = this.b;
        int position2 = byteBuffer.position();
        byteBuffer.put((byte) 30);
        byteBuffer.put(new byte[4]);
        if (10 != i) {
            throw new IllegalStateException(lhg.a(i, "Unexpected reserved bytes count, exp=10 reserved="));
        }
        byte b = z ? (byte) 1 : (byte) 0;
        if (z2) {
            b = (byte) (b | 2);
        }
        byteBuffer.put(b);
        byteBuffer.putInt(i2);
        byteBuffer.position(position2);
        byteBuffer.position(position);
        byteBuffer.remaining();
        transportWriter.setEncryptionKey((byte[]) vm9Var.c);
        if (ne7.y(0, "OKTP")) {
            StringBuilder sb = new StringBuilder("Client -> Server: ");
            sb.append(X3.j.d + byteBuffer.limit() + "] ");
            sb.append(r490.g(byteBuffer));
            sb.append("");
            ne7.m("OKTP", sb.toString());
        }
        return transportWriter.writeDatagram(byteBuffer, z3, false);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    @Override // xsna.lhx
    public void writeLong(long j) {
        c(String.valueOf(j));
    }

    public ywk() {
        this.a = 0;
        this.c = new vm9(2);
    }
}
