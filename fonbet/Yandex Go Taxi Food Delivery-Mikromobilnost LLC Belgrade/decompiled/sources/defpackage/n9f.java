package defpackage;

import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class n9f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ n9f(a aVar, Throwable th, int i) {
        this.a = i;
        this.b = aVar;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Throwable th = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                c9f c9fVar = aVar.f;
                (c9fVar != null ? c9fVar : null).c(new CreatePublicKeyCredentialDomException(new w121(), th.getMessage()));
                break;
            default:
                c9f c9fVar2 = aVar.f;
                (c9fVar2 != null ? c9fVar2 : null).c(new CreateCredentialUnknownException(th.getMessage()));
                break;
        }
    }
}
