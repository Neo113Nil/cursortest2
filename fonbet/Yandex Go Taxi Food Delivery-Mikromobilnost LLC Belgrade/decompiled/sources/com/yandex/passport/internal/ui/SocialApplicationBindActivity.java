package com.yandex.passport.internal.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.u;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.SocialApplicationBindProperties;
import com.yandex.passport.internal.properties.t;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.browser.SocialBrowserActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.ny61;
import defpackage.oo31;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Pair;
import ru.CryptoPro.JCP.JCP;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public class SocialApplicationBindActivity extends BaseActivity {
    private static final String KEY_CODE_CHALLENGE = "code-challenge";
    private static final String KEY_TASK_ID = "task-id";
    private static final int REQUEST_ACCEPT_PERMISSIONS = 1;
    private static final int REQUEST_BROWSER = 2;
    private static final int REQUEST_RELOGIN = 4;
    private static final int REQUEST_SELECT_ACCOUNT = 3;
    private com.yandex.passport.internal.core.accounts.d accountsRetriever;
    private u appBindReporter;
    private SocialApplicationBindProperties applicationBindProperties;
    private com.yandex.passport.internal.network.client.a backendClient;
    private com.yandex.passport.internal.network.client.c clientChooser;
    private String codeChallenge;
    private com.yandex.passport.legacy.lx.g finishBindApplicationCanceller;
    private Uid selectedUid;
    private String taskId;

    private SocialApplicationBindProperties buildApplicationBindProperties() {
        if (getIntent().getAction() != null) {
            ny61.r("clientId required for call this activity");
            return null;
        }
        t tVar = SocialApplicationBindProperties.Companion;
        Bundle extras = getIntent().getExtras();
        tVar.getClass();
        return t.a(extras);
    }

    private void finishBindApplication(Uid uid) {
        if (this.taskId == null) {
            ny61.r("Task id null in finishBindApplication");
        } else {
            int i = 0;
            this.finishBindApplicationCanceller = new com.yandex.passport.legacy.lx.f(new com.yandex.passport.legacy.lx.l(new n(i, this, uid))).e(new a(3, this), new o(i, this, uid));
        }
    }

    private Uid fromPassportUid(k2 k2Var) {
        if (k2Var != null) {
            return com.yandex.passport.internal.util.p.B(k2Var);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$finishBindApplication$0(Uid uid) throws Exception {
        return Boolean.valueOf(this.backendClient.f(this.accountsRetriever.a().e(uid).getMasterToken(), this.taskId, this.codeChallenge));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finishBindApplication$1(Boolean bool) {
        if (bool.booleanValue()) {
            setResult(-1, new Intent());
            this.appBindReporter.b("success");
        } else {
            this.appBindReporter.b("cancelled");
            setResult(0);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$finishBindApplication$2(Uid uid, Throwable th) {
        if (th instanceof InvalidTokenException) {
            showRelogin(uid);
            this.appBindReporter.b("relogin_required");
            return;
        }
        com.yandex.passport.legacy.a.c("Error finish bind application", th);
        setResult(0);
        u uVar = this.appBindReporter;
        uVar.getClass();
        uVar.a(com.yandex.passport.internal.analytics.q.i, new Pair("error", Log.getStackTraceString(th)));
        finish();
    }

    private void loadAccount() {
        Uid uid = this.selectedUid;
        if (uid != null) {
            finishBindApplication(uid);
            return;
        }
        com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
        LoginProperties.a aVar = new LoginProperties.a();
        aVar.g(this.applicationBindProperties.getFilter());
        aVar.J = "passport/social_application_bind";
        LoginProperties a = aVar.a();
        cVar.getClass();
        startActivityForResult(com.yandex.passport.internal.ui.router.c.a(this, a, true, null, null), 3);
    }

    private void onCodeReceived(String str) {
        com.yandex.passport.internal.network.client.e b = this.clientChooser.b(com.yandex.passport.internal.util.p.u(this.applicationBindProperties.getFilter().getPrimaryEnvironment()));
        String b2 = com.yandex.passport.common.browser.c.b(this);
        String applicationName = this.applicationBindProperties.getApplicationName();
        try {
            Uri.Builder appendQueryParameter = Uri.parse(b.e()).buildUpon().appendEncodedPath("broker2/authz_in_app/start").appendQueryParameter("application_name", applicationName).appendQueryParameter("code_challenge", Base64.encodeToString(MessageDigest.getInstance(JCP.DIGEST_SHA_256).digest(this.codeChallenge.getBytes(Charset.forName("utf8"))), 11)).appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("consumer", ((com.yandex.passport.internal.common.e) b.f).a()).appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("retpath", b2).appendQueryParameter("place", "query").appendQueryParameter("display", "touch");
            if (str != null) {
                appendQueryParameter.appendQueryParameter("yandex_auth_code", str);
            }
            startActivityForResult(SocialBrowserActivity.createIntent(this, Uri.parse(appendQueryParameter.toString())), 2);
        } catch (UnsupportedEncodingException e) {
            ny61.j(e);
        } catch (NoSuchAlgorithmException e2) {
            ny61.j(e2);
        }
    }

    private void processBrowserData(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            com.yandex.passport.legacy.a.b("Browser didn't return data in intent");
            u uVar = this.appBindReporter;
            uVar.getClass();
            uVar.a(com.yandex.passport.internal.analytics.q.g, new Pair(ACSPConstants.STATUS, "Browser didn't return data in intent"));
            finish();
            return;
        }
        String queryParameter = data.getQueryParameter(ACSPConstants.STATUS);
        u uVar2 = this.appBindReporter;
        uVar2.getClass();
        uVar2.a(com.yandex.passport.internal.analytics.q.g, new Pair(ACSPConstants.STATUS, queryParameter == null ? "null" : queryParameter));
        if (!WriteBlocks.OK.equalsIgnoreCase(queryParameter)) {
            com.yandex.passport.legacy.a.b("Wrong status has returned from browser: " + queryParameter);
            finish();
            return;
        }
        String queryParameter2 = data.getQueryParameter("task_id");
        if (queryParameter2 == null) {
            ny61.t("task_id is null");
        } else {
            this.taskId = queryParameter2;
            loadAccount();
        }
    }

    private void showRelogin(Uid uid) {
        com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
        LoginProperties.a aVar = new LoginProperties.a();
        aVar.g(this.applicationBindProperties.getFilter());
        aVar.J = "passport/social_application_bind";
        aVar.A = com.yandex.passport.internal.util.p.A(uid);
        LoginProperties a = aVar.a();
        cVar.getClass();
        startActivityForResult(com.yandex.passport.internal.ui.router.c.a(this, a, true, null, null), 4);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null || i2 == 0) {
            com.yandex.passport.legacy.a.b("Bind application cancelled");
            u uVar = this.appBindReporter;
            uVar.getClass();
            uVar.a(com.yandex.passport.internal.analytics.q.j, new Pair("request_code", String.valueOf(i)));
            finish();
            return;
        }
        if (i == 1) {
            if (intent.getBooleanExtra(AuthSdkActivity.EXTRA_TOKEN_ERROR, false)) {
                com.yandex.passport.legacy.a.b("Accept permissions declined");
                u uVar2 = this.appBindReporter;
                uVar2.getClass();
                uVar2.a(com.yandex.passport.internal.analytics.q.c, new Pair[0]);
                finish();
                return;
            }
            String stringExtra = intent.getStringExtra(AuthSdkActivity.EXTRA_AUTHORIZATION_CODE);
            stringExtra.getClass();
            this.selectedUid = com.yandex.passport.internal.util.p.B(a0.e(intent.getExtras()).a);
            onCodeReceived(stringExtra);
            u uVar3 = this.appBindReporter;
            uVar3.getClass();
            uVar3.a(com.yandex.passport.internal.analytics.q.d, new Pair[0]);
            return;
        }
        if (i == 3) {
            this.selectedUid = com.yandex.passport.internal.util.p.B(a0.e(intent.getExtras()).a);
            loadAccount();
            u uVar4 = this.appBindReporter;
            uVar4.getClass();
            uVar4.a(com.yandex.passport.internal.analytics.q.e, new Pair[0]);
        } else if (i == 2) {
            processBrowserData(intent);
        } else if (i == 4) {
            this.selectedUid = com.yandex.passport.internal.util.p.B(a0.e(intent.getExtras()).a);
            loadAccount();
            u uVar5 = this.appBindReporter;
            uVar5.getClass();
            uVar5.a(com.yandex.passport.internal.analytics.q.f, new Pair[0]);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.accountsRetriever = a.getAccountsRetriever();
        try {
            SocialApplicationBindProperties buildApplicationBindProperties = buildApplicationBindProperties();
            this.applicationBindProperties = buildApplicationBindProperties;
            setTheme(com.yandex.passport.internal.ui.util.o.d(buildApplicationBindProperties.getTheme(), this));
            super.onCreate(bundle);
            this.clientChooser = a.getClientChooser();
            this.appBindReporter = a.getAppBindReporter();
            this.backendClient = this.clientChooser.a(com.yandex.passport.internal.util.p.u(this.applicationBindProperties.getFilter().getPrimaryEnvironment()));
            if (bundle == null) {
                this.codeChallenge = com.yandex.passport.internal.util.b.b();
                u uVar = this.appBindReporter;
                String applicationName = this.applicationBindProperties.getApplicationName();
                String clientId = this.applicationBindProperties.getClientId();
                uVar.getClass();
                com.yandex.passport.internal.analytics.q qVar = com.yandex.passport.internal.analytics.q.b;
                Pair pair = new Pair("application_name", applicationName);
                if (clientId == null) {
                    clientId = "null";
                }
                uVar.a(qVar, pair, new Pair("client_id", clientId));
                String clientId2 = this.applicationBindProperties.getClientId();
                SocialApplicationBindProperties socialApplicationBindProperties = this.applicationBindProperties;
                if (clientId2 == null) {
                    this.selectedUid = fromPassportUid(socialApplicationBindProperties.getUid());
                    onCodeReceived(null);
                } else {
                    com.yandex.passport.internal.ui.authsdk.c cVar = AuthSdkActivity.Companion;
                    String clientId3 = socialApplicationBindProperties.getClientId();
                    Filter filter = this.applicationBindProperties.getFilter();
                    PassportUidImpl uid = this.applicationBindProperties.getUid();
                    PassportTheme theme = this.applicationBindProperties.getTheme();
                    cVar.getClass();
                    Intent intent = new Intent(this, (Class<?>) AuthSdkActivity.class);
                    intent.putExtra(AuthSdkActivity.EXTRA_CLIENT_ID, clientId3);
                    intent.putExtra(AuthSdkActivity.EXTRA_RESPONSE_TYPE, AuthSdkActivity.RESPONSE_TYPE_CODE);
                    if (uid != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("passport-uid", uid);
                        intent.putExtras(bundle2);
                    }
                    Filter.Companion.getClass();
                    intent.putExtra(AuthSdkActivity.EXTRA_ACCOUNTS_FILTER, com.yandex.passport.internal.entities.f.a(filter));
                    intent.putExtra(AuthSdkActivity.EXTRA_THEME, theme.ordinal());
                    intent.putExtra(AuthSdkActivity.EXTRA_DISALLOW_ACCOUNT_CHANGE, true);
                    startActivityForResult(intent, 1);
                }
            } else {
                String string = bundle.getString(KEY_CODE_CHALLENGE);
                string.getClass();
                this.codeChallenge = string;
                this.selectedUid = (Uid) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-uid");
                this.taskId = bundle.getString(KEY_TASK_ID);
            }
            setContentView(R.layout.passport_activity_bind_social_application);
        } catch (Exception e) {
            com.yandex.passport.legacy.a.d(e);
            finish();
            super.onCreate(bundle);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.yandex.passport.legacy.lx.g gVar = this.finishBindApplicationCanceller;
        if (gVar != null) {
            gVar.a();
            this.finishBindApplicationCanceller = null;
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(KEY_CODE_CHALLENGE, this.codeChallenge);
        Uid uid = this.selectedUid;
        if (uid != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("passport-uid", uid);
            bundle.putAll(bundle2);
        }
        String str = this.taskId;
        if (str != null) {
            bundle.putString(KEY_TASK_ID, str);
        }
    }
}
