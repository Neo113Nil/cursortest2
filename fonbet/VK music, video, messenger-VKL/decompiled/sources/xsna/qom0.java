package xsna;

import com.vk.media.recorder.impl.BufferItem;
import java.util.Arrays;

/* compiled from: StreamBuffer.java */
/* loaded from: classes3.dex */
public final class qom0 {
    public BufferItem[] a;
    public int b;
    public int c;
    public long d;
    public volatile b e;
    public volatile a f;
    public int g;
    public long h;
    public long i;
    public volatile double j;

    /* compiled from: StreamBuffer.java */
    public static class a {
        public byte[] a;
        public int b = 0;
        public int c = -1;
        public int d = -1;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c && this.d == aVar.d) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: StreamBuffer.java */
    public static class b {
        public byte[] a;
        public byte[] c;
        public int b = 0;
        public int d = 0;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.b == bVar.b && Arrays.equals(this.a, bVar.a) && this.d == bVar.d && Arrays.equals(this.c, bVar.c)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized BufferItem a(long j) {
        long j2 = this.d;
        if (j >= j2) {
            return null;
        }
        long j3 = j2 - j;
        long j4 = this.b;
        if (j3 > j4) {
            j = j2 < j4 ? 0L : j2 - j4;
        }
        return this.a[(int) (j % this.c)];
    }

    public final synchronized void b(BufferItem bufferItem) {
        try {
            if (bufferItem.f == BufferItem.FrameType.VIDEO) {
                long j = bufferItem.d / 1000;
                long j2 = this.i;
                if (j2 != -1 && j > j2) {
                    int i = this.g;
                    if (i > 0) {
                        this.g = i - 1;
                    } else {
                        long j3 = this.h;
                        this.h = j3 - (j3 / 10);
                    }
                    long j4 = (j - j2) + this.h;
                    this.h = j4;
                    if (this.g == 0) {
                        this.j = 10000.0d / j4;
                    }
                }
                this.i = j;
            }
            long j5 = this.d;
            bufferItem.b = j5;
            this.a[(int) (j5 % this.c)] = bufferItem;
            this.d = j5 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }
}
