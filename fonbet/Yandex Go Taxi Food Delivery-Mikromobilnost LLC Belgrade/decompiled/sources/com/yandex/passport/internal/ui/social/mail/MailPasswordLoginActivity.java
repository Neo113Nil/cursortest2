package com.yandex.passport.internal.ui.social.mail;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import com.yandex.passport.R;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.i;
import com.yandex.passport.internal.ui.BaseActivity;
import com.yandex.passport.internal.ui.util.o;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/yandex/passport/internal/ui/social/mail/MailPasswordLoginActivity;", "Lcom/yandex/passport/internal/ui/BaseActivity;", "Lcom/yandex/passport/internal/ui/social/mail/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/yandex/passport/internal/ModernAccount;", "account", "onLoginFinished", "(Lcom/yandex/passport/internal/ModernAccount;)V", "Lcom/yandex/passport/internal/properties/LoginProperties;", "loginProperties", "Lcom/yandex/passport/internal/properties/LoginProperties;", "Companion", "com/yandex/passport/internal/ui/social/mail/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MailPasswordLoginActivity extends BaseActivity implements c {
    public static final int $stable = 8;
    public static final a Companion = new a();
    private static final String TAG_MAIL_LOGIN_ACTIVITY = "MailPasswordLoginActivity";
    private LoginProperties loginProperties;

    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        i iVar = LoginProperties.Companion;
        Bundle extras = getIntent().getExtras();
        iVar.getClass();
        LoginProperties a = i.a(extras);
        this.loginProperties = a;
        setTheme(o.d(a.getTheme(), this));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passport_activity_rambler_login);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        displayHomeAsUp();
        if (savedInstanceState == null) {
            String stringExtra = getIntent().getStringExtra(MailPasswordLoginFragment.KEY_SUGGESTED_LOGIN);
            b bVar = MailPasswordLoginFragment.Companion;
            LoginProperties loginProperties = this.loginProperties;
            if (loginProperties == null) {
                loginProperties = null;
            }
            bVar.getClass();
            MailPasswordLoginFragment mailPasswordLoginFragment = new MailPasswordLoginFragment();
            Bundle bundle = new Bundle();
            if (stringExtra != null) {
                bundle.putString(MailPasswordLoginFragment.KEY_SUGGESTED_LOGIN, stringExtra);
            }
            bundle.putAll(loginProperties.toBundle());
            mailPasswordLoginFragment.setArguments(bundle);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.h(R.id.container, mailPasswordLoginFragment, TAG_MAIL_LOGIN_ACTIVITY);
            aVar.d();
        }
    }

    @Override // com.yandex.passport.internal.ui.social.mail.c
    public void onLoginFinished(ModernAccount account) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("accountType", com.yandex.passport.internal.i.a);
        bundle.putString("authAccount", account.getAccountName());
        Uid uid = account.getUid();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("passport-uid", uid);
        intent.putExtras(bundle2);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }
}
