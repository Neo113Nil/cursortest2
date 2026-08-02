package com.yandex.passport.internal.ui.social.gimap;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.stash.StashCell;
import com.yandex.passport.internal.t;
import com.yandex.passport.internal.u;
import com.yandex.passport.internal.ui.base.BaseBackStackActivity;
import com.yandex.passport.internal.ui.domik.DomikResult;
import com.yandex.passport.internal.ui.domik.DomikResultImpl;
import com.yandex.passport.internal.ui.domik.FinishRegistrationActivities;
import com.yandex.passport.internal.ui.router.LoginRouterActivity;
import defpackage.ny61;
import defpackage.sa90;
import defpackage.vng;
import defpackage.w53;
import defpackage.wwg;
import java.util.EnumSet;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MailGIMAPActivity extends BaseBackStackActivity {
    private c0 eventReporter;
    private o gimapViewModel;
    private LoginProperties loginProperties;

    public static Intent createIntent(Context context, LoginProperties loginProperties, ModernAccount modernAccount) {
        Intent intent = new Intent(context, (Class<?>) MailGIMAPActivity.class);
        intent.putExtras(loginProperties.toBundle());
        if (modernAccount != null) {
            intent.putExtras(wwg.g(new Pair("master-account", modernAccount)));
        }
        return intent;
    }

    private GimapTrack extractInitialTrack(Bundle bundle) {
        LoginProperties.Companion.getClass();
        LoginProperties a = com.yandex.passport.internal.properties.i.a(bundle);
        Environment u = com.yandex.passport.internal.util.p.u(a.getFilter().getPrimaryEnvironment());
        GimapTrack create = GimapTrack.create(a.getLoginHint(), u);
        ModernAccount modernAccount = null;
        if (!bundle.containsKey("master-account")) {
            bundle = null;
        }
        if (bundle != null) {
            Object parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(bundle, ModernAccount.class, "master-account") : bundle.getParcelable("master-account");
            if (parcelable == null) {
                ny61.r("can't get required parcelable master-account");
                return null;
            }
            modernAccount = (ModernAccount) parcelable;
        }
        if (modernAccount == null) {
            return create;
        }
        String str = modernAccount.getStash().get(StashCell.GIMAP_TRACK);
        if (str == null) {
            return GimapTrack.create(modernAccount.getPrimaryDisplayName(), u);
        }
        try {
            return GimapTrack.fromJSON(new JSONObject(str));
        } catch (JSONException e) {
            com.yandex.passport.legacy.a.c("failed to restore track from stash", e);
            c0 c0Var = this.eventReporter;
            String message = e.getMessage();
            c0Var.getClass();
            w53 w53Var = new w53();
            w53Var.put("error", message);
            c0Var.a.a(com.yandex.passport.internal.analytics.f.g, w53Var);
            return create;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o lambda$onCreate$0(GimapTrack gimapTrack, PassportProcessGlobalComponent passportProcessGlobalComponent) throws Exception {
        return new o(gimapTrack, com.yandex.passport.internal.util.p.u(this.loginProperties.getFilter().getPrimaryEnvironment()), passportProcessGlobalComponent.getAccountsUpdater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onCreate$1(sa90 sa90Var) {
        String str = (String) sa90Var.a;
        str.getClass();
        MailProvider mailProvider = (MailProvider) sa90Var.b;
        mailProvider.getClass();
        onRequestReloginWithDifferentProvider(str, mailProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Fragment lambda$showIdentifier$2() throws Exception {
        GimapTrack gimapTrack;
        o oVar = this.gimapViewModel;
        synchronized (oVar) {
            gimapTrack = oVar.E;
        }
        return GimapIdentifierFragment.newInstance(gimapTrack.getEmail());
    }

    private void showIdentifier() {
        showFragment(new com.yandex.passport.internal.ui.base.m(new t(7, this), GimapIdentifierFragment.TAG, false));
    }

    @Override // com.yandex.passport.internal.ui.base.BaseBackStackActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (getFragmentBackStack().a.isEmpty()) {
            c0 c0Var = this.eventReporter;
            c0Var.getClass();
            c0Var.a.a(com.yandex.passport.internal.analytics.f.c, new w53());
        }
    }

    @Override // com.yandex.passport.internal.ui.base.BaseBackStackActivity, com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.eventReporter = a.getEventReporter();
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        LoginProperties.Companion.getClass();
        this.loginProperties = com.yandex.passport.internal.properties.i.a(extras);
        GimapTrack extractInitialTrack = extractInitialTrack(extras);
        this.gimapViewModel = (o) u.a(this, o.class, new com.yandex.passport.internal.links.i(this, extractInitialTrack, a));
        super.onCreate(bundle);
        final int i = 0;
        final int i2 = 1;
        if (bundle == null) {
            c0 c0Var = this.eventReporter;
            boolean z = extractInitialTrack.getEmail() != null;
            c0Var.getClass();
            w53 w53Var = new w53();
            w53Var.put("relogin", String.valueOf(z));
            c0Var.a.a(com.yandex.passport.internal.analytics.f.b, w53Var);
        }
        setContentView(R.layout.passport_activity_rambler_login);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        displayHomeAsUp();
        if (bundle == null) {
            showIdentifier();
        }
        this.gimapViewModel.C.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.social.gimap.p
            public final /* synthetic */ MailGIMAPActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i3 = i;
                MailGIMAPActivity mailGIMAPActivity = this.b;
                switch (i3) {
                    case 0:
                        mailGIMAPActivity.onLoginFinished((ModernAccount) obj);
                        break;
                    default:
                        mailGIMAPActivity.lambda$onCreate$1((sa90) obj);
                        break;
                }
            }
        });
        this.gimapViewModel.D.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.social.gimap.p
            public final /* synthetic */ MailGIMAPActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i3 = i2;
                MailGIMAPActivity mailGIMAPActivity = this.b;
                switch (i3) {
                    case 0:
                        mailGIMAPActivity.onLoginFinished((ModernAccount) obj);
                        break;
                    default:
                        mailGIMAPActivity.lambda$onCreate$1((sa90) obj);
                        break;
                }
            }
        });
    }

    public void onLoginFinished(ModernAccount modernAccount) {
        c0 c0Var = this.eventReporter;
        c0Var.getClass();
        w53 w53Var = new w53();
        w53Var.put("uid", String.valueOf(modernAccount.getUid().getValue()));
        c0Var.a.a(com.yandex.passport.internal.analytics.f.d, w53Var);
        Intent intent = new Intent();
        com.yandex.passport.internal.ui.domik.o oVar = DomikResult.Companion;
        PassportLoginAction passportLoginAction = PassportLoginAction.MAILISH_GIMAP;
        EnumSet noneOf = EnumSet.noneOf(FinishRegistrationActivities.class);
        oVar.getClass();
        intent.putExtras(new DomikResultImpl(modernAccount, null, passportLoginAction, null, noneOf, 8, null).toBundle());
        setResult(-1, intent);
        finish();
    }

    @Override // com.yandex.passport.internal.ui.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onRequestReloginWithDifferentProvider(String str, MailProvider mailProvider) {
        c0 c0Var = this.eventReporter;
        c0Var.getClass();
        String providerResponse = mailProvider.getProviderResponse();
        w53 w53Var = new w53();
        w53Var.put("provider_code", providerResponse);
        c0Var.a.a(com.yandex.passport.internal.analytics.f.h, w53Var);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putSerializable(LoginRouterActivity.RELOGIN_PROVIDER, mailProvider);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.gimapViewModel.X(bundle);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseBackStackActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.gimapViewModel.Y(bundle);
    }

    public void showImapSettings() {
        showFragment(new com.yandex.passport.internal.ui.base.m(new com.yandex.passport.internal.ui.authbytrack.b(9), ImapServerPrefsFragment.TAG, true));
    }

    public void showSmtpSettings() {
        showFragment(new com.yandex.passport.internal.ui.base.m(new com.yandex.passport.internal.ui.authbytrack.b(8), SmtpServerPrefsFragment.TAG, true));
    }
}
