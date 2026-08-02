package com.yandex.passport.internal.ui.router;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.ProgressBackground;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.VisualProperties;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterBackground;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.eja1;
import defpackage.es31;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.li91;
import defpackage.lid0;
import defpackage.m50;
import defpackage.oz40;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.t40;
import defpackage.tje;
import defpackage.v0d;
import defpackage.vng;
import defpackage.y8f;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u00013\b\u0001\u0018\u0000 62\u00020\u0001:\u000278B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001d\u0010(\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/yandex/passport/internal/ui/router/GlobalRouterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lt40;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "processResult", "(Lt40;)V", "", "animResId", "animateFinishActivity", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "recreate", "onDestroy", "Lcom/yandex/passport/internal/ui/router/m;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/ui/router/m;", "viewModel", "Lm50;", "Lcom/yandex/passport/internal/ui/router/k;", "routingLauncher", "Lm50;", "Lcom/yandex/passport/internal/ui/router/g;", "ui$delegate", "getUi", "()Lcom/yandex/passport/internal/ui/router/g;", "ui", "Lcom/yandex/passport/internal/properties/LoginProperties;", "loginProperties$delegate", "getLoginProperties", "()Lcom/yandex/passport/internal/properties/LoginProperties;", "loginProperties", "", "isShowBackground$delegate", "isShowBackground", "()Z", "isGoingToRecreate", "Z", "Loz40;", "Lcom/yandex/passport/internal/ui/router/GlobalRouterBackground;", "backgroundState", "Loz40;", "com/yandex/passport/internal/ui/router/GlobalRouterActivity$activityLifecycleCallback$1", "activityLifecycleCallback", "Lcom/yandex/passport/internal/ui/router/GlobalRouterActivity$activityLifecycleCallback$1;", "Companion", "lid0", "com/yandex/passport/internal/ui/router/c", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GlobalRouterActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public static final String BACKGROUND_STATE_KEY = "BACKGROUND_STATE_KEY";
    public static final String CORRECTION_EXTRA = "CORRECTION_EXTRA";
    public static final c Companion = new c();
    public static final String EXTERNAL_EXTRA = "EXTERNAL_EXTRA";
    public static final String ROAD_SIGN_EXTRA = "ROAD_SIGN_EXTRA";
    public static final boolean SHOW_BACKGROUND_DEFAULT_VALUE = false;
    public static final String URI = "URI";
    private boolean isGoingToRecreate;

    /* renamed from: isShowBackground$delegate, reason: from kotlin metadata */
    private final i3y isShowBackground;

    /* renamed from: loginProperties$delegate, reason: from kotlin metadata */
    private final i3y loginProperties;

    /* renamed from: ui$delegate, reason: from kotlin metadata */
    private final i3y ui;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(m.class), new sls(this) { // from class: com.yandex.passport.internal.ui.router.GlobalRouterActivity$special$$inlined$viewModels$default$2
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
    }, new com.yandex.passport.common.network.a(9), new sls(this) { // from class: com.yandex.passport.internal.ui.router.GlobalRouterActivity$special$$inlined$viewModels$default$3
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
    private final m50 routingLauncher = registerForActivityResult(new lid0(new GlobalRouterActivity$routingLauncher$1(this, GlobalRouterActivity.class, "viewModel", "getViewModel()Lcom/yandex/passport/internal/ui/router/GlobalRouterViewModel;", 0)), new e(this));
    private final oz40 backgroundState = androidx.compose.runtime.f.j(GlobalRouterBackground.ColorTransparent.INSTANCE);
    private final GlobalRouterActivity$activityLifecycleCallback$1 activityLifecycleCallback = new Application.ActivityLifecycleCallbacks() { // from class: com.yandex.passport.internal.ui.router.GlobalRouterActivity$activityLifecycleCallback$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            boolean isShowBackground;
            LoginProperties loginProperties;
            g ui;
            oz40 oz40Var;
            g ui2;
            oz40 oz40Var2;
            VisualProperties visualProperties;
            ProgressPropertiesImpl progressProperties;
            if (activity instanceof BouncerActivity) {
                isShowBackground = GlobalRouterActivity.this.isShowBackground();
                if (isShowBackground) {
                    loginProperties = GlobalRouterActivity.this.getLoginProperties();
                    ProgressBackground background = (loginProperties == null || (visualProperties = loginProperties.getVisualProperties()) == null || (progressProperties = visualProperties.getProgressProperties()) == null) ? null : progressProperties.getBackground();
                    boolean z = background instanceof ProgressBackground.Custom;
                    GlobalRouterActivity globalRouterActivity = GlobalRouterActivity.this;
                    if (z) {
                        ui2 = globalRouterActivity.getUi();
                        ProgressBackground.Custom custom = (ProgressBackground.Custom) background;
                        li91.h(custom.getBackgroundResId(), ui2.getRoot());
                        oz40Var2 = GlobalRouterActivity.this.backgroundState;
                        oz40Var2.setValue(new GlobalRouterBackground.ImageResource(custom.getBackgroundResId()));
                    } else {
                        ui = globalRouterActivity.getUi();
                        li91.g(R.color.passport_roundabout_background, ui.getRoot());
                        oz40Var = GlobalRouterActivity.this.backgroundState;
                        oz40Var.setValue(GlobalRouterBackground.Roundabout.INSTANCE);
                    }
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Set background for GlobalRouterActivity. BackgroundProperties is " + background, 8);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            boolean isShowBackground;
            g ui;
            oz40 oz40Var;
            if (activity instanceof BouncerActivity) {
                isShowBackground = GlobalRouterActivity.this.isShowBackground();
                if (isShowBackground) {
                    ui = GlobalRouterActivity.this.getUi();
                    li91.f(ui.getRoot());
                    oz40Var = GlobalRouterActivity.this.backgroundState;
                    oz40Var.setValue(GlobalRouterBackground.ColorTransparent.INSTANCE);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    };

    /* JADX WARN: Type inference failed for: r7v11, types: [com.yandex.passport.internal.ui.router.GlobalRouterActivity$activityLifecycleCallback$1] */
    public GlobalRouterActivity() {
        final int i = 0;
        this.ui = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.ui.router.a
            public final /* synthetic */ GlobalRouterActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                g ui_delegate$lambda$1;
                LoginProperties loginProperties_delegate$lambda$3;
                boolean isShowBackground_delegate$lambda$4;
                int i2 = i;
                GlobalRouterActivity globalRouterActivity = this.b;
                switch (i2) {
                    case 0:
                        ui_delegate$lambda$1 = GlobalRouterActivity.ui_delegate$lambda$1(globalRouterActivity);
                        return ui_delegate$lambda$1;
                    case 1:
                        loginProperties_delegate$lambda$3 = GlobalRouterActivity.loginProperties_delegate$lambda$3(globalRouterActivity);
                        return loginProperties_delegate$lambda$3;
                    default:
                        isShowBackground_delegate$lambda$4 = GlobalRouterActivity.isShowBackground_delegate$lambda$4(globalRouterActivity);
                        return Boolean.valueOf(isShowBackground_delegate$lambda$4);
                }
            }
        });
        final int i2 = 1;
        this.loginProperties = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.ui.router.a
            public final /* synthetic */ GlobalRouterActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                g ui_delegate$lambda$1;
                LoginProperties loginProperties_delegate$lambda$3;
                boolean isShowBackground_delegate$lambda$4;
                int i22 = i2;
                GlobalRouterActivity globalRouterActivity = this.b;
                switch (i22) {
                    case 0:
                        ui_delegate$lambda$1 = GlobalRouterActivity.ui_delegate$lambda$1(globalRouterActivity);
                        return ui_delegate$lambda$1;
                    case 1:
                        loginProperties_delegate$lambda$3 = GlobalRouterActivity.loginProperties_delegate$lambda$3(globalRouterActivity);
                        return loginProperties_delegate$lambda$3;
                    default:
                        isShowBackground_delegate$lambda$4 = GlobalRouterActivity.isShowBackground_delegate$lambda$4(globalRouterActivity);
                        return Boolean.valueOf(isShowBackground_delegate$lambda$4);
                }
            }
        });
        final int i3 = 2;
        this.isShowBackground = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.ui.router.a
            public final /* synthetic */ GlobalRouterActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                g ui_delegate$lambda$1;
                LoginProperties loginProperties_delegate$lambda$3;
                boolean isShowBackground_delegate$lambda$4;
                int i22 = i3;
                GlobalRouterActivity globalRouterActivity = this.b;
                switch (i22) {
                    case 0:
                        ui_delegate$lambda$1 = GlobalRouterActivity.ui_delegate$lambda$1(globalRouterActivity);
                        return ui_delegate$lambda$1;
                    case 1:
                        loginProperties_delegate$lambda$3 = GlobalRouterActivity.loginProperties_delegate$lambda$3(globalRouterActivity);
                        return loginProperties_delegate$lambda$3;
                    default:
                        isShowBackground_delegate$lambda$4 = GlobalRouterActivity.isShowBackground_delegate$lambda$4(globalRouterActivity);
                        return Boolean.valueOf(isShowBackground_delegate$lambda$4);
                }
            }
        });
    }

    private final void animateFinishActivity(int animResId) {
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, animResId);
        } else {
            overridePendingTransition(0, animResId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoginProperties getLoginProperties() {
        return (LoginProperties) this.loginProperties.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g getUi() {
        return (g) this.ui.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getViewModel() {
        return (m) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isShowBackground() {
        return ((Boolean) this.isShowBackground.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isShowBackground_delegate$lambda$4(GlobalRouterActivity globalRouterActivity) {
        VisualProperties visualProperties;
        LoginProperties loginProperties = globalRouterActivity.getLoginProperties();
        if (loginProperties == null || (visualProperties = loginProperties.getVisualProperties()) == null) {
            return false;
        }
        return visualProperties.isShowBackgroundAfterAuth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoginProperties loginProperties_delegate$lambda$3(GlobalRouterActivity globalRouterActivity) {
        Bundle extras = globalRouterActivity.getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        try {
            LoginProperties.Companion.getClass();
            return com.yandex.passport.internal.properties.i.a(extras);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processResult(t40 result) {
        setResult(result.a.a, result.b);
        finish();
        if (isShowBackground()) {
            animateFinishActivity(R.anim.passport_smooth_close);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g ui_delegate$lambda$1(GlobalRouterActivity globalRouterActivity) {
        return new g(globalRouterActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$0() {
        return new i();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        PassportTheme passportTheme;
        GlobalRouterBackground globalRouterBackground;
        PassportTheme passportTheme2;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Global Route with " + getIntent(), 8);
        }
        if (isShowBackground()) {
            LoginProperties loginProperties = getLoginProperties();
            if (loginProperties == null || (passportTheme2 = loginProperties.getTheme()) == null) {
                passportTheme2 = PassportTheme.FOLLOW_SYSTEM;
            }
            Companion.getClass();
            int c = c.c(passportTheme2);
            if (c != getDelegate().getLocalNightMode()) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Setting theme to " + passportTheme2 + " with nightMode=" + c + ", was " + getDelegate().getLocalNightMode(), 8);
                }
                getDelegate().setLocalNightMode(c);
            }
        }
        super.onCreate(savedInstanceState);
        if (isShowBackground()) {
            if (isFinishing() || isChangingConfigurations() || this.isGoingToRecreate) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.isGoingToRecreate, 8);
                }
                tje.N(eja1.s(this), null, null, new GlobalRouterActivity$onCreate$4(this, null), 3);
                return;
            }
            PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
            if (savedInstanceState != null && (globalRouterBackground = (GlobalRouterBackground) vng.u(savedInstanceState, GlobalRouterBackground.class, BACKGROUND_STATE_KEY)) != null) {
                this.backgroundState.setValue(globalRouterBackground);
            }
            if (((Boolean) a.getFlagRepository().b(com.yandex.passport.internal.flags.q.e0)).booleanValue()) {
                LoginProperties loginProperties2 = getLoginProperties();
                if (loginProperties2 == null || (passportTheme = loginProperties2.getTheme()) == null) {
                    passportTheme = PassportTheme.FOLLOW_SYSTEM;
                }
                v0d.a(this, new androidx.compose.runtime.internal.a(1631901768, new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q(1, com.yandex.passport.internal.util.p.t(passportTheme), a, this), true));
            } else {
                setContentView(getUi().getRoot());
            }
        }
        tje.N(eja1.s(this), null, null, new GlobalRouterActivity$onCreate$$inlined$collectOn$1(getViewModel().w, null, this), 3);
        tje.N(eja1.s(this), null, null, new GlobalRouterActivity$onCreate$9(this, savedInstanceState, null), 3);
        if (isShowBackground()) {
            getApplication().registerActivityLifecycleCallbacks(this.activityLifecycleCallback);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isShowBackground()) {
            getApplication().unregisterActivityLifecycleCallbacks(this.activityLifecycleCallback);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(BACKGROUND_STATE_KEY, (Parcelable) this.backgroundState.getValue());
    }

    @Override // android.app.Activity
    public void recreate() {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isGoingToRecreate = true", 8);
        }
        this.isGoingToRecreate = true;
        super.recreate();
    }
}
