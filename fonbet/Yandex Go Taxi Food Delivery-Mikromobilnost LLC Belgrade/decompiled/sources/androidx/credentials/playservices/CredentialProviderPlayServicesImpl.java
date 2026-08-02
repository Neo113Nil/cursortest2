package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.zzw;
import defpackage.atx0;
import defpackage.c9f;
import defpackage.cvw;
import defpackage.d6f;
import defpackage.dtx0;
import defpackage.e9f;
import defpackage.f491;
import defpackage.f4f;
import defpackage.f83;
import defpackage.f9f;
import defpackage.h191;
import defpackage.j9f;
import defpackage.mm2;
import defpackage.nb1;
import defpackage.o091;
import defpackage.p091;
import defpackage.pui0;
import defpackage.q091;
import defpackage.q5t;
import defpackage.r9f;
import defpackage.reu;
import defpackage.rte0;
import defpackage.s9f;
import defpackage.sls;
import defpackage.sst;
import defpackage.t26;
import defpackage.tls;
import defpackage.v7f;
import defpackage.w511;
import defpackage.x0c;
import defpackage.yst;
import defpackage.ysx0;
import defpackage.zsx0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJE\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001fJ?\u0010#\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"0\u0010H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R(\u0010'\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Lf9f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "minApkVersion", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "Lq5t;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Lc9f;", "Ls5t;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Lzy11;", "onGetCredential", "(Landroid/content/Context;Lq5t;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lc9f;)V", "Lf4f;", "Lg4f;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Lf4f;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lc9f;)V", "", "isAvailableOnDevice", "()Z", "(I)Z", "Lx0c;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Lx0c;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lc9f;)V", "Landroid/content/Context;", "Lcom/google/android/gms/common/a;", "googleApiAvailability", "Lcom/google/android/gms/common/a;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/a;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/a;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "r9f", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CredentialProviderPlayServicesImpl implements f9f {
    public static final r9f Companion = new r9f();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private a googleApiAvailability = a.d;

    public CredentialProviderPlayServicesImpl(Context context) {
        this.context = context;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.d(context, minApkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    public static final void onClearCredential$lambda$1(CancellationSignal cancellationSignal, final Executor executor, final c9f c9fVar, Exception exc) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((exc instanceof ApiException) && ((ApiException) exc).b() == 40201) {
            ref$ObjectRef.element = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        r9f r9fVar = Companion;
        sls slsVar = new sls() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                executor.execute(new j9f(5, c9fVar, ref$ObjectRef));
                return zy11.a;
            }
        };
        r9fVar.getClass();
        if (r9f.a(cancellationSignal)) {
            return;
        }
        slsVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$4(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, final Executor executor, final c9f c9fVar, final Exception exc) {
        r9f r9fVar = Companion;
        sls slsVar = new sls() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$5$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Objects.toString(exc);
                executor.execute(new j9f(6, c9fVar, exc));
                return zy11.a;
            }
        };
        r9fVar.getClass();
        if (r9f.a(cancellationSignal)) {
            return;
        }
        slsVar.invoke();
    }

    public final a getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z = isGooglePlayServicesAvailable == 0;
        if (!z) {
            new ConnectionResult(isGooglePlayServicesAvailable).toString();
        }
        return z;
    }

    public void onClearCredential(x0c request, final CancellationSignal cancellationSignal, final Executor executor, final c9f callback) {
        Companion.getClass();
        if (r9f.a(cancellationSignal)) {
            return;
        }
        if (request.a.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                sls slsVar = new sls() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        executor.execute(new s9f(callback, 0));
                        return zy11.a;
                    }
                };
                if (r9f.a(cancellationSignal)) {
                    return;
                }
                slsVar.invoke();
                return;
            }
            com.google.android.gms.auth.blockstore.restorecredential.internal.a aVar = new com.google.android.gms.auth.blockstore.restorecredential.internal.a(this.context, null, com.google.android.gms.auth.blockstore.restorecredential.internal.a.k, mm2.V0, sst.c);
            ClearRestoreCredentialRequest clearRestoreCredentialRequest = new ClearRestoreCredentialRequest(request.b);
            ysx0 a = zsx0.a();
            a.c = new Feature[]{f491.a};
            reu reuVar = new reu();
            reuVar.b = clearRestoreCredentialRequest;
            a.a = reuVar;
            a.d = 1694;
            zzw d = aVar.d(0, a.a());
            d.g(dtx0.a, new nb1(2, new tls() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    r9f r9fVar = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal2 = cancellationSignal;
                    final Executor executor2 = executor;
                    final c9f c9fVar = callback;
                    sls slsVar2 = new sls() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            Log.i("PlayServicesImpl", "Cleared restore credential successfully!");
                            executor2.execute(new s9f(c9fVar, 1));
                            return zy11.a;
                        }
                    };
                    r9fVar.getClass();
                    if (!r9f.a(cancellationSignal2)) {
                        slsVar2.invoke();
                    }
                    return zy11.a;
                }
            }));
            d.d(new t26(4, cancellationSignal, executor, callback));
            return;
        }
        Context context = this.context;
        cvw.l(context);
        final o091 o091Var = new o091(context, new h191());
        o091Var.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = yst.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((yst) it.next()).l();
        }
        GoogleApiManager.reportSignOut();
        ysx0 a2 = zsx0.a();
        a2.c = new Feature[]{q091.a};
        a2.a = new pui0() { // from class: com.google.android.gms.internal.auth-api.b
            @Override // defpackage.pui0
            public final void accept(Object obj, Object obj2) {
                o091 o091Var2 = o091.this;
                ((zbw) ((p091) obj).i()).zbf(new zban(o091Var2, (atx0) obj2), o091Var2.k);
            }
        };
        a2.b = false;
        a2.d = 1554;
        zzw d2 = o091Var.d(1, a2.a());
        nb1 nb1Var = new nb1(3, new tls() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                r9f r9fVar = CredentialProviderPlayServicesImpl.Companion;
                CancellationSignal cancellationSignal2 = cancellationSignal;
                final Executor executor2 = executor;
                final c9f c9fVar = callback;
                sls slsVar2 = new sls() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        Log.i("PlayServicesImpl", "During clear credential, signed out successfully!");
                        executor2.execute(new s9f(c9fVar, 2));
                        return zy11.a;
                    }
                };
                r9fVar.getClass();
                if (!r9f.a(cancellationSignal2)) {
                    slsVar2.invoke();
                }
                return zy11.a;
            }
        });
        d2.getClass();
        d2.g(dtx0.a, nb1Var);
        d2.d(new f83(this, cancellationSignal, executor, callback, 2));
    }

    @Override // defpackage.f9f
    public void onCreateCredential(Context context, f4f request, CancellationSignal cancellationSignal, Executor executor, c9f callback) {
        Companion.getClass();
        if (r9f.a(cancellationSignal)) {
            return;
        }
        if (request instanceof d6f) {
            new androidx.credentials.playservices.controllers.CreatePassword.a(context).f((d6f) request, callback, executor, cancellationSignal);
        } else if (request instanceof v7f) {
            new androidx.credentials.playservices.controllers.CreatePublicKeyCredential.a(context).h((v7f) request, callback, executor, cancellationSignal);
        } else {
            w511.x("Create Credential request is unsupported, not password or publickeycredential");
        }
    }

    @Override // defpackage.f9f
    public void onGetCredential(Context context, q5t request, CancellationSignal cancellationSignal, Executor executor, c9f callback) {
        List<e9f> list = request.a;
        Companion.getClass();
        if (r9f.a(cancellationSignal)) {
            return;
        }
        for (e9f e9fVar : list) {
        }
        Companion.getClass();
        for (e9f e9fVar2 : list) {
        }
        Companion.getClass();
        for (e9f e9fVar3 : list) {
        }
        new androidx.credentials.playservices.controllers.BeginSignIn.a(context).g(request, cancellationSignal, executor, callback);
    }

    public /* bridge */ /* synthetic */ void onPrepareCredential(q5t q5tVar, CancellationSignal cancellationSignal, Executor executor, c9f c9fVar) {
    }

    public final void setGoogleApiAvailability(a aVar) {
        this.googleApiAvailability = aVar;
    }

    @Override // defpackage.f9f
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public /* bridge */ /* synthetic */ void onGetCredential(Context context, rte0 rte0Var, CancellationSignal cancellationSignal, Executor executor, c9f c9fVar) {
    }
}
