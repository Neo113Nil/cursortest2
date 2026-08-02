package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.advertisement.a;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m41 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.vk.superapp.advertisement.b c;
    public final /* synthetic */ AdvertisementType d;
    public final /* synthetic */ int e;
    public final /* synthetic */ WebAdConfig f;

    public /* synthetic */ m41(boolean z, com.vk.superapp.advertisement.b bVar, AdvertisementType advertisementType, int i, WebAdConfig webAdConfig) {
        this.b = z;
        this.c = bVar;
        this.d = advertisementType;
        this.e = i;
        this.f = webAdConfig;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.superapp.advertisement.b bVar;
        AdvertisementType advertisementType;
        int i;
        int i2;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            bVar = this.c;
            advertisementType = this.d;
            i = this.e;
            if (!hasNext) {
                break;
            }
            i2 = ((a.C1856a) it.next()).a;
            if (i2 == i) {
                return s3q0.a;
            }
        } while (!bVar.q(advertisementType, i2, false));
        if (!this.b) {
            return s3q0.a;
        }
        boolean B = bVar.B();
        s3q0 s3q0Var = s3q0.a;
        com.vk.superapp.advertisement.b.r(B, advertisementType, s3q0Var, new t41(bVar, this.f, i, 0));
        return s3q0Var;
    }
}
