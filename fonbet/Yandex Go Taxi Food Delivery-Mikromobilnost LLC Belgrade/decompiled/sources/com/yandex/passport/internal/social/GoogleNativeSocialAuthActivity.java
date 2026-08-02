package com.yandex.passport.internal.social;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.yandex.passport.R;
import com.yandex.passport.internal.n;
import defpackage.a191;
import defpackage.cvw;
import defpackage.f191;
import defpackage.hdy;
import defpackage.jm2;
import defpackage.ngz;
import defpackage.nwt;
import defpackage.oyr;
import defpackage.uh3;
import defpackage.uyj0;
import defpackage.vst;
import defpackage.w091;
import defpackage.wst;
import defpackage.xst;
import defpackage.xyj0;
import defpackage.yst;
import defpackage.zm2;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class GoogleNativeSocialAuthActivity extends AppCompatActivity {
    private static final String KEY_AUTHORIZATION_STARTED = "authorization-started";
    private static final Scope MAILISH_SCOPE = new Scope("https://mail.google.com/");
    private static final int RC_AUTHORIZE_CONTACTS = 200;
    private String accountName;
    private Runnable foregroundRunnable;
    private yst googleApiClient;
    private boolean isAuthorizationStarted;
    private boolean isForeground;
    private boolean isMailish;
    private String serverClientId;
    private final xst connectionFailedListener = new xst() { // from class: com.yandex.passport.internal.social.a
        @Override // defpackage.yx60
        public final void onConnectionFailed(ConnectionResult connectionResult) {
            GoogleNativeSocialAuthActivity.this.lambda$new$0(connectionResult);
        }
    };
    private final wst connectionCallbacks = new c(this);
    private final xyj0 resultCallback = new xyj0() { // from class: com.yandex.passport.internal.social.b
        @Override // defpackage.xyj0
        public final void a(uyj0 uyj0Var) {
            GoogleNativeSocialAuthActivity.this.lambda$new$1((Status) uyj0Var);
        }
    };

    private yst createApiClient() {
        vst vstVar = new vst(this);
        xst xstVar = this.connectionFailedListener;
        hdy hdyVar = new hdy(this);
        vstVar.i = 0;
        vstVar.j = xstVar;
        vstVar.h = hdyVar;
        zm2 zm2Var = uh3.a;
        GoogleSignInOptions createGoogleSignInOptions = createGoogleSignInOptions(this.accountName);
        cvw.m(zm2Var, "Api must not be null");
        cvw.m(createGoogleSignInOptions, "Null options are not permitted for this Api");
        vstVar.g.put(zm2Var, createGoogleSignInOptions);
        jm2 jm2Var = zm2Var.a;
        cvw.m(jm2Var, "Base client builder must not be null");
        List a = jm2Var.a(createGoogleSignInOptions);
        vstVar.b.addAll(a);
        vstVar.a.addAll(a);
        wst wstVar = this.connectionCallbacks;
        cvw.m(wstVar, "Listener must not be null");
        vstVar.n.add(wstVar);
        return vstVar.b();
    }

    private GoogleSignInOptions createGoogleSignInOptions(String str) {
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN);
        String str2 = this.serverClientId;
        boolean z = this.isMailish;
        boolean z2 = true;
        aVar.b = true;
        cvw.i(str2);
        String str3 = aVar.e;
        if (str3 != null && !str3.equals(str2)) {
            z2 = false;
        }
        cvw.d("two different server client ids provided", z2);
        aVar.e = str2;
        aVar.c = z;
        Scope scope = GoogleSignInOptions.zab;
        HashSet hashSet = aVar.a;
        hashSet.add(scope);
        hashSet.add(GoogleSignInOptions.zaa);
        if (!TextUtils.isEmpty(str)) {
            cvw.i(str);
            aVar.f = new Account(str, "com.google");
        }
        if (this.isMailish) {
            hashSet.add(MAILISH_SCOPE);
            hashSet.addAll(Arrays.asList(new Scope[0]));
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ConnectionResult connectionResult) {
        NativeSocialHelper.onFailure(this, new Exception(oyr.l(connectionResult.getErrorCode(), "GoogleApiClient connection failed(code=", ", message=", connectionResult.getErrorMessage(), Extension.C_BRAKE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Status status) {
        if (this.isForeground) {
            startAuthorization();
        } else {
            this.foregroundRunnable = new n(3, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAuthorization() {
        this.isAuthorizationStarted = true;
        w091 w091Var = uh3.b;
        yst ystVar = this.googleApiClient;
        w091Var.getClass();
        startActivityForResult(f191.a(ystVar.h(), ((a191) ystVar.f(uh3.c)).a0), 200);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        nwt nwtVar;
        super.onActivityResult(i, i2, intent);
        if (i == 200) {
            uh3.b.getClass();
            ngz ngzVar = f191.a;
            if (intent == null) {
                nwtVar = new nwt(null, Status.RESULT_INTERNAL_ERROR);
            } else {
                Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
                if (googleSignInAccount == null) {
                    if (status == null) {
                        status = Status.RESULT_INTERNAL_ERROR;
                    }
                    nwtVar = new nwt(null, status);
                } else {
                    nwtVar = new nwt(googleSignInAccount, Status.RESULT_SUCCESS);
                }
            }
            Status status2 = nwtVar.a;
            if (status2.isSuccess()) {
                GoogleSignInAccount googleSignInAccount2 = nwtVar.b;
                if (googleSignInAccount2 == null) {
                    NativeSocialHelper.onFailure(this, new Exception("GoogleSignInAccount null"));
                    return;
                }
                String serverAuthCode = googleSignInAccount2.getServerAuthCode();
                if (serverAuthCode == null) {
                    NativeSocialHelper.onFailure(this, new Exception("server auth code null"));
                    return;
                } else {
                    NativeSocialHelper.onTokenReceived(this, serverAuthCode, this.serverClientId);
                    return;
                }
            }
            if (status2.isCanceled()) {
                NativeSocialHelper.onCancel(this);
                return;
            }
            if (status2.getStatusCode() == 12501) {
                NativeSocialHelper.onCancel(this);
                return;
            }
            if (status2.getStatusCode() == 13) {
                NativeSocialHelper.onCancel(this);
            } else {
                if (status2.getStatusCode() == 7) {
                    NativeSocialHelper.onFailure(this, new IOException("Google auth network error"));
                    return;
                }
                NativeSocialHelper.onFailure(this, new Exception("Google auth failed: " + status2.getStatusCode()));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.serverClientId = getString(R.string.passport_default_google_client_id);
        this.isMailish = "com.yandex.passport.action.NATIVE_MAILISH_GOOGLE_AUTH".equals(getIntent().getAction());
        this.accountName = getIntent().getStringExtra("account-name");
        if (bundle != null) {
            this.isAuthorizationStarted = bundle.getBoolean(KEY_AUTHORIZATION_STARTED);
        }
        this.googleApiClient = createApiClient();
        if (!this.isAuthorizationStarted) {
            if (com.yandex.passport.common.util.a.c(this)) {
                this.googleApiClient.b();
            } else {
                NativeSocialHelper.onNativeNotSupported(this);
            }
        }
        com.yandex.passport.legacy.a.a("onCreate: test for Logger.d() method in ':passport-social' module");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.googleApiClient.c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.isForeground = false;
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.isForeground = true;
        Runnable runnable = this.foregroundRunnable;
        if (runnable != null) {
            runnable.run();
            this.foregroundRunnable = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(KEY_AUTHORIZATION_STARTED, this.isAuthorizationStarted);
    }
}
