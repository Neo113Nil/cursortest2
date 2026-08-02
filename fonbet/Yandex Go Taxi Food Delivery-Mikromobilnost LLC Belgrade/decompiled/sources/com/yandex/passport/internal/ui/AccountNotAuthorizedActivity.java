package com.yandex.passport.internal.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.network.requester.ImageLoadingClient;
import com.yandex.passport.internal.properties.AccountNotAuthorizedProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.base.BaseNotificationActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import de.hdodenhof.circleimageview.CircleImageView;
import defpackage.ny61;
import defpackage.w53;
import defpackage.wuj0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/yandex/passport/internal/ui/AccountNotAuthorizedActivity;", "Lcom/yandex/passport/internal/ui/base/BaseNotificationActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/yandex/passport/api/PassportTheme;", "getPassportTheme", "()Lcom/yandex/passport/api/PassportTheme;", "onDismiss", "", "displayLogin", "onDialogClick", "(Ljava/lang/String;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroy", "Lcom/yandex/passport/legacy/lx/g;", "avatarCanceller", "Lcom/yandex/passport/legacy/lx/g;", "Lcom/yandex/passport/internal/properties/AccountNotAuthorizedProperties;", "properties", "Lcom/yandex/passport/internal/properties/AccountNotAuthorizedProperties;", "Lcom/yandex/passport/internal/analytics/c0;", "eventReporter", "Lcom/yandex/passport/internal/analytics/c0;", "Companion", "com/yandex/passport/internal/ui/b", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccountNotAuthorizedActivity extends BaseNotificationActivity {
    public static final int $stable = 8;
    public static final b Companion = new b();
    private static final int REQUEST_RELOGIN = 1;
    private com.yandex.passport.legacy.lx.g avatarCanceller;
    private c0 eventReporter;
    private AccountNotAuthorizedProperties properties;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(AccountNotAuthorizedActivity accountNotAuthorizedActivity, Bitmap bitmap) {
        accountNotAuthorizedActivity.getImageAvatar$passport_release().setImageBitmap(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(Throwable th) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error loading avatar", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(AccountNotAuthorizedActivity accountNotAuthorizedActivity, ModernAccount modernAccount, View view) {
        accountNotAuthorizedActivity.onDialogClick(modernAccount.getDisplayLogin());
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNotificationActivity
    public PassportTheme getPassportTheme() {
        AccountNotAuthorizedProperties accountNotAuthorizedProperties = this.properties;
        if (accountNotAuthorizedProperties == null) {
            accountNotAuthorizedProperties = null;
        }
        return accountNotAuthorizedProperties.getTheme();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 1) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        overridePendingTransition(0, 0);
        setResult(resultCode, data);
        forceFinish();
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNotificationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        try {
            com.yandex.passport.internal.properties.b bVar = AccountNotAuthorizedProperties.Companion;
            Bundle extras = getIntent().getExtras();
            bVar.getClass();
            this.properties = com.yandex.passport.internal.properties.b.a(extras);
            super.onCreate(savedInstanceState);
            PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
            ImageLoadingClient imageLoadingClient = a.getImageLoadingClient();
            com.yandex.passport.internal.core.accounts.d accountsRetriever = a.getAccountsRetriever();
            this.eventReporter = a.getEventReporter();
            a.getDiaryRecorder().a(com.yandex.passport.internal.report.diary.f.a, getIntent().getExtras(), null);
            if (savedInstanceState == null) {
                c0 c0Var = this.eventReporter;
                if (c0Var == null) {
                    c0Var = null;
                }
                c0Var.getClass();
                c0Var.a.a(com.yandex.passport.internal.analytics.b.b, new w53());
            }
            com.yandex.passport.internal.b a2 = accountsRetriever.a();
            AccountNotAuthorizedProperties accountNotAuthorizedProperties = this.properties;
            if (accountNotAuthorizedProperties == null) {
                accountNotAuthorizedProperties = null;
            }
            ModernAccount e = a2.e(com.yandex.passport.internal.util.p.B(accountNotAuthorizedProperties.getUid()));
            if (e == null) {
                finish();
                return;
            }
            String firstName = e.getFirstName();
            if (TextUtils.isEmpty(firstName)) {
                firstName = e.getPrimaryDisplayName();
            }
            getTextMessage$passport_release().setText(getString(R.string.passport_account_not_authorized_title, firstName));
            getTextEmail$passport_release().setText(e.getNativeDefaultEmail());
            TextView textSubMessage$passport_release = getTextSubMessage$passport_release();
            AccountNotAuthorizedProperties accountNotAuthorizedProperties2 = this.properties;
            if (accountNotAuthorizedProperties2 == null) {
                accountNotAuthorizedProperties2 = null;
            }
            String message = accountNotAuthorizedProperties2.getMessage();
            int i = R.string.passport_account_not_authorized_default_message;
            if (TextUtils.isEmpty(message)) {
                textSubMessage$passport_release.setText(i);
            } else {
                textSubMessage$passport_release.setText(message);
            }
            getButtonAction$passport_release().setText(R.string.passport_account_not_authorized_action);
            String m296getAvatarUrlxSnV4o = e.m296getAvatarUrlxSnV4o();
            int i2 = 0;
            if (m296getAvatarUrlxSnV4o != null && com.yandex.passport.common.url.b.m(m296getAvatarUrlxSnV4o) && !e.isAvatarEmpty()) {
                String m296getAvatarUrlxSnV4o2 = e.m296getAvatarUrlxSnV4o();
                if (m296getAvatarUrlxSnV4o2 == null) {
                    ny61.g(null);
                    return;
                }
                this.avatarCanceller = new com.yandex.passport.legacy.lx.f(imageLoadingClient.d(m296getAvatarUrlxSnV4o2)).e(new a(i2, this), new com.yandex.passport.common.util.b(4));
            }
            CircleImageView imageAvatar$passport_release = getImageAvatar$passport_release();
            Resources resources = getResources();
            int i3 = R.drawable.passport_ico_user;
            Resources.Theme theme = getTheme();
            ThreadLocal threadLocal = wuj0.a;
            imageAvatar$passport_release.setImageDrawable(resources.getDrawable(i3, theme));
            getButtonAction$passport_release().setVisibility(0);
            getButtonAction$passport_release().setOnClickListener(new l(2, this, e));
        } catch (Exception unused) {
            AccountNotAuthorizedProperties.Companion.getClass();
            PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.PRODUCTION, 1L);
            PassportTheme passportTheme = PassportTheme.LIGHT_CUSTOM;
            LoginProperties.a aVar = new LoginProperties.a();
            Filter.a aVar2 = new Filter.a();
            aVar2.a = KPassportEnvironment.PRODUCTION;
            aVar.b = aVar2.a();
            LoginProperties.Companion.getClass();
            this.properties = new AccountNotAuthorizedProperties(passportUidImpl, passportTheme, null, a0.b0(com.yandex.passport.internal.properties.i.b(aVar)));
            super.onCreate(savedInstanceState);
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.yandex.passport.legacy.lx.g gVar = this.avatarCanceller;
        if (gVar != null) {
            gVar.a();
        }
        super.onDestroy();
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNotificationActivity
    public void onDialogClick(String displayLogin) {
        String str;
        c0 c0Var = this.eventReporter;
        if (c0Var == null) {
            c0Var = null;
        }
        c0Var.getClass();
        c0Var.a.a(com.yandex.passport.internal.analytics.b.d, new w53());
        getDialogContent$passport_release().setVisibility(8);
        AccountNotAuthorizedProperties accountNotAuthorizedProperties = this.properties;
        if (accountNotAuthorizedProperties == null) {
            accountNotAuthorizedProperties = null;
        }
        LoginProperties loginProperties = accountNotAuthorizedProperties.getLoginProperties();
        AccountNotAuthorizedProperties accountNotAuthorizedProperties2 = this.properties;
        if (accountNotAuthorizedProperties2 == null) {
            accountNotAuthorizedProperties2 = null;
        }
        PassportUidImpl uid = accountNotAuthorizedProperties2.getUid();
        if (displayLogin == null) {
            AccountNotAuthorizedProperties accountNotAuthorizedProperties3 = this.properties;
            if (accountNotAuthorizedProperties3 == null) {
                accountNotAuthorizedProperties3 = null;
            }
            str = accountNotAuthorizedProperties3.getLoginProperties().getLoginHint();
        } else {
            str = displayLogin;
        }
        startActivityForResult(com.yandex.passport.internal.ui.router.c.b(GlobalRouterActivity.Companion, this, LoginProperties.m307copyLjS6rdk$default(loginProperties, null, false, null, null, null, null, uid, false, false, null, str, false, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147482559, null), null, 28), 1);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNotificationActivity
    public void onDismiss() {
        c0 c0Var = this.eventReporter;
        if (c0Var == null) {
            c0Var = null;
        }
        c0Var.getClass();
        c0Var.a.a(com.yandex.passport.internal.analytics.b.c, new w53());
        setResult(0);
        finish();
    }
}
