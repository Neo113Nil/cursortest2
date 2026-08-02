package one.video.controls.view.seekbar;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import xsna.ix70;
import xsna.y3j;

/* compiled from: ProgressSeekBarView.kt */
/* loaded from: classes8.dex */
public final class ProgressSeekBarView extends CustomSeekBar {
    public static final /* synthetic */ int e = 0;
    public final y3j d;

    public ProgressSeekBarView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public ProgressSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public ProgressSeekBarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ ProgressSeekBarView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.seekBarStyle : i, 0);
    }

    public ProgressSeekBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        getThumb().setAlpha(0);
        setEnabled(false);
        this.d = new y3j(new ix70(this, 1));
    }
}
