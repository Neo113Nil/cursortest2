package xsna;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ContentHeightSnapStrategyWithoutToolbarThreshold.kt */
/* loaded from: classes3.dex */
public final class kgj extends jgj {
    public kgj(ComposeView composeView) {
        super(composeView, 0, -1, true, false);
    }

    @Override // xsna.jgj, com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        View view = this.a;
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight == 0) {
            view.measure(0, 0);
            measuredHeight = view.getMeasuredHeight();
        }
        int i4 = measuredHeight + this.b;
        int i5 = jgj.g;
        if (i4 < i5) {
            i4 = i5;
        } else if (i4 > i2) {
            i4 = i2;
        }
        return Math.max(i2 - i4, 0);
    }
}
