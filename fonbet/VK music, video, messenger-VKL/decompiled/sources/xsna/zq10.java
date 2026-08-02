package xsna;

import android.media.MediaExtractor;
import android.net.Uri;
import com.ironsource.X3;
import com.vk.media.pipeline.PipelineException;
import com.vk.media.pipeline.mediasource.MediaExtractorException;
import com.vk.media.pipeline.utils.exception.MediaTrackException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.k0h0;

/* compiled from: MediaExtractorTrackSource.kt */
/* loaded from: classes3.dex */
public abstract class zq10 implements k0h0 {
    public final Uri b;
    public final int c;
    public final f100 d;
    public final MediaExtractor e;
    public final ejp0 f;
    public final String g;
    public final gr10 i;
    public final boolean j;
    public b l;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final Object k = msy.a(LazyThreadSafetyMode.NONE, new nuv(this, 7));

    /* compiled from: MediaExtractorTrackSource.kt */
    public final class a {
        public final long a;
        public final long b;
        public Long c;
        public Long d;
        public final /* synthetic */ zq10 e;

        public a(zq10 zq10Var) {
            Pair pair;
            long j;
            String str = zq10Var.g;
            f100 f100Var = zq10Var.d;
            gr10 gr10Var = zq10Var.i;
            int i = zq10Var.c;
            MediaExtractor mediaExtractor = zq10Var.e;
            this.e = zq10Var;
            try {
                mediaExtractor.selectTrack(i);
                long sampleTime = mediaExtractor.getSampleTime();
                if (gr10Var.c && mediaExtractor.advance()) {
                    long sampleTime2 = mediaExtractor.getSampleTime();
                    if (sampleTime2 >= sampleTime) {
                        pair = new Pair(Long.valueOf(sampleTime), Long.valueOf(sampleTime));
                    } else {
                        Long h = gr10Var.h();
                        if (h == null && (h = gr10Var.d()) == null) {
                            long sampleTime3 = mediaExtractor.getSampleTime();
                            long j2 = 0;
                            int i2 = 0;
                            while (i2 < 10 && mediaExtractor.advance()) {
                                long sampleTime4 = mediaExtractor.getSampleTime();
                                if (sampleTime4 >= sampleTime3) {
                                    i2++;
                                    j2 = (sampleTime4 - sampleTime3) + j2;
                                }
                                sampleTime3 = sampleTime4;
                            }
                            j = i2 > 0 ? (long) (j2 / i2) : 0L;
                        } else {
                            j = h.longValue();
                        }
                        mediaExtractor.seekTo(sampleTime, 0);
                        pair = new Pair(Long.valueOf(sampleTime), Long.valueOf(sampleTime2 - j));
                    }
                } else {
                    pair = new Pair(Long.valueOf(sampleTime), Long.valueOf(sampleTime));
                }
                long longValue = ((Number) pair.i()).longValue();
                this.a = longValue;
                long longValue2 = ((Number) pair.j()).longValue();
                this.b = longValue2;
                b();
                if (longValue != longValue2 && f100Var != null) {
                    StringBuilder b = fp.b(longValue2, "min ", " != first ");
                    b.append(longValue);
                    b.append(", track(");
                    b.append(i);
                    b.append(", ");
                    b.append(gr10Var);
                    b.append("), ");
                    b.append(zq10Var.b);
                    f100Var.w(str, b.toString());
                }
                if (f100Var != null) {
                    f100Var.d(str, "layout created");
                }
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to select track", th);
            }
        }

        public final long a() {
            f100 f100Var;
            zq10 zq10Var = this.e;
            long sampleTime = zq10Var.e.getSampleTime();
            Long l = this.c;
            long j = this.a;
            long j2 = this.b;
            if (sampleTime == j) {
                sampleTime = j2;
            }
            if ((sampleTime < j2 || (l != null && l.longValue() < sampleTime)) && (f100Var = zq10Var.d) != null) {
                String str = zq10Var.g;
                StringBuilder b = fp.b(sampleTime, "pts=", ", [");
                b.append(j2);
                b.append('/');
                b.append(j);
                b.append(", ");
                b.append(l);
                b.append('/');
                f100Var.a(str, new IllegalStateException(iq.b(b, this.d, ']')));
            }
            return sampleTime - j2;
        }

        public final void b() {
            f100 f100Var;
            zq10 zq10Var = this.e;
            MediaExtractor mediaExtractor = zq10Var.e;
            int i = zq10Var.c;
            mediaExtractor.unselectTrack(i);
            mediaExtractor.selectTrack(i);
            long sampleTime = mediaExtractor.getSampleTime();
            long j = this.a;
            if (sampleTime == j || (f100Var = zq10Var.d) == null) {
                return;
            }
            StringBuilder sb = new StringBuilder("pts=");
            sb.append(mediaExtractor.getSampleTime());
            sb.append(" after rewind, exp=");
            sb.append(j);
            sb.append(", ");
            f100Var.a("TrackMediaExtractorSource", new IllegalStateException(alb0.b(sb, zq10Var.b, ')')));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(X3.j.d);
            sb.append(this.b);
            sb.append('/');
            sb.append(this.a);
            sb.append(", ");
            sb.append(this.c);
            sb.append('/');
            return iq.b(sb, this.d, ']');
        }
    }

    /* compiled from: MediaExtractorTrackSource.kt */
    public static final class b implements k0h0.b {
        public final ByteBuffer a;
        public long b = 0;
        public int c = 0;
        public int d = 0;

        public b(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // xsna.k0h0.b
        public final long a() {
            return this.b;
        }

        @Override // xsna.k0h0.b
        public final boolean b() {
            return (this.d & 1) != 0;
        }

        @Override // xsna.k0h0.b
        public final boolean c() {
            return false;
        }

        @Override // xsna.k0h0.b
        public final ByteBuffer getData() {
            return this.a;
        }

        @Override // xsna.k0h0.b
        public final int getFlags() {
            return this.d;
        }

        @Override // xsna.k0h0.b
        public final int getSize() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{sz=");
            sb.append(this.c);
            sb.append("|pos=");
            sb.append(this.b);
            sb.append("");
            sb.append("|f=");
            int i = this.d;
            StringBuilder sb2 = new StringBuilder(X3.j.d);
            if ((i & 1) != 0) {
                sb2.append("kf");
            }
            if ((i & 4) != 0) {
                sb2.append("pf");
            }
            if ((i & 2) != 0) {
                sb2.append(sb2.length() > 1 ? ",enc" : "enc");
            }
            sb2.append(']');
            sb.append(sb2.toString());
            return sb.toString();
        }
    }

    public zq10(Uri uri, int i, f100 f100Var, MediaExtractor mediaExtractor, ejp0 ejp0Var, String str) {
        this.b = uri;
        this.c = i;
        this.d = f100Var;
        this.e = mediaExtractor;
        this.f = ejp0Var;
        this.g = str;
        if (i < 0 || i >= mediaExtractor.getTrackCount()) {
            throw new IllegalArgumentException(lhg.a(i, "Wrong track: ").toString());
        }
        if (mediaExtractor.getSampleTrackIndex() != -1) {
            throw new IllegalArgumentException("Wrong extractor state");
        }
        try {
            gr10 gr10Var = new gr10(mediaExtractor.getTrackFormat(i));
            this.i = gr10Var;
            this.j = gr10Var.c;
        } catch (Throwable th) {
            throw new MediaTrackException("Failed to construct MediaExtractorTrackSource", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00a6  */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.k0h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(long j, long j2) {
        long j3;
        long j4;
        Long valueOf;
        if (this.h.get()) {
            return false;
        }
        a aVar = (a) this.k.getValue();
        zq10 zq10Var = aVar.e;
        MediaExtractor mediaExtractor = zq10Var.e;
        f100 f100Var = zq10Var.d;
        gr10 gr10Var = zq10Var.i;
        long j5 = aVar.a;
        if (0 > j) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "Wrong min position=").toString());
        }
        if (j > j2) {
            throw new IllegalArgumentException(defpackage.k0.a(j2, "Wrong max position=").toString());
        }
        if (aVar.c == null || aVar.d == null) {
            long currentTimeMillis = System.currentTimeMillis();
            String str = zq10Var.g;
            Long l = gr10Var.q;
            if (l != null) {
                long longValue = l.longValue();
                int i = zq10Var.c;
                Uri uri = zq10Var.b;
                mediaExtractor.seekTo(aVar.b + longValue, 0);
                j3 = mediaExtractor.getSampleTime();
                if (j3 != -1) {
                    if (f100Var != null) {
                        f100Var.d(str, j3 + "=seekTo(d=" + longValue + ", PREV), " + uri);
                    }
                    j4 = Math.max(j5, j3);
                    while (mediaExtractor.advance()) {
                        long sampleTime = mediaExtractor.getSampleTime();
                        if (sampleTime == -1) {
                            break;
                        }
                        j4 = Math.max(j4, sampleTime);
                        j3 = sampleTime;
                    }
                    if (j5 <= j3 || j3 > j4) {
                        StringBuilder b2 = fp.b(j5, "Wrong range=[", ", ");
                        b2.append(j4);
                        b2.append('/');
                        b2.append(j3);
                        b2.append(']');
                        throw new IllegalStateException(b2.toString().toString());
                    }
                    if (f100Var != null) {
                        f100Var.d(str, "seek to last pts took " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                    }
                    aVar.d = Long.valueOf(j3);
                    aVar.c = Long.valueOf(j4);
                    aVar.b();
                } else {
                    if (f100Var != null) {
                        f100Var.e(str, "-1=seekTo(d=" + longValue + ", PREV), " + uri);
                    }
                    mediaExtractor.unselectTrack(i);
                    mediaExtractor.selectTrack(i);
                }
            }
            j3 = j5;
            j4 = j3;
            while (mediaExtractor.advance()) {
            }
            if (j5 <= j3) {
            }
            StringBuilder b22 = fp.b(j5, "Wrong range=[", ", ");
            b22.append(j4);
            b22.append('/');
            b22.append(j3);
            b22.append(']');
            throw new IllegalStateException(b22.toString().toString());
        }
        long max = Math.max(j5, j + j5);
        Long l2 = aVar.c;
        long min = Math.min(max, l2 != null ? l2.longValue() : Long.MAX_VALUE);
        Long l3 = aVar.c;
        long max2 = Math.max(j5, Math.min(l3 != null ? l3.longValue() : Long.MAX_VALUE, j5 + j2));
        if (gr10Var.c) {
            Long h = gr10Var.h();
            long longValue2 = h != null ? h.longValue() : 0L;
            Long d = gr10Var.d();
            valueOf = Long.valueOf(Math.max(longValue2, d != null ? d.longValue() : 0L));
        } else if (((Boolean) gr10Var.f.getValue()).booleanValue()) {
            valueOf = gr10Var.a();
        } else {
            if (!((Boolean) gr10Var.e.getValue()).booleanValue() && f100Var != null) {
                f100Var.e("TrackMediaExtractorSource", "Calculating frame duration for not raw mime-type: " + gr10Var.b);
            }
            long sampleTime2 = mediaExtractor.getSampleTime();
            long j6 = sampleTime2;
            int i2 = 0;
            long j7 = 0;
            while (i2 < 10 && mediaExtractor.advance()) {
                long sampleTime3 = mediaExtractor.getSampleTime();
                if (sampleTime3 >= j6) {
                    i2++;
                    j7 += sampleTime3 - j6;
                }
                j6 = sampleTime3;
            }
            mediaExtractor.seekTo(sampleTime2, 0);
            valueOf = Long.valueOf(i2 > 0 ? (long) (j7 / i2) : 0L);
        }
        long longValue3 = valueOf != null ? valueOf.longValue() : 0L;
        if (Math.abs(min - j5) > longValue3) {
            return true;
        }
        Long l4 = aVar.c;
        return Math.abs(max2 - (l4 != null ? l4.longValue() : Long.MAX_VALUE)) > longValue3;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.k0h0
    public k0h0.b g() {
        MediaExtractor mediaExtractor = this.e;
        AtomicBoolean atomicBoolean = this.h;
        if (atomicBoolean.get()) {
            return null;
        }
        try {
            int sampleSize = (int) mediaExtractor.getSampleSize();
            if (sampleSize <= 0) {
                return null;
            }
            b bVar = this.l;
            if (bVar == null || sampleSize > bVar.a.capacity()) {
                bVar = new b(ByteBuffer.allocateDirect(sampleSize));
                this.l = bVar;
            }
            ByteBuffer byteBuffer = bVar.a;
            int readSampleData = mediaExtractor.readSampleData(byteBuffer, 0);
            bVar.c = readSampleData;
            if (readSampleData == -1) {
                return null;
            }
            ejp0 ejp0Var = this.f;
            if (ejp0Var != null) {
                long j = readSampleData;
                if (this.j) {
                    ejp0Var.b += j;
                } else {
                    ejp0Var.c += j;
                }
                ejp0Var.a += j;
            }
            bVar.b = ((a) this.k.getValue()).a();
            bVar.d = mediaExtractor.getSampleFlags();
            byteBuffer.rewind();
            return bVar;
        } catch (Throwable th) {
            throw new PipelineException("readSample failed, isReleased=" + atomicBoolean, th);
        }
    }

    @Override // xsna.k0h0
    public boolean i() {
        AtomicBoolean atomicBoolean = this.h;
        if (atomicBoolean.get()) {
            return false;
        }
        try {
            return this.e.advance();
        } catch (Throwable th) {
            throw new PipelineException("advance failed, isReleased=" + atomicBoolean, th);
        }
    }

    @Override // xsna.k0h0
    public final void release() {
        if (this.h.compareAndSet(false, true)) {
            try {
                this.e.release();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
        } else {
            f100 f100Var = this.d;
            if (f100Var != null) {
                f100Var.a("TrackMediaExtractorSource", new IllegalStateException("release called twice, " + this));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.k0h0
    public void seekTo(long j) {
        String str;
        int i;
        if (this.h.get()) {
            return;
        }
        a aVar = (a) this.k.getValue();
        zq10 zq10Var = aVar.e;
        f100 f100Var = zq10Var.d;
        long j2 = aVar.b;
        long j3 = j + j2;
        if (j3 < 0) {
            if (f100Var != null) {
                f100Var.i("TrackMediaExtractorSource", efz.b(j2, "mcs), rewind.", fp.b(j, "Negative pts seeking(required=", "mcs|minPtsMcs=")));
            }
            aVar.b();
        }
        MediaExtractor mediaExtractor = zq10Var.e;
        mediaExtractor.seekTo(j3, 0);
        int sampleFlags = mediaExtractor.getSampleFlags();
        if (sampleFlags < 0 || (sampleFlags & 1) != 1) {
            if (f100Var != null) {
                i = 1;
                StringBuilder b2 = fp.b(j, "extractor failed to seek to sync frame, seekingPts=", ", minPtsMcs=");
                b2.append(j2);
                b2.append(", seekedPts=");
                b2.append(mediaExtractor.getSampleTime());
                str = "TrackMediaExtractorSource";
                f100Var.c(str, new MediaExtractorException(b2.toString()));
            } else {
                str = "TrackMediaExtractorSource";
                i = 1;
            }
            aVar.b();
            mediaExtractor.seekTo(j3, 0);
            if ((mediaExtractor.getSampleFlags() & 1) == i || f100Var == null) {
                return;
            }
            StringBuilder b3 = fp.b(j, "extractor can't sync to sync frame, seekingPts=", ", minPtsMcs=");
            b3.append(j2);
            b3.append(", seekedPts=");
            b3.append(mediaExtractor.getSampleTime());
            f100Var.b(new MediaExtractorException(b3.toString()), str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackMediaExtractorSource[");
        sb.append(this.c);
        gr10 gr10Var = this.i;
        sb.append(gr10Var.c ? "|v" : gr10Var.d ? "|a" : "?");
        sb.append('|');
        sb.append((a) this.k.getValue());
        sb.append('|');
        sb.append(this.b);
        sb.append('|');
        sb.append(gr10Var);
        sb.append(']');
        return sb.toString();
    }
}
