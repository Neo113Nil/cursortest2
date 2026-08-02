package xsna;

import android.R;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ProgressBar;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class gdy0 extends ProgressBar implements yrz0 {
    public gdy0(Context context) {
        super(context, null, R.attr.progressBarStyleHorizontal);
    }

    @Override // xsna.yrz0
    public void setColor(int i) {
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(i), 8388611, 1);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
        layerDrawable.setDrawableByLayerId(R.id.background, colorDrawable);
        layerDrawable.setDrawableByLayerId(R.id.progress, clipDrawable);
        setProgressDrawable(layerDrawable);
    }

    @Override // xsna.yrz0
    public void setMaxTime(float f) {
        setMax((int) (f * 1000.0f));
    }

    @Override // xsna.yrz0
    public void setTimeChanged(float f) {
        setProgress((int) (f * 1000.0f), true);
    }

    @Override // xsna.yrz0
    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }
}
