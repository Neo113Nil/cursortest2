package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;

/* loaded from: classes8.dex */
public final class g1c0 {
    public final float b;
    public final float c;
    public float e;
    public final float f;
    public final float g;
    public final int h;
    public final float[] i;
    public final int[] j;
    public final Paint k;
    public final ArgbEvaluatorCompat a = ArgbEvaluatorCompat.getInstance();
    public final Matrix d = new Matrix();

    public g1c0(Context context) {
        this.b = tje.x(context, 12.0f);
        this.c = tje.x(context, 6.0f);
        this.f = tje.x(context, 2.0f);
        this.g = tje.x(context, 8.0f);
        int color = context.getColor(mqg0.opaque_20_black);
        this.h = color;
        this.i = new float[]{0.0f, 1.0f};
        this.j = new int[]{color, 0};
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        this.k = paint;
    }
}
