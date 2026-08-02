package xsna;

import android.content.Context;
import android.graphics.Paint;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.EdgeSlidingPaneLayout;

/* compiled from: NavigationDelegateLeftMenu.java */
/* loaded from: classes7.dex */
public final class ay50 extends EdgeSlidingPaneLayout {
    public final /* synthetic */ yx50 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay50(yx50 yx50Var, Context context) {
        super(context, null);
        this.E = yx50Var;
        Paint paint = new Paint();
        this.A = paint;
        paint.setColor(dhr0.t.c(R.attr.vk_ui_header_background));
        this.C = m33.a(R.drawable.shadow_menu_tablet_inner, getContext());
    }

    @Override // com.vkontakte.android.ui.EdgeSlidingPaneLayout, androidx.slidingpanelayout.widget.SlidingPaneLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.E.q0();
    }
}
