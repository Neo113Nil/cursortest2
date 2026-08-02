package com.yandex.go.safety.center.safetycenter_web.ui.loading;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.i7h0;
import defpackage.lj41;
import defpackage.lvl0;
import defpackage.nvl0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tjh0;
import defpackage.xw31;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.web.view.WebProgressViewHolder$LayoutType;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/safety/center/safetycenter_web/ui/loading/SafetyCenterWebLoadingView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Llj41;", "Landroid/content/Context;", "context", "Llvl0;", "callbacks", "<init>", "(Landroid/content/Context;Llvl0;)V", "Lzy11;", "initViews", "()V", "onAttachedToWindow", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lru/yandex/taxi/web/view/WebProgressViewHolder$LayoutType;", "getLayoutType", "()Lru/yandex/taxi/web/view/WebProgressViewHolder$LayoutType;", "Llvl0;", "Lnvl0;", "binding", "Lnvl0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterWebLoadingView extends GoFrameLayout implements lj41 {
    private final nvl0 binding;
    private final lvl0 callbacks;

    public SafetyCenterWebLoadingView(Context context, lvl0 lvl0Var) {
        super(context, null, 0, 0, 14, null);
        this.callbacks = lvl0Var;
        LayoutInflater.from(context).inflate(tjh0.safety_center_web_loading_view, this);
        int i = i7h0.back_float_btn;
        GoImageView goImageView = (GoImageView) cma1.O(i, this);
        if (goImageView != null) {
            i = i7h0.buttons_shimmer_container;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i, this);
            if (frameLayout != null) {
                i = i7h0.call_emergency_shimmer;
                ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i, this);
                if (shimmeringBar != null) {
                    i = i7h0.first_section_shimmer;
                    if (((ShimmeringBar) cma1.O(i, this)) != null) {
                        i = i7h0.open_support_shimmer;
                        ShimmeringBar shimmeringBar2 = (ShimmeringBar) cma1.O(i, this);
                        if (shimmeringBar2 != null) {
                            i = i7h0.second_section_shimmer;
                            if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                i = i7h0.share_route_shimmer;
                                ShimmeringBar shimmeringBar3 = (ShimmeringBar) cma1.O(i, this);
                                if (shimmeringBar3 != null) {
                                    i = i7h0.subtitle_shimmer;
                                    if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                        i = i7h0.title_icon_shimmer;
                                        if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                            i = i7h0.title_shimmer;
                                            if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                this.binding = new nvl0(this, goImageView, frameLayout, shimmeringBar, shimmeringBar2, shimmeringBar3);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void initViews() {
        final nvl0 nvl0Var = this.binding;
        c.z(new SafetyCenterWebLoadingView$initViews$1$1(0, this.callbacks, lvl0.class, "close", "close()V", 0), nvl0Var.b);
        if (xw31.n(getContext())) {
            nvl0Var.b.setBackgroundResource(dzg0.ic_arrow_right);
        }
        WeakHashMap weakHashMap = b.a;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.safety.center.safetycenter_web.ui.loading.SafetyCenterWebLoadingView$initViews$lambda$0$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int width = nvl0.this.c.getWidth();
                    if (width == 0) {
                        return;
                    }
                    float j = (width - c.j(8, this)) / 3.0f;
                    ShimmeringBar shimmeringBar = nvl0.this.d;
                    int i = (int) j;
                    c.D(i, shimmeringBar.getLayoutParams().height, shimmeringBar);
                    ShimmeringBar shimmeringBar2 = nvl0.this.e;
                    c.D(i, shimmeringBar2.getLayoutParams().height, shimmeringBar2);
                    ShimmeringBar shimmeringBar3 = nvl0.this.f;
                    c.D(i, shimmeringBar3.getLayoutParams().height, shimmeringBar3);
                }
            });
            return;
        }
        int width = nvl0Var.c.getWidth();
        if (width == 0) {
            return;
        }
        float w = (width - tje.w(8, getContext())) / 3.0f;
        ShimmeringBar shimmeringBar = nvl0Var.d;
        int i = (int) w;
        c.D(i, shimmeringBar.getLayoutParams().height, shimmeringBar);
        ShimmeringBar shimmeringBar2 = nvl0Var.e;
        c.D(i, shimmeringBar2.getLayoutParams().height, shimmeringBar2);
        ShimmeringBar shimmeringBar3 = nvl0Var.f;
        c.D(i, shimmeringBar3.getLayoutParams().height, shimmeringBar3);
    }

    @Override // defpackage.lj41
    public WebProgressViewHolder$LayoutType getLayoutType() {
        return WebProgressViewHolder$LayoutType.FULLSCREEN;
    }

    @Override // defpackage.lj41
    public View getView() {
        return this;
    }

    public boolean isVisible() {
        return getView().getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initViews();
    }

    @Override // defpackage.lj41
    public /* bridge */ void setVisible(boolean z) {
        super.setVisible(z);
    }
}
