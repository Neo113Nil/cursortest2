package defpackage;

import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class k9f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ k9f(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                c9f c9fVar = aVar.f;
                (c9fVar != null ? c9fVar : null).c(new CreatePublicKeyCredentialDomException(new w121(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                break;
            default:
                c9f c9fVar2 = aVar.f;
                (c9fVar2 != null ? c9fVar2 : null).c(new CreateCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
        }
    }
}
