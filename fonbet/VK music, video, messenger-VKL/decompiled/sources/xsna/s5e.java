package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAddToPlaylistPlaylistAliasDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosPlaylistAliasDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsPlaylistAliasesDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsTypeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoRemoveFromPlaylistPlaylistAliasDto;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.lgj0;

/* compiled from: ClipsFavoritesRepository.kt */
/* loaded from: classes16.dex */
public final class s5e {
    public static final List<String> e = e43.l("verified", "member_status", "friend_status", "first_name_gen", "image_status", "photo_base", "url", "trust_mark");
    public static final List<BaseUserGroupFieldsDto> f = e43.l(BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.VIDEO_FILES, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.IS_FAVORITE, BaseUserGroupFieldsDto.EMOJI_STATUS, BaseUserGroupFieldsDto.IMAGE_STATUS, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, BaseUserGroupFieldsDto.IS_ESIA_VERIFIED, BaseUserGroupFieldsDto.IS_TINKOFF_VERIFIED, BaseUserGroupFieldsDto.IS_SBER_VERIFIED, BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.URL);
    public final mgj0 a;
    public final lax0 b;
    public final c4e c;
    public final n9x0 d;

    public s5e(mgj0 mgj0Var, lax0 lax0Var, c4e c4eVar, n9x0 n9x0Var) {
        this.a = mgj0Var;
        this.b = lax0Var;
        this.c = c4eVar;
        this.d = n9x0Var;
    }

    public static io.reactivex.rxjava3.internal.operators.single.y c(s5e s5eVar, FavoriteFolderId favoriteFolderId, String str, int i) {
        ShortVideoGetOwnerVideosPlaylistAliasDto shortVideoGetOwnerVideosPlaylistAliasDto = null;
        String str2 = (i & 2) != 0 ? null : str;
        int i2 = (i & 4) != 0 ? 15 : 1;
        c4e c4eVar = s5eVar.c;
        mgj0 mgj0Var = s5eVar.a;
        FavoriteFolderId.Id id = favoriteFolderId instanceof FavoriteFolderId.Id ? (FavoriteFolderId.Id) favoriteFolderId : null;
        Integer valueOf = id != null ? Integer.valueOf(id.b) : null;
        FavoriteFolderId.Alias alias = favoriteFolderId instanceof FavoriteFolderId.Alias ? (FavoriteFolderId.Alias) favoriteFolderId : null;
        if (alias != null) {
            c4eVar.getClass();
            if (!alias.equals(FavoriteFolderId.Alias.AllClips.c)) {
                throw new NoWhenBranchMatchedException();
            }
            shortVideoGetOwnerVideosPlaylistAliasDto = ShortVideoGetOwnerVideosPlaylistAliasDto.FAVORITE;
        }
        return rsg0.w0(yfb.x(lgj0.a.g(mgj0Var, null, Integer.valueOf(i2), str2, e, null, null, valueOf, shortVideoGetOwnerVideosPlaylistAliasDto, null, null, 65329))).l(new ft0(new gl6(c4eVar, 3), 17));
    }

    public static io.reactivex.rxjava3.internal.operators.single.y d(s5e s5eVar, UserId userId, List list, String str, String str2, int i, int i2) {
        List list2 = (i2 & 2) != 0 ? EmptyList.b : list;
        String str3 = (i2 & 4) != 0 ? null : str;
        String str4 = (i2 & 8) != 0 ? null : str2;
        int i3 = (i2 & 16) != 0 ? 15 : i;
        c4e c4eVar = s5eVar.c;
        mgj0 mgj0Var = s5eVar.a;
        ShortVideoGetPlaylistsTypeDto shortVideoGetPlaylistsTypeDto = list2.isEmpty() ? ShortVideoGetPlaylistsTypeDto.FAVORITE : null;
        List list3 = list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (obj instanceof FavoriteFolderId.Id) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((FavoriteFolderId.Id) it.next()).b));
        }
        List x = rdi.x(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list3) {
            if (obj2 instanceof FavoriteFolderId.Alias) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            FavoriteFolderId.Alias alias = (FavoriteFolderId.Alias) it2.next();
            c4eVar.getClass();
            if (!alias.equals(FavoriteFolderId.Alias.AllClips.c)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList4.add(ShortVideoGetPlaylistsPlaylistAliasesDto.FAVORITE);
        }
        return rsg0.w0(yfb.x(mgj0.n(mgj0Var, userId, shortVideoGetPlaylistsTypeDto, x, rdi.x(arrayList4), null, str3, Integer.valueOf(i3), str4, 16))).l(new nm3(new wg1(c4eVar, 5), 5));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(FavoriteFolderId favoriteFolderId, UserId userId, String str, List list) {
        ShortVideoAddToPlaylistPlaylistAliasDto shortVideoAddToPlaylistPlaylistAliasDto = null;
        FavoriteFolderId.Id id = favoriteFolderId instanceof FavoriteFolderId.Id ? (FavoriteFolderId.Id) favoriteFolderId : null;
        Integer valueOf = id != null ? Integer.valueOf(id.b) : null;
        FavoriteFolderId.Alias alias = favoriteFolderId instanceof FavoriteFolderId.Alias ? (FavoriteFolderId.Alias) favoriteFolderId : null;
        c4e c4eVar = this.c;
        if (alias != null) {
            c4eVar.getClass();
            if (!alias.equals(FavoriteFolderId.Alias.AllClips.c)) {
                throw new NoWhenBranchMatchedException();
            }
            shortVideoAddToPlaylistPlaylistAliasDto = ShortVideoAddToPlaylistPlaylistAliasDto.FAVORITE;
        }
        return rsg0.w0(yfb.x(mgj0.y(this.a, userId, valueOf, shortVideoAddToPlaylistPlaylistAliasDto, list, str, 32))).l(new ux0(new p5e(c4eVar, 0), 15));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y b(UserId userId, FavoriteFolderId favoriteFolderId, List list) {
        ShortVideoRemoveFromPlaylistPlaylistAliasDto shortVideoRemoveFromPlaylistPlaylistAliasDto = null;
        FavoriteFolderId.Id id = favoriteFolderId instanceof FavoriteFolderId.Id ? (FavoriteFolderId.Id) favoriteFolderId : null;
        Integer valueOf = id != null ? Integer.valueOf(id.b) : null;
        FavoriteFolderId.Alias alias = favoriteFolderId instanceof FavoriteFolderId.Alias ? (FavoriteFolderId.Alias) favoriteFolderId : null;
        c4e c4eVar = this.c;
        if (alias != null) {
            c4eVar.getClass();
            if (!alias.equals(FavoriteFolderId.Alias.AllClips.c)) {
                throw new NoWhenBranchMatchedException();
            }
            shortVideoRemoveFromPlaylistPlaylistAliasDto = ShortVideoRemoveFromPlaylistPlaylistAliasDto.FAVORITE;
        }
        return rsg0.w0(yfb.x(this.a.j(userId, valueOf, shortVideoRemoveFromPlaylistPlaylistAliasDto, list))).l(new op0(new mx4(c4eVar, 2), 7));
    }
}
