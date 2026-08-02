package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementConfig;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h41 implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ com.vk.superapp.advertisement.b b;

    public /* synthetic */ h41(com.vk.superapp.advertisement.b bVar) {
        this.b = bVar;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        com.vk.superapp.advertisement.b bVar = this.b;
        AdvertisementConfig v = bVar.v();
        return (v == null || v.equals(AdvertisementConfig.a)) ? bVar.g.K() : io.reactivex.rxjava3.core.x.k(v);
    }
}
