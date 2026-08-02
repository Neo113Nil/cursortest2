package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.grid.repository.cache.GridHeaderMemCache;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.wfu;

/* compiled from: Header.kt */
/* loaded from: classes17.dex */
public final class uvu extends lt6 {
    public final zof h;

    public uvu(UserId userId, wee weeVar, sdq0 sdq0Var, zof zofVar) {
        super(null, userId, weeVar, new z490(false, false, false, false, false), sdq0Var);
        this.h = zofVar;
    }

    @Override // xsna.wfu
    public final void a(wfu.a aVar, List<ClipGridParams.Data.Profile> list) {
        if (!(aVar instanceof wfu.a.b)) {
            this.a.jm(null);
            return;
        }
        this.g = list;
        nee neeVar = ((wfu.a.b) aVar).a;
        List<ClipVideoFile> list2 = neeVar.f;
        d(neeVar, !(list2 == null || list2.isEmpty()), !r3.d.isEmpty());
    }

    @Override // xsna.y490, xsna.wfu
    public final io.reactivex.rxjava3.core.x<wfu.a> b() {
        mwu c = this.e.c(String.valueOf(this.b.b));
        GridHeaderMemCache.HeaderCache.OwnerCache ownerCache = c != null ? (GridHeaderMemCache.HeaderCache.OwnerCache) c : null;
        if (ownerCache == null || ownerCache.b.isEmpty()) {
            return super.b();
        }
        EmptyList emptyList = EmptyList.b;
        PaginationKey.Initial initial = PaginationKey.Initial.b;
        return io.reactivex.rxjava3.core.x.k(new wfu.a.b(new nee(emptyList, initial, emptyList, 0L, initial, ownerCache.c, null, null, null, 0L, 0L, ownerCache.b, emptyList, initial), emptyList, emptyList, emptyList));
    }

    @Override // xsna.y490
    public final io.reactivex.rxjava3.core.x<nee> c() {
        PaginationKey.Initial initial = PaginationKey.Initial.b;
        z490 z490Var = this.c;
        return new io.reactivex.rxjava3.internal.operators.single.c(new kee(new lee(this.b, initial, 0, z490Var.b, z490Var.d, this.h)));
    }
}
