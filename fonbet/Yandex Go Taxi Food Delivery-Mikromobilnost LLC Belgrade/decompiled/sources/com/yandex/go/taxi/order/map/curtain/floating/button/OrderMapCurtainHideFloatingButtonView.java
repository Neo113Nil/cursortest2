package com.yandex.go.taxi.order.map.curtain.floating.button;

import android.content.Context;
import android.widget.TextView;
import com.yandex.go.coroutines.b;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.cby0;
import defpackage.ci70;
import defpackage.f1h0;
import defpackage.jqr;
import defpackage.jz70;
import defpackage.kz70;
import defpackage.op70;
import defpackage.pz70;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.xw31;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.FloatButtonSingleComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0015¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0018\u0010\u0019\u001a\u00060\u0018R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/taxi/order/map/curtain/floating/button/OrderMapCurtainHideFloatingButtonView;", "Lru/yandex/taxi/design/FloatButtonSingleComponent;", "Lnwy0;", "Landroid/content/Context;", "context", "Lkz70;", "presenter", "<init>", "(Landroid/content/Context;Lkz70;)V", "", "backgroundResourceId", "()I", "", "applyTitleAlignment", "()Z", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lkz70;", "Ljz70;", "innerMvpView", "Ljz70;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderMapCurtainHideFloatingButtonView extends FloatButtonSingleComponent {
    public static final int $stable = FloatButtonSingleComponent.$stable | 8;
    private final jz70 innerMvpView;
    private final kz70 presenter;

    public OrderMapCurtainHideFloatingButtonView(Context context, kz70 kz70Var) {
        super(context, null, 0, 6, null);
        this.presenter = kz70Var;
        this.innerMvpView = new jz70(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(OrderMapCurtainHideFloatingButtonView orderMapCurtainHideFloatingButtonView) {
        kz70 kz70Var = orderMapCurtainHideFloatingButtonView.presenter;
        ci70 ci70Var = kz70Var.z;
        String str = kz70Var.C;
        if (str == null) {
            str = "";
        }
        cby0 cby0Var = ci70Var.l;
        cby0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        cby0Var.a.a("TaxiTracking.RemoveMapOverlayButton.Tapped", hashMap, 1, new HashMap());
        ((pz70) kz70Var.x).c.g(zy11.a);
    }

    @Override // ru.yandex.taxi.design.FloatButtonSingleComponent, ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setLeadImage(f1h0.ic_map_outline);
        setBackground(tje.y(f1h0.fab_rectangle_background, getContext()));
    }

    @Override // ru.yandex.taxi.design.FloatButtonSingleComponent
    public boolean applyTitleAlignment() {
        return false;
    }

    @Override // ru.yandex.taxi.design.FloatButtonSingleComponent
    public int backgroundResourceId() {
        return f1h0.fab_rectangle_background;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        kz70 kz70Var = this.presenter;
        jz70 jz70Var = this.innerMvpView;
        kz70Var.Bg(jz70Var);
        tse Jg = kz70Var.Jg();
        kz70Var.A.getClass();
        sjh sjhVar = uyj.a;
        tje.N(Jg, sjhVar, null, new OrderMapCurtainHideFloatingButtonViewPresenter$attachView$1(kz70Var, null), 2);
        b.h(kz70Var.Jg(), new jqr(e.F(e.t(e.n(((pz70) kz70Var.x).b, ((com.yandex.go.taxi.order.interactors.b) kz70Var.y.b).d, kz70Var.D.e(), new OrderMapCurtainHideFloatingButtonViewPresenter$attachView$2(kz70Var, null))), sjhVar), new OrderMapCurtainHideFloatingButtonViewPresenter$attachView$3(jz70Var, null), 3));
        setVisibility(8);
        setLeadImage(f1h0.ic_map_outline);
        getLayoutParams().width = -2;
        getLayoutParams().height = -2;
        ClickableImageView leadImageView = getLeadImageView();
        leadImageView.setPadding(leadImageView.getPaddingLeft(), leadImageView.getPaddingTop(), leadImageView.getPaddingRight(), tje.u(12, getContext()));
        TextView title = title();
        title.setPadding(title.getPaddingLeft(), title.getPaddingTop(), title.getPaddingRight(), tje.u(12, getContext()));
        xw31.I(this, null, null, null, Integer.valueOf(tje.u(10, getContext())));
        xw31.F(this, null, null, Integer.valueOf(tje.u(8, getContext())), null);
        setElevation(tje.w(15, getContext()));
        setOutlineSpotShadowColor(0);
        setDebounceClickListener(new op70(5, this));
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
