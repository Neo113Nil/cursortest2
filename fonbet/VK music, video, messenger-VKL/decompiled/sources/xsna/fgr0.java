package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import com.vk.superapp.api.internal.requests.common.CustomApiRequest;
import kotlin.collections.builders.MapBuilder;

/* compiled from: VKSuperAppCommonApi.kt */
/* loaded from: classes7.dex */
public final class fgr0 implements bfn0 {
    @Override // xsna.bfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 a(String str, String str2, MapBuilder mapBuilder) {
        String str3;
        String str4 = null;
        if (mapBuilder != null && (str3 = (String) mapBuilder.get("v")) != null && !drm0.N(str3)) {
            str4 = str3;
        }
        afn0 afn0Var = new afn0(str, str4, str2, mapBuilder);
        afn0Var.c = true;
        afn0Var.g = true;
        afn0Var.q = true;
        return rdx0.u(afn0Var);
    }

    @Override // xsna.bfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 b(String str, String str2, MapBuilder mapBuilder) {
        CustomApiRequest.a aVar = new CustomApiRequest.a();
        aVar.b = str;
        aVar.a = str2;
        aVar.d = mapBuilder;
        o260 o260Var = d260.a;
        o260 o260Var2 = d260.a;
        if (o260Var2 == null) {
            o260Var2 = null;
        }
        o260Var2.getClass();
        aVar.h = o260Var2.b(NetworkClient.ClientType.CLIENT_DEFAULT);
        final lmk lmkVar = new lmk(aVar.a(), 0);
        return new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.ptg0
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                return io.reactivex.rxjava3.core.q.T(lmk.this.call());
            }
        }).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
