package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.exceptions.AuthException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n45 implements izs {
    public final /* synthetic */ Throwable b;

    public /* synthetic */ n45(Throwable th) {
        this.b = th;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AuthResult authResult = (AuthResult) obj;
        AuthException.NeedSilentAuthException needSilentAuthException = (AuthException.NeedSilentAuthException) this.b;
        VkAuthCredentials d = needSilentAuthException.d();
        String i = needSilentAuthException.i();
        String B = authResult.B();
        if (B == null) {
            B = needSilentAuthException.j();
        }
        return AuthResult.a(authResult, B, d, null, null, 0L, null, i, 4194207);
    }
}
