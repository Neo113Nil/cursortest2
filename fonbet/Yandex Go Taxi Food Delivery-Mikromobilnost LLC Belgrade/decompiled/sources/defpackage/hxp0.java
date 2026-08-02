package defpackage;

import android.view.View;
import com.google.android.material.search.SearchView;

/* loaded from: classes11.dex */
public final /* synthetic */ class hxp0 implements hw31, bx60 {
    public final /* synthetic */ SearchView a;

    public /* synthetic */ hxp0(SearchView searchView) {
        this.a = searchView;
    }

    @Override // defpackage.hw31
    public n751 k(View view, n751 n751Var, iw31 iw31Var) {
        n751 lambda$setUpToolbarInsetListener$5;
        lambda$setUpToolbarInsetListener$5 = this.a.lambda$setUpToolbarInsetListener$5(view, n751Var, iw31Var);
        return lambda$setUpToolbarInsetListener$5;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 lambda$setUpStatusBarSpacerInsetListener$6;
        lambda$setUpStatusBarSpacerInsetListener$6 = this.a.lambda$setUpStatusBarSpacerInsetListener$6(view, n751Var);
        return lambda$setUpStatusBarSpacerInsetListener$6;
    }
}
