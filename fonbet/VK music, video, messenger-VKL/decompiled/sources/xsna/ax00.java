package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.ecomm.market.album.editor.cover.presentation.b;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.ix00;
import xsna.kx00;
import xsna.sw50;
import xsna.zw00;

/* compiled from: MarketEditAlbumCoverFeature.kt */
/* loaded from: classes18.dex */
public final class ax00 extends wk50<ox00, kx00, zw00, ix00> {
    public final UserId f;
    public final GoodAlbumEditFlowEntity g;
    public final eo9 h;
    public final com.vk.ecomm.market.album.editor.cover.presentation.a i;
    public final boolean j;

    public ax00(jx00 jx00Var, UserId userId, GoodAlbumEditFlowEntity goodAlbumEditFlowEntity, eo9 eo9Var, com.vk.ecomm.market.album.editor.cover.presentation.a aVar) {
        super(new zw00.b(userId), jx00Var);
        Integer num;
        this.f = userId;
        this.g = goodAlbumEditFlowEntity;
        this.h = eo9Var;
        this.i = aVar;
        boolean z = false;
        if (goodAlbumEditFlowEntity != null && (num = goodAlbumEditFlowEntity.d) != null && num.intValue() != -1) {
            z = true;
        }
        this.j = z;
    }

    @Override // xsna.wk50
    public final void N(kx00 kx00Var, zw00 zw00Var) {
        String str;
        kx00 kx00Var2 = kx00Var;
        zw00 zw00Var2 = zw00Var;
        if (zw00Var2 instanceof zw00.b) {
            UserId userId = ((zw00.b) zw00Var2).b;
            T(ix00.b.b);
            this.e.b(rsg0.W(yfb.x(((yd10) this.h.a).y(fkq0.a(userId))), 7).l(new ql2(new hyu(4), 26)).m(asu0.a.d()).subscribe(new hv(new s8(1, this, ax00.class, "onSuccess", "onSuccess(Lcom/vk/ecomm/market/album/editor/cover/domain/MarketSettingsModel;)V", 0, 10), 29), new ir0(new ow4(1, this, ax00.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0, 5), 22)));
            return;
        }
        if (zw00Var2 instanceof zw00.a) {
            zw00.a aVar = (zw00.a) zw00Var2;
            if (aVar instanceof zw00.a.C4205a) {
                T(new ix00.a.b(((zw00.a.C4205a) aVar).b));
                return;
            }
            if (aVar instanceof zw00.a.c) {
                T(new ix00.a.c(((zw00.a.c) aVar).b));
                return;
            }
            if (aVar instanceof zw00.a.b) {
                T(new ix00.a.C3086a(((zw00.a.b) aVar).b));
                return;
            }
            if (!(aVar instanceof zw00.a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            zw00.a.d dVar = (zw00.a.d) aVar;
            String str2 = dVar.b;
            if ((kx00Var2 instanceof kx00.a) && epx.f(((kx00.a) kx00Var2).b, str2)) {
                return;
            }
            T(new ix00.a.d(str2, dVar.c));
            return;
        }
        if (!(zw00Var2 instanceof zw00.c)) {
            throw new NoWhenBranchMatchedException();
        }
        zw00.c cVar = (zw00.c) zw00Var2;
        boolean z = cVar instanceof zw00.c.b;
        com.vk.ecomm.market.album.editor.cover.presentation.a aVar2 = this.i;
        if (z) {
            rr00.a(aVar2.a.requireContext(), new jrh(aVar2, 24));
            return;
        }
        boolean z2 = true;
        if (cVar instanceof zw00.c.C4206c) {
            ((zw00.c.C4206c) cVar).getClass();
            aVar2.getClass();
            aVar2.c.g().d(aVar2.a, 4, 1, new sw50.f.a(null, null, 31));
            return;
        }
        if (!(cVar instanceof zw00.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (kx00Var2 instanceof kx00.a) {
            kx00.a aVar3 = (kx00.a) kx00Var2;
            String str3 = aVar3.b;
            if (str3 != null && !drm0.N(str3)) {
                z2 = false;
            }
            T(new ix00.a.e(z2));
            if (z2) {
                return;
            }
            if (str3 == null || (str = drm0.p0(str3).toString()) == null) {
                str = "";
            }
            String str4 = str;
            boolean z3 = aVar3.g;
            boolean z4 = aVar3.f;
            Photo photo = aVar3.e;
            GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = this.g;
            GoodAlbumEditFlowEntity zb = goodAlbumEditFlowEntity != null ? GoodAlbumEditFlowEntity.zb(goodAlbumEditFlowEntity, str4, null, photo, 0, z3, z4, null, 917) : new GoodAlbumEditFlowEntity(this.f, str4, null, photo, 0, z3, z4, new ArrayList(), null, null, 772, null);
            f4z<com.vk.ecomm.market.album.editor.cover.presentation.b> f4zVar = aVar2.b;
            MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = aVar2.a;
            mhy.b(marketEditAlbumCoverFragment.requireContext());
            if (this.j) {
                f4zVar.b(new b.C0941b(zb));
            } else {
                f4zVar.b(b.a.a);
                new MarketEditAlbumGoodsFragment.a(zb).k(marketEditAlbumCoverFragment.requireContext());
            }
        }
    }
}
