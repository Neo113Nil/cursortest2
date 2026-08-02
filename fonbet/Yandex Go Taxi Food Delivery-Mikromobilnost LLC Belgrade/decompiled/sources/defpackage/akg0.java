package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class akg0 implements Closeable {
    public static final Logger z = Logger.getLogger(akg0.class.getName());
    public final RandomAccessFile a;
    public int b;
    public int c;
    public wjg0 w;
    public wjg0 x;
    public final byte[] y;

    public akg0(File file) {
        byte[] bArr = new byte[16];
        this.y = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    I(i, iArr[i2], bArr2);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    ny61.v("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int n = n(0, bArr);
        this.b = n;
        if (n <= randomAccessFile2.length()) {
            this.c = n(4, bArr);
            int n2 = n(8, bArr);
            int n3 = n(12, bArr);
            this.w = k(n2);
            this.x = k(n3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
    }

    public static void I(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static int n(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final int B() {
        if (this.c == 0) {
            return 16;
        }
        wjg0 wjg0Var = this.x;
        int i = wjg0Var.a;
        int i2 = this.w.a;
        return i >= i2 ? (i - i2) + 4 + wjg0Var.b + 16 : (((i + 4) + wjg0Var.b) + this.b) - i2;
    }

    public final int D(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void G(int i, int i2, int i3, int i4) {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.y;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                I(i6, iArr[i5], bArr);
                i6 += 4;
                i5++;
            }
        }
    }

    public final void a(byte[] bArr) {
        int D;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    c(length);
                    boolean e = e();
                    if (e) {
                        D = 16;
                    } else {
                        wjg0 wjg0Var = this.x;
                        D = D(wjg0Var.a + 4 + wjg0Var.b);
                    }
                    wjg0 wjg0Var2 = new wjg0(D, length);
                    I(0, length, this.y);
                    w(D, 4, this.y);
                    w(D + 4, length, bArr);
                    G(this.b, this.c + 1, e ? D : this.w.a, D);
                    this.x = wjg0Var2;
                    this.c++;
                    if (e) {
                        this.w = wjg0Var2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void c(int i) {
        int i2 = i + 4;
        int B = this.b - B();
        if (B >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            B += i3;
            i3 <<= 1;
        } while (B < i2);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        wjg0 wjg0Var = this.x;
        int D = D(wjg0Var.a + 4 + wjg0Var.b);
        if (D < this.w.a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = D - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                ny61.f("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.x.a;
        int i5 = this.w.a;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            G(i3, this.c, i5, i6);
            this.x = new wjg0(i6, this.x.b);
        } else {
            G(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final synchronized void d(yjg0 yjg0Var) {
        int i = this.w.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            wjg0 k = k(i);
            yjg0Var.a(new xjg0(this, k), k.b);
            i = D(k.a + 4 + k.b);
        }
    }

    public final synchronized boolean e() {
        return this.c == 0;
    }

    public final wjg0 k(int i) {
        if (i == 0) {
            return wjg0.c;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i);
        return new wjg0(i, randomAccessFile.readInt());
    }

    public final synchronized void o() {
        if (e()) {
            throw new NoSuchElementException();
        }
        if (this.c == 1) {
            synchronized (this) {
                G(4096, 0, 0, 0);
                this.c = 0;
                wjg0 wjg0Var = wjg0.c;
                this.w = wjg0Var;
                this.x = wjg0Var;
                if (this.b > 4096) {
                    RandomAccessFile randomAccessFile = this.a;
                    randomAccessFile.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                    randomAccessFile.getChannel().force(true);
                }
                this.b = 4096;
            }
        } else {
            wjg0 wjg0Var2 = this.w;
            int D = D(wjg0Var2.a + 4 + wjg0Var2.b);
            v(D, 0, 4, this.y);
            int n = n(0, this.y);
            G(this.b, this.c - 1, D, this.x.a);
            this.c--;
            this.w = new wjg0(D, n);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(akg0.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.w);
        sb.append(", last=");
        sb.append(this.x);
        sb.append(", element lengths=[");
        try {
            d(new ujg0(sb));
        } catch (IOException e) {
            z.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void v(int i, int i2, int i3, byte[] bArr) {
        int D = D(i);
        int i4 = D + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(D);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - D;
        randomAccessFile.seek(D);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void w(int i, int i2, byte[] bArr) {
        int D = D(i);
        int i3 = D + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i3 <= i4) {
            randomAccessFile.seek(D);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - D;
        randomAccessFile.seek(D);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }
}
