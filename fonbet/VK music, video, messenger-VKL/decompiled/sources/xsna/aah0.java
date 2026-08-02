package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: ScopeInjector.kt */
/* loaded from: classes6.dex */
public final class aah0 {
    public final FragmentManager a;
    public final a b;

    /* compiled from: ScopeInjector.kt */
    public static final class a extends FragmentManager.m {
        public final nnp0 a;

        public a(nnp0 nnp0Var) {
            this.a = nnp0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.FragmentManager.m
        public final void f(Fragment fragment) {
            if (fragment instanceof bop0) {
                ((bop0) fragment).Q3(this.a);
            }
        }
    }

    public aah0(nnp0 nnp0Var, FragmentManager fragmentManager) {
        this.a = fragmentManager;
        a aVar = new a(nnp0Var);
        this.b = aVar;
        fragmentManager.c0(aVar, true);
    }
}
