package xsna;

import com.vk.httpexecutor.api.NetworkClient;

/* compiled from: NetworkOkHttpProvider.kt */
/* loaded from: classes11.dex */
public final class r460 extends com.vk.api.sdk.b {
    @Override // com.vk.api.sdk.b
    public final okhttp3.o a() {
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        return o260Var.b(NetworkClient.ClientType.CLIENT_API);
    }
}
