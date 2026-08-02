package xsna;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: MarketShopConditionsBottomSheet.kt */
/* loaded from: classes18.dex */
public final class kej0 extends com.vk.core.ui.bottomsheet.internal.b {
    public final View a;
    public final View b;

    public kej0(ComposeView composeView, ComposeView composeView2) {
        this.a = composeView;
        this.b = composeView2;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean a() {
        return true;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean b() {
        return true;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        String str = dw20.d1;
        int min = Math.min(i3, dw20.e1);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        View view = this.b;
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i2 - view.getMeasuredHeight(), Integer.MIN_VALUE);
        View view2 = this.a;
        view2.measure(makeMeasureSpec3, makeMeasureSpec4);
        return i2 - Math.min(view.getMeasuredHeight() + view2.getMeasuredHeight(), i2);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        return 0;
    }
}
