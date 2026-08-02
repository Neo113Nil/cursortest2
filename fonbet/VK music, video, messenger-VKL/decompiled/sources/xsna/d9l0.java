package xsna;

import android.os.Bundle;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.sticker.StickersVerticalListVh;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.stickers.ContextUser;
import com.vk.toggle.features.MusicFeatures;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StickersCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class d9l0 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final Collection<Long> D;
    public final String E;
    public final ContextUser F;
    public final xga G;
    public final e2a H;

    /* compiled from: StickersCatalogConfiguration.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<CatalogBlockItemsDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogBlockItemsDto catalogBlockItemsDto) {
            return ((e2a) this.receiver).a(catalogBlockItemsDto);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9l0(Bundle bundle) {
        super(UserId.d, bundle.getString("ref"));
        List<Long> t0;
        long[] longArray = bundle.getLongArray("gift_users");
        List<Long> list = (longArray == null || (t0 = rl3.t0(longArray)) == null) ? EmptyList.b : t0;
        String string = bundle.getString("key_url");
        ContextUser contextUser = (ContextUser) bundle.getParcelable("context_user");
        this.D = list;
        this.E = string;
        this.F = contextUser;
        this.G = new xga();
        this.H = new e2a();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        UserId userId;
        boolean z = catalogConfiguration$Companion$ContainerType == CatalogConfiguration$Companion$ContainerType.VERTICAL;
        ContextUser contextUser = this.F;
        return new e9l0(z, this.c, (contextUser == null || (userId = contextUser.b) == null) ? null : Long.valueOf(userId.b), new c9l0());
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        wba wbaVar = new wba();
        Collection<Long> collection = this.D;
        return rsg0.y0(new r6a(wbaVar, str, str2, z, collection.size() == 1 ? (Long) j5g.X(collection) : null, null, null, null, 448), null, null, 3);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        return new StickersVerticalListVh(this, hVar, tbaVar, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final io.reactivex.rxjava3.core.q<hda> j(String str, String str2, String str3) {
        UserId userId;
        Collection<Long> collection = this.D;
        if (!MusicFeatures.AUTOGEN_GET_BLOCK_ITEMS.h()) {
            return rsg0.y0(new a6a(new wba(), str == null ? "" : str, str2, collection.size() == 1 ? (Long) j5g.X(collection) : null, str3, null, 72), null, null, 3);
        }
        xga xgaVar = this.G;
        String str4 = str == null ? "" : str;
        if (collection.size() == 1) {
            long longValue = ((Number) j5g.X(collection)).longValue();
            gzs<s3q0> gzsVar = fkq0.a;
            userId = new UserId(longValue);
        } else {
            userId = null;
        }
        return rsg0.y0(yfb.x(wga.f(xgaVar, str4, str2, null, userId, null, null, str3, 492)), null, null, 3).U(new hi70(new a(1, this.H, e2a.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogBlockItemsDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 6));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final Bundle r() {
        Bundle r = super.r();
        r.putString("key_url", this.E);
        r.putLongArray("gift_users", j5g.P0(this.D));
        r.putParcelable("context_user", this.F);
        return r;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        wba wbaVar = new wba();
        Collection<Long> collection = this.D;
        return rsg0.y0(new t6a(wbaVar, str, userId, collection.size() == 1 ? (Long) j5g.X(collection) : null, this.E), null, null, 3);
    }
}
