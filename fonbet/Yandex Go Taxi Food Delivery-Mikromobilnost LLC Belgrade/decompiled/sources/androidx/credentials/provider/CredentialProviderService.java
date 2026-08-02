package androidx.credentials.provider;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import defpackage.awf0;
import defpackage.j73;
import defpackage.kd1;
import defpackage.ny61;
import defpackage.o9f;
import defpackage.ri5;
import defpackage.si5;
import defpackage.ti5;
import defpackage.ui5;
import defpackage.unr0;
import defpackage.vi5;
import defpackage.wi5;
import defpackage.xi5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\b¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u001a0\bH&¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\bH&¢\u0006\u0004\b \u0010!J3\u0010%\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\bH&¢\u0006\u0004\b%\u0010&R*\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-R.\u0010.\u001a\u0004\u0018\u00010\"2\b\u0010(\u001a\u0004\u0018\u00010\"8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u00104\u001a\u0004\u0018\u00010\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u001d8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R.\u0010:\u001a\u0004\u0018\u00010\u00192\b\u0010(\u001a\u0004\u0018\u00010\u00198G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006@"}, d2 = {"Landroidx/credentials/provider/CredentialProviderService;", "Landroid/service/credentials/CredentialProviderService;", "<init>", "()V", "Landroid/service/credentials/BeginGetCredentialRequest;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/os/OutcomeReceiver;", "Landroid/service/credentials/BeginGetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "callback", "Lzy11;", "onBeginGetCredential", "(Landroid/service/credentials/BeginGetCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroid/service/credentials/BeginCreateCredentialRequest;", "Landroid/service/credentials/BeginCreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", "onBeginCreateCredential", "(Landroid/service/credentials/BeginCreateCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroid/service/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "onClearCredentialState", "(Landroid/service/credentials/ClearCredentialStateRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Lawf0;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredentialStateRequest", "(Lawf0;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Lui5;", "Lvi5;", "Landroidx/credentials/exceptions/GetCredentialException;", "onBeginGetCredentialRequest", "(Lui5;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Lri5;", "Lsi5;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onBeginCreateCredentialRequest", "(Lri5;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "", "<set-?>", "isTestMode", "Z", "()Z", "setTestMode", "(Z)V", "lastCreateRequest", "Lri5;", "getLastCreateRequest", "()Lri5;", "setLastCreateRequest", "(Lri5;)V", "lastGetRequest", "Lui5;", "getLastGetRequest", "()Lui5;", "setLastGetRequest", "(Lui5;)V", "lastClearRequest", "Lawf0;", "getLastClearRequest", "()Lawf0;", "setLastClearRequest", "(Lawf0;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {
    private boolean isTestMode;
    private awf0 lastClearRequest;
    private ri5 lastCreateRequest;
    private ui5 lastGetRequest;

    public final awf0 getLastClearRequest() {
        return this.lastClearRequest;
    }

    public final ri5 getLastCreateRequest() {
        return this.lastCreateRequest;
    }

    public final ui5 getLastGetRequest() {
        return this.lastGetRequest;
    }

    /* renamed from: isTestMode, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBeginCreateCredential(BeginCreateCredentialRequest request, CancellationSignal cancellationSignal, final OutcomeReceiver callback) {
        String type;
        Bundle data;
        CallingAppInfo callingAppInfo;
        ti5 ti5Var;
        String packageName;
        SigningInfo signingInfo;
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginCreateCredential$outcome$1
            public void onError(CreateCredentialException error) {
                OutcomeReceiver outcomeReceiver2 = OutcomeReceiver.this;
                o9f.B();
                outcomeReceiver2.onError(o9f.c(error.getType(), error.getMessage()));
            }

            public void onResult(si5 response) {
                BeginCreateCredentialResponse build;
                OutcomeReceiver outcomeReceiver2 = OutcomeReceiver.this;
                BeginCreateCredentialResponse.Builder i = kd1.i();
                Iterator it = response.a.iterator();
                if (it.hasNext()) {
                    throw unr0.i(it);
                }
                build = i.build();
                outcomeReceiver2.onResult(build);
            }
        };
        type = request.getType();
        data = request.getData();
        callingAppInfo = request.getCallingAppInfo();
        if (callingAppInfo != null) {
            packageName = callingAppInfo.getPackageName();
            signingInfo = callingAppInfo.getSigningInfo();
            callingAppInfo.getOrigin();
            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners != null) {
                j73.A(apkContentsSigners);
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                signingInfo.getPublicKeys();
            }
            if (i >= 35) {
                signingInfo.getSchemeVersion();
            }
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory != null) {
                j73.A(signingCertificateHistory);
            }
            signingInfo.hasPastSigningCertificates();
            signingInfo.hasMultipleSigners();
            if (packageName.length() <= 0) {
                ny61.g("packageName must not be empty");
                return;
            }
        }
        try {
        } catch (FrameworkClassParsingException unused) {
            ti5Var = new ti5(type);
        }
        if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
            try {
                ti5Var = new ti5();
                if (this.isTestMode) {
                    this.lastCreateRequest = ti5Var;
                }
                onBeginCreateCredentialRequest(ti5Var, cancellationSignal, outcomeReceiver);
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }
        if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                ti5 ti5Var2 = new ti5();
                if (string.length() != 0) {
                    try {
                        new JSONObject(string);
                        data.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", string);
                        ti5Var = ti5Var2;
                    } catch (Exception unused3) {
                    }
                }
                throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
            } catch (Exception unused4) {
                throw new FrameworkClassParsingException();
            }
        }
        ti5Var = new ti5(type);
        if (this.isTestMode) {
        }
        onBeginCreateCredentialRequest(ti5Var, cancellationSignal, outcomeReceiver);
        ti5Var = new ti5(type);
        if (this.isTestMode) {
        }
        onBeginCreateCredentialRequest(ti5Var, cancellationSignal, outcomeReceiver);
    }

    public abstract void onBeginCreateCredentialRequest(ri5 request, CancellationSignal cancellationSignal, OutcomeReceiver callback);

    public final void onBeginGetCredential(BeginGetCredentialRequest request, CancellationSignal cancellationSignal, final OutcomeReceiver callback) {
        List beginGetCredentialOptions;
        CallingAppInfo callingAppInfo;
        String packageName;
        SigningInfo signingInfo;
        String id;
        String type;
        Bundle candidateQueryData;
        xi5 xi5Var;
        xi5 xi5Var2;
        ArrayList arrayList = new ArrayList();
        beginGetCredentialOptions = request.getBeginGetCredentialOptions();
        Iterator it = beginGetCredentialOptions.iterator();
        while (it.hasNext()) {
            BeginGetCredentialOption k = kd1.k(it.next());
            id = k.getId();
            type = k.getType();
            candidateQueryData = k.getCandidateQueryData();
            if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                ArrayList<String> stringArrayList = candidateQueryData.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
                if (stringArrayList != null) {
                    a.N0(stringArrayList);
                }
                xi5Var2 = new xi5();
            } else {
                if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    try {
                        String string = candidateQueryData.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                        candidateQueryData.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                        xi5Var = new xi5();
                        if (string.length() != 0) {
                            try {
                                new JSONObject(string);
                            } catch (Exception unused) {
                            }
                        }
                        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
                    } catch (Exception unused2) {
                        throw new FrameworkClassParsingException();
                    }
                }
                xi5Var = new xi5();
                if (id.length() <= 0) {
                    ny61.g("id should not be empty");
                    return;
                } else if (type.length() <= 0) {
                    ny61.g("type should not be empty");
                    return;
                }
                xi5Var2 = xi5Var;
            }
            arrayList.add(xi5Var2);
        }
        callingAppInfo = request.getCallingAppInfo();
        if (callingAppInfo != null) {
            packageName = callingAppInfo.getPackageName();
            signingInfo = callingAppInfo.getSigningInfo();
            callingAppInfo.getOrigin();
            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners != null) {
                j73.A(apkContentsSigners);
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                signingInfo.getPublicKeys();
            }
            if (i >= 35) {
                signingInfo.getSchemeVersion();
            }
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory != null) {
                j73.A(signingCertificateHistory);
            }
            signingInfo.hasPastSigningCertificates();
            signingInfo.hasMultipleSigners();
            if (packageName.length() <= 0) {
                ny61.g("packageName must not be empty");
                return;
            }
        }
        ui5 ui5Var = new ui5();
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginGetCredential$outcome$1
            public void onError(GetCredentialException error) {
                OutcomeReceiver outcomeReceiver2 = OutcomeReceiver.this;
                o9f.C();
                outcomeReceiver2.onError(o9f.i(error.getType(), error.getMessage()));
            }

            public void onResult(vi5 response) {
                BeginGetCredentialResponse build;
                OutcomeReceiver outcomeReceiver2 = OutcomeReceiver.this;
                BeginGetCredentialResponse.Builder m = wi5.m();
                Iterator it2 = response.a.iterator();
                if (it2.hasNext()) {
                    throw unr0.i(it2);
                }
                Iterator it3 = response.b.iterator();
                if (it3.hasNext()) {
                    if (it3.next() != null) {
                        ny61.u();
                        return;
                    } else {
                        kd1.C();
                        throw null;
                    }
                }
                Iterator it4 = response.c.iterator();
                if (!it4.hasNext()) {
                    build = m.build();
                    outcomeReceiver2.onResult(build);
                } else if (it4.next() != null) {
                    ny61.u();
                } else {
                    kd1.C();
                    throw null;
                }
            }
        };
        if (this.isTestMode) {
            this.lastGetRequest = ui5Var;
        }
        onBeginGetCredentialRequest(ui5Var, cancellationSignal, outcomeReceiver);
    }

    public abstract void onBeginGetCredentialRequest(ui5 request, CancellationSignal cancellationSignal, OutcomeReceiver callback);

    public final void onClearCredentialState(ClearCredentialStateRequest request, CancellationSignal cancellationSignal, final OutcomeReceiver callback) {
        CallingAppInfo callingAppInfo;
        String packageName;
        CallingAppInfo callingAppInfo2;
        SigningInfo signingInfo;
        CallingAppInfo callingAppInfo3;
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onClearCredentialState$outcome$1
            public void onError(ClearCredentialException error) {
                OutcomeReceiver outcomeReceiver2 = OutcomeReceiver.this;
                o9f.D();
                outcomeReceiver2.onError(o9f.a(error.getType(), error.getMessage()));
            }

            public void onResult(Void response) {
                OutcomeReceiver.this.onResult(response);
            }
        };
        callingAppInfo = request.getCallingAppInfo();
        packageName = callingAppInfo.getPackageName();
        callingAppInfo2 = request.getCallingAppInfo();
        signingInfo = callingAppInfo2.getSigningInfo();
        callingAppInfo3 = request.getCallingAppInfo();
        callingAppInfo3.getOrigin();
        Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
        if (apkContentsSigners != null) {
            j73.A(apkContentsSigners);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            signingInfo.getPublicKeys();
        }
        if (i >= 35) {
            signingInfo.getSchemeVersion();
        }
        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
        if (signingCertificateHistory != null) {
            j73.A(signingCertificateHistory);
        }
        signingInfo.hasPastSigningCertificates();
        signingInfo.hasMultipleSigners();
        if (packageName.length() <= 0) {
            ny61.g("packageName must not be empty");
            return;
        }
        awf0 awf0Var = new awf0();
        if (this.isTestMode) {
            this.lastClearRequest = awf0Var;
        }
        onClearCredentialStateRequest(awf0Var, cancellationSignal, outcomeReceiver);
    }

    public abstract void onClearCredentialStateRequest(awf0 request, CancellationSignal cancellationSignal, OutcomeReceiver callback);

    public final void setLastClearRequest(awf0 awf0Var) {
        this.lastClearRequest = awf0Var;
    }

    public final void setLastCreateRequest(ri5 ri5Var) {
        this.lastCreateRequest = ri5Var;
    }

    public final void setLastGetRequest(ui5 ui5Var) {
        this.lastGetRequest = ui5Var;
    }

    public final void setTestMode(boolean z) {
        this.isTestMode = z;
    }
}
