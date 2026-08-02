package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class dwt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ wx0 c;

    public dwt0(FirstPinnedTabLayout firstPinnedTabLayout, wx0 wx0Var) {
        this.b = firstPinnedTabLayout;
        this.c = wx0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m50 m50Var = new m50(this.c, 10);
        View view2 = this.b;
        view2.postDelayed(m50Var, 0L);
        view2.removeOnLayoutChangeListener(this);
    }
}
