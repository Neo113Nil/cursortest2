package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: RxExtCore.kt */
/* loaded from: classes17.dex */
public final class gtg0 extends FragmentManager.m {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c a;

    public gtg0(io.reactivex.rxjava3.disposables.c cVar) {
        this.a = cVar;
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public final void c(FragmentManager fragmentManager, Fragment fragment) {
        this.a.dispose();
    }
}
