package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.components.viewcontrollers.msg_list.stb.ScrollToBottomAnimator;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.vm30;

/* compiled from: ScrollToBottomController.kt */
/* loaded from: classes2.dex */
public final class lgh0 {
    public final Object a;
    public final ScrollToBottomAnimator b;
    public final vm30.j c;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public kkm k;
    public final b d = new b();
    public final a e = new a(iah0.a(60));
    public final z00 f = new z00(this, 11);
    public final Object l = msy.a(LazyThreadSafetyMode.NONE, new vt30(this, 29));

    /* compiled from: ScrollToBottomController.kt */
    public final class a extends gc80 {
        public a(int i) {
            super(i);
        }

        @Override // xsna.gc80
        public final void l(boolean z) {
            if (z) {
                lgh0 lgh0Var = lgh0.this;
                lgh0Var.h = true;
                lgh0Var.i = true;
                lgh0Var.j = false;
                lgh0Var.e();
            }
        }

        @Override // xsna.gc80
        public final void m(boolean z) {
            if (z) {
                lgh0 lgh0Var = lgh0.this;
                lgh0Var.h = true;
                lgh0Var.i = false;
                lgh0Var.e();
            }
        }
    }

    /* compiled from: ScrollToBottomController.kt */
    public final class b extends vc80 {
        public b() {
        }

        @Override // xsna.vc80
        public final void l(int i, int i2, int i3) {
            lgh0.this.e();
        }
    }

    public lgh0(Lazy lazy, ScrollToBottomAnimator scrollToBottomAnimator, vm30.j jVar) {
        this.a = lazy;
        this.b = scrollToBottomAnimator;
        this.c = jVar;
    }

    public static boolean b(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ScrollToBottomView a() {
        return (ScrollToBottomView) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(boolean z, boolean z2) {
        if (this.a.isInitialized()) {
            ScrollToBottomAnimator scrollToBottomAnimator = this.b;
            if (z) {
                ScrollToBottomView a2 = a();
                ScrollToBottomAnimator.Animation.Type type = ScrollToBottomAnimator.Animation.Type.HIDE;
                if (!scrollToBottomAnimator.i(a2, type) && bwt0.K(a2)) {
                    long j = (scrollToBottomAnimator.h(a2) || !z2) ? 0L : 200L;
                    float translationY = scrollToBottomAnimator.h(a2) ? a2.getTranslationY() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    float f = (ScrollToBottomAnimator.f(a2) + iah0.a(16)) * 0.75f;
                    scrollToBottomAnimator.d(a2);
                    a2.setVisibility(0);
                    a2.setTranslationY(translationY);
                    ScrollToBottomAnimator.b(scrollToBottomAnimator, a2, type, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, new aj50(scrollToBottomAnimator, 17), 16);
                    Iterator<T> it = scrollToBottomAnimator.e(a2).iterator();
                    while (it.hasNext()) {
                        long j2 = j;
                        ScrollToBottomView scrollToBottomView = a2;
                        scrollToBottomAnimator.j(ScrollToBottomAnimator.a.HIDE, ((Number) it.next()).intValue(), scrollToBottomView, j2);
                        a2 = scrollToBottomView;
                        j = j2;
                    }
                }
            } else {
                scrollToBottomAnimator.g(a());
            }
            a().setOnClickListener(null);
        }
    }

    public final void d(boolean z) {
        this.b.k(a(), z);
        a().setOnClickListener(this.f);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void e() {
        vm30.j jVar = this.c;
        vm30 vm30Var = vm30.this;
        int i = this.g;
        this.g = 0;
        if (this.h) {
            this.g = 8;
        }
        if (this.i) {
            this.g |= 16;
        }
        if (vm30Var.r0) {
            this.g |= 64;
        }
        if (qk30.e(vm30Var.H)) {
            this.g |= 1;
        }
        if (jVar.a() > 0) {
            this.g |= 2;
        }
        if (vm30Var.o(false)) {
            this.g |= 4;
        }
        if (vm30Var.p0) {
            this.g |= 32;
        }
        if (this.j) {
            this.g |= 128;
        }
        int i2 = this.g;
        if (i != i2) {
            if (b(i2, 128)) {
                d(false);
            } else if (!b(this.g, 64)) {
                c(false, false);
            } else if (!b(this.g, 1)) {
                c(false, false);
            } else if (b(this.g, 4)) {
                c(true, true);
            } else if (b(this.g, 2) || b(this.g, 32)) {
                d(false);
            } else if (!b(this.g, 8) && !b(this.g, 4)) {
                d(true);
            } else if (b(this.g, 8) && b(this.g, 16)) {
                d(true);
            } else {
                c(true, true);
            }
        }
        if (this.a.isInitialized()) {
            int a2 = jVar.a();
            a().setCounter(a2);
            a().setContentDescription(a2 > 0 ? a().getContext().getResources().getQuantityString(R.plurals.vkim_accessibility_msg_list_scroll_to_bottom_has_unread, a2, Integer.valueOf(a2)) : a().getContext().getString(R.string.vkim_accessibility_msg_list_scroll_to_bottom_default));
        }
    }
}
