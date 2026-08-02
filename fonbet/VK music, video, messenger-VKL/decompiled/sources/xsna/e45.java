package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.superapp.api.dto.auth.AuthTarget;
import okhttp3.Interceptor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e45 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e45(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                AuthResult authResult = (AuthResult) obj;
                return AuthResult.a(authResult, null, null, null, AuthTarget.a(authResult.g(), null, ((VkAuthMetaInfo) this.c).f.c, false, false, 29), 0L, null, null, 8380415);
            default:
                return (Interceptor) this.c;
        }
    }
}
