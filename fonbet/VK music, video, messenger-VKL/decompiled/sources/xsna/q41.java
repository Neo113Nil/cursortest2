package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.advertisement.a;
import java.util.Iterator;
import java.util.List;
import xsna.gi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class q41 implements izs {
    public final /* synthetic */ AdvertisementType b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ com.vk.superapp.advertisement.b d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ WebAdConfig f;

    public /* synthetic */ q41(AdvertisementType advertisementType, boolean z, com.vk.superapp.advertisement.b bVar, boolean z2, WebAdConfig webAdConfig) {
        this.b = advertisementType;
        this.c = z;
        this.d = bVar;
        this.e = z2;
        this.f = webAdConfig;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AdvertisementType advertisementType;
        final com.vk.superapp.advertisement.b bVar;
        final boolean z;
        Object obj2;
        Iterator it = ((List) obj).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            advertisementType = this.b;
            bVar = this.d;
            z = this.e;
            if (!hasNext) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (bVar.q(advertisementType, ((a.C1856a) obj2).a, z)) {
                break;
            }
        }
        a.C1856a c1856a = (a.C1856a) obj2;
        if (c1856a != null) {
            return io.reactivex.rxjava3.core.x.k(new gi0.a(c1856a.a, c1856a.c, advertisementType, c1856a.b));
        }
        if (!this.c) {
            return io.reactivex.rxjava3.core.x.k(gi0.b.a);
        }
        boolean B = bVar.B();
        io.reactivex.rxjava3.internal.operators.single.x k = io.reactivex.rxjava3.core.x.k(gi0.b.a);
        final WebAdConfig webAdConfig = this.f;
        return (io.reactivex.rxjava3.core.b0) com.vk.superapp.advertisement.b.r(B, advertisementType, k, new wzs() { // from class: xsna.l41
            @Override // xsna.wzs
            public final Object invoke(Object obj3, Object obj4) {
                boolean booleanValue = ((Boolean) obj4).booleanValue();
                return com.vk.superapp.advertisement.b.this.g((AdvertisementType) obj3, webAdConfig, booleanValue, z);
            }
        });
    }
}
