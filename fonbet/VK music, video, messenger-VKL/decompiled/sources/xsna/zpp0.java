package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.NonBouncedAppBarLayout;

/* compiled from: TrendsBackgroundOnOffsetChangedListener.kt */
/* loaded from: classes17.dex */
public final class zpp0 implements NonBouncedAppBarLayout.d {
    public final View a;
    public final aqp0 b;
    public final il1 c;

    public zpp0(View view, aqp0 aqp0Var, il1 il1Var) {
        this.a = view;
        this.b = aqp0Var;
        this.c = il1Var;
    }

    @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
    public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout, int i) {
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = layoutParams.height;
        il1 il1Var = this.c;
        if (i2 != ((Number) il1Var.invoke()).intValue()) {
            layoutParams.height = ((Number) il1Var.invoke()).intValue();
            view.setLayoutParams(layoutParams);
        }
        this.b.c = i;
        view.invalidateOutline();
    }
}
