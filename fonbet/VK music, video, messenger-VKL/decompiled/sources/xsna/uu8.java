package xsna;

import com.vk.dto.common.ImageSizeKey;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: CAVLCReader.java */
/* loaded from: classes13.dex */
public final class uu8 {
    public static int f;
    public final InputStream a;
    public int b;
    public int c;
    public int d;
    public final qlb e;

    public uu8(InputStream inputStream) throws IOException {
        qlb qlbVar = new qlb();
        qlbVar.a = new char[50];
        this.e = qlbVar;
        this.a = inputStream;
        this.b = inputStream.read();
        this.c = inputStream.read();
    }

    public final int a() throws IOException {
        if (this.d == 8) {
            this.b = this.c;
            this.c = this.a.read();
            this.d = 0;
            if (this.b == -1) {
                return -1;
            }
        }
        int i = this.b;
        int i2 = this.d;
        int i3 = (i >> (7 - i2)) & 1;
        this.d = i2 + 1;
        char c = i3 == 0 ? ImageSizeKey.SIZE_KEY_UNDEFINED : '1';
        qlb qlbVar = this.e;
        int i4 = qlbVar.b;
        char[] cArr = qlbVar.a;
        if (i4 < cArr.length - 1) {
            cArr[i4] = c;
            qlbVar.b = i4 + 1;
        }
        f++;
        return i3;
    }

    public final boolean b(String str) throws IOException {
        boolean z = a() != 0;
        g(str, z ? "1" : "0");
        return z;
    }

    public final long c(int i) throws IOException {
        if (i > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 1) | a();
        }
        return j;
    }

    public final long d(int i, String str) throws IOException {
        long c = c(i);
        g(str, String.valueOf(c));
        return c;
    }

    public final int e(String str) throws IOException {
        int i = 0;
        int i2 = 0;
        while (a() == 0) {
            i2++;
        }
        if (i2 > 0) {
            i = (int) (((1 << i2) - 1) + c(i2));
        }
        int i3 = i & 1;
        int i4 = ((i >> 1) + i3) * ((i3 << 1) - 1);
        g(str, String.valueOf(i4));
        return i4;
    }

    public final int f(String str) throws IOException {
        int i = 0;
        int i2 = 0;
        while (a() == 0) {
            i2++;
        }
        if (i2 > 0) {
            i = (int) (((1 << i2) - 1) + c(i2));
        }
        g(str, String.valueOf(i));
        return i;
    }

    public final void g(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = f;
        qlb qlbVar = this.e;
        String valueOf = String.valueOf(i - qlbVar.b);
        int length = 8 - valueOf.length();
        sb.append("@".concat(valueOf));
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        int length2 = (100 - sb.length()) - qlbVar.b;
        for (int i3 = 0; i3 < length2; i3++) {
            sb.append(' ');
        }
        sb.append(qlbVar);
        sb.append(" (" + str2 + ")");
        qlbVar.b = 0;
    }
}
