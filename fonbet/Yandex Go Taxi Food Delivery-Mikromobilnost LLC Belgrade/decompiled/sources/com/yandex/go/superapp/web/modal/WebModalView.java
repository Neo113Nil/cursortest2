package com.yandex.go.superapp.web.modal;

import android.view.View;
import com.yandex.go.superapp.web.modal.WebModalView;
import com.yandex.go.superapp.web.view.SuperAppWebView;
import defpackage.aj31;
import defpackage.bf4;
import defpackage.bvf0;
import defpackage.c230;
import defpackage.czo0;
import defpackage.e230;
import defpackage.eg01;
import defpackage.fl10;
import defpackage.hbp0;
import defpackage.j7w0;
import defpackage.ja41;
import defpackage.ka41;
import defpackage.l7w0;
import defpackage.l8x;
import defpackage.la41;
import defpackage.lh2;
import defpackage.na41;
import defpackage.o430;
import defpackage.rnc;
import defpackage.sh41;
import defpackage.sls;
import defpackage.tpr;
import defpackage.uh41;
import defpackage.vh41;
import defpackage.vu30;
import defpackage.w511;
import defpackage.y130;
import defpackage.z270;
import defpackage.zw60;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.eatskit.WebContentView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fBA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010\u001eJ\u000f\u0010'\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\u001aH\u0002¢\u0006\u0004\b(\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R&\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020108078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u0004\u0018\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020K8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lcom/yandex/go/superapp/web/modal/WebModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lbf4;", "Lru/yandex/taxi/activity/h;", "backPressTracker", "Lsh41;", "webMetricaReporter", "Lcom/yandex/go/superapp/web/modal/m;", "paymentsDelegate", "Lcom/yandex/go/superapp/web/modal/n;", "endpointDescription", "Lcom/yandex/go/superapp/web/domain/a;", "mobEndpointDescriptionProvider", "Lz270;", "ongoingTokenUserIdProvider", "Luh41;", "initParams", "<init>", "(Lru/yandex/taxi/activity/h;Lsh41;Lcom/yandex/go/superapp/web/modal/m;Lcom/yandex/go/superapp/web/modal/n;Lcom/yandex/go/superapp/web/domain/a;Lz270;Luh41;)V", "Le230;", "insetsType", "()Le230;", "Lru/yandex/taxi/widget/SlideableModalView$CardMode;", "cardMode", "", "fromInit", "Lzy11;", "setCardMode", "(Lru/yandex/taxi/widget/SlideableModalView$CardMode;Z)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPress", "()Z", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "onBackPressedInternal", "handleDismissAction", "cleanup", "Lru/yandex/taxi/activity/h;", "Lsh41;", "Lcom/yandex/go/superapp/web/modal/m;", "Lcom/yandex/go/superapp/web/modal/n;", "Luh41;", "Lhbp0;", "coroutineScopeDelegate", "Lhbp0;", "", "url", "Ljava/lang/String;", "Lru/yandex/taxi/eatskit/d;", "serviceController", "Lru/yandex/taxi/eatskit/d;", "Ltpr;", "Lkotlin/Pair;", "ongoingTokenUserIdPair", "Ltpr;", "Lcom/yandex/go/superapp/web/view/SuperAppWebView;", "superappWebView", "Lcom/yandex/go/superapp/web/view/SuperAppWebView;", "Ll8x;", "authJob", "Ll8x;", "Lj7w0;", "loadCallbacks", "Lj7w0;", "Lru/yandex/taxi/eatskit/WebContentView;", "superAppContent", "Lru/yandex/taxi/eatskit/WebContentView;", UgcLiveVideoData.UgcLiveStatus.READY, "Z", "dissmissAction", "Ljava/lang/Runnable;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "Lrnc;", "getMainDelegate", "()Lrnc;", "mainDelegate", "Lla41;", "getShareDelegate", "()Lla41;", "shareDelegate", "Lja41;", "getAnalyticsDelegate", "()Lja41;", "analyticsDelegate", "Lka41;", "getEndpointDescriptionDelegate", "()Lka41;", "endpointDescriptionDelegate", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WebModalView extends SlideableModalView implements bf4 {
    private l8x authJob;
    private final ru.yandex.taxi.activity.h backPressTracker;
    private final hbp0 coroutineScopeDelegate;
    private Runnable dissmissAction;
    private final n endpointDescription;
    private final uh41 initParams;
    private final j7w0 loadCallbacks;
    private final tpr ongoingTokenUserIdPair;
    private final m paymentsDelegate;
    private boolean ready;
    private final ru.yandex.taxi.eatskit.d serviceController;
    private final WebContentView superAppContent;
    private final SuperAppWebView superappWebView;
    private final String url;
    private final sh41 webMetricaReporter;

    public WebModalView(ru.yandex.taxi.activity.h hVar, sh41 sh41Var, m mVar, n nVar, com.yandex.go.superapp.web.domain.a aVar, z270 z270Var, uh41 uh41Var) {
        super(uh41Var.a, Integer.valueOf(uh41Var.f));
        this.backPressTracker = hVar;
        this.webMetricaReporter = sh41Var;
        this.paymentsDelegate = mVar;
        this.endpointDescription = nVar;
        this.initParams = uh41Var;
        this.coroutineScopeDelegate = new hbp0(new czo0(14), "", null);
        this.url = aVar.c.b(uh41Var.b);
        this.ongoingTokenUserIdPair = new ru.yandex.taxi.startup.launch.n(kotlinx.coroutines.flow.e.s(((ru.yandex.taxi.launch.c) ((fl10) z270Var).a).b(), new vu30(17)));
        WebModalViewContent webModalViewContent = uh41Var.a;
        this.superappWebView = webModalViewContent.getSuperAppWebView();
        this.loadCallbacks = uh41Var.e;
        WebContentView contentView = webModalViewContent.getContentView();
        this.superAppContent = contentView;
        setCardMode(uh41Var.g ? SlideableModalView.CardMode.FULLSCREEN : SlideableModalView.CardMode.SLIDEABLE_CARD);
        setDismissOnBackPressed(false);
        super.setOnBackPressedListener(new l7w0(this, 2));
        this.serviceController = new ru.yandex.taxi.eatskit.d(uh41Var.i, new na41(getMainDelegate(), mVar, getShareDelegate(), getAnalyticsDelegate(), getEndpointDescriptionDelegate()), uh41Var.j, uh41Var.l);
        contentView.setVisibility((uh41Var.d || !uh41Var.c) ? 4 : 0);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.superapp.web.modal.WebModalView$special$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    this.removeOnAttachStateChangeListener(this);
                    boolean z = this.initParams.c;
                    WebModalView webModalView = this;
                    if (!z) {
                        webModalView.superappWebView.loadUrl(this.url);
                        return;
                    }
                    ru.yandex.taxi.eatskit.d dVar = webModalView.serviceController;
                    WebContentView webContentView = this.superAppContent;
                    dVar.l = webContentView;
                    if (webContentView != null) {
                        dVar.v(webContentView);
                        webContentView.updateState(dVar.f);
                    }
                    this.serviceController.t(true);
                    ru.yandex.taxi.eatskit.d dVar2 = this.serviceController;
                    dVar2.i = null;
                    dVar2.r(null, false);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        } else if (this.initParams.c) {
            ru.yandex.taxi.eatskit.d dVar = this.serviceController;
            WebContentView webContentView = this.superAppContent;
            dVar.l = webContentView;
            if (webContentView != null) {
                dVar.v(webContentView);
                webContentView.updateState(dVar.f);
            }
            this.serviceController.t(true);
            ru.yandex.taxi.eatskit.d dVar2 = this.serviceController;
            dVar2.i = null;
            dVar2.r(null, false);
        } else {
            this.superappWebView.loadUrl(this.url);
        }
        nVar.b.a();
        zw60 zw60Var = uh41Var.h;
        if (zw60Var != null) {
            setOnAppearingListener(zw60Var);
        }
    }

    private final void cleanup() {
        this.backPressTracker.a.remove(this);
        this.serviceController.c();
        this.superappWebView.destroy();
        this.paymentsDelegate.x.b();
        this.endpointDescription.b.b();
        bvf0.j(this.coroutineScopeDelegate, null);
    }

    private final ja41 getAnalyticsDelegate() {
        return new aj31(7, this);
    }

    private final ka41 getEndpointDescriptionDelegate() {
        return this.endpointDescription;
    }

    private final rnc getMainDelegate() {
        return new o(this);
    }

    private final la41 getShareDelegate() {
        return new eg01(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDismissAction() {
        Runnable runnable = this.dissmissAction;
        if (runnable != null) {
            runnable.run();
        } else {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(WebModalView webModalView) {
        return webModalView.initParams.a.getContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$1(WebModalView webModalView) {
        return webModalView.initParams.a.getContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackPressedInternal() {
        if (this.serviceController.i()) {
            return;
        }
        handleDismissAction();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        if (this.initParams.f == 7) {
            final int i = 0;
            return new y130(112, new sls(this) { // from class: th41
                public final /* synthetic */ WebModalView b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    View insetsType$lambda$0;
                    View insetsType$lambda$1;
                    int i2 = i;
                    WebModalView webModalView = this.b;
                    switch (i2) {
                        case 0:
                            insetsType$lambda$0 = WebModalView.insetsType$lambda$0(webModalView);
                            return insetsType$lambda$0;
                        default:
                            insetsType$lambda$1 = WebModalView.insetsType$lambda$1(webModalView);
                            return insetsType$lambda$1;
                    }
                }
            }, true);
        }
        final int i2 = 1;
        return new c230(112, new sls(this) { // from class: th41
            public final /* synthetic */ WebModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View insetsType$lambda$0;
                View insetsType$lambda$1;
                int i22 = i2;
                WebModalView webModalView = this.b;
                switch (i22) {
                    case 0:
                        insetsType$lambda$0 = WebModalView.insetsType$lambda$0(webModalView);
                        return insetsType$lambda$0;
                    default:
                        insetsType$lambda$1 = WebModalView.insetsType$lambda$1(webModalView);
                        return insetsType$lambda$1;
                }
            }
        }, true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.backPressTracker.a.push(this);
        this.coroutineScopeDelegate.a();
    }

    @Override // defpackage.bf4
    public boolean onBackPress() {
        onBackPressed();
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.coroutineScopeDelegate.b();
        cleanup();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setCardMode(SlideableModalView.CardMode cardMode, boolean fromInit) {
        super.setCardMode(cardMode, fromInit);
        int i = vh41.a[cardMode.ordinal()];
        if (i == 1 || i == 2) {
            setAnimationDelegate(o430.b);
        } else if (i != 3) {
            w511.b();
        } else {
            lh2 lh2Var = lh2.c;
            setAnimationDelegate(lh2.c);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        this.dissmissAction = onBackPressedListener;
        super.setOnBackPressedListener(new l7w0(this, 3));
    }
}
