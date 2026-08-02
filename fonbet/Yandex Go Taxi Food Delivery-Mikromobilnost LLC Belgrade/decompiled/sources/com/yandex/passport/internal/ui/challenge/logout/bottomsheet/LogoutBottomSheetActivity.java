package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.report.w7;
import com.yandex.passport.internal.report.x7;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.challenge.delete.DeleteAccountActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.challenge.logout.LogoutActivity;
import com.yandex.passport.internal.ui.challenge.logout.LogoutBehaviour;
import com.yandex.passport.internal.ui.challenge.logout.LogoutComposeActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.b2x0;
import defpackage.ceu0;
import defpackage.d6z;
import defpackage.ds31;
import defpackage.eja1;
import defpackage.es31;
import defpackage.i3y;
import defpackage.ins0;
import defpackage.jl40;
import defpackage.li91;
import defpackage.m50;
import defpackage.mkn;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.v40;
import defpackage.x40;
import defpackage.y8f;
import defpackage.yv5;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0003TUEB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0003J\u0013\u0010$\u001a\u00020#*\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R#\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020@0?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00106\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR,\u0010O\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020J0N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010P¨\u0006V"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/LogoutBottomSheetActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "recreate", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "Lcom/yandex/passport/api/r0;", TarifficatorScenarioActivity.RESULT_KEY, "deleteCallback", "(Lcom/yandex/passport/api/r0;)V", "Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/v0;", "buttonsState", "showButtons", "(Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/v0;)V", ClidProvider.STATE, "Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/n0;", "buildData", "(Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/v0;)Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/n0;", "Lcom/yandex/passport/internal/properties/PassportLogoutPropertiesImpl;", "properties", "Lcom/yandex/passport/internal/ui/challenge/logout/LogoutBehaviour;", "behaviour", "logout", "(Lcom/yandex/passport/internal/properties/PassportLogoutPropertiesImpl;Lcom/yandex/passport/internal/ui/challenge/logout/LogoutBehaviour;)V", "delete", "(Lcom/yandex/passport/internal/properties/PassportLogoutPropertiesImpl;)V", "collapseBottomSheet", "Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/o0;", "toLogoutBottomSheetParameters", "(Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/v0;)Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/o0;", "Lcom/yandex/passport/internal/flags/j;", "flagRepository", "Lcom/yandex/passport/internal/flags/j;", "getFlagRepository", "()Lcom/yandex/passport/internal/flags/j;", "setFlagRepository", "(Lcom/yandex/passport/internal/flags/j;)V", "Lcom/yandex/passport/internal/report/reporters/f0;", "logoutReporter", "Lcom/yandex/passport/internal/report/reporters/f0;", "getLogoutReporter", "()Lcom/yandex/passport/internal/report/reporters/f0;", "setLogoutReporter", "(Lcom/yandex/passport/internal/report/reporters/f0;)V", "Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/x0;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/x0;", "viewModel", "Lcom/yandex/passport/internal/ui/bouncer/roundabout/m;", "ui$delegate", "getUi", "()Lcom/yandex/passport/internal/ui/bouncer/roundabout/m;", "ui", "Lins0;", "Landroid/view/ViewGroup;", "innerSlab$delegate", "getInnerSlab", "()Lins0;", "innerSlab", "Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/h;", "bottomSheetCallback$delegate", "getBottomSheetCallback", "()Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/h;", "bottomSheetCallback", "", "isGoingToRecreate", "Z", "Lm50;", "Lkotlin/Triple;", "launcher", "Lm50;", "Lcom/yandex/passport/internal/properties/PassportDeleteAccountPropertiesImpl;", "deleteLauncher", "deleteComposeLauncher", "a", "b", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutBottomSheetActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: bottomSheetCallback$delegate, reason: from kotlin metadata */
    private final i3y bottomSheetCallback;
    private final m50 deleteComposeLauncher;
    private final m50 deleteLauncher;
    public com.yandex.passport.internal.flags.j flagRepository;

    /* renamed from: innerSlab$delegate, reason: from kotlin metadata */
    private final i3y innerSlab;
    private boolean isGoingToRecreate;
    private final m50 launcher;
    public com.yandex.passport.internal.report.reporters.f0 logoutReporter;

    /* renamed from: ui$delegate, reason: from kotlin metadata */
    private final i3y ui;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            Triple triple = (Triple) obj;
            if (((Boolean) triple.h()).booleanValue()) {
                com.yandex.passport.internal.ui.challenge.logout.g gVar = LogoutComposeActivity.Companion;
                PassportLogoutPropertiesImpl passportLogoutPropertiesImpl = (PassportLogoutPropertiesImpl) triple.f();
                LogoutBehaviour logoutBehaviour = (LogoutBehaviour) triple.g();
                gVar.getClass();
                return com.yandex.passport.internal.ui.challenge.logout.g.a(context, passportLogoutPropertiesImpl, logoutBehaviour);
            }
            com.yandex.passport.internal.ui.challenge.logout.a aVar = LogoutActivity.Companion;
            PassportLogoutPropertiesImpl passportLogoutPropertiesImpl2 = (PassportLogoutPropertiesImpl) triple.f();
            LogoutBehaviour logoutBehaviour2 = (LogoutBehaviour) triple.g();
            aVar.getClass();
            return com.yandex.passport.internal.ui.challenge.logout.a.a(context, passportLogoutPropertiesImpl2, logoutBehaviour2);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return Integer.valueOf(i);
        }
    }

    public static final class b extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            DeleteForeverActivity.Companion.getClass();
            Bundle[] bundleArr = {((PassportDeleteAccountPropertiesImpl) obj).toBundle()};
            Bundle bundle = new Bundle();
            bundle.putAll(bundleArr[0]);
            return d6z.B(context, DeleteForeverActivity.class, bundle);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return com.yandex.passport.api.r.f(i, intent);
        }
    }

    public LogoutBottomSheetActivity() {
        int i = 1;
        this.viewModel = new es31(qoi0.a(x0.class), new sls(this) { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetActivity$special$$inlined$viewModels$default$2
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
        }, new y0(i), new sls(this) { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetActivity$special$$inlined$viewModels$default$3
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
        int i2 = 0;
        this.ui = kotlin.a.a(new f(this, i2));
        this.innerSlab = kotlin.a.a(new f(this, i));
        int i3 = 2;
        this.bottomSheetCallback = kotlin.a.a(new f(this, i3));
        this.launcher = registerForActivityResult(new a(), new i(this, i3));
        this.deleteLauncher = registerForActivityResult(new b(), new i(this, i));
        this.deleteComposeLauncher = registerForActivityResult(new DeleteAccountActivity.a(), new i(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h bottomSheetCallback_delegate$lambda$3(LogoutBottomSheetActivity logoutBottomSheetActivity) {
        return new h(logoutBottomSheetActivity.getViewModel());
    }

    private final n0 buildData(v0 state) {
        int i = 3;
        return new n0(state.a, state.f, state.c, state.d, state.e, new g(this, state, 0), new g(this, state, 1), new g(this, state, 2), new g(this, state, i), new f(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 buildData$lambda$11(LogoutBottomSheetActivity logoutBottomSheetActivity, v0 v0Var) {
        logoutBottomSheetActivity.getViewModel().X(LogoutBottomsheetWish.LOGOUT_THIS_APP);
        com.yandex.passport.internal.report.reporters.f0 logoutReporter = logoutBottomSheetActivity.getLogoutReporter();
        Uid uid = v0Var.a;
        Uid uid2 = v0Var.b;
        List list = v0Var.f;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.yandex.passport.internal.entities.k) it.next()).a);
        }
        ((com.yandex.passport.internal.report.reporters.g0) logoutReporter).k(uid, uid2, arrayList);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 buildData$lambda$13(LogoutBottomSheetActivity logoutBottomSheetActivity, v0 v0Var) {
        logoutBottomSheetActivity.getViewModel().X(LogoutBottomsheetWish.LOGOUT_ALL_APPS);
        com.yandex.passport.internal.report.reporters.f0 logoutReporter = logoutBottomSheetActivity.getLogoutReporter();
        Uid uid = v0Var.a;
        Uid uid2 = v0Var.b;
        List list = v0Var.f;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.yandex.passport.internal.entities.k) it.next()).a);
        }
        ((com.yandex.passport.internal.report.reporters.g0) logoutReporter).j(uid, uid2, arrayList);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 buildData$lambda$14(LogoutBottomSheetActivity logoutBottomSheetActivity, v0 v0Var) {
        logoutBottomSheetActivity.getViewModel().X(LogoutBottomsheetWish.DELETE_ACCOUNT);
        com.yandex.passport.internal.report.reporters.f0 logoutReporter = logoutBottomSheetActivity.getLogoutReporter();
        Uid uid = v0Var.a;
        com.yandex.passport.internal.report.reporters.g0 g0Var = (com.yandex.passport.internal.report.reporters.g0) logoutReporter;
        g0Var.getClass();
        g0Var.f(w7.w, new yd(uid));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 buildData$lambda$15(LogoutBottomSheetActivity logoutBottomSheetActivity) {
        logoutBottomSheetActivity.getViewModel().X(LogoutBottomsheetWish.CANCEL);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 buildData$lambda$9(LogoutBottomSheetActivity logoutBottomSheetActivity, v0 v0Var) {
        com.yandex.passport.internal.report.reporters.f0 logoutReporter = logoutBottomSheetActivity.getLogoutReporter();
        Uid uid = v0Var.a;
        com.yandex.passport.internal.report.reporters.g0 g0Var = (com.yandex.passport.internal.report.reporters.g0) logoutReporter;
        g0Var.getClass();
        g0Var.f(x7.w, new yd(uid));
        return zy11.a;
    }

    private final void collapseBottomSheet() {
        BottomSheetBehavior bottomSheetBehavior = getUi().w;
        bottomSheetBehavior.M(getBottomSheetCallback());
        bottomSheetBehavior.W(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delete(PassportLogoutPropertiesImpl properties) {
        (((Boolean) getFlagRepository().b(com.yandex.passport.internal.flags.q.Y)).booleanValue() ? this.deleteComposeLauncher : this.deleteLauncher).a(new PassportDeleteAccountPropertiesImpl(properties.getUid(), properties.getProgressProperties(), properties.getTheme(), properties.getHeaders()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteCallback(com.yandex.passport.api.r0 result) {
        if (jl40.l(result, com.yandex.passport.api.p0.a)) {
            return;
        }
        com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.c.C(result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h getBottomSheetCallback() {
        return (h) this.bottomSheetCallback.getValue();
    }

    private final ins0 getInnerSlab() {
        return (ins0) this.innerSlab.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.passport.internal.ui.bouncer.roundabout.m getUi() {
        return (com.yandex.passport.internal.ui.bouncer.roundabout.m) this.ui.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0 getViewModel() {
        return (x0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ins0 innerSlab_delegate$lambda$2(LogoutBottomSheetActivity logoutBottomSheetActivity) {
        if (!((Boolean) logoutBottomSheetActivity.getFlagRepository().b(com.yandex.passport.internal.flags.q.T)).booleanValue()) {
            return new f1(new q1(logoutBottomSheetActivity));
        }
        return new com.yandex.passport.internal.ui.common.b(new ComposeView(logoutBottomSheetActivity, null, 0, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logout(PassportLogoutPropertiesImpl properties, LogoutBehaviour behaviour) {
        collapseBottomSheet();
        m50 m50Var = this.launcher;
        Boolean bool = (Boolean) getFlagRepository().b(com.yandex.passport.internal.flags.q.U);
        bool.getClass();
        m50Var.a(new Triple(properties, behaviour, bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showButtons(v0 buttonsState) {
        if (((Boolean) getFlagRepository().b(com.yandex.passport.internal.flags.q.T)).booleanValue()) {
            ins0 innerSlab = getInnerSlab();
            com.yandex.passport.internal.ui.common.b bVar = innerSlab instanceof com.yandex.passport.internal.ui.common.b ? (com.yandex.passport.internal.ui.common.b) innerSlab : null;
            if (bVar != null) {
                bVar.D.setContent(new androidx.compose.runtime.internal.a(344971532, new com.yandex.passport.internal.ui.common.a(new androidx.compose.runtime.internal.a(1548159984, new k(this, buttonsState), true), 1), true));
            }
        } else {
            v40 innerSlab2 = getInnerSlab();
            yv5 yv5Var = innerSlab2 instanceof yv5 ? (yv5) innerSlab2 : null;
            if (yv5Var != null) {
                yv5Var.c(buildData(buttonsState));
            }
        }
        tje.N(eja1.s(this), null, null, new LogoutBottomSheetActivity$showButtons$2(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0 toLogoutBottomSheetParameters(v0 v0Var) {
        return new o0(v0Var.a, v0Var.b, v0Var.c, v0Var.d, v0Var.e, v0Var.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.yandex.passport.internal.ui.bouncer.roundabout.m ui_delegate$lambda$1(LogoutBottomSheetActivity logoutBottomSheetActivity) {
        return new com.yandex.passport.internal.ui.bouncer.roundabout.m(logoutBottomSheetActivity);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        com.yandex.passport.internal.helper.g localeHelper = com.yandex.passport.internal.di.a.a().getLocaleHelper();
        super.attachBaseContext(localeHelper.b(newBase));
        localeHelper.b(this);
    }

    public final com.yandex.passport.internal.flags.j getFlagRepository() {
        com.yandex.passport.internal.flags.j jVar = this.flagRepository;
        if (jVar != null) {
            return jVar;
        }
        return null;
    }

    public final com.yandex.passport.internal.report.reporters.f0 getLogoutReporter() {
        com.yandex.passport.internal.report.reporters.f0 f0Var = this.logoutReporter;
        if (f0Var != null) {
            return f0Var;
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        mkn.a(this, new b2x0(0, 0, 2, new ceu0(7)), new b2x0(0, 0, 0, new ceu0(8)));
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            com.yandex.passport.internal.ui.c.j(this, new IllegalArgumentException("LogoutProperties is missing in intent"));
            return;
        }
        PassportLogoutPropertiesImpl.Companion.getClass();
        PassportLogoutPropertiesImpl a2 = com.yandex.passport.internal.properties.l.a(extras);
        com.yandex.passport.internal.di.a.a().createLogoutBottomSheetActivityComponent().build().inject(this);
        PassportTheme theme = a2.getTheme();
        GlobalRouterActivity.Companion.getClass();
        int c = com.yandex.passport.internal.ui.router.c.c(theme);
        if (c != getDelegate().getLocalNightMode()) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Setting theme to " + theme + " with nightMode=" + c + ", was " + getDelegate().getLocalNightMode(), 8);
            }
            getDelegate().setLocalNightMode(c);
        }
        super.onCreate(savedInstanceState);
        if (isFinishing() || isChangingConfigurations() || this.isGoingToRecreate) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.isGoingToRecreate, 8);
            }
            tje.N(eja1.s(this), null, null, new LogoutBottomSheetActivity$onCreate$3(this, null), 3);
        }
        setContentView(getUi().getRoot());
        getUi().c.b(getInnerSlab());
        x0 viewModel = getViewModel();
        viewModel.z = a2;
        tje.N(ds31.a(viewModel), null, null, new LogoutBottomsheetViewModel$start$1(viewModel, a2, null), 3);
        tje.N(eja1.s(this), null, null, new LogoutBottomSheetActivity$onCreate$$inlined$collectOn$1(getViewModel().y, null, this), 3);
        tje.N(eja1.s(this), null, null, new LogoutBottomSheetActivity$onCreate$5(this, null), 3);
        li91.e(new LogoutBottomSheetActivity$onCreate$6(this, null), getUi().getRoot());
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

    public final void setFlagRepository(com.yandex.passport.internal.flags.j jVar) {
        this.flagRepository = jVar;
    }

    public final void setLogoutReporter(com.yandex.passport.internal.report.reporters.f0 f0Var) {
        this.logoutReporter = f0Var;
    }
}
