package com.yandex.go.scooters.offers.v2.surge.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.bi;
import defpackage.cma1;
import defpackage.jqr;
import defpackage.kyh0;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.qfh0;
import defpackage.srh0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u3p0;
import defpackage.z3p0;
import kotlin.Metadata;
import ru.yandex.taxi.widget.BalanceWidget;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/surge/widget/ScootersSurgeWidgetView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Ltt2;", "appDispatchers", "Lru/yandex/taxi/design/utils/a;", "overlayShadowUtil", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lu3p0;", "scootersSurgeWidgetPresenter", "<init>", "(Landroid/content/Context;Ltt2;Lru/yandex/taxi/design/utils/a;Lru/yandex/taxi/widget/utils/e;Lu3p0;)V", "Lzy11;", "cancelSetContentJob", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Ltt2;", "Lru/yandex/taxi/design/utils/a;", "Lru/yandex/taxi/widget/utils/e;", "Lu3p0;", "Lz3p0;", "binding", "Lz3p0;", "Ll8x;", "setContentJob", "Ll8x;", "com/yandex/go/scooters/offers/v2/surge/widget/e", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersSurgeWidgetView extends GoFrameLayout {
    public static final int $stable = 8;
    private final tt2 appDispatchers;
    private final z3p0 binding;
    private final ru.yandex.taxi.widget.utils.e mediaInfoConverter;
    private final ru.yandex.taxi.design.utils.a overlayShadowUtil;
    private final u3p0 scootersSurgeWidgetPresenter;
    private l8x setContentJob;

    public ScootersSurgeWidgetView(Context context, tt2 tt2Var, ru.yandex.taxi.design.utils.a aVar, ru.yandex.taxi.widget.utils.e eVar, u3p0 u3p0Var) {
        super(context, null, 0, 0, 14, null);
        this.appDispatchers = tt2Var;
        this.overlayShadowUtil = aVar;
        this.mediaInfoConverter = eVar;
        this.scootersSurgeWidgetPresenter = u3p0Var;
        LayoutInflater.from(context).inflate(srh0.scooters_surge_widget_view, this);
        int i = qfh0.surge_widget;
        BalanceWidget balanceWidget = (BalanceWidget) cma1.O(i, this);
        if (balanceWidget == null) {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
            throw null;
        }
        this.binding = new z3p0(this, balanceWidget);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388659;
        setLayoutParams(layoutParams);
        setPaddingRelative(tje.u(12, getContext()), tje.u(20, getContext()), tje.u(16, getContext()), tje.u(24, getContext()));
        setClipToPadding(false);
        setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelSetContentJob() {
        l8x l8xVar = this.setContentJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.setContentJob = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ScootersSurgeWidgetView scootersSurgeWidgetView = this.binding.a;
        scootersSurgeWidgetView.setPadding(scootersSurgeWidgetView.getPaddingLeft(), tje.u(20, getContext()), scootersSurgeWidgetView.getPaddingRight(), scootersSurgeWidgetView.getPaddingBottom());
        androidx.core.view.b.p(this.binding.b, new bi(getContext().getString(kyh0.scooters_surge_widget_a11y_description), 2));
        ru.yandex.taxi.design.utils.c.z(new ScootersSurgeWidgetView$onAttachedToWindow$1(0, this.scootersSurgeWidgetPresenter, u3p0.class, "widgetClicked", "widgetClicked()V", 0), this.binding.b);
        u3p0 u3p0Var = this.scootersSurgeWidgetPresenter;
        e eVar = new e(this);
        u3p0Var.Bg(eVar);
        tje.N(u3p0Var.Jg(), null, null, new ScootersSurgeWidgetPresenter$attachView$$inlined$collectIn$1(new jqr(u3p0Var.y.b, new ScootersSurgeWidgetPresenter$attachView$1(2, u3p0Var, u3p0.class, "updateAnalytics", "updateAnalytics(Lcom/yandex/go/scooters/offers/v2/surge/widget/ScootersSurgeWidgetUiState;)V", 4), 3), null, eVar), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersSurgeWidgetPresenter.Cg();
        cancelSetContentJob();
    }
}
