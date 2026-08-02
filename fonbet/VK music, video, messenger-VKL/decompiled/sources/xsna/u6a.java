package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Collection;

/* compiled from: CatalogGetStickersSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final class u6a extends com.vk.catalog2.common.dto.api.a {
    public final String s;
    public final UserId t;
    public final Collection<UserId> u;

    public u6a(wba wbaVar, kca kcaVar, String str, UserId userId, Collection collection) {
        super(wbaVar, new jn2(0, kcaVar, kca.class, "loadRecentQueries", "loadRecentQueries()Lio/reactivex/rxjava3/core/Single;", 0, 2), "stickers_search_recent_block_id", null, null, 24);
        this.s = str;
        this.t = userId;
        this.u = collection;
    }

    @Override // com.vk.catalog2.common.dto.api.a
    public final io.reactivex.rxjava3.core.x<hda> p(String str) {
        String str2 = this.i;
        Collection<UserId> collection = this.u;
        return rsg0.w0(new v6a(this.c, str, str2, this.s, this.t, collection.size() == 1 ? (UserId) j5g.X(collection) : null));
    }
}
