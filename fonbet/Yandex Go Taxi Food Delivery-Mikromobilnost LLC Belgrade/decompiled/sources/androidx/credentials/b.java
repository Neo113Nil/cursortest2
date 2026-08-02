package androidx.credentials;

import android.content.Context;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import defpackage.a3h0;
import defpackage.b43;
import defpackage.c9f;
import defpackage.cvu0;
import defpackage.d6f;
import defpackage.e6f;
import defpackage.e9f;
import defpackage.evu0;
import defpackage.exa1;
import defpackage.f4f;
import defpackage.f9f;
import defpackage.h4f;
import defpackage.jtb1;
import defpackage.kde;
import defpackage.ltb1;
import defpackage.mc3;
import defpackage.ny61;
import defpackage.o9f;
import defpackage.q5t;
import defpackage.s5t;
import defpackage.sls;
import defpackage.v7f;
import defpackage.vbb;
import defpackage.w7f;
import defpackage.wi5;
import defpackage.zy11;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class b implements f9f {
    public final CredentialManager a;

    public b(Context context) {
        this.a = o9f.h(context.getSystemService(URLCredentialContract.FeedEntry.TABLE_NAME));
    }

    @Override // defpackage.f9f
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override // defpackage.f9f
    public final void onCreateCredential(Context context, final f4f f4fVar, CancellationSignal cancellationSignal, Executor executor, final c9f c9fVar) {
        CreateCredentialRequest.Builder isSystemProviderRequired;
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider;
        CreateCredentialRequest build;
        final mc3 mc3Var = (mc3) c9fVar;
        sls slsVar = new sls() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onCreateCredential$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                mc3Var.c(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
                return zy11.a;
            }
        };
        if (this.a == null) {
            slsVar.invoke();
            return;
        }
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onCreateCredential$outcome$1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onError(CreateCredentialException error) {
                String type;
                String message;
                CreateCredentialCustomException createCredentialCustomException;
                Object obj;
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                c9f c9fVar2 = c9f.this;
                this.getClass();
                type = error.getType();
                message = error.getMessage();
                switch (type.hashCode()) {
                    case -2055374133:
                        if (type.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                            obj = new CreateCredentialCancellationException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            int i = CreatePublicKeyCredentialException.a;
                            String obj2 = message != null ? message.toString() : null;
                            try {
                            } catch (FrameworkClassParsingException unused) {
                                createCredentialCustomException = new CreateCredentialCustomException(type, obj2);
                            }
                            if (!evu0.y(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                                throw new FrameworkClassParsingException();
                            }
                            int i2 = CreatePublicKeyCredentialDomException.b;
                            obj = jtb1.d(type, obj2);
                            c9fVar2.c(obj);
                            return;
                        }
                        createCredentialCustomException = new CreateCredentialCustomException(type, message);
                        obj = createCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    case -1166690414:
                        if (type.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                            obj = new CreateCredentialUnsupportedException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = createCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    case -580283253:
                        if (type.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                            obj = new CreateCredentialProviderConfigurationException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = createCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    case 1316905704:
                        if (type.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                            obj = new CreateCredentialUnknownException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = createCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    case 2092588512:
                        if (type.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                            obj = new CreateCredentialInterruptedException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = createCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    case 2131915191:
                        if (type.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                            obj = new CreateCredentialNoCreateOptionException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = createCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    default:
                        if (cvu0.x(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = createCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                }
            }

            public void onResult(CreateCredentialResponse response) {
                Bundle data;
                Object h4fVar;
                Log.i("CredManProvService", "Create Result returned from framework: ");
                c9f c9fVar2 = c9f.this;
                String str = f4fVar.a;
                data = response.getData();
                try {
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        h4fVar = new e6f();
                    } else {
                        if (!str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                            throw new FrameworkClassParsingException();
                        }
                        try {
                            h4fVar = new w7f(data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
                        } catch (Exception unused) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                } catch (FrameworkClassParsingException unused2) {
                    h4fVar = new h4f();
                    if (str.length() <= 0) {
                        ny61.g("type should not be empty");
                        return;
                    }
                }
                c9fVar2.onResult(h4fVar);
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(o9f.f(obj));
            }

            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(o9f.d(th));
            }
        };
        CredentialManager credentialManager = this.a;
        o9f.A();
        String str = f4fVar.a;
        Bundle bundle = f4fVar.b;
        vbb vbbVar = f4fVar.d;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (CharSequence) vbbVar.a);
        CharSequence charSequence = (CharSequence) vbbVar.b;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, f4fVar instanceof d6f ? a3h0.ic_password : f4fVar instanceof v7f ? a3h0.ic_passkey : a3h0.ic_other_sign_in));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        isSystemProviderRequired = o9f.e(str, bundle, f4fVar.c).setIsSystemProviderRequired(false);
        alwaysSendAppInfoToProvider = isSystemProviderRequired.setAlwaysSendAppInfoToProvider(true);
        build = alwaysSendAppInfoToProvider.build();
        credentialManager.createCredential(context, build, cancellationSignal, (b43) executor, outcomeReceiver);
    }

    @Override // defpackage.f9f
    public final void onGetCredential(Context context, q5t q5tVar, CancellationSignal cancellationSignal, Executor executor, final c9f c9fVar) {
        GetCredentialRequest build;
        CredentialOption.Builder isSystemProviderRequired;
        CredentialOption.Builder allowedProviders;
        CredentialOption build2;
        final kde kdeVar = (kde) c9fVar;
        sls slsVar = new sls() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                kdeVar.c(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
                return zy11.a;
            }
        };
        if (this.a == null) {
            slsVar.invoke();
            return;
        }
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$outcome$2
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onError(GetCredentialException error) {
                String type;
                String message;
                GetCredentialCustomException getCredentialCustomException;
                Object obj;
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                c9f c9fVar2 = c9f.this;
                this.getClass();
                type = error.getType();
                message = error.getMessage();
                switch (type.hashCode()) {
                    case -781118336:
                        if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                            obj = new GetCredentialUnknownException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            int i = GetPublicKeyCredentialException.a;
                            String obj2 = message != null ? message.toString() : null;
                            try {
                            } catch (FrameworkClassParsingException unused) {
                                getCredentialCustomException = new GetCredentialCustomException(obj2, type);
                            }
                            if (!cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                                throw new FrameworkClassParsingException();
                            }
                            int i2 = GetPublicKeyCredentialDomException.b;
                            obj = exa1.c(type, obj2);
                            c9fVar2.c(obj);
                            return;
                        }
                        getCredentialCustomException = new GetCredentialCustomException(message, type);
                        obj = getCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    case -408155724:
                        if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                            obj = new GetCredentialUnsupportedException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = getCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    case -45448328:
                        if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                            obj = new GetCredentialInterruptedException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = getCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    case 580557411:
                        if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                            obj = new GetCredentialCancellationException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = getCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    case 627896683:
                        if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                            obj = new NoCredentialException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = getCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    case 1594095913:
                        if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                            obj = new GetCredentialProviderConfigurationException(message);
                            c9fVar2.c(obj);
                            return;
                        }
                        if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = getCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                    default:
                        if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        }
                        obj = getCredentialCustomException;
                        c9fVar2.c(obj);
                        return;
                }
            }

            public void onResult(GetCredentialResponse response) {
                Credential credential;
                String type;
                Bundle data;
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                c9f c9fVar2 = c9f.this;
                this.getClass();
                credential = response.getCredential();
                type = credential.getType();
                data = credential.getData();
                c9fVar2.onResult(new s5t(ltb1.a(data, type)));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(o9f.k(obj));
            }

            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(o9f.j(th));
            }
        };
        CredentialManager credentialManager = this.a;
        o9f.s();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder h = wi5.h(bundle);
        for (e9f e9fVar : q5tVar.a) {
            o9f.y();
            isSystemProviderRequired = wi5.f(e9fVar.a, e9fVar.b, e9fVar.c).setIsSystemProviderRequired(false);
            allowedProviders = isSystemProviderRequired.setAllowedProviders(e9fVar.e);
            build2 = allowedProviders.build();
            h.addCredentialOption(build2);
        }
        build = h.build();
        credentialManager.getCredential(context, build, cancellationSignal, (b43) executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) outcomeReceiver);
    }
}
