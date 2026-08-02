package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.toggle.features.ComFeatures;
import java.util.ArrayList;

/* compiled from: GroupsRecommendationsPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class nqu extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        ArrayList<GroupSuggestion> arrayList;
        NewsEntry newsEntry = u1c0Var.a;
        GroupsSuggestions groupsSuggestions = newsEntry instanceof GroupsSuggestions ? (GroupsSuggestions) newsEntry : null;
        if (groupsSuggestions == null || (arrayList = groupsSuggestions.l) == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        ArrayList<GroupSuggestion> arrayList;
        GroupSuggestion groupSuggestion;
        Group group;
        NewsEntry newsEntry = u1c0Var.a;
        GroupsSuggestions groupsSuggestions = newsEntry instanceof GroupsSuggestions ? (GroupsSuggestions) newsEntry : null;
        if (groupsSuggestions == null || (arrayList = groupsSuggestions.l) == null || (groupSuggestion = (GroupSuggestion) j5g.b0(i, arrayList)) == null || (group = groupSuggestion.b) == null) {
            return null;
        }
        return group.e;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        if (!(newsEntry instanceof GroupsSuggestions)) {
            return null;
        }
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GET_RECOM_GROUPS;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            fz2 y = yfb.y(new zqu().z(null, str, 20, newsEntry.b.b, e43.l(BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.ACTIVITY, BaseUserGroupFieldsDto.CITY, BaseUserGroupFieldsDto.COUNTRY, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.MEMBER_STATUS, BaseUserGroupFieldsDto.IS_CLOSED, BaseUserGroupFieldsDto.ADMIN_LEVEL, BaseUserGroupFieldsDto.PHOTO_AVG_COLOR, BaseUserGroupFieldsDto.COVER, BaseUserGroupFieldsDto.MEMBERS_COUNT)), new gvs(1));
            y.n = true;
            return rsg0.y0(y, null, null, 3).U(new e7(new dkg((GroupsSuggestions) newsEntry, 21), 27));
        }
        com.vk.api.groups.a aVar = new com.vk.api.groups.a(null, 20);
        if (str != null && str.length() != 0) {
            aVar.K("ref", str);
        }
        String str2 = newsEntry.b.b;
        if (str2 != null && str2.length() != 0) {
            aVar.K("track_code", str2);
        }
        aVar.n = true;
        return rsg0.y0(aVar, null, null, 3).U(new e7(new dkg((GroupsSuggestions) newsEntry, 21), 27));
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.b);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
