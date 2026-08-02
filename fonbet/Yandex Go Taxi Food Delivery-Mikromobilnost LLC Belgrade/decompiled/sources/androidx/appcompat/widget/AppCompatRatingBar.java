package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import defpackage.iog0;
import defpackage.tr2;
import defpackage.vwy0;

/* loaded from: classes10.dex */
public class AppCompatRatingBar extends RatingBar {
    private final tr2 mAppCompatProgressBarHelper;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vwy0.a(getContext(), this);
        tr2 tr2Var = new tr2(this);
        this.mAppCompatProgressBarHelper = tr2Var;
        tr2Var.a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.mAppCompatProgressBarHelper.b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iog0.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }
}
