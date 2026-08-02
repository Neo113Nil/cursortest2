package xsna;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsFavoritesNavigatorFactory.kt */
/* loaded from: classes16.dex */
public interface m5e {
    static /* synthetic */ oz50 a(m5e m5eVar, UserId userId, boolean z, int i) {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        Boolean bool3 = (i & 2) != 0 ? null : bool;
        Integer num = (i & 4) != 0 ? null : 2;
        Boolean bool4 = (i & 8) != 0 ? null : bool2;
        if ((i & 16) != 0) {
            z = false;
        }
        return m5eVar.c(userId, bool3, num, bool4, z);
    }

    oz50 b(UserId userId, FavoriteFolderId favoriteFolderId, String str, boolean z);

    oz50 c(UserId userId, Boolean bool, Integer num, Boolean bool2, boolean z);
}
