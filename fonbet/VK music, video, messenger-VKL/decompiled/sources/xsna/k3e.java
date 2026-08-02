package xsna;

import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.favorites.impl.ui.folders.content.c;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.tlo0;

/* compiled from: ClipsFavoriteFolderMultiSelectMapper.kt */
/* loaded from: classes16.dex */
public final class k3e {
    public final com.vk.clips.favorites.impl.ui.folders.content.c a;

    public k3e(com.vk.clips.favorites.impl.ui.folders.content.c cVar) {
        this.a = cVar;
    }

    public final ClipsFavoriteFolderContentListViewState.g a(ClipsFavoriteFolderContentListState clipsFavoriteFolderContentListState) {
        tlo0 a;
        List singletonList;
        boolean z = clipsFavoriteFolderContentListState instanceof ClipsFavoriteFolderContentListState.b;
        com.vk.clips.favorites.impl.ui.folders.content.c cVar = this.a;
        if (z || (clipsFavoriteFolderContentListState instanceof ClipsFavoriteFolderContentListState.Content)) {
            ClipsFavoriteFolderContentListState.c g = clipsFavoriteFolderContentListState.g();
            if (g instanceof ClipsFavoriteFolderContentListState.c.b) {
                int size = ((ClipsFavoriteFolderContentListState.c.b) g).a.size();
                boolean z2 = cVar instanceof c.b;
                a.e.d dVar = a.e.d.b;
                if (z2) {
                    singletonList = e43.l(new ClipsFavoriteFolderContentListViewState.g.b.a(dVar, ((c.b) cVar).b.equals(FavoriteFolderId.Alias.AllClips.c) ? tq.h(tlo0.Companion, R.string.clips_favorites_snackbar_add_to_folder) : tq.h(tlo0.Companion, R.string.clips_favorites_folder_content_list_action_move), true, size != 0), new ClipsFavoriteFolderContentListViewState.g.b.a(a.e.b.b, tq.h(tlo0.Companion, R.string.delete), false, size != 0));
                } else {
                    if (!(cVar instanceof c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (size == 0) {
                        a = tq.h(tlo0.Companion, R.string.clips_favorites_folder_content_list_add_clips_button);
                    } else {
                        tlo0.a aVar = tlo0.Companion;
                        Object[] objArr = {Integer.valueOf(size)};
                        aVar.getClass();
                        a = tlo0.a.a(R.plurals.clips_favorites_folder_content_list_add_clips_button_plural, size, objArr);
                    }
                    singletonList = Collections.singletonList(new ClipsFavoriteFolderContentListViewState.g.b.a(dVar, a, true, size != 0));
                }
                return new ClipsFavoriteFolderContentListViewState.g.b(singletonList);
            }
            if (!(g instanceof ClipsFavoriteFolderContentListState.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(clipsFavoriteFolderContentListState instanceof ClipsFavoriteFolderContentListState.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(cVar instanceof c.b)) {
                if (cVar instanceof c.a) {
                    return new ClipsFavoriteFolderContentListViewState.g.b(EmptyList.b);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return ClipsFavoriteFolderContentListViewState.g.a.a;
    }
}
