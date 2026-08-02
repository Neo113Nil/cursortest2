package com.yandex.go.navigator.map_interactions.long_taps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.BaseNavigatorModalView;
import com.yandex.go.navigator.map_interactions.go_bottom_buttons.GoBottomButtonsLinearLayout;
import com.yandex.go.navigator.map_interactions.long_taps.LongTapModalView;
import com.yandex.go.navigator.repository.o;
import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.boz;
import defpackage.cma1;
import defpackage.coz;
import defpackage.doz;
import defpackage.eoz;
import defpackage.ewc;
import defpackage.fbz;
import defpackage.foz;
import defpackage.fuh0;
import defpackage.goz;
import defpackage.ip11;
import defpackage.ipv;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tls;
import defpackage.vnz;
import defpackage.w511;
import defpackage.wb50;
import defpackage.xnz;
import defpackage.ynz;
import defpackage.z5h0;
import defpackage.zmh;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B]\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001aH\u0014¢\u0006\u0004\b'\u0010\u001cJ\u000f\u0010(\u001a\u00020\u001aH\u0014¢\u0006\u0004\b(\u0010\u001cJ\u000f\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101¨\u00062"}, d2 = {"Lcom/yandex/go/navigator/map_interactions/long_taps/LongTapModalView;", "Lcom/yandex/go/navigator/BaseNavigatorModalView;", "Lgoz;", "Lxnz;", "Landroid/content/Context;", "context", "Lynz;", "presenter", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lah00;", "mapController", "Lwb50;", "focusCoordinator", "Lip11;", "typefaceDelegate", "Lcom/yandex/go/navigator/repository/o;", "userInteractionsListener", "Lcom/yandex/go/navigator/domain/e;", "focusModeChangeEventRepository", "Lewc;", "compassButtonPresenter", "Lcom/yandex/go/navigator/analitycs/a;", "navigatorMainScreenAnalyticInteractor", "<init>", "(Landroid/content/Context;Lynz;Lru/yandex/taxi/discovery/a;Lah00;Lwb50;Lip11;Lcom/yandex/go/navigator/repository/o;Lcom/yandex/go/navigator/domain/e;Lewc;Lcom/yandex/go/navigator/analitycs/a;)V", "Lzy11;", "renderLoading", "()V", "Ldoz;", "uiState", "renderContent", "(Ldoz;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lgoz;", "onAttachedToWindow", "onDetachedFromWindow", "", "getBottomFocusRectOffset", "()I", "awaitFocusRectReady", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfoz;", "render", "(Lfoz;)V", "Lynz;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LongTapModalView extends BaseNavigatorModalView<goz> implements xnz {
    public static final int $stable = 8;
    private final ynz presenter;

    /* JADX WARN: Multi-variable type inference failed */
    public LongTapModalView(Context context, final ynz ynzVar, ru.yandex.taxi.discovery.a aVar, ah00 ah00Var, wb50 wb50Var, ip11 ip11Var, o oVar, com.yandex.go.navigator.domain.e eVar, ewc ewcVar, com.yandex.go.navigator.analitycs.a aVar2) {
        super(context, aVar, ah00Var, wb50Var, oVar, eVar, ewcVar, aVar2);
        this.presenter = ynzVar;
        final int i = 0;
        setAnimateOnAppearing(false);
        goz gozVar = (goz) getBinding();
        gozVar.h.setTypeface(((zmh) ip11Var).d());
        gozVar.f.setDebounceClickListener(new Runnable() { // from class: tnz
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ynz ynzVar2 = ynzVar;
                switch (i2) {
                    case 0:
                        LongTapModalView.lambda$0$onPlaceReportClicked(ynzVar2);
                        break;
                    default:
                        LongTapModalView.lambda$0$onAddPlaceClicked(ynzVar2);
                        break;
                }
            }
        });
        final int i2 = 1;
        gozVar.b.setDebounceClickListener(new Runnable() { // from class: tnz
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ynz ynzVar2 = ynzVar;
                switch (i22) {
                    case 0:
                        LongTapModalView.lambda$0$onPlaceReportClicked(ynzVar2);
                        break;
                    default:
                        LongTapModalView.lambda$0$onAddPlaceClicked(ynzVar2);
                        break;
                }
            }
        });
        GoBottomButtonsLinearLayout goBottomButtonsLinearLayout = gozVar.e;
        goBottomButtonsLinearLayout.setOnGoViaDebounceClickListener(new LongTapModalView$1$3$1(0, ynzVar, ynz.class, "onGoViaClicked", "onGoViaClicked()V", 0));
        goBottomButtonsLinearLayout.setOnGoHereDebounceClickListener(new LongTapModalView$1$3$2(0, ynzVar, ynz.class, "onGoHereClicked", "onGoHereClicked()V", 0));
        goBottomButtonsLinearLayout.setOnFromDebounceClickListener(new LongTapModalView$1$3$3(0, ynzVar, ynz.class, "onGoFromClicked", "onGoFromClicked()V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$onAddPlaceClicked(ynz ynzVar) {
        vnz vnzVar = ynzVar.z;
        final Point point = ynzVar.x;
        vnzVar.b.r(new tls() { // from class: com.yandex.go.navigator.map_interactions.long_taps.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                coz cozVar = ((boz) obj).a;
                com.yandex.go.coroutines.b.g(cozVar.o(), null, null, new LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1(cozVar, Point.this, null), 3);
                return zy11.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$onPlaceReportClicked(ynz ynzVar) {
        tje.N(ynzVar.Jg(), null, null, new LongTapPresenter$onPlaceReportClicked$1(ynzVar, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderContent(doz uiState) {
        goz gozVar = (goz) getBinding();
        ((goz) getBinding()).g.setVisibility(8);
        ((goz) getBinding()).d.setVisibility(0);
        ((goz) getBinding()).f.setVisibility(uiState.b ? 0 : 8);
        ((goz) getBinding()).e.setNormalState();
        gozVar.c.setText(uiState.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderLoading() {
        ((goz) getBinding()).e.setLoadingState();
        ((goz) getBinding()).g.setVisibility(0);
        ((goz) getBinding()).d.setVisibility(8);
    }

    @Override // defpackage.xnz
    public Object awaitFocusRectReady(Continuation<? super zy11> continuation) {
        return prepareStaticFocusRect(continuation);
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public goz bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(fuh0.long_tap_view, parent, false);
        int i = z5h0.add_new_place;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = z5h0.address;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = z5h0.content;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                if (linearLayout != null) {
                    i = z5h0.go_bottom_buttons_container;
                    GoBottomButtonsLinearLayout goBottomButtonsLinearLayout = (GoBottomButtonsLinearLayout) cma1.O(i, inflate);
                    if (goBottomButtonsLinearLayout != null) {
                        i = z5h0.organizations_here;
                        if (((ListItemComponent) cma1.O(i, inflate)) != null) {
                            i = z5h0.place_report;
                            ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                            if (listItemComponent2 != null) {
                                i = z5h0.placeholder;
                                LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, inflate);
                                if (linearLayout2 != null) {
                                    i = z5h0.screen_title;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                    if (robotoTextView2 != null) {
                                        return new goz((GoLinearLayout) inflate, listItemComponent, robotoTextView, linearLayout, goBottomButtonsLinearLayout, listItemComponent2, linearLayout2, robotoTextView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public int getBottomFocusRectOffset() {
        return tje.u(IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, getContext());
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ynz ynzVar = this.presenter;
        ynzVar.Bg(this);
        render((Object) eoz.a);
        ynzVar.F = tje.h(ynzVar.Jg(), null, null, new LongTapPresenter$getPointAddress$1(ynzVar, null), 3);
        ipv ipvVar = ynzVar.C;
        tje.N(ynzVar.Jg(), null, null, new LongTapPresenter$renderContent$$inlined$safeCollectIn$1(new e(new com.yandex.go.navigator.incidents.experiment.c(ipvVar.b, ipvVar), ynzVar), null, (xnz) ynzVar.Dg()), 3);
        tje.N(ynzVar.Jg(), null, null, new LongTapPresenter$focusOnPoint$1(ynzVar, null), 3);
        hideFloatButtonLocationHolder();
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.eyi0
    public void render(foz uiState) {
        if (uiState instanceof doz) {
            renderContent((doz) uiState);
        } else if (jl40.l(uiState, eoz.a)) {
            renderLoading();
        } else if (!jl40.l(uiState, eoz.b)) {
            w511.b();
            return;
        }
        post(new fbz(2, this));
    }
}
