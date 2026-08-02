package xsna;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.cc7;

/* compiled from: ImageRenderer.java */
/* loaded from: classes12.dex */
public final class jlw extends androidx.media3.exoplayer.a {
    public long A;
    public int B;
    public int C;

    @Nullable
    public androidx.media3.common.a D;

    @Nullable
    public cc7 E;

    @Nullable
    public DecoderInputBuffer F;
    public ImageOutput G;

    @Nullable
    public Bitmap H;
    public boolean I;

    @Nullable
    public b J;

    @Nullable
    public b K;
    public int L;
    public boolean M;
    public final cc7.a t;
    public final DecoderInputBuffer u;
    public final ArrayDeque<a> v;
    public boolean w;
    public boolean x;
    public a y;
    public long z;

    /* compiled from: ImageRenderer.java */
    public static final class a {
        public static final a c = new a(C.TIME_UNSET, C.TIME_UNSET);
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* compiled from: ImageRenderer.java */
    public static class b {
        public final int a;
        public final long b;
        public Bitmap c;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public jlw(cc7.a aVar) {
        super(4);
        this.t = aVar;
        this.G = ImageOutput.a;
        this.u = new DecoderInputBuffer(0);
        this.y = a.c;
        this.v = new ArrayDeque<>();
        this.A = C.TIME_UNSET;
        this.z = C.TIME_UNSET;
        this.B = 0;
        this.C = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0142, code lost:
    
        if (r14 == ((r0 * r1.M) - 1)) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(long j) throws ImageDecoderException, ExoPlaybackException {
        boolean z;
        Bitmap bitmap;
        Bitmap bitmap2 = this.H;
        if ((bitmap2 == null || this.J != null) && (this.C != 0 || this.i == 2)) {
            ArrayDeque<a> arrayDeque = this.v;
            if (bitmap2 == null) {
                this.E.getClass();
                mkw dequeueOutputBuffer = this.E.dequeueOutputBuffer();
                if (dequeueOutputBuffer != null) {
                    if (!dequeueOutputBuffer.b(4)) {
                        fxc0.t(dequeueOutputBuffer.e, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.H = dequeueOutputBuffer.e;
                        dequeueOutputBuffer.h();
                    } else {
                        if (this.B == 3) {
                            F();
                            this.D.getClass();
                            E();
                            return false;
                        }
                        dequeueOutputBuffer.h();
                        if (arrayDeque.isEmpty()) {
                            this.x = true;
                            return false;
                        }
                    }
                }
            }
            if (this.I && this.H != null && this.J != null) {
                this.D.getClass();
                androidx.media3.common.a aVar = this.D;
                int i = aVar.M;
                int i2 = aVar.N;
                boolean z2 = ((i == 1 && i2 == 1) || i == -1 || i2 == -1) ? false : true;
                b bVar = this.J;
                if (bVar.c == null) {
                    if (z2) {
                        int i3 = bVar.a;
                        this.H.getClass();
                        int width = this.H.getWidth();
                        androidx.media3.common.a aVar2 = this.D;
                        aVar2.getClass();
                        int i4 = width / aVar2.M;
                        int height = this.H.getHeight();
                        androidx.media3.common.a aVar3 = this.D;
                        aVar3.getClass();
                        int i5 = height / aVar3.N;
                        int i6 = this.D.M;
                        bitmap = Bitmap.createBitmap(this.H, (i3 % i6) * i4, (i3 / i6) * i5, i4, i5);
                    } else {
                        bitmap = this.H;
                        bitmap.getClass();
                    }
                    bVar.c = bitmap;
                }
                Bitmap bitmap3 = this.J.c;
                bitmap3.getClass();
                long j2 = this.J.b;
                long j3 = j2 - j;
                boolean z3 = this.i == 2;
                int i7 = this.C;
                if (i7 != 0) {
                    if (i7 == 1) {
                        z3 = true;
                    } else {
                        if (i7 != 3) {
                            throw new IllegalStateException();
                        }
                        z3 = false;
                    }
                }
                if (z3 || j3 < ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                    this.G.onImageAvailable(j2 - this.y.b, bitmap3);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    b bVar2 = this.J;
                    bVar2.getClass();
                    long j4 = bVar2.b;
                    this.z = j4;
                    while (!arrayDeque.isEmpty() && j4 >= arrayDeque.peek().a) {
                        this.y = arrayDeque.removeFirst();
                    }
                    this.C = 3;
                    if (z2) {
                        b bVar3 = this.J;
                        bVar3.getClass();
                        int i8 = bVar3.a;
                        androidx.media3.common.a aVar4 = this.D;
                        aVar4.getClass();
                        int i9 = aVar4.N;
                        androidx.media3.common.a aVar5 = this.D;
                        aVar5.getClass();
                    }
                    this.H = null;
                    this.J = this.K;
                    this.K = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010a, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(long j) throws ImageDecoderException {
        boolean z;
        DecoderInputBuffer decoderInputBuffer;
        androidx.media3.common.a aVar;
        int i;
        DecoderInputBuffer decoderInputBuffer2;
        if (!this.I || this.J == null) {
            w8s w8sVar = this.d;
            w8sVar.a();
            cc7 cc7Var = this.E;
            if (cc7Var != null && this.B != 3 && !this.w) {
                if (this.F == null) {
                    DecoderInputBuffer decoderInputBuffer3 = (DecoderInputBuffer) cc7Var.dequeueInputBuffer();
                    this.F = decoderInputBuffer3;
                }
                if (this.B == 2) {
                    this.F.getClass();
                    this.F.b = 4;
                    cc7 cc7Var2 = this.E;
                    cc7Var2.getClass();
                    cc7Var2.b(this.F);
                    this.F = null;
                    this.B = 3;
                    return false;
                }
                int B = B(w8sVar, this.F, 0);
                if (B == -5) {
                    androidx.media3.common.a aVar2 = w8sVar.b;
                    aVar2.getClass();
                    this.D = aVar2;
                    this.M = true;
                    this.B = 2;
                    return true;
                }
                if (B == -4) {
                    this.F.h();
                    ByteBuffer byteBuffer = this.F.e;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        DecoderInputBuffer decoderInputBuffer4 = this.F;
                        decoderInputBuffer4.getClass();
                        if (!decoderInputBuffer4.b(4)) {
                            z = false;
                            if (z) {
                                DecoderInputBuffer decoderInputBuffer5 = this.F;
                                decoderInputBuffer5.getClass();
                                decoderInputBuffer5.c = this.D;
                                cc7 cc7Var3 = this.E;
                                cc7Var3.getClass();
                                DecoderInputBuffer decoderInputBuffer6 = this.F;
                                decoderInputBuffer6.getClass();
                                cc7Var3.b(decoderInputBuffer6);
                                this.L = 0;
                            }
                            decoderInputBuffer = this.F;
                            decoderInputBuffer.getClass();
                            if (decoderInputBuffer.b(4)) {
                                int i2 = this.L;
                                long j2 = decoderInputBuffer.g;
                                this.K = new b(i2, j2);
                                this.L = i2 + 1;
                                if (!this.I) {
                                    boolean z2 = j2 - ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS <= j && j <= ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS + j2;
                                    b bVar = this.J;
                                    boolean z3 = bVar != null && bVar.b <= j && j < j2;
                                    androidx.media3.common.a aVar3 = this.D;
                                    aVar3.getClass();
                                    this.I = z2 || z3 || (aVar3.M == -1 || (i = (aVar = this.D).N) == -1 || i2 == (i * aVar.M) - 1);
                                    if (z3) {
                                    }
                                }
                                this.J = this.K;
                                this.K = null;
                            } else {
                                this.I = true;
                            }
                            decoderInputBuffer2 = this.F;
                            decoderInputBuffer2.getClass();
                            if (!decoderInputBuffer2.b(4)) {
                                this.w = true;
                                this.F = null;
                                return false;
                            }
                            long j3 = this.A;
                            DecoderInputBuffer decoderInputBuffer7 = this.F;
                            decoderInputBuffer7.getClass();
                            this.A = Math.max(j3, decoderInputBuffer7.g);
                            if (z) {
                                this.F = null;
                            } else {
                                DecoderInputBuffer decoderInputBuffer8 = this.F;
                                decoderInputBuffer8.getClass();
                                decoderInputBuffer8.c();
                            }
                            return !this.I;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    decoderInputBuffer = this.F;
                    decoderInputBuffer.getClass();
                    if (decoderInputBuffer.b(4)) {
                    }
                    decoderInputBuffer2 = this.F;
                    decoderInputBuffer2.getClass();
                    if (!decoderInputBuffer2.b(4)) {
                    }
                } else if (B != -3) {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    public final void E() throws ExoPlaybackException {
        if (this.M) {
            androidx.media3.common.a aVar = this.D;
            aVar.getClass();
            cc7.a aVar2 = this.t;
            int a2 = aVar2.a(aVar);
            if (a2 != androidx.media3.exoplayer.k.f(4, 0, 0, 0) && a2 != androidx.media3.exoplayer.k.f(3, 0, 0, 0)) {
                throw r(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.D, false, 4005);
            }
            cc7 cc7Var = this.E;
            if (cc7Var != null) {
                cc7Var.release();
            }
            this.E = new cc7(aVar2.a);
            this.M = false;
        }
    }

    public final void F() {
        this.F = null;
        this.B = 0;
        this.A = C.TIME_UNSET;
        cc7 cc7Var = this.E;
        if (cc7Var != null) {
            cc7Var.release();
            this.E = null;
        }
    }

    @Override // androidx.media3.exoplayer.k
    public final int a(androidx.media3.common.a aVar) {
        return this.t.a(aVar);
    }

    @Override // androidx.media3.exoplayer.j, androidx.media3.exoplayer.k
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.i.b
    public final void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.a;
        }
        this.G = imageOutput;
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.j
    public final boolean isEnded() {
        return this.x;
    }

    @Override // androidx.media3.exoplayer.j
    public final boolean isReady() {
        int i = this.C;
        if (i != 3) {
            return i == 0 && this.I;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.j
    public final void render(long j, long j2) throws ExoPlaybackException {
        if (this.x) {
            return;
        }
        if (this.D == null) {
            w8s w8sVar = this.d;
            w8sVar.a();
            DecoderInputBuffer decoderInputBuffer = this.u;
            decoderInputBuffer.c();
            int B = B(w8sVar, decoderInputBuffer, 2);
            if (B != -5) {
                if (B == -4) {
                    fxc0.z(decoderInputBuffer.b(4));
                    this.w = true;
                    this.x = true;
                    return;
                }
                return;
            }
            androidx.media3.common.a aVar = w8sVar.b;
            aVar.getClass();
            this.D = aVar;
            this.M = true;
        }
        if (this.E == null) {
            E();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (C(j)) {
            }
            while (D(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e) {
            throw r(e, null, false, 4003);
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void s() {
        this.D = null;
        this.y = a.c;
        this.v.clear();
        F();
        this.G.getClass();
    }

    @Override // androidx.media3.exoplayer.a
    public final void t(boolean z, boolean z2) throws ExoPlaybackException {
        this.C = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.a
    public final void u(long j, boolean z, boolean z2) throws ExoPlaybackException {
        this.C = Math.min(this.C, 1);
        this.x = false;
        this.w = false;
        this.H = null;
        this.J = null;
        this.K = null;
        this.I = false;
        this.F = null;
        cc7 cc7Var = this.E;
        if (cc7Var != null) {
            cc7Var.flush();
        }
        this.v.clear();
    }

    @Override // androidx.media3.exoplayer.a
    public final void v() {
        F();
    }

    @Override // androidx.media3.exoplayer.a
    public final void w() {
        F();
        this.C = Math.min(this.C, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(androidx.media3.common.a[] aVarArr, long j, long j2, i.b bVar) throws ExoPlaybackException {
        if (this.y.b != C.TIME_UNSET) {
            ArrayDeque<a> arrayDeque = this.v;
            if (arrayDeque.isEmpty()) {
                long j3 = this.A;
                if (j3 != C.TIME_UNSET) {
                    long j4 = this.z;
                    if (j4 != C.TIME_UNSET) {
                    }
                }
            }
            arrayDeque.add(new a(this.A, j2));
            return;
        }
        this.y = new a(C.TIME_UNSET, j2);
    }
}
