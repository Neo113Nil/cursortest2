package com.yandex.plus.pay.ui.yb.web.internal.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import com.yandex.plus.pay.ui.yb.api.PlusPayYbCardScenario;
import com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity;
import com.yandex.plus.pay.ui.yb.web.internal.ui.b;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.a33;
import defpackage.aq80;
import defpackage.au2;
import defpackage.b64;
import defpackage.bah0;
import defpackage.cs31;
import defpackage.d1i0;
import defpackage.dz51;
import defpackage.eja1;
import defpackage.es31;
import defpackage.ez51;
import defpackage.ffx;
import defpackage.gbd0;
import defpackage.ghd0;
import defpackage.gz51;
import defpackage.hhd0;
import defpackage.hi41;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.j0g;
import defpackage.jl40;
import defpackage.k7d0;
import defpackage.kgx;
import defpackage.kmh0;
import defpackage.kz51;
import defpackage.lz51;
import defpackage.mkn;
import defpackage.mn41;
import defpackage.mx60;
import defpackage.mz51;
import defpackage.ny61;
import defpackage.pub1;
import defpackage.qc20;
import defpackage.qoi0;
import defpackage.qv10;
import defpackage.s23;
import defpackage.skd0;
import defpackage.sl91;
import defpackage.sls;
import defpackage.t23;
import defpackage.tls;
import defpackage.ul60;
import defpackage.w511;
import defpackage.wv5;
import defpackage.wyj;
import defpackage.y8f;
import defpackage.ywv;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 E2\u00020\u0001:\u0003FGHB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u0019\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\tH\u0014¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\tH\u0014¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u0003R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u00100R\u0016\u00102\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010%R\u0018\u00103\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010C¨\u0006I"}, d2 = {"Lcom/yandex/plus/pay/ui/yb/web/internal/ui/PlusPayYbWebActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Ldz51;", "findComponent", "()Ldz51;", "Lmz51;", ClidProvider.STATE, "Lzy11;", "setScreenState", "(Lmz51;)V", "Llz51;", "effect", "showScreeEffect", "(Llz51;)V", "component", "", "startedTimeoutMillis", "loadedTimeoutMillis", "Lmn41;", "createWebViewController", "(Ldz51;JJ)Lmn41;", "Lhi41;", "createPaymentWidgetContract", "(Ldz51;JJ)Lhi41;", "requireComponent", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroy", "finish", "", "isRecreatedAfterApplicationDeath", "Z", "Lcom/yandex/plus/pay/ui/yb/web/internal/ui/PlusPayYbWebActivity$Arguments;", "args$delegate", "Li3y;", "getArgs", "()Lcom/yandex/plus/pay/ui/yb/web/internal/ui/PlusPayYbWebActivity$Arguments;", "args", "Ldz51;", "Lcom/yandex/plus/pay/ui/yb/web/internal/ui/b;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/yb/web/internal/ui/b;", "viewModel", "webPageAlreadyLoaded", "webViewController", "Lmn41;", "Landroid/view/ViewGroup;", "root$delegate", "Lwv5;", "getRoot", "()Landroid/view/ViewGroup;", "root", "Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", "progressView$delegate", "getProgressView", "()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", "progressView", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "Companion", "Arguments", "com/yandex/plus/pay/ui/yb/web/internal/ui/a", "ghd0", "pay-sdk-ui-yb-web_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayYbWebActivity extends AppCompatActivity {

    @Deprecated
    public static final String ARGUMENTS_KEY = "arguments";

    @Deprecated
    public static final String RESULT_KEY = "arguments";

    @Deprecated
    public static final String SOURCE_YB = "YbBinding";

    @Deprecated
    public static final String WEBVIEW_NAME = "yb_binding";

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final i3y args;
    private dz51 component;
    private boolean isRecreatedAfterApplicationDeath;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final wv5 progressView;

    /* renamed from: root$delegate, reason: from kotlin metadata */
    private final wv5 root;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    private boolean webPageAlreadyLoaded;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final wv5 webViewContainer;
    private mn41 webViewController;
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("root", 0, "getRoot()Landroid/view/ViewGroup;", PlusPayYbWebActivity.class), b64.x(qoi0.a, PlusPayYbWebActivity.class, "progressView", "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", 0), new PropertyReference1Impl("webViewContainer", 0, "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", PlusPayYbWebActivity.class)};
    private static final ghd0 Companion = new ghd0();

    public PlusPayYbWebActivity() {
        super(kmh0.pay_sdk_activity_yb_web);
        final int i = 0;
        this.args = kotlin.a.a(new sls(this) { // from class: fhd0
            public final /* synthetic */ PlusPayYbWebActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPayYbWebActivity.Arguments args_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i2 = i;
                PlusPayYbWebActivity plusPayYbWebActivity = this.b;
                switch (i2) {
                    case 0:
                        args_delegate$lambda$0 = PlusPayYbWebActivity.args_delegate$lambda$0(plusPayYbWebActivity);
                        return args_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = PlusPayYbWebActivity.viewModel_delegate$lambda$1(plusPayYbWebActivity);
                        return viewModel_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        this.viewModel = new es31(qoi0.a(b.class), new sls(this) { // from class: com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity$special$$inlined$viewModels$default$2
            final /* synthetic */ ComponentActivity $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_viewModels.getViewModelStore();
            }
        }, new sls(this) { // from class: fhd0
            public final /* synthetic */ PlusPayYbWebActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPayYbWebActivity.Arguments args_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i22 = i2;
                PlusPayYbWebActivity plusPayYbWebActivity = this.b;
                switch (i22) {
                    case 0:
                        args_delegate$lambda$0 = PlusPayYbWebActivity.args_delegate$lambda$0(plusPayYbWebActivity);
                        return args_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = PlusPayYbWebActivity.viewModel_delegate$lambda$1(plusPayYbWebActivity);
                        return viewModel_delegate$lambda$1;
                }
            }
        }, new sls(this) { // from class: com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity$special$$inlined$viewModels$default$3
            final /* synthetic */ sls $extrasProducer = null;
            final /* synthetic */ ComponentActivity $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : y8fVar;
            }
        });
        this.root = new wv5(new hhd0(this, bah0.yb_web_root, i));
        this.progressView = new wv5(new hhd0(this, bah0.yb_web_progress_view, i2));
        this.webViewContainer = new wv5(new hhd0(this, bah0.yb_web_webview_container, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Arguments args_delegate$lambda$0(PlusPayYbWebActivity plusPayYbWebActivity) {
        Arguments arguments = (Arguments) ((Parcelable) ffx.P(plusPayYbWebActivity.getIntent(), "arguments", Arguments.class));
        if (arguments != null) {
            return arguments;
        }
        ny61.r("PlusPayYbWebActivity must be started using contract");
        return null;
    }

    private final hi41 createPaymentWidgetContract(dz51 component, long startedTimeoutMillis, long loadedTimeoutMillis) {
        return ((gz51) component).a.a(WEBVIEW_NAME, startedTimeoutMillis, loadedTimeoutMillis, new aq80(this));
    }

    private final mn41 createWebViewController(dz51 component, long startedTimeoutMillis, long loadedTimeoutMillis) {
        WebViewContainer webViewContainer = getWebViewContainer();
        au2 c = sl91.c(Collections.singletonList(createPaymentWidgetContract(component, startedTimeoutMillis, loadedTimeoutMillis)));
        ul60 a = ((gz51) component).e.a(SOURCE_YB);
        gz51 gz51Var = (gz51) component;
        ((wyj) gz51Var.d).getClass();
        com.yandex.plus.webview.api.a aVar = new com.yandex.plus.webview.api.a(webViewContainer, c, a, false, wyj.c, gz51Var.b);
        aVar.n = new j0g(getProgressView(), getWebViewContainer());
        aVar.k = (com.yandex.plus.pay.ui.webview.common.diagnostic.a) gz51Var.g.getValue();
        aVar.m = startedTimeoutMillis + loadedTimeoutMillis;
        aVar.l = false;
        return aVar.a();
    }

    private final dz51 findComponent() {
        Object failure;
        try {
            failure = (dz51) ez51.c.a(ho91.c(this));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            skd0.c(PlusLogTag.BILLING, "YbWebComponent is not found for " + PlusPayYbWebActivity.class.getName() + '!', a);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (dz51) failure;
    }

    private final Arguments getArgs() {
        return (Arguments) this.args.getValue();
    }

    private final ProgressView getProgressView() {
        return (ProgressView) this.progressView.a($$delegatedProperties[1]);
    }

    private final ViewGroup getRoot() {
        return (ViewGroup) this.root.a($$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b getViewModel() {
        return (b) this.viewModel.getValue();
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[2]);
    }

    private static final zy11 onCreate$lambda$3$lambda$2(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.c();
        aVar.b();
        aVar.b.add(8);
        aVar.a = true;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$4(PlusPayYbWebActivity plusPayYbWebActivity, mx60 mx60Var) {
        plusPayYbWebActivity.getViewModel().X();
        return zy11.a;
    }

    private final dz51 requireComponent() {
        dz51 dz51Var = this.component;
        if (dz51Var != null) {
            return dz51Var;
        }
        ny61.g("YbWebComponent must be set");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(mz51 state) {
        if (this.webPageAlreadyLoaded) {
            return;
        }
        mn41 createWebViewController = createWebViewController(requireComponent(), state.b, state.c);
        this.webPageAlreadyLoaded = true;
        createWebViewController.loadUrl(state.a, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showScreeEffect(lz51 effect) {
        if (effect instanceof kz51) {
            finish();
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$1(PlusPayYbWebActivity plusPayYbWebActivity) {
        dz51 requireComponent = plusPayYbWebActivity.requireComponent();
        final String url = plusPayYbWebActivity.getArgs().getUrl();
        final long startedTimeoutMillis = plusPayYbWebActivity.getArgs().getStartedTimeoutMillis();
        final long loadedTimeoutMillis = plusPayYbWebActivity.getArgs().getLoadedTimeoutMillis();
        final PlusPayYbCardScenario actionScenario = plusPayYbWebActivity.getArgs().getActionScenario();
        final gz51 gz51Var = (gz51) requireComponent;
        gz51Var.getClass();
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(b.class, new tls() { // from class: fz51
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return new b(url, startedTimeoutMillis, loadedTimeoutMillis, gz51Var.c, actionScenario);
            }
        })}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.isRecreatedAfterApplicationDeath) {
            setResult(0);
        } else {
            setResult(-1, new Intent().putExtra("arguments", getViewModel().x));
        }
        super.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        dz51 findComponent = findComponent();
        if (findComponent == null) {
            skd0.e(PlusLogTag.BILLING, PlusPayYbWebActivity.class.getName().concat(" is recreated after application death"));
            this.isRecreatedAfterApplicationDeath = true;
            super.onCreate(savedInstanceState);
            finish();
            return;
        }
        this.component = findComponent;
        mkn.b(this);
        gbd0 gbd0Var = ((gz51) findComponent).f;
        ((qc20) gbd0Var).getClass();
        setTheme(d1i0.PaySDK_Theme_Plus_DayNight);
        getLayoutInflater().setFactory2(new PlusPayUiKitInflaterFactory(gbd0Var));
        super.onCreate(savedInstanceState);
        ViewGroup root = getRoot();
        t23 t23Var = new t23();
        a33 a33Var = a33.c;
        t23.a aVar = new t23.a();
        onCreate$lambda$3$lambda$2(aVar);
        t23Var.a.put(a33Var, aVar);
        t23Var.a(root);
        pub1.c(getOnBackPressedDispatcher(), this, new k7d0(5, this));
        r0 r0Var = getViewModel().A;
        Lifecycle lifecycle = getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        c.d(g.a(r0Var, lifecycle, state), eja1.s(this), new PlusPayYbWebActivity$onCreate$3(this, null));
        c.b(g.a(getViewModel().z, getLifecycle(), state), eja1.s(this), new PlusPayYbWebActivity$onCreate$4(this, null));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.webViewController = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        mn41 mn41Var = this.webViewController;
        if (mn41Var != null) {
            mn41Var.onPause();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        mn41 mn41Var = this.webViewController;
        if (mn41Var != null) {
            mn41Var.onResume();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\rJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006+"}, d2 = {"Lcom/yandex/plus/pay/ui/yb/web/internal/ui/PlusPayYbWebActivity$Arguments;", "Landroid/os/Parcelable;", "", "url", "", "startedTimeoutMillis", "loadedTimeoutMillis", "Lcom/yandex/plus/pay/ui/yb/api/PlusPayYbCardScenario;", "actionScenario", "<init>", "(Ljava/lang/String;JJLcom/yandex/plus/pay/ui/yb/api/PlusPayYbCardScenario;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Lcom/yandex/plus/pay/ui/yb/api/PlusPayYbCardScenario;", "copy", "(Ljava/lang/String;JJLcom/yandex/plus/pay/ui/yb/api/PlusPayYbCardScenario;)Lcom/yandex/plus/pay/ui/yb/web/internal/ui/PlusPayYbWebActivity$Arguments;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "J", "getStartedTimeoutMillis", "getLoadedTimeoutMillis", "Lcom/yandex/plus/pay/ui/yb/api/PlusPayYbCardScenario;", "getActionScenario", "pay-sdk-ui-yb-web_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Arguments implements Parcelable {
        public static final Parcelable.Creator<Arguments> CREATOR = new Creator();
        private final PlusPayYbCardScenario actionScenario;
        private final long loadedTimeoutMillis;
        private final long startedTimeoutMillis;
        private final String url;

        public Arguments(String str, long j, long j2, PlusPayYbCardScenario plusPayYbCardScenario) {
            this.url = str;
            this.startedTimeoutMillis = j;
            this.loadedTimeoutMillis = j2;
            this.actionScenario = plusPayYbCardScenario;
        }

        public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, long j, long j2, PlusPayYbCardScenario plusPayYbCardScenario, int i, Object obj) {
            if ((i & 1) != 0) {
                str = arguments.url;
            }
            if ((i & 2) != 0) {
                j = arguments.startedTimeoutMillis;
            }
            if ((i & 4) != 0) {
                j2 = arguments.loadedTimeoutMillis;
            }
            if ((i & 8) != 0) {
                plusPayYbCardScenario = arguments.actionScenario;
            }
            PlusPayYbCardScenario plusPayYbCardScenario2 = plusPayYbCardScenario;
            return arguments.copy(str, j, j2, plusPayYbCardScenario2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartedTimeoutMillis() {
            return this.startedTimeoutMillis;
        }

        /* renamed from: component3, reason: from getter */
        public final long getLoadedTimeoutMillis() {
            return this.loadedTimeoutMillis;
        }

        /* renamed from: component4, reason: from getter */
        public final PlusPayYbCardScenario getActionScenario() {
            return this.actionScenario;
        }

        public final Arguments copy(String url, long startedTimeoutMillis, long loadedTimeoutMillis, PlusPayYbCardScenario actionScenario) {
            return new Arguments(url, startedTimeoutMillis, loadedTimeoutMillis, actionScenario);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) other;
            return jl40.l(this.url, arguments.url) && this.startedTimeoutMillis == arguments.startedTimeoutMillis && this.loadedTimeoutMillis == arguments.loadedTimeoutMillis && this.actionScenario == arguments.actionScenario;
        }

        public final PlusPayYbCardScenario getActionScenario() {
            return this.actionScenario;
        }

        public final long getLoadedTimeoutMillis() {
            return this.loadedTimeoutMillis;
        }

        public final long getStartedTimeoutMillis() {
            return this.startedTimeoutMillis;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.actionScenario.hashCode() + qv10.c(qv10.c(this.url.hashCode() * 31, 31, this.startedTimeoutMillis), 31, this.loadedTimeoutMillis);
        }

        public String toString() {
            return "Arguments(url=" + this.url + ", startedTimeoutMillis=" + this.startedTimeoutMillis + ", loadedTimeoutMillis=" + this.loadedTimeoutMillis + ", actionScenario=" + this.actionScenario + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.url);
            dest.writeLong(this.startedTimeoutMillis);
            dest.writeLong(this.loadedTimeoutMillis);
            dest.writeString(this.actionScenario.name());
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Arguments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                return new Arguments(parcel.readString(), parcel.readLong(), parcel.readLong(), PlusPayYbCardScenario.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i) {
                return new Arguments[i];
            }
        }
    }
}
