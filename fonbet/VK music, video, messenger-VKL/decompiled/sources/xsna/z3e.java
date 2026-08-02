package xsna;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.List;
import xsna.tlo0;

/* compiled from: ClipsFavoriteFoldersListMapper.kt */
/* loaded from: classes16.dex */
public final class z3e {
    public static v3e a(u2e u2eVar) {
        UserId userId = u2eVar.b;
        FavoriteFolderId favoriteFolderId = u2eVar.a;
        List<Image> list = u2eVar.c;
        tlo0.h d = oq.d(tlo0.Companion, u2eVar.d);
        int i = u2eVar.e;
        return new v3e(userId, favoriteFolderId, list, d, i == 0 ? new tlo0.f(R.string.clips_favorites_folders_list_no_clips) : tlo0.a.a(R.plurals.clips_favorites_folders_list_folder_description, i, Integer.valueOf(i)));
    }
}
