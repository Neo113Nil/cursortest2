package com.yandex.passport.internal.ui.sloth.plusdevices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.passport.R;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.e8;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.sloth.data.SlothTheme;
import defpackage.b2x0;
import defpackage.bvf0;
import defpackage.ceu0;
import defpackage.eja1;
import defpackage.es31;
import defpackage.i3y;
import defpackage.l8x;
import defpackage.mkn;
import defpackage.n751;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tje;
import defpackage.u1w;
import defpackage.y8f;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/plusdevices/ManagingPlusDevicesSlothActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Ll8x;", "bind", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "recreate", "onDestroy", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "globalComponent", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "Lcom/yandex/passport/internal/ui/sloth/r;", "component", "Lcom/yandex/passport/internal/ui/sloth/r;", "Lcom/yandex/passport/internal/report/reporters/h0;", "reporter", "Lcom/yandex/passport/internal/report/reporters/h0;", "Lcom/yandex/passport/sloth/data/q;", "properties", "Lcom/yandex/passport/sloth/data/q;", "Lcom/yandex/passport/internal/ui/sloth/plusdevices/v;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/ui/sloth/plusdevices/v;", "viewModel", "", "isGoingToRecreate", "Z", "Companion", "com/yandex/passport/internal/ui/sloth/plusdevices/t", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ManagingPlusDevicesSlothActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public static final t Companion = new t();
    public static final int RESULT_INVALID_TOKEN = 401;
    public static final int RESULT_UNEXPECTED_ERROR = 1112;
    private com.yandex.passport.internal.ui.sloth.r component;
    private PassportProcessGlobalComponent globalComponent;
    private boolean isGoingToRecreate;
    private com.yandex.passport.sloth.data.q properties;
    private com.yandex.passport.internal.report.reporters.h0 reporter;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(v.class), new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity$special$$inlined$viewModels$default$2
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity$special$$inlined$viewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity$special$$inlined$viewModels$default$3
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
    public final Object bind(Continuation<? super l8x> continuation) {
        return bvf0.n(new ManagingPlusDevicesSlothActivity$bind$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v getViewModel() {
        return (v) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 onCreate$lambda$2(ManagingPlusDevicesSlothActivity managingPlusDevicesSlothActivity, View view, n751 n751Var) {
        u1w g = n751Var.a.g(647);
        view.setBackgroundColor(managingPlusDevicesSlothActivity.getColor(R.color.passport_roundabout_background));
        view.setPadding(g.a, g.b, g.c, g.d);
        return n751.b;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Bundle extras;
        SlothTheme slothTheme;
        int i = 8;
        mkn.a(this, new b2x0(0, 0, 0, new ceu0(i)), new b2x0(0, 0, 0, new ceu0(i)));
        super.onCreate(savedInstanceState);
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.globalComponent = a;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            ny61.r("no extras data");
            return;
        }
        com.yandex.passport.internal.ui.sloth.r createStandaloneSlothComponent = a.createStandaloneSlothComponent(new com.yandex.passport.internal.ui.sloth.x(this, extras));
        this.component = createStandaloneSlothComponent;
        if (createStandaloneSlothComponent == null) {
            createStandaloneSlothComponent = null;
        }
        com.yandex.passport.sloth.data.c0 variant = createStandaloneSlothComponent.getParams().getVariant();
        com.yandex.passport.sloth.data.q qVar = variant instanceof com.yandex.passport.sloth.data.q ? (com.yandex.passport.sloth.data.q) variant : null;
        if (qVar == null || (slothTheme = qVar.c) == null) {
            slothTheme = SlothTheme.FOLLOW_SYSTEM;
        }
        int h = com.yandex.passport.internal.ui.sloth.e.h(slothTheme);
        if (h != getDelegate().getLocalNightMode()) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Setting theme to " + slothTheme + " with nightMode=" + h + ", was " + getDelegate().getLocalNightMode(), 8);
            }
            getDelegate().setLocalNightMode(h);
        }
        if (isFinishing() || isChangingConfigurations() || this.isGoingToRecreate) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.isGoingToRecreate, 8);
            }
            tje.N(eja1.s(this), null, null, new ManagingPlusDevicesSlothActivity$onCreate$3(this, null), 3);
            return;
        }
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.globalComponent;
        if (passportProcessGlobalComponent == null) {
            passportProcessGlobalComponent = null;
        }
        this.reporter = passportProcessGlobalComponent.getManagingPlusDevicesReporter();
        com.yandex.passport.internal.ui.sloth.r rVar = this.component;
        if (rVar == null) {
            rVar = null;
        }
        com.yandex.passport.sloth.data.c0 variant2 = rVar.getParams().getVariant();
        this.properties = variant2 instanceof com.yandex.passport.sloth.data.q ? (com.yandex.passport.sloth.data.q) variant2 : null;
        com.yandex.passport.internal.ui.sloth.r rVar2 = this.component;
        if (rVar2 == null) {
            rVar2 = null;
        }
        setContentView(rVar2.getUi().getRoot());
        View decorView = getWindow().getDecorView();
        com.yandex.passport.internal.ui.a aVar = new com.yandex.passport.internal.ui.a(12, this);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(decorView, aVar);
        com.yandex.passport.internal.report.reporters.h0 h0Var = this.reporter;
        if (h0Var == null) {
            h0Var = null;
        }
        com.yandex.passport.sloth.data.q qVar2 = this.properties;
        String str = qVar2 != null ? qVar2.w : null;
        String str2 = qVar2 != null ? qVar2.x : null;
        Uid uid = qVar2 != null ? qVar2.a : null;
        h0Var.getClass();
        h0Var.f(e8.w, new jd(uid != null ? Long.valueOf(uid.getValue()) : null), new md(str, 20), new com.yandex.passport.internal.report.a(str2, 11));
        tje.N(eja1.s(this), null, null, new ManagingPlusDevicesSlothActivity$onCreate$5(this, null), 3);
        tje.N(eja1.s(this), null, null, new ManagingPlusDevicesSlothActivity$onCreate$6(this, null), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.yandex.passport.internal.report.reporters.h0 h0Var = this.reporter;
        if (h0Var != null) {
            if (h0Var == null) {
                h0Var = null;
            }
            com.yandex.passport.sloth.data.q qVar = this.properties;
            h0Var.j(qVar != null ? qVar.a : null, qVar != null ? qVar.w : null, qVar != null ? qVar.x : null, null);
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
