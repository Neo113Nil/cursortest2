package com.yandex.go.taxi.summary.drive.vertical_tariff_selector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.drive.vertical.ui.tariff_card.collapsed.DriveTariffCardCollapsedView;
import com.yandex.go.taxi.summary.drive.interactor.b;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a201;
import defpackage.aj31;
import defpackage.apf;
import defpackage.bj31;
import defpackage.c6w;
import defpackage.ck31;
import defpackage.clh0;
import defpackage.cma1;
import defpackage.cox0;
import defpackage.czo0;
import defpackage.d6w;
import defpackage.hbp0;
import defpackage.iqx0;
import defpackage.jqr;
import defpackage.kk31;
import defpackage.l131;
import defpackage.lgm;
import defpackage.lk31;
import defpackage.lnv0;
import defpackage.mwu0;
import defpackage.ny61;
import defpackage.ob31;
import defpackage.qnh;
import defpackage.rnx0;
import defpackage.rrj;
import defpackage.s8h0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ui31;
import defpackage.vfh0;
import defpackage.wnx0;
import defpackage.wwb;
import defpackage.xi31;
import defpackage.y6i0;
import defpackage.ys0;
import defpackage.zi31;
import defpackage.zug0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.m0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;
import ru.yandex.taxi.preorder.summary.selector.appearance.a;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00012B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0014¢\u0006\u0004\b \u0010\u0017J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/yandex/go/taxi/summary/drive/vertical_tariff_selector/VerticalTariffSelectorView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Llk31;", "verticalsViewFactory", "Lwnx0;", "tariffSelectorViewFactory", "Lxi31;", "presenter", "<init>", "(Landroid/content/Context;Llk31;Lwnx0;Lxi31;)V", "", "Lob31;", "verticals", "Lzy11;", "renderVerticals", "(Ljava/util/List;)V", "Liqx0;", "tariffState", "renderTariffs", "(Liqx0;)V", "setupSelectorPadding", "()V", "", ClidProvider.STATE, "onTariffViewPagerScrollChanged", "(I)V", "position", "verticalsCount", "initVerticalHeaderAndViewPagerPosition", "(II)V", "onAttachedToWindow", "onDetachedFromWindow", "Lxi31;", "Lui31;", "binding", "Lui31;", "Lhbp0;", "scope", "Lhbp0;", "Lru/yandex/taxi/preorder/summary/selector/ui/verticals/VerticalInternalTariffView;", "tariffSelectorView", "Lru/yandex/taxi/preorder/summary/selector/ui/verticals/VerticalInternalTariffView;", "Lkk31;", "verticalsView", "Lkk31;", "Lcox0;", "selectorAdapter", "Lcox0;", "bj31", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VerticalTariffSelectorView extends GoLinearLayout {
    public static final int $stable = 8;
    private final ui31 binding;
    private final xi31 presenter;
    private final hbp0 scope;
    private final cox0 selectorAdapter;
    private final VerticalInternalTariffView tariffSelectorView;
    private final kk31 verticalsView;

    public VerticalTariffSelectorView(Context context, lk31 lk31Var, wnx0 wnx0Var, xi31 xi31Var) {
        super(context, null, 0, 0, 14, null);
        View O;
        this.presenter = xi31Var;
        LayoutInflater.from(context).inflate(clh0.vertical_tariff_selector, this);
        int i = s8h0.selector;
        ViewPager2 viewPager2 = (ViewPager2) cma1.O(i, this);
        if (viewPager2 == null || (O = cma1.O((i = s8h0.verticals_stub), this)) == null) {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
            throw null;
        }
        this.binding = new ui31(this, viewPager2, O);
        hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
        this.scope = hbp0Var;
        wnx0Var.getClass();
        VerticalInternalTariffView verticalInternalTariffView = new VerticalInternalTariffView(wnx0Var.a, wnx0Var.b, wnx0Var.k, new RecyclerView.h(), wnx0Var.j, wnx0Var.c, wnx0Var.d, wnx0Var.g, wnx0Var.i, ((a) wnx0Var.k.get()).b(), wnx0Var.e, wnx0Var.h, hbp0Var, wnx0Var.f, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, tje.r(zug0.tariff_selector_bottom_margin, verticalInternalTariffView.getContext()));
        verticalInternalTariffView.setLayoutParams(layoutParams);
        this.tariffSelectorView = verticalInternalTariffView;
        kk31 a = lk31Var.a(new l131(4, this));
        this.verticalsView = a;
        cox0 cox0Var = new cox0(new rnx0(verticalInternalTariffView));
        this.selectorAdapter = cox0Var;
        setOrientation(1);
        c.w(O, a.asView());
        viewPager2.setAdapter(cox0Var);
        viewPager2.registerOnPageChangeCallback(new zi31(this));
        verticalInternalTariffView.setInternalTariffViewListener(new aj31(0, this));
    }

    private final void initVerticalHeaderAndViewPagerPosition(int position, int verticalsCount) {
        cox0 cox0Var = this.selectorAdapter;
        ys0 ys0Var = new ys0(this, position, 16);
        cox0Var.getClass();
        d6w n = y6i0.n(0, verticalsCount);
        ArrayList arrayList = new ArrayList(tcc.n(n, 10));
        c6w it = n.iterator();
        while (it.c) {
            arrayList.add(it.nextInt() == position ? cox0Var.z : mwu0.a);
        }
        cox0Var.submitList(arrayList, new lnv0(28, ys0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initVerticalHeaderAndViewPagerPosition$lambda$0(VerticalTariffSelectorView verticalTariffSelectorView, int i) {
        verticalTariffSelectorView.binding.b.setCurrentItem(i, false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTariffViewPagerScrollChanged(int state) {
        ob31 vertical;
        lgm lgmVar;
        if (state == 0 && (vertical = this.verticalsView.getVertical(this.binding.b.getCurrentItem())) != null) {
            xi31 xi31Var = this.presenter;
            xi31Var.getClass();
            if ((!vertical.c ? vertical : null) != null) {
                xi31Var.Kg(vertical, VerticalSelectorAnalytics$SelectionChangeReason.Swipe);
                qnh qnhVar = xi31Var.x;
                String str = vertical.a;
                lgmVar = ((DriveTariffCardCollapsedView) qnhVar.a).presenter;
                ((rrj) lgmVar.x.a).r(new wwb(str, 19));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTariffs(iqx0 tariffState) {
        this.tariffSelectorView.updateVerticalItems(tariffState.a, tariffState.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderVerticals(List<ob31> verticals) {
        this.verticalsView.render(verticals);
        Iterator<ob31> it = verticals.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().c) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i >= 0 ? i : 0;
        this.verticalsView.updateHeaderState(i2, 0.0f);
        initVerticalHeaderAndViewPagerPosition(i2, verticals.size());
    }

    private final void setupSelectorPadding() {
        RecyclerView recyclerView = (RecyclerView) this.tariffSelectorView.findViewById(vfh0.vertical_inner_recycler);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), 0, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 verticalsView$lambda$0(VerticalTariffSelectorView verticalTariffSelectorView, int i, ob31 ob31Var) {
        lgm lgmVar;
        xi31 xi31Var = verticalTariffSelectorView.presenter;
        xi31Var.getClass();
        if ((!ob31Var.c ? ob31Var : null) != null) {
            xi31Var.Kg(ob31Var, VerticalSelectorAnalytics$SelectionChangeReason.Tap);
            qnh qnhVar = xi31Var.x;
            String str = ob31Var.a;
            lgmVar = ((DriveTariffCardCollapsedView) qnhVar.a).presenter;
            ((rrj) lgmVar.x.a).r(new wwb(str, 19));
        }
        return zy11.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scope.a();
        xi31 xi31Var = this.presenter;
        bj31 bj31Var = new bj31(this);
        xi31Var.Bg(bj31Var);
        a201 a201Var = xi31Var.B;
        apf apfVar = (apf) a201Var.b;
        tje.N(xi31Var.Jg(), null, null, new VerticalTariffSelectorPresenter$attachView$$inlined$safeCollectIn$1(new jqr(new m0(new b(((k) ((ck31) apfVar.c)).r((String) apfVar.b), apfVar), ((com.yandex.go.taxi.summary.drive.interactor.c) a201Var.c).a(), new VerticalTariffSelectorUiStateInteractor$stateFlow$1(3, null)), new VerticalTariffSelectorPresenter$attachView$1(xi31Var, null), 3), null, bj31Var), 3);
        setupSelectorPadding();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scope.b();
        this.presenter.Cg();
    }
}
