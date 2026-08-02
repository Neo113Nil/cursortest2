package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.hints.Hint;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutBanner;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import xsna.hzp0;
import xsna.m8v0;
import xsna.z0o;

/* compiled from: DonutNewBannerItem.kt */
/* loaded from: classes5.dex */
public final class z0o extends we6 {
    public final iyn g;
    public final com.vk.movika.sdk.base.observable.w h;
    public final myn i;
    public final p3h j;
    public final int k = -244;

    /* compiled from: DonutNewBannerItem.kt */
    public final class a extends vif0<z0o> {
        public boolean n;
        public boolean o;
        public Rect p;
        public Hint q;
        public final Object r;

        public a(vwn vwnVar) {
            super(vwnVar);
            this.r = new Object();
            this.itemView.addOnAttachStateChangeListener(new y0o(this));
            this.itemView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: xsna.w0o
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    z0o.a aVar = z0o.a.this;
                    if (aVar.o) {
                        aVar.o = false;
                        aVar.n = false;
                        r2.j.invoke();
                    } else {
                        if (aVar.n || aVar.q == null) {
                            return;
                        }
                        owi.a(aVar.r, 300L, new m1i(aVar, 8));
                    }
                }
            });
        }

        @Override // xsna.vif0
        public final void i6(z0o z0oVar) {
            vwn vwnVar = (vwn) this.itemView;
            iyn iynVar = z0oVar.g;
            boolean f = epx.f(vwnVar.getComposeViewModel(), iynVar);
            b7 b7Var = null;
            z0o z0oVar2 = z0o.this;
            if (!f) {
                myn mynVar = z0oVar2.i;
                if (!mynVar.c.getAndSet(true)) {
                    new hzp0.h(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BROWSER, null, Long.valueOf(mynVar.a.b), null, null, null, 58, null), MobileOfficialAppsCoreNavStat$EventScreen.GROUP, new CommonCommunitiesStat$TypeDonutBanner(CommonCommunitiesStat$TypeDonutBanner.EventType.DONUT_BANNER_VIEW)).a();
                }
                owi.b(this.r);
                this.q = null;
            }
            vwnVar.setComposeViewModel(iynVar);
            vwnVar.setAdminClickListener(iynVar.h != null ? new com.vk.catalog2.common.ui.holders.a(10, z0oVar2, iynVar) : null);
            vwnVar.setInfoClickListener(iynVar.g != null ? new com.vk.catalog2.common.ui.holders.b(9, z0oVar2, iynVar) : null);
            vwnVar.setGoalsClickListener(new x0o(iynVar, vwnVar, z0oVar2, 0));
            vwnVar.setRegularSupportClickListener(new ax5(iynVar, vwnVar, z0oVar2, 2));
            if (iynVar.k != null && iynVar.h != null) {
                b7Var = new b7(11, this, iynVar);
            }
            vwnVar.setAdminIconRectListener(b7Var);
        }

        public final void q6() {
            Rect rect;
            Lifecycle lifecycle;
            Hint hint = this.q;
            if (hint == null || this.o || this.n) {
                return;
            }
            Rect rect2 = this.p;
            if (rect2 == null) {
                rect = null;
            } else {
                Rect c = f4m.c(this.itemView);
                rect = new Rect(rect2);
                rect.offset(c.left, c.top);
            }
            if (rect == null) {
                return;
            }
            boolean z = false;
            if (this.itemView.isAttachedToWindow() && this.itemView.isShown()) {
                Rect rect3 = new Rect();
                if (this.itemView.getGlobalVisibleRect(rect3)) {
                    z = rect3.contains(rect);
                }
            }
            if (z) {
                f5z e = gqo.e(this.itemView);
                if (((e == null || (lifecycle = e.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) != Lifecycle.State.RESUMED) {
                    return;
                }
                this.q = null;
                int i = m8v0.M;
                View view = this.itemView;
                String str = hint.c;
                if (str == null) {
                    str = "";
                }
                m8v0.a.a(view, str, new mk(9, this, rect), VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.TopLeft, VkTooltip$BalloonTilt.Right, new dkg(this, 12), new nfj(this, 14), null, null, null, new kp5(11, this, z0o.this), null, 0, true, null, null, false, null, false, 16702464);
                this.n = true;
                this.o = true;
            }
        }
    }

    public z0o(iyn iynVar, com.vk.movika.sdk.base.observable.w wVar, myn mynVar, p3h p3hVar) {
        this.g = iynVar;
        this.h = wVar;
        this.i = mynVar;
        this.j = p3hVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        vwn vwnVar = new vwn(viewGroup.getContext());
        vwnVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vwnVar.setTag("donut_new_banner");
        return new a(vwnVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0o)) {
            return false;
        }
        z0o z0oVar = (z0o) obj;
        return epx.f(this.g, z0oVar.g) && epx.f(this.h, z0oVar.h) && epx.f(this.i, z0oVar.i) && epx.f(this.j, z0oVar.j);
    }

    @Override // xsna.we6
    public final int h() {
        return this.k;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DonutNewBannerItem(model=" + this.g + ", actionInvoker=" + this.h + ", blockAnalytics=" + this.i + ", onOnboardingDismissed=" + this.j + ')';
    }
}
