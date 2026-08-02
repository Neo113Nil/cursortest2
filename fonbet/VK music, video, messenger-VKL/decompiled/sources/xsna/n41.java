package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import java.util.List;
import xsna.gi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class n41 implements izs {
    public final /* synthetic */ com.vk.superapp.advertisement.b b;
    public final /* synthetic */ AdvertisementType c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;

    public /* synthetic */ n41(com.vk.superapp.advertisement.b bVar, AdvertisementType advertisementType, boolean z, boolean z2, List list) {
        this.b = bVar;
        this.c = advertisementType;
        this.d = z;
        this.e = z2;
        this.f = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.superapp.advertisement.b bVar = this.b;
        AdvertisementType advertisementType = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        gi0 z3 = bVar.z((com.vk.superapp.advertisement.a) obj, advertisementType, z, z2);
        return z3 instanceof gi0.a ? io.reactivex.rxjava3.core.x.k(z3) : bVar.i(advertisementType, j5g.S(this.f, 1), z, z2);
    }
}
