package com.yandex.passport.internal.ui.sloth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.api.exception.PassportHostProcessedException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.ob;
import com.yandex.passport.internal.report.reporters.x0;
import com.yandex.passport.internal.report.zd;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.SlothTheme;
import com.yandex.passport.sloth.m0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.b2x0;
import defpackage.bvf0;
import defpackage.ceu0;
import defpackage.d6z;
import defpackage.eja1;
import defpackage.es31;
import defpackage.i3y;
import defpackage.l8x;
import defpackage.mkn;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.t40;
import defpackage.tje;
import defpackage.x40;
import defpackage.y8f;
import defpackage.yyj0;
import defpackage.zy11;
import defpackage.zyj0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/StandaloneSlothActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Ll8x;", "bind", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yandex/passport/sloth/m0;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "processResult", "(Lcom/yandex/passport/sloth/m0;)V", "Lcom/yandex/passport/sloth/m;", "processError", "(Lcom/yandex/passport/sloth/m;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "recreate", "onDestroy", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "globalComponent", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "Lcom/yandex/passport/internal/ui/sloth/r;", "component", "Lcom/yandex/passport/internal/ui/sloth/r;", "Lcom/yandex/passport/internal/ui/sloth/d0;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/ui/sloth/d0;", "viewModel", "", "isGoingToRecreate", "Z", "a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StandaloneSlothActivity extends AppCompatActivity {
    public static final int $stable = 8;
    private r component;
    private PassportProcessGlobalComponent globalComponent;
    private boolean isGoingToRecreate;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(d0.class), new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.StandaloneSlothActivity$special$$inlined$viewModels$default$2
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.StandaloneSlothActivity$special$$inlined$viewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.StandaloneSlothActivity$special$$inlined$viewModels$default$3
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
            Bundle[] bundleArr = {((SlothParams) obj).toBundle()};
            Bundle bundle = new Bundle();
            bundle.putAll(bundleArr[0]);
            return d6z.B(context, StandaloneSlothActivity.class, bundle);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return new t40(i != -1 ? i != 0 ? new zyj0(i) : yyj0.b : yyj0.c, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bind(Continuation<? super l8x> continuation) {
        return bvf0.n(new StandaloneSlothActivity$bind$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 getViewModel() {
        return (d0) this.viewModel.getValue();
    }

    private static final zy11 onDestroy$lambda$3(StandaloneSlothActivity standaloneSlothActivity, zd zdVar) {
        PassportProcessGlobalComponent passportProcessGlobalComponent = standaloneSlothActivity.globalComponent;
        if (passportProcessGlobalComponent == null) {
            passportProcessGlobalComponent = null;
        }
        x0 standaloneReporter = passportProcessGlobalComponent.getStandaloneReporter();
        LinkedHashMap b = zdVar.b();
        ArrayList a2 = zdVar.a();
        Map c = zdVar.c();
        standaloneReporter.getClass();
        standaloneReporter.b(ob.w, kotlin.collections.b.n(kotlin.collections.b.i(new Pair("last_events", b), new Pair("all_events", a2)), c));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processError(com.yandex.passport.sloth.m result) {
        com.yandex.passport.api.exception.b bVar = PassportHostProcessedException.Companion;
        List list = result.a;
        bVar.getClass();
        com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.c.B(new com.yandex.passport.api.s(com.yandex.passport.api.exception.b.a(list))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processResult(m0 result) {
        com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.c.B(com.yandex.passport.internal.properties.u.H(result)));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Bundle extras;
        SlothTheme slothTheme;
        int i = 8;
        mkn.a(this, new b2x0(0, 0, 0, new ceu0(i)), new b2x0(0, 0, 0, new ceu0(i)));
        if (savedInstanceState == null) {
            zd zdVar = getViewModel().c;
            zdVar.d();
            zdVar.a = SystemClock.elapsedRealtime();
        }
        PassportProcessGlobalComponent a2 = com.yandex.passport.internal.di.a.a();
        this.globalComponent = a2;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            ny61.r("no extras data");
            return;
        }
        r createStandaloneSlothComponent = a2.createStandaloneSlothComponent(new x(this, extras));
        this.component = createStandaloneSlothComponent;
        if (createStandaloneSlothComponent == null) {
            createStandaloneSlothComponent = null;
        }
        Object variant = createStandaloneSlothComponent.getParams().getVariant();
        com.yandex.passport.sloth.data.e eVar = variant instanceof com.yandex.passport.sloth.data.e ? (com.yandex.passport.sloth.data.e) variant : null;
        if (eVar == null || (slothTheme = eVar.getTheme()) == null) {
            slothTheme = SlothTheme.FOLLOW_SYSTEM;
        }
        int h = e.h(slothTheme);
        if (h != getDelegate().getLocalNightMode()) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Setting theme to " + slothTheme + " with nightMode=" + h + ", was " + getDelegate().getLocalNightMode(), 8);
            }
            getDelegate().setLocalNightMode(h);
        }
        super.onCreate(savedInstanceState);
        if (isFinishing() || isChangingConfigurations() || this.isGoingToRecreate) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.isGoingToRecreate, 8);
            }
            tje.N(eja1.s(this), null, null, new StandaloneSlothActivity$onCreate$3(this, null), 3);
        }
        r rVar = this.component;
        if (rVar == null) {
            rVar = null;
        }
        setContentView(rVar.getUi().getRoot());
        tje.N(eja1.s(this), null, null, new StandaloneSlothActivity$onCreate$4(this, null), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            zd zdVar = getViewModel().c;
            if (!zdVar.b.isEmpty()) {
                onDestroy$lambda$3(this, zdVar);
            }
            zdVar.d();
        }
        super.onDestroy();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onDestroy()", 8);
        }
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
