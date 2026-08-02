package androidx.credentials.playservices;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.internal.p000authapi.a;
import com.google.android.gms.tasks.zzw;
import defpackage.a4b1;
import defpackage.atx0;
import defpackage.cvw;
import defpackage.d191;
import defpackage.dtx0;
import defpackage.fgu;
import defpackage.g9f;
import defpackage.ggu;
import defpackage.h9f;
import defpackage.mm2;
import defpackage.n091;
import defpackage.nb1;
import defpackage.o091;
import defpackage.pui0;
import defpackage.q091;
import defpackage.qsb1;
import defpackage.rn2;
import defpackage.rst;
import defpackage.sst;
import defpackage.tls;
import defpackage.ubb1;
import defpackage.xwq;
import defpackage.ysx0;
import defpackage.zm2;
import defpackage.zsx0;
import defpackage.zwq;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\bJ)\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "restoreState", "(Landroid/os/Bundle;)V", "handleCreatePublicKeyCredential", "Landroid/os/ResultReceiver;", "resultReceiver", "", "errName", "errMsg", "setupFailure", "(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V", "handleGetSignInIntent", "handleBeginSignIn", "handleCreatePassword", "onCreate", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/os/ResultReceiver;", "", "mWaitingForActivityResult", "Z", "Companion", "ggu", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class HiddenActivity extends Activity {
    public static final ggu Companion = new ggu();
    private static final int DEFAULT_VALUE = 1;
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    private static final String TAG = "HiddenActivity";
    private boolean mWaitingForActivityResult;
    private ResultReceiver resultReceiver;

    private final void handleBeginSignIn() {
        zzw zzwVar;
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        final int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (beginSignInRequest != null) {
            o091 a = a4b1.a(this);
            BeginSignInRequest.a zba = BeginSignInRequest.zba(beginSignInRequest);
            zba.e = a.k;
            BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(zba.a, zba.b, zba.e, zba.f, zba.g, zba.c, zba.d, zba.h);
            ysx0 a2 = zsx0.a();
            a2.c = new Feature[]{new Feature("auth_api_credentials_begin_sign_in", 8L)};
            a2.a = new a(a, beginSignInRequest2, 2);
            a2.b = false;
            a2.d = 1553;
            zzwVar = a.d(0, a2.a());
            nb1 nb1Var = new nb1(8, new tls() { // from class: androidx.credentials.playservices.HiddenActivity$handleBeginSignIn$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ResultReceiver resultReceiver;
                    BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
                    try {
                        HiddenActivity.this.mWaitingForActivityResult = true;
                        HiddenActivity.this.startIntentSenderForResult(beginSignInResult.getPendingIntent().getIntentSender(), intExtra, null, 0, 0, 0, null);
                    } catch (IntentSender.SendIntentException e) {
                        HiddenActivity hiddenActivity = HiddenActivity.this;
                        resultReceiver = hiddenActivity.resultReceiver;
                        hiddenActivity.setupFailure(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e.getMessage());
                    }
                    return zy11.a;
                }
            });
            zzwVar.getClass();
            qsb1 qsb1Var = dtx0.a;
            zzwVar.g(qsb1Var, nb1Var);
            zzwVar.e(qsb1Var, new fgu(this, 3));
        } else {
            zzwVar = null;
        }
        if (zzwVar == null) {
            Log.i(TAG, "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        if (exc instanceof ApiException) {
            g9f g9fVar = h9f.a;
            if (h9f.b.contains(Integer.valueOf(((ApiException) exc).b()))) {
                str = "GET_INTERRUPTED";
                hiddenActivity.setupFailure(hiddenActivity.resultReceiver, str, "During begin sign in, failure response from one tap: " + exc.getMessage());
            }
        }
        str = "GET_NO_CREDENTIALS";
        hiddenActivity.setupFailure(hiddenActivity.resultReceiver, str, "During begin sign in, failure response from one tap: " + exc.getMessage());
    }

    private final void handleCreatePassword() {
        zzw zzwVar;
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int i = 1;
        final int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (savePasswordRequest != null) {
            n091 n091Var = new n091(this, new d191());
            SavePasswordRequest.a zba = SavePasswordRequest.zba(savePasswordRequest);
            zba.b = n091Var.k;
            SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(zba.a, zba.b, zba.c);
            ysx0 a = zsx0.a();
            a.c = new Feature[]{q091.b};
            a.a = new a(n091Var, savePasswordRequest2, 0);
            a.b = false;
            a.d = HProv.ALG_TYPE_BLOCK;
            zzwVar = n091Var.d(0, a.a());
            nb1 nb1Var = new nb1(6, new tls() { // from class: androidx.credentials.playservices.HiddenActivity$handleCreatePassword$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ResultReceiver resultReceiver;
                    SavePasswordResult savePasswordResult = (SavePasswordResult) obj;
                    try {
                        HiddenActivity.this.mWaitingForActivityResult = true;
                        HiddenActivity.this.startIntentSenderForResult(savePasswordResult.getPendingIntent().getIntentSender(), intExtra, null, 0, 0, 0, null);
                    } catch (IntentSender.SendIntentException e) {
                        HiddenActivity hiddenActivity = HiddenActivity.this;
                        resultReceiver = hiddenActivity.resultReceiver;
                        hiddenActivity.setupFailure(resultReceiver, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e.getMessage());
                    }
                    return zy11.a;
                }
            });
            zzwVar.getClass();
            qsb1 qsb1Var = dtx0.a;
            zzwVar.g(qsb1Var, nb1Var);
            zzwVar.e(qsb1Var, new fgu(this, i));
        } else {
            zzwVar = null;
        }
        if (zzwVar == null) {
            Log.i(TAG, "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        if (exc instanceof ApiException) {
            g9f g9fVar = h9f.a;
            if (h9f.b.contains(Integer.valueOf(((ApiException) exc).b()))) {
                str = "CREATE_INTERRUPTED";
                hiddenActivity.setupFailure(hiddenActivity.resultReceiver, str, "During save password, found password failure response from one tap " + exc.getMessage());
            }
        }
        str = "CREATE_UNKNOWN";
        hiddenActivity.setupFailure(hiddenActivity.resultReceiver, str, "During save password, found password failure response from one tap " + exc.getMessage());
    }

    private final void handleCreatePublicKeyCredential() {
        final HiddenActivity hiddenActivity;
        zzw zzwVar;
        final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra("REQUEST_TYPE");
        final int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (publicKeyCredentialCreationOptions != null) {
            int i = zwq.a;
            zm2 zm2Var = xwq.k;
            rn2 rn2Var = new rn2();
            rst rstVar = new rst();
            rstVar.a = rn2Var;
            Looper mainLooper = getMainLooper();
            cvw.m(mainLooper, "Looper must not be null.");
            rstVar.b = mainLooper;
            sst a = rstVar.a();
            hiddenActivity = this;
            final xwq xwqVar = new xwq(hiddenActivity, this, zm2Var, mm2.V0, a);
            ysx0 a2 = zsx0.a();
            a2.a = new pui0() { // from class: com.google.android.gms.fido.fido2.a
                @Override // defpackage.pui0
                public final void accept(Object obj, Object obj2) {
                    ((com.google.android.gms.internal.fido.zzs) ((ubb1) obj).i()).zzc(new zzf(xwq.this, (atx0) obj2), publicKeyCredentialCreationOptions);
                }
            };
            a2.d = 5407;
            zzwVar = xwqVar.d(0, a2.a());
            nb1 nb1Var = new nb1(5, new tls() { // from class: androidx.credentials.playservices.HiddenActivity$handleCreatePublicKeyCredential$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ResultReceiver resultReceiver;
                    PendingIntent pendingIntent = (PendingIntent) obj;
                    try {
                        HiddenActivity.this.mWaitingForActivityResult = true;
                        HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), intExtra, null, 0, 0, 0, null);
                    } catch (IntentSender.SendIntentException e) {
                        HiddenActivity hiddenActivity2 = HiddenActivity.this;
                        resultReceiver = hiddenActivity2.resultReceiver;
                        hiddenActivity2.setupFailure(resultReceiver, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e.getMessage());
                    }
                    return zy11.a;
                }
            });
            zzwVar.getClass();
            qsb1 qsb1Var = dtx0.a;
            zzwVar.g(qsb1Var, nb1Var);
            zzwVar.e(qsb1Var, new fgu(hiddenActivity, 0));
        } else {
            hiddenActivity = this;
            zzwVar = null;
        }
        if (zzwVar == null) {
            hiddenActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        if (exc instanceof ApiException) {
            g9f g9fVar = h9f.a;
            if (h9f.b.contains(Integer.valueOf(((ApiException) exc).b()))) {
                str = "CREATE_INTERRUPTED";
                hiddenActivity.setupFailure(hiddenActivity.resultReceiver, str, "During create public key credential, fido registration failure: " + exc.getMessage());
            }
        }
        str = "CREATE_UNKNOWN";
        hiddenActivity.setupFailure(hiddenActivity.resultReceiver, str, "During create public key credential, fido registration failure: " + exc.getMessage());
    }

    private final void handleGetSignInIntent() {
        zzw zzwVar;
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        final int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (getSignInIntentRequest != null) {
            o091 a = a4b1.a(this);
            GetSignInIntentRequest.a zba = GetSignInIntentRequest.zba(getSignInIntentRequest);
            zba.c = a.k;
            GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(zba.a, zba.b, zba.c, zba.d, zba.e, zba.f);
            ysx0 a2 = zsx0.a();
            a2.c = new Feature[]{q091.c};
            a2.a = new a(a, getSignInIntentRequest2, 3);
            a2.d = 1555;
            zzwVar = a.d(0, a2.a());
            nb1 nb1Var = new nb1(7, new tls() { // from class: androidx.credentials.playservices.HiddenActivity$handleGetSignInIntent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ResultReceiver resultReceiver;
                    PendingIntent pendingIntent = (PendingIntent) obj;
                    try {
                        HiddenActivity.this.mWaitingForActivityResult = true;
                        HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), intExtra, null, 0, 0, 0, null);
                    } catch (IntentSender.SendIntentException e) {
                        HiddenActivity hiddenActivity = HiddenActivity.this;
                        resultReceiver = hiddenActivity.resultReceiver;
                        hiddenActivity.setupFailure(resultReceiver, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e.getMessage());
                    }
                    return zy11.a;
                }
            });
            zzwVar.getClass();
            qsb1 qsb1Var = dtx0.a;
            zzwVar.g(qsb1Var, nb1Var);
            zzwVar.e(qsb1Var, new fgu(this, 2));
        } else {
            zzwVar = null;
        }
        if (zzwVar == null) {
            Log.i(TAG, "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        if (exc instanceof ApiException) {
            g9f g9fVar = h9f.a;
            if (h9f.b.contains(Integer.valueOf(((ApiException) exc).b()))) {
                str = "GET_INTERRUPTED";
                hiddenActivity.setupFailure(hiddenActivity.resultReceiver, str, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
            }
        }
        str = "GET_NO_CREDENTIALS";
        hiddenActivity.setupFailure(hiddenActivity.resultReceiver, str, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
    }

    private final void restoreState(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            this.mWaitingForActivityResult = savedInstanceState.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver, String errName, String errMsg) {
        g9f g9fVar = h9f.a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", errName);
        bundle.putString("EXCEPTION_MESSAGE", errMsg);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            g9f g9fVar = h9f.a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", false);
            bundle.putInt("ACTIVITY_REQUEST_CODE", requestCode);
            bundle.putParcelable("RESULT_DATA", data);
            resultReceiver.send(resultCode, bundle);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(savedInstanceState);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        handleBeginSignIn();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        handleCreatePublicKeyCredential();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        handleCreatePassword();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        handleGetSignInIntent();
                        return;
                    }
                    break;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        outState.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }
}
