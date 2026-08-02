package xsna;

import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.gy70;
import xsna.k7r0;
import xsna.n2p0;
import xsna.n7r0;

/* compiled from: VKApiManager.kt */
/* loaded from: classes.dex */
public class l7r0 {
    public final VKApiConfig a;
    public final k200 e;
    public volatile j7r0 g;
    public zx2 i;
    public final bpn0 b = new bpn0(new hia(this, 4));
    public final g9r0 c = new g9r0();
    public final n7r0.e d = new n7r0.e();
    public final bpn0 f = new bpn0(new m66(this, 8));
    public final bpn0 h = new bpn0(new n66(this, 8));

    /* compiled from: VKApiManager.kt */
    /* loaded from: classes15.dex */
    public static final class a<Result> implements k7r0 {
        public static final a<Result> b = new a<>();

        @Override // xsna.k7r0
        public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
            return s3q0.a;
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) throws VKApiException, VKApiExecutionException, JSONException, Exception {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public l7r0(VKApiConfig vKApiConfig) {
        this.a = vKApiConfig;
        this.e = vKApiConfig.c;
    }

    public static Object g(l7r0 l7r0Var, xbr0 xbr0Var, k7r0 k7r0Var) throws InterruptedException, IOException, VKApiException {
        return l7r0Var.h(l7r0Var.l(xbr0Var, l7r0Var.b(xbr0Var, null, k7r0Var)));
    }

    public <T> ara<T> a(com.vk.api.sdk.a aVar, k7r0<T> k7r0Var) {
        vx70 i = i();
        gy70.a aVar2 = new gy70.a();
        aVar2.c(aVar);
        VKApiConfig vKApiConfig = this.a;
        return new kj20(this, i, aVar2, vKApiConfig.f.getValue(), vKApiConfig.b(), k7r0Var);
    }

    public <T> bkv<T> b(xbr0 xbr0Var, m7r0 m7r0Var, k7r0<T> k7r0Var) {
        return new bkv<>(this, i(), xbr0Var, m7r0Var, k7r0Var);
    }

    public n2p0 c(com.vk.api.sdk.a aVar, jpx jpxVar) {
        int i = aVar.g;
        VKApiConfig vKApiConfig = this.a;
        return new n2p0(this, i, new n2p0.a(vKApiConfig.H, vKApiConfig.I), k2p0.b, jpxVar);
    }

    public final <T> T d(com.vk.api.sdk.a aVar, k7r0<T> k7r0Var) throws InterruptedException, IOException, VKApiException {
        return (T) h(k(aVar, a(aVar, k7r0Var)));
    }

    public <T> T e(nx2<T> nx2Var) throws InterruptedException, IOException, VKApiException {
        return nx2Var.f(this);
    }

    public final void f(com.vk.api.sdk.a aVar) {
        d(aVar, a.b);
    }

    public <T> T h(ara<? extends T> araVar) throws InterruptedException, IOException, VKApiException {
        return araVar.a(new zqa());
    }

    public vx70 i() {
        return (vx70) this.f.getValue();
    }

    public final void j(List<h7r0> list) {
        vx70 i = i();
        i.getClass();
        i.m(list.toString());
        i.e = new bpn0(new m15(list, 8));
    }

    public <T> ara<T> k(com.vk.api.sdk.a aVar, ara<? extends T> araVar) {
        int i = aVar.g;
        String str = aVar.c;
        if (!aVar.h) {
            araVar = new fjr0(this, i, araVar, this.d);
        }
        n2p0 c = c(aVar, new jpx(this, new kz2(this, araVar, aVar, this.a.z)));
        bpn0 bpn0Var = this.b;
        tgx tgxVar = new tgx(this, str, (z1p0) bpn0Var.getValue(), new e2i0(this, str, (z1p0) bpn0Var.getValue(), new bxe0(this, str, (z1p0) bpn0Var.getValue(), c)));
        return i > 0 ? new qwp(i, tgxVar, this) : tgxVar;
    }

    public <T> ara<T> l(xbr0 xbr0Var, ara<? extends T> araVar) {
        fjr0 fjr0Var = new fjr0(this, xbr0Var.a(), araVar, this.d);
        return xbr0Var.a() > 0 ? new qwp(xbr0Var.a(), fjr0Var, this) : fjr0Var;
    }
}
