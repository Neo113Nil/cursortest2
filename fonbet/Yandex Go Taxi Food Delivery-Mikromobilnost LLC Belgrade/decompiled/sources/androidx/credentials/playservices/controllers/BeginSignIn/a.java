package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.c9f;
import defpackage.cvw;
import defpackage.e9f;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.g9f;
import defpackage.gtt;
import defpackage.gyf0;
import defpackage.h191;
import defpackage.h9f;
import defpackage.htt;
import defpackage.hyf0;
import defpackage.i9f;
import defpackage.j9f;
import defpackage.l7a;
import defpackage.mtb1;
import defpackage.ny61;
import defpackage.o091;
import defpackage.oat;
import defpackage.oxe;
import defpackage.q5t;
import defpackage.r3m;
import defpackage.r9f;
import defpackage.s5t;
import defpackage.sls;
import defpackage.tls;
import defpackage.up90;
import defpackage.w121;
import defpackage.z3k;
import defpackage.zbt;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class a extends androidx.credentials.playservices.controllers.a {
    public static final /* synthetic */ int j = 0;
    public final Context e;
    public c9f f;
    public Executor g;
    public CancellationSignal h;
    public final CredentialProviderBeginSignInController$resultReceiver$1 i;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1] */
    public a(Context context) {
        this.e = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.i = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1
            /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.credentials.exceptions.GetCredentialInterruptedException] */
            /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
            /* JADX WARN: Type inference failed for: r0v8, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                a aVar = a.this;
                CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 credentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(2, h9f.a, g9f.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
                a aVar2 = a.this;
                Executor executor = aVar2.g;
                if (executor == null) {
                    executor = null;
                }
                c9f c9fVar = aVar2.f;
                c9f c9fVar2 = c9fVar != null ? c9fVar : null;
                CancellationSignal cancellationSignal = aVar2.h;
                aVar.getClass();
                if (androidx.credentials.playservices.controllers.a.c(resultData, credentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1, executor, c9fVar2, cancellationSignal)) {
                    return;
                }
                final a aVar3 = a.this;
                int i = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                aVar3.getClass();
                if (i != h9f.c) {
                    return;
                }
                if (androidx.credentials.playservices.controllers.a.e(resultCode, CredentialProviderBeginSignInController$handleResponse$1.w, new tls() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$2
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        GetCredentialException getCredentialException = (GetCredentialException) obj;
                        a aVar4 = a.this;
                        Executor executor2 = aVar4.g;
                        if (executor2 == null) {
                            executor2 = null;
                        }
                        executor2.execute(new i9f(aVar4, getCredentialException, 0));
                        return zy11.a;
                    }
                }, aVar3.h)) {
                    return;
                }
                try {
                    Context context2 = aVar3.e;
                    cvw.l(context2);
                    final s5t f = aVar3.f(new o091(context2, new h191()).g(intent));
                    androidx.credentials.playservices.controllers.a.b(aVar3.h, new sls() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            a aVar4 = a.this;
                            Executor executor2 = aVar4.g;
                            if (executor2 == null) {
                                executor2 = null;
                            }
                            executor2.execute(new l7a(28, aVar4, f));
                            return zy11.a;
                        }
                    });
                } catch (GetCredentialException e) {
                    androidx.credentials.playservices.controllers.a.b(aVar3.h, new sls() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            a aVar4 = a.this;
                            Executor executor2 = aVar4.g;
                            if (executor2 == null) {
                                executor2 = null;
                            }
                            executor2.execute(new i9f(aVar4, e, 1));
                            return zy11.a;
                        }
                    });
                } catch (ApiException e2) {
                    final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = new GetCredentialUnknownException(e2.getMessage());
                    if (e2.b() == 16) {
                        ref$ObjectRef.element = new GetCredentialCancellationException(e2.getMessage());
                    } else if (h9f.b.contains(Integer.valueOf(e2.b()))) {
                        ref$ObjectRef.element = new GetCredentialInterruptedException(e2.getMessage());
                    }
                    androidx.credentials.playservices.controllers.a.b(aVar3.h, new sls() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            a aVar4 = a.this;
                            Executor executor2 = aVar4.g;
                            if (executor2 == null) {
                                executor2 = null;
                            }
                            executor2.execute(new l7a(29, aVar4, ref$ObjectRef));
                            return zy11.a;
                        }
                    });
                } catch (Throwable th) {
                    final GetCredentialUnknownException getCredentialUnknownException = new GetCredentialUnknownException(th.getMessage());
                    androidx.credentials.playservices.controllers.a.b(aVar3.h, new sls() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            a aVar4 = a.this;
                            Executor executor2 = aVar4.g;
                            if (executor2 == null) {
                                executor2 = null;
                            }
                            executor2.execute(new j9f(0, aVar4, getCredentialUnknownException));
                            return zy11.a;
                        }
                    });
                }
            }
        };
    }

    public final s5t f(SignInCredential signInCredential) {
        mtb1 mtb1Var;
        String json2;
        if (signInCredential.getPassword() != null) {
            String id = signInCredential.getId();
            String password = signInCredential.getPassword();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            mtb1Var = new up90(id, password);
        } else {
            if (signInCredential.getGoogleIdToken() != null) {
                gtt gttVar = new gtt();
                gttVar.a = signInCredential.getId();
                gttVar.b = signInCredential.getGoogleIdToken();
                if (signInCredential.getDisplayName() != null) {
                    gttVar.c = signInCredential.getDisplayName();
                }
                if (signInCredential.getGivenName() != null) {
                    gttVar.e = signInCredential.getGivenName();
                }
                if (signInCredential.getFamilyName() != null) {
                    gttVar.d = signInCredential.getFamilyName();
                }
                if (signInCredential.getPhoneNumber() != null) {
                    gttVar.g = signInCredential.getPhoneNumber();
                }
                if (signInCredential.getProfilePictureUri() != null) {
                    gttVar.f = signInCredential.getProfilePictureUri();
                }
                String str = gttVar.a;
                String str2 = gttVar.b;
                String str3 = gttVar.c;
                String str4 = gttVar.d;
                String str5 = gttVar.e;
                Uri uri = gttVar.f;
                String str6 = gttVar.g;
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
                bundle2.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
                htt httVar = new htt("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL");
                if (str.length() <= 0) {
                    ny61.g("id should not be empty");
                    return null;
                }
                if (str2.length() <= 0) {
                    ny61.g("idToken should not be empty");
                    return null;
                }
                mtb1Var = httVar;
            } else if (signInCredential.getPublicKeyCredential() != null) {
                LinkedHashMap linkedHashMap = hyf0.a;
                JSONObject jSONObject = new JSONObject();
                PublicKeyCredential publicKeyCredential = signInCredential.getPublicKeyCredential();
                AuthenticatorResponse response = publicKeyCredential != null ? publicKeyCredential.getResponse() : null;
                if (response instanceof AuthenticatorErrorResponse) {
                    AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
                    ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
                    String errorMessage = authenticatorErrorResponse.getErrorMessage();
                    r3m r3mVar = (r3m) hyf0.a.get(errorCode);
                    if (r3mVar == null) {
                        throw new GetPublicKeyCredentialDomException(new w121(), g8e.o("unknown fido gms exception - ", errorMessage));
                    }
                    if (errorCode == ErrorCode.NOT_ALLOWED_ERR && errorMessage != null && evu0.y(errorMessage, "Unable to get sync account", false)) {
                        throw new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.");
                    }
                    throw new GetPublicKeyCredentialDomException(r3mVar, errorMessage);
                }
                if (response instanceof AuthenticatorAssertionResponse) {
                    try {
                        json2 = publicKeyCredential.toJson();
                    } catch (Throwable th) {
                        throw new GetCredentialUnknownException(g8e.s(th, new StringBuilder("The PublicKeyCredential response json had an unexpected exception when parsing: ")));
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(response.getClass().getName()));
                    json2 = jSONObject.toString();
                }
                new Bundle().putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", json2);
                mtb1Var = new gyf0(json2);
            } else {
                mtb1Var = null;
            }
        }
        if (mtb1Var != null) {
            return new s5t(mtb1Var);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    public final void g(q5t q5tVar, CancellationSignal cancellationSignal, Executor executor, c9f c9fVar) {
        this.h = cancellationSignal;
        this.f = c9fVar;
        this.g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (r9f.a(cancellationSignal)) {
            return;
        }
        BeginSignInRequest.a aVar = new BeginSignInRequest.a();
        Context context = this.e;
        long j2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        boolean z = false;
        boolean z2 = false;
        for (e9f e9fVar : q5tVar.a) {
            if (e9fVar instanceof oat) {
                BeginSignInRequest.PasswordRequestOptions.a aVar2 = new BeginSignInRequest.PasswordRequestOptions.a();
                aVar2.a = true;
                aVar.a = new BeginSignInRequest.PasswordRequestOptions(aVar2.a);
                z = z || e9fVar.d;
            } else if ((e9fVar instanceof zbt) && !z2) {
                if (j2 >= 231815000) {
                    LinkedHashMap linkedHashMap = hyf0.a;
                    BeginSignInRequest.PasskeyJsonRequestOptions.a aVar3 = new BeginSignInRequest.PasskeyJsonRequestOptions.a();
                    aVar3.a = true;
                    aVar3.b = ((zbt) e9fVar).f;
                    aVar.d = new BeginSignInRequest.PasskeyJsonRequestOptions(aVar3.a, aVar3.b);
                } else {
                    LinkedHashMap linkedHashMap2 = hyf0.a;
                    JSONObject jSONObject = new JSONObject(((zbt) e9fVar).f);
                    String optString = jSONObject.optString("rpId", "");
                    if (optString.length() == 0) {
                        z3k.c("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                        return;
                    }
                    String optString2 = jSONObject.optString("challenge", "");
                    if (optString2.length() == 0) {
                        z3k.c("Challenge not found in request or is unexpectedly empty");
                        return;
                    }
                    byte[] decode = Base64.decode(optString2, 11);
                    BeginSignInRequest.PasskeysRequestOptions.a aVar4 = new BeginSignInRequest.PasskeysRequestOptions.a();
                    aVar4.a = true;
                    aVar4.c = optString;
                    aVar4.b = decode;
                    aVar.c = new BeginSignInRequest.PasskeysRequestOptions(aVar4.a, aVar4.b, aVar4.c);
                }
                z2 = true;
            }
        }
        if (j2 > 241217000) {
            aVar.h = false;
        }
        aVar.f = z;
        BeginSignInRequest beginSignInRequest = new BeginSignInRequest(aVar.a, aVar.b, aVar.e, aVar.f, aVar.g, aVar.c, aVar.d, aVar.h);
        Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", beginSignInRequest);
        h9f.a(this.i, intent, "BEGIN_SIGN_IN");
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            androidx.credentials.playservices.controllers.a.b(cancellationSignal, new sls() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$invokePlayServices$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a aVar5 = a.this;
                    Executor executor2 = aVar5.g;
                    if (executor2 == null) {
                        executor2 = null;
                    }
                    executor2.execute(new oxe(2, aVar5));
                    return zy11.a;
                }
            });
        }
    }
}
