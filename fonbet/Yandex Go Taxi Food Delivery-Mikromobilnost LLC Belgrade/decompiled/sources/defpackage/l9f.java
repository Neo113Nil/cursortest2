package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class l9f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ CreateCredentialException c;

    public /* synthetic */ l9f(a aVar, CreateCredentialException createCredentialException, int i) {
        this.a = i;
        this.b = aVar;
        this.c = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreateCredentialException createCredentialException = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                c9f c9fVar = aVar.f;
                (c9fVar != null ? c9fVar : null).c(createCredentialException);
                break;
            default:
                c9f c9fVar2 = aVar.f;
                (c9fVar2 != null ? c9fVar2 : null).c(createCredentialException);
                break;
        }
    }
}
