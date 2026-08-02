package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: OrderProductModalBottomSheet.kt */
/* loaded from: classes18.dex */
public final class zw80 {
    public final xw80 a;
    public final ComposeView b;

    /* compiled from: OrderProductModalBottomSheet.kt */
    public static final class a extends com.vk.core.ui.bottomsheet.internal.b {
        public final View a;

        public a(ComposeView composeView) {
            this.a = composeView;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.b
        public final int c(int i, int i2, int i3) {
            View view = this.a;
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight == 0) {
                view.measure(0, 0);
                measuredHeight = view.getMeasuredHeight();
            }
            return i2 - Integer.max(measuredHeight, i2);
        }

        @Override // com.vk.core.ui.bottomsheet.internal.b
        public final int d(int i, int i2, int i3) {
            int i4 = i2 - i;
            return i4 > i2 ? i2 : i4;
        }
    }

    public zw80(Context context, xw80 xw80Var) {
        this.a = xw80Var;
        ComposeView composeView = new ComposeView(context, null, 6);
        vq.b(-1, -2, composeView);
        this.b = composeView;
        composeView.setContent(new jai(1054331618, new com.vk.movika.tools.controls.seekbar.p(this, 7), true));
    }
}
