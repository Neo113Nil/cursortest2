package com.yandex.passport.internal.ui.sloth.ebs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportModuleConnectionException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.ui.AppTheme;
import defpackage.es31;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mkn;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.v0d;
import defpackage.x40;
import defpackage.y8f;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/ebs/BiometricVerificationActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lcom/yandex/passport/internal/ui/sloth/ebs/d;", "component", "Lcom/yandex/passport/internal/ui/sloth/ebs/d;", "Companion", "a", "com/yandex/passport/internal/ui/sloth/ebs/b", "Lcom/yandex/passport/internal/ui/sloth/ebs/b1;", "viewModel", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BiometricVerificationActivity extends ComponentActivity {
    public static final int $stable = 8;
    public static final String BIOMETRIC_MODULE_CONNECTION_ERROR = "biometric_module_connection_error";
    public static final String BIOMETRIC_VERIFICATION_CANCELLED = "cancelled";
    public static final b Companion = new b();
    private static final String EXPECTED_HOST = "ebs-biometry";
    private static final String KEY_TRACK_ID = "track_id";
    public static final int RESULT_BIOMETRIC_MODULE_CONNECTION_ERROR = 601;
    public static final int RESULT_INVALID_TOKEN = 401;
    private d component;

    /* loaded from: classes8.dex */
    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            Intent intent = new Intent(context, (Class<?>) BiometricVerificationActivity.class);
            intent.putExtras(com.yandex.passport.internal.ui.c.E(com.yandex.passport.internal.a0.Z((com.yandex.passport.api.d0) obj), UUID.randomUUID().toString()).toBundle());
            return intent;
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            String stringExtra;
            if (i == -1) {
                return (intent == null || (stringExtra = intent.getStringExtra(BiometricVerificationActivity.KEY_TRACK_ID)) == null) ? new com.yandex.passport.api.f0(new PassportRuntimeUnknownException("No track_id value in intent")) : new com.yandex.passport.api.g0(stringExtra);
            }
            if (i == 0) {
                return com.yandex.passport.api.e0.a;
            }
            if (i != 13) {
                return i != 401 ? i != 601 ? new com.yandex.passport.api.f0(new PassportRuntimeUnknownException("Unexpected error")) : new com.yandex.passport.api.f0(new PassportModuleConnectionException()) : new com.yandex.passport.api.f0(new PassportAccountNotAuthorizedException());
            }
            Exception x = com.yandex.passport.internal.ui.c.x(intent);
            return new com.yandex.passport.api.f0(x != null ? new PassportRuntimeUnknownException(x) : new PassportRuntimeUnknownException("Unknown error"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 onNewIntent$lambda$6(BiometricVerificationActivity biometricVerificationActivity) {
        d dVar = biometricVerificationActivity.component;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.getViewModelFactory();
    }

    private static final b1 onNewIntent$lambda$7(i3y i3yVar) {
        return (b1) i3yVar.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, "[EBS]", "BiometricVerificationActivity::onCreate", 8);
        }
        Object b = com.yandex.passport.common.ui.compose.d.b(this, "PassportBiometricVerificationProperties", new BiometricVerificationActivity$onCreate$properties$1(1, BiometricVerificationProperties.Companion, f.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/sloth/ebs/BiometricVerificationProperties;", 0));
        Throwable a2 = Result.a(b);
        if (a2 != null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, "[EBS]", "BiometricVerificationActivity empty properties", 8);
            }
            com.yandex.passport.internal.ui.c.j(this, a2);
        } else {
            BiometricVerificationProperties biometricVerificationProperties = (BiometricVerificationProperties) b;
            AppTheme theme = biometricVerificationProperties.getTheme();
            mkn.a(this, com.yandex.passport.common.ui.compose.d.d(theme), com.yandex.passport.common.ui.compose.d.d(theme));
            this.component = com.yandex.passport.internal.di.a.a().createBiometricVerificationComponentBuilder().setProperties(biometricVerificationProperties).setProgressProperties(com.yandex.passport.common.ui.progress.g.e).setActivity(this).build();
            v0d.a(this, new androidx.compose.runtime.internal.a(976124233, new com.yandex.passport.internal.flags.presentation.f1(6, theme, this), true));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri data = intent.getData();
        if (data == null) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, "[EBS]", "BiometricVerificationActivity::onNewIntent empty intent.data", 8);
                return;
            }
            return;
        }
        if (!jl40.l(data.getHost(), EXPECTED_HOST)) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, "[EBS]", "BiometricVerificationActivity::onNewIntent incorrect host = " + data.getHost(), 8);
                return;
            }
            return;
        }
        if (this.component != null) {
            onNewIntent$lambda$7(new es31(qoi0.a(b1.class), new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationActivity$onNewIntent$$inlined$viewModels$default$2
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
            }, new com.yandex.passport.internal.ui.sloth.ebs.a(this, 0), new sls(this) { // from class: com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationActivity$onNewIntent$$inlined$viewModels$default$3
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
            })).W(u0.a);
        } else {
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, "[EBS]", "BiometricVerificationActivity::onNewIntent not init component", 8);
            }
        }
    }
}
