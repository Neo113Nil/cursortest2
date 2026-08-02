package com.yandex.passport.internal.ui;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.SocialBindProperties;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.t;
import com.yandex.passport.internal.ui.social.SocialBindingFragment;
import com.yandex.passport.internal.y;
import defpackage.g8e;
import defpackage.ny61;

/* loaded from: classes2.dex */
public class SocialBindActivity extends BaseActivity implements com.yandex.passport.internal.ui.social.j {
    private com.yandex.passport.internal.core.accounts.d accountsRetriever;
    private com.yandex.passport.legacy.lx.g masterAccountCanceller;
    private SocialBindProperties socialBindProperties;
    private w0 socialReporter;

    private SocialBindProperties buildBindProperties() {
        String action = getIntent().getAction();
        Bundle extras = getIntent().getExtras();
        if (action != null || extras == null) {
            ny61.r(g8e.o("Invalid action in SocialBindActivity: ", action));
            return null;
        }
        SocialBindProperties.Companion.getClass();
        return v.a(extras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ModernAccount getModernAccount() {
        return this.accountsRetriever.a().e(com.yandex.passport.internal.util.p.B(this.socialBindProperties.getUid()));
    }

    private void initializeBinding(final boolean z) {
        this.masterAccountCanceller = new com.yandex.passport.legacy.lx.f(new com.yandex.passport.legacy.lx.l(new t(3, this))).e(new com.yandex.passport.legacy.lx.a() { // from class: com.yandex.passport.internal.ui.p
            @Override // com.yandex.passport.legacy.lx.a
            /* renamed from: a */
            public final void mo290a(Object obj) {
                SocialBindActivity.this.lambda$initializeBinding$0(z, (ModernAccount) obj);
            }
        }, new a(4, this));
    }

    private boolean isSocialBindFragmentExists() {
        return getSupportFragmentManager().F(SocialBindingFragment.FRAGMENT_TAG) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeBinding$1(Throwable th) {
        com.yandex.passport.legacy.a.c("Error getting master token on binding social to passport account", th);
        masterAccountError(th);
    }

    private void masterAccountError(Throwable th) {
        w0 w0Var = this.socialReporter;
        y yVar = SocialConfiguration.Companion;
        PassportSocialConfiguration socialBindingConfiguration = this.socialBindProperties.getSocialBindingConfiguration();
        yVar.getClass();
        w0Var.l(y.a(socialBindingConfiguration), th);
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSocialBindFragment, reason: merged with bridge method [inline-methods] */
    public void lambda$initializeBinding$0(ModernAccount modernAccount, boolean z) {
        if (modernAccount == null) {
            com.yandex.passport.legacy.a.b("Error getting master token on binding social to passport account (account is null)");
            masterAccountError(new NullPointerException("Error getting master token on binding social to passport account (account is null)"));
            return;
        }
        com.yandex.passport.internal.properties.i iVar = LoginProperties.Companion;
        LoginProperties.a aVar = new LoginProperties.a();
        aVar.g(this.socialBindProperties.getFilter());
        aVar.y = this.socialBindProperties.getTheme();
        aVar.A = this.socialBindProperties.getUid();
        LoginProperties a = aVar.a();
        iVar.getClass();
        LoginProperties b = com.yandex.passport.internal.properties.i.b(a);
        y yVar = SocialConfiguration.Companion;
        PassportSocialConfiguration socialBindingConfiguration = this.socialBindProperties.getSocialBindingConfiguration();
        yVar.getClass();
        SocialBindingFragment newInstance = SocialBindingFragment.newInstance(b, y.a(socialBindingConfiguration), modernAccount, z);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a h = g8e.h(supportFragmentManager, supportFragmentManager);
        h.h(R.id.container, newInstance, SocialBindingFragment.FRAGMENT_TAG);
        h.l(true, true);
    }

    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.accountsRetriever = a.getAccountsRetriever();
        this.socialReporter = a.getSocialReporter();
        if (bundle == null) {
            this.socialBindProperties = buildBindProperties();
        } else {
            SocialBindProperties.Companion.getClass();
            this.socialBindProperties = v.a(bundle);
        }
        setTheme(com.yandex.passport.internal.ui.util.o.d(this.socialBindProperties.getTheme(), this));
        super.onCreate(bundle);
        setContentView(R.layout.passport_activity_bind_social);
        if (isSocialBindFragmentExists()) {
            return;
        }
        initializeBinding(true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.yandex.passport.legacy.lx.g gVar = this.masterAccountCanceller;
        if (gVar != null) {
            gVar.a();
            this.masterAccountCanceller = null;
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putAll(this.socialBindProperties.toBundle());
    }

    @Override // com.yandex.passport.internal.ui.social.j
    public void onSocialAccountBound() {
        setResult(-1);
        finish();
    }

    @Override // com.yandex.passport.internal.ui.social.j
    public void showSocialAuth(boolean z, SocialConfiguration socialConfiguration, boolean z2, ModernAccount modernAccount) {
        initializeBinding(z2);
    }
}
