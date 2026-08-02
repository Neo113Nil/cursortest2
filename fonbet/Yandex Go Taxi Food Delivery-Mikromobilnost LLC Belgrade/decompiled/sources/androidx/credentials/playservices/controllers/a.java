package androidx.credentials.playservices.controllers;

import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import defpackage.c9f;
import defpackage.h9f;
import defpackage.j9f;
import defpackage.oyr;
import defpackage.r9f;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public abstract class a extends h9f {
    public static final /* synthetic */ int d = 0;

    public static final void b(CancellationSignal cancellationSignal, sls slsVar) {
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (r9f.a(cancellationSignal)) {
            return;
        }
        slsVar.invoke();
    }

    public static boolean c(Bundle bundle, wls wlsVar, final Executor executor, final c9f c9fVar, CancellationSignal cancellationSignal) {
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        final Object invoke = wlsVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"));
        b(cancellationSignal, new sls() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                executor.execute(new j9f(1, c9fVar, invoke));
                return zy11.a;
            }
        });
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.credentials.exceptions.CreateCredentialCancellationException] */
    public static final boolean d(int i, wls wlsVar, final tls tlsVar, CancellationSignal cancellationSignal) {
        if (i == -1) {
            return false;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new CreateCredentialUnknownException(oyr.j(i, "activity with result code: ", " indicating not RESULT_OK"));
        if (i == 0) {
            ref$ObjectRef.element = new CreateCredentialCancellationException("activity is cancelled by the user.");
        }
        wlsVar.invoke(cancellationSignal, new sls() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tls.this.invoke(ref$ObjectRef.element);
                return zy11.a;
            }
        });
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
    public static final boolean e(int i, wls wlsVar, final tls tlsVar, CancellationSignal cancellationSignal) {
        if (i == -1) {
            return false;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new GetCredentialUnknownException(oyr.j(i, "activity with result code: ", " indicating not RESULT_OK"));
        if (i == 0) {
            ref$ObjectRef.element = new GetCredentialCancellationException("activity is cancelled by the user.");
        }
        wlsVar.invoke(cancellationSignal, new sls() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tls.this.invoke(ref$ObjectRef.element);
                return zy11.a;
            }
        });
        return true;
    }
}
