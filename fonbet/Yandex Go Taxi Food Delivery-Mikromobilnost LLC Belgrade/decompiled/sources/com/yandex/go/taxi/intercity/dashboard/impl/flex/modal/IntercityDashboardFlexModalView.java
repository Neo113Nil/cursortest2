package com.yandex.go.taxi.intercity.dashboard.impl.flex.modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.intercity.dashboard.impl.flex.modal.IntercityDashboardFlexModalView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cir;
import defpackage.cma1;
import defpackage.d230;
import defpackage.elw;
import defpackage.few;
import defpackage.flw;
import defpackage.gew;
import defpackage.h00;
import defpackage.h2g;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.j8h0;
import defpackage.k15;
import defpackage.k6x;
import defpackage.kr;
import defpackage.lew;
import defpackage.llw;
import defpackage.mlw;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.odw;
import defpackage.oep0;
import defpackage.oew;
import defpackage.pdw;
import defpackage.pep0;
import defpackage.pey;
import defpackage.q5z;
import defpackage.qgr;
import defpackage.qu;
import defpackage.rdw;
import defpackage.sls;
import defpackage.tdw;
import defpackage.tje;
import defpackage.tkh0;
import defpackage.wgr;
import defpackage.xdw;
import defpackage.xgr;
import defpackage.yvf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006Bm\b\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020'H\u0014¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010)J\u0017\u0010/\u001a\u00020'2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00105R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00109R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/flex/modal/IntercityDashboardFlexModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lpdw;", "Lnwy0;", "Lllw;", "Lpey;", "Lh00;", "Landroid/content/Context;", "context", "Lxdw;", "intercityDashboardFlexParams", "Lodw;", "flexDashboardInnerNavigation", "Loew;", "flexDashboardScreenNavigation", "Lk6x;", "jasonStateStore", "Lcir;", "flexDashboardUpdateTriggersRepository", "Lmlw;", "intercityDashboardViewNavigationStack", "Lyvf0;", "Lflw;", "intercityDashboardUiFlexDependenciesProvider", "Loep0;", "screenStackNavigator", "Lxgr;", "flexActionRepositoryFactory", "<init>", "(Landroid/content/Context;Lxdw;Lodw;Loew;Lk6x;Lcir;Lmlw;Lyvf0;Loep0;Lxgr;)V", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Ld230;", "insetsType", "()Ld230;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onPause", "onResume", "Lkr;", "action", "dispatchAction", "(Lkr;)V", "Lxdw;", "Lodw;", "Loew;", "Lk6x;", "Lcir;", "Lmlw;", "getIntercityDashboardViewNavigationStack", "()Lmlw;", "Lyvf0;", "Loep0;", "Landroidx/lifecycle/t;", "lifecycleRegistry", "Landroidx/lifecycle/t;", "Lwgr;", "flexActionRepository", "Lwgr;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "Lrdw;", "binding", "Lrdw;", "Lelw;", "intercityDashboardFlexComponent$delegate", "Li3y;", "getIntercityDashboardFlexComponent", "()Lelw;", "intercityDashboardFlexComponent", "Lfew;", "intercityDashboardFlexRouter$delegate", "getIntercityDashboardFlexRouter", "()Lfew;", "intercityDashboardFlexRouter", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardFlexModalView extends ModalView implements pdw, llw, pey, h00 {
    private final rdw binding;
    private final wgr flexActionRepository;
    private final odw flexDashboardInnerNavigation;
    private final oew flexDashboardScreenNavigation;
    private final cir flexDashboardUpdateTriggersRepository;

    /* renamed from: intercityDashboardFlexComponent$delegate, reason: from kotlin metadata */
    private final i3y intercityDashboardFlexComponent;
    private final xdw intercityDashboardFlexParams;

    /* renamed from: intercityDashboardFlexRouter$delegate, reason: from kotlin metadata */
    private final i3y intercityDashboardFlexRouter;
    private final yvf0 intercityDashboardUiFlexDependenciesProvider;
    private final mlw intercityDashboardViewNavigationStack;
    private final k6x jasonStateStore;
    private final Lifecycle lifecycle;
    private final t lifecycleRegistry;
    private final oep0 screenStackNavigator;

    public IntercityDashboardFlexModalView(Context context, xdw xdwVar, odw odwVar, oew oewVar, k6x k6xVar, cir cirVar, mlw mlwVar, yvf0 yvf0Var, oep0 oep0Var, xgr xgrVar) {
        super(context);
        View O;
        this.intercityDashboardFlexParams = xdwVar;
        this.flexDashboardInnerNavigation = odwVar;
        this.flexDashboardScreenNavigation = oewVar;
        this.jasonStateStore = k6xVar;
        this.flexDashboardUpdateTriggersRepository = cirVar;
        this.intercityDashboardViewNavigationStack = mlwVar;
        this.intercityDashboardUiFlexDependenciesProvider = yvf0Var;
        this.screenStackNavigator = oep0Var;
        final int i = 1;
        t tVar = new t(this, true);
        this.lifecycleRegistry = tVar;
        ((qgr) xgrVar).getClass();
        this.flexActionRepository = new k15();
        this.lifecycle = tVar;
        final int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(tkh0.intercity_dashboard_flex_modal_view, (ViewGroup) this, false);
        addView(inflate);
        GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
        int i3 = j8h0.flex_view_container;
        GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i3, inflate);
        if (goFrameLayout2 == null || (O = cma1.O((i3 = j8h0.rounded_background_view), inflate)) == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
            throw null;
        }
        this.binding = new rdw(goFrameLayout, goFrameLayout2, O);
        sls slsVar = new sls(this) { // from class: qdw
            public final /* synthetic */ IntercityDashboardFlexModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                elw intercityDashboardFlexComponent_delegate$lambda$0;
                few intercityDashboardFlexRouter_delegate$lambda$0;
                int i4 = i2;
                IntercityDashboardFlexModalView intercityDashboardFlexModalView = this.b;
                switch (i4) {
                    case 0:
                        intercityDashboardFlexComponent_delegate$lambda$0 = IntercityDashboardFlexModalView.intercityDashboardFlexComponent_delegate$lambda$0(intercityDashboardFlexModalView);
                        return intercityDashboardFlexComponent_delegate$lambda$0;
                    default:
                        intercityDashboardFlexRouter_delegate$lambda$0 = IntercityDashboardFlexModalView.intercityDashboardFlexRouter_delegate$lambda$0(intercityDashboardFlexModalView);
                        return intercityDashboardFlexRouter_delegate$lambda$0;
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.intercityDashboardFlexComponent = a.b(lazyThreadSafetyMode, slsVar);
        this.intercityDashboardFlexRouter = a.b(lazyThreadSafetyMode, new sls(this) { // from class: qdw
            public final /* synthetic */ IntercityDashboardFlexModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                elw intercityDashboardFlexComponent_delegate$lambda$0;
                few intercityDashboardFlexRouter_delegate$lambda$0;
                int i4 = i;
                IntercityDashboardFlexModalView intercityDashboardFlexModalView = this.b;
                switch (i4) {
                    case 0:
                        intercityDashboardFlexComponent_delegate$lambda$0 = IntercityDashboardFlexModalView.intercityDashboardFlexComponent_delegate$lambda$0(intercityDashboardFlexModalView);
                        return intercityDashboardFlexComponent_delegate$lambda$0;
                    default:
                        intercityDashboardFlexRouter_delegate$lambda$0 = IntercityDashboardFlexModalView.intercityDashboardFlexRouter_delegate$lambda$0(intercityDashboardFlexModalView);
                        return intercityDashboardFlexRouter_delegate$lambda$0;
                }
            }
        });
        tVar.i(Lifecycle.State.INITIALIZED);
    }

    private final elw getIntercityDashboardFlexComponent() {
        return (elw) this.intercityDashboardFlexComponent.getValue();
    }

    private final few getIntercityDashboardFlexRouter() {
        return (few) this.intercityDashboardFlexRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final elw intercityDashboardFlexComponent_delegate$lambda$0(IntercityDashboardFlexModalView intercityDashboardFlexModalView) {
        flw flwVar = (flw) intercityDashboardFlexModalView.intercityDashboardUiFlexDependenciesProvider.get();
        flwVar.getClass();
        return new h2g(flwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final few intercityDashboardFlexRouter_delegate$lambda$0(IntercityDashboardFlexModalView intercityDashboardFlexModalView) {
        gew gewVar = ((h2g) intercityDashboardFlexModalView.getIntercityDashboardFlexComponent()).a.a;
        q5z.h(gewVar);
        return gewVar.a(intercityDashboardFlexModalView.intercityDashboardFlexParams, intercityDashboardFlexModalView.flexDashboardInnerNavigation, intercityDashboardFlexModalView.flexDashboardScreenNavigation, intercityDashboardFlexModalView.jasonStateStore, intercityDashboardFlexModalView.flexDashboardUpdateTriggersRepository, intercityDashboardFlexModalView.flexActionRepository, intercityDashboardFlexModalView.binding.b, intercityDashboardFlexModalView.lifecycleRegistry, intercityDashboardFlexModalView.intercityDashboardViewNavigationStack);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.black;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.binding.a;
    }

    @Override // defpackage.h00
    public void dispatchAction(kr action) {
        tje.N(r.a(getLifecycle()), null, null, new IntercityDashboardFlexModalView$dispatchAction$1(this, action, null), 3);
    }

    public final mlw getIntercityDashboardViewNavigationStack() {
        return this.intercityDashboardViewNavigationStack;
    }

    @Override // defpackage.pey
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public d230 insetsType() {
        return new d230(0);
    }

    @Override // defpackage.llw
    public View itemView() {
        return this;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        getLifecycle();
        ((pep0) this.screenStackNavigator).f(getIntercityDashboardFlexRouter(), new lew(), hxx.a);
        this.lifecycleRegistry.i(Lifecycle.State.STARTED);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.lifecycleRegistry.i(Lifecycle.State.CREATED);
        ((tdw) this.flexDashboardInnerNavigation).a.r(new qu(9));
        getIntercityDashboardFlexRouter().i();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.llw
    public void onPause() {
        if (this.lifecycleRegistry.w.compareTo(Lifecycle.State.RESUMED) >= 0) {
            this.lifecycleRegistry.i(Lifecycle.State.STARTED);
        }
    }

    @Override // defpackage.llw
    public void onResume() {
        Lifecycle.State state = this.lifecycleRegistry.w;
        Lifecycle.State state2 = Lifecycle.State.RESUMED;
        if (state.compareTo(state2) < 0) {
            this.lifecycleRegistry.i(state2);
        }
    }
}
