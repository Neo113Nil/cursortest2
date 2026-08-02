package com.yandex.passport.internal.ui.challenge.logout;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.ui.challenge.ChallengeActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.es31;
import defpackage.i3y;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.y8f;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 #2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u0003*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/logout/LogoutActivity;", "Lcom/yandex/passport/internal/ui/challenge/ChallengeActivity;", "", "Lcom/yandex/passport/internal/ui/challenge/logout/b;", "Lcom/yandex/passport/internal/ui/challenge/k;", "<init>", "()V", "Landroid/os/Bundle;", "parseChallengeData", "(Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/challenge/k;", "toBundle", "(Z)Landroid/os/Bundle;", TarifficatorScenarioActivity.RESULT_KEY, "", "resultCodeFor", "(Z)I", "input", "transformResult", "(ZLcom/yandex/passport/internal/ui/challenge/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "extras", "createChallengeActivityComponent", "(Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/challenge/logout/b;", "logic", "(Lcom/yandex/passport/internal/ui/challenge/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/yandex/passport/internal/ui/challenge/logout/g0;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/ui/challenge/logout/g0;", "viewModel", "Companion", "com/yandex/passport/internal/ui/challenge/logout/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutActivity extends ChallengeActivity<Boolean, b, com.yandex.passport.internal.ui.challenge.k> {
    public static final int $stable = 8;
    public static final a Companion = new a();

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(g0.class), new sls(this) { // from class: com.yandex.passport.internal.ui.challenge.logout.LogoutActivity$special$$inlined$viewModels$default$2
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.challenge.logout.LogoutActivity$special$$inlined$viewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.challenge.logout.LogoutActivity$special$$inlined$viewModels$default$3
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

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public b createChallengeActivityComponent(PassportProcessGlobalComponent passportProcessGlobalComponent, Bundle bundle) {
        return passportProcessGlobalComponent.createLogoutActivityComponent(new c(this, bundle));
    }

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public g0 getViewModel() {
        return (g0) this.viewModel.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object logic(com.yandex.passport.internal.ui.challenge.k kVar, Continuation<? super Boolean> continuation) {
        LogoutBehaviour logoutBehaviour;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            LogoutBehaviour.Companion.getClass();
            extras.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
            Serializable serializable = extras.getSerializable("passport-logout-behaviour");
            logoutBehaviour = serializable instanceof LogoutBehaviour ? (LogoutBehaviour) serializable : null;
        }
        logoutBehaviour = LogoutBehaviour.DROP_CLIENT_TOKEN;
        getViewModel().c = logoutBehaviour;
        return super.logic((LogoutActivity) kVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0 == null) goto L8;
     */
    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity, com.yandex.passport.internal.ui.ResultAwareActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle savedInstanceState) {
        PassportTheme passportTheme;
        Bundle extras;
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            PassportLogoutPropertiesImpl.Companion.getClass();
            passportTheme = com.yandex.passport.internal.properties.l.a(extras).getTheme();
        }
        passportTheme = PassportTheme.DARK;
        GlobalRouterActivity.Companion.getClass();
        int c = com.yandex.passport.internal.ui.router.c.c(passportTheme);
        if (c != getDelegate().getLocalNightMode()) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Setting theme to " + passportTheme + " with nightMode=" + c + ", was " + getDelegate().getLocalNightMode(), 8);
            }
            getDelegate().setLocalNightMode(c);
            recreate();
        }
        super.onCreate(savedInstanceState);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public com.yandex.passport.internal.ui.challenge.k parseChallengeData(Bundle bundle) {
        PassportLogoutPropertiesImpl.Companion.getClass();
        PassportLogoutPropertiesImpl a = com.yandex.passport.internal.properties.l.a(bundle);
        return new com.yandex.passport.internal.ui.challenge.k(com.yandex.passport.internal.util.p.B(a.getUid()), a.getTheme());
    }

    @Override // com.yandex.passport.internal.ui.ResultAwareActivity
    public /* bridge */ /* synthetic */ int resultCodeFor(Object obj) {
        return resultCodeFor(((Boolean) obj).booleanValue());
    }

    @Override // com.yandex.passport.internal.ui.ResultAwareActivity
    public /* bridge */ /* synthetic */ Bundle toBundle(Object obj) {
        return toBundle(((Boolean) obj).booleanValue());
    }

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity
    public Object transformResult(boolean z, com.yandex.passport.internal.ui.challenge.k kVar, Continuation<? super Boolean> continuation) {
        return Boolean.valueOf(z);
    }

    public int resultCodeFor(boolean result) {
        return result ? -1 : 6;
    }

    public Bundle toBundle(boolean z) {
        return null;
    }

    @Override // com.yandex.passport.internal.ui.challenge.ChallengeActivity, com.yandex.passport.internal.ui.ResultAwareActivity
    public /* bridge */ /* synthetic */ Object logic(Object obj, Continuation continuation) {
        return logic((com.yandex.passport.internal.ui.challenge.k) obj, (Continuation<? super Boolean>) continuation);
    }
}
