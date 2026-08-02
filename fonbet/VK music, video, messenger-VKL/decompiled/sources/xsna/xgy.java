package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import xsna.ify;

/* compiled from: KeyboardPopup.kt */
/* loaded from: classes6.dex */
public final class xgy {
    public static final int F = iah0.a(350);
    public static final int G = iah0.a(260);
    public static final int H = iah0.a(48);
    public static final prl<View, Integer> I = new prl<>();
    public static final lr J = new lr(19);
    public final int[] A;
    public final int[] B;
    public boolean C;
    public final ugy D;
    public final vkt E;
    public final Activity a;
    public final View b;
    public final View c;
    public final Window d;
    public final boolean e;
    public final a f;
    public final boolean g;
    public boolean h;
    public final boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public f3y0 n;
    public b o;
    public PopupWindow p;
    public ewb0 q;
    public io.reactivex.rxjava3.disposables.c r;
    public final Handler s;
    public final View t;
    public ViewTreeObserver u;
    public final Rect v;
    public boolean w;
    public boolean x;
    public int y;
    public View z;

    /* compiled from: KeyboardPopup.kt */
    public interface a {
        int getHeight();
    }

    public xgy(Activity activity, View view, View view2, Window window, boolean z, a aVar, boolean z2) {
        this.a = activity;
        this.b = view;
        this.c = view2;
        this.d = window;
        this.e = z;
        this.f = aVar;
        this.g = z2;
        this.h = true;
        this.i = true;
        this.q = new ewb0(0);
        this.s = new Handler(Looper.getMainLooper());
        g2v.d().d().getClass();
        this.t = view;
        this.v = new Rect();
        this.y = R.style.keyboard_pop_up_animation;
        this.A = new int[]{0, 0};
        this.B = new int[]{0, 0};
        this.D = new ugy();
        this.E = new vkt(this, 1);
    }

    public final void a(View view, Integer num) {
        this.z = view;
        this.q = new ewb0(num != null ? num.intValue() : (view == null || !(view.getContext() instanceof l7s)) ? dhr0.t.c(R.attr.vk_ui_background_content) : e3m.f(R.attr.vk_ui_background_content, view.getContext()));
    }

    public final int b() {
        View view = this.b;
        Rect rect = this.v;
        view.getWindowVisibleDisplayFrame(rect);
        int i = ify.a;
        return (ify.e(ify.c) || this.l) ? rect.bottom : rect.bottom - this.f.getHeight();
    }

    public final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver = this.u;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return viewTreeObserver;
        }
        ViewTreeObserver viewTreeObserver2 = this.d.getDecorView().getViewTreeObserver();
        this.u = viewTreeObserver2;
        return viewTreeObserver2;
    }

    public final void d() {
        g();
        b bVar = this.o;
        if (bVar != null) {
            bVar.q(this);
        }
    }

    public final boolean e() {
        PopupWindow popupWindow = this.p;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int i;
        PopupWindow popupWindow;
        if (!this.e && e()) {
            int i2 = ify.a;
            boolean e = ify.e(ify.c);
            int height = this.f.getHeight();
            boolean z = this.w;
            Activity activity = this.a;
            boolean z2 = z != iah0.s(activity);
            if ((this.x != e && !this.l) || z2) {
                d();
                return;
            }
            View view = this.b;
            if (view.getParent() instanceof FitSystemWindowsFrameLayout) {
                ViewParent parent = view.getParent().getParent();
                FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
                if (frameLayout != null) {
                    i = frameLayout.getLeft();
                    popupWindow = this.p;
                    if (popupWindow != null) {
                        popupWindow.update(i, b(), view.getWidth(), height);
                    }
                    if (e && !this.l) {
                        height = 0;
                    }
                    l(height, 0L);
                    this.w = iah0.s(activity);
                }
            }
            i = 0;
            popupWindow = this.p;
            if (popupWindow != null) {
            }
            if (e) {
                height = 0;
            }
            l(height, 0L);
            this.w = iah0.s(activity);
        }
    }

    public final void g() {
        if (e()) {
            ViewTreeObserver c2 = c();
            ugy ugyVar = this.D;
            c2.removeOnPreDrawListener(ugyVar);
            this.C = false;
            this.s.removeCallbacksAndMessages(null);
            View view = this.b;
            view.getViewTreeObserver().removeOnPreDrawListener(ugyVar);
            view.removeOnLayoutChangeListener(this.E);
            PopupWindow popupWindow = this.p;
            if (popupWindow != null) {
                popupWindow.setAnimationStyle(R.style.keyboard_pop_up_animation);
                popupWindow.update();
                popupWindow.dismiss();
                io.reactivex.rxjava3.disposables.c cVar = this.r;
                if (cVar != null) {
                    cVar.dispose();
                }
            }
            this.u = null;
            if (this.e) {
                return;
            }
            prl<View, Integer> prlVar = I;
            Integer put = prlVar.put(view, Integer.valueOf(prlVar.get(view).intValue() - 1));
            if (put != null && put.intValue() == 1) {
                l(0, 0L);
            }
            Object tag = this.d.getDecorView().getTag(R.id.keyboard_popup_tag);
            Set set = ttp0.h(tag) ? (Set) tag : null;
            if (set != null) {
                set.remove(this.c);
            }
        }
    }

    public final void h(Boolean bool) {
        PopupWindow popupWindow;
        if (e()) {
            return;
        }
        this.s.removeCallbacksAndMessages(null);
        Window window = this.d;
        View decorView = window.getDecorView();
        if (!decorView.isAttachedToWindow()) {
            yce yceVar = new yce(this, 29);
            qcy<Object>[] qcyVarArr = bwt0.a;
            if (decorView.isAttachedToWindow()) {
                throw new IllegalStateException("View is already attached to window");
            }
            decorView.addOnAttachStateChangeListener(new jwt0(yceVar));
            return;
        }
        PopupWindow popupWindow2 = this.p;
        View view = this.c;
        if (popupWindow2 == null) {
            PopupWindow popupWindow3 = new PopupWindow(view);
            popupWindow3.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: xsna.vgy
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    xgy xgyVar = xgy.this;
                    io.reactivex.rxjava3.disposables.c cVar = xgyVar.r;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    f3y0 f3y0Var = xgyVar.n;
                    if (f3y0Var != null) {
                        f3y0Var.c0();
                    }
                }
            });
            this.p = popupWindow3;
        }
        if (gz80.a(30)) {
            Features.Type type = Features.Type.FEATURE_IM_KEYBOARD_ANIMATION;
            type.getClass();
            if (com.vk.toggle.b.A.a(type) && (popupWindow = this.p) != null) {
                popupWindow.setInputMethodMode(1);
            }
        }
        Activity activity = this.a;
        this.w = iah0.s(activity);
        vkt vktVar = this.E;
        View view2 = this.b;
        view2.addOnLayoutChangeListener(vktVar);
        view2.addOnAttachStateChangeListener(new c(view2, this));
        io.reactivex.rxjava3.disposables.c cVar = this.r;
        if (cVar != null) {
            cVar.dispose();
        }
        ucp ucpVar = ucp.a;
        this.r = ucp.a().subscribe(new cp0(new iie(this, 19), 27));
        if (!this.e) {
            if (!this.m && ify.e(ify.c) && this.k) {
                mhy.d(window.getDecorView());
                j(true, bool);
                return;
            } else {
                if (this.m || !ify.e(ify.c)) {
                    j(false, bool);
                    return;
                }
                mhy.d(window.getDecorView());
                int i = ify.a;
                ify.a(new d(bool));
                return;
            }
        }
        PopupWindow popupWindow4 = this.p;
        if (popupWindow4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        popupWindow4.setAnimationStyle(-1);
        popupWindow4.setWidth(F);
        popupWindow4.setHeight(G);
        popupWindow4.setBackgroundDrawable(this.q);
        popupWindow4.setOutsideTouchable(this.h);
        View view3 = this.z;
        if (view3 != null) {
            popupWindow4.showAsDropDown(view3, -((popupWindow4.getWidth() / 2) - (view3.getWidth() / 2)), 0);
            view3.getLocationOnScreen(this.A);
        }
        View decorView2 = window.getDecorView();
        Rect rect = this.v;
        decorView2.getWindowVisibleDisplayFrame(rect);
        if (popupWindow4.getHeight() > rect.height()) {
            mhy.d(activity.getCurrentFocus());
        }
        awt0.t(view, new qbj(this, 24));
    }

    public final void j(boolean z, Boolean bool) {
        boolean e;
        PopupWindow popupWindow = this.p;
        if (popupWindow == null) {
            throw new IllegalStateException("Required value was null.");
        }
        prl<View, Integer> prlVar = I;
        View view = this.b;
        prlVar.put(view, Integer.valueOf(prlVar.get(view).intValue() + 1));
        Window window = this.d;
        View decorView = window.getDecorView();
        Object tag = decorView.getTag(R.id.keyboard_popup_tag);
        Set set = ttp0.h(tag) ? (Set) tag : null;
        if (set == null) {
            set = Collections.newSetFromMap(new WeakHashMap());
        }
        if (set != null) {
            set.add(this.c);
        }
        decorView.setTag(R.id.keyboard_popup_tag, set);
        int height = this.f.getHeight();
        int p = iah0.p(this.a) - H;
        if (height > p) {
            height = p;
        }
        if (bool != null) {
            e = bool.booleanValue();
        } else {
            int i = ify.a;
            e = ify.e(ify.c);
        }
        int i2 = 0;
        int i3 = (z || e) ? 0 : this.y;
        long j = i3 == 0 ? 0L : 160L;
        int i4 = e ? 0 : height;
        popupWindow.setHeight(View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        popupWindow.setWidth(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824));
        popupWindow.setAnimationStyle(i3);
        View decorView2 = window.getDecorView();
        if (decorView2.getWindowToken() != null) {
            if (this.j) {
                Rect rect = new Rect();
                f4m.d(rect, view);
                i2 = rect.left;
            }
            popupWindow.showAtLocation(decorView2, 8388659, i2, b());
        }
        this.y = R.style.keyboard_pop_up_animation;
        this.x = e;
        l(i4, j);
        b bVar = this.o;
        if (bVar != null) {
            bVar.E(e, this);
        }
    }

    public final void k() {
        if (e()) {
            d();
        } else {
            h(null);
        }
    }

    public final void l(final int i, long j) {
        if (j == 0 && !this.C) {
            this.C = true;
            c().addOnPreDrawListener(this.D);
        }
        Handler handler = this.s;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new Runnable() { // from class: xsna.wgy
            @Override // java.lang.Runnable
            public final void run() {
                xgy xgyVar = xgy.this;
                xgyVar.c().removeOnPreDrawListener(xgyVar.D);
                xgyVar.C = false;
                boolean z = xgyVar.g;
                int i2 = i;
                if (z && xgyVar.i) {
                    f4m.v(i2, xgyVar.t);
                } else if (z) {
                    f4m.q(i2, xgyVar.b);
                }
                PopupWindow popupWindow = xgyVar.p;
                if (popupWindow != null) {
                    popupWindow.setAnimationStyle(0);
                    popupWindow.update();
                }
            }
        }, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xgy(Activity activity, View view, View view2, Window window, a aVar, int i) {
        this(activity, view, view2, r4, r12, (i & 32) != 0 ? J : aVar, true);
        boolean z;
        Window window2 = (i & 8) != 0 ? activity.getWindow() : window;
        if ((i & 16) != 0) {
            HashSet hashSet = iah0.a;
            z = fnj.d(activity);
        } else {
            z = false;
        }
    }

    /* compiled from: KeyboardPopup.kt */
    public interface b {
        void E(boolean z, xgy xgyVar);

        void q(xgy xgyVar);

        default void D() {
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class c implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ xgy c;

        public c(View view, xgy xgyVar) {
            this.b = view;
            this.c = xgyVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.d();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    /* compiled from: KeyboardPopup.kt */
    public static final class d implements ify.a {
        public final /* synthetic */ Boolean c;

        public d(Boolean bool) {
            this.c = bool;
        }

        @Override // xsna.ify.a
        public final void Y0() {
            int i = ify.a;
            ify.g(this);
            xgy xgyVar = xgy.this;
            if (xgyVar.e()) {
                return;
            }
            xgyVar.j(true, this.c);
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
        }
    }
}
