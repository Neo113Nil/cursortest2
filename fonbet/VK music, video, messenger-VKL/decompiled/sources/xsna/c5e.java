package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipsFavoritesInteractor.kt */
/* loaded from: classes16.dex */
public interface c5e {
    void a(FavoriteFolderId favoriteFolderId, UserId userId, String str, List list);

    void b(UserId userId, FavoriteFolderId favoriteFolderId, String str, List list, boolean z);

    void c(UserId userId, FavoriteFolderId favoriteFolderId, FavoriteFolderId favoriteFolderId2, String str, List list);

    void d(UserId userId, VideoFile videoFile, Activity activity);

    void e(UserId userId, VideoFile videoFile, Activity activity);

    void g(UserId userId, FavoriteFolderId.Id id, String str);

    io.reactivex.rxjava3.core.x h(UserId userId, String str, boolean z);

    io.reactivex.rxjava3.core.x i(UserId userId, FavoriteFolderId.Id id, String str);
}
