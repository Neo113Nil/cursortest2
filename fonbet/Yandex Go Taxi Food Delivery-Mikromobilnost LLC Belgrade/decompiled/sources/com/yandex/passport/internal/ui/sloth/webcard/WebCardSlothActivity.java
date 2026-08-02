package com.yandex.passport.internal.ui.sloth.webcard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.exception.PassportHostProcessedException;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.rc;
import com.yandex.passport.internal.report.reporters.k1;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.d6z;
import defpackage.eja1;
import defpackage.es31;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.mkn;
import defpackage.n751;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tje;
import defpackage.u1w;
import defpackage.x40;
import defpackage.y8f;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/webcard/WebCardSlothActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lzy11;", "bind", "Lcom/yandex/passport/sloth/m;", TarifficatorScenarioActivity.RESULT_KEY, "processError", "(Lcom/yandex/passport/sloth/m;)V", "Lkotlin/Result;", "Lcom/yandex/passport/internal/ui/f;", "beginChangePassword", "(Ljava/lang/Object;)V", "errorAlert", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "recreate", "onDestroy", "Lcom/yandex/passport/internal/ui/sloth/webcard/k0;", "inputParams$delegate", "Li3y;", "getInputParams", "()Lcom/yandex/passport/internal/ui/sloth/webcard/k0;", "inputParams", "Lcom/yandex/passport/internal/ui/sloth/webcard/s0;", "component$delegate", "getComponent", "()Lcom/yandex/passport/internal/ui/sloth/webcard/s0;", "component", "", "isGoingToRecreate", "Z", "Lcom/yandex/passport/internal/ui/sloth/webcard/d1;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/passport/internal/ui/sloth/webcard/d1;", "viewModel", "a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebCardSlothActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: component$delegate, reason: from kotlin metadata */
    private final i3y component;

    /* renamed from: inputParams$delegate, reason: from kotlin metadata */
    private final i3y inputParams;
    private boolean isGoingToRecreate;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            Bundle[] bundleArr = {((SlothParams) obj).toBundle()};
            Bundle bundle = new Bundle();
            bundle.putAll(bundleArr[0]);
            return d6z.B(context, WebCardSlothActivity.class, bundle);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return v.b(i, intent);
        }
    }

    public WebCardSlothActivity() {
        final int i = 0;
        this.inputParams = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.webcard.r0
            public final /* synthetic */ WebCardSlothActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                k0 inputParams_delegate$lambda$0;
                s0 component_delegate$lambda$1;
                hs31 viewModel_delegate$lambda$2;
                int i2 = i;
                WebCardSlothActivity webCardSlothActivity = this.b;
                switch (i2) {
                    case 0:
                        inputParams_delegate$lambda$0 = WebCardSlothActivity.inputParams_delegate$lambda$0(webCardSlothActivity);
                        return inputParams_delegate$lambda$0;
                    case 1:
                        component_delegate$lambda$1 = WebCardSlothActivity.component_delegate$lambda$1(webCardSlothActivity);
                        return component_delegate$lambda$1;
                    default:
                        viewModel_delegate$lambda$2 = WebCardSlothActivity.viewModel_delegate$lambda$2(webCardSlothActivity);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        this.component = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.webcard.r0
            public final /* synthetic */ WebCardSlothActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                k0 inputParams_delegate$lambda$0;
                s0 component_delegate$lambda$1;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i2;
                WebCardSlothActivity webCardSlothActivity = this.b;
                switch (i22) {
                    case 0:
                        inputParams_delegate$lambda$0 = WebCardSlothActivity.inputParams_delegate$lambda$0(webCardSlothActivity);
                        return inputParams_delegate$lambda$0;
                    case 1:
                        component_delegate$lambda$1 = WebCardSlothActivity.component_delegate$lambda$1(webCardSlothActivity);
                        return component_delegate$lambda$1;
                    default:
                        viewModel_delegate$lambda$2 = WebCardSlothActivity.viewModel_delegate$lambda$2(webCardSlothActivity);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i3 = 2;
        this.viewModel = new es31(qoi0.a(d1.class), new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity$special$$inlined$viewModels$default$2
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
        }, new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.webcard.r0
            public final /* synthetic */ WebCardSlothActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                k0 inputParams_delegate$lambda$0;
                s0 component_delegate$lambda$1;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i3;
                WebCardSlothActivity webCardSlothActivity = this.b;
                switch (i22) {
                    case 0:
                        inputParams_delegate$lambda$0 = WebCardSlothActivity.inputParams_delegate$lambda$0(webCardSlothActivity);
                        return inputParams_delegate$lambda$0;
                    case 1:
                        component_delegate$lambda$1 = WebCardSlothActivity.component_delegate$lambda$1(webCardSlothActivity);
                        return component_delegate$lambda$1;
                    default:
                        viewModel_delegate$lambda$2 = WebCardSlothActivity.viewModel_delegate$lambda$2(webCardSlothActivity);
                        return viewModel_delegate$lambda$2;
                }
            }
        }, new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity$special$$inlined$viewModels$default$3
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginChangePassword(Object result) {
        WebCardSlothActivity webCardSlothActivity;
        if (result instanceof Result.Failure) {
            webCardSlothActivity = this;
        } else {
            com.yandex.passport.internal.ui.f fVar = (com.yandex.passport.internal.ui.f) result;
            com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
            PassportEnvironmentImpl y = com.yandex.passport.internal.util.p.y(fVar.c);
            PassportTheme passportTheme = PassportTheme.LIGHT;
            WebCaseType webCaseType = WebCaseType.CHANGE_PASSWORD;
            String str = fVar.a;
            Uri uri = fVar.b;
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putParcelable("return_url", uri);
            webCardSlothActivity = this;
            webCardSlothActivity.startActivity(com.yandex.passport.internal.ui.webview.b.b(bVar, y, webCardSlothActivity, passportTheme, webCaseType, bundle));
            webCardSlothActivity.finish();
        }
        if (Result.a(result) != null) {
            webCardSlothActivity.errorAlert();
        }
    }

    private final void bind() {
        k0 inputParams = getInputParams();
        j0 j0Var = inputParams instanceof j0 ? (j0) inputParams : null;
        int i = 0;
        if ((j0Var != null ? j0Var.a.getVariant() : null) instanceof com.yandex.passport.sloth.data.r) {
            z0 ui = getComponent().getUi();
            ui.getClass();
            ui.c(Float.valueOf(0.0f), 0, 0, 0, WebCardSlothUi$WebCardPosition.Mid, 0L);
            ui.getRoot().setBackgroundColor(ui.c.getColor(R.color.passport_roundabout_background));
        }
        com.yandex.passport.sloth.ui.d0 d0Var = (com.yandex.passport.sloth.ui.d0) getComponent().getUi().w.d.getValue();
        com.yandex.passport.sloth.ui.t0 t0Var = d0Var.F;
        t0Var.d = new com.yandex.passport.sloth.ui.x(d0Var, i);
        t0Var.f(com.yandex.passport.sloth.ui.q0.a, false);
        int i2 = 3;
        kotlinx.coroutines.flow.e.H(eja1.s(this), new jqr(getViewModel().K, new WebCardSlothActivity$bind$1(this, null), i2));
        kotlinx.coroutines.flow.e.H(eja1.s(this), new jqr(getViewModel().E, new WebCardSlothActivity$bind$2(this, null), i2));
        kotlinx.coroutines.flow.e.H(eja1.s(this), new jqr(getViewModel().G, new WebCardSlothActivity$bind$3(this, null), i2));
        kotlinx.coroutines.flow.e.H(eja1.s(this), new jqr(getViewModel().I, new WebCardSlothActivity$bind$4(this, null), i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s0 component_delegate$lambda$1(WebCardSlothActivity webCardSlothActivity) {
        return com.yandex.passport.internal.di.a.a().createWebCardSlothComponent(new t0(webCardSlothActivity, webCardSlothActivity.getInputParams()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void errorAlert() {
        AlertDialog.a aVar = new AlertDialog.a(this);
        aVar.i(R.string.passport_fatal_error_dialog_text);
        aVar.c(R.string.passport_error_unknown);
        aVar.a();
        aVar.setPositiveButton(R.string.passport_fatal_error_dialog_button, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity$errorAlert$lambda$11$$inlined$positiveButton$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WebCardSlothActivity.this.finish();
            }
        });
        aVar.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0 getComponent() {
        return (s0) this.component.getValue();
    }

    private final k0 getInputParams() {
        return (k0) this.inputParams.getValue();
    }

    private final d1 getViewModel() {
        return (d1) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k0 inputParams_delegate$lambda$0(WebCardSlothActivity webCardSlothActivity) {
        Bundle extras = webCardSlothActivity.getIntent().getExtras();
        if (extras == null) {
            ny61.r("no extras data");
            return null;
        }
        if (jl40.l(webCardSlothActivity.getIntent().getAction(), "com.yandex.passport.action.DISPLAY_CODE")) {
            return new i0(extras);
        }
        SlothParams.Companion.getClass();
        return new j0(com.yandex.passport.sloth.data.c.a(extras));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 onCreate$lambda$5(WebCardSlothActivity webCardSlothActivity, View view, n751 n751Var) {
        u1w g = n751Var.a.g(647);
        z0 ui = webCardSlothActivity.getComponent().getUi();
        ui.z = g.b;
        ui.A = g.d;
        View root = ui.d().getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            int i = ui.y.c;
            layoutParams2.topMargin = ui.z + i;
            layoutParams2.bottomMargin = i + ui.A;
            root.setLayoutParams(layoutParams2);
        }
        return n751.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processError(com.yandex.passport.sloth.m result) {
        k1 webCardReporter = getComponent().getWebCardReporter();
        com.yandex.passport.api.exception.b bVar = PassportHostProcessedException.Companion;
        List list = result.a;
        bVar.getClass();
        PassportHostProcessedException a2 = com.yandex.passport.api.exception.b.a(list);
        webCardReporter.getClass();
        webCardReporter.f(rc.w, new yd(a2));
        List list2 = result.a;
        bVar.getClass();
        com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.sloth.e.p(new n0(com.yandex.passport.api.exception.b.a(list2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$2(WebCardSlothActivity webCardSlothActivity) {
        return webCardSlothActivity.getComponent().getViewModelFactory();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        mkn.b(this);
        if (-1 != getDelegate().getLocalNightMode()) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Setting theme to " + getTheme() + " with nightMode=-1, was " + getDelegate().getLocalNightMode(), 8);
            }
            getDelegate().setLocalNightMode(-1);
        }
        super.onCreate(savedInstanceState);
        if (!isFinishing() && !isChangingConfigurations() && !this.isGoingToRecreate) {
            View decorView = getWindow().getDecorView();
            com.yandex.passport.internal.ui.a aVar = new com.yandex.passport.internal.ui.a(13, this);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            ViewCompat$Api21Impl.o(decorView, aVar);
            setContentView(getComponent().getUi().getRoot());
            bind();
            return;
        }
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.isGoingToRecreate, 8);
        }
        tje.N(eja1.s(this), null, null, new WebCardSlothActivity$onCreate$3(this, null), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
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
