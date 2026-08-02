package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.AppBarLayoutWithDrawingOrderCallback;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.ui.components.msg_search.vc.HideReason;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MsgSearchVc.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class iy30 {
    public final mkr0 a;
    public final ox30 b;
    public final Context c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final LayoutInflater g;
    public final bpn0 h;
    public View i;
    public AppBarLayoutWithDrawingOrderCallback j;
    public VkSearchView k;
    public View l;
    public VKTabLayout m;
    public ViewPager n;
    public cw30 o;
    public ikv0 p;
    public io.reactivex.rxjava3.disposables.c u;
    public boolean w;
    public final long q = 180;
    public final long r = 300;
    public final Object s = new Object();
    public final Handler t = new Handler(Looper.getMainLooper());
    public final bpn0 v = new bpn0(new p6y(this, 7));

    /* compiled from: MsgSearchVc.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchMode.values().length];
            try {
                iArr[SearchMode.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchMode.PEERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchMode.CHANNELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public iy30(mkr0 mkr0Var, ox30 ox30Var, Context context, boolean z, boolean z2, boolean z3, g6o0 g6o0Var, k7y k7yVar) {
        this.a = mkr0Var;
        this.b = ox30Var;
        this.c = context;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = LayoutInflater.from(context);
        this.h = new bpn0(new t1h(this, k7yVar, g6o0Var, 2));
    }

    public static final void d(iy30 iy30Var, SearchMode searchMode) {
        int i;
        iy30Var.h(searchMode);
        int i2 = a.$EnumSwitchMapping$0[searchMode.ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 == 2) {
                i = 0;
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 1;
        }
        VKTabLayout vKTabLayout = iy30Var.m;
        VKTabLayout vKTabLayout2 = vKTabLayout == null ? null : vKTabLayout;
        if (vKTabLayout == null) {
            vKTabLayout = null;
        }
        vKTabLayout2.c(vKTabLayout.b(i), true);
    }

    public final ux30 a() {
        return (ux30) this.v.getValue();
    }

    public final boolean b(HideReason hideReason, boolean z) {
        View view = this.i;
        if (view == null) {
            view = null;
        }
        if (!bwt0.K(view)) {
            return false;
        }
        this.t.removeCallbacksAndMessages(this.s);
        io.reactivex.rxjava3.disposables.c cVar = this.u;
        if (cVar != null) {
            cVar.dispose();
        }
        this.u = null;
        AppBarLayoutWithDrawingOrderCallback appBarLayoutWithDrawingOrderCallback = this.j;
        if (appBarLayoutWithDrawingOrderCallback == null) {
            appBarLayoutWithDrawingOrderCallback = null;
        }
        appBarLayoutWithDrawingOrderCallback.g(true, false, true);
        cw30 cw30Var = this.o;
        cw30 cw30Var2 = cw30Var != null ? cw30Var : null;
        x3r x3rVar = new x3r(this, hideReason, z);
        cw30Var2.getClass();
        rvv.f.add(cw30Var2);
        cw30Var2.d = true;
        cw30Var2.a(false);
        View view2 = cw30Var2.b;
        view2.setAlpha(1.0f);
        view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        awt0.t(view2, new fg1(17, cw30Var2, x3rVar));
        return true;
    }

    public final void c(SearchMode searchMode) {
        View view = this.i;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        AppBarLayoutWithDrawingOrderCallback appBarLayoutWithDrawingOrderCallback = this.j;
        if (appBarLayoutWithDrawingOrderCallback == null) {
            appBarLayoutWithDrawingOrderCallback = null;
        }
        appBarLayoutWithDrawingOrderCallback.setVisibility(0);
        ViewPager viewPager = this.n;
        if (viewPager == null) {
            viewPager = null;
        }
        viewPager.setVisibility(4);
        AppBarLayoutWithDrawingOrderCallback appBarLayoutWithDrawingOrderCallback2 = this.j;
        if (appBarLayoutWithDrawingOrderCallback2 == null) {
            appBarLayoutWithDrawingOrderCallback2 = null;
        }
        appBarLayoutWithDrawingOrderCallback2.g(true, false, true);
        ViewPager viewPager2 = this.n;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        if (viewPager2.getAdapter() == null) {
            ViewPager viewPager3 = this.n;
            if (viewPager3 == null) {
                viewPager3 = null;
            }
            viewPager3.addOnAdapterChangeListener(new ky30(this, searchMode));
        } else {
            d(this, searchMode);
        }
        cw30 cw30Var = this.o;
        cw30 cw30Var2 = cw30Var != null ? cw30Var : null;
        dgm dgmVar = new dgm(this, 23);
        cw30Var2.getClass();
        rvv.f.add(cw30Var2);
        cw30Var2.d = true;
        cw30Var2.a(true);
        View view2 = cw30Var2.b;
        view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view2.setScaleX(0.98f);
        view2.setScaleY(0.98f);
        view2.setTranslationY(iah0.a(48));
        awt0.t(view2, new defpackage.u(22, cw30Var2, dgmVar));
        g(300L);
    }

    public final void e(hy30 hy30Var) {
        View view;
        ux30 a2 = a();
        ViewPager viewPager = this.n;
        if (viewPager == null) {
            viewPager = null;
        }
        b0i0 b0i0Var = (b0i0) a2.e.get(Integer.valueOf(viewPager.getCurrentItem()));
        long j = (b0i0Var == null || (view = b0i0Var.a) == null || !bwt0.K(view)) ? 0L : this.r;
        Handler handler = this.t;
        Object obj = this.s;
        handler.removeCallbacksAndMessages(obj);
        handler.postAtTime(new qye(5, this, hy30Var), obj, SystemClock.uptimeMillis() + j);
    }

    public final void f(boolean z) {
        View view;
        ux30 a2 = a();
        ViewPager viewPager = this.n;
        if (viewPager == null) {
            viewPager = null;
        }
        b0i0 b0i0Var = (b0i0) a2.e.get(Integer.valueOf(viewPager.getCurrentItem()));
        if (b0i0Var == null || (view = b0i0Var.a) == null || !bwt0.K(view)) {
            odm odmVar = new odm(this, 26);
            if (z) {
                odmVar.invoke();
                return;
            }
            Handler handler = this.t;
            Object obj = this.s;
            handler.removeCallbacksAndMessages(obj);
            handler.postAtTime(new ds4(odmVar, 4), obj, SystemClock.uptimeMillis() + this.r);
        }
    }

    public final void g(long j) {
        io.reactivex.rxjava3.disposables.c cVar = this.u;
        if (cVar != null) {
            cVar.dispose();
        }
        VkSearchView vkSearchView = this.k;
        if (vkSearchView == null) {
            vkSearchView = null;
        }
        io.reactivex.rxjava3.core.q y = d02.y(vkSearchView, j, 2);
        bqs bqsVar = new bqs(this, 9);
        int i = kwg0.a;
        this.u = y.subscribe(bqsVar, new jwg0("ImMsgSearch"));
    }

    public final void h(SearchMode searchMode) {
        int i = a.$EnumSwitchMapping$0[searchMode.ordinal()];
        if (i == 1) {
            ViewPager viewPager = this.n;
            (viewPager != null ? viewPager : null).setCurrentItem(1);
        } else if (i == 2) {
            ViewPager viewPager2 = this.n;
            (viewPager2 != null ? viewPager2 : null).setCurrentItem(0);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ViewPager viewPager3 = this.n;
            (viewPager3 != null ? viewPager3 : null).setCurrentItem(2);
        }
    }
}
