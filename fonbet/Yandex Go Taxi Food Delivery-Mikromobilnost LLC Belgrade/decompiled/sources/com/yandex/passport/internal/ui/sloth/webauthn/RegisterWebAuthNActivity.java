package com.yandex.passport.internal.ui.sloth.webauthn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.api.a2;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.api.exception.PassportWebAuthNException;
import com.yandex.passport.api.x1;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.flags.presentation.v0;
import com.yandex.passport.internal.report.bd;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.reporters.j1;
import defpackage.mkn;
import defpackage.mx60;
import defpackage.pub1;
import defpackage.v0d;
import defpackage.x40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/webauthn/RegisterWebAuthNActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Companion", "a", "com/yandex/passport/internal/ui/sloth/webauthn/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RegisterWebAuthNActivity extends AppCompatActivity {
    public static final int $stable = 0;
    public static final com.yandex.passport.internal.ui.sloth.webauthn.a Companion = new com.yandex.passport.internal.ui.sloth.webauthn.a();
    public static final String KEY_WEBAUTHN_ERRORS = "webauthn_errors";
    public static final int RESULT_ACCOUNT_NOT_FOUND = 501;
    public static final int RESULT_INVALID_TOKEN = 401;
    public static final int RESULT_WEBAUTH_ERROR = 601;

    /* loaded from: classes8.dex */
    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            Intent intent = new Intent(context, (Class<?>) RegisterWebAuthNActivity.class);
            intent.putExtras(com.yandex.passport.internal.ui.c.I(a0.f0((x1) obj)).toBundle());
            return intent;
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            Bundle extras;
            Bundle extras2;
            String string;
            if (i == -1) {
                return a2.a;
            }
            if (i == 0) {
                return y1.a;
            }
            if (i == 13) {
                Exception x = com.yandex.passport.internal.ui.c.x(intent);
                return new z1(x != null ? new PassportRuntimeUnknownException(x) : new PassportRuntimeUnknownException("Unknown error"));
            }
            if (i == 401) {
                return new z1(new PassportAccountNotAuthorizedException());
            }
            if (i == 501) {
                return new z1((intent == null || (extras = intent.getExtras()) == null) ? new PassportRuntimeUnknownException("Account with uid not found") : new PassportAccountNotFoundException(com.yandex.passport.internal.ui.sloth.e.e(extras)));
            }
            if (i != 601) {
                return new z1(new PassportRuntimeUnknownException("Unexpected error"));
            }
            return new z1((intent == null || (extras2 = intent.getExtras()) == null || (string = extras2.getString(RegisterWebAuthNActivity.KEY_WEBAUTHN_ERRORS, null)) == null) ? new PassportRuntimeUnknownException("Unknown error") : new PassportWebAuthNException(string));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$1(c cVar, RegisterWebAuthNProperties registerWebAuthNProperties, RegisterWebAuthNActivity registerWebAuthNActivity, mx60 mx60Var) {
        j1 webAuthNReporter = cVar.getWebAuthNReporter();
        Uid uid = registerWebAuthNProperties.getUid();
        webAuthNReporter.getClass();
        webAuthNReporter.f(bd.w, new jd(Long.valueOf(uid.getValue())));
        mx60Var.h(false);
        registerWebAuthNActivity.getOnBackPressedDispatcher().c();
        return zy11.a;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Object b = com.yandex.passport.common.ui.compose.d.b(this, "PassportRegisterWebAuthNProperties", new RegisterWebAuthNActivity$onCreate$properties$1(1, RegisterWebAuthNProperties.Companion, e.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/sloth/webauthn/RegisterWebAuthNProperties;", 0));
        Throwable a2 = Result.a(b);
        if (a2 != null) {
            com.yandex.passport.internal.ui.c.j(this, a2);
            return;
        }
        RegisterWebAuthNProperties registerWebAuthNProperties = (RegisterWebAuthNProperties) b;
        AppTheme theme = registerWebAuthNProperties.getTheme();
        mkn.a(this, com.yandex.passport.common.ui.compose.d.d(theme), com.yandex.passport.common.ui.compose.d.d(theme));
        c build = com.yandex.passport.internal.di.a.a().createRegisterWebAuthNComponentBuilder().setProperties(registerWebAuthNProperties).setProgressProperties(com.yandex.passport.common.ui.progress.g.e).setActivity(this).build();
        build.getWebAuthN().c(this);
        v0d.a(this, new androidx.compose.runtime.internal.a(1042030007, new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q(4, theme, build, this), true));
        pub1.c(getOnBackPressedDispatcher(), this, new v0(5, build, registerWebAuthNProperties, this));
    }
}
