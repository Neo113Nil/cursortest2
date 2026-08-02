package okhttp3.internal.publicsuffix;

import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.drm0;
import xsna.dsu;
import xsna.e8f0;
import xsna.epx;
import xsna.fta0;
import xsna.i5g;
import xsna.j5g;
import xsna.mq9;
import xsna.rli0;
import xsna.s3q0;
import xsna.x2r0;

/* compiled from: PublicSuffixDatabase.kt */
/* loaded from: classes8.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List<String> f = Collections.singletonList("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    /* compiled from: PublicSuffixDatabase.kt */
    public static final class a {
        public static final String a(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            byte[] bArr3 = PublicSuffixDatabase.e;
            int length = bArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = (i5 + length) / 2;
                while (i6 > -1 && bArr[i6] != 10) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i2 = i7 + i8;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i8++;
                }
                int i9 = i2 - i7;
                int i10 = i;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte b = bArr2[i10][i11];
                        byte[] bArr4 = x2r0.a;
                        int i13 = b & 255;
                        z = z2;
                        i3 = i13;
                    }
                    byte b2 = bArr[i7 + i12];
                    byte[] bArr5 = x2r0.a;
                    i4 = i3 - (b2 & 255);
                    if (i4 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i14 = i9 - i12;
                        int length2 = bArr2[i10].length - i11;
                        int length3 = bArr2.length;
                        for (int i15 = i10 + 1; i15 < length3; i15++) {
                            length2 += bArr2[i15].length;
                        }
                        if (length2 >= i14) {
                            if (length2 <= i14) {
                                return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                            }
                        }
                    }
                    i5 = i2 + 1;
                }
                length = i6;
            }
            return null;
        }
    }

    public static List c(String str) {
        List b0 = drm0.b0(str, new char[]{JwtParser.SEPARATOR_CHAR}, 0, 6);
        return epx.f(j5g.i0(b0), "") ? j5g.T(1, b0) : b0;
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        List<String> b0;
        int size;
        int size2;
        List c = c(IDN.toUnicode(str));
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        fta0 fta0Var = fta0.a;
                        fta0.a.getClass();
                        fta0.i(5, "Failed to read public suffix list", e2);
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = c.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            bArr[i] = ((String) c.get(i)).getBytes(StandardCharsets.UTF_8);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                bArr2 = null;
            }
            str2 = a.a(bArr2, bArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = e;
                byte[] bArr4 = this.c;
                if (bArr4 == null) {
                    bArr4 = null;
                }
                str3 = a.a(bArr4, bArr3, i3);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                byte[] bArr5 = this.d;
                if (bArr5 == null) {
                    bArr5 = null;
                }
                str4 = a.a(bArr5, bArr, i5);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            b0 = drm0.b0("!".concat(str4), new char[]{JwtParser.SEPARATOR_CHAR}, 0, 6);
        } else if (str2 == null && str3 == null) {
            b0 = f;
        } else {
            List<String> b02 = str2 != null ? drm0.b0(str2, new char[]{JwtParser.SEPARATOR_CHAR}, 0, 6) : EmptyList.b;
            b0 = str3 != null ? drm0.b0(str3, new char[]{JwtParser.SEPARATOR_CHAR}, 0, 6) : EmptyList.b;
            if (b02.size() > b0.size()) {
                b0 = b02;
            }
        }
        if (c.size() == b0.size() && b0.get(0).charAt(0) != '!') {
            return null;
        }
        if (b0.get(0).charAt(0) == '!') {
            size = c.size();
            size2 = b0.size();
        } else {
            size = c.size();
            size2 = b0.size() + 1;
        }
        return rli0.r(rli0.i(new i5g(c(str)), size - size2), ".", null, 62);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    public final void b() throws IOException {
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                e8f0 e8f0Var = new e8f0(new dsu(mq9.d(resourceAsStream)));
                try {
                    long readInt = e8f0Var.readInt();
                    e8f0Var.G2(readInt);
                    ref$ObjectRef.element = e8f0Var.c.v(readInt);
                    long readInt2 = e8f0Var.readInt();
                    e8f0Var.G2(readInt2);
                    ref$ObjectRef2.element = e8f0Var.c.v(readInt2);
                    s3q0 s3q0Var = s3q0.a;
                    e8f0Var.close();
                    synchronized (this) {
                        this.c = (byte[]) ref$ObjectRef.element;
                        this.d = (byte[]) ref$ObjectRef2.element;
                    }
                } finally {
                }
            }
        } finally {
            this.b.countDown();
        }
    }
}
