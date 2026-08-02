package androidx.credentials;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import defpackage.abe;
import defpackage.b43;
import defpackage.dvw;
import defpackage.f4f;
import defpackage.f9f;
import defpackage.j18;
import defpackage.kde;
import defpackage.mc3;
import defpackage.me0;
import defpackage.q5t;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public interface a {
    static Object a(Context context, q5t q5tVar, ContinuationImpl continuationImpl) {
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        j18Var.w(new tls() { // from class: androidx.credentials.CredentialManager$getCredential$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                cancellationSignal.cancel();
                return zy11.a;
            }
        });
        kde kdeVar = new kde(j18Var, 1);
        b43 b43Var = new b43(1);
        boolean z = false;
        f9f e = abe.e(new abe(context, z, z), q5tVar);
        if (e == null) {
            kdeVar.c(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            e.onGetCredential(context, q5tVar, cancellationSignal, b43Var, kdeVar);
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    default Object b(Context context, f4f f4fVar, ContinuationImpl continuationImpl) {
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        j18Var.w(new tls() { // from class: androidx.credentials.CredentialManager$createCredential$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                cancellationSignal.cancel();
                return zy11.a;
            }
        });
        mc3 mc3Var = new mc3(j18Var, 1);
        b43 b43Var = new b43(1);
        boolean z = false;
        f9f e = abe.e(new abe(((me0) this).a, z, z), f4fVar);
        if (e == null) {
            mc3Var.c(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            e.onCreateCredential(context, f4fVar, cancellationSignal, b43Var, mc3Var);
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
