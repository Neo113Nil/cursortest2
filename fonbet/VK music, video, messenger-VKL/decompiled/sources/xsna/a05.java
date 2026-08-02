package xsna;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.MediaUtils;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: AudioWaveExtractor.kt */
/* loaded from: classes3.dex */
public final class a05 implements w8i {
    public final b b;
    public final a c;
    public boolean d;
    public int[] e = new int[0];
    public int f;
    public int g;
    public int h;
    public final float[] i;
    public int j;
    public MediaExtractor k;
    public MediaCodec l;
    public MediaFormat m;
    public MediaUtils.AudioConfig n;
    public FileInputStream o;
    public int p;
    public byte[] q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public final MediaCodec.BufferInfo z;

    /* compiled from: AudioWaveExtractor.kt */
    public interface a {
        void a(Exception exc);

        void b(float[] fArr);

        void c(int i, float[] fArr);
    }

    /* compiled from: AudioWaveExtractor.kt */
    public static final class b {
        public final String a;
        public final int b;
        public final float c;
        public final float d;
        public final float[] e;

        public b(String str, int i, float f, float f2, float[] fArr) {
            this.a = str;
            this.b = i;
            this.c = f;
            this.d = f2;
            this.e = fArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && Float.compare(this.c, bVar.c) == 0 && Float.compare(this.d, bVar.d) == 0 && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int a = io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
            float[] fArr = this.e;
            return a + (fArr == null ? 0 : Arrays.hashCode(fArr));
        }

        public final String toString() {
            return "Request(path=" + this.a + ", requestLines=" + this.b + ", maxHeight=" + this.c + ", minHeight=" + this.d + ", initialHeights=" + Arrays.toString(this.e) + ')';
        }
    }

    public a05(b bVar, a aVar) {
        this.b = bVar;
        this.c = aVar;
        float[] fArr = bVar.e;
        this.i = fArr == null ? new float[bVar.b] : fArr;
        this.q = new byte[0];
        this.t = true;
        this.y = -1;
        this.z = new MediaCodec.BufferInfo();
    }

    public final boolean a() {
        MediaCodec mediaCodec = this.l;
        MediaUtils.AudioConfig audioConfig = this.n;
        MediaCodec.BufferInfo bufferInfo = this.z;
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100L);
        if (dequeueOutputBuffer >= 0) {
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
            int remaining = outputBuffer.remaining();
            if (this.q.length < remaining) {
                this.q = new byte[remaining];
            }
            outputBuffer.get(this.q, 0, remaining);
            outputBuffer.clear();
            this.r += remaining;
            int i = this.n.c;
            int length = this.q.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                if (this.d) {
                    throw new InterruptedException();
                }
                int i3 = this.v;
                int[] iArr = this.e;
                if (i3 == iArr.length) {
                    int[] iArr2 = new int[iArr.length + 1 + ((int) (iArr.length * 0.05d))];
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    this.e = iArr2;
                }
                int i4 = i2 * 2;
                byte[] bArr = this.q;
                int abs = Math.abs((int) ((short) ((bArr[i4 + 1] << 8) | (bArr[i4] & 255)))) + this.w;
                this.w = abs;
                int i5 = this.x + 1;
                this.x = i5;
                if (i5 == i) {
                    this.x = 0;
                    int[] iArr3 = this.e;
                    int i6 = this.v;
                    iArr3[i6] = Math.max(iArr3[i6], abs / i);
                    this.w = 0;
                    this.y++;
                }
                if (this.y == 1024) {
                    int[] iArr4 = this.e;
                    int i7 = this.v;
                    int i8 = iArr4[i7];
                    if (i8 < this.g) {
                        this.g = i8;
                    }
                    if (i8 > this.h) {
                        this.h = i8;
                    }
                    this.v = i7 + 1;
                    this.y = 0;
                    this.j++;
                }
                this.f = this.v;
                if (this.j == 100) {
                    this.j = 0;
                    e(false);
                }
            }
            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
        }
        return (bufferInfo.flags & 4) != 0 || this.r / (audioConfig.c * 2) >= this.p;
    }

    public final void b() {
        try {
            if (this.d) {
                throw new InterruptedException();
            }
            d();
            f();
            while (!this.d) {
                c();
                if (a()) {
                    e(true);
                    return;
                }
            }
            throw new InterruptedException();
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Log.e("AudioWaveExtractor", "Extracting interrupted");
            } else {
                this.c.a(e);
                e.printStackTrace();
            }
        } finally {
            g();
        }
    }

    public final void c() {
        int dequeueInputBuffer;
        MediaExtractor mediaExtractor = this.k;
        MediaCodec mediaCodec = this.l;
        if (!this.s && (dequeueInputBuffer = mediaCodec.dequeueInputBuffer(100L)) >= 0) {
            int readSampleData = mediaExtractor.readSampleData(mediaCodec.getInputBuffer(dequeueInputBuffer), 0);
            this.u = readSampleData;
            if (this.t && readSampleData == 2) {
                mediaExtractor.advance();
            } else if (readSampleData < 0) {
                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, -1L, 4);
                this.s = true;
            } else {
                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, this.u, mediaExtractor.getSampleTime(), 0);
                mediaExtractor.advance();
            }
            this.t = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        MediaFormat mediaFormat;
        String str = this.b.a;
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        this.o = fileInputStream;
        FileDescriptor fd = fileInputStream.getFD();
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.k = mediaExtractor;
        mediaExtractor.setDataSource(fd);
        int trackCount = mediaExtractor.getTrackCount();
        int i = 0;
        while (true) {
            if (i >= trackCount) {
                mediaFormat = null;
                break;
            }
            mediaFormat = mediaExtractor.getTrackFormat(i);
            String string = mediaFormat.getString("mime");
            if (string == null || !brm0.B(string, "audio/", false)) {
                mediaFormat = null;
            }
            if (mediaFormat != null) {
                mediaExtractor.selectTrack(i);
                break;
            }
            i++;
        }
        if (mediaFormat == null) {
            throw new IllegalArgumentException("No audio track found in " + str);
        }
        this.m = mediaFormat;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        p490.z(new ga3(str, 1), new jb5(ref$ObjectRef, 8));
        MediaUtils.AudioConfig audioConfig = (MediaUtils.AudioConfig) ref$ObjectRef.element;
        if (audioConfig == null) {
            throw new IllegalArgumentException("No audioConfig found in " + str);
        }
        this.p = (int) (((audioConfig.d / 1000000.0f) * audioConfig.b) + 0.5f);
        this.n = audioConfig;
        MediaCodec b2 = jq10.b(new jq10(((MediaPipelineComponent) ((k7m) m7m.f(this)).a(fpf0.a(MediaPipelineComponent.class))).Gd()), this.m, null, 6);
        b2.start();
        this.l = b2;
    }

    public final void e(boolean z) {
        float length;
        int length2;
        float f;
        Log.e("AudioWaveExtractor", "onLoaded " + z);
        float[] fArr = this.i;
        if (z) {
            length = fArr.length;
            length2 = this.f;
        } else {
            length = fArr.length;
            length2 = this.e.length;
        }
        float f2 = length / length2;
        float f3 = this.h - this.g;
        int min = Math.min(fArr.length, (int) Math.ceil(this.f * f2));
        for (int i = 0; i < min; i++) {
            int i2 = this.g;
            if (i2 == 0 && this.h == 0) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else if (i2 == 0 || i2 != this.h) {
                int[] iArr = this.e;
                f = (iArr[swe0.g((int) Math.ceil(i / f2), 0, iArr.length - 1)] - this.g) / f3;
            } else {
                f = 1.0f;
            }
            b bVar = this.b;
            float f4 = bVar.c;
            float f5 = bVar.d;
            fArr[i] = u11.b(f4, f5, f, f5);
        }
        a aVar = this.c;
        if (z) {
            aVar.b(fArr);
        } else {
            aVar.c(min, fArr);
        }
    }

    public final void f() {
        this.r = 0;
        this.s = false;
        this.t = true;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = -1;
        this.e = new int[this.p / 1024];
        this.f = 0;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.j = 0;
    }

    public final void g() {
        try {
            MediaExtractor mediaExtractor = this.k;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        MediaCodec mediaCodec = this.l;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                mediaCodec.release();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        try {
            FileInputStream fileInputStream = this.o;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (Exception unused) {
        }
    }
}
