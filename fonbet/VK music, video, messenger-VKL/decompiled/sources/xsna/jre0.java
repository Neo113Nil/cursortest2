package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.ironsource.X3;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: QueueFile.java */
/* loaded from: classes.dex */
public final class jre0 implements Closeable {
    public static final Logger h = Logger.getLogger(jre0.class.getName());
    public final RandomAccessFile b;
    public int c;
    public int d;
    public b e;
    public b f;
    public final byte[] g;

    /* compiled from: QueueFile.java */
    /* loaded from: classes13.dex */
    public class a implements d {
        public boolean a = true;
        public final /* synthetic */ StringBuilder b;

        public a(StringBuilder sb) {
            this.b = sb;
        }

        @Override // xsna.jre0.d
        public final void a(c cVar, int i) throws IOException {
            boolean z = this.a;
            StringBuilder sb = this.b;
            if (z) {
                this.a = false;
            } else {
                sb.append(", ");
            }
            sb.append(i);
        }
    }

    /* compiled from: QueueFile.java */
    public static class b {
        public static final b c = new b(0, 0);
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.a);
            sb.append(", length = ");
            return h5s.c(this.b, X3.j.e, sb);
        }
    }

    /* compiled from: QueueFile.java */
    /* loaded from: classes13.dex */
    public interface d {
        void a(c cVar, int i) throws IOException;
    }

    public jre0(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.g = bArr;
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
                    w(i, iArr[i2], bArr2);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.b = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int o = o(0, bArr);
        this.c = o;
        if (o > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.c + ", Actual length: " + randomAccessFile2.length());
        }
        this.d = o(4, bArr);
        int o2 = o(8, bArr);
        int o3 = o(12, bArr);
        this.e = n(o2);
        this.f = n(o3);
    }

    public static int o(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void w(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final void b(byte[] bArr) throws IOException {
        int t;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    c(length);
                    boolean m = m();
                    if (m) {
                        t = 16;
                    } else {
                        b bVar = this.f;
                        t = t(bVar.a + 4 + bVar.b);
                    }
                    b bVar2 = new b(t, length);
                    w(0, length, this.g);
                    r(t, 4, this.g);
                    r(t + 4, length, bArr);
                    v(this.c, this.d + 1, m ? t : this.e.a, t);
                    this.f = bVar2;
                    this.d++;
                    if (m) {
                        this.e = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void c(int i) throws IOException {
        int i2 = i + 4;
        int s = this.c - s();
        if (s >= i2) {
            return;
        }
        int i3 = this.c;
        do {
            s += i3;
            i3 <<= 1;
        } while (s < i2);
        RandomAccessFile randomAccessFile = this.b;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        b bVar = this.f;
        int t = t(bVar.a + 4 + bVar.b);
        if (t < this.e.a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.c);
            long j = t - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f.a;
        int i5 = this.e.a;
        if (i4 < i5) {
            int i6 = (this.c + i4) - 16;
            v(i3, this.d, i5, i6);
            this.f = new b(i6, this.f.b);
        } else {
            v(i3, this.d, i5, i4);
        }
        this.c = i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.b.close();
    }

    public final synchronized void h(d dVar) throws IOException {
        int i = this.e.a;
        for (int i2 = 0; i2 < this.d; i2++) {
            b n = n(i);
            dVar.a(new c(n), n.b);
            i = t(n.a + 4 + n.b);
        }
    }

    public final synchronized boolean m() {
        return this.d == 0;
    }

    public final b n(int i) throws IOException {
        if (i == 0) {
            return b.c;
        }
        RandomAccessFile randomAccessFile = this.b;
        randomAccessFile.seek(i);
        return new b(i, randomAccessFile.readInt());
    }

    public final synchronized void p() throws IOException {
        if (m()) {
            throw new NoSuchElementException();
        }
        if (this.d == 1) {
            synchronized (this) {
                v(4096, 0, 0, 0);
                this.d = 0;
                b bVar = b.c;
                this.e = bVar;
                this.f = bVar;
                if (this.c > 4096) {
                    RandomAccessFile randomAccessFile = this.b;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.c = 4096;
            }
        } else {
            b bVar2 = this.e;
            int t = t(bVar2.a + 4 + bVar2.b);
            q(t, 0, 4, this.g);
            int o = o(0, this.g);
            v(this.c, this.d - 1, t, this.f.a);
            this.d--;
            this.e = new b(t, o);
        }
    }

    public final void q(int i, int i2, int i3, byte[] bArr) throws IOException {
        int t = t(i);
        int i4 = t + i3;
        int i5 = this.c;
        RandomAccessFile randomAccessFile = this.b;
        if (i4 <= i5) {
            randomAccessFile.seek(t);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - t;
        randomAccessFile.seek(t);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void r(int i, int i2, byte[] bArr) throws IOException {
        int t = t(i);
        int i3 = t + i2;
        int i4 = this.c;
        RandomAccessFile randomAccessFile = this.b;
        if (i3 <= i4) {
            randomAccessFile.seek(t);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - t;
        randomAccessFile.seek(t);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int s() {
        if (this.d == 0) {
            return 16;
        }
        b bVar = this.f;
        int i = bVar.a;
        int i2 = this.e.a;
        return i >= i2 ? (i - i2) + 4 + bVar.b + 16 : (((i + 4) + bVar.b) + this.c) - i2;
    }

    public final int t(int i) {
        int i2 = this.c;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(jre0.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.d);
        sb.append(", first=");
        sb.append(this.e);
        sb.append(", last=");
        sb.append(this.f);
        sb.append(", element lengths=[");
        try {
            h(new a(sb));
        } catch (IOException e) {
            h.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void v(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.g;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.b;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                w(i6, iArr[i5], bArr);
                i6 += 4;
                i5++;
            }
        }
    }

    /* compiled from: QueueFile.java */
    /* loaded from: classes13.dex */
    public final class c extends InputStream {
        public int b;
        public int c;

        public c(b bVar) {
            this.b = jre0.this.t(bVar.a + 4);
            this.c = bVar.b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.c;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            int i4 = this.b;
            jre0 jre0Var = jre0.this;
            jre0Var.q(i4, i, i2, bArr);
            this.b = jre0Var.t(this.b + i2);
            this.c -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.c == 0) {
                return -1;
            }
            jre0 jre0Var = jre0.this;
            jre0Var.b.seek(this.b);
            int read = jre0Var.b.read();
            this.b = jre0Var.t(this.b + 1);
            this.c--;
            return read;
        }
    }
}
