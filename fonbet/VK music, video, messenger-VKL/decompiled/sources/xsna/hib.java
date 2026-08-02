package xsna;

import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hib implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hib(com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b bVar, wk50.a aVar, vzh vzhVar, c.u.k.b bVar2) {
        this.b = 3;
        this.c = aVar;
        this.d = vzhVar;
        this.e = bVar2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                wh50 wh50Var3 = (wh50) this.e;
                wh50Var.setValue(wh50Var2.getValue());
                wh50Var3.setValue(wh50Var2.getValue());
                break;
            case 2:
                v1h v1hVar = (v1h) this.c;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.d;
                tmh tmhVar = (tmh) this.e;
                tmhVar.f.setItems(v1hVar.b(extendedCommunityProfile));
                break;
            default:
                wk50.a aVar = (wk50.a) this.c;
                vzh vzhVar = (vzh) this.d;
                c.u.k.b bVar = (c.u.k.b) this.e;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b.e(aVar, vzhVar, bVar.c, bVar.b, new com.vk.movika.sdk.base.utils.b(18));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ hib(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
