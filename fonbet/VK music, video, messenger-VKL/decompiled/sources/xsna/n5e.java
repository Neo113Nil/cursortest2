package xsna;

import android.os.Bundle;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsFavoritesNavigatorFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class n5e implements m5e {
    @Override // xsna.m5e
    public final oz50 b(UserId userId, FavoriteFolderId favoriteFolderId, String str, boolean z) {
        ClipsFavoriteFolderContentListFragment.a aVar = new ClipsFavoriteFolderContentListFragment.a(userId, favoriteFolderId, str);
        aVar.y(z);
        return aVar;
    }

    @Override // xsna.m5e
    public final oz50 c(UserId userId, Boolean bool, Integer num, Boolean bool2, boolean z) {
        ClipsFavoriteFoldersListFragment.a aVar = new ClipsFavoriteFoldersListFragment.a(ClipsFavoriteFoldersListFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("owner_id", userId);
        if (bool != null) {
            bundle.putBoolean("create_folder_button_visible", bool.booleanValue());
        }
        if (num != null) {
            bundle.putInt("folders_span_count", num.intValue());
        }
        if (bool2 != null) {
            bundle.putBoolean("pull_to_refresh", bool2.booleanValue());
        }
        bundle.putBoolean("force_dark_theme", z);
        if (z) {
            dhr0.a.getClass();
            aVar.w(dhr0.u().c);
        }
        return aVar;
    }
}
