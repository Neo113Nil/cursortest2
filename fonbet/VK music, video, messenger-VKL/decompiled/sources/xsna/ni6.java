package xsna;

import android.app.Activity;
import com.vk.navigation.NavigationDelegateActivity;
import java.util.concurrent.Callable;
import xsna.xbs;

/* compiled from: BaseNavigationDelegate.kt */
/* loaded from: classes.dex */
public abstract class ni6<T extends Activity & xbs> extends xdr0<T> {
    public final pjk0 k;
    public boolean l;
    public io.reactivex.rxjava3.disposables.c m;
    public final io.reactivex.rxjava3.core.w n;

    public ni6(NavigationDelegateActivity navigationDelegateActivity, boolean z) {
        super(navigationDelegateActivity, z);
        this.k = new pjk0(this, navigationDelegateActivity);
        this.m = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        this.n = io.reactivex.rxjava3.schedulers.a.d;
    }

    @Override // xsna.xdr0, xsna.ww50
    public void G() {
        super.G();
        this.m.dispose();
    }

    @Override // xsna.ww50
    public void Q() {
        this.m = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.ji6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(!q6r0.f().A() && ni6.this.l);
            }
        }).q(this.n).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new li6(new ki6(this, 0), 0));
    }

    @Override // xsna.xdr0
    public final pjk0 m0() {
        return this.k;
    }
}
