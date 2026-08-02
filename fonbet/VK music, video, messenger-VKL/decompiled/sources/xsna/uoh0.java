package xsna;

import android.content.Context;
import com.vk.search.communities.map.api.router.SearchCommunitiesOnMapRouter;
import com.vk.search.communities.map.api.router.SearchMapPreviewStateWrapper;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;

/* compiled from: SearchCommunitiesOnMapRouterImpl.kt */
/* loaded from: classes5.dex */
public final class uoh0 implements SearchCommunitiesOnMapRouter {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.search.communities.map.api.router.SearchCommunitiesOnMapRouter
    public final void a(Context context, String str, SearchMapPreviewStateWrapper searchMapPreviewStateWrapper, SearchCommunitiesOnMapRouter.MapEntrypoint mapEntrypoint, String str2) {
        SearchCommunitiesOnMapFragment.b bVar = new SearchCommunitiesOnMapFragment.b();
        ?? r1 = bVar.m;
        ((SearchCommunitiesOnMapFragment.a) r1.getValue()).a.putString("query", str);
        ((SearchCommunitiesOnMapFragment.a) r1.getValue()).a.putParcelable("preview_state", searchMapPreviewStateWrapper);
        ((SearchCommunitiesOnMapFragment.a) r1.getValue()).a.putInt("entrypoint", mapEntrypoint.ordinal());
        ((SearchCommunitiesOnMapFragment.a) r1.getValue()).a.putString("searchSectionId", str2);
        bVar.s(true);
        bVar.k(context);
    }
}
