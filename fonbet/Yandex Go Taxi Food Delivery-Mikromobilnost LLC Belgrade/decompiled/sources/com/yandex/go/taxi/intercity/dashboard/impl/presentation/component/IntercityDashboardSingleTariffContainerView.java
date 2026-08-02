package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.cma1;
import defpackage.ho4;
import defpackage.j8h0;
import defpackage.l76;
import defpackage.lkw;
import defpackage.mkw;
import defpackage.nkw;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.pkw;
import defpackage.qje;
import defpackage.tkh0;
import defpackage.vjw;
import defpackage.w511;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SingleShimmeringBar;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardSingleTariffContainerView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lpkw;", "tariffSelectorItem", "Lzy11;", "renderTariffPriceView", "(Lpkw;)V", "render", "Landroid/widget/ImageView;", "getSingleTariffIconView", "()Landroid/widget/ImageView;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lvjw;", "binding", "Lvjw;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardSingleTariffContainerView extends FrameLayout implements nwy0 {
    private final vjw binding;

    public IntercityDashboardSingleTariffContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View inflate = LayoutInflater.from(context).inflate(tkh0.intercity_dashboard_single_tariff_container, (ViewGroup) this, false);
        addView(inflate);
        GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
        int i2 = j8h0.single_tariff_icon;
        ImageView imageView = (ImageView) cma1.O(i2, inflate);
        if (imageView != null && (O = cma1.O((i2 = j8h0.single_tariff_price_binding), inflate)) != null) {
            ho4 o = ho4.o(O);
            i2 = j8h0.single_tariff_subtitle_text_view;
            TextView textView = (TextView) cma1.O(i2, inflate);
            if (textView != null) {
                i2 = j8h0.single_tariff_title_text_view;
                TextView textView2 = (TextView) cma1.O(i2, inflate);
                if (textView2 != null) {
                    this.binding = new vjw(goFrameLayout, imageView, o, textView, textView2);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void renderTariffPriceView(pkw tariffSelectorItem) {
        ho4 ho4Var = this.binding.c;
        RobotoTextView robotoTextView = (RobotoTextView) ho4Var.d;
        SingleShimmeringBar singleShimmeringBar = (SingleShimmeringBar) ho4Var.b;
        nkw nkwVar = tariffSelectorItem.b().e;
        if (nkwVar instanceof mkw) {
            robotoTextView.setVisibility(0);
            singleShimmeringBar.setVisibility(8);
            mkw mkwVar = (mkw) nkwVar;
            robotoTextView.setText(mkwVar.a);
            robotoTextView.setContentDescription(mkwVar.b);
            return;
        }
        if (nkwVar.equals(l76.F)) {
            robotoTextView.setVisibility(8);
            singleShimmeringBar.setVisibility(0);
        } else if (!nkwVar.equals(lkw.a)) {
            w511.b();
        } else {
            robotoTextView.setVisibility(8);
            singleShimmeringBar.setVisibility(8);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.binding.e.setTextColor(qje.t(xng0.textMain, getContext()));
        this.binding.d.setTextColor(qje.t(xng0.textMinor, getContext()));
        ((RobotoTextView) this.binding.c.d).setTextColor(qje.t(xng0.textMain, getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final ImageView getSingleTariffIconView() {
        return this.binding.b;
    }

    public final void render(pkw tariffSelectorItem) {
        this.binding.e.setText(tariffSelectorItem.f.a);
        this.binding.d.setText(tariffSelectorItem.f.b);
        renderTariffPriceView(tariffSelectorItem);
    }

    public IntercityDashboardSingleTariffContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public IntercityDashboardSingleTariffContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ IntercityDashboardSingleTariffContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
