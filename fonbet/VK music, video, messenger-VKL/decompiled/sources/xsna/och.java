package xsna;

import com.vk.dto.common.id.UserId;
import xsna.kyh;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class och implements izs {
    public final /* synthetic */ com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a b;
    public final /* synthetic */ wk50.a c;
    public final /* synthetic */ UserId d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ och(com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a aVar, wk50.a aVar2, UserId userId, int i, boolean z) {
        this.b = aVar;
        this.c = aVar2;
        this.d = userId;
        this.e = i;
        this.f = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d(this.c, false);
        this.b.c.b(new kyh.a.h(this.d.b, this.e, this.f));
        return s3q0.a;
    }
}
