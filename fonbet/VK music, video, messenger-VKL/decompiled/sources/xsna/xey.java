package xsna;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.tool.view.disableable.DisableableRelativeLayout;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c63;
import xsna.hfr;
import xsna.ify;
import xsna.iut0;
import xsna.wey;

/* compiled from: KeyboardAnimator.kt */
/* loaded from: classes2.dex */
public final class xey extends c63.b implements ify.a {
    public static final Set<View> k = Collections.newSetFromMap(new WeakHashMap());
    public final Window b;
    public final View c;
    public final FragmentActivity d;
    public final View e;
    public final hfr f;
    public boolean g;
    public boolean h;
    public final ArrayList i = new ArrayList();
    public final wey j;

    /* compiled from: KeyboardAnimator.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<a, s3q0> {
        public static final b b = new b(1, a.class, "onAnimationStarted", "onAnimationStarted()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(a aVar) {
            aVar.c();
            return s3q0.a;
        }
    }

    /* compiled from: KeyboardAnimator.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<a, s3q0> {
        public static final c b = new c(1, a.class, "onAnimationStopped", "onAnimationStopped()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(a aVar) {
            aVar.d();
            return s3q0.a;
        }
    }

    /* compiled from: KeyboardAnimator.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<a, s3q0> {
        public static final d b = new d(1, a.class, "onOpenKeyboard", "onOpenKeyboard()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(a aVar) {
            aVar.getClass();
            return s3q0.a;
        }
    }

    /* compiled from: KeyboardAnimator.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<a, s3q0> {
        public static final e b = new e(1, a.class, "onCloseKeyboard", "onCloseKeyboard()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(a aVar) {
            aVar.e();
            return s3q0.a;
        }
    }

    public xey(Window window, DisableableRelativeLayout disableableRelativeLayout, FragmentActivity fragmentActivity, View view, hfr hfrVar) {
        wey weyVar;
        this.b = window;
        this.c = disableableRelativeLayout;
        this.d = fragmentActivity;
        this.e = view;
        this.f = hfrVar;
        if (BuildInfo.s()) {
            wey.b bVar = new wey.b();
            bVar.a = true;
            bVar.b = true;
            weyVar = bVar;
        } else {
            weyVar = BuildInfo.t() ? new wey.c() : BuildInfo.g() ? new wey.c() : BuildInfo.r() ? new wey.c() : wey.a.a;
        }
        this.j = weyVar;
    }

    public final void D(a aVar) {
        this.i.add(aVar);
    }

    public final void E() {
        if (this.h) {
            wey weyVar = this.j;
            View view = this.c;
            FitSystemWindowsFrameLayout e2 = weyVar.e(view);
            if (!gz80.a(30) || e2 == null) {
                return;
            }
            this.h = false;
            Set<View> set = k;
            set.remove(view);
            if (set.size() == 0) {
                if (this.g) {
                    this.g = false;
                } else {
                    ppx0.b(this.b, true);
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    aqx0.a(e2, null);
                    iut0.d.c(e2, null);
                    e2.setPadding(0, 0, 0, 0);
                    weyVar.b(view);
                }
            }
            hfr hfrVar = this.f;
            hfrVar.getClass();
            hfr.a aVar = new hfr.a(hfrVar);
            while (aVar.hasNext()) {
                View view2 = (View) aVar.next();
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                aqx0.a(view2, null);
            }
            WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
            aqx0.a(this.e, null);
            int i = ify.a;
            ify.g(this);
            c63 c63Var = c63.a;
            c63.c(this);
        }
    }

    public final void F() {
        if (this.h) {
            return;
        }
        wey weyVar = this.j;
        View view = this.c;
        FitSystemWindowsFrameLayout e2 = weyVar.e(view);
        if (!gz80.a(30) || e2 == null) {
            return;
        }
        this.h = true;
        this.g = false;
        weyVar.d(view);
        omg0 omg0Var = new omg0(new u3k(this, 24), new w8q(this, 17), new n5i(this, 26), new jcg(this, 28));
        ppx0.b(this.b, false);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        aqx0.a(e2, omg0Var);
        iut0.d.c(e2, omg0Var);
        k.add(view);
        hfr hfrVar = this.f;
        hfrVar.getClass();
        hfr.a aVar = new hfr.a(hfrVar);
        while (aVar.hasNext()) {
            View view2 = (View) aVar.next();
            view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            eop0 eop0Var = new eop0(view2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            aqx0.a(view2, eop0Var);
        }
        View view3 = this.e;
        view3.setVisibility(8);
        int i = ify.a;
        bwt0.c0(ify.d(3, null), view3);
        view3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        zey zeyVar = new zey(view3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
        aqx0.a(view3, zeyVar);
        ify.a(this);
        c63 c63Var = c63.a;
        c63.a(this);
    }

    public final void G(izs<? super a, s3q0> izsVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            izsVar.invoke((a) it.next());
        }
    }

    public final void H() {
        wey weyVar = this.j;
        View view = this.c;
        FitSystemWindowsFrameLayout e2 = weyVar.e(view);
        if (!gz80.a(30) || e2 == null) {
            return;
        }
        weyVar.a(view);
    }

    public final void I() {
        wey weyVar = this.j;
        View view = this.c;
        FitSystemWindowsFrameLayout e2 = weyVar.e(view);
        if (!gz80.a(30) || e2 == null) {
            return;
        }
        weyVar.f(view);
    }

    @Override // xsna.c63.b
    public final void o(Activity activity) {
        if (activity == this.d) {
            this.g = true;
        }
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        bwt0.c0(i, this.e);
    }

    /* compiled from: KeyboardAnimator.kt */
    public interface a {
        default void c() {
        }

        default void d() {
        }

        default void e() {
        }
    }

    @Override // xsna.ify.a
    public final void Y0() {
    }
}
