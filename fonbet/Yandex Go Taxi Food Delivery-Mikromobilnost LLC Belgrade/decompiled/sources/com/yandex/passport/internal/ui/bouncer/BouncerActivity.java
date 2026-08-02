package com.yandex.passport.internal.ui.bouncer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.experiments.ExperimentsUpdater$LoadingStrategy;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.i4;
import com.yandex.passport.internal.report.j4;
import com.yandex.passport.internal.report.k4;
import com.yandex.passport.internal.report.q4;
import com.yandex.passport.internal.report.zd;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import defpackage.b2x0;
import defpackage.ceu0;
import defpackage.d6z;
import defpackage.eja1;
import defpackage.es31;
import defpackage.i3y;
import defpackage.kil;
import defpackage.mkn;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tje;
import defpackage.w511;
import defpackage.x40;
import defpackage.y8f;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/BouncerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "recreate", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "globalComponent", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "Lcom/yandex/passport/internal/ui/bouncer/c;", "component", "Lcom/yandex/passport/internal/ui/bouncer/c;", "", "isGoingToRecreate", "Z", "Lcom/yandex/passport/internal/ui/bouncer/BouncerActivityTwm;", "twm$delegate", "Li3y;", "getTwm", "()Lcom/yandex/passport/internal/ui/bouncer/BouncerActivityTwm;", "twm", "Companion", "a", "com/yandex/passport/internal/ui/bouncer/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BouncerActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public static final com.yandex.passport.internal.ui.bouncer.a Companion = new com.yandex.passport.internal.ui.bouncer.a();
    private c component;
    private PassportProcessGlobalComponent globalComponent;
    private boolean isGoingToRecreate;

    /* renamed from: twm$delegate, reason: from kotlin metadata */
    private final i3y twm = new es31(qoi0.a(BouncerActivityTwm.class), new sls(this) { // from class: com.yandex.passport.internal.ui.bouncer.BouncerActivity$special$$inlined$viewModels$default$2
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.bouncer.BouncerActivity$special$$inlined$viewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.bouncer.BouncerActivity$special$$inlined$viewModels$default$3
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

    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            BouncerActivity.Companion.getClass();
            Bundle[] bundleArr = {((LoginProperties) obj).toBundle()};
            Bundle bundle = new Bundle();
            bundle.putAll(bundleArr[0]);
            return d6z.B(context, BouncerActivity.class, bundle);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return com.yandex.passport.api.r.d(i, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BouncerActivityTwm getTwm() {
        return (BouncerActivityTwm) this.twm.getValue();
    }

    private static final zy11 onDestroy$lambda$6(BouncerActivity bouncerActivity, zd zdVar) {
        PassportProcessGlobalComponent passportProcessGlobalComponent = bouncerActivity.globalComponent;
        if (passportProcessGlobalComponent == null) {
            passportProcessGlobalComponent = null;
        }
        com.yandex.passport.internal.report.reporters.n bouncerReporter = passportProcessGlobalComponent.getBouncerReporter();
        LinkedHashMap b = zdVar.b();
        ArrayList a2 = zdVar.a();
        Map c = zdVar.c();
        bouncerReporter.getClass();
        bouncerReporter.b(q4.w, kotlin.collections.b.n(kotlin.collections.b.i(new Pair("last_events", b), new Pair("all_events", a2)), c));
        return zy11.a;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        com.yandex.passport.internal.helper.g localeHelper = com.yandex.passport.internal.di.a.a().getLocaleHelper();
        super.attachBaseContext(localeHelper.b(newBase));
        localeHelper.b(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        LoginProperties a2;
        int i = 0;
        mkn.a(this, new b2x0(0, 0, 0, new ceu0(8)), new b2x0(0, 0, 1, new ceu0(6)));
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onCreate(savedInstanceState=" + savedInstanceState + ')', 8);
        }
        PassportProcessGlobalComponent a3 = com.yandex.passport.internal.di.a.a();
        this.globalComponent = a3;
        com.yandex.passport.internal.report.reporters.n bouncerReporter = a3.getBouncerReporter();
        bouncerReporter.getClass();
        bouncerReporter.h(i4.w);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            LoginProperties.Companion.getClass();
            a2 = com.yandex.passport.internal.properties.i.a(extras);
        } else {
            Toast.makeText(this, "Internal error", 0).show();
            finish();
            a2 = new LoginProperties.a().a();
        }
        int i2 = b.a[a2.getLockScreenOrientation().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = 1;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return;
                }
                i = -1;
            }
        }
        setRequestedOrientation(i);
        PassportTheme theme = a2.getTheme();
        GlobalRouterActivity.Companion.getClass();
        int c = com.yandex.passport.internal.ui.router.c.c(theme);
        if (c != getDelegate().getLocalNightMode()) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Setting theme to " + theme + " with nightMode=" + c + ", was " + getDelegate().getLocalNightMode(), 8);
            }
            getDelegate().setLocalNightMode(c);
        }
        setTheme(com.yandex.passport.internal.ui.util.o.f(theme, this));
        super.onCreate(savedInstanceState);
        if (isFinishing() || isChangingConfigurations() || this.isGoingToRecreate) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.isGoingToRecreate, 8);
            }
            tje.N(eja1.s(this), null, null, new BouncerActivity$onCreate$4(this, null), 3);
            return;
        }
        if (savedInstanceState == null) {
            zd zdVar = getTwm().c;
            zdVar.d();
            zdVar.a = SystemClock.elapsedRealtime();
        }
        zd zdVar2 = getTwm().c;
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.globalComponent;
        if (passportProcessGlobalComponent == null) {
            passportProcessGlobalComponent = null;
        }
        passportProcessGlobalComponent.getProperties();
        d dVar = new d(this, zdVar2, a2, a2.getVisualProperties().getProgressProperties());
        PassportProcessGlobalComponent passportProcessGlobalComponent2 = this.globalComponent;
        if (passportProcessGlobalComponent2 == null) {
            passportProcessGlobalComponent2 = null;
        }
        com.yandex.passport.internal.flags.experiments.q experimentsUpdater = passportProcessGlobalComponent2.getExperimentsUpdater();
        ExperimentsUpdater$LoadingStrategy experimentsUpdater$LoadingStrategy = ExperimentsUpdater$LoadingStrategy.DAILY;
        int i3 = com.yandex.passport.internal.flags.experiments.q.h;
        experimentsUpdater.a(experimentsUpdater$LoadingStrategy, Environment.PRODUCTION);
        tje.N(eja1.s(this), null, null, new BouncerActivity$onCreate$5(this, dVar, null), 3);
        PassportProcessGlobalComponent passportProcessGlobalComponent3 = this.globalComponent;
        if (passportProcessGlobalComponent3 == null) {
            passportProcessGlobalComponent3 = null;
        }
        this.component = passportProcessGlobalComponent3.createLoginActivityComponent(dVar);
        getOnBackPressedDispatcher().a(this, new kil(this, a2));
        c cVar2 = this.component;
        if (cVar2 == null) {
            cVar2 = null;
        }
        setContentView(cVar2.getBouncerRenderer().getTheRootView());
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Binding to mvi cycle", 8);
        }
        tje.N(eja1.s(this), null, null, new BouncerActivity$onCreate$7(this, null), 3);
        tje.N(eja1.s(this), null, null, new BouncerActivity$onCreate$8$1(savedInstanceState, a2, this, null), 3);
        PassportProcessGlobalComponent passportProcessGlobalComponent4 = this.globalComponent;
        if (passportProcessGlobalComponent4 == null) {
            passportProcessGlobalComponent4 = null;
        }
        passportProcessGlobalComponent4.getCredentialManagerInterface().d(this);
        PassportProcessGlobalComponent passportProcessGlobalComponent5 = this.globalComponent;
        (passportProcessGlobalComponent5 != null ? passportProcessGlobalComponent5 : null).getWebAuthN().c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        c cVar = this.component;
        if (cVar != null) {
            cVar.getBouncerRenderer().onDestroy();
        }
        if (isFinishing()) {
            zd zdVar = getTwm().c;
            if (!zdVar.b.isEmpty()) {
                onDestroy$lambda$6(this, zdVar);
            }
            zdVar.d();
        }
        super.onDestroy();
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onDestroy()", 8);
        }
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.globalComponent;
        com.yandex.passport.internal.report.reporters.n bouncerReporter = (passportProcessGlobalComponent != null ? passportProcessGlobalComponent : null).getBouncerReporter();
        bouncerReporter.getClass();
        bouncerReporter.h(j4.w);
    }

    @Override // android.app.Activity
    public void recreate() {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isGoingToRecreate = true", 8);
        }
        this.isGoingToRecreate = true;
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.globalComponent;
        com.yandex.passport.internal.report.reporters.n bouncerReporter = (passportProcessGlobalComponent != null ? passportProcessGlobalComponent : null).getBouncerReporter();
        bouncerReporter.getClass();
        bouncerReporter.h(k4.w);
        super.recreate();
    }
}
