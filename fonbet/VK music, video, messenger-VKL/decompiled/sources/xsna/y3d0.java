package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.media.MediaMetadataRetriever;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.filters.model.FilterItem;
import com.vk.media.pipeline.PreviewExtractor;
import com.vk.media.pipeline.gl.GlException;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.item.VideoEncodedItem;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.model.item.VideoRawItem;
import com.vk.media.pipeline.model.source.picture.ColorMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageBitmapMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageFileMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageMediaSource;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.b0u;
import xsna.q0u;

/* compiled from: PreviewExtractorImpl.kt */
/* loaded from: classes3.dex */
public final class y3d0 implements PreviewExtractor {
    public final Timeline a;
    public final apk b;
    public final f100 c;

    public y3d0(Timeline timeline, apk apkVar, f100 f100Var) {
        this.a = timeline;
        this.b = apkVar;
        this.c = f100Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0228  */
    @Override // com.vk.media.pipeline.PreviewExtractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap a(long j, Size size) {
        Bitmap decodeFile;
        MediaMetadataRetriever mediaMetadataRetriever;
        f100 f100Var = this.c;
        Timeline timeline = this.a;
        long i = swe0.i(j, 0L, timeline.d);
        Iterator<T> it = timeline.b.iterator();
        long j2 = i;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = 0;
                break;
            }
            int i3 = i2 + 1;
            VideoFragment videoFragment = (VideoFragment) it.next();
            if (j2 <= videoFragment.d()) {
                j2 = (long) (videoFragment.b.z() * j2);
                break;
            }
            j2 -= videoFragment.d();
            i2 = i3;
        }
        VideoItem videoItem = timeline.b.get(i2).b;
        long O0 = videoItem.O0() + j2;
        if (videoItem instanceof VideoEncodedItem) {
            String path = ((VideoEncodedItem) videoItem).b.b.getPath();
            if (f100Var != null) {
                f100Var.i("PreviewExtractorImpl", "extracting initial preview for VideoEncodedItem: " + path + ", timeMcs: " + O0);
            }
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(path);
                    decodeFile = mediaMetadataRetriever.getFrameAtTime(O0, 3);
                    if (decodeFile == null) {
                        throw new PreviewExtractor.PreviewExtractionException("Failed to extract frame via MediaMetadataRetriever");
                    }
                    mediaMetadataRetriever.release();
                } catch (Throwable th) {
                    th = th;
                    if (f100Var != null) {
                        try {
                            f100Var.a("PreviewExtractorImpl", th);
                        } finally {
                            if (mediaMetadataRetriever != null) {
                                mediaMetadataRetriever.release();
                            }
                        }
                    }
                    decodeFile = null;
                    if (decodeFile != null) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                mediaMetadataRetriever = null;
            }
        } else {
            if (!(videoItem instanceof VideoRawItem)) {
                throw new NoWhenBranchMatchedException();
            }
            if (f100Var != null) {
                f100Var.i("PreviewExtractorImpl", "extracting initial preview for VideoRawItem: " + ((VideoRawItem) videoItem).b + ", timeMcs: " + O0);
            }
            ImageMediaSource imageMediaSource = ((VideoRawItem) videoItem).b;
            if (imageMediaSource instanceof ColorMediaSource) {
                ColorMediaSource colorMediaSource = (ColorMediaSource) imageMediaSource;
                Bitmap createBitmap = Bitmap.createBitmap(colorMediaSource.c, colorMediaSource.d, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(colorMediaSource.b);
                decodeFile = createBitmap;
            } else if (imageMediaSource instanceof ImageBitmapMediaSource) {
                decodeFile = ((ImageBitmapMediaSource) imageMediaSource).b;
            } else {
                if (!(imageMediaSource instanceof ImageFileMediaSource)) {
                    throw new NoWhenBranchMatchedException();
                }
                decodeFile = BitmapFactory.decodeFile(((ImageFileMediaSource) imageMediaSource).b.getPath());
            }
        }
        if (decodeFile != null) {
            throw new PreviewExtractor.PreviewExtractionException("initial preview was not obtained");
        }
        final sjp0 sjp0Var = new sjp0(size.getWidth(), size.getHeight());
        sjp0Var.d(decodeFile.getWidth(), decodeFile.getHeight());
        VideoEffect X8 = videoItem.X8();
        sjp0Var.b(X8 != null ? X8.b : null);
        sjp0Var.c(0);
        final apk apkVar = this.b;
        VideoEffect X82 = videoItem.X8();
        FilterItem filterItem = X82 != null ? X82.c : null;
        final long j3 = i / 1000;
        final int i4 = sjp0Var.c;
        final int i5 = sjp0Var.d;
        b0u a = b0u.a.a(f100Var);
        q0u a2 = q0u.a.a(a, i4, i5, f100Var);
        b0u b0uVar = a2.d;
        EGLDisplay eGLDisplay = b0uVar.b;
        EGLSurface eGLSurface = a2.c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, b0uVar.c)) {
            throw new GlException("eglMakeCurrent failed");
        }
        float[] fArr = sjp0Var.h;
        apkVar.c(filterItem, Arrays.copyOf(fArr, fArr.length), null);
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3333, iArr, 0);
        int i6 = iArr[0];
        if (width % i6 != 0 || height % i6 != 0) {
            GLES20.glPixelStorei(3333, 1);
        }
        GLES20.glGetIntegerv(3317, iArr, 0);
        int i7 = iArr[0];
        if (width % i7 != 0 || height % i7 != 0) {
            GLES20.glPixelStorei(3317, 1);
        }
        final int u = wwf0.c.u(decodeFile);
        final ByteBuffer allocate = ByteBuffer.allocate(i4 * i5 * 4);
        g0u g0uVar = new g0u();
        g0uVar.b(i4, i5);
        izs izsVar = new izs() { // from class: xsna.x3d0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                y3d0 y3d0Var = y3d0.this;
                apk apkVar2 = apkVar;
                sjp0 sjp0Var2 = sjp0Var;
                int i8 = u;
                long j4 = j3;
                int i9 = i4;
                int i10 = i5;
                ByteBuffer byteBuffer = allocate;
                int i11 = sjp0Var2.c;
                int i12 = sjp0Var2.d;
                float[] fArr2 = new float[16];
                Matrix.setIdentityM(fArr2, 0);
                Matrix.translateM(fArr2, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
                if (!apkVar2.d(fArr2, j4, i11, i12, i8, false)) {
                    GLES20.glBlendFunc(770, 771);
                    GLES20.glEnable(3042);
                    GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    GLES20.glClear(16640);
                    GLES20.glViewport(0, 0, i11, i12);
                    l0u l0uVar = new l0u(y3d0Var.c);
                    l0uVar.c = i8;
                    l0uVar.e = fArr2;
                    float[] fArr3 = sjp0Var2.h;
                    l0uVar.d = Arrays.copyOf(fArr3, fArr3.length);
                    l0uVar.d();
                    l0uVar.c();
                }
                GLES20.glReadPixels(0, 0, i9, i10, 6408, 5121, byteBuffer);
                return s3q0.a;
            }
        };
        GLES20.glBindFramebuffer(36160, g0uVar.c);
        izsVar.invoke(g0uVar);
        GLES20.glBindFramebuffer(36160, 0);
        g0uVar.a();
        if (epx.f(a.c, EGL14.eglGetCurrentContext())) {
            EGLDisplay eGLDisplay2 = a.b;
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT)) {
                throw new GlException("eglMakeCurrent (detach) failed");
            }
        }
        a.a();
        a2.a();
        allocate.position(0);
        Bitmap createBitmap2 = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        createBitmap2.copyPixelsFromBuffer(allocate);
        apkVar.a();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preScale(1.0f, -1.0f);
        return Bitmap.createBitmap(createBitmap2, 0, 0, createBitmap2.getWidth(), createBitmap2.getHeight(), matrix, true);
    }
}
