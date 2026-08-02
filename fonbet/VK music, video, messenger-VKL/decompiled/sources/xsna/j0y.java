package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetSuggestionsBlockTypeDto;
import com.vk.api.generated.groups.dto.GroupsGetSuggestionsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullShowSuggestionsDto;
import com.vk.api.generated.groups.dto.GroupsSuggestionDto;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.wqu;
import xsna.yqu;

/* compiled from: ExecuteJoinGroup.kt */
/* loaded from: classes15.dex */
public final class j0y extends awi<m0y> {
    public final UserId s;
    public final boolean t;
    public final String u;
    public final boolean v;
    public final String w;
    public final FullSourceJoinApi x;

    public /* synthetic */ j0y(UserId userId, boolean z, String str, String str2, FullSourceJoinApi fullSourceJoinApi, int i) {
        this(userId, z, (i & 4) != 0 ? null : str, false, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : fullSourceJoinApi);
    }

    public final UserId F0() {
        return this.s;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        List<GroupsGroupFullDto> d;
        FullSourceJoinApi fullSourceJoinApi;
        ComFeatures comFeatures = ComFeatures.COM_JOIN_FULL_SOURCE;
        comFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(comFeatures);
        zqu zquVar = new zqu();
        String str = this.t ? "1" : "0";
        GroupsSuggestions groupsSuggestions = null;
        String str2 = this.u;
        boolean z = ((BaseOkResponseDto) yfb.x(yqu.a.c(zquVar, this.s, str, (str2 == null || str2.length() <= 0) ? null : str2, this.w, null, null, null, (!a || (fullSourceJoinApi = this.x) == null) ? null : fullSourceJoinApi.a(), PsExtractor.VIDEO_STREAM_MASK)).f(l7r0Var)) == BaseOkResponseDto.OK;
        if (z && this.v && (d = ((GroupsGetByIdObjectResponseDto) yfb.x(wqu.a.b(zquVar, Collections.singletonList(this.s), Collections.singletonList(GroupsFieldsDto.SHOW_SUGGESTIONS), null, 4)).f(l7r0Var)).d()) != null && !d.isEmpty() && ((GroupsGroupFullDto) j5g.Y(d)).m2() == GroupsGroupFullShowSuggestionsDto.AFTER_SUBSCRIBE) {
            GroupsGetSuggestionsResponseDto groupsGetSuggestionsResponseDto = (GroupsGetSuggestionsResponseDto) yfb.x(xqu.w(zquVar, this.s, 20, null, e43.l(GroupsFieldsDto.PHOTO_BASE.k(), GroupsFieldsDto.ACTIVITY.k(), GroupsFieldsDto.CITY.k(), GroupsFieldsDto.COUNTRY.k(), GroupsFieldsDto.VERIFIED.k(), GroupsFieldsDto.TRENDING.k(), GroupsFieldsDto.MEMBER_STATUS.k(), GroupsFieldsDto.IS_CLOSED.k(), GroupsFieldsDto.ADMIN_LEVEL.k(), GroupsFieldsDto.PHOTO_AVG_COLOR.k(), GroupsFieldsDto.COVER.k(), GroupsFieldsDto.MEMBERS_COUNT.k(), GroupsFieldsDto.FRIENDS.k()), GroupsGetSuggestionsBlockTypeDto.INLINE, "group_subscribe", 4)).f(l7r0Var);
            String i = groupsGetSuggestionsResponseDto.f().i();
            String title = groupsGetSuggestionsResponseDto.getTitle();
            String e = groupsGetSuggestionsResponseDto.e();
            List<GroupsSuggestionDto> d2 = groupsGetSuggestionsResponseDto.d();
            ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
            Iterator<T> it = d2.iterator();
            while (it.hasNext()) {
                arrayList.add(hru.a((GroupsSuggestionDto) it.next()));
            }
            groupsSuggestions = new GroupsSuggestions(i, title, e, p4g.q(arrayList), null, groupsGetSuggestionsResponseDto.r());
        }
        return new m0y(z, groupsSuggestions);
    }

    public j0y(UserId userId, boolean z, String str, boolean z2, String str2, FullSourceJoinApi fullSourceJoinApi) {
        this.s = userId;
        this.t = z;
        this.u = str;
        this.v = z2;
        this.w = str2;
        this.x = fullSourceJoinApi;
    }
}
