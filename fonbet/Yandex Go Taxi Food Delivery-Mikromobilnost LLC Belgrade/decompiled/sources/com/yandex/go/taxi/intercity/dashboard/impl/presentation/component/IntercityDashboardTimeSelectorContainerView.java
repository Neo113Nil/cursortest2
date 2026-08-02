package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g;
import defpackage.blw;
import defpackage.cma1;
import defpackage.djw;
import defpackage.haw;
import defpackage.iaw;
import defpackage.j8h0;
import defpackage.k4h0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.tkh0;
import defpackage.vng;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTimeSelectorContainerView;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "dashboardPresenter", "Lhaw;", "bannersContainerViewFactory", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;Lhaw;)V", "Ldjw;", "content", "Lzy11;", "renderTimeSelectionBlock", "(Ldjw;)V", "render", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "Lblw;", "binding", "Lblw;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardBannersContainerView;", "bannersContainerView", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardBannersContainerView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardTimeSelectorContainerView extends LinearLayout implements nwy0 {
    private final IntercityDashboardBannersContainerView bannersContainerView;
    private final blw binding;
    private final g dashboardPresenter;

    public IntercityDashboardTimeSelectorContainerView(Context context, g gVar, haw hawVar) {
        super(context);
        this.dashboardPresenter = gVar;
        View inflate = LayoutInflater.from(context).inflate(tkh0.intercity_dashboard_time_selector_container, (ViewGroup) this, false);
        addView(inflate);
        int i = j8h0.banners_container_holder;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = j8h0.due_banner_hint;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = j8h0.due_banner_title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    this.binding = new blw((GoLinearLayout) inflate, frameLayout, robotoTextView, robotoTextView2);
                    IntercityDashboardBannersContainerView a = ((iaw) hawVar).a(gVar);
                    this.bannersContainerView = a;
                    frameLayout.addView(a);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    private final void renderTimeSelectionBlock(djw content) {
        GoLinearLayout goLinearLayout = this.binding.a;
        goLinearLayout.setClipToOutline(true);
        boolean z = content.c;
        Drawable drawable = null;
        if (z) {
            c.z(new IntercityDashboardTimeSelectorContainerView$renderTimeSelectionBlock$1(0, this.dashboardPresenter, g.class, "onSelectTimeClick", "onSelectTimeClick$impl()V", 0), goLinearLayout);
        } else {
            goLinearLayout.setOnClickListener(null);
        }
        if (z) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
            drawable = vng.t(typedValue.resourceId, getContext());
        }
        goLinearLayout.setForeground(drawable);
        this.binding.c.setText(content.a);
        this.binding.b.setText(content.b);
        this.binding.a.setBackgroundResource(k4h0.bg_minor_rounded_24dp);
        this.binding.b.setTextColorAttr(z ? xng0.textMain : xng0.textMinor);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void render(djw content) {
        renderTimeSelectionBlock(content);
        this.bannersContainerView.renderBanners(content.d);
    }
}
