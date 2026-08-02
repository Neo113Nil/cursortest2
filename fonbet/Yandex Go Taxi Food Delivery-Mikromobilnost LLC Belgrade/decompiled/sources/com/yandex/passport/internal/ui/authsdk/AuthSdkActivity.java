package com.yandex.passport.internal.ui.authsdk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.app.a1;
import com.yandex.passport.R;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.l2;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.o0;
import com.yandex.passport.internal.report.p0;
import com.yandex.passport.internal.report.q0;
import com.yandex.passport.internal.report.s0;
import com.yandex.passport.internal.report.t0;
import com.yandex.passport.internal.report.v0;
import com.yandex.passport.internal.report.w0;
import com.yandex.passport.internal.report.x0;
import com.yandex.passport.internal.report.y0;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.BaseActivity;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothComposeActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.b2x0;
import defpackage.ceu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.li91;
import defpackage.ls31;
import defpackage.m50;
import defpackage.mkn;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wwg;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020!H\u0014¢\u0006\u0004\b&\u0010$R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R!\u0010<\u001a\b\u0012\u0004\u0012\u000205048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00107¨\u0006A"}, d2 = {"Lcom/yandex/passport/internal/ui/authsdk/AuthSdkActivity;", "Lcom/yandex/passport/internal/ui/BaseActivity;", "<init>", "()V", "", "throwable", "Lzy11;", "showError", "(Ljava/lang/Throwable;)V", "Lcom/yandex/passport/common/core/Uid;", "challengeUid", "selectedUid", "chooseAccount", "(Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/common/core/Uid;)V", "Lcom/yandex/passport/internal/ui/authsdk/AuthSdkProperties;", "properties", "", ClidProvider.STATE, "launchSloth", "(Lcom/yandex/passport/internal/ui/authsdk/AuthSdkProperties;Ljava/lang/String;)V", "onCancel", "Lcom/yandex/passport/internal/ui/authsdk/AuthSdkResultContainer;", "resultContainer", "onResultReceived", "(Lcom/yandex/passport/internal/ui/authsdk/AuthSdkResultContainer;)V", "Lcom/yandex/passport/internal/ui/sloth/authsdk/f;", TarifficatorScenarioActivity.RESULT_KEY, "onSlothResult", "(Lcom/yandex/passport/internal/ui/sloth/authsdk/f;)V", "onDeclined", "Lcom/yandex/passport/internal/ui/sloth/authsdk/g;", "onAuthSdkResult", "(Lcom/yandex/passport/internal/ui/sloth/authsdk/g;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Lcom/yandex/passport/internal/ui/authsdk/s;", "commonViewModel", "Lcom/yandex/passport/internal/ui/authsdk/s;", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "globalComponent$delegate", "Li3y;", "getGlobalComponent", "()Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "globalComponent", "Lcom/yandex/passport/internal/ui/authsdk/e;", "component", "Lcom/yandex/passport/internal/ui/authsdk/e;", "Ljava/lang/String;", "Lm50;", "Lcom/yandex/passport/sloth/data/SlothParams;", "authSdkLauncher", "Lm50;", "authSdkComposeLauncher", "slothLauncher$delegate", "getSlothLauncher", "()Lm50;", "slothLauncher", "Lcom/yandex/passport/internal/properties/LoginProperties;", "bouncerResultLauncher", "Companion", "com/yandex/passport/internal/ui/authsdk/c", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthSdkActivity extends BaseActivity {
    public static final int $stable = 8;
    public static final c Companion = new c();
    public static final String EXTRA_ACCOUNTS_FILTER = "com.yandex.passport.ACCOUNTS_FILTER";
    public static final String EXTRA_AUTHORIZATION_CODE = "com.yandex.passport.AUTHORIZATION_CODE";
    public static final String EXTRA_CLIENT_ID = "com.yandex.auth.CLIENT_ID";
    public static final String EXTRA_DISALLOW_ACCOUNT_CHANGE = "com.yandex.auth.DISALLOW_ACCOUNT_CHANGE";
    public static final String EXTRA_FLOW_ERRORS = "com.yandex.auth.FLOW_ERRORS";
    public static final String EXTRA_FORCE_CONFIRM = "com.yandex.auth.FORCE_CONFIRM";
    public static final String EXTRA_GRANTED_SCOPES = "com.yandex.auth.GRANTED_SCOPES";
    public static final String EXTRA_JWT_TOKEN = "com.yandex.auth.JWT_TOKEN";
    public static final String EXTRA_LOGIN_HINT = "com.yandex.auth.LOGIN_HINT";
    public static final String EXTRA_RESPONSE_TYPE = "com.yandex.passport.RESPONSE_TYPE";
    public static final String EXTRA_SCOPES = "com.yandex.auth.SCOPES";
    public static final String EXTRA_THEME = "com.yandex.passport.THEME";
    public static final String EXTRA_TOKEN = "com.yandex.auth.EXTRA_OAUTH_TOKEN";
    public static final String EXTRA_TOKEN_ERROR = "com.yandex.auth.OAUTH_TOKEN_ERROR";
    public static final String EXTRA_TOKEN_ERROR_MESSAGES = "com.yandex.auth.OAUTH_TOKEN_ERROR_MESSAGES";
    public static final String EXTRA_TOKEN_EXPIRES = "com.yandex.auth.OAUTH_TOKEN_EXPIRES";
    public static final String EXTRA_TOKEN_TYPE = "com.yandex.auth.EXTRA_OAUTH_TOKEN_TYPE";
    public static final String EXTRA_UID_VALUE = "com.yandex.auth.UID_VALUE";
    public static final String EXTRA_USE_TESTING_ENV = "com.yandex.auth.USE_TESTING_ENV";
    private static final String KEY_FLOW_ERRORS = "flow_errors";
    public static final String RESPONSE_TYPE_CODE = "code";
    public static final String RESPONSE_TYPE_TOKEN = "token";
    private final m50 authSdkComposeLauncher;
    private final m50 authSdkLauncher;
    private final m50 bouncerResultLauncher;
    private s commonViewModel;
    private e component;

    /* renamed from: slothLauncher$delegate, reason: from kotlin metadata */
    private final i3y slothLauncher;

    /* renamed from: globalComponent$delegate, reason: from kotlin metadata */
    private final i3y globalComponent = kotlin.a.a(new a1(12));
    private final String state = UUID.randomUUID().toString();

    public AuthSdkActivity() {
        int i = 1;
        this.authSdkLauncher = registerForActivityResult(new AuthSdkSlothActivity.a(), new d(this, i));
        int i2 = 0;
        this.authSdkComposeLauncher = registerForActivityResult(new AuthSdkSlothComposeActivity.a(), new d(this, i2));
        this.slothLauncher = kotlin.a.a(new a(this, i2));
        this.bouncerResultLauncher = registerForActivityResult(new BouncerActivity.a(), new com.yandex.passport.internal.links.h(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bouncerResultLauncher$lambda$2(AuthSdkActivity authSdkActivity, com.yandex.passport.api.w wVar) {
        if (!(wVar instanceof com.yandex.passport.api.u)) {
            if (wVar.equals(com.yandex.passport.api.q.a)) {
                e eVar = authSdkActivity.component;
                com.yandex.passport.internal.report.reporters.h reporter = (eVar != null ? eVar : null).getReporter();
                String str = authSdkActivity.state;
                reporter.getClass();
                reporter.j(o0.w, str);
                authSdkActivity.finish();
                return;
            }
            e eVar2 = authSdkActivity.component;
            com.yandex.passport.internal.report.reporters.h reporter2 = (eVar2 != null ? eVar2 : null).getReporter();
            String str2 = authSdkActivity.state;
            reporter2.getClass();
            reporter2.j(p0.w, str2);
            authSdkActivity.finish();
            return;
        }
        e eVar3 = authSdkActivity.component;
        com.yandex.passport.internal.report.reporters.h reporter3 = (eVar3 != null ? eVar3 : null).getReporter();
        PassportUidImpl passportUidImpl = ((com.yandex.passport.api.u) wVar).a;
        Uid B = com.yandex.passport.internal.util.p.B(passportUidImpl);
        String str3 = authSdkActivity.state;
        reporter3.getClass();
        reporter3.f(q0.w, new yd(B), new com.yandex.passport.internal.report.i(reporter3.x, 9, false), new com.yandex.passport.internal.report.f("caller_app_id", String.valueOf(reporter3.c)), new com.yandex.passport.internal.report.f("caller_fingerprint", String.valueOf(reporter3.w)), new com.yandex.passport.internal.report.f(ClidProvider.STATE, str3));
        Bundle extras = authSdkActivity.getIntent().getExtras();
        if (extras == null) {
            ny61.r("Required value was null.");
            return;
        }
        AuthSdkProperties.Companion.getClass();
        AuthSdkProperties a = m.a(extras, authSdkActivity);
        PassportUidImpl.Companion.getClass();
        authSdkActivity.getSlothLauncher().a(AuthSdkProperties.copy$default(a, null, null, null, null, false, l2.a(passportUidImpl), null, null, null, 479, null).toSlothAuthSdk(com.yandex.passport.internal.util.p.B(passportUidImpl), authSdkActivity.state));
    }

    private final void chooseAccount(Uid challengeUid, Uid selectedUid) {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            ny61.r("Required value was null.");
            return;
        }
        AuthSdkProperties.Companion.getClass();
        AuthSdkProperties a = m.a(extras, this);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "primaryEnvironment " + a.getLoginProperties().getFilter().getPrimaryEnvironment(), 8);
        }
        m50 m50Var = this.bouncerResultLauncher;
        LoginProperties.a aVar = new LoginProperties.a();
        Filter.a aVar2 = new Filter.a();
        com.yandex.passport.api.d dVar = KPassportEnvironment.Companion;
        PassportEnvironmentImpl primaryEnvironment = a.getLoginProperties().getFilter().getPrimaryEnvironment();
        dVar.getClass();
        aVar2.a = com.yandex.passport.api.d.a(primaryEnvironment);
        PassportEnvironmentImpl secondaryTeamEnvironment = a.getLoginProperties().getFilter().getSecondaryTeamEnvironment();
        aVar2.b = secondaryTeamEnvironment != null ? com.yandex.passport.api.d.a(secondaryTeamEnvironment) : null;
        aVar2.c(PassportAccountType.CHILDISH);
        aVar.b = aVar2.a();
        LoginProperties.Companion.getClass();
        m50Var.a(LoginProperties.m307copyLjS6rdk$default(a0.b0(com.yandex.passport.internal.properties.i.b(aVar)), null, false, null, null, null, null, selectedUid != null ? com.yandex.passport.internal.util.p.A(selectedUid) : null, false, false, null, null, false, challengeUid != null ? com.yandex.passport.internal.util.p.A(challengeUid) : null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147479487, null));
    }

    public static /* synthetic */ void chooseAccount$default(AuthSdkActivity authSdkActivity, Uid uid, Uid uid2, int i, Object obj) {
        if ((i & 1) != 0) {
            uid = null;
        }
        if ((i & 2) != 0) {
            uid2 = null;
        }
        authSdkActivity.chooseAccount(uid, uid2);
    }

    private final PassportProcessGlobalComponent getGlobalComponent() {
        return (PassportProcessGlobalComponent) this.globalComponent.getValue();
    }

    private final m50 getSlothLauncher() {
        return (m50) this.slothLauncher.getValue();
    }

    private final void launchSloth(AuthSdkProperties properties, String state) {
        Object obj;
        Uid uid;
        ModernAccount a = getGlobalComponent().getCurrentAccountManager().a();
        if (a == null || (uid = a.getUid()) == null || (obj = uid.getEnvironment()) == null) {
            obj = Boolean.FALSE;
        }
        boolean z = obj == com.yandex.passport.internal.util.p.u(properties.getLoginProperties().getFilter().getPrimaryEnvironment());
        if (properties.getSelectedUid() != null) {
            getSlothLauncher().a(properties.toSlothAuthSdk(com.yandex.passport.internal.util.p.B(properties.getSelectedUid()), state));
        } else if (a == null || !z) {
            chooseAccount$default(this, null, null, 3, null);
        } else {
            getSlothLauncher().a(properties.toSlothAuthSdk(a.getUid(), state));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAuthSdkResult(com.yandex.passport.internal.ui.sloth.authsdk.g result) {
        int i = 9;
        boolean z = false;
        if (result instanceof com.yandex.passport.internal.ui.sloth.authsdk.a) {
            e eVar = this.component;
            if (eVar == null) {
                eVar = null;
            }
            com.yandex.passport.internal.report.reporters.h reporter = eVar.getReporter();
            Uid uid = ((com.yandex.passport.internal.ui.sloth.authsdk.a) result).a;
            String str = this.state;
            reporter.getClass();
            reporter.f(s0.w, new yd(uid), new com.yandex.passport.internal.report.i(reporter.x, i, z), new com.yandex.passport.internal.report.f("caller_app_id", String.valueOf(reporter.c)), new com.yandex.passport.internal.report.f("caller_fingerprint", String.valueOf(reporter.w)), new com.yandex.passport.internal.report.f(ClidProvider.STATE, str));
            chooseAccount$default(this, uid, null, 2, null);
            return;
        }
        if (result instanceof com.yandex.passport.internal.ui.sloth.authsdk.e) {
            e eVar2 = this.component;
            if (eVar2 == null) {
                eVar2 = null;
            }
            com.yandex.passport.internal.report.reporters.h reporter2 = eVar2.getReporter();
            Uid uid2 = ((com.yandex.passport.internal.ui.sloth.authsdk.e) result).a;
            String str2 = this.state;
            reporter2.getClass();
            reporter2.f(v0.w, new yd(uid2), new com.yandex.passport.internal.report.i(reporter2.x, i, z), new com.yandex.passport.internal.report.f("caller_app_id", String.valueOf(reporter2.c)), new com.yandex.passport.internal.report.f("caller_fingerprint", String.valueOf(reporter2.w)), new com.yandex.passport.internal.report.f(ClidProvider.STATE, str2));
            chooseAccount$default(this, null, uid2, 1, null);
            return;
        }
        if (result instanceof com.yandex.passport.internal.ui.sloth.authsdk.f) {
            e eVar3 = this.component;
            com.yandex.passport.internal.report.reporters.h reporter3 = (eVar3 != null ? eVar3 : null).getReporter();
            String str3 = this.state;
            reporter3.getClass();
            reporter3.j(y0.w, str3);
            onSlothResult((com.yandex.passport.internal.ui.sloth.authsdk.f) result);
            return;
        }
        if (jl40.l(result, com.yandex.passport.internal.ui.sloth.authsdk.b.a)) {
            e eVar4 = this.component;
            com.yandex.passport.internal.report.reporters.h reporter4 = (eVar4 != null ? eVar4 : null).getReporter();
            String str4 = this.state;
            reporter4.getClass();
            reporter4.j(w0.w, str4);
            finish();
            return;
        }
        if (!(result instanceof com.yandex.passport.internal.ui.sloth.authsdk.d)) {
            w511.b();
            return;
        }
        e eVar5 = this.component;
        com.yandex.passport.internal.report.reporters.h reporter5 = (eVar5 != null ? eVar5 : null).getReporter();
        Throwable th = ((com.yandex.passport.internal.ui.sloth.authsdk.d) result).a;
        String str5 = this.state;
        reporter5.getClass();
        reporter5.f(x0.w, new yd(th), new com.yandex.passport.internal.report.i(reporter5.x, i, z), new com.yandex.passport.internal.report.f("caller_app_id", String.valueOf(reporter5.c)), new com.yandex.passport.internal.report.f("caller_fingerprint", String.valueOf(reporter5.w)), new com.yandex.passport.internal.report.f(ClidProvider.STATE, str5));
        showError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancel() {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_TOKEN_ERROR, true);
        intent.putExtra(EXTRA_TOKEN_ERROR_MESSAGES, new String[]{"user_cancelled"});
        s sVar = this.commonViewModel;
        if (sVar == null) {
            sVar = null;
        }
        sVar.getClass();
        intent.putExtra(EXTRA_FLOW_ERRORS, new ArrayList(sVar.x));
        setResult(0, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeclined() {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_TOKEN_ERROR, true);
        intent.putExtra(EXTRA_TOKEN_ERROR_MESSAGES, new String[]{EbsException.ACCESS_DENIED_ERROR_CODE});
        s sVar = this.commonViewModel;
        if (sVar == null) {
            sVar = null;
        }
        sVar.getClass();
        intent.putExtra(EXTRA_FLOW_ERRORS, new ArrayList(sVar.x));
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResultReceived(AuthSdkResultContainer resultContainer) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_TOKEN, resultContainer.getResult().getAccessToken());
        intent.putExtra(EXTRA_TOKEN_TYPE, resultContainer.getResult().getTokenType());
        intent.putExtra(EXTRA_TOKEN_EXPIRES, resultContainer.getResult().getExpiresIn());
        intent.putExtra(EXTRA_AUTHORIZATION_CODE, resultContainer.getResult().getCode());
        intent.putExtra(EXTRA_CLIENT_ID, resultContainer.getClientId());
        PassportUidImpl A = com.yandex.passport.internal.util.p.A(resultContainer.getUid());
        intent.putExtras(wwg.g(new Pair("passport-login-result-environment", Integer.valueOf(A.getEnvironment().getInteger())), new Pair("passport-login-result-uid", Long.valueOf(A.getValue())), new Pair("passport-login-action", Integer.valueOf(PassportLoginAction.EMPTY.ordinal())), new Pair("passport-login-additional-action", null)));
        if (resultContainer.getJwtToken() != null) {
            intent.putExtra(EXTRA_JWT_TOKEN, resultContainer.getJwtToken().getValue());
        }
        s sVar = this.commonViewModel;
        s sVar2 = sVar != null ? sVar : null;
        sVar2.getClass();
        intent.putExtra(EXTRA_FLOW_ERRORS, new ArrayList(sVar2.x));
        intent.putExtra(EXTRA_GRANTED_SCOPES, resultContainer.getScopeCodes());
        setResult(-1, intent);
        finish();
    }

    private final void onSlothResult(com.yandex.passport.internal.ui.sloth.authsdk.f result) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_TOKEN, result.a);
        intent.putExtra(EXTRA_TOKEN_TYPE, result.b);
        intent.putExtra(EXTRA_TOKEN_EXPIRES, result.c);
        setResult(-1, intent);
        finish();
    }

    private final void showError(Throwable throwable) {
        e eVar = this.component;
        if (eVar == null) {
            eVar = null;
        }
        p ui = eVar.getUi();
        a aVar = new a(this, 1);
        com.yandex.passport.internal.ui.bouncer.error.h hVar = ui.c;
        li91.e(new AuthSdkUi$showError$1(aVar, null), hVar.x.y);
        com.yandex.passport.internal.ui.bouncer.error.d dVar = hVar.w;
        dVar.z.setText(((com.yandex.passport.internal.common.e) ui.w).a());
        TextView textView = dVar.B;
        String str = ui.x.b().a;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        dVar.A.setText("Error(" + throwable.getMessage() + ')');
        dVar.y.setText(new SimpleDateFormat("HH:mm (z) dd.MM.yyyy", Locale.getDefault()).format(Calendar.getInstance().getTime()).toString());
        li91.e(new AuthSdkUi$showError$3(ui, null), hVar.z);
        e eVar2 = this.component;
        setContentView((eVar2 != null ? eVar2 : null).getUi().getRoot());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showError$lambda$7(AuthSdkActivity authSdkActivity) {
        authSdkActivity.onCancel();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m50 slothLauncher_delegate$lambda$1(AuthSdkActivity authSdkActivity) {
        e eVar = authSdkActivity.component;
        if (eVar != null) {
            if (eVar == null) {
                eVar = null;
            }
            com.yandex.passport.internal.flags.j flagRepository = eVar.getFlagRepository();
            com.yandex.passport.internal.flags.a aVar = com.yandex.passport.internal.flags.q.a;
            if (((Boolean) flagRepository.b(com.yandex.passport.internal.flags.q.d0)).booleanValue()) {
                return authSdkActivity.authSdkComposeLauncher;
            }
        }
        return authSdkActivity.authSdkLauncher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        int i = 8;
        boolean z = false;
        Object[] objArr = 0;
        mkn.a(this, new b2x0(0, 0, 0, new ceu0(i)), new b2x0(0, 0, 0, new ceu0(i)));
        this.component = getGlobalComponent().createAuthSdkActivityComponent(new f(this));
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AuthSdkProperties.Companion.getClass();
            AuthSdkProperties a = m.a(extras, this);
            final int i2 = 1;
            boolean z2 = a.getTurboAppIdentifier() != null;
            e eVar = this.component;
            if (eVar == null) {
                eVar = null;
            }
            com.yandex.passport.internal.report.reporters.h reporter = eVar.getReporter();
            String clientId = a.getClientId();
            String callerAppId = a.getCallerAppId();
            String callerFingerprint = a.getCallerFingerprint();
            String str = this.state;
            reporter.x = clientId;
            reporter.c = callerAppId;
            reporter.w = callerFingerprint;
            final int i3 = 2;
            reporter.f(t0.w, new com.yandex.passport.internal.report.f("isTurbo", String.valueOf(z2)), new com.yandex.passport.internal.report.i(clientId, 9, z), new com.yandex.passport.internal.report.f("caller_app_id", String.valueOf(callerAppId)), new com.yandex.passport.internal.report.f("caller_fingerprint", String.valueOf(callerFingerprint)), new com.yandex.passport.internal.report.f(ClidProvider.STATE, str));
            setTheme(z2 ? com.yandex.passport.internal.ui.util.o.f(a.getLoginProperties().getTheme(), this) : com.yandex.passport.internal.ui.util.o.e(a.getLoginProperties().getTheme(), this));
            super.onCreate(savedInstanceState);
            setContentView(R.layout.passport_activity_auth_sdk);
            findViewById(R.id.container).setBackgroundResource(R.color.passport_roundabout_background);
            setTitle("");
            s sVar = (s) new ls31(this).b(s.class);
            this.commonViewModel = sVar;
            com.yandex.passport.internal.ui.util.l lVar = sVar.b;
            final Object[] objArr2 = objArr == true ? 1 : 0;
            lVar.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.authsdk.b
                public final /* synthetic */ AuthSdkActivity b;

                {
                    this.b = this;
                }

                @Override // defpackage.pq60
                public final void a(Object obj) {
                    int i4 = objArr2;
                    AuthSdkActivity authSdkActivity = this.b;
                    switch (i4) {
                        case 0:
                            authSdkActivity.onDeclined();
                            break;
                        case 1:
                            authSdkActivity.onResultReceived((AuthSdkResultContainer) obj);
                            break;
                        default:
                            authSdkActivity.onCancel();
                            break;
                    }
                }
            });
            s sVar2 = this.commonViewModel;
            if (sVar2 == null) {
                sVar2 = null;
            }
            sVar2.c.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.authsdk.b
                public final /* synthetic */ AuthSdkActivity b;

                {
                    this.b = this;
                }

                @Override // defpackage.pq60
                public final void a(Object obj) {
                    int i4 = i2;
                    AuthSdkActivity authSdkActivity = this.b;
                    switch (i4) {
                        case 0:
                            authSdkActivity.onDeclined();
                            break;
                        case 1:
                            authSdkActivity.onResultReceived((AuthSdkResultContainer) obj);
                            break;
                        default:
                            authSdkActivity.onCancel();
                            break;
                    }
                }
            });
            s sVar3 = this.commonViewModel;
            if (sVar3 == null) {
                sVar3 = null;
            }
            sVar3.w.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.authsdk.b
                public final /* synthetic */ AuthSdkActivity b;

                {
                    this.b = this;
                }

                @Override // defpackage.pq60
                public final void a(Object obj) {
                    int i4 = i3;
                    AuthSdkActivity authSdkActivity = this.b;
                    switch (i4) {
                        case 0:
                            authSdkActivity.onDeclined();
                            break;
                        case 1:
                            authSdkActivity.onResultReceived((AuthSdkResultContainer) obj);
                            break;
                        default:
                            authSdkActivity.onCancel();
                            break;
                    }
                }
            });
            if (savedInstanceState == null) {
                if (!z2) {
                    launchSloth(a, this.state);
                    return;
                }
                TurboAppFragment.Companion.getClass();
                TurboAppFragment turboAppFragment = new TurboAppFragment();
                turboAppFragment.setArguments(a.toBundle());
                turboAppFragment.show(getSupportFragmentManager(), (String) null);
                return;
            }
            ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList(KEY_FLOW_ERRORS);
            if (stringArrayList != null) {
                s sVar4 = this.commonViewModel;
                ArrayList arrayList = (sVar4 != null ? sVar4 : null).x;
                arrayList.clear();
                arrayList.addAll(stringArrayList);
            }
        } catch (Exception unused) {
            super.onCreate(savedInstanceState);
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        s sVar = this.commonViewModel;
        if (sVar == null) {
            sVar = null;
        }
        sVar.getClass();
        outState.putStringArrayList(KEY_FLOW_ERRORS, new ArrayList<>(sVar.x));
    }
}
