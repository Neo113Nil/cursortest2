package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import com.vk.im.engine.models.account.AccountInfo;
import java.util.Optional;
import okhttp3.Interceptor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qib implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qib(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.dto.hints.a aVar;
        switch (this.b) {
            case 0:
                tib tibVar = (tib) this.c;
                AccountInfo a = ((s080) obj).c().a();
                return Optional.ofNullable((a == null || (aVar = a.I) == null) ? null : aVar.c((String) tibVar.a));
            default:
                sb8 sb8Var = (sb8) this.c;
                if (((NetworkClient.ClientType) obj) == NetworkClient.ClientType.CLIENT_PLAYER) {
                    return (Interceptor) sb8Var.invoke();
                }
                return null;
        }
    }
}
