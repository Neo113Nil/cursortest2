package xsna;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: AppBarLayout.java */
/* loaded from: classes.dex */
public final class m13 implements u080 {
    public final /* synthetic */ AppBarLayout b;

    public m13(AppBarLayout appBarLayout) {
        this.b = appBarLayout;
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        AppBarLayout appBarLayout = this.b;
        bqx0 bqx0Var2 = appBarLayout.getFitsSystemWindows() ? bqx0Var : null;
        if (!Objects.equals(appBarLayout.h, bqx0Var2)) {
            appBarLayout.h = bqx0Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.w != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return bqx0Var;
    }
}
