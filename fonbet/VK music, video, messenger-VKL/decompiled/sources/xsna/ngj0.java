package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetChallengeResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosPlaylistAliasDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosPlaylistDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosSortDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.lgj0;

/* compiled from: ShortVideoService.kt */
/* loaded from: classes2.dex */
public final class ngj0 implements mgj0 {
    public final xy2<ShortVideoGetChallengeResponseDto> C(String str, String str2, String str3, Integer num, Integer num2, List<String> list) {
        vfx vfxVar = new vfx("shortVideo.getChallenge", new qq(22), new rq(25));
        if (str != null) {
            vfx.m(vfxVar, "tag", str, 0, 12);
        }
        if (str2 != null) {
            vfx.m(vfxVar, "audio_id", str2, 0, 12);
        }
        if (str3 != null) {
            vfx.m(vfxVar, "mask_id", str3, 0, 12);
        }
        if (num != null) {
            vfx.k(vfxVar, "compilation_id", num.intValue(), 0, 12);
        }
        if (num2 != null) {
            vfx.k(vfxVar, "place_id", num2.intValue(), 0, 8);
        }
        if (list != null) {
            vfxVar.i("fields", list);
        }
        return vfxVar;
    }

    public final tfx D(String str, List list) {
        tfx tfxVar = new tfx("shortVideo.getTemplate", new as(29), new p11(25));
        tfx.o(tfxVar, "short_video_raw_id", str, 0, 0, 12);
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ShortVideoGetTemplateFieldsDto) it.next()).i());
        }
        tfxVar.i("fields", arrayList);
        return tfxVar;
    }

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
        vfx vfxVar = new vfx("shortVideo.addAnonLike", new wd10(12), new nyh0(1));
        vfx.m(vfxVar, "device_id", str, 0, 12);
        vfx.l(vfxVar, "video_owner_id", userId, 12);
        vfx.k(vfxVar, "video_id", i, 0, 8);
        return vfxVar;
    }

    @Override // xsna.lgj0
    public final vfx o(Integer num, String str, String str2, String str3, String str4, String str5, List list, Integer num2, String str6, Integer num3, List list2, String str7) {
        return lgj0.a.k(num, str, str2, str3, str4, str5, list, num2, str6, num3, list2, str7);
    }

    @Override // xsna.lgj0
    public final xy2 q(int i, UserId userId, String str) {
        vfx vfxVar = new vfx("shortVideo.deleteAnonLike", new hub0(4), new zy60(9));
        vfx.m(vfxVar, "device_id", str, 0, 12);
        vfx.l(vfxVar, "video_owner_id", userId, 12);
        vfx.k(vfxVar, "video_id", i, 0, 8);
        return vfxVar;
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
