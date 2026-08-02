package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.yandex.go.masstransit.sdk.camera.view.QrTargetView;

/* loaded from: classes12.dex */
public final /* synthetic */ class ep2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Parcelable c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ep2(Object obj, Parcelable parcelable, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = parcelable;
        this.w = obj2;
        this.x = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.x;
        Object obj2 = this.w;
        Parcelable parcelable = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((AppBarLayout) obj3).lambda$initializeLiftOnScrollWithColor$0((ColorStateList) parcelable, (MaterialShapeDrawable) obj2, (Integer) obj, valueAnimator);
                break;
            case 1:
                dgg0 dgg0Var = (dgg0) obj3;
                RectF rectF = (RectF) parcelable;
                Rect rect = (Rect) obj2;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF2 = dgg0Var.f;
                float f = rectF.left;
                float b = g8e.b(rect.left, f, floatValue, f);
                float f2 = rectF.top;
                float b2 = g8e.b(rect.top, f2, floatValue, f2);
                float f3 = rectF.right;
                float b3 = g8e.b(rect.right, f3, floatValue, f3);
                float f4 = rectF.bottom;
                rectF2.set(b, b2, b3, g8e.b(rect.bottom, f4, floatValue, f4));
                RectF rectF3 = new RectF();
                Path path = dgg0Var.d;
                path.computeBounds(rectF3, true);
                Matrix matrix = dgg0Var.a;
                matrix.reset();
                matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.CENTER);
                path.transform(matrix);
                dgg0Var.g.transform(matrix);
                ((QrTargetView) obj).invalidate();
                break;
            default:
                egg0 egg0Var = (egg0) obj3;
                RectF rectF4 = (RectF) parcelable;
                Rect rect2 = (Rect) obj2;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF5 = egg0Var.f;
                float f5 = rectF4.left;
                float b4 = g8e.b(rect2.left, f5, floatValue2, f5);
                float f6 = rectF4.top;
                float b5 = g8e.b(rect2.top, f6, floatValue2, f6);
                float f7 = rectF4.right;
                float b6 = g8e.b(rect2.right, f7, floatValue2, f7);
                float f8 = rectF4.bottom;
                rectF5.set(b4, b5, b6, g8e.b(rect2.bottom, f8, floatValue2, f8));
                RectF rectF6 = new RectF();
                Path path2 = egg0Var.d;
                path2.computeBounds(rectF6, true);
                Matrix matrix2 = egg0Var.a;
                matrix2.reset();
                matrix2.setRectToRect(rectF6, rectF5, Matrix.ScaleToFit.CENTER);
                path2.transform(matrix2);
                egg0Var.g.transform(matrix2);
                ((com.yandex.go.design.widget.qr.QrTargetView) obj).invalidate();
                break;
        }
    }
}
