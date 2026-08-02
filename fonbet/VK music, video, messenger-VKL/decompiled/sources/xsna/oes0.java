package xsna;

import android.content.Context;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.media.pipeline.metrics.CropRange;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import xsna.k0h0;
import xsna.zq10;

/* compiled from: VideoDecodingWrapper.kt */
/* loaded from: classes3.dex */
public final class oes0 implements AutoCloseable {
    public final Size b;
    public final int c;
    public final int d;
    public final MediaCodec e;
    public final cr10 f;
    public final MediaCodec.BufferInfo g;
    public final ImageReader h;
    public final vwi i;
    public final CropRange j;
    public final long k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public Image p;
    public long q;
    public boolean r = true;
    public long s;

    public oes0(Context context, Uri uri, CropRange cropRange, jq10 jq10Var, f100 f100Var) {
        Integer num;
        int intValue;
        MediaExtractor a = br10.a(context, uri);
        this.g = new MediaCodec.BufferInfo();
        this.j = cropRange;
        cr10 cr10Var = new cr10(0, a, br10.b(a, "video/"), uri, null, f100Var);
        this.f = cr10Var;
        if (cropRange != null) {
            cr10Var.seekTo(cropRange.b);
        } else {
            cr10Var.seekTo(0L);
        }
        MediaFormat mediaFormat = cr10Var.o;
        gr10 gr10Var = new gr10(mediaFormat);
        Integer num2 = gr10Var.g;
        if (num2 == null || (num = gr10Var.h) == null) {
            throw new IllegalStateException("Provided media source doesn't contain size info");
        }
        Integer num3 = gr10Var.i;
        int intValue2 = num3 != null ? num3.intValue() : 0;
        this.c = intValue2;
        this.b = intValue2 % 180 == 0 ? new Size(num2.intValue(), num.intValue()) : new Size(num.intValue(), num2.intValue());
        Integer num4 = gr10Var.k;
        if (num4 == null) {
            throw new IllegalStateException("Provided media source without frame rate info");
        }
        this.d = num4.intValue();
        this.k = TimeUnit.SECONDS.toMicros(1L) / num4.intValue();
        int intValue3 = num2.intValue();
        int intValue4 = num.intValue();
        Integer c = gr10Var.c("color-transfer");
        if (c != null && ((intValue = c.intValue()) == 6 || intValue == 7)) {
            throw new UnsupportedOperationException("ImageReader YUV_420_888 for HDR video is not supported");
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.i = new vwi();
        ImageReader newInstance = ImageReader.newInstance(intValue3, intValue4, 35, 2);
        this.h = newInstance;
        newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: xsna.nes0
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                vwi vwiVar = oes0.this.i;
                synchronized (vwiVar.b) {
                    if (vwiVar.a) {
                        return;
                    }
                    vwiVar.a = true;
                    vwiVar.b.notifyAll();
                }
            }
        }, handler);
        mediaFormat.setInteger("color-format", 2135033992);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 1);
        MediaCodec b = jq10.b(jq10Var, mediaFormat, newInstance.getSurface(), 4);
        b.start();
        this.e = b;
    }

    public static void m() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException("VideoDecodingWrapper decoding was interrupted");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            Image image = this.p;
            if (image != null) {
                image.close();
                this.p = null;
            }
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
        try {
            this.f.release();
            s3q0 s3q0Var2 = s3q0.a;
        } catch (Throwable unused2) {
        }
        try {
            this.e.release();
            s3q0 s3q0Var3 = s3q0.a;
        } catch (Throwable unused3) {
        }
        try {
            this.h.close();
            s3q0 s3q0Var4 = s3q0.a;
        } catch (Throwable unused4) {
        }
    }

    public final Image h(long j) throws InterruptedException {
        boolean z;
        boolean z2;
        if (!this.r) {
            this.l = this.q + this.k > j;
        }
        if (this.l) {
            return this.p;
        }
        Image image = this.p;
        if (image != null) {
            image.close();
            this.p = null;
        }
        MediaCodec mediaCodec = this.e;
        while (true) {
            z = this.o;
            if (z || this.l) {
                break;
            }
            m();
            while (!this.l && !this.o) {
                m();
                MediaCodec.BufferInfo bufferInfo = this.g;
                int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L);
                if (dequeueOutputBuffer < 0) {
                    break;
                }
                long j2 = bufferInfo.presentationTimeUs;
                CropRange cropRange = this.j;
                if (cropRange != null) {
                    if (j2 < cropRange.b) {
                        mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                        if ((bufferInfo.flags & 4) != 0) {
                            this.o = true;
                        }
                    } else if (j2 > cropRange.c) {
                        mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                        this.o = true;
                    }
                }
                if (this.r) {
                    this.s = j2;
                    this.r = false;
                }
                long j3 = j2 - this.s;
                boolean z3 = this.k + j3 > j;
                this.l = z3;
                if (z3) {
                    this.q = j3;
                }
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, z3);
                if ((bufferInfo.flags & 4) != 0) {
                    this.o = true;
                }
            }
            while (true) {
                if (!this.n) {
                    m();
                    cr10 cr10Var = this.f;
                    int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
                    if (dequeueInputBuffer >= 0) {
                        if (this.m) {
                            this.e.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                            this.n = true;
                            break;
                        }
                        ByteBuffer inputBuffer = mediaCodec.getInputBuffer(dequeueInputBuffer);
                        k0h0.b g = cr10Var.g();
                        if (g != null) {
                            zq10.b bVar = (zq10.b) g;
                            inputBuffer.put(bVar.a);
                            MediaCodec mediaCodec2 = this.e;
                            int i = bVar.c;
                            long j4 = bVar.b;
                            k0h0.a.getClass();
                            mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, i, j4, bVar.b() ? 1 : 0);
                        }
                        this.m = g == null || !cr10Var.i();
                    }
                }
            }
        }
        if (!this.l || z) {
            return null;
        }
        vwi vwiVar = this.i;
        synchronized (vwiVar.b) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j5 = 10000 + elapsedRealtime;
                if (j5 < elapsedRealtime) {
                    synchronized (vwiVar.b) {
                        while (!vwiVar.a) {
                            try {
                                vwiVar.b.wait();
                            } finally {
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                } else {
                    while (!vwiVar.a && elapsedRealtime < j5) {
                        vwiVar.b.wait(j5 - elapsedRealtime);
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z2 = vwiVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            throw new IllegalStateException("Image capture took too long");
        }
        vwi vwiVar2 = this.i;
        synchronized (vwiVar2.b) {
            vwiVar2.a = false;
        }
        Image acquireLatestImage = this.h.acquireLatestImage();
        this.p = acquireLatestImage;
        return acquireLatestImage;
    }
}
