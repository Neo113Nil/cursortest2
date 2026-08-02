package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.opengl.GLES20;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.pipeline.gl.codec.surface.GLSurfaceWrapper;
import com.vk.media.pipeline.gl.codec.surface.Surface;
import com.vk.media.pipeline.model.source.picture.ColorMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageBitmapMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageFileMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageMediaSource;
import com.vk.media.pipeline.session.transform.task.transcode.producer.framerate.FrameRateController;
import com.vk.media.pipeline.utils.exception.InvalidPictureSourceException;
import kotlin.LazyThreadSafetyMode;
import xsna.k0h0;

/* compiled from: VideoRawProducer.kt */
/* loaded from: classes3.dex */
public final class nat0 extends n6t0 {
    public final oat0 e;
    public final Bitmap f;
    public final Object g;
    public final MediaCodec.BufferInfo h;
    public boolean i;
    public boolean j;
    public final Object k;

    /* JADX WARN: Removed duplicated region for block: B:13:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nat0(csp cspVar, oat0 oat0Var) {
        super(cspVar, oat0Var.a.a);
        Throwable th;
        Bitmap bitmap;
        Bitmap c;
        this.e = oat0Var;
        ImageMediaSource imageMediaSource = oat0Var.c;
        int i = oat0Var.d;
        if (imageMediaSource instanceof ColorMediaSource) {
            Size b = nka0.b(imageMediaSource, i);
            int i2 = ((ColorMediaSource) imageMediaSource).b;
            bitmap = Bitmap.createBitmap(b.getWidth(), b.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(bitmap).drawColor(i2);
        } else {
            if (imageMediaSource instanceof ImageFileMediaSource) {
                try {
                    Size a = nka0.a(imageMediaSource);
                    Size b2 = nka0.b(imageMediaSource, i);
                    if (b2.equals(a)) {
                        c = BitmapFactory.decodeFile(((ImageFileMediaSource) imageMediaSource).b.getPath());
                    } else {
                        float min = Math.min(b2.getWidth() / a.getWidth(), b2.getHeight() / a.getHeight());
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = (int) (1 / min);
                        Bitmap decodeFile = BitmapFactory.decodeFile(((ImageFileMediaSource) imageMediaSource).b.getPath(), options);
                        c = nka0.c(decodeFile, b2);
                        if (decodeFile != c) {
                            decodeFile.recycle();
                        }
                    }
                    Bitmap bitmap2 = c;
                    if (((ImageFileMediaSource) imageMediaSource).c != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(((ImageFileMediaSource) imageMediaSource).c);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                        bitmap2.recycle();
                        bitmap2 = createBitmap;
                    }
                    th = null;
                    bitmap = bitmap2;
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = null;
                }
                if (bitmap != null) {
                    throw new InvalidPictureSourceException(i5s.a(new StringBuilder("Invalid picture media source: "), imageMediaSource instanceof ImageFileMediaSource ? ((ImageFileMediaSource) imageMediaSource).b.getPath() : "not file", ", "), th);
                }
                this.f = bitmap;
                wx0 wx0Var = new wx0(25, this, cspVar);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                this.g = msy.a(lazyThreadSafetyMode, wx0Var);
                this.h = new MediaCodec.BufferInfo();
                this.k = msy.a(lazyThreadSafetyMode, new q2m0(7, this, cspVar));
                this.b.d(new l8l(bitmap.getWidth(), bitmap.getHeight(), null));
                return;
            }
            if (!(imageMediaSource instanceof ImageBitmapMediaSource)) {
                throw new IllegalArgumentException("Unsupported picture media source type");
            }
            Size a2 = nka0.a(imageMediaSource);
            Size b3 = nka0.b(imageMediaSource, i);
            bitmap = b3.equals(a2) ? ((ImageBitmapMediaSource) imageMediaSource).b : nka0.c(((ImageBitmapMediaSource) imageMediaSource).b, b3);
        }
        th = null;
        if (bitmap != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.n6t0
    public final void a(k0h0 k0h0Var) {
        if (this.j) {
            this.b.getClass();
            return;
        }
        ?? r9 = this.k;
        ((kes0) r9.getValue()).a.d();
        bd7 bd7Var = (bd7) this.g.getValue();
        int i = bd7Var.d;
        int i2 = bd7Var.e;
        GLES20.glBlendFunc(770, 771);
        GLES20.glEnable(3042);
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        GLES20.glClear(16640);
        GLES20.glViewport(0, 0, i, i2);
        l0u l0uVar = bd7Var.c;
        l0uVar.c = bd7Var.b;
        l0uVar.d();
        r6t0 r6t0Var = this.b;
        MediaCodec.BufferInfo bufferInfo = this.h;
        x7l e = r6t0Var.e(bufferInfo);
        if (h(e)) {
            FrameRateController.a aVar = e.b;
            long j = bufferInfo.presentationTimeUs;
            kes0 kes0Var = (kes0) r9.getValue();
            int i3 = this.d;
            if (i3 > 0) {
                this.b.c(i3, j, kes0Var);
                this.d = 0;
            }
            this.d = aVar != null ? aVar.b : 0;
            Surface surface = ((kes0) r9.getValue()).a;
            GLSurfaceWrapper gLSurfaceWrapper = surface instanceof GLSurfaceWrapper ? (GLSurfaceWrapper) surface : null;
            if (gLSurfaceWrapper != null) {
                gLSurfaceWrapper.e.b(bufferInfo.presentationTimeUs * 1000);
            }
            this.b.a(bufferInfo);
            this.b.b((kes0) r9.getValue(), bufferInfo.presentationTimeUs);
        }
        this.j = true;
    }

    @Override // xsna.n6t0
    public final void b(k0h0 k0h0Var, k0h0.b bVar, MediaCodec.BufferInfo bufferInfo) {
        bVar.getClass();
        this.h.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        this.i = this.i || (bufferInfo.flags & 4) != 0;
        this.j = false;
    }

    @Override // xsna.n6t0
    public final boolean d() {
        return this.i;
    }

    @Override // xsna.n6t0
    public final boolean e() {
        return this.i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.n6t0
    public final void f() {
        bd7 bd7Var = (bd7) this.g.getValue();
        wwf0.p(bd7Var.b, 4, bd7Var.a);
        bd7Var.c.c();
        ((kes0) this.k.getValue()).a();
    }

    @Override // xsna.n6t0
    public final void g(boolean z) {
        this.i = true;
    }

    @Override // xsna.n6t0
    public final void c(k0h0 k0h0Var) {
    }
}
