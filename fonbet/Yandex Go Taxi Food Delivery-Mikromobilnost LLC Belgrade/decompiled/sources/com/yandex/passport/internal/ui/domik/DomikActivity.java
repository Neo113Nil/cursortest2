package com.yandex.passport.internal.ui.domik;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.exception.PassportException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Event;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.d0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.ui.base.BaseBackStackActivity;
import com.yandex.passport.internal.ui.base.FragmentBackStack;
import com.yandex.passport.internal.ui.base.ShowFragmentInfo$AnimationType;
import com.yandex.passport.internal.ui.domik.DomikExternalAuthRequest;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.domik.identifier.IdentifierCredentialManagerFragment;
import com.yandex.passport.internal.ui.domik.samlsso.SamlSsoAuthFragment;
import com.yandex.passport.internal.ui.router.LoginRouterActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.w;
import com.yandex.passport.internal.widget.ErrorView;
import com.yandex.passport.internal.widget.KeyboardDetectorLayout;
import defpackage.g8e;
import defpackage.ls31;
import defpackage.ny61;
import defpackage.pq60;
import defpackage.vng;
import defpackage.w511;
import defpackage.w53;
import defpackage.wwg;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.Pair;

@Deprecated
/* loaded from: classes2.dex */
public class DomikActivity extends BaseBackStackActivity implements com.yandex.passport.internal.ui.social.a, com.yandex.passport.internal.ui.domik.samlsso.f, j {
    public static final String EXTRA_CURRENT_ACCOUNT = "current_account";
    public static final String EXTRA_EXTERNAL_AUTH_REQUEST = "extra_external_auth_request";
    public static final String EXTRA_FORCE_NATIVE = "extra_force_native";
    public static final String EXTRA_IS_ACCOUNT_CHANGING_ALLOWED = "is_account_changing_allowed";
    public static final String EXTRA_IS_RELOGIN = "is_relogin";
    public static final String EXTRA_RUN_AS_TRANSPARENT = "run_as_transparent";
    public static final String KEY_STATEFUL_REPORTER_DATA = "reporter_session_hash";
    private View buttonUp;
    private e commonViewModel;
    private com.yandex.passport.internal.ui.domik.di.a domikComponent;
    private com.yandex.passport.internal.widget.c errorViewBehavior;
    private FrameLayout frameActivity;
    private LoginProperties loginProperties;
    private b0 statefulReporter;
    private Toolbar toolbar;
    private ErrorView viewPermanentError;
    private ErrorView viewTemporaryError;

    private void addCredentialManager() {
        BaseDomikFragment baseNewInstance;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a h = g8e.h(supportFragmentManager, supportFragmentManager);
        com.yandex.passport.internal.ui.domik.identifier.c cVar = IdentifierCredentialManagerFragment.Companion;
        c cVar2 = AuthTrack.Companion;
        LoginProperties loginProperties = this.loginProperties;
        cVar2.getClass();
        AuthTrack a = c.a(loginProperties);
        cVar.getClass();
        baseNewInstance = BaseDomikFragment.baseNewInstance(a, new com.yandex.passport.internal.ui.authbytrack.b(2));
        h.f(0, (IdentifierCredentialManagerFragment) baseNewInstance, IdentifierCredentialManagerFragment.FRAGMENT_TAG, 1);
        h.l(true, true);
    }

    public static Intent createIntent(Context context, LoginProperties loginProperties, List<ModernAccount> list, ModernAccount modernAccount, ModernAccount modernAccount2, boolean z, boolean z2, DomikExternalAuthRequest domikExternalAuthRequest) {
        Intent intent = new Intent(context, (Class<?>) DomikActivity.class);
        intent.putExtras(loginProperties.toBundle());
        intent.putExtras(wwg.g(new Pair("master-accounts", new ArrayList(list))));
        if (modernAccount2 != null) {
            intent.putExtras(wwg.g(new Pair("master-account", modernAccount2)));
        }
        intent.putExtra(EXTRA_CURRENT_ACCOUNT, modernAccount);
        intent.putExtra(EXTRA_IS_RELOGIN, z);
        intent.putExtra(EXTRA_RUN_AS_TRANSPARENT, z2);
        intent.putExtra(EXTRA_EXTERNAL_AUTH_REQUEST, domikExternalAuthRequest);
        return intent;
    }

    private void displayCustomHomeAsUp() {
        displayHomeAsUp();
    }

    private void enableDrawUnderStatusBar() {
        this.frameActivity.setSystemUiVisibility(1280);
        this.frameActivity.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.yandex.passport.internal.ui.domik.g
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets lambda$enableDrawUnderStatusBar$8;
                lambda$enableDrawUnderStatusBar$8 = DomikActivity.this.lambda$enableDrawUnderStatusBar$8(view, windowInsets);
                return lambda$enableDrawUnderStatusBar$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishWithResult(DomikResult domikResult) {
        Intent intent = new Intent();
        intent.putExtras(domikResult.toBundle());
        setResult(-1, intent);
        finish();
    }

    private BaseDomikFragment getTopFragment() {
        Stack stack = getFragmentBackStack().a;
        com.yandex.passport.internal.ui.base.j a = stack.isEmpty() ? null : FragmentBackStack.a((FragmentBackStack.BackStackEntry) stack.peek());
        if (a != null) {
            Fragment fragment = a.b;
            if (fragment instanceof BaseDomikFragment) {
                return (BaseDomikFragment) fragment;
            }
        }
        Fragment E = getSupportFragmentManager().E(R.id.container);
        if (E instanceof BaseDomikFragment) {
            return (BaseDomikFragment) E;
        }
        return null;
    }

    private void hideCustomHomeAsUp() {
        hideHomeAsUp();
    }

    private void installBackStackTracker() {
        FragmentBackStack fragmentBackStack = getFragmentBackStack();
        fragmentBackStack.b.add(new com.yandex.passport.internal.ui.base.k() { // from class: com.yandex.passport.internal.ui.domik.h
            @Override // com.yandex.passport.internal.ui.base.k
            public final void a(FragmentBackStack fragmentBackStack2) {
                DomikActivity.this.lambda$installBackStackTracker$7(fragmentBackStack2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsets lambda$enableDrawUnderStatusBar$8(View view, WindowInsets windowInsets) {
        for (int i = 0; i < this.frameActivity.getChildCount(); i++) {
            this.frameActivity.getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$installBackStackTracker$7(FragmentBackStack fragmentBackStack) {
        updateToolbarButtons();
        updateNetworkStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        onSupportNavigateUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(Boolean bool) {
        Intent intent = new Intent();
        intent.putExtra(LoginRouterActivity.FORBIDDEN_WEB_AM_FOR_THIS_AUTH, true);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(String str) {
        ErrorView errorView = this.viewTemporaryError;
        if (str == null) {
            errorView.hide();
        } else {
            errorView.show(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ zy11 lambda$onCreate$3() {
        this.commonViewModel.H.l(null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$4(Boolean bool) {
        updateNetworkStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onCreate$5(String str) {
        Intent intent = new Intent();
        intent.putExtras(wwg.g(new Pair("task_id_value", str)));
        setResult(3, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ zy11 lambda$onCreate$6(Boolean bool) {
        this.commonViewModel.I.l(bool);
        return null;
    }

    private void onIdentifierCredentialManagerFragmentActivityReturned(int i, int i2, Intent intent) {
        IdentifierCredentialManagerFragment identifierCredentialManagerFragment = (IdentifierCredentialManagerFragment) getSupportFragmentManager().F(IdentifierCredentialManagerFragment.FRAGMENT_TAG);
        if (identifierCredentialManagerFragment != null) {
            identifierCredentialManagerFragment.onActivityResult(i, i2, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSlothError(PassportException passportException) {
        setResult(13, new Intent().putExtra(Constants.KEY_EXCEPTION, passportException));
        finish();
    }

    private boolean shouldHideButtonForCurrentFragment() {
        BaseDomikFragment topFragment = getTopFragment();
        if (topFragment != null) {
            return topFragment.shouldHideBackButton();
        }
        return true;
    }

    private void updateNetworkStatus() {
        e eVar = this.commonViewModel;
        if (eVar.L == null) {
            eVar.L = new com.yandex.passport.internal.network.o(this);
        }
        Boolean bool = (Boolean) eVar.L.d();
        BaseDomikFragment topFragment = getTopFragment();
        if (topFragment != null && topFragment.shouldHideConnectionStatus()) {
            this.viewPermanentError.hide();
        } else if (bool == null || bool.booleanValue()) {
            this.viewPermanentError.hide();
        } else {
            this.viewPermanentError.show(getString(R.string.passport_network_connecting));
        }
    }

    private void updateToolbarButtons() {
        if (shouldHideButtonForCurrentFragment() || (this.loginProperties.getVisualProperties().isNoReturnToHost() && getFragmentBackStack().a.size() < 2)) {
            hideCustomHomeAsUp();
        } else {
            displayCustomHomeAsUp();
        }
    }

    @Override // com.yandex.passport.internal.ui.BaseActivity
    public com.yandex.passport.api.o getAnimationTheme() {
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties != null) {
            return loginProperties.getAnimationTheme();
        }
        return null;
    }

    @Override // com.yandex.passport.internal.ui.domik.j
    public com.yandex.passport.internal.ui.domik.di.a getDomikComponent() {
        return this.domikComponent;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        onIdentifierCredentialManagerFragmentActivityReturned(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseBackStackActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BaseDomikFragment topFragment = getTopFragment();
        if (topFragment != null) {
            b0 b0Var = this.statefulReporter;
            DomikStatefulReporter$Screen screenId = topFragment.getScreenId();
            b0Var.getClass();
            b0Var.c(screenId, DomikStatefulReporter$Event.BACK_PRESSED);
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.passport_slide_left_in, R.anim.passport_slide_left_out);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseBackStackActivity, com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ModernAccount modernAccount;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            super.onCreate(bundle);
            c0 c0Var = this.eventReporter;
            ComponentName callingActivity = getCallingActivity();
            c0Var.getClass();
            w53 w53Var = new w53();
            w53Var.put("calling_activity", callingActivity != null ? callingActivity.toShortString() : "null");
            c0Var.a.a(com.yandex.passport.internal.analytics.k.o, w53Var);
            finish();
            return;
        }
        LoginProperties.Companion.getClass();
        this.loginProperties = com.yandex.passport.internal.properties.i.a(extras);
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.eventReporter = a.getEventReporter();
        this.statefulReporter = a.getStatefulReporter();
        e eVar = (e) new ls31(this).b(e.class);
        this.commonViewModel = eVar;
        this.domikComponent = a.createDomikComponent(new com.yandex.passport.internal.ui.domik.di.b(this.loginProperties, eVar));
        boolean z = extras.getBoolean(EXTRA_RUN_AS_TRANSPARENT);
        com.yandex.passport.internal.ui.domik.di.a aVar = this.domikComponent;
        if (z) {
            k domikDesignProvider = aVar.getDomikDesignProvider();
            PassportTheme theme = this.loginProperties.getTheme();
            domikDesignProvider.getClass();
            setTheme(com.yandex.passport.internal.ui.util.o.f(theme, this));
        } else {
            k domikDesignProvider2 = aVar.getDomikDesignProvider();
            PassportTheme theme2 = this.loginProperties.getTheme();
            domikDesignProvider2.getClass();
            setTheme(com.yandex.passport.internal.ui.util.o.d(theme2, this));
        }
        super.onCreate(bundle);
        setContentView(R.layout.passport_activity_authorization);
        this.frameActivity = (FrameLayout) findViewById(R.id.passport_activity_authorization_layout);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frame_content);
        enableDrawUnderStatusBar();
        installBackStackTracker();
        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        View findViewById = findViewById(R.id.passport_button_up);
        this.buttonUp = findViewById;
        final int i = 2;
        findViewById.setOnClickListener(new com.yandex.passport.internal.autologin.ui.b(i, this));
        setSupportActionBar(this.toolbar);
        updateToolbarButtons();
        final int i2 = 1;
        this.commonViewModel.A.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.domik.f
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i3 = i2;
                DomikActivity domikActivity = this.b;
                switch (i3) {
                    case 0:
                        domikActivity.lambda$onCreate$5((String) obj);
                        break;
                    case 1:
                        domikActivity.showFragment((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.closeDomik(obj);
                        break;
                    case 3:
                        domikActivity.onSlothError((PassportException) obj);
                        break;
                    case 4:
                        domikActivity.finishWithResult((DomikResult) obj);
                        break;
                    default:
                        domikActivity.lambda$onCreate$1((Boolean) obj);
                        break;
                }
            }
        });
        this.commonViewModel.K.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.domik.f
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i3 = i;
                DomikActivity domikActivity = this.b;
                switch (i3) {
                    case 0:
                        domikActivity.lambda$onCreate$5((String) obj);
                        break;
                    case 1:
                        domikActivity.showFragment((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.closeDomik(obj);
                        break;
                    case 3:
                        domikActivity.onSlothError((PassportException) obj);
                        break;
                    case 4:
                        domikActivity.finishWithResult((DomikResult) obj);
                        break;
                    default:
                        domikActivity.lambda$onCreate$1((Boolean) obj);
                        break;
                }
            }
        });
        final int i3 = 3;
        this.commonViewModel.F.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.domik.f
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i32 = i3;
                DomikActivity domikActivity = this.b;
                switch (i32) {
                    case 0:
                        domikActivity.lambda$onCreate$5((String) obj);
                        break;
                    case 1:
                        domikActivity.showFragment((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.closeDomik(obj);
                        break;
                    case 3:
                        domikActivity.onSlothError((PassportException) obj);
                        break;
                    case 4:
                        domikActivity.finishWithResult((DomikResult) obj);
                        break;
                    default:
                        domikActivity.lambda$onCreate$1((Boolean) obj);
                        break;
                }
            }
        });
        final int i4 = 4;
        this.commonViewModel.E.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.domik.f
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i32 = i4;
                DomikActivity domikActivity = this.b;
                switch (i32) {
                    case 0:
                        domikActivity.lambda$onCreate$5((String) obj);
                        break;
                    case 1:
                        domikActivity.showFragment((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.closeDomik(obj);
                        break;
                    case 3:
                        domikActivity.onSlothError((PassportException) obj);
                        break;
                    case 4:
                        domikActivity.finishWithResult((DomikResult) obj);
                        break;
                    default:
                        domikActivity.lambda$onCreate$1((Boolean) obj);
                        break;
                }
            }
        });
        final int i5 = 5;
        this.commonViewModel.J.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.domik.f
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i32 = i5;
                DomikActivity domikActivity = this.b;
                switch (i32) {
                    case 0:
                        domikActivity.lambda$onCreate$5((String) obj);
                        break;
                    case 1:
                        domikActivity.showFragment((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.closeDomik(obj);
                        break;
                    case 3:
                        domikActivity.onSlothError((PassportException) obj);
                        break;
                    case 4:
                        domikActivity.finishWithResult((DomikResult) obj);
                        break;
                    default:
                        domikActivity.lambda$onCreate$1((Boolean) obj);
                        break;
                }
            }
        });
        this.viewPermanentError = (ErrorView) findViewById(R.id.view_permanent_error);
        ErrorView errorView = (ErrorView) findViewById(R.id.view_temporary_error);
        this.viewTemporaryError = errorView;
        ErrorView[] errorViewArr = {this.viewPermanentError, errorView};
        com.yandex.passport.internal.widget.c cVar = new com.yandex.passport.internal.widget.c(frameLayout, errorViewArr);
        this.errorViewBehavior = cVar;
        final int i6 = 0;
        for (int i7 = 0; i7 < 2; i7++) {
            errorViewArr[i7].setAnimationUpdateListener$passport_release(new w(9, cVar));
        }
        this.commonViewModel.H.f(this, new pq60(this) { // from class: com.yandex.passport.internal.ui.domik.i
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i8 = i6;
                DomikActivity domikActivity = this.b;
                switch (i8) {
                    case 0:
                        domikActivity.lambda$onCreate$2((String) obj);
                        break;
                    default:
                        domikActivity.lambda$onCreate$4((Boolean) obj);
                        break;
                }
            }
        });
        this.viewTemporaryError.addOnHideListener(new com.yandex.passport.internal.flags.experiments.h(18, this));
        e eVar2 = this.commonViewModel;
        Context applicationContext = getApplicationContext();
        if (eVar2.L == null) {
            eVar2.L = new com.yandex.passport.internal.network.o(applicationContext);
        }
        eVar2.L.f(this, new pq60(this) { // from class: com.yandex.passport.internal.ui.domik.i
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i8 = i2;
                DomikActivity domikActivity = this.b;
                switch (i8) {
                    case 0:
                        domikActivity.lambda$onCreate$2((String) obj);
                        break;
                    default:
                        domikActivity.lambda$onCreate$4((Boolean) obj);
                        break;
                }
            }
        });
        if (bundle == null) {
            addCredentialManager();
            DomikExternalAuthRequest domikExternalAuthRequest = (DomikExternalAuthRequest) extras.getParcelable(EXTRA_EXTERNAL_AUTH_REQUEST);
            q domikRouter = this.domikComponent.getDomikRouter();
            domikRouter.getClass();
            boolean z2 = extras.getBoolean(EXTRA_IS_RELOGIN, false);
            Bundle bundle2 = extras.containsKey("master-account") ? extras : null;
            if (bundle2 != null) {
                Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(bundle2, ModernAccount.class, "master-account") : bundle2.getParcelable("master-account");
                if (parcelable == null) {
                    ny61.r("can't get required parcelable master-account");
                    return;
                }
                modernAccount = (ModernAccount) parcelable;
            } else {
                modernAccount = null;
            }
            boolean z3 = extras.getBoolean(EXTRA_IS_ACCOUNT_CHANGING_ALLOWED, true);
            if (domikExternalAuthRequest != null) {
                if (domikExternalAuthRequest instanceof DomikExternalAuthRequest.SamlSso) {
                    domikRouter.a.A.m(new com.yandex.passport.internal.ui.base.m(new com.yandex.passport.internal.ui.n(i3, domikRouter, ((DomikExternalAuthRequest.SamlSso) domikExternalAuthRequest).getAuthUrl()), SamlSsoAuthFragment.FRAGMENT_TAG, false, ShowFragmentInfo$AnimationType.NONE));
                } else {
                    if (!(domikExternalAuthRequest instanceof DomikExternalAuthRequest.Social)) {
                        w511.b();
                        return;
                    }
                    domikRouter.e(true, ((DomikExternalAuthRequest.Social) domikExternalAuthRequest).getSocialConfig(), true, null);
                }
            } else if (z2) {
                q.a(domikRouter, modernAccount, z3);
            } else if (modernAccount != null) {
                q.a(domikRouter, modernAccount, z3);
            } else {
                domikRouter.c();
            }
        } else {
            Bundle bundle3 = bundle.getBundle(KEY_STATEFUL_REPORTER_DATA);
            if (bundle3 != null) {
                b0 b0Var = this.statefulReporter;
                b0Var.getClass();
                b0Var.w = bundle3.getString("session_hash");
                b0Var.b = bundle3.getBoolean("from_auth_sdk");
                b0Var.c = (RegTrack.RegOrigin) bundle3.getSerializable("reg_origin");
                if (bundle3.containsKey("current_screen")) {
                    b0Var.x = DomikStatefulReporter$Screen.values()[bundle3.getInt("current_screen")];
                }
                b0Var.y = bundle3.getString("source");
            }
        }
        this.commonViewModel.G.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.domik.f
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i32 = i6;
                DomikActivity domikActivity = this.b;
                switch (i32) {
                    case 0:
                        domikActivity.lambda$onCreate$5((String) obj);
                        break;
                    case 1:
                        domikActivity.showFragment((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.closeDomik(obj);
                        break;
                    case 3:
                        domikActivity.onSlothError((PassportException) obj);
                        break;
                    case 4:
                        domikActivity.finishWithResult((DomikResult) obj);
                        break;
                    default:
                        domikActivity.lambda$onCreate$1((Boolean) obj);
                        break;
                }
            }
        });
        ((KeyboardDetectorLayout) findViewById(R.id.keyboard_detector)).addKeyboardStateChangedListener(new a0(16, this));
        getLifecycle().a(this.statefulReporter);
        getLifecycle().a(new d0(a.getAnalyticsTrackerWrapper(), this.loginProperties.getAnalyticsParams()));
    }

    @Override // com.yandex.passport.internal.ui.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return menuItem.getItemId() == 16908332 ? supportOnOptionsItemSelected(menuItem) : super.onOptionsItemSelected(menuItem);
    }

    @Override // com.yandex.passport.internal.ui.domik.samlsso.f
    public void onSamlSsoAuthSuccess(AuthTrack authTrack, ModernAccount modernAccount) {
        getFragmentBackStack().c();
        q domikRouter = this.domikComponent.getDomikRouter();
        o oVar = DomikResult.Companion;
        PassportLoginAction passportLoginAction = PassportLoginAction.PASSWORD;
        EnumSet noneOf = EnumSet.noneOf(FinishRegistrationActivities.class);
        oVar.getClass();
        domikRouter.b(authTrack, new DomikResultImpl(modernAccount, null, passportLoginAction, null, noneOf, 8, null));
    }

    @Override // com.yandex.passport.internal.ui.base.BaseBackStackActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        b0 b0Var = this.statefulReporter;
        b0Var.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("current_screen", b0Var.x.ordinal());
        bundle2.putString("session_hash", b0Var.w);
        bundle2.putBoolean("from_auth_sdk", b0Var.b);
        bundle2.putSerializable("reg_origin", b0Var.c);
        bundle2.putString("source", b0Var.y);
        bundle.putBundle(KEY_STATEFUL_REPORTER_DATA, bundle2);
    }

    @Override // com.yandex.passport.internal.ui.social.a
    public void onSocialAccountAdded(ModernAccount modernAccount) {
        b0 b0Var = this.statefulReporter;
        b0Var.getClass();
        w53 w53Var = new w53();
        if (modernAccount.getSocialProviderCode() != null) {
            Map map = w0.w;
            String socialProviderCode = modernAccount.getSocialProviderCode();
            Map map2 = w0.w;
            w53Var.put("provider", map2.containsKey(socialProviderCode) ? (String) map2.get(socialProviderCode) : "other");
        }
        b0Var.d(DomikStatefulReporter$Screen.IDENTIFIER, DomikStatefulReporter$Event.SOCIAL_AUTH_SUCCESS, w53Var);
        getFragmentBackStack().c();
        q domikRouter = this.domikComponent.getDomikRouter();
        o oVar = DomikResult.Companion;
        PassportLoginAction passportLoginAction = PassportLoginAction.SOCIAL;
        EnumSet noneOf = EnumSet.noneOf(FinishRegistrationActivities.class);
        oVar.getClass();
        domikRouter.f(null, new DomikResultImpl(modernAccount, null, passportLoginAction, null, noneOf, 8, null));
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        if (super.onSupportNavigateUp()) {
            return true;
        }
        onBackPressed();
        return true;
    }

    @Override // com.yandex.passport.internal.ui.social.a
    public void showSocialAuth(boolean z, SocialConfiguration socialConfiguration, boolean z2, ModernAccount modernAccount) {
        this.domikComponent.getDomikRouter().e(z, socialConfiguration, z2, modernAccount);
    }

    public static Intent createIntent(Context context, LoginProperties loginProperties, List<ModernAccount> list, ModernAccount modernAccount, boolean z, DomikExternalAuthRequest domikExternalAuthRequest, boolean z2) {
        Intent createIntent = createIntent(context, loginProperties, list, null, modernAccount, z, false, domikExternalAuthRequest);
        createIntent.putExtra(EXTRA_FORCE_NATIVE, z2);
        return createIntent;
    }
}
