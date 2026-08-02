package com.yandex.passport.internal.ui.sloth.menu;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.api.exception.PassportHostProcessedException;
import com.yandex.passport.api.f3;
import com.yandex.passport.api.g3;
import com.yandex.passport.api.j3;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.UserMenuProperties;
import com.yandex.passport.internal.provider.communication.CommonRequestsProcessor$connection$1;
import com.yandex.passport.internal.ui.sloth.menu.host.UserIdCommunicationService;
import com.yandex.passport.sloth.ui.i2;
import com.yandex.passport.sloth.ui.string.SlothString;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.bvf0;
import defpackage.eja1;
import defpackage.es31;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.li91;
import defpackage.mkn;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tje;
import defpackage.y8f;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0004\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0012\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u0003R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/menu/UserMenuActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/yandex/passport/internal/properties/UserMenuProperties;", "userMenuProperties", "Ll8x;", "bindOrError", "(Lcom/yandex/passport/internal/properties/UserMenuProperties;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isLostConnection", "Lkotlin/Function0;", "Lzy11;", "buttonCallback", "showError", "(ZLsls;)V", "Lcom/yandex/passport/sloth/m;", TarifficatorScenarioActivity.RESULT_KEY, "processError", "(Lcom/yandex/passport/sloth/m;)V", "", Constants.KEY_MESSAGE, "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "globalComponent", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "Lcom/yandex/passport/internal/ui/sloth/menu/e;", "component", "Lcom/yandex/passport/internal/ui/sloth/menu/e;", "Lcom/yandex/passport/internal/ui/sloth/menu/s;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/ui/sloth/menu/s;", "viewModel", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserMenuActivity extends AppCompatActivity {
    public static final int $stable = 8;
    private e component;
    private PassportProcessGlobalComponent globalComponent;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(s.class), new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity$special$$inlined$viewModels$default$2
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity$special$$inlined$viewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bindOrError(UserMenuProperties userMenuProperties, Continuation<? super l8x> continuation) {
        return bvf0.n(new UserMenuActivity$bindOrError$2(this, userMenuProperties, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s getViewModel() {
        return (s) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$1(UserMenuActivity userMenuActivity) {
        com.yandex.passport.internal.ui.c.k(userMenuActivity, com.yandex.passport.internal.ui.c.D(f3.a));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processError(com.yandex.passport.sloth.m result) {
        j3 g3Var;
        List list = result.a;
        com.yandex.passport.sloth.k kVar = (com.yandex.passport.sloth.k) kotlin.collections.a.R(list);
        if (kVar == null || !jl40.l(kVar.a, "lost_connection")) {
            PassportHostProcessedException.Companion.getClass();
            g3Var = new g3(com.yandex.passport.api.exception.b.a(list));
        } else {
            g3Var = f3.a;
        }
        com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.c.D(g3Var));
    }

    private final void showError(boolean isLostConnection, sls buttonCallback) {
        e eVar = this.component;
        if (eVar == null) {
            eVar = null;
        }
        eVar.getUiController().a(isLostConnection, new d(1, buttonCallback));
    }

    public static /* synthetic */ void showError$default(UserMenuActivity userMenuActivity, boolean z, sls slsVar, int i, Object obj) {
        int i2 = 1;
        if ((i & 1) != 0) {
            z = false;
        }
        e eVar = userMenuActivity.component;
        if (eVar == null) {
            eVar = null;
        }
        eVar.getUiController().a(z, new d(i2, slsVar));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        mkn.b(this);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onCreate(savedInstanceState=" + savedInstanceState + ')', 8);
        }
        this.globalComponent = com.yandex.passport.internal.di.a.a();
        super.onCreate(savedInstanceState);
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.globalComponent;
        if (passportProcessGlobalComponent == null) {
            passportProcessGlobalComponent = null;
        }
        e createUserMenuActivityComponent = passportProcessGlobalComponent.createUserMenuActivityComponent(new f(this));
        this.component = createUserMenuActivityComponent;
        if (createUserMenuActivityComponent == null) {
            createUserMenuActivityComponent = null;
        }
        setContentView(createUserMenuActivityComponent.getUiController().a.getRoot());
        e eVar = this.component;
        if (eVar == null) {
            eVar = null;
        }
        q uiController = eVar.getUiController();
        com.yandex.passport.internal.flags.experiments.h hVar = new com.yandex.passport.internal.flags.experiments.h(26, this);
        i2 i2Var = uiController.a.w;
        ((LinearLayout) i2Var.getRoot()).setVisibility(0);
        Button button = i2Var.A;
        button.setVisibility(8);
        button.setText(((com.yandex.passport.internal.ui.sloth.k) uiController.b).a(SlothString.BACK_BUTTON));
        li91.e(new UserMenuUiController$showZeroPage$1$1$1(hVar, null), button);
        tje.N(eja1.s(this), null, null, new UserMenuActivity$onCreate$3(this, null), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        e eVar = this.component;
        if (eVar == null) {
            eVar = null;
        }
        l userMenuRequestsProcessor = eVar.getUserMenuRequestsProcessor();
        userMenuRequestsProcessor.getClass();
        com.yandex.passport.internal.ui.sloth.menu.host.b bVar = UserIdCommunicationService.Companion;
        Context context = userMenuRequestsProcessor.d;
        CommonRequestsProcessor$connection$1 commonRequestsProcessor$connection$1 = userMenuRequestsProcessor.c;
        bVar.getClass();
        context.unbindService(commonRequestsProcessor$connection$1);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processError(String message) {
        com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.c.D(new g3(new Throwable(message))));
    }
}
