package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import java.util.Iterator;
import java.util.List;

/* compiled from: CallVpnSnackbarDelegate.kt */
/* loaded from: classes7.dex */
public final class cb9 {
    public final io.reactivex.rxjava3.core.q<fjw0> a;
    public final FragmentManager b;
    public final a c;
    public final io.reactivex.rxjava3.subjects.d<Boolean> d;

    /* compiled from: CallVpnSnackbarDelegate.kt */
    public static final class a extends FragmentManager.m {
        public a() {
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void b(FragmentManager fragmentManager, Fragment fragment) {
            List<Fragment> f = fragmentManager.c.f();
            cb9 cb9Var = cb9.this;
            if (cb9.a(cb9Var, f)) {
                cb9Var.d.onNext(Boolean.FALSE);
            }
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void c(FragmentManager fragmentManager, Fragment fragment) {
            List<Fragment> f = fragmentManager.c.f();
            cb9 cb9Var = cb9.this;
            if (cb9.a(cb9Var, f)) {
                return;
            }
            cb9Var.d.onNext(Boolean.TRUE);
        }
    }

    public cb9(io.reactivex.rxjava3.core.q<fjw0> qVar, FragmentManager fragmentManager) {
        this.a = qVar;
        this.b = fragmentManager;
        a aVar = new a();
        this.c = aVar;
        this.d = io.reactivex.rxjava3.subjects.d.O0(Boolean.TRUE);
        if (fragmentManager != null) {
            fragmentManager.c0(aVar, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(cb9 cb9Var, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Fragment fragment = (Fragment) obj;
            if ((fragment instanceof CallParticipantsFragment) || (fragment instanceof qtw0) || (fragment instanceof ab9) || (fragment instanceof BroadcastConfigFragment)) {
                break;
            }
        }
        return false;
    }
}
