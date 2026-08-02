package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj6 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mj6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj4;
                int intValue = ((Integer) obj2).intValue();
                ((Integer) obj3).getClass();
                int i2 = BasePhotoListFragment.m0;
                int i3 = intValue > iah0.a((float) 600) ? 4 : 3;
                basePhotoListFragment.U = i3;
                GridLayoutManager gridLayoutManager = basePhotoListFragment.T;
                if ((gridLayoutManager == null ? null : gridLayoutManager).s != i3) {
                    if (gridLayoutManager == null) {
                        gridLayoutManager = null;
                    }
                    gridLayoutManager.setSpanCount(i3);
                    aq2 aq2Var = basePhotoListFragment.Y;
                    (aq2Var != null ? aq2Var : null).getRecyclerView().invalidateItemDecorations();
                }
                break;
            case 1:
                k150 k150Var = (k150) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-67471629, intValue2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.playlistItems.<anonymous> (MusicPlaylistListContent.kt:187)");
                    }
                    k150Var.d(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                bs60 bs60Var = (bs60) obj4;
                NewsfeedResearch newsfeedResearch = (NewsfeedResearch) obj2;
                bs60Var.getClass();
                bs60Var.m((NewsEntry) obj, newsfeedResearch.b, newsfeedResearch.c, (MobileOfficialAppsCoreNavStat$EventScreen) obj3);
                break;
        }
        return s3q0.a;
    }
}
