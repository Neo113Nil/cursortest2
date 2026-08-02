package xsna;

import android.content.Context;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.toggle.features.SmbFeatures;
import xsna.bbj0;

/* compiled from: CommunityMarketRouterImpl.kt */
/* loaded from: classes18.dex */
public final class r9h implements q9h {
    public final boolean a;

    public r9h() {
        SmbFeatures smbFeatures = SmbFeatures.FEATURE_SMB_ALBUM_EDITOR_REFACTORING;
        smbFeatures.getClass();
        this.a = com.vk.toggle.b.A.a(smbFeatures);
    }

    @Override // xsna.q9h
    public final void a(int i, Context context, UserId userId) {
        new MarketEditAlbumGoodsFragment.a(userId, Integer.valueOf(i)).k(context);
    }

    @Override // xsna.q9h
    public final void b(Context context, MarketItemLabelActionDto marketItemLabelActionDto) {
        new e5u(context).a(marketItemLabelActionDto);
    }

    @Override // xsna.q9h
    public final void c(Context context, UserId userId) {
        (this.a ? new MarketEditAlbumCoverFragment.a(userId) : new MarketEditAlbumCoverFragment.a(userId)).k(context);
    }

    @Override // xsna.q9h
    public final void d(int i, Context context, UserId userId) {
        long j = userId.b;
        bbj0.a.getClass();
        tbj0 a = bbj0.b.d.a(context);
        a.s("https://" + a0a.d + "/market" + j + "?section=album_" + i, true);
        a.p = false;
        qn9 qn9Var = new qn9(4, context, a);
        p31 p31Var = new p31(a, 14);
        t6g0 t6g0Var = t6g0.b;
        gxh b = t6g0.b();
        b.clear();
        b.N0(new UserId(Math.abs(j))).subscribe(new ph3(new oh3(20, qn9Var, p31Var), 29), new oz(new bgy(p31Var, 6), 22));
    }
}
