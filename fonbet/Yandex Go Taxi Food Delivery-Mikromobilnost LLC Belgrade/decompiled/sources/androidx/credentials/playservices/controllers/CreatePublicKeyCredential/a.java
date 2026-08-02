package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Base64;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.b;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import defpackage.c9f;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.g9f;
import defpackage.h9f;
import defpackage.hyf0;
import defpackage.j9f;
import defpackage.k9f;
import defpackage.l9f;
import defpackage.m9f;
import defpackage.n9f;
import defpackage.qzn;
import defpackage.r3m;
import defpackage.r9f;
import defpackage.sls;
import defpackage.tls;
import defpackage.v7f;
import defpackage.w121;
import defpackage.w7f;
import defpackage.z3k;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class a extends androidx.credentials.playservices.controllers.a {
    public static final /* synthetic */ int j = 0;
    public final Context e;
    public c9f f;
    public Executor g;
    public CancellationSignal h;
    public final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 i;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public a(Context context) {
        this.e = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.i = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                a aVar = a.this;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(2, h9f.a, g9f.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
                a aVar2 = a.this;
                Executor executor = aVar2.g;
                final CreateCredentialException createCredentialException = null;
                if (executor == null) {
                    executor = null;
                }
                c9f c9fVar = aVar2.f;
                if (c9fVar == null) {
                    c9fVar = null;
                }
                CancellationSignal cancellationSignal = aVar2.h;
                aVar.getClass();
                if (androidx.credentials.playservices.controllers.a.c(resultData, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, c9fVar, cancellationSignal)) {
                    return;
                }
                final a aVar3 = a.this;
                int i = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                aVar3.getClass();
                if (i != h9f.c) {
                    return;
                }
                if (androidx.credentials.playservices.controllers.a.d(resultCode, CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.w, new tls() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$2
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        CreateCredentialException createCredentialException2 = (CreateCredentialException) obj;
                        a aVar4 = a.this;
                        Executor executor2 = aVar4.g;
                        if (executor2 == null) {
                            executor2 = null;
                        }
                        executor2.execute(new l9f(aVar4, createCredentialException2, 0));
                        return zy11.a;
                    }
                }, aVar3.h)) {
                    return;
                }
                byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                int i2 = 0;
                if (byteArrayExtra == null) {
                    r9f r9fVar = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal2 = aVar3.h;
                    r9fVar.getClass();
                    if (r9f.a(cancellationSignal2)) {
                        return;
                    }
                    Executor executor2 = aVar3.g;
                    (executor2 != null ? executor2 : null).execute(new k9f(aVar3, i2));
                    return;
                }
                PublicKeyCredential deserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
                LinkedHashMap linkedHashMap = hyf0.a;
                AuthenticatorResponse response = deserializeFromBytes.getResponse();
                if (response instanceof AuthenticatorErrorResponse) {
                    AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
                    ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
                    r3m r3mVar = (r3m) hyf0.a.get(errorCode);
                    String errorMessage = authenticatorErrorResponse.getErrorMessage();
                    createCredentialException = r3mVar == null ? new CreatePublicKeyCredentialDomException(new w121(), g8e.o("unknown fido gms exception - ", errorMessage)) : (errorCode == ErrorCode.NOT_ALLOWED_ERR && errorMessage != null && evu0.y(errorMessage, "Unable to get sync account", false)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(r3mVar, errorMessage);
                }
                if (createCredentialException != null) {
                    androidx.credentials.playservices.controllers.a.b(aVar3.h, new sls() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            a aVar4 = a.this;
                            Executor executor3 = aVar4.g;
                            if (executor3 == null) {
                                executor3 = null;
                            }
                            executor3.execute(new l9f(aVar4, createCredentialException, 1));
                            return zy11.a;
                        }
                    });
                    return;
                }
                try {
                    final w7f g = a.g(deserializeFromBytes);
                    androidx.credentials.playservices.controllers.a.b(aVar3.h, new sls() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            a aVar4 = a.this;
                            Executor executor3 = aVar4.g;
                            if (executor3 == null) {
                                executor3 = null;
                            }
                            executor3.execute(new j9f(4, aVar4, g));
                            return zy11.a;
                        }
                    });
                } catch (JSONException e) {
                    androidx.credentials.playservices.controllers.a.b(aVar3.h, new sls() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            a aVar4 = a.this;
                            Executor executor3 = aVar4.g;
                            if (executor3 == null) {
                                executor3 = null;
                            }
                            executor3.execute(new m9f(aVar4, e, 0));
                            return zy11.a;
                        }
                    });
                } catch (Throwable th) {
                    androidx.credentials.playservices.controllers.a.b(aVar3.h, new sls() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            a aVar4 = a.this;
                            Executor executor3 = aVar4.g;
                            if (executor3 == null) {
                                executor3 = null;
                            }
                            executor3.execute(new n9f(aVar4, th, 0));
                            return zy11.a;
                        }
                    });
                }
            }
        };
    }

    public static w7f g(PublicKeyCredential publicKeyCredential) {
        try {
            String json2 = publicKeyCredential.toJson();
            new Bundle().putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", json2);
            return new w7f(json2);
        } catch (Throwable th) {
            throw new CreateCredentialUnknownException(g8e.s(th, new StringBuilder("The PublicKeyCredential response json had an unexpected exception when parsing: ")));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions] */
    /* JADX WARN: Type inference failed for: r18v3, types: [com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.String] */
    public final PublicKeyCredentialCreationOptions f(v7f v7fVar) {
        ?? r7;
        ?? r3;
        ResidentKeyRequirement residentKeyRequirement;
        ?? r5;
        LinkedHashMap linkedHashMap = hyf0.a;
        String str = v7fVar.e;
        com.google.android.gms.common.a aVar = com.google.android.gms.common.a.d;
        int i = b.a;
        Context context = this.e;
        int d = aVar.d(context, i);
        int i2 = 0;
        if (d == 0 && context.getPackageManager().getPackageInfo("com.google.android.gms", 0).getLongVersionCode() > 241217000) {
            return new PublicKeyCredentialCreationOptions(str);
        }
        JSONObject jSONObject = new JSONObject(str);
        PublicKeyCredentialCreationOptions.a aVar2 = new PublicKeyCredentialCreationOptions.a();
        String optString = jSONObject.optString("challenge", "");
        ResidentKeyRequirement residentKeyRequirement2 = null;
        if (optString.length() == 0) {
            z3k.c("Challenge not found in request or is unexpectedly empty");
            return null;
        }
        int i3 = 11;
        aVar2.c = Base64.decode(optString, 11);
        JSONObject jSONObject2 = jSONObject.getJSONObject("user");
        byte[] decode = Base64.decode(jSONObject2.getString("id"), 11);
        String string = jSONObject2.getString("name");
        String string2 = jSONObject2.getString("displayName");
        String optString2 = jSONObject2.optString("icon", "");
        if (string2.length() == 0) {
            z3k.c("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            return null;
        }
        if (decode.length == 0) {
            z3k.c("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            return null;
        }
        if (string.length() == 0) {
            z3k.c("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            return null;
        }
        aVar2.b = new PublicKeyCredentialUserEntity(decode, string, optString2, string2);
        JSONObject jSONObject3 = jSONObject.getJSONObject("rp");
        String string3 = jSONObject3.getString("id");
        String optString3 = jSONObject3.optString("name", "");
        String optString4 = jSONObject3.optString("icon", "");
        if (optString4.length() == 0) {
            optString4 = null;
        }
        if (optString3.length() == 0) {
            z3k.c("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            return null;
        }
        if (string3.length() == 0) {
            z3k.c("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            return null;
        }
        aVar2.a = new PublicKeyCredentialRpEntity(string3, optString3, optString4);
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
            LinkedHashMap linkedHashMap2 = hyf0.a;
            int i5 = (int) jSONObject4.getLong("alg");
            String optString5 = jSONObject4.optString("type", "");
            if (optString5.length() == 0) {
                z3k.c("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                return null;
            }
            try {
                COSEAlgorithmIdentifier.fromCoseValue(i5);
                arrayList.add(new PublicKeyCredentialParameters(optString5, i5));
            } catch (Throwable unused) {
            }
        }
        aVar2.d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap3 = hyf0.a;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            int length2 = jSONArray2.length();
            int i6 = 0;
            while (i6 < length2) {
                JSONObject jSONObject5 = jSONArray2.getJSONObject(i6);
                LinkedHashMap linkedHashMap4 = hyf0.a;
                byte[] decode2 = Base64.decode(jSONObject5.getString("id"), i3);
                String string4 = jSONObject5.getString("type");
                if (string4.length() == 0) {
                    ?? r18 = residentKeyRequirement2;
                    z3k.c("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    return r18;
                }
                if (decode2.length == 0) {
                    ?? r182 = residentKeyRequirement2;
                    z3k.c("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    return r182;
                }
                if (jSONObject5.has("transports")) {
                    r5 = new ArrayList();
                    JSONArray jSONArray3 = jSONObject5.getJSONArray("transports");
                    int length3 = jSONArray3.length();
                    residentKeyRequirement = residentKeyRequirement2;
                    for (int i7 = i2; i7 < length3; i7++) {
                        try {
                            r5.add(Transport.fromString(jSONArray3.getString(i7)));
                        } catch (Transport.UnsupportedTransportException e) {
                            throw new CreatePublicKeyCredentialDomException(new qzn(), e.getMessage());
                        }
                    }
                } else {
                    residentKeyRequirement = residentKeyRequirement2;
                    r5 = residentKeyRequirement;
                }
                arrayList2.add(new PublicKeyCredentialDescriptor(string4, decode2, (List<Transport>) r5));
                i6++;
                residentKeyRequirement2 = residentKeyRequirement;
                i2 = 0;
                i3 = 11;
            }
        }
        ResidentKeyRequirement residentKeyRequirement3 = residentKeyRequirement2;
        aVar2.f = arrayList2;
        LinkedHashMap linkedHashMap5 = hyf0.a;
        String optString6 = jSONObject.optString("attestation", "none");
        aVar2.h = AttestationConveyancePreference.fromString(optString6.length() != 0 ? optString6 : "none");
        if (jSONObject.has("timeout")) {
            aVar2.e = Double.valueOf(jSONObject.getLong("timeout") / 1000.0d);
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            AuthenticatorSelectionCriteria.a aVar3 = new AuthenticatorSelectionCriteria.a();
            boolean optBoolean = jSONObject6.optBoolean("requireResidentKey", false);
            String optString7 = jSONObject6.optString("residentKey", "");
            ResidentKeyRequirement fromString = optString7.length() > 0 ? ResidentKeyRequirement.fromString(optString7) : residentKeyRequirement3;
            aVar3.b = Boolean.valueOf(optBoolean);
            aVar3.c = fromString;
            String optString8 = jSONObject6.optString("authenticatorAttachment", "");
            if (optString8.length() > 0) {
                aVar3.a = Attachment.fromString(optString8);
            }
            Attachment attachment = aVar3.a;
            ?? attachment2 = attachment == null ? residentKeyRequirement3 : attachment.toString();
            Boolean bool = aVar3.b;
            ResidentKeyRequirement residentKeyRequirement4 = aVar3.c;
            if (residentKeyRequirement4 == null) {
                ResidentKeyRequirement residentKeyRequirement5 = residentKeyRequirement3;
                r7 = residentKeyRequirement5;
                r3 = residentKeyRequirement5;
            } else {
                r7 = residentKeyRequirement3;
                r3 = residentKeyRequirement4.toString();
            }
            aVar2.g = new AuthenticatorSelectionCriteria(attachment2, bool, r7, r3);
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            AuthenticationExtensions.a aVar4 = new AuthenticationExtensions.a();
            String optString9 = jSONObject7.optString("appid", "");
            if (optString9.length() > 0) {
                aVar4.a = new FidoAppIdExtension(optString9);
            }
            if (jSONObject7.optBoolean("thirdPartyPayment", false)) {
                aVar4.i = new GoogleThirdPartyPaymentExtension(true);
            }
            if (jSONObject7.optBoolean("uvm", false)) {
                aVar4.b = new UserVerificationMethodExtension(true);
            }
            aVar2.i = aVar4.a();
        }
        return aVar2.a();
    }

    public final void h(v7f v7fVar, c9f c9fVar, Executor executor, CancellationSignal cancellationSignal) {
        this.h = cancellationSignal;
        this.f = c9fVar;
        this.g = executor;
        try {
            PublicKeyCredentialCreationOptions f = f(v7fVar);
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (r9f.a(cancellationSignal)) {
                return;
            }
            Context context = this.e;
            Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
            intent.putExtra("REQUEST_TYPE", f);
            h9f.a(this.i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                androidx.credentials.playservices.controllers.a.b(cancellationSignal, new sls() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        a aVar = a.this;
                        Executor executor2 = aVar.g;
                        if (executor2 == null) {
                            executor2 = null;
                        }
                        executor2.execute(new k9f(aVar, 1));
                        return zy11.a;
                    }
                });
            }
        } catch (JSONException e) {
            androidx.credentials.playservices.controllers.a.b(cancellationSignal, new sls() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a aVar = a.this;
                    Executor executor2 = aVar.g;
                    if (executor2 == null) {
                        executor2 = null;
                    }
                    executor2.execute(new m9f(aVar, e, 1));
                    return zy11.a;
                }
            });
        } catch (Throwable th) {
            androidx.credentials.playservices.controllers.a.b(cancellationSignal, new sls() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a aVar = a.this;
                    Executor executor2 = aVar.g;
                    if (executor2 == null) {
                        executor2 = null;
                    }
                    executor2.execute(new n9f(aVar, th, 1));
                    return zy11.a;
                }
            });
        }
    }
}
