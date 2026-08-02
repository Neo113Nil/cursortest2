package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.exceptions.FragmentNavigationException;
import com.vk.core.fragments.impl.support.ParentSupportFragment;
import com.vk.core.fragments.internal.transition.TransitionAnimation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.hfr;
import xsna.qj2;

/* compiled from: ParentSupportFragmentManager.kt */
/* loaded from: classes.dex */
public class ui90<T extends ParentSupportFragment> implements oi90<T> {
    public final FragmentManager a;
    public final WeakReference<Context> b;
    public gzs<? extends hds> c;
    public final bpn0 d;
    public final LinkedHashSet e;
    public androidx.fragment.app.a f;

    /* compiled from: ParentSupportFragmentManager.kt */
    /* loaded from: classes17.dex */
    public interface a {
        void b(FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2);
    }

    /* compiled from: _Sequences.kt */
    /* loaded from: classes17.dex */
    public static final class b implements izs<Object, Boolean> {
        public static final b b = new b();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof FragmentImpl);
        }
    }

    public ui90(Activity activity) {
        int i = 7;
        this.c = new m(i);
        this.d = new bpn0(new xsa(this, i));
        this.e = new LinkedHashSet();
        this.a = ((AppCompatActivity) activity).getSupportFragmentManager();
        this.b = new WeakReference<>(activity);
    }

    public static void j() {
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        com.vk.metrics.eventtracking.b.a.a(new FragmentNavigationException());
    }

    public final void a(int i, FragmentImpl fragmentImpl, String str, boolean z) {
        if (!z) {
            o(fragmentImpl, true, true, ((hds) this.d.getValue()).b(fragmentImpl));
        }
        androidx.fragment.app.a aVar = this.f;
        if (aVar != null) {
            aVar.f(i, fragmentImpl, str, 1);
        }
    }

    @SuppressLint({"CommitTransaction"})
    public final void c() {
        FragmentManager fragmentManager = this.a;
        this.f = tk5.b(fragmentManager, fragmentManager);
    }

    public final void d() {
        try {
            androidx.fragment.app.a aVar = this.f;
            if (aVar != null) {
                aVar.m();
            }
        } catch (IllegalStateException e) {
            com.vk.metrics.eventtracking.b.a.q(e);
            androidx.fragment.app.a aVar2 = this.f;
            if (aVar2 != null) {
                aVar2.k(true);
            }
        }
        this.f = null;
    }

    public final void e(boolean z) {
        hfr.a aVar = new hfr.a(rli0.l(rli0.j(new i5g(this.a.c.f()), b.b), new j5n(18)));
        while (aVar.hasNext()) {
            FragmentImpl fragmentImpl = (FragmentImpl) aVar.next();
            if (z) {
                fragmentImpl.rn();
            } else {
                fragmentImpl.sn();
            }
        }
    }

    public final T f(int i) {
        return (T) this.a.G(i);
    }

    @Override // xsna.oi90
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final T b(String str) {
        return (T) this.a.H(str);
    }

    public final ArrayList h() {
        List<Fragment> f = this.a.c.f();
        ArrayList arrayList = new ArrayList(c5g.u(f, 10));
        Iterator<T> it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(new ui90((ParentSupportFragment) ((Fragment) it.next())));
        }
        return arrayList;
    }

    public final void i(FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2, boolean z) {
        if (fragmentImpl2 != null) {
            FragmentImpl fragmentImpl3 = !z ? fragmentImpl2 : null;
            if (fragmentImpl3 != null) {
                o(fragmentImpl, false, false, ((hds) this.d.getValue()).b(fragmentImpl3));
            }
        }
        androidx.fragment.app.a aVar = this.f;
        if (aVar != null) {
            aVar.p(fragmentImpl);
        }
        j();
        Iterator it = p4g.d(this.e).iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(fragmentImpl2, fragmentImpl);
        }
    }

    public final void k(FragmentImpl fragmentImpl) {
        o(fragmentImpl, true, false, ((hds) this.d.getValue()).b(fragmentImpl));
        androidx.fragment.app.a aVar = this.f;
        if (aVar != null) {
            aVar.q(fragmentImpl);
        }
    }

    public final void l(a aVar) {
        this.e.remove(aVar);
        j();
    }

    public final void m(FragmentImpl fragmentImpl) {
        View view;
        androidx.fragment.app.a aVar;
        for (Map.Entry entry : ((hds) this.d.getValue()).a(fragmentImpl).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Context context = this.b.get();
            if (context != null) {
                view = new View(context);
                view.setTransitionName(str);
            } else {
                view = null;
            }
            if (view != null && (aVar = this.f) != null) {
                aVar.c(view, str2);
            }
        }
    }

    public final void n(FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2, boolean z) {
        if (fragmentImpl2 != null) {
            FragmentImpl fragmentImpl3 = !z ? fragmentImpl2 : null;
            if (fragmentImpl3 != null) {
                o(fragmentImpl, false, true, ((hds) this.d.getValue()).b(fragmentImpl3));
            }
        }
        androidx.fragment.app.a aVar = this.f;
        if (aVar != null) {
            aVar.s(fragmentImpl);
        }
        j();
        Iterator it = p4g.d(this.e).iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(fragmentImpl, fragmentImpl2);
        }
    }

    public final void o(T t, boolean z, boolean z2, TransitionAnimation.Animations animations) {
        androidx.fragment.app.a aVar;
        if (animations == null || (aVar = this.f) == null) {
            return;
        }
        Pair pair = (z && z2) ? new Pair(animations.d(), qj2.a.a(t)) : z ? new Pair(animations.e(), qj2.a.b(t)) : z2 ? new Pair(animations.f(), qj2.a.c(t)) : new Pair(animations.g(), qj2.a.d(t));
        TransitionAnimation transitionAnimation = (TransitionAnimation) pair.d();
        qj2 qj2Var = (qj2) pair.g();
        transitionAnimation.X4(aVar, qj2Var);
        aVar.h(new h(9, transitionAnimation, qj2Var), false);
    }

    public ui90(T t) {
        this.c = new f4(28);
        this.d = new bpn0(new xsa(this, 7));
        this.e = new LinkedHashSet();
        this.a = t.getChildFragmentManager();
        this.b = new WeakReference<>(t.requireContext());
    }
}
