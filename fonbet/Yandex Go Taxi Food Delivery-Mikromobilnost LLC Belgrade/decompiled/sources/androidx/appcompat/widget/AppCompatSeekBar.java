package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import defpackage.iog0;
import defpackage.vr2;
import defpackage.vwy0;

/* loaded from: classes10.dex */
public class AppCompatSeekBar extends SeekBar {
    private final vr2 mAppCompatSeekBarHelper;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vwy0.a(getContext(), this);
        vr2 vr2Var = new vr2(this);
        this.mAppCompatSeekBarHelper = vr2Var;
        vr2Var.a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        vr2 vr2Var = this.mAppCompatSeekBarHelper;
        AppCompatSeekBar appCompatSeekBar = vr2Var.d;
        Drawable drawable = vr2Var.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(appCompatSeekBar.getDrawableState())) {
            appCompatSeekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mAppCompatSeekBarHelper.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mAppCompatSeekBarHelper.d(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iog0.seekBarStyle);
    }

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }
}
