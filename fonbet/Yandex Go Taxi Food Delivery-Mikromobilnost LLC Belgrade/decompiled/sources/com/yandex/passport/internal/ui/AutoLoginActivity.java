package com.yandex.passport.internal.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.ParcelFormatException;
import android.text.TextUtils;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.network.requester.ImageLoadingClient;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import com.yandex.passport.internal.ui.base.BaseNotificationActivity;
import de.hdodenhof.circleimageview.CircleImageView;
import defpackage.oo31;
import defpackage.w53;
import defpackage.wuj0;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/passport/internal/ui/AutoLoginActivity;", "Lcom/yandex/passport/internal/ui/base/BaseNotificationActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/yandex/passport/api/PassportTheme;", "getPassportTheme", "()Lcom/yandex/passport/api/PassportTheme;", "onDismiss", "onDestroy", "finish", "Lcom/yandex/passport/legacy/lx/g;", "avatarCanceller", "Lcom/yandex/passport/legacy/lx/g;", "Lcom/yandex/passport/internal/properties/AutoLoginProperties;", "properties", "Lcom/yandex/passport/internal/properties/AutoLoginProperties;", "Lcom/yandex/passport/internal/analytics/c0;", "eventReporter", "Lcom/yandex/passport/internal/analytics/c0;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AutoLoginActivity extends BaseNotificationActivity {
    public static final int $stable = 8;
    private com.yandex.passport.legacy.lx.g avatarCanceller;
    private c0 eventReporter;
    private AutoLoginProperties properties;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(AutoLoginActivity autoLoginActivity, Bitmap bitmap) {
        autoLoginActivity.getImageAvatar$passport_release().setImageBitmap(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(Throwable th) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error loading avatar", th);
        }
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNotificationActivity, android.app.Activity
    public void finish() {
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNotificationActivity
    public PassportTheme getPassportTheme() {
        AutoLoginProperties autoLoginProperties = this.properties;
        if (autoLoginProperties == null) {
            autoLoginProperties = null;
        }
        return autoLoginProperties.getTheme();
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNotificationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        try {
            com.yandex.passport.internal.properties.e eVar = AutoLoginProperties.Companion;
            Bundle extras = getIntent().getExtras();
            eVar.getClass();
            this.properties = com.yandex.passport.internal.properties.e.a(extras);
            super.onCreate(savedInstanceState);
            PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
            ImageLoadingClient imageLoadingClient = a.getImageLoadingClient();
            com.yandex.passport.internal.core.accounts.d accountsRetriever = a.getAccountsRetriever();
            a.getDiaryRecorder().a(com.yandex.passport.internal.report.diary.g.a, getIntent().getExtras(), null);
            this.eventReporter = a.getEventReporter();
            PassportUidImpl passportUidImpl = (PassportUidImpl) oo31.e(getIntent().getExtras(), com.yandex.passport.internal.util.p.class, "passport-uid");
            if (passportUidImpl == null) {
                throw new ParcelFormatException("Invalid parcelable PassportUidImpl in the bundle");
            }
            if (savedInstanceState == null) {
                c0 c0Var = this.eventReporter;
                if (c0Var == null) {
                    c0Var = null;
                }
                c0Var.getClass();
                c0Var.a.a(com.yandex.passport.internal.analytics.d.b, new w53());
            }
            ModernAccount e = accountsRetriever.a().e(com.yandex.passport.internal.util.p.B(passportUidImpl));
            if (e == null) {
                finish();
                return;
            }
            String firstName = e.getFirstName();
            if (TextUtils.isEmpty(firstName)) {
                firstName = e.getPrimaryDisplayName();
            }
            getTextMessage$passport_release().setText(getString(R.string.passport_autologin_text, firstName));
            getTextEmail$passport_release().setText(e.getNativeDefaultEmail());
            TextView textSubMessage$passport_release = getTextSubMessage$passport_release();
            AutoLoginProperties autoLoginProperties = this.properties;
            if (autoLoginProperties == null) {
                autoLoginProperties = null;
            }
            String message = autoLoginProperties.getMessage();
            boolean isEmpty = TextUtils.isEmpty(message);
            if (isEmpty) {
                message = "";
            }
            textSubMessage$passport_release.setText(message);
            textSubMessage$passport_release.setVisibility(isEmpty ? 8 : 0);
            String m296getAvatarUrlxSnV4o = e.m296getAvatarUrlxSnV4o();
            if (m296getAvatarUrlxSnV4o != null) {
                int i = 1;
                if (com.yandex.passport.common.url.b.m(m296getAvatarUrlxSnV4o) && !e.isAvatarEmpty()) {
                    String m296getAvatarUrlxSnV4o2 = e.m296getAvatarUrlxSnV4o();
                    this.avatarCanceller = new com.yandex.passport.legacy.lx.f(imageLoadingClient.d(m296getAvatarUrlxSnV4o2 != null ? m296getAvatarUrlxSnV4o2 : null)).e(new a(i, this), new com.yandex.passport.common.util.b(5));
                }
            }
            CircleImageView imageAvatar$passport_release = getImageAvatar$passport_release();
            Resources resources = getResources();
            int i2 = R.drawable.passport_ico_user;
            Resources.Theme theme = getTheme();
            ThreadLocal threadLocal = wuj0.a;
            imageAvatar$passport_release.setImageDrawable(resources.getDrawable(i2, theme));
        } catch (Exception unused) {
            AutoLoginProperties.Companion.getClass();
            Filter.a aVar = new Filter.a();
            aVar.a = KPassportEnvironment.PRODUCTION;
            this.properties = new AutoLoginProperties(aVar.a(), null, null, null, false, null, null, HProv.PP_DELETE_SAVED_PASSWD, null);
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
    public void onDismiss() {
        setResult(-1, getIntent());
        finish();
    }
}
