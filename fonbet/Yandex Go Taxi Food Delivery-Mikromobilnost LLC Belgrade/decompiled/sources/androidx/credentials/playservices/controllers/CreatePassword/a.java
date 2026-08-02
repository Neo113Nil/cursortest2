package androidx.credentials.playservices.controllers.CreatePassword;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import defpackage.c9f;
import defpackage.d6f;
import defpackage.e6f;
import defpackage.g9f;
import defpackage.h9f;
import defpackage.j9f;
import defpackage.oxe;
import defpackage.r9f;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class a extends androidx.credentials.playservices.controllers.a {
    public static final /* synthetic */ int j = 0;
    public final Context e;
    public c9f f;
    public Executor g;
    public CancellationSignal h;
    public final CredentialProviderCreatePasswordController$resultReceiver$1 i;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public a(Context context) {
        this.e = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.i = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                a aVar = a.this;
                CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(2, h9f.a, g9f.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
                a aVar2 = a.this;
                Executor executor = aVar2.g;
                if (executor == null) {
                    executor = null;
                }
                c9f c9fVar = aVar2.f;
                c9f c9fVar2 = c9fVar != null ? c9fVar : null;
                CancellationSignal cancellationSignal = aVar2.h;
                aVar.getClass();
                if (androidx.credentials.playservices.controllers.a.c(resultData, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, c9fVar2, cancellationSignal)) {
                    return;
                }
                final a aVar3 = a.this;
                int i = resultData.getInt("ACTIVITY_REQUEST_CODE");
                aVar3.getClass();
                if (i != h9f.c) {
                    return;
                }
                if (androidx.credentials.playservices.controllers.a.d(resultCode, CredentialProviderCreatePasswordController$handleResponse$1.w, new tls() { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$handleResponse$2
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        CreateCredentialException createCredentialException = (CreateCredentialException) obj;
                        a aVar4 = a.this;
                        Executor executor2 = aVar4.g;
                        if (executor2 == null) {
                            executor2 = null;
                        }
                        executor2.execute(new j9f(2, aVar4, createCredentialException));
                        return zy11.a;
                    }
                }, aVar3.h)) {
                    return;
                }
                final e6f e6fVar = new e6f();
                androidx.credentials.playservices.controllers.a.b(aVar3.h, new sls() { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$handleResponse$3
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
                        executor2.execute(new j9f(3, aVar4, e6fVar));
                        return zy11.a;
                    }
                });
            }
        };
    }

    public final void f(d6f d6fVar, c9f c9fVar, Executor executor, CancellationSignal cancellationSignal) {
        this.h = cancellationSignal;
        this.f = c9fVar;
        this.g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (r9f.a(cancellationSignal)) {
            return;
        }
        SavePasswordRequest.a builder = SavePasswordRequest.builder();
        builder.a = new SignInPassword(d6fVar.e, d6fVar.f);
        SavePasswordRequest savePasswordRequest = new SavePasswordRequest(builder.a, builder.b, builder.c);
        Context context = this.e;
        Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", savePasswordRequest);
        h9f.a(this.i, intent, "CREATE_PASSWORD");
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            androidx.credentials.playservices.controllers.a.b(cancellationSignal, new sls() { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$invokePlayServices$1
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
                    executor2.execute(new oxe(3, aVar));
                    return zy11.a;
                }
            });
        }
    }
}
