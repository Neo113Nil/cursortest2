package xsna;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: AdaptiveStreamBuffer.java */
/* loaded from: classes13.dex */
public final class fk0 {
    public static final Runtime f = Runtime.getRuntime();
    public final InputStream a;
    public byte[] b = new byte[SQLiteDatabase.OPEN_PRIVATECACHE];
    public int c = 0;
    public boolean e = true;
    public boolean d = false;

    public fk0(InputStream inputStream) {
        this.a = inputStream;
    }

    public final int a(int i) throws IOException {
        int i2 = this.c;
        int i3 = 0;
        if (i <= i2) {
            int i4 = i2 - i;
            this.c = i4;
            byte[] bArr = this.b;
            System.arraycopy(bArr, i, bArr, 0, i4);
            return i;
        }
        this.c = 0;
        while (i3 < i) {
            InputStream inputStream = this.a;
            int skip = (int) inputStream.skip(i - i3);
            if (skip > 0) {
                i3 += skip;
            } else if (skip != 0) {
                continue;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                i3++;
            }
        }
        return i3;
    }

    public final void b(int i) throws IOException {
        byte[] bArr = this.b;
        if (i > bArr.length) {
            int max = Math.max(bArr.length * 2, i);
            Runtime runtime = f;
            long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
            if (this.e && max < maxMemory) {
                try {
                    byte[] bArr2 = new byte[max];
                    System.arraycopy(this.b, 0, bArr2, 0, this.c);
                    this.b = bArr2;
                } catch (OutOfMemoryError unused) {
                    this.e = false;
                }
            }
            i = Math.min(i, this.b.length);
        }
        while (true) {
            int i2 = this.c;
            if (i2 >= i) {
                return;
            }
            int read = this.a.read(this.b, i2, i - i2);
            if (read == -1) {
                this.d = true;
                return;
            }
            this.c += read;
        }
    }
}
