package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.BeginSignIn.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class i9f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ GetCredentialException c;

    public /* synthetic */ i9f(a aVar, GetCredentialException getCredentialException, int i) {
        this.a = i;
        this.b = aVar;
        this.c = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        GetCredentialException getCredentialException = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                c9f c9fVar = aVar.f;
                (c9fVar != null ? c9fVar : null).c(getCredentialException);
                break;
            default:
                c9f c9fVar2 = aVar.f;
                (c9fVar2 != null ? c9fVar2 : null).c(getCredentialException);
                break;
        }
    }
}
