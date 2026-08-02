package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosPlaylistAliasDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosPlaylistDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosSortDto;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.lgj0;

/* compiled from: ShortVideoService.kt */
/* loaded from: classes.dex */
public final class ogj0 implements lgj0 {
    @Override // xsna.lgj0
    public final vfx c(UserId userId, int i, String str, List list, List list2, Boolean bool, Integer num, String str2, List list3, String str3) {
        return lgj0.a.a(userId, i, str, list, list2, bool, num, str2, list3, str3);
    }

    @Override // xsna.lgj0
    public final vfx d(List list, List list2) {
        return lgj0.a.c(list, list2);
    }

    @Override // xsna.lgj0
    public final vfx f(UserId userId, Integer num, String str, List list, Boolean bool, ShortVideoGetOwnerVideosPlaylistDto shortVideoGetOwnerVideosPlaylistDto, Integer num2, ShortVideoGetOwnerVideosPlaylistAliasDto shortVideoGetOwnerVideosPlaylistAliasDto, String str2, Integer num3, ShortVideoGetOwnerVideosSortDto shortVideoGetOwnerVideosSortDto) {
        return lgj0.a.f(userId, num, str, list, bool, shortVideoGetOwnerVideosPlaylistDto, num2, shortVideoGetOwnerVideosPlaylistAliasDto, str2, num3, shortVideoGetOwnerVideosSortDto);
    }

    @Override // xsna.lgj0
    public final xy2 m(int i, UserId userId, String str) {
        throw null;
    }

    @Override // xsna.lgj0
    public final vfx o(Integer num, String str, String str2, String str3, String str4, String str5, List list, Integer num2, String str6, Integer num3, List list2, String str7) {
        return lgj0.a.k(num, str, str2, str3, str4, str5, list, num2, str6, num3, list2, str7);
    }

    @Override // xsna.lgj0
    public final xy2 q(int i, UserId userId, String str) {
        throw null;
    }

    @Override // xsna.lgj0
    public final vfx s(int i, UserId userId, String str) {
        return lgj0.a.m(i, userId, str);
    }

    @Override // xsna.lgj0
    public final vfx w(Integer num, String str, String str2, String str3, List list, Integer num2, String str4, Integer num3, List list2, String str5, String str6) {
        return lgj0.a.h(num, str, str2, str3, list, num2, str4, num3, list2, str5, str6);
    }
}
