package com.yandex.passport.internal.ui.sloth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.yandex.passport.api.exception.PassportHostProcessedException;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.flags.presentation.f1;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.sloth.m0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.d6z;
import defpackage.ds31;
import defpackage.eja1;
import defpackage.es31;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.k5c;
import defpackage.mkn;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.t40;
import defpackage.tje;
import defpackage.v0d;
import defpackage.x40;
import defpackage.y8f;
import defpackage.yyj0;
import defpackage.zyj0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/StandaloneSlothComposeActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lcom/yandex/passport/sloth/m0;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "processResult", "(Lcom/yandex/passport/sloth/m0;)V", "Lcom/yandex/passport/sloth/m;", "processError", "(Lcom/yandex/passport/sloth/m;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/yandex/passport/internal/ui/sloth/t;", "component", "Lcom/yandex/passport/internal/ui/sloth/t;", "getComponent$passport_release", "()Lcom/yandex/passport/internal/ui/sloth/t;", "setComponent$passport_release", "(Lcom/yandex/passport/internal/ui/sloth/t;)V", "Lcom/yandex/passport/internal/ui/sloth/w;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/passport/internal/ui/sloth/w;", "viewModel", "a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StandaloneSlothComposeActivity extends ComponentActivity {
    public static final int $stable = 8;
    public t component;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = new es31(qoi0.a(w.class), new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity$special$$inlined$viewModels$default$2
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
    }, new com.yandex.passport.internal.flags.experiments.h(20, this), new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity$special$$inlined$viewModels$default$3
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
            Bundle[] bundleArr = {((StandaloneSlothProperties) obj).toBundle()};
            Bundle bundle = new Bundle();
            bundle.putAll(bundleArr[0]);
            return d6z.B(context, StandaloneSlothComposeActivity.class, bundle);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return new t40(i != -1 ? i != 0 ? new zyj0(i) : yyj0.b : yyj0.c, intent);
        }
    }

    private final w getViewModel() {
        return (w) this.viewModel.getValue();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$0(StandaloneSlothComposeActivity standaloneSlothComposeActivity) {
        return standaloneSlothComposeActivity.getComponent$passport_release().getViewModelFactory();
    }

    public final t getComponent$passport_release() {
        t tVar = this.component;
        if (tVar != null) {
            return tVar;
        }
        return null;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Object b = com.yandex.passport.common.ui.compose.d.b(this, "SlothProperties", new StandaloneSlothComposeActivity$onCreate$properties$1(1, StandaloneSlothProperties.Companion, z.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/sloth/StandaloneSlothProperties;", 0));
        Throwable a2 = Result.a(b);
        if (a2 != null) {
            com.yandex.passport.internal.ui.c.j(this, a2);
            return;
        }
        StandaloneSlothProperties standaloneSlothProperties = (StandaloneSlothProperties) b;
        AppTheme theme = standaloneSlothProperties.getTheme();
        mkn.a(this, com.yandex.passport.common.ui.compose.d.d(theme), com.yandex.passport.common.ui.compose.d.d(theme));
        setComponent$passport_release(com.yandex.passport.internal.di.a.a().createStandaloneSlothComposeComponentBuilder().progressProperties(new com.yandex.passport.common.ui.progress.g(new com.yandex.passport.common.ui.progress.a(0), com.yandex.passport.common.ui.progress.r.a, com.yandex.passport.common.ui.progress.e.a, true)).activity(this).params(standaloneSlothProperties.getSlothParams()).build());
        w viewModel = getViewModel();
        viewModel.getClass();
        k5c a3 = ds31.a(viewModel);
        StandaloneSlothComposeViewModel$start$1 standaloneSlothComposeViewModel$start$1 = new StandaloneSlothComposeViewModel$start$1(viewModel, null);
        int i = 3;
        tje.N(a3, null, null, standaloneSlothComposeViewModel$start$1, 3);
        v0d.a(this, new androidx.compose.runtime.internal.a(1904645019, new f1(4, theme, this), true));
        i1 webAmReporter = getComponent$passport_release().getWebAmReporter();
        kotlinx.coroutines.flow.e.H(eja1.s(this), new jqr(getViewModel().c, new StandaloneSlothComposeActivity$onCreate$2(this, webAmReporter, null), i));
        kotlinx.coroutines.flow.e.H(eja1.s(this), new jqr(getViewModel().w, new StandaloneSlothComposeActivity$onCreate$3(this, webAmReporter, null), i));
    }

    public final void setComponent$passport_release(t tVar) {
        this.component = tVar;
    }
}
