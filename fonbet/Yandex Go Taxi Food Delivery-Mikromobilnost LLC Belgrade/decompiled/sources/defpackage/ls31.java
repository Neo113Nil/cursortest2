package defpackage;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public final class ls31 {
    public static final ks31 b = new ks31();
    public final ofa0 a;

    public ls31(rs31 rs31Var, hs31 hs31Var) {
        this(rs31Var.getViewModelStore(), hs31Var, rs31Var instanceof q7u ? ((q7u) rs31Var).getDefaultViewModelCreationExtras() : w8f.b);
    }

    public final yr31 a(g0c g0cVar) {
        String c = g0cVar.c();
        if (c != null) {
            return this.a.B(g0cVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(c));
        }
        ny61.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final yr31 b(Class cls) {
        return a(qoi0.a(cls));
    }

    public ls31(qs31 qs31Var, hs31 hs31Var, y8f y8fVar) {
        this.a = new ofa0(qs31Var, hs31Var, y8fVar);
    }

    public ls31(FragmentActivity fragmentActivity) {
        this(fragmentActivity.getViewModelStore(), fragmentActivity.getDefaultViewModelProviderFactory(), fragmentActivity.getDefaultViewModelCreationExtras());
    }

    public /* synthetic */ ls31(qs31 qs31Var, hs31 hs31Var, int i) {
        this(qs31Var, hs31Var, w8f.b);
    }
}
