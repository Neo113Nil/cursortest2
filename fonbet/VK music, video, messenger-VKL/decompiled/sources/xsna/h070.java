package xsna;

import android.view.View;

/* compiled from: NewsfeedStoriesBlockPlugin.kt */
/* loaded from: classes4.dex */
public final class h070 implements View.OnLayoutChangeListener {
    public final /* synthetic */ d070 b;

    public h070(d070 d070Var) {
        this.b = d070Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        d070 d070Var = this.b;
        View view2 = d070Var.s;
        if (view2 != null) {
            f4m.t(measuredHeight, view2);
        }
        ee eeVar = d070Var.t;
        if (eeVar != null) {
            f4m.t(measuredHeight, eeVar);
        }
    }
}
