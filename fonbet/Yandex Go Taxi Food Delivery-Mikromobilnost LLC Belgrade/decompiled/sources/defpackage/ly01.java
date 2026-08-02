package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import ru.yandex.taxi.fragment.BaseFragment;

/* loaded from: classes10.dex */
public final class ly01 extends hes {
    public final FragmentActivity c;
    public Fragment d;
    public boolean e;

    public ly01(FragmentActivity fragmentActivity) {
        this.c = fragmentActivity;
    }

    @Override // defpackage.fc5
    public final void e() {
        super.e();
        Fragment fragment = this.d;
        if (fragment == null) {
            return;
        }
        this.e = true;
        try {
            try {
                FragmentManager supportFragmentManager = this.c.getSupportFragmentManager();
                supportFragmentManager.getClass();
                a aVar = new a(supportFragmentManager);
                aVar.p(fragment);
                aVar.n();
                this.e = false;
                this.d = null;
            } catch (Exception e) {
                xby.l(jst.e, "AFR:TRANSACTION:FAILED", null, e, "Exception while executing fragment transaction", 2);
                throw e;
            }
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }

    @Override // defpackage.hes
    public final boolean f() {
        return this.e;
    }

    @Override // defpackage.hes
    public final void g(BaseFragment baseFragment, oy01 oy01Var) {
        if (c()) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            oy01Var = oy01.a;
        }
        Fragment E = this.c.getSupportFragmentManager().E(fjh0.fragment_host);
        this.d = E;
        if (E == baseFragment) {
            this.d = null;
            e();
            return;
        }
        z8u0 z8u0Var = new z8u0(3, this, baseFragment);
        this.e = true;
        try {
            try {
                z8u0Var.invoke();
                this.e = false;
                Fragment fragment = this.d;
                View view = fragment != null ? fragment.getView() : null;
                View view2 = baseFragment.getView();
                if (view == null || view2 == null) {
                    e();
                } else {
                    b(view, view2, oy01Var, ValueAnimator.ofFloat(0.0f, 1.0f));
                }
            } catch (Exception e) {
                xby.l(jst.e, "AFR:TRANSACTION:FAILED", null, e, "Exception while executing fragment transaction", 2);
                throw e;
            }
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }
}
