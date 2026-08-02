package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.clips.VideoTransform;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.laf;

/* compiled from: ClipsEditorTransformProviderImplNew.kt */
/* loaded from: classes16.dex */
public final class o0e implements m0e {
    public final rzd a;
    public final xvd b;
    public final nal0 c;
    public final PointF[] d = {new PointF(), new PointF(), new PointF(), new PointF()};
    public final float[] e = new float[8];
    public final RectF f = new RectF();

    public o0e(rzd rzdVar, xvd xvdVar, nal0 nal0Var) {
        this.a = rzdVar;
        this.b = xvdVar;
        this.c = nal0Var;
    }

    @Override // xsna.m0e
    public final void a(float f, float f2, float f3) {
        Matrix m = m();
        m.postScale(f, f, f2, f3);
        n(m);
    }

    @Override // xsna.m0e
    public final float b() {
        return this.c.getWidth();
    }

    public final com.vk.clips.editor.state.model.c c() {
        return this.a.getState().j(this.b.e());
    }

    public final float[] d() {
        float[] fArr = this.e;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = getOriginalWidth();
        fArr[3] = 0.0f;
        fArr[4] = getOriginalWidth();
        fArr[5] = getOriginalHeight();
        fArr[6] = 0.0f;
        fArr[7] = getOriginalHeight();
        m().mapPoints(fArr);
        return fArr;
    }

    @Override // xsna.m0e
    public final void e(float f, float f2) {
        Matrix m = m();
        m.postTranslate(f, f2);
        n(m);
    }

    @Override // xsna.m0e
    public final float f() {
        return this.c.getHeight();
    }

    @Override // xsna.m0e
    public final int g() {
        return (int) (getStickerScale() * 100);
    }

    @Override // xsna.m0e
    public final float getBottom() {
        float[] d = d();
        return Math.max(Math.max(d[1], d[3]), Math.max(d[5], d[7]));
    }

    @Override // xsna.m0e
    public final float getCenterX() {
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        RectF rectF = this.f;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, originalWidth, originalHeight);
        m().mapRect(rectF);
        return rectF.centerX();
    }

    @Override // xsna.m0e
    public final float getCenterY() {
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        RectF rectF = this.f;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, originalWidth, originalHeight);
        m().mapRect(rectF);
        return rectF.centerY();
    }

    @Override // xsna.m0e
    public final float getLeft() {
        float[] d = d();
        return Math.min(Math.min(d[0], d[2]), Math.min(d[4], d[6]));
    }

    @Override // xsna.m0e
    public final float getOriginalHeight() {
        return c() != null ? r0.c() : iah0.f().heightPixels;
    }

    @Override // xsna.m0e
    public final float getOriginalStickerScale() {
        laf lafVar = laf.a;
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        nal0 nal0Var = this.c;
        float width = nal0Var.getWidth();
        float height = nal0Var.getHeight();
        lafVar.getClass();
        return width / height < originalWidth / originalHeight ? width / originalWidth : height / originalHeight;
    }

    @Override // xsna.m0e
    public final float getOriginalWidth() {
        return c() != null ? r0.d() : iah0.f().widthPixels;
    }

    @Override // xsna.m0e
    public final float getRight() {
        float[] d = d();
        return Math.max(Math.max(d[0], d[2]), Math.max(d[4], d[6]));
    }

    @Override // xsna.m0e
    public final Matrix getStickerMatrix() {
        return m();
    }

    @Override // xsna.m0e
    public final float getStickerRotation() {
        return pov.b(m());
    }

    @Override // xsna.m0e
    public final float getStickerScale() {
        VideoTransform videoTransform;
        Float f;
        com.vk.clips.editor.state.model.c c = c();
        if (c == null || (videoTransform = c.k) == null || (f = videoTransform.f) == null) {
            return 1.0f;
        }
        return f.floatValue();
    }

    @Override // xsna.m0e
    public final float getTop() {
        float[] d = d();
        return Math.min(Math.min(d[1], d[3]), Math.min(d[5], d[7]));
    }

    @Override // xsna.m0e
    public final void h() {
        Matrix m = m();
        m.setTranslate(pov.e(m), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        n(m);
    }

    @Override // xsna.m0e
    public final void i() {
        Matrix m = m();
        m.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pov.f(m));
        n(m);
    }

    @Override // xsna.m0e
    public final boolean j() {
        return g() == 100 && ((int) getStickerRotation()) == 0 && Math.abs((int) pov.e(m())) < 10 && Math.abs((int) pov.f(m())) < 10;
    }

    @Override // xsna.m0e
    public final void k(float f, float f2, float f3) {
        Matrix m = m();
        m.postRotate(f, f2, f3);
        n(m);
    }

    public final PointF[] l() {
        float[] d = d();
        PointF[] pointFArr = this.d;
        pointFArr[0].set(d[0], d[1]);
        pointFArr[1].set(d[2], d[3]);
        pointFArr[2].set(d[4], d[5]);
        pointFArr[3].set(d[6], d[7]);
        return pointFArr;
    }

    public final Matrix m() {
        com.vk.clips.editor.state.model.c c = c();
        if (c == null) {
            return new Matrix();
        }
        float d = c.d();
        float c2 = c.c();
        nal0 nal0Var = this.c;
        float width = nal0Var.getWidth();
        float height = nal0Var.getHeight();
        laf.a aVar = new laf.a(d, c2, width, height);
        VideoTransform videoTransform = c.k;
        if (videoTransform != null) {
            laf.a.getClass();
            return (Matrix) laf.a(videoTransform, aVar).d();
        }
        laf.a.getClass();
        Matrix matrix = new Matrix();
        float f = aVar.c;
        float f2 = aVar.d;
        float f3 = f / f2;
        float f4 = aVar.a;
        float f5 = aVar.b;
        float f6 = f3 < f4 / f5 ? f / f4 : f2 / f5;
        matrix.postScale(f6, f6, d * 0.5f, 0.5f * c2);
        matrix.postTranslate((width / 2.0f) - (d / 2.0f), (height / 2.0f) - (c2 / 2.0f));
        return matrix;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00dc, code lost:
    
        if (r4 != (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00de, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e4, code lost:
    
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e6, code lost:
    
        r4 = (com.vk.clips.editor.state.model.c) xsna.j5g.b0(r3.intValue(), r6.getState().c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f6, code lost:
    
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f8, code lost:
    
        r6 = r4.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fe, code lost:
    
        if (xsna.epx.f(r6, r3) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0100, code lost:
    
        r0 = r3.intValue();
        r6 = new java.util.ArrayList(xsna.i7o0.a(r6.getState().c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0117, code lost:
    
        if (r6.size() <= r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0119, code lost:
    
        r6.set(r0, r1);
        r6.c(com.vk.clips.editor.state.model.a.c(r6.getState(), null, r6, null, null, null, null, 123), xsna.j5g.V(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0134, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        r3 = java.lang.Integer.valueOf(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(Matrix matrix) {
        com.vk.clips.editor.state.model.c c = c();
        if (c != null) {
            String str = c.j;
            nal0 nal0Var = this.c;
            float width = nal0Var.getWidth();
            float height = nal0Var.getHeight();
            rzd rzdVar = this.a;
            float f = rzdVar.getState().g.b;
            float d = c.d();
            float c2 = c.c();
            RectF rectF = new RectF();
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d, c2);
            matrix.mapRect(rectF);
            float b = pov.b(matrix);
            matrix.postRotate(pov.b(matrix), rectF.centerX(), rectF.centerY());
            com.vk.clips.editor.state.model.c a = com.vk.clips.editor.state.model.c.a(c, null, 0L, 0L, null, null, null, new VideoTransform((int) b, (pov.e(matrix) - ((width / 2.0f) - ((pov.c(matrix) * d) / 2.0f))) / width, (pov.f(matrix) - ((height / 2.0f) - ((pov.d(matrix) * c2) / 2.0f))) / height, f, Float.valueOf((pov.c(matrix) * d) / width), null, 32, null), null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 523263);
            EmptyList emptyList = EmptyList.b;
            Iterator<T> it = rzdVar.getState().c.iterator();
            int i = 0;
            while (true) {
                String str2 = null;
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f(((com.vk.clips.editor.state.model.c) next).j, str)) {
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
