package defpackage;

import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.a;
import org.json.JSONException;

/* loaded from: classes10.dex */
public final /* synthetic */ class m9f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ JSONException c;

    public /* synthetic */ m9f(a aVar, JSONException jSONException, int i) {
        this.a = i;
        this.b = aVar;
        this.c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        JSONException jSONException = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                c9f c9fVar = aVar.f;
                (c9fVar != null ? c9fVar : null).c(new CreatePublicKeyCredentialDomException(new qzn(), jSONException.getMessage()));
                break;
            default:
                c9f c9fVar2 = aVar.f;
                c9f c9fVar3 = c9fVar2 != null ? c9fVar2 : null;
                String message = jSONException.getMessage();
                c9fVar3.c((message == null || message.length() <= 0) ? new CreatePublicKeyCredentialDomException(new qzn(), "Unknown error") : new CreatePublicKeyCredentialDomException(new qzn(), message));
                break;
        }
    }
}
