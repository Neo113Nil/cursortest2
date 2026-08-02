package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import xsna.kyh;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nch implements izs {
    public final /* synthetic */ com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a b;
    public final /* synthetic */ wk50.a c;
    public final /* synthetic */ UserId d;
    public final /* synthetic */ int e;

    public /* synthetic */ nch(com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a aVar, wk50.a aVar2, UserId userId, int i) {
        this.b = aVar;
        this.c = aVar2;
        this.d = userId;
        this.e = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        wk50.a aVar = this.c;
        com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d(aVar, false);
        aVar.a(c.r.C1015r.b);
        this.b.c.b(new kyh.a.i(this.d.b, this.e));
        return s3q0.a;
    }
}
