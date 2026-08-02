package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VideoMsgStickerCommonDelegate.kt */
/* loaded from: classes6.dex */
public final class jxs0 implements oov {
    public final gxs0 a;
    public float b;
    public float c;
    public q500 d;
    public float e = 1.0f;
    public float f = 1.0f;
    public final Matrix g = new Matrix();
    public boolean h = true;
    public boolean i = true;
    public boolean j;
    public boolean k;
    public boolean l;

    public jxs0(gxs0 gxs0Var) {
        this.a = gxs0Var;
        new Matrix();
    }

    @Override // xsna.oov
    public final void a(float f) {
        this.c = f;
    }

    @Override // xsna.oov
    public final float b() {
        return this.b;
    }

    @Override // xsna.oov
    public final float c() {
        return this.e;
    }

    @Override // xsna.oov
    public final boolean d() {
        return this.h;
    }

    @Override // xsna.oov
    public final void e(float f) {
        this.b = f;
    }

    @Override // xsna.oov
    public final float f() {
        return this.c;
    }

    @Override // xsna.oov
    public final void g(float f) {
        this.f = f;
    }

    @Override // xsna.oov
    public final float getBottom() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.oov
    public final float getCenterX() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.oov
    public final float getCenterY() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.oov
    public final PointF[] getFillPoints() {
        return new PointF[0];
    }

    @Override // xsna.oov
    public final boolean getInDraggingMode() {
        return this.k;
    }

    @Override // xsna.oov
    public final boolean getInEditMode() {
        return this.l;
    }

    @Override // xsna.oov
    public final float getLeft() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.oov
    public final float getRight() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.oov
    public final float getTop() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.oov
    public final Matrix getTransformMatrix() {
        return this.g;
    }

    @Override // xsna.oov
    public final void i(float f) {
        this.e = f;
    }

    @Override // xsna.oov
    public final boolean isVisible() {
        return this.i;
    }

    @Override // xsna.oov
    public final boolean j(PointF[] pointFArr, float f, float f2) {
        return false;
    }

    @Override // xsna.oov
    public final float k() {
        return this.f;
    }

    @Override // xsna.oov
    public final PointF[] l() {
        return new PointF[0];
    }

    @Override // xsna.oov
    public final void n(boolean z) {
        this.k = z;
    }

    @Override // xsna.oov
    public final q500 o() {
        return this.d;
    }

    @Override // xsna.oov
    public final void p(q500 q500Var) {
        this.d = q500Var;
    }

    @Override // xsna.oov
    public final void setInEditMode(boolean z) {
        this.l = z;
        this.a.setStickerAlpha(z ? 0 : 255);
    }

    @Override // xsna.oov
    public final void setRemovable(boolean z) {
        this.j = z;
    }

    @Override // xsna.oov
    public final void setStatic(boolean z) {
        this.h = z;
    }

    @Override // xsna.oov
    public final void setVisible(boolean z) {
        this.i = z;
    }

    @Override // xsna.oov
    public final boolean v0() {
        return this.j;
    }

    @Override // xsna.oov
    public final void m(oov oovVar) {
    }

    @Override // xsna.oov
    public final void h(float f, float f2) {
    }

    @Override // xsna.oov
    public final void w0(float f, float f2) {
    }

    @Override // xsna.oov
    public final void y0(float f, float f2, float f3, boolean z) {
    }
}
