package xsna;

import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ClipsEditorTransformProviderImpl.kt */
/* loaded from: classes16.dex */
public final class n0e implements m0e {
    public final nov a;

    public n0e(nov novVar) {
        this.a = novVar;
    }

    @Override // xsna.m0e
    public final void a(float f, float f2, float f3) {
        this.a.a(f, f2, f3);
    }

    @Override // xsna.m0e
    public final float b() {
        return this.a.getCommons().b();
    }

    @Override // xsna.m0e
    public final void e(float f, float f2) {
        this.a.e(f, f2);
    }

    @Override // xsna.m0e
    public final float f() {
        return this.a.getCommons().f();
    }

    @Override // xsna.m0e
    public final int g() {
        return (int) (this.a.getStickerScale() * 100);
    }

    @Override // xsna.m0e
    public final float getBottom() {
        return this.a.getBottom();
    }

    @Override // xsna.m0e
    public final float getCenterX() {
        return this.a.getCenterX();
    }

    @Override // xsna.m0e
    public final float getCenterY() {
        return this.a.getCenterY();
    }

    @Override // xsna.m0e
    public final float getLeft() {
        return this.a.getLeft();
    }

    @Override // xsna.m0e
    public final float getOriginalHeight() {
        return this.a.getOriginalHeight();
    }

    @Override // xsna.m0e
    public final float getOriginalStickerScale() {
        return this.a.getOriginalStickerScale();
    }

    @Override // xsna.m0e
    public final float getOriginalWidth() {
        return this.a.getOriginalWidth();
    }

    @Override // xsna.m0e
    public final float getRight() {
        return this.a.getRight();
    }

    @Override // xsna.m0e
    public final Matrix getStickerMatrix() {
        return this.a.getStickerMatrix();
    }

    @Override // xsna.m0e
    public final float getStickerRotation() {
        return this.a.getStickerRotation();
    }

    @Override // xsna.m0e
    public final float getStickerScale() {
        return this.a.getStickerScale();
    }

    @Override // xsna.m0e
    public final float getTop() {
        return this.a.getTop();
    }

    @Override // xsna.m0e
    public final void h() {
        this.a.setStickerTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.m0e
    public final void i() {
        this.a.setStickerTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.m0e
    public final boolean j() {
        if (g() != 100) {
            return false;
        }
        nov novVar = this.a;
        return ((int) novVar.getStickerRotation()) == 0 && Math.abs((int) pov.e(novVar.getStickerMatrix())) < 10 && Math.abs((int) pov.f(novVar.getStickerMatrix())) < 10;
    }

    @Override // xsna.m0e
    public final void k(float f, float f2, float f3) {
        this.a.y0(f, f2, f3, true);
    }
}
