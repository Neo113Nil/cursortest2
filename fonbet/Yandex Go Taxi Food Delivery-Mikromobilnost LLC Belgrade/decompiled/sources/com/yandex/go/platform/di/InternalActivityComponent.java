package com.yandex.go.platform.di;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.o;
import com.yandex.go.platform.sdk.callbacks.LifecycleCallbacks;
import com.yandex.go.platform.ui.GoPlatformView;
import com.yandex.go.platform.ui.components.InitialState;
import defpackage.b60;
import defpackage.blv;
import defpackage.bqt0;
import defpackage.d0p;
import defpackage.d5c;
import defpackage.eja1;
import defpackage.fk;
import defpackage.frw;
import defpackage.fuz;
import defpackage.gqt;
import defpackage.h2b1;
import defpackage.i3y;
import defpackage.l50;
import defpackage.lb20;
import defpackage.ln90;
import defpackage.lza0;
import defpackage.mn90;
import defpackage.nbx;
import defpackage.ny61;
import defpackage.o50;
import defpackage.p0b0;
import defpackage.pa50;
import defpackage.s0i0;
import defpackage.sj41;
import defpackage.sls;
import defpackage.sma0;
import defpackage.sqt;
import defpackage.sza0;
import defpackage.tza0;
import defpackage.v650;
import defpackage.vqw;
import defpackage.w650;
import defpackage.xg41;
import defpackage.xv10;
import defpackage.y320;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u009c\u0001\u009d\u0001B\u0085\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J)\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010)J/\u0010/\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u000e\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020'2\b\u00104\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020'2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\bW\u0010XR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\\\u001a\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0011\u0010t\u001a\u00020q8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0011\u0010x\u001a\u00020u8F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0011\u0010|\u001a\u00020y8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0012\u0010\u0080\u0001\u001a\u00020}8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0084\u0001\u001a\u00030\u0081\u00018F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001d\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0015\u0010\u008f\u0001\u001a\u00030\u008c\u00018F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009e\u0001"}, d2 = {"Lcom/yandex/go/platform/di/InternalActivityComponent;", "Lgqt;", "Lcom/yandex/go/platform/sdk/callbacks/LifecycleCallbacks;", "Ld5c;", "closeListener", "Landroidx/activity/ComponentActivity;", "activity", "Lmn90;", "passportApiInitializer", "Lfk;", "accountDelegate", "Lsma0;", "paymentsDelegate", "Lblv;", "inAppReviewDelegate", "Llb20;", "metricaDelegate", "Lcom/yandex/go/platform/ui/components/InitialState;", "initialState", "Lsj41;", "webResourcesProvider", "Lfuz;", "lottieSplashInteractor", "Lbqt0;", "splashAppData", "Ly320;", "messengerPushHandler", "", "", "featureProviders", "Lxg41;", "webFeaturesComponentFactory", "<init>", "(Ld5c;Landroidx/activity/ComponentActivity;Lmn90;Lfk;Lsma0;Lblv;Llb20;Lcom/yandex/go/platform/ui/components/InitialState;Lsj41;Lfuz;Lbqt0;Ly320;Ljava/util/List;Lxg41;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.KEY_DATA, "Lzy11;", "processActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "processPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "processOnBackPressed", "()Z", "intent", "processOnNewIntent", "(Landroid/content/Intent;)V", "Lsqt;", "params", "processWebViewParams", "(Lsqt;)V", "Ld5c;", "getCloseListener", "()Ld5c;", "Landroidx/activity/ComponentActivity;", "getActivity", "()Landroidx/activity/ComponentActivity;", "Lmn90;", "getPassportApiInitializer", "()Lmn90;", "Lfk;", "getAccountDelegate", "()Lfk;", "Lsma0;", "getPaymentsDelegate", "()Lsma0;", "Lblv;", "getInAppReviewDelegate", "()Lblv;", "Llb20;", "getMetricaDelegate", "()Llb20;", "Lcom/yandex/go/platform/ui/components/InitialState;", "getInitialState", "()Lcom/yandex/go/platform/ui/components/InitialState;", "Lsj41;", "getWebResourcesProvider", "()Lsj41;", "Lfuz;", "getLottieSplashInteractor", "()Lfuz;", "Lbqt0;", "getSplashAppData", "()Lbqt0;", "Ly320;", "getMessengerPushHandler", "()Ly320;", "Lcom/yandex/go/platform/sdk/activity/b;", "externalActivityController", "Lcom/yandex/go/platform/sdk/activity/b;", "Lcom/yandex/go/platform/sdk/activity/a;", "activityResultController", "Lcom/yandex/go/platform/sdk/activity/a;", "Lcom/yandex/go/platform/permissions/a;", "permissionsController", "Lcom/yandex/go/platform/permissions/a;", "Lv650;", "navigationComponent$delegate", "Li3y;", "getNavigationComponent", "()Lv650;", "navigationComponent", "Lcom/yandex/go/platform/ui/GoPlatformView;", "_platformView", "Lcom/yandex/go/platform/ui/GoPlatformView;", "Ll50;", "getActivityResultDispatcher", "()Ll50;", "activityResultDispatcher", "Lb60;", "getActivityStarter", "()Lb60;", "activityStarter", "Ltza0;", "getPermissionResultDispatcher", "()Ltza0;", "permissionResultDispatcher", "Llza0;", "getPermissionRequestListener", "()Llza0;", "permissionRequestListener", "Landroidx/lifecycle/o;", "getLifecycleScope", "()Landroidx/lifecycle/o;", "lifecycleScope", "Lpa50;", "getNavigator", "()Lpa50;", "navigator", "getJsNativeApiAdditionalFunctions", "()Ljava/util/List;", "jsNativeApiAdditionalFunctions", "Lnbx;", "getJsScriptRepository", "()Lnbx;", "jsScriptRepository", "Landroid/view/View;", "getPlatformView", "()Landroid/view/View;", "platformView", "Lo50;", "getActivityResultListener", "()Lo50;", "activityResultListener", "Lp0b0;", "getPermissionsListener", "()Lp0b0;", "permissionsListener", "vqw", "a", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InternalActivityComponent implements gqt, LifecycleCallbacks {
    private final GoPlatformView _platformView;
    private final fk accountDelegate;
    private final ComponentActivity activity;
    private final com.yandex.go.platform.sdk.activity.a activityResultController;
    private final d5c closeListener;
    private final com.yandex.go.platform.sdk.activity.b externalActivityController;
    private final blv inAppReviewDelegate;
    private final InitialState initialState;
    private final fuz lottieSplashInteractor;
    private final y320 messengerPushHandler;
    private final lb20 metricaDelegate;

    /* renamed from: navigationComponent$delegate, reason: from kotlin metadata */
    private final i3y navigationComponent;
    private final mn90 passportApiInitializer;
    private final sma0 paymentsDelegate;
    private final com.yandex.go.platform.permissions.a permissionsController;
    private final bqt0 splashAppData;
    private final sj41 webResourcesProvider;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public InternalActivityComponent(d5c d5cVar, ComponentActivity componentActivity, mn90 mn90Var, fk fkVar, sma0 sma0Var, blv blvVar, lb20 lb20Var, InitialState initialState, sj41 sj41Var, fuz fuzVar, bqt0 bqt0Var, y320 y320Var, final List<Object> list, final xg41 xg41Var) {
        this.closeListener = d5cVar;
        this.activity = componentActivity;
        this.passportApiInitializer = mn90Var;
        this.accountDelegate = fkVar;
        this.paymentsDelegate = sma0Var;
        this.inAppReviewDelegate = blvVar;
        this.metricaDelegate = lb20Var;
        this.initialState = initialState;
        com.yandex.go.platform.sdk.activity.b bVar = ((d0p) com.yandex.go.platform.sdk.a.b.getValue()).b;
        this.externalActivityController = bVar;
        this.activityResultController = new com.yandex.go.platform.sdk.activity.a(componentActivity, bVar);
        this.permissionsController = new com.yandex.go.platform.permissions.a(componentActivity);
        this.navigationComponent = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.InternalActivityComponent$navigationComponent$2

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yandex.go.platform.di.InternalActivityComponent$navigationComponent$2$1, reason: invalid class name */
            final /* synthetic */ class AnonymousClass1 extends PropertyReference0Impl {
                @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
                public final Object get() {
                    return ((InternalActivityComponent) this.receiver).getPlatformView();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                new w650();
                ComponentActivity activity = InternalActivityComponent.this.getActivity();
                InternalActivityComponent internalActivityComponent = InternalActivityComponent.this;
                return new com.yandex.go.platform.navigation.impl.a(new xv10(activity, new AnonymousClass1(internalActivityComponent, InternalActivityComponent.class, "platformView", "getPlatformView()Landroid/view/View;", 0), list, internalActivityComponent.getMetricaDelegate(), xg41Var));
            }
        });
        this._platformView = new GoPlatformView(new ContextThemeWrapper(componentActivity, s0i0.GoPlatform_Theme_Custom), this);
        componentActivity.getLifecycle().a(new vqw(0, this));
        ((ln90) mn90Var).a.a().l(componentActivity, getLifecycleScope());
    }

    private final o50 getActivityResultListener() {
        return this.activityResultController;
    }

    private final v650 getNavigationComponent() {
        return (v650) this.navigationComponent.getValue();
    }

    private final p0b0 getPermissionsListener() {
        return this.permissionsController;
    }

    public final fk getAccountDelegate() {
        return this.accountDelegate;
    }

    public final ComponentActivity getActivity() {
        return this.activity;
    }

    public final l50 getActivityResultDispatcher() {
        return this.activityResultController;
    }

    public final b60 getActivityStarter() {
        return this.activityResultController;
    }

    public final d5c getCloseListener() {
        return this.closeListener;
    }

    public final blv getInAppReviewDelegate() {
        return this.inAppReviewDelegate;
    }

    public final InitialState getInitialState() {
        return this.initialState;
    }

    public List<Object> getJsNativeApiAdditionalFunctions() {
        return (List) ((com.yandex.go.platform.navigation.impl.a) getNavigationComponent()).f.getValue();
    }

    public final nbx getJsScriptRepository() {
        ((com.yandex.go.platform.navigation.impl.a) getNavigationComponent()).c.getClass();
        return h2b1.E;
    }

    public final o getLifecycleScope() {
        return eja1.s(this.activity);
    }

    public final fuz getLottieSplashInteractor() {
        return null;
    }

    public final y320 getMessengerPushHandler() {
        return null;
    }

    public final lb20 getMetricaDelegate() {
        return this.metricaDelegate;
    }

    public pa50 getNavigator() {
        return (pa50) ((com.yandex.go.platform.navigation.impl.a) getNavigationComponent()).e.getValue();
    }

    public final mn90 getPassportApiInitializer() {
        return this.passportApiInitializer;
    }

    public final sma0 getPaymentsDelegate() {
        return this.paymentsDelegate;
    }

    public final lza0 getPermissionRequestListener() {
        return this.permissionsController;
    }

    public final tza0 getPermissionResultDispatcher() {
        return this.permissionsController;
    }

    @Override // defpackage.gqt
    public View getPlatformView() {
        return this._platformView;
    }

    public final bqt0 getSplashAppData() {
        return null;
    }

    public final sj41 getWebResourcesProvider() {
        return null;
    }

    @Override // com.yandex.go.platform.sdk.callbacks.LifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // com.yandex.go.platform.sdk.callbacks.LifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // com.yandex.go.platform.sdk.callbacks.LifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // com.yandex.go.platform.sdk.callbacks.LifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // com.yandex.go.platform.sdk.callbacks.LifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // com.yandex.go.platform.sdk.callbacks.LifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.yandex.go.platform.sdk.callbacks.LifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // defpackage.gqt
    public void processActivityResult(int requestCode, int resultCode, Intent data) {
        getActivityResultListener().onActivityResult(requestCode, resultCode, data);
    }

    @Override // defpackage.gqt
    public boolean processOnBackPressed() {
        return this._platformView.processBackPress();
    }

    @Override // defpackage.gqt
    public void processOnNewIntent(Intent intent) {
        b bVar = com.yandex.go.platform.sdk.a.a;
        if (bVar == null) {
            ny61.g("GoPlatform.init must be invoked before using Go Platform");
            return;
        }
        frw frwVar = (frw) bVar.m.getValue();
        if (intent != null) {
            frwVar.a.g(intent);
        } else {
            frwVar.getClass();
        }
    }

    @Override // defpackage.gqt
    public void processPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        com.yandex.go.platform.permissions.a aVar = (com.yandex.go.platform.permissions.a) getPermissionsListener();
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int length = permissions.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = permissions[i];
            int i3 = i2 + 1;
            if (grantResults[i2] == 0) {
                arrayList.add(str);
            }
            i++;
            i2 = i3;
        }
        aVar.b.g(new sza0(arrayList, requestCode));
    }

    public void processWebViewParams(sqt params) {
        this._platformView.processParams(params);
    }
}
