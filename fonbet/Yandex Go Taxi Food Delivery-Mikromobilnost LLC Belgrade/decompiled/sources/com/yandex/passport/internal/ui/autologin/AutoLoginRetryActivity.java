package com.yandex.passport.internal.ui.autologin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.u;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.UserCredentials;
import com.yandex.passport.internal.flags.experiments.h;
import com.yandex.passport.internal.links.j;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.n;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.util.i;
import com.yandex.passport.internal.util.p;
import defpackage.ds31;
import defpackage.sls;
import defpackage.tje;
import defpackage.w53;

/* loaded from: classes2.dex */
public class AutoLoginRetryActivity extends AppCompatActivity {
    private static final long DISMISS_DURATION = 10000;
    public static final String KEY_IS_ERROR_TEMPORARY = "is_error_temporary";
    public static final String KEY_USER_CREDENTIALS = "credentials";
    private AutoLoginProperties autoLoginProperties;
    private Button buttonRetry;
    private e dismissHelper;
    private c0 eventReporter;
    private boolean isErrorTemporary;
    private View layoutRetry;
    private final sls onDismiss = new h(6, this);
    private View progressBar;
    private TextView textMessage;
    private UserCredentials userCredentials;
    private c viewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0() {
        setResult(0);
        finish();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        onRetryClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c lambda$onCreate$2(PassportProcessGlobalComponent passportProcessGlobalComponent) throws Exception {
        return new c(passportProcessGlobalComponent.getLoginController(), this.userCredentials, this.isErrorTemporary, passportProcessGlobalComponent.getEventReporter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onCreate$3(PassportProcessGlobalComponent passportProcessGlobalComponent, Uid uid) {
        c0 c0Var = this.eventReporter;
        c0Var.getClass();
        c0Var.a.a(com.yandex.passport.internal.analytics.d.f, new w53());
        com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.c.B(new u(p.A(uid), a0.g0(passportProcessGlobalComponent.getAccountsRetriever().a().e(uid)), PassportLoginAction.AUTOLOGIN, null, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(boolean z) {
        this.isErrorTemporary = z;
        Button button = this.buttonRetry;
        if (z) {
            button.setText(R.string.passport_smartlock_autologin_retry_button);
            this.textMessage.setText(R.string.passport_error_network);
        } else {
            button.setText(R.string.passport_smartlock_autologin_login_error_button);
            this.textMessage.setText(getString(R.string.passport_smartlock_autologin_login_error_text, this.userCredentials.getLogin()));
        }
    }

    private void onRetryClicked() {
        c0 c0Var = this.eventReporter;
        c0Var.getClass();
        c0Var.a.a(com.yandex.passport.internal.analytics.d.d, new w53());
        if (this.isErrorTemporary) {
            c cVar = this.viewModel;
            cVar.c.l(Boolean.TRUE);
            tje.N(ds31.a(cVar), null, null, new AutoLoginRetryViewModel$retry$1(cVar, null), 3);
            return;
        }
        com.yandex.passport.internal.ui.router.c cVar2 = GlobalRouterActivity.Companion;
        LoginProperties.a aVar = new LoginProperties.a();
        aVar.g(this.autoLoginProperties.getFilter());
        aVar.F = this.userCredentials;
        aVar.J = "passport/autologin";
        LoginProperties a = aVar.a();
        cVar2.getClass();
        startActivityForResult(com.yandex.passport.internal.ui.router.c.a(this, a, true, null, null), 1);
        this.layoutRetry.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showProgress(boolean z) {
        this.progressBar.setVisibility(z ? 0 : 8);
        this.layoutRetry.setVisibility(z ? 8 : 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.eventReporter = a.getEventReporter();
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        a.getDiaryRecorder().a(com.yandex.passport.internal.report.diary.h.a, extras, null);
        AutoLoginProperties.Companion.getClass();
        this.autoLoginProperties = com.yandex.passport.internal.properties.e.a(extras);
        UserCredentials userCredentials = (UserCredentials) extras.getParcelable(KEY_USER_CREDENTIALS);
        userCredentials.getClass();
        this.userCredentials = userCredentials;
        this.isErrorTemporary = extras.getBoolean(KEY_IS_ERROR_TEMPORARY);
        setTitle((CharSequence) null);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        getWindow().setDimAmount(0.0f);
        getWindow().addFlags(32);
        setContentView(R.layout.passport_activity_autologin_retry);
        this.layoutRetry = findViewById(R.id.layout_retry);
        this.progressBar = findViewById(R.id.progress);
        Button button = (Button) findViewById(R.id.button_retry);
        this.buttonRetry = button;
        int i = 1;
        button.setOnClickListener(new com.yandex.passport.internal.autologin.ui.b(i, this));
        TextView textView = (TextView) findViewById(R.id.text_message);
        this.textMessage = textView;
        textView.setText(getString(R.string.passport_autologin_auth_failed_message, this.userCredentials.getLogin()));
        c cVar = (c) com.yandex.passport.internal.u.a(this, c.class, new n(i, this, a));
        this.viewModel = cVar;
        i iVar = cVar.c;
        j jVar = new j(i, this);
        iVar.getClass();
        iVar.f(this, new b(3, jVar));
        this.viewModel.E.n(this, new com.yandex.passport.internal.ui.util.j() { // from class: com.yandex.passport.internal.ui.autologin.a
            @Override // defpackage.pq60
            public final void a(Object obj) {
                AutoLoginRetryActivity.this.lambda$onCreate$3(a, (Uid) obj);
            }
        });
        this.viewModel.D.f(this, new b(0, this));
        if (bundle == null) {
            c0 c0Var = this.eventReporter;
            c0Var.getClass();
            c0Var.a.a(com.yandex.passport.internal.analytics.d.c, new w53());
        }
        this.dismissHelper = new e(this, bundle, this.onDismiss, 10000L);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("create_time", this.dismissHelper.a);
    }
}
