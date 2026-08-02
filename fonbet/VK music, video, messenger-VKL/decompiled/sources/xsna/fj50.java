package xsna;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.os.Trace;
import android.util.SparseArray;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Muxer.kt */
/* loaded from: classes3.dex */
public final class fj50 {
    public final f100 a;
    public final MediaMuxer b;
    public final SparseArray<a> c = new SparseArray<>();
    public int d = -1;
    public boolean e;
    public boolean f;

    /* compiled from: Muxer.kt */
    public final class a {
        public final int a;
        public final gr10 b;
        public int e;
        public float f;
        public long c = Long.MIN_VALUE;
        public long d = Long.MIN_VALUE;
        public int g = 300;

        public a(int i, gr10 gr10Var) {
            this.a = i;
            this.b = gr10Var;
        }

        public final long a() {
            int i = this.e;
            long j = i != 0 ? (long) (this.f / i) : 0L;
            Long valueOf = Long.valueOf(j);
            if (j <= 0) {
                valueOf = null;
            }
            if (valueOf == null) {
                return Long.MIN_VALUE;
            }
            long longValue = valueOf.longValue();
            long j2 = this.d;
            if (j2 != Long.MIN_VALUE) {
                return j2 + longValue;
            }
            throw new IllegalStateException("Muxer maxWrittenPtsMcs is UNSET");
        }

        public final void b(long j) {
            f100 f100Var;
            long j2 = this.c;
            this.c = j;
            this.d = Math.max(this.d, j);
            if (j2 != Long.MIN_VALUE && j > j2) {
                this.f += j - j2;
                this.e++;
            }
            if (j > j2 || (f100Var = fj50.this.a) == null) {
                return;
            }
            StringBuilder b = fp.b(j, "written pts=", " <= old written pts=");
            b.append(j2);
            b.append(", ");
            b.append(this);
            f100Var.w("Muxer", b.toString());
        }

        public final long c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            int i = this.a;
            fj50 fj50Var = fj50.this;
            try {
                fj50Var.b.writeSampleData(i, byteBuffer, bufferInfo);
                if ((bufferInfo.flags & 4) == 0) {
                    b(bufferInfo.presentationTimeUs);
                }
                int i2 = this.g;
                if (i2 >= 300) {
                    this.g = 0;
                    f100 f100Var = fj50Var.a;
                    if (f100Var != null) {
                        f100Var.i("Muxer", this + "|bufferSize=" + bufferInfo.size);
                    }
                } else {
                    this.g = i2 + 1;
                }
                return this.d;
            } catch (Throwable th) {
                StringBuilder a = vq.a("Failed to write sample: track=(", i, '|');
                a.append(this.b.b);
                a.append("), ");
                a.append(k3r0.b(bufferInfo));
                a.append(", isReleased=");
                a.append(fj50Var.f);
                a.append(", lastWrittenPts=");
                a.append(this.c);
                throw new IllegalStateException(a.toString(), th);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append(this.a);
            sb.append('|');
            sb.append(this.b.b);
            sb.append("|sd=");
            int i = this.e;
            sb.append(i != 0 ? (long) (this.f / i) : 0L);
            sb.append("|last/max=");
            sb.append(this.c);
            sb.append('/');
            sb.append(this.d);
            sb.append("|end=");
            sb.append(a());
            sb.append('}');
            return sb.toString();
        }
    }

    public fj50(File file, f100 f100Var) {
        this.a = f100Var;
        this.b = new MediaMuxer(file.getAbsolutePath(), 0);
    }

    @SuppressLint({"PrivateApi"})
    public final void a() {
        MediaMuxer mediaMuxer = this.b;
        if (!this.e) {
            return;
        }
        SparseArray<a> sparseArray = this.c;
        int size = sparseArray.size();
        int i = 0;
        while (true) {
            f100 f100Var = this.a;
            if (i < size) {
                a valueAt = sparseArray.valueAt(i);
                long a2 = valueAt.a();
                if (a2 != Long.MIN_VALUE) {
                    ByteBuffer order = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    bufferInfo.set(0, 0, a2, 4);
                    valueAt.c(order, bufferInfo);
                } else if (f100Var != null) {
                    f100Var.w("Muxer", "track has no sample duration: index=" + i + ", track=" + valueAt);
                }
                i++;
            } else {
                this.e = false;
                try {
                    Trace.beginSection("mediaMuxer.stop");
                    mediaMuxer.stop();
                    Trace.endSection();
                    return;
                } finally {
                }
            }
        }
    }
}
