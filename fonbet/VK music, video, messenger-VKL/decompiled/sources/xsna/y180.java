package xsna;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: OnBoardingContentHeightSnapStrategy.kt */
/* loaded from: classes5.dex */
public final class y180 extends com.vk.core.ui.bottomsheet.internal.b {
    public final View a;

    public y180(ComposeView composeView) {
        this.a = composeView;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean a() {
        return true;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        return i2 - this.a.getMeasuredHeight();
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        return 0;
    }
}
