package xsna;

import com.vk.dto.common.GoodAlbum;
import com.vk.ecomm.storefront.impl.albums.presentation.model.LoadingState;
import java.util.List;
import xsna.kkl0;

/* compiled from: StorefrontAlbumsReducer.kt */
/* loaded from: classes18.dex */
public final class lkl0 implements bm50<ukl0, kkl0> {
    @Override // xsna.bm50
    public final ukl0 a(ukl0 ukl0Var, kkl0 kkl0Var) {
        ukl0 ukl0Var2 = ukl0Var;
        kkl0 kkl0Var2 = kkl0Var;
        if (kkl0Var2 instanceof kkl0.b) {
            kkl0.b bVar = (kkl0.b) kkl0Var2;
            mpl0 mpl0Var = bVar.a;
            List<GoodAlbum> list = bVar.b;
            int i = bVar.c;
            int i2 = bVar.d;
            r3p0 r3p0Var = ukl0Var2.f;
            boolean z = bVar.e;
            return new ukl0(mpl0Var, list, i, i2, r3p0.a(r3p0Var, bVar.f, z, 0, 0, !z, 12), LoadingState.None);
        }
        if (kkl0Var2 instanceof kkl0.e) {
            kkl0.e eVar = (kkl0.e) kkl0Var2;
            return ukl0.a(ukl0Var2, eVar.a, eVar.b, null, LoadingState.None, 25);
        }
        if (kkl0Var2 instanceof kkl0.d) {
            return ukl0.a(ukl0Var2, null, 0, null, LoadingState.Page, 31);
        }
        if (kkl0Var2 instanceof kkl0.f) {
            return ukl0.a(ukl0Var2, null, 0, null, LoadingState.Refresh, 31);
        }
        if (!(kkl0Var2 instanceof kkl0.a)) {
            return kkl0Var2 instanceof kkl0.c ? ukl0.a(ukl0Var2, null, 0, null, LoadingState.None, 31) : ukl0Var2;
        }
        kkl0.a aVar = (kkl0.a) kkl0Var2;
        return ukl0.a(ukl0Var2, null, 0, r3p0.a(ukl0Var2.f, false, false, aVar.a, aVar.b, false, 19), null, 47);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(kkl0 kkl0Var) {
        return true;
    }
}
