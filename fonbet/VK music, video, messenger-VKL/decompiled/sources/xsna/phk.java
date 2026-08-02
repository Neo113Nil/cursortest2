package xsna;

import android.animation.ValueAnimator;
import com.vk.crop.CropImageView;

/* compiled from: CropImageView.java */
/* loaded from: classes17.dex */
public final class phk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float b;
    public final /* synthetic */ float[] c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float[] h;
    public final /* synthetic */ float[] i;
    public final /* synthetic */ float j;
    public final /* synthetic */ CropImageView k;

    public phk(CropImageView cropImageView, float f, float[] fArr, float f2, float f3, float f4, float f5, float[] fArr2, float[] fArr3, float f6) {
        this.k = cropImageView;
        this.b = f;
        this.c = fArr;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = fArr2;
        this.i = fArr3;
        this.j = f6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float b = u11.b(this.b, 1.0f, floatValue, 1.0f);
        float[] fArr = this.c;
        float f = fArr[0];
        float f2 = b / f;
        fArr[0] = f * f2;
        CropImageView cropImageView = this.k;
        cropImageView.e.e.a(f2, this.d, this.e, false);
        float f3 = this.f * floatValue;
        float f4 = floatValue * this.g;
        float[] fArr2 = this.h;
        float f5 = f3 - fArr2[0];
        float[] fArr3 = this.i;
        float f6 = f4 - fArr3[0];
        com.vk.crop.g gVar = cropImageView.e.e;
        float f7 = gVar.e;
        float f8 = this.j;
        gVar.b((f5 * f7) / f8, (f6 * f7) / f8, false);
        fArr2[0] = f3;
        fArr3[0] = f4;
        cropImageView.e.e();
    }
}
