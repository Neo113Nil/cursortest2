package com.yandex.go.drive.vertical.ui.tariff_card.collapsed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.drive.vertical.interactor.h;
import com.yandex.go.taxi.summary.drive.vertical_tariff_selector.VerticalTariffSelectorView;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardExpansionSource;
import defpackage.a201;
import defpackage.ag31;
import defpackage.ahm;
import defpackage.apf;
import defpackage.b8r;
import defpackage.bg4;
import defpackage.bgx0;
import defpackage.bmq0;
import defpackage.c4r0;
import defpackage.c8r;
import defpackage.cj31;
import defpackage.ck31;
import defpackage.cma1;
import defpackage.dj31;
import defpackage.dth0;
import defpackage.ebc;
import defpackage.eem;
import defpackage.f1f0;
import defpackage.fem;
import defpackage.fgm;
import defpackage.fih0;
import defpackage.fnx0;
import defpackage.fva0;
import defpackage.gnx0;
import defpackage.gu11;
import defpackage.hwo0;
import defpackage.i47;
import defpackage.i5m;
import defpackage.jgv;
import defpackage.jl40;
import defpackage.k051;
import defpackage.k7x0;
import defpackage.kgu;
import defpackage.kip;
import defpackage.lgm;
import defpackage.lgx0;
import defpackage.liv0;
import defpackage.lk31;
import defpackage.mi31;
import defpackage.mqv0;
import defpackage.mrx0;
import defpackage.ndl0;
import defpackage.nex0;
import defpackage.ngm;
import defpackage.niv0;
import defpackage.ny61;
import defpackage.ogm;
import defpackage.pav;
import defpackage.pbx0;
import defpackage.pdc;
import defpackage.ppw0;
import defpackage.q5z;
import defpackage.qbx0;
import defpackage.qgu0;
import defpackage.qnh;
import defpackage.rqo;
import defpackage.t0k;
import defpackage.t1w;
import defpackage.tgm;
import defpackage.tje;
import defpackage.u90;
import defpackage.unx0;
import defpackage.uxh;
import defpackage.vi31;
import defpackage.w511;
import defpackage.wdt0;
import defpackage.wnx0;
import defpackage.xi31;
import defpackage.ynm0;
import defpackage.ywf;
import defpackage.z4m0;
import defpackage.za31;
import defpackage.zuj0;
import defpackage.zxs0;
import defpackage.zzi;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.cashback.l;
import ru.yandex.taxi.design.button.OrderButtonComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.styling.f;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u000256BG\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u0012\u0004\b,\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010/R\u0016\u00100\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/yandex/go/drive/vertical/ui/tariff_card/collapsed/DriveTariffCardCollapsedView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Lebc;", "Landroid/content/Context;", "context", "", "verticalId", "Llgm;", "presenter", "Lqgu0;", "stopPointsDelegate", "Lwdt0;", "sourcePinDrawableFactory", "Lcj31;", "verticalTariffSelectorViewFactory", "Lzzi;", "destinationPinDrawableFactory", "<init>", "(Landroid/content/Context;Ljava/lang/String;Llgm;Lqgu0;Lwdt0;Lcj31;Lzzi;)V", "Lzy11;", "onFullyVisible", "()V", "onFullyInvisible", "onSlideInProgress", "setupButtonShadow", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lt1w;", "insets", "applyInsets", "(Lt1w;)V", "", "staticTranslationY", CaretView.ALPHA_PROPERTY, "onSlideParent", "(FF)V", "Landroid/view/View;", "asView", "()Landroid/view/View;", "Ljava/lang/String;", "getVerticalId$annotations", "Llgm;", "Lwdt0;", "Lzzi;", "lastAlpha", "F", "Lfgm;", "binding", "Lfgm;", "ogm", "pgm", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DriveTariffCardCollapsedView extends GoLinearLayout implements ebc {
    private final fgm binding;
    private final zzi destinationPinDrawableFactory;
    private float lastAlpha;
    private final lgm presenter;
    private final wdt0 sourcePinDrawableFactory;
    private final String verticalId;

    public DriveTariffCardCollapsedView(Context context, String str, lgm lgmVar, qgu0 qgu0Var, wdt0 wdt0Var, cj31 cj31Var, zzi zziVar) {
        super(context, null, 0, 0, 14, null);
        this.verticalId = str;
        this.presenter = lgmVar;
        this.sourcePinDrawableFactory = wdt0Var;
        this.destinationPinDrawableFactory = zziVar;
        LayoutInflater.from(context).inflate(dth0.drive_tariff_card_collapsed_layout, this);
        int i = fih0.addresses;
        SourceDestinationComponent sourceDestinationComponent = (SourceDestinationComponent) cma1.O(i, this);
        if (sourceDestinationComponent != null) {
            i = fih0.bottom_container;
            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, this);
            if (goLinearLayout != null) {
                i = fih0.button;
                OrderButtonComponent orderButtonComponent = (OrderButtonComponent) cma1.O(i, this);
                if (orderButtonComponent != null) {
                    i = fih0.button_container;
                    if (((GoFrameLayout) cma1.O(i, this)) != null) {
                        i = fih0.button_shadow;
                        ImageView imageView = (ImageView) cma1.O(i, this);
                        if (imageView != null) {
                            i = fih0.top_content;
                            GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, this);
                            if (goLinearLayout2 != null) {
                                this.binding = new fgm(this, sourceDestinationComponent, goLinearLayout, orderButtonComponent, imageView, goLinearLayout2);
                                setOrientation(1);
                                setClipChildren(false);
                                setupButtonShadow();
                                sourceDestinationComponent.setStopPointsDelegate(qgu0Var);
                                sourceDestinationComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON);
                                sourceDestinationComponent.setSourceDestinationListener(new ngm(this));
                                orderButtonComponent.setDebounceClickListener(new uxh(28, lgmVar));
                                qnh qnhVar = new qnh(this);
                                vi31 vi31Var = ((dj31) cj31Var).a;
                                str.getClass();
                                ywf ywfVar = new ywf(19, vi31Var);
                                Context context2 = vi31Var.a;
                                q5z.h(context2);
                                lk31 lk31Var = vi31Var.s;
                                pav pavVar = vi31Var.b;
                                q5z.h(pavVar);
                                nex0 nex0Var = vi31Var.q;
                                q5z.h(nex0Var);
                                fva0 fva0Var = vi31Var.r;
                                q5z.h(fva0Var);
                                bmq0 bmq0Var = new bmq0();
                                ru.yandex.taxi.perf.screen.c cVar = vi31Var.t;
                                q5z.h(cVar);
                                k051 k051Var = vi31Var.x;
                                q5z.h(k051Var);
                                f1f0 f1f0Var = vi31Var.z;
                                unx0 unx0Var = vi31Var.B;
                                wnx0 wnx0Var = new wnx0(context2, pavVar, nex0Var, fva0Var, bmq0Var, cVar, k051Var, f1f0Var, unx0Var, vi31Var.C, i5m.a(ywfVar));
                                b8r b8rVar = vi31Var.p;
                                ag31 ag31Var = vi31Var.v;
                                c4r0 c4r0Var = vi31Var.A;
                                q5z.h(c4r0Var);
                                ck31 ck31Var = vi31Var.e;
                                q5z.h(ck31Var);
                                mrx0 mrx0Var = vi31Var.j;
                                zuj0 zuj0Var = vi31Var.d;
                                q5z.h(zuj0Var);
                                gu11 gu11Var = vi31Var.g;
                                q5z.h(gu11Var);
                                qbx0 qbx0Var = vi31Var.m;
                                l lVar = vi31Var.F;
                                jgv jgvVar = vi31Var.h;
                                k7x0 k7x0Var = vi31Var.f;
                                q5z.h(k7x0Var);
                                lgx0 lgx0Var = vi31Var.n;
                                i47 i47Var = vi31Var.l;
                                pdc pdcVar = vi31Var.c;
                                q5z.h(pdcVar);
                                ppw0 ppw0Var = vi31Var.k;
                                rqo rqoVar = vi31Var.o;
                                q5z.h(rqoVar);
                                kip kipVar = new kip(rqoVar, 3);
                                mqv0 mqv0Var = vi31Var.i;
                                q5z.h(mqv0Var);
                                ynm0 ynm0Var = vi31Var.u;
                                q5z.h(ynm0Var);
                                bg4 bg4Var = new bg4(zuj0Var, rqoVar, ynm0Var);
                                kgu kguVar = vi31Var.w;
                                q5z.h(kguVar);
                                ru.yandex.taxi.tooltips.repository.b bVar = vi31Var.D;
                                q5z.h(bVar);
                                niv0 niv0Var = new niv0(bVar, new liv0(rqoVar));
                                bgx0 bgx0Var = vi31Var.H;
                                q5z.h(bgx0Var);
                                goLinearLayout2.addView(new VerticalTariffSelectorView(context2, lk31Var, wnx0Var, new xi31(qnhVar, b8rVar, ag31Var, c4r0Var, new a201(22, new apf(str, ck31Var, mrx0Var, new zxs0(new pbx0(zuj0Var, gu11Var, qbx0Var, lVar, jgvVar, k7x0Var, unx0Var, lgx0Var, i47Var, pdcVar, ppw0Var, rqoVar, kipVar, mqv0Var, bg4Var, kguVar, niv0Var, bgx0Var, vi31Var.I, vi31Var.J), new ndl0(21, ck31Var)), 29), new com.yandex.go.taxi.summary.drive.interactor.c(ck31Var, vi31Var.y, vi31Var.G)))));
                                addOnLayoutChangeListener(new u90(28, this));
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(DriveTariffCardCollapsedView driveTariffCardCollapsedView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        lgm lgmVar = driveTariffCardCollapsedView.presenter;
        int height = driveTariffCardCollapsedView.getHeight();
        tgm tgmVar = lgmVar.D;
        tgmVar.a.q3(tgmVar.b, 0, 0, 0, height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onContinueButtonClick(lgm lgmVar) {
        ahm ahmVar = lgmVar.y;
        fem femVar = ahmVar.H;
        if (femVar instanceof t0k) {
            ahmVar.Lg((t0k) femVar, DriveSummaryCardExpansionSource.ContinueButton);
            return;
        }
        if (!(femVar instanceof eem)) {
            if (femVar == null) {
                return;
            }
            w511.b();
        } else {
            r0 r0Var = ahmVar.E.a.a;
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            r0Var.getClass();
            r0Var.m(null, valueOf);
        }
    }

    private static /* synthetic */ void getVerticalId$annotations() {
    }

    private final void onFullyInvisible() {
        this.binding.c.setVisibility(4);
    }

    private final void onFullyVisible() {
        this.binding.c.setVisibility(0);
    }

    private final void onSlideInProgress() {
        this.binding.c.setVisibility(0);
    }

    private final void setupButtonShadow() {
        OneShotPreDrawListener.add(this.binding.e, new uxh(27, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButtonShadow$lambda$0(DriveTariffCardCollapsedView driveTariffCardCollapsedView) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) driveTariffCardCollapsedView.binding.e.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, -driveTariffCardCollapsedView.binding.e.getMeasuredHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    @Override // defpackage.ebc
    public void applyInsets(t1w insets) {
        GoLinearLayout goLinearLayout = this.binding.c;
        goLinearLayout.setPadding(goLinearLayout.getPaddingLeft(), goLinearLayout.getPaddingTop(), goLinearLayout.getPaddingRight(), insets.g);
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setupButtonShadow();
    }

    @Override // defpackage.ebc
    public View asView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object obj;
        super.onAttachedToWindow();
        lgm lgmVar = this.presenter;
        ogm ogmVar = new ogm(this);
        lgmVar.Bg(ogmVar);
        tje.N(lgmVar.Jg(), null, null, new DriveTariffCardCollapsedPresenter$attachView$$inlined$safeCollectIn$1(new d(((f) lgmVar.z).d(new b(((k) lgmVar.C).j.b())), lgmVar.B), null, ogmVar), 3);
        z4m0 z4m0Var = lgmVar.F;
        tje.N(lgmVar.Jg(), null, null, new DriveTariffCardCollapsedPresenter$attachView$$inlined$safeCollectIn$2(new h(((com.yandex.go.route.interactor.b) z4m0Var.w).k(), z4m0Var), null, ogmVar), 3);
        tje.N(lgmVar.Jg(), null, null, new DriveTariffCardCollapsedPresenter$attachView$$inlined$safeCollectIn$3(lgmVar.E.b(), null, ogmVar), 3);
        hwo0 hwo0Var = lgmVar.G;
        ck31 ck31Var = (ck31) hwo0Var.c;
        String str = (String) hwo0Var.b;
        Iterator it = ((k) ck31Var).j().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((za31) obj).a.a, str)) {
                    break;
                }
            }
        }
        za31 za31Var = (za31) obj;
        mi31 mi31Var = za31Var != null ? za31Var.c : null;
        if (mi31Var == null) {
            mi31Var = c8r.b((c8r) hwo0Var.w, null, str, null, 4);
        }
        if (mi31Var != null) {
            ((c4r0) hwo0Var.x).a(new gnx0(new fnx0(mi31Var, SelectionOrigin.PREORDER_CONTROLLER), true));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.ebc
    public void onSlideParent(float staticTranslationY, float alpha) {
        this.binding.c.setTranslationY(staticTranslationY);
        this.binding.f.setAlpha(alpha);
        if (alpha == 0.0f) {
            onFullyInvisible();
        } else if (alpha == 1.0f) {
            onFullyVisible();
        } else {
            float f = this.lastAlpha;
            if (f == 0.0f || f == 1.0f) {
                onSlideInProgress();
            }
        }
        this.lastAlpha = alpha;
    }
}
