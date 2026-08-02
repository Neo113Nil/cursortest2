package com.yandex.passport.internal.social.esia;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import androidx.activity.ComponentActivity;
import androidx.core.app.a1;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.exception.PassportEsiaException;
import com.yandex.passport.api.exception.PassportException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.flags.presentation.f1;
import com.yandex.passport.internal.report.reporters.EsiaBindingReporter$EsiaWay;
import com.yandex.passport.internal.report.reporters.EsiaBindingReporter$FinishStatus;
import com.yandex.passport.internal.social.esia.EsiaBindViewModel$Result;
import com.yandex.passport.internal.social.esia.EsiaInternalBindProperties;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.es31;
import defpackage.ffx;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mkn;
import defpackage.mx60;
import defpackage.pub1;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tka1;
import defpackage.v0d;
import defpackage.vng;
import defpackage.w511;
import defpackage.x40;
import defpackage.y8f;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 N2\u00020\u0001:\u0003OPQB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020(*\u00020$H\u0002¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b,\u0010-J#\u0010/\u001a\u00020.2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR#\u0010M\u001a\n I*\u0004\u0018\u00010H0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00103\u001a\u0004\bK\u0010L¨\u0006R"}, d2 = {"Lcom/yandex/passport/internal/social/esia/EsiaBindActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onStop", "outState", "onSaveInstanceState", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "launchEsiaDeepLink", "(Landroid/net/Uri;)V", "Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties;", "getProperties", "()Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties;", "properties", "Lcom/yandex/passport/internal/social/esia/SocialismUrlProvider$ActualTheme;", "getActualTheme", "(Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties;)Lcom/yandex/passport/internal/social/esia/SocialismUrlProvider$ActualTheme;", "Landroid/content/Context;", "context", "getSystemTheme", "(Landroid/content/Context;)Lcom/yandex/passport/internal/social/esia/SocialismUrlProvider$ActualTheme;", "Lcom/yandex/passport/internal/social/esia/EsiaBindViewModel$Result;", TarifficatorScenarioActivity.RESULT_KEY, "finishActivityWithResult", "(Lcom/yandex/passport/internal/social/esia/EsiaBindViewModel$Result;)V", "", "error", "finishActivityWithError", "(Ljava/lang/Throwable;)V", "Lcom/yandex/passport/api/exception/PassportException;", "mapToPassportException", "(Ljava/lang/Throwable;)Lcom/yandex/passport/api/exception/PassportException;", "Lcom/yandex/passport/common/core/Uid;", "getUid", "(Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties;Landroid/os/Bundle;)Lcom/yandex/passport/common/core/Uid;", "Lcom/yandex/passport/common/ui/AppTheme;", "getAppTheme", "(Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties;Landroid/os/Bundle;)Lcom/yandex/passport/common/ui/AppTheme;", "Lcom/yandex/passport/internal/social/esia/h;", "component$delegate", "Li3y;", "getComponent", "()Lcom/yandex/passport/internal/social/esia/h;", "component", "Lcom/yandex/passport/internal/report/reporters/y;", "reporter$delegate", "getReporter", "()Lcom/yandex/passport/internal/report/reporters/y;", "reporter", "Lcom/yandex/passport/internal/social/esia/i0;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/passport/internal/social/esia/i0;", "viewModel", "", "isOpenInEsiaApp", "Ljava/lang/Boolean;", "uid", "Lcom/yandex/passport/common/core/Uid;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/common/ui/AppTheme;", "Landroid/webkit/CookieManager;", "kotlin.jvm.PlatformType", "cookieManager$delegate", "getCookieManager", "()Landroid/webkit/CookieManager;", "cookieManager", "Companion", "a", "com/yandex/passport/internal/social/esia/c", "com/yandex/passport/internal/social/esia/d", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EsiaBindActivity extends ComponentActivity {
    public static final int $stable = 8;
    public static final d Companion = new d();
    private static final String ESIA_PACKAGE_NAME = "ru.rostel";
    public static final String EXTRA_EXCEPTION = "EXTRA_EXCEPTION";
    public static final String EXTRA_TASK_ID = "EXTRA_TASK_ID";
    private static final String INTERNAL_BIND_PROPERTIES = "INTERNAL_BIND_PROPERTIES";
    public static final int RESULT_ERROR = 2;
    private static final String SAVED_IS_OPEN_IN_APP = "SAVED_IS_OPEN_IN_APP";
    private static final String SAVED_THEME = "SAVED_THEME";
    private static final String SAVED_UID = "SAVED_UID";
    private Boolean isOpenInEsiaApp;
    private AppTheme theme;
    private Uid uid;

    /* renamed from: component$delegate, reason: from kotlin metadata */
    private final i3y component = kotlin.a.a(new com.yandex.passport.internal.social.esia.a(this, 0));

    /* renamed from: reporter$delegate, reason: from kotlin metadata */
    private final i3y reporter = kotlin.a.a(new com.yandex.passport.internal.social.esia.a(this, 1));

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(i0.class), new sls(this) { // from class: com.yandex.passport.internal.social.esia.EsiaBindActivity$special$$inlined$viewModels$default$2
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
    }, new com.yandex.passport.internal.social.esia.a(this, 2), new sls(this) { // from class: com.yandex.passport.internal.social.esia.EsiaBindActivity$special$$inlined$viewModels$default$3
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

    /* renamed from: cookieManager$delegate, reason: from kotlin metadata */
    private final i3y cookieManager = kotlin.a.a(new a1(10));

    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            EsiaBindActivity.Companion.getClass();
            return d.a(context, (EsiaInternalBindProperties) obj);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            Object failure;
            Bundle extras;
            if (i == -1) {
                String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString(EsiaBindActivity.EXTRA_TASK_ID);
                failure = string != null ? new c(string) : new Result.Failure(new IllegalStateException("Missing required params."));
            } else {
                failure = new Result.Failure(new Exception("Cancelled."));
            }
            return new Result(failure);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h component_delegate$lambda$0(EsiaBindActivity esiaBindActivity) {
        EsiaInternalBindProperties properties = esiaBindActivity.getProperties();
        return com.yandex.passport.internal.di.a.a().createEsiaBindComponentBuilder().setEsiaInternalBindProperties(properties).setActualTheme(esiaBindActivity.getActualTheme(properties)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishActivityWithError(Throwable error) {
        setResult(2, new Intent().putExtra(EXTRA_EXCEPTION, mapToPassportException(error)));
        getReporter().m(this.uid, EsiaBindingReporter$FinishStatus.ERROR, error);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishActivityWithResult(EsiaBindViewModel$Result result) {
        if (jl40.l(result, EsiaBindViewModel$Result.Canceled.INSTANCE)) {
            getReporter().m(this.uid, EsiaBindingReporter$FinishStatus.CANCELLED, null);
        } else {
            if (!(result instanceof EsiaBindViewModel$Result.Success)) {
                w511.b();
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(EXTRA_TASK_ID, ((EsiaBindViewModel$Result.Success) result).getTaskId());
            setResult(-1, intent);
            getReporter().m(this.uid, EsiaBindingReporter$FinishStatus.SUCCESS, null);
        }
        finish();
    }

    private final SocialismUrlProvider$ActualTheme getActualTheme(EsiaInternalBindProperties properties) {
        AppTheme appTheme = properties != null ? properties.getAppTheme() : null;
        int i = appTheme == null ? -1 : e.a[appTheme.ordinal()];
        return i != 1 ? i != 2 ? getSystemTheme(this) : SocialismUrlProvider$ActualTheme.DARK : SocialismUrlProvider$ActualTheme.LIGHT;
    }

    private final AppTheme getAppTheme(EsiaInternalBindProperties properties, Bundle savedInstanceState) {
        AppTheme appTheme;
        if (properties != null && (appTheme = properties.getAppTheme()) != null) {
            return appTheme;
        }
        AppTheme appTheme2 = savedInstanceState != null ? (AppTheme) vng.w(savedInstanceState, AppTheme.class, SAVED_THEME) : null;
        return appTheme2 == null ? AppTheme.FOLLOW_SYSTEM : appTheme2;
    }

    private final h getComponent() {
        return (h) this.component.getValue();
    }

    private final CookieManager getCookieManager() {
        return (CookieManager) this.cookieManager.getValue();
    }

    private final EsiaInternalBindProperties getProperties() {
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        try {
            return (EsiaInternalBindProperties) ffx.P(intent, INTERNAL_BIND_PROPERTIES, EsiaInternalBindProperties.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.passport.internal.report.reporters.y getReporter() {
        return (com.yandex.passport.internal.report.reporters.y) this.reporter.getValue();
    }

    private final SocialismUrlProvider$ActualTheme getSystemTheme(Context context) {
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i != 16 && i == 32) {
            return SocialismUrlProvider$ActualTheme.DARK;
        }
        return SocialismUrlProvider$ActualTheme.LIGHT;
    }

    private final Uid getUid(EsiaInternalBindProperties properties, Bundle savedInstanceState) {
        Uid uid;
        EsiaInternalBindProperties.UserAwareRequest userAwareRequest = properties instanceof EsiaInternalBindProperties.UserAwareRequest ? (EsiaInternalBindProperties.UserAwareRequest) properties : null;
        if (userAwareRequest != null && (uid = userAwareRequest.getUid()) != null) {
            return uid;
        }
        if (savedInstanceState != null) {
            return (Uid) vng.u(savedInstanceState, Uid.class, SAVED_UID);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i0 getViewModel() {
        return (i0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchEsiaDeepLink(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        ComponentName resolveActivity = intent.resolveActivity(getPackageManager());
        this.isOpenInEsiaApp = Boolean.valueOf(jl40.l(resolveActivity != null ? resolveActivity.getPackageName() : null, ESIA_PACKAGE_NAME));
        com.yandex.passport.internal.report.reporters.y reporter = getReporter();
        Uid uid = this.uid;
        Boolean bool = this.isOpenInEsiaApp;
        reporter.n(uid, bool != null ? bool.booleanValue() ? EsiaBindingReporter$EsiaWay.APPLICATION : EsiaBindingReporter$EsiaWay.BROWSER : null);
        try {
            tka1.f(this).startActivity(intent);
        } catch (ActivityNotFoundException e) {
            finishActivityWithError(e);
        }
    }

    private final PassportException mapToPassportException(Throwable th) {
        if (th instanceof PassportException) {
            return (PassportException) th;
        }
        if (!(th instanceof EsiaException)) {
            return new PassportRuntimeUnknownException(th);
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        return new PassportEsiaException(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$5(EsiaBindActivity esiaBindActivity, mx60 mx60Var) {
        esiaBindActivity.getReporter().m(esiaBindActivity.uid, EsiaBindingReporter$FinishStatus.CANCELLED, null);
        mx60Var.h(false);
        esiaBindActivity.getOnBackPressedDispatcher().c();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.yandex.passport.internal.report.reporters.y reporter_delegate$lambda$1(EsiaBindActivity esiaBindActivity) {
        return esiaBindActivity.getComponent().getEsiaBindingReporter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$2(EsiaBindActivity esiaBindActivity) {
        return esiaBindActivity.getComponent().getViewModelFactory();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        EsiaInternalBindProperties properties = getProperties();
        AppTheme appTheme = getAppTheme(properties, savedInstanceState);
        this.theme = appTheme;
        this.isOpenInEsiaApp = savedInstanceState != null ? Boolean.valueOf(savedInstanceState.getBoolean(SAVED_IS_OPEN_IN_APP)) : null;
        this.uid = getUid(properties, savedInstanceState);
        mkn.a(this, com.yandex.passport.common.ui.compose.d.d(appTheme), com.yandex.passport.common.ui.compose.d.d(appTheme));
        super.onCreate(savedInstanceState);
        v0d.a(this, new androidx.compose.runtime.internal.a(-595149696, new f1(1, appTheme, this), true));
        pub1.c(getOnBackPressedDispatcher(), this, new b(this, 0));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        i0 viewModel = getViewModel();
        Uri data = intent.getData();
        Boolean bool = this.isOpenInEsiaApp;
        viewModel.b.a(new c0(data, bool != null ? bool.booleanValue() ? EsiaBindingReporter$EsiaWay.APPLICATION : EsiaBindingReporter$EsiaWay.BROWSER : null));
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        i0 viewModel = getViewModel();
        Boolean bool = this.isOpenInEsiaApp;
        if (bool != null) {
            bool.booleanValue();
            EsiaBindingReporter$EsiaWay esiaBindingReporter$EsiaWay = EsiaBindingReporter$EsiaWay.WEB_VIEW;
        }
        viewModel.b.a(e0.a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Boolean bool = this.isOpenInEsiaApp;
        if (bool != null) {
            outState.putBoolean(SAVED_IS_OPEN_IN_APP, bool.booleanValue());
        }
        Uid uid = this.uid;
        if (uid != null) {
            outState.putParcelable(SAVED_UID, uid);
        }
        AppTheme appTheme = this.theme;
        if (appTheme != null) {
            outState.putSerializable(SAVED_THEME, appTheme);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        try {
            getCookieManager().flush();
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "cookieManager.flush() error", e);
            }
        }
        super.onStop();
    }
}
