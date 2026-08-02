package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;

/* compiled from: CropperPaddingsApplier.kt */
/* loaded from: classes4.dex */
public final class zik {
    public final yhk a;
    public final efk b;
    public final int c;
    public final int d;
    public AnimatorSet e;
    public boolean f;
    public final Rect g = new Rect();
    public final RectF h = new RectF();
    public final Rect i = new Rect();
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public final Matrix l = new Matrix();
    public final float[] m = new float[9];

    public zik(yhk yhkVar, efk efkVar, int i, int i2) {
        this.a = yhkVar;
        this.b = efkVar;
        this.c = i;
        this.d = i2;
    }

    public final void a(boolean z) {
        RectF b;
        RectF rectF;
        Matrix matrix = this.l;
        matrix.reset();
        if (z) {
            b = b();
            float f = b().left;
            float f2 = b().top;
            float f3 = b().right - this.d;
            float f4 = b().bottom - this.c;
            rectF = this.k;
            rectF.set(f, f2, f3, f4);
        } else {
            b = b();
            efk efkVar = this.b;
            Rect rect = this.g;
            efkVar.getHitRect(rect);
            rectF = this.h;
            rectF.set(rect);
        }
        matrix.setRectToRect(b, rectF, Matrix.ScaleToFit.START);
        matrix.getValues(this.m);
    }

    public final RectF b() {
        ffk content = this.b.getContent();
        Rect rect = this.i;
        fyt0.g(rect, content);
        RectF rectF = this.j;
        rectF.set(rect);
        return rectF;
    }

    public final void c(AnimatorSet animatorSet) {
        yhk yhkVar = this.a;
        hfk overlay$android_release = yhkVar.getOverlay$android_release();
        overlay$android_release.setPivotX(overlay$android_release.getFullWidth() / 2.0f);
        overlay$android_release.setPivotY(overlay$android_release.getFullHeight() / 2.0f);
        efk efkVar = this.b;
        ffk content = efkVar.getContent();
        content.setPivotX(content.getWidth() / 2.0f);
        content.setPivotY(content.getHeight() / 2.0f);
        hfk overlay$android_release2 = yhkVar.getOverlay$android_release();
        Property property = View.SCALE_Y;
        float[] fArr = this.m;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(overlay$android_release2, (Property<hfk, Float>) property, fArr[4]);
        hfk overlay$android_release3 = yhkVar.getOverlay$android_release();
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(overlay$android_release3, (Property<hfk, Float>) property2, fArr[0]);
        hfk overlay$android_release4 = yhkVar.getOverlay$android_release();
        Property property3 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(overlay$android_release4, (Property<hfk, Float>) property3, fArr[5]);
        hfk overlay$android_release5 = yhkVar.getOverlay$android_release();
        Property property4 = View.TRANSLATION_X;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(overlay$android_release5, (Property<hfk, Float>) property4, fArr[2]), ObjectAnimator.ofFloat(efkVar.getContent(), (Property<ffk, Float>) property, fArr[4]), ObjectAnimator.ofFloat(efkVar.getContent(), (Property<ffk, Float>) property2, fArr[0]), ObjectAnimator.ofFloat(efkVar.getContent(), (Property<ffk, Float>) property3, fArr[5]), ObjectAnimator.ofFloat(efkVar.getContent(), (Property<ffk, Float>) property4, fArr[2]));
        animatorSet.start();
    }
}
