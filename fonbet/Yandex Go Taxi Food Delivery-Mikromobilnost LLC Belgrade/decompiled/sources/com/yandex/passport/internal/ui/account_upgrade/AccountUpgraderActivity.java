package com.yandex.passport.internal.ui.account_upgrade;

import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.a1;
import com.yandex.passport.api.r;
import com.yandex.passport.api.u;
import com.yandex.passport.api.w;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.presentation.f1;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothActivity;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity;
import com.yandex.passport.internal.util.p;
import defpackage.bvf0;
import defpackage.dac;
import defpackage.ds31;
import defpackage.eja1;
import defpackage.es31;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.ie60;
import defpackage.m50;
import defpackage.mkn;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.t40;
import defpackage.tje;
import defpackage.y8f;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/yandex/passport/internal/ui/account_upgrade/AccountUpgraderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/view/View;", "getDarksideView", "()Landroid/view/View;", "Lcom/yandex/passport/common/ui/AppTheme;", "appTheme", "getComposeView", "(Lcom/yandex/passport/common/ui/AppTheme;)Landroid/view/View;", "Lt40;", "activityResult", "Lzy11;", "processResult", "(Lt40;)V", "Lcom/yandex/passport/api/w;", "authResult", "onResult", "(Lcom/yandex/passport/api/w;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/yandex/passport/internal/ui/account_upgrade/UpgraderExtras;", "upgraderExtras", "Lcom/yandex/passport/internal/ui/account_upgrade/UpgraderExtras;", "Lcom/yandex/passport/internal/ui/account_upgrade/g;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/ui/account_upgrade/g;", "viewModel", "Lm50;", "Lcom/yandex/passport/sloth/data/SlothParams;", "standaloneSlothLauncher", "Lm50;", "Lcom/yandex/passport/internal/ui/sloth/StandaloneSlothProperties;", "standaloneSlothComposeLauncher", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "component", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "Companion", "com/yandex/passport/internal/ui/account_upgrade/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccountUpgraderActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public static final a Companion = new a();
    private UpgraderExtras upgraderExtras;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(g.class), new sls(this) { // from class: com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderActivity$special$$inlined$viewModels$default$2
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
    }, new a1(11), new sls(this) { // from class: com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderActivity$special$$inlined$viewModels$default$3
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
    private final m50 standaloneSlothLauncher = registerForActivityResult(new StandaloneSlothActivity.a(), new b(this, 1));
    private final m50 standaloneSlothComposeLauncher = registerForActivityResult(new StandaloneSlothComposeActivity.a(), new b(this, 0));
    private final PassportProcessGlobalComponent component = com.yandex.passport.internal.di.a.a();

    private final View getComposeView(AppTheme appTheme) {
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(678206641, new f1(2, appTheme, this), true));
        return composeView;
    }

    private final View getDarksideView() {
        return new c(this, this.component.getProperties().w).getRoot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g getViewModel() {
        return (g) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r8.a(r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r8.a(r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onResult(w wVar, Continuation<? super zy11> continuation) {
        AccountUpgraderActivity$onResult$1 accountUpgraderActivity$onResult$1;
        int i;
        if (continuation instanceof AccountUpgraderActivity$onResult$1) {
            accountUpgraderActivity$onResult$1 = (AccountUpgraderActivity$onResult$1) continuation;
            int i2 = accountUpgraderActivity$onResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountUpgraderActivity$onResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountUpgraderActivity$onResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountUpgraderActivity$onResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = wVar instanceof u;
                    PassportProcessGlobalComponent passportProcessGlobalComponent = this.component;
                    if (z) {
                        com.yandex.passport.internal.upgrader.e accountUpgradeSuccessUseCase = passportProcessGlobalComponent.getAccountUpgradeSuccessUseCase();
                        Uid B = p.B(((u) wVar).a);
                        accountUpgraderActivity$onResult$1.L$0 = this;
                        accountUpgraderActivity$onResult$1.L$1 = wVar;
                        accountUpgraderActivity$onResult$1.label = 1;
                    } else {
                        com.yandex.passport.internal.upgrader.d accountUpgradeRefuseUseCase = passportProcessGlobalComponent.getAccountUpgradeRefuseUseCase();
                        UpgraderExtras upgraderExtras = this.upgraderExtras;
                        Uid uid = (upgraderExtras != null ? upgraderExtras : null).getUid();
                        accountUpgraderActivity$onResult$1.L$0 = this;
                        accountUpgraderActivity$onResult$1.L$1 = wVar;
                        accountUpgraderActivity$onResult$1.label = 2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wVar = (w) accountUpgraderActivity$onResult$1.L$1;
                    this = (AccountUpgraderActivity) accountUpgraderActivity$onResult$1.L$0;
                    kotlin.b.b(obj);
                }
                com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.c.B(wVar));
                return zy11.a;
            }
        }
        accountUpgraderActivity$onResult$1 = new AccountUpgraderActivity$onResult$1(this, continuation);
        Object obj2 = accountUpgraderActivity$onResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountUpgraderActivity$onResult$1.label;
        if (i != 0) {
        }
        com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.c.B(wVar));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processResult(t40 activityResult) {
        tje.N(bvf0.a(ie60.a), null, null, new AccountUpgraderActivity$processResult$1(this, r.d(activityResult.a.a, activityResult.b), null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$0() {
        return com.yandex.passport.internal.di.a.a().getViewModelsFactory();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        View darksideView;
        super.onCreate(savedInstanceState);
        k kVar = UpgraderExtras.Companion;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            dac.f(getIntent(), "no extras in ");
            return;
        }
        kVar.getClass();
        extras.setClassLoader(p.class.getClassLoader());
        UpgraderExtras upgraderExtras = (UpgraderExtras) extras.getParcelable("key-upgrader-extras");
        if (upgraderExtras == null) {
            ny61.r("Bundle has no UpgraderExtras");
            return;
        }
        this.upgraderExtras = upgraderExtras;
        if (((Boolean) this.component.getFlagRepository().b(q.X)).booleanValue()) {
            UpgraderExtras upgraderExtras2 = this.upgraderExtras;
            if (upgraderExtras2 == null) {
                upgraderExtras2 = null;
            }
            AppTheme t = p.t(upgraderExtras2.getTheme());
            mkn.a(this, com.yandex.passport.common.ui.compose.d.d(t), com.yandex.passport.common.ui.compose.d.d(t));
            darksideView = getComposeView(t);
        } else {
            darksideView = getDarksideView();
        }
        setContentView(darksideView);
        tje.N(eja1.s(this), null, null, new AccountUpgraderActivity$onCreate$1(this, null), 3);
        if (savedInstanceState == null) {
            g viewModel = getViewModel();
            UpgraderExtras upgraderExtras3 = this.upgraderExtras;
            if (upgraderExtras3 == null) {
                upgraderExtras3 = null;
            }
            viewModel.getClass();
            tje.N(ds31.a(viewModel), null, null, new AccountUpgraderViewModel$start$1(viewModel, upgraderExtras3, null), 3);
        }
    }
}
