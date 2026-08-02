package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosPlaylistAliasDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.lgj0;

/* compiled from: ClipsFavoriteFolderSource.kt */
/* loaded from: classes17.dex */
public final class l3e {
    public static final List<String> b = e43.l("verified", "member_status", "friend_status", "first_name_gen", "image_status", "photo_base", "url", "trust_mark");
    public final xy2<ShortVideoGetOwnerVideosResponseDto> a;

    public l3e(FavoriteFolderId favoriteFolderId, PaginationKey paginationKey, int i) {
        ShortVideoGetOwnerVideosPlaylistAliasDto shortVideoGetOwnerVideosPlaylistAliasDto;
        ngj0 ngj0Var = new ngj0();
        FavoriteFolderId.Id id = favoriteFolderId instanceof FavoriteFolderId.Id ? (FavoriteFolderId.Id) favoriteFolderId : null;
        Integer valueOf = id != null ? Integer.valueOf(id.b) : null;
        FavoriteFolderId.Alias alias = favoriteFolderId instanceof FavoriteFolderId.Alias ? (FavoriteFolderId.Alias) favoriteFolderId : null;
        if (alias == null) {
            shortVideoGetOwnerVideosPlaylistAliasDto = null;
        } else {
            if (!(alias instanceof FavoriteFolderId.Alias.AllClips)) {
                throw new NoWhenBranchMatchedException();
            }
            shortVideoGetOwnerVideosPlaylistAliasDto = ShortVideoGetOwnerVideosPlaylistAliasDto.FAVORITE;
        }
        PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
        this.a = lgj0.a.g(ngj0Var, null, Integer.valueOf(i), next != null ? next.b : null, b, null, null, valueOf, shortVideoGetOwnerVideosPlaylistAliasDto, null, null, 65329);
    }
}
