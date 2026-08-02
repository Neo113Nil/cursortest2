package one.video.controls.view.seekbar;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import one.video.controls.view.seekbar.ThumbSeekBarView;
import xsna.o7j;
import xsna.y3j;

/* compiled from: ThumbSeekBarView.kt */
/* loaded from: classes8.dex */
public final class ThumbSeekBarView extends CustomSeekBar {
    public static final /* synthetic */ int e = 0;
    public final y3j d;

    public ThumbSeekBarView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public ThumbSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public ThumbSeekBarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ ThumbSeekBarView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.seekBarStyle : i, 0);
    }

    public ThumbSeekBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = new y3j(new o7j() { // from class: xsna.pso0
            @Override // xsna.o7j
            public final void accept(Object obj) {
                qso0 qso0Var = (qso0) obj;
                int i3 = ThumbSeekBarView.e;
                if (qso0Var.b) {
                    return;
                }
                ThumbSeekBarView.this.setVisibility(!qso0Var.a ? 4 : 0);
            }
        });
    }
}
