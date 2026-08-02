package com.yandex.passport.internal.ui.router;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.lightside.animations.DslAnimatorBuilder;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.account.PassportAccountImpl;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.network.exception.PartitionNotMatchedException;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.WebAmProperties;
import com.yandex.passport.internal.ui.domik.DomikResult;
import com.yandex.passport.internal.ui.domik.PhoneBoundedDomikResult;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothActivity;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothProperties;
import com.yandex.passport.internal.ui.social.gimap.MailProvider;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.eja1;
import defpackage.es31;
import defpackage.i3y;
import defpackage.ium;
import defpackage.m50;
import defpackage.mfu;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.qez;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.t40;
import defpackage.tje;
import defpackage.v0d;
import defpackage.w53;
import defpackage.y8f;
import defpackage.yyj0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u0000 Q2\u00020\u0001:\u0002RSB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010\fJ\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003J\u0019\u0010.\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b.\u0010\u0013J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\rH\u0014¢\u0006\u0004\b0\u0010\u0013R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010IR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020#0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006T"}, d2 = {"Lcom/yandex/passport/internal/ui/router/LoginRouterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/yandex/passport/internal/ui/router/v;", Constants.KEY_DATA, "Lzy11;", "startAppropriateActivity", "(Lcom/yandex/passport/internal/ui/router/v;)V", "Lt40;", TarifficatorScenarioActivity.RESULT_KEY, "processResult", "(Lt40;)V", "Landroid/os/Bundle;", "extras", "processOkResult", "(Lt40;Landroid/os/Bundle;)V", "processAuthResult", "processReloginResult", "(Landroid/os/Bundle;)V", "", "suggestedLogin", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "socialConfiguration", "onReloginWithDifferentConfiguration", "(Ljava/lang/String;Lcom/yandex/passport/api/PassportSocialConfiguration;)V", "onRestartAuthWithoutWebAm", "Lcom/yandex/passport/internal/ui/domik/DomikResult;", "domikResult", "onDomikResult", "(Lcom/yandex/passport/internal/ui/domik/DomikResult;)V", "Lcom/yandex/passport/internal/ui/router/w;", "ui", "startProgressBarAnimation", "(Lcom/yandex/passport/internal/ui/router/w;)V", "", "checkPartitions", "(Lcom/yandex/passport/internal/ui/domik/DomikResult;)Z", "shouldUnleashBear", "Lcom/yandex/passport/common/core/Uid;", "uid", "unleashBear", "(Lcom/yandex/passport/common/core/Uid;)V", "processBearResult", "finishWithWrongPartitionException", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Lcom/yandex/passport/internal/ui/router/w;", "Lcom/yandex/passport/internal/properties/LoginProperties;", "loginProperties", "Lcom/yandex/passport/internal/properties/LoginProperties;", "Lcom/yandex/passport/internal/analytics/b0;", "statefulReporter", "Lcom/yandex/passport/internal/analytics/b0;", "Lcom/yandex/passport/internal/analytics/c0;", "eventReporter", "Lcom/yandex/passport/internal/analytics/c0;", "Lcom/yandex/passport/internal/flags/j;", "flagsRepository", "Lcom/yandex/passport/internal/flags/j;", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "component", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "Lcom/yandex/passport/internal/ui/router/r;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/ui/router/r;", "viewModel", "Lm50;", "routingLauncher", "Lm50;", "Lcom/yandex/passport/sloth/data/SlothParams;", "bearLauncher", "Lcom/yandex/passport/internal/ui/sloth/StandaloneSlothProperties;", "composeBearLauncher", "Loz40;", "isShowProgressState", "Loz40;", "Companion", "mfu", "com/yandex/passport/internal/ui/router/n", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class LoginRouterActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public static final n Companion = new n();
    public static final String FORBIDDEN_WEB_AM_FOR_THIS_AUTH = "forbidden_web_am_for_this_auth";
    public static final String RELOGIN_PROVIDER = "configuration_to_relogin_with";
    private static final String SAVED_IS_SHOW_PROGRESS = "saved_is_show_progress";
    private final m50 bearLauncher;
    private PassportProcessGlobalComponent component;
    private final m50 composeBearLauncher;
    private c0 eventReporter;
    private com.yandex.passport.internal.flags.j flagsRepository;
    private final oz40 isShowProgressState;
    private LoginProperties loginProperties;
    private final m50 routingLauncher;
    private b0 statefulReporter;
    private w ui;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(r.class), new sls(this) { // from class: com.yandex.passport.internal.ui.router.LoginRouterActivity$special$$inlined$viewModels$default$2
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.router.LoginRouterActivity$special$$inlined$viewModels$default$1
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_viewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.router.LoginRouterActivity$special$$inlined$viewModels$default$3
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

    public LoginRouterActivity() {
        LoginRouterActivity$routingLauncher$1 loginRouterActivity$routingLauncher$1 = new LoginRouterActivity$routingLauncher$1(this, LoginRouterActivity.class, "viewModel", "getViewModel()Lcom/yandex/passport/internal/ui/router/LoginRouterViewModel;", 0);
        int i = 2;
        this.routingLauncher = registerForActivityResult(new mfu(i, loginRouterActivity$routingLauncher$1), new o(this, i));
        this.bearLauncher = registerForActivityResult(new StandaloneSlothActivity.a(), new o(this, 0));
        this.composeBearLauncher = registerForActivityResult(new StandaloneSlothComposeActivity.a(), new o(this, 1));
        this.isShowProgressState = androidx.compose.runtime.f.j(Boolean.TRUE);
    }

    private final boolean checkPartitions(DomikResult domikResult) {
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        boolean isEmpty = kotlin.collections.a.U(domikResult.getModernAccount().getPartitions(), com.yandex.passport.internal.ui.c.G(loginProperties.getFilter().getPartitions())).isEmpty();
        boolean z = !isEmpty;
        if (isEmpty) {
            finishWithWrongPartitionException();
        }
        return z;
    }

    private final void finishWithWrongPartitionException() {
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_EXCEPTION, new PartitionNotMatchedException());
        setResult(13, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r getViewModel() {
        return (r) this.viewModel.getValue();
    }

    private final void onDomikResult(DomikResult domikResult) {
        if (checkPartitions(domikResult)) {
            ModernAccount modernAccount = domikResult.getModernAccount();
            if (shouldUnleashBear(domikResult)) {
                unleashBear(modernAccount.getUid());
                return;
            }
            ClientToken clientToken = domikResult.getClientToken();
            com.yandex.passport.api.u uVar = new com.yandex.passport.api.u(com.yandex.passport.internal.util.p.A(modernAccount.getUid()), a0.g0(domikResult.getModernAccount()), domikResult.getLoginAction(), domikResult.getAdditionalActionResponse(), null);
            com.yandex.passport.internal.storage.i preferenceStorage = com.yandex.passport.internal.di.a.a().getPreferenceStorage();
            Uid uid = modernAccount.getUid();
            preferenceStorage.getClass();
            com.yandex.passport.internal.storage.b bVar = new com.yandex.passport.internal.storage.b(preferenceStorage, uid);
            boolean z = false;
            bVar.c(false);
            Intent data = com.yandex.passport.internal.ui.c.B(uVar).getData();
            if (data == null) {
                ny61.r("Internal error: no data in result");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("accountType", com.yandex.passport.internal.i.a);
            bundle.putString("authAccount", modernAccount.getAccountName());
            if (clientToken != null) {
                bundle.putString("authtoken", clientToken.getValue());
            }
            if (domikResult instanceof PhoneBoundedDomikResult) {
                bundle.putString("phone-number", ((PhoneBoundedDomikResult) domikResult).getPhoneNumber());
            }
            data.putExtras(bundle);
            if (clientToken != null && com.yandex.passport.common.util.a.e(clientToken.getValue()) != null) {
                z = true;
            }
            c0 c0Var = this.eventReporter;
            if (c0Var == null) {
                c0Var = null;
            }
            long value = modernAccount.getUid().getValue();
            boolean isYandexoid = a0.g0(modernAccount).isYandexoid();
            c0Var.getClass();
            w53 w53Var = new w53();
            w53Var.put("uid", String.valueOf(value));
            w53Var.put("clientTokenIsNotNullNorEmpty", String.valueOf(z));
            w53Var.put("is_yandexoid", String.valueOf(isYandexoid));
            c0Var.a.a(com.yandex.passport.internal.analytics.g.g, w53Var);
            setResult(-1, data);
            finish();
        }
    }

    private final void onReloginWithDifferentConfiguration(String suggestedLogin, PassportSocialConfiguration socialConfiguration) {
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        LoginProperties.a aVar = new LoginProperties.a(loginProperties);
        aVar.E = suggestedLogin;
        aVar.D = socialConfiguration;
        this.loginProperties = aVar.a();
        Intent intent = getIntent();
        LoginProperties loginProperties2 = this.loginProperties;
        if (loginProperties2 == null) {
            loginProperties2 = null;
        }
        intent.putExtras(loginProperties2.toBundle());
        r viewModel = getViewModel();
        LoginProperties loginProperties3 = this.loginProperties;
        viewModel.Z(this, loginProperties3 != null ? loginProperties3 : null);
    }

    private final void onRestartAuthWithoutWebAm() {
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        WebAmProperties webAmProperties = loginProperties.getWebAmProperties();
        LoginProperties loginProperties2 = this.loginProperties;
        if (loginProperties2 == null) {
            loginProperties2 = null;
        }
        LoginProperties.a aVar = new LoginProperties.a(loginProperties2);
        aVar.w = webAmProperties == null || !webAmProperties.getIgnoreBackToNativeFallback();
        this.loginProperties = aVar.a();
        Intent intent = getIntent();
        LoginProperties loginProperties3 = this.loginProperties;
        if (loginProperties3 == null) {
            loginProperties3 = null;
        }
        intent.putExtras(loginProperties3.toBundle());
        r viewModel = getViewModel();
        LoginProperties loginProperties4 = this.loginProperties;
        viewModel.Z(this, loginProperties4 != null ? loginProperties4 : null);
    }

    private final void processAuthResult(t40 result) {
        com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.c.B(com.yandex.passport.api.r.d(result.a.a, result.b)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processBearResult(t40 result) {
        if (result.a.a != 666) {
            finish();
            return;
        }
        r viewModel = getViewModel();
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        viewModel.Z(this, loginProperties);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        if (r0 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void processOkResult(t40 result, Bundle extras) {
        String str;
        boolean z;
        if (extras.containsKey(RELOGIN_PROVIDER)) {
            processReloginResult(extras);
            return;
        }
        if (extras.getBoolean(FORBIDDEN_WEB_AM_FOR_THIS_AUTH, false)) {
            onRestartAuthWithoutWebAm();
            return;
        }
        int i = result.a.a;
        Intent intent = result.b;
        if (i != -1) {
            if (i != 0 && i != 6) {
                if (i == 13 && intent != null) {
                    z = intent.hasExtra(Constants.KEY_EXCEPTION);
                }
                z = false;
            }
            z = true;
        } else {
            Bundle extras2 = intent != null ? intent.getExtras() : null;
            if (extras2 == null) {
                str = "Bundle is empty";
            } else if (!extras2.containsKey("passport-login-result-environment")) {
                str = "Environment";
            } else if (!extras2.containsKey("passport-login-result-uid")) {
                str = "Uid";
            } else if (extras2.containsKey("passport-login-action")) {
                PassportAccountImpl.Companion.getClass();
                str = !extras2.containsKey("passport-account") ? "Account data" : null;
            } else {
                str = "Login Action";
            }
        }
        if (z) {
            processAuthResult(result);
            return;
        }
        DomikResult.Companion.getClass();
        if (((DomikResult) extras.getParcelable("domik-result")) != null) {
            DomikResult domikResult = (DomikResult) extras.getParcelable("domik-result");
            if (domikResult != null) {
                onDomikResult(domikResult);
                return;
            } else {
                ny61.r("no domik-result in the bundle");
                return;
            }
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Unsupported result extras: " + extras, 8);
        }
        setResult(0);
        finish();
    }

    private final void processReloginResult(Bundle extras) {
        String string = extras.getString("authAccount");
        if (string == null) {
            ny61.r("no authAccount in extras");
        } else {
            MailProvider mailProvider = (MailProvider) extras.getSerializable(RELOGIN_PROVIDER);
            onReloginWithDifferentConfiguration(string, mailProvider != null ? mailProvider.getPassportSocialConfiguration() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processResult(t40 result) {
        Intent intent = result.b;
        qez qezVar = result.a;
        if (qezVar.equals(yyj0.c)) {
            if ((intent != null ? intent.getExtras() : null) != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    processOkResult(result, extras);
                    return;
                } else {
                    ny61.r("internal error");
                    return;
                }
            }
        }
        setResult(qezVar.a, intent);
        finish();
    }

    private final boolean shouldUnleashBear(DomikResult domikResult) {
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        return domikResult.getModernAccount().isChild() && !loginProperties.getFilter().get(PassportAccountType.CHILDISH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAppropriateActivity(v data) {
        b0 b0Var = this.statefulReporter;
        if (b0Var == null) {
            b0Var = null;
        }
        b0Var.getClass();
        b0Var.x = DomikStatefulReporter$Screen.NONE;
        b0Var.b = false;
        b0Var.c = null;
        b0Var.w = UUID.randomUUID().toString();
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        b0Var.b = loginProperties.isFromAuthSdk();
        LoginProperties loginProperties2 = this.loginProperties;
        if (loginProperties2 == null) {
            loginProperties2 = null;
        }
        b0Var.z = loginProperties2.getVisualProperties().isPreferPhonishAuth();
        LoginProperties loginProperties3 = this.loginProperties;
        b0Var.y = (loginProperties3 != null ? loginProperties3 : null).getSource();
        this.routingLauncher.a(data);
    }

    private final void startProgressBarAnimation(w ui) {
        DslAnimatorBuilder dslAnimatorBuilder = new DslAnimatorBuilder();
        startProgressBarAnimation$lambda$5(ui, dslAnimatorBuilder);
        dslAnimatorBuilder.start();
    }

    private static final zy11 startProgressBarAnimation$lambda$5(w wVar, DslAnimatorBuilder dslAnimatorBuilder) {
        dslAnimatorBuilder.targets(new com.yandex.passport.internal.analytics.a0(19, wVar));
        dslAnimatorBuilder.setDuration(300L);
        dslAnimatorBuilder.setStartDelay(100L);
        dslAnimatorBuilder.setInterpolator(new DecelerateInterpolator());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 startProgressBarAnimation$lambda$5$lambda$4(w wVar, ium iumVar) {
        startProgressBarAnimation$lambda$5$lambda$4$lambda$3(new com.lightside.animations.a(wVar.w, iumVar.a));
        return zy11.a;
    }

    private static final zy11 startProgressBarAnimation$lambda$5$lambda$4$lambda$3(com.lightside.animations.a aVar) {
        Pair pair = new Pair(Float.valueOf(0.0f), Float.valueOf(1.0f));
        aVar.a(((Number) pair.c()).floatValue(), ((Number) pair.f()).floatValue());
        return zy11.a;
    }

    private final void unleashBear(Uid uid) {
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.component;
        if (passportProcessGlobalComponent == null) {
            passportProcessGlobalComponent = null;
        }
        com.yandex.passport.internal.network.e urlDispatcher = passportProcessGlobalComponent.getUrlDispatcher();
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        String m = ((com.yandex.passport.internal.network.l) urlDispatcher).m(com.yandex.passport.internal.util.p.u(loginProperties.getFilter().getPrimaryEnvironment()), null);
        LoginProperties loginProperties2 = this.loginProperties;
        if (loginProperties2 == null) {
            loginProperties2 = null;
        }
        com.yandex.passport.sloth.data.o oVar = new com.yandex.passport.sloth.data.o(m, uid, com.yandex.passport.internal.properties.u.W(loginProperties2.getTheme()));
        LoginProperties loginProperties3 = this.loginProperties;
        if (loginProperties3 == null) {
            loginProperties3 = null;
        }
        Environment u = com.yandex.passport.internal.util.p.u(loginProperties3.getFilter().getPrimaryEnvironment());
        LoginProperties loginProperties4 = this.loginProperties;
        if (loginProperties4 == null) {
            loginProperties4 = null;
        }
        WebAmProperties webAmProperties = loginProperties4.getWebAmProperties();
        com.yandex.passport.internal.flags.j jVar = this.flagsRepository;
        if (jVar == null) {
            jVar = null;
        }
        SlothParams slothParams = new SlothParams(oVar, u, null, com.yandex.passport.internal.properties.u.J(webAmProperties, ((Boolean) jVar.b(com.yandex.passport.internal.flags.q.z)).booleanValue()), 4, null);
        com.yandex.passport.internal.flags.j jVar2 = this.flagsRepository;
        if (jVar2 == null) {
            jVar2 = null;
        }
        if (!((Boolean) jVar2.b(com.yandex.passport.internal.flags.q.W)).booleanValue()) {
            this.bearLauncher.a(slothParams);
            return;
        }
        m50 m50Var = this.composeBearLauncher;
        LoginProperties loginProperties5 = this.loginProperties;
        m50Var.a(new StandaloneSlothProperties(com.yandex.passport.internal.util.p.t((loginProperties5 != null ? loginProperties5 : null).getTheme()), slothParams));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String str;
        this.component = com.yandex.passport.internal.di.a.a();
        LoginProperties loginProperties = com.yandex.passport.internal.g.a;
        Intent intent = getIntent();
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.component;
        if (passportProcessGlobalComponent == null) {
            passportProcessGlobalComponent = null;
        }
        LoginProperties loginProperties2 = passportProcessGlobalComponent.getProperties().o;
        Bundle extras = intent.getExtras();
        if (extras == null || (str = extras.getString("passport_action")) == null) {
            str = "";
        }
        if (TextUtils.equals(str, "com.yandex.passport.ACTION_SYSTEM_ADD_ACCOUNT")) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "intent action ACTION_SYSTEM_ADD_ACCOUNT default properties: " + loginProperties2, 8);
            }
            if (loginProperties2 == null) {
                loginProperties2 = com.yandex.passport.internal.g.a;
            }
        } else {
            if (extras != null) {
                LoginProperties.Companion.getClass();
                if (extras.containsKey("passport-login-properties")) {
                    loginProperties2 = com.yandex.passport.internal.properties.i.a(extras);
                }
            }
            LoginProperties.a aVar = new LoginProperties.a();
            Filter.a aVar2 = new Filter.a();
            aVar2.e(PassportEnvironmentImpl.PRODUCTION);
            aVar2.b(PassportAccountType.SOCIAL);
            aVar.g(aVar2.a());
            loginProperties2 = aVar.a();
        }
        this.loginProperties = loginProperties2;
        if (loginProperties2 == null) {
            loginProperties2 = null;
        }
        setTheme(com.yandex.passport.internal.ui.util.o.f(loginProperties2.getTheme(), this));
        super.onCreate(savedInstanceState);
        PassportProcessGlobalComponent passportProcessGlobalComponent2 = this.component;
        if (passportProcessGlobalComponent2 == null) {
            passportProcessGlobalComponent2 = null;
        }
        this.statefulReporter = passportProcessGlobalComponent2.getStatefulReporter();
        PassportProcessGlobalComponent passportProcessGlobalComponent3 = this.component;
        if (passportProcessGlobalComponent3 == null) {
            passportProcessGlobalComponent3 = null;
        }
        this.eventReporter = passportProcessGlobalComponent3.getEventReporter();
        PassportProcessGlobalComponent passportProcessGlobalComponent4 = this.component;
        if (passportProcessGlobalComponent4 == null) {
            passportProcessGlobalComponent4 = null;
        }
        this.flagsRepository = passportProcessGlobalComponent4.getFlagRepository();
        int i = 1;
        this.isShowProgressState.setValue(Boolean.valueOf(savedInstanceState != null ? savedInstanceState.getBoolean(SAVED_IS_SHOW_PROGRESS, true) : true));
        PassportProcessGlobalComponent passportProcessGlobalComponent5 = this.component;
        if (passportProcessGlobalComponent5 == null) {
            passportProcessGlobalComponent5 = null;
        }
        if (((Boolean) passportProcessGlobalComponent5.getFlagRepository().b(com.yandex.passport.internal.flags.q.f0)).booleanValue()) {
            v0d.a(this, new androidx.compose.runtime.internal.a(1873947389, new p(this, i), true));
        } else {
            LoginProperties loginProperties3 = this.loginProperties;
            if (loginProperties3 == null) {
                loginProperties3 = null;
            }
            ProgressPropertiesImpl progressProperties = loginProperties3.getVisualProperties().getProgressProperties();
            PassportProcessGlobalComponent passportProcessGlobalComponent6 = this.component;
            if (passportProcessGlobalComponent6 == null) {
                passportProcessGlobalComponent6 = null;
            }
            w wVar = new w(this, progressProperties, passportProcessGlobalComponent6.getProperties().w);
            this.ui = wVar;
            setContentView(wVar.getRoot());
        }
        tje.N(eja1.s(this), null, null, new LoginRouterActivity$onCreate$$inlined$collectOn$1(getViewModel().w, null, this), 3);
        if (savedInstanceState == null) {
            r viewModel = getViewModel();
            LoginProperties loginProperties4 = this.loginProperties;
            viewModel.Z(this, loginProperties4 != null ? loginProperties4 : null);
            w wVar2 = this.ui;
            if (wVar2 != null) {
                startProgressBarAnimation(wVar2);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(SAVED_IS_SHOW_PROGRESS, ((Boolean) this.isShowProgressState.getValue()).booleanValue());
    }
}
