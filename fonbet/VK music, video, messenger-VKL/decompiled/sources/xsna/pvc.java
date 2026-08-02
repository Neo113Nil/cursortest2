package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipEqualizerBarView.kt */
/* loaded from: classes16.dex */
public final class pvc extends View {
    public static final List<Float> n = e43.l(Float.valueOf(0.4f), Float.valueOf(0.8f), Float.valueOf(0.25f));
    public static final int[] o = {IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 900, 600};
    public final float[] b;
    public final ArrayList c;
    public boolean d;
    public int e;
    public final Paint f;
    public final RectF g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public pvc(Context context) {
        super(context, null, 0);
        float[] L0 = j5g.L0(n);
        this.b = L0;
        k9x k9xVar = new k9x(0, L0.length - 1, 1);
        ArrayList arrayList = new ArrayList(c5g.u(k9xVar, 10));
        j9x it = k9xVar.iterator();
        while (it.d) {
            final int nextInt = it.nextInt();
            float f = this.b[nextInt];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 1.0f - f);
            ofFloat.setDuration(o[nextInt]);
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.ovc
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    pvc pvcVar = pvc.this;
                    pvcVar.b[nextInt] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    pvcVar.invalidate();
                }
            });
            arrayList.add(ofFloat);
        }
        this.c = arrayList;
        this.e = context.getColor(R.color.vk_white);
        Paint paint = new Paint(1);
        paint.setColor(this.e);
        this.f = paint;
        this.g = new RectF();
        this.h = e3m.a(R.dimen.clips_author_cell_equalizer_column_width, context);
        this.i = e3m.a(R.dimen.clips_author_cell_equalizer_column_max_height, context);
        this.j = e3m.a(R.dimen.clips_author_cell_equalizer_column_min_height, context);
        this.k = e3m.a(R.dimen.clips_author_cell_equalizer_column_gap_width, context);
        this.l = e3m.a(R.dimen.clips_author_cell_equalizer_column_corner_radius, context);
        this.m = e3m.a(R.dimen.clips_author_cell_equalizer_size, context);
    }

    public final int getBarColor() {
        return this.e;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((ValueAnimator) it.next()).start();
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ValueAnimator) it.next()).cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        for (int i = 0; i < 3; i++) {
            int i2 = this.h;
            int i3 = this.k;
            int i4 = this.m;
            float f2 = (this.i / 2.0f) + (i4 / 2.0f);
            float f3 = ((i4 / 2.0f) - (((i3 * 2) + (i2 * 3)) / 2.0f)) + ((i3 + i2) * i);
            if (i >= 0) {
                float[] fArr = this.b;
                if (i < fArr.length) {
                    f = fArr[i];
                    float f4 = this.j;
                    RectF rectF = this.g;
                    rectF.set(f3, f2 - (((r4 - r3) * f) + f4), i2 + f3, f2);
                    int i5 = this.l;
                    canvas.drawRoundRect(rectF, i5, i5, this.f);
                }
            }
            f = 0.5f;
            float f42 = this.j;
            RectF rectF2 = this.g;
            rectF2.set(f3, f2 - (((r4 - r3) * f) + f42), i2 + f3, f2);
            int i52 = this.l;
            canvas.drawRoundRect(rectF2, i52, i52, this.f);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.m;
        setMeasuredDimension(i3, i3);
    }

    public final void setAnimating(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        ArrayList arrayList = this.c;
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ValueAnimator) it.next()).start();
            }
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ValueAnimator) it2.next()).cancel();
        }
        int i = 0;
        for (Object obj : n) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            this.b[i] = ((Number) obj).floatValue();
            i = i2;
        }
    }

    public final void setBarColor(int i) {
        this.e = i;
        this.f.setColor(i);
        invalidate();
    }
}
