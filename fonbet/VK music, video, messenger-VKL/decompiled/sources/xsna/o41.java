package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o41 implements izs {
    public final /* synthetic */ com.vk.superapp.advertisement.b b;
    public final /* synthetic */ int c;
    public final /* synthetic */ AdvertisementType d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;

    public /* synthetic */ o41(com.vk.superapp.advertisement.b bVar, int i, AdvertisementType advertisementType, boolean z, List list) {
        this.b = bVar;
        this.c = i;
        this.d = advertisementType;
        this.e = z;
        this.f = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.superapp.advertisement.b bVar = this.b;
        int i = this.c;
        AdvertisementType advertisementType = this.d;
        boolean z = this.e;
        if (bVar.p((com.vk.superapp.advertisement.a) obj, i, advertisementType, z)) {
            return s3q0.a;
        }
        bVar.o(advertisementType, j5g.S(this.f, 1), z, i);
        return s3q0.a;
    }
}
