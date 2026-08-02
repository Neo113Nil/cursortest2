package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.groups.GroupsGetSuggestions;
import com.vk.communities.GroupsSuggestionsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupSuggestion;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.ComFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GroupsSuggestionsPresenter.kt */
/* loaded from: classes17.dex */
public final class pru implements gm6, c.m<kru> {
    public final GroupsSuggestionsFragment b;
    public String d;
    public String f;
    public String c = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUPS_SUGGESTED_LIST);
    public UserId e = UserId.d;
    public final ListDataSet<GroupSuggestion> g = new ListDataSet<>();

    /* compiled from: GroupsSuggestionsPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public pru(GroupsSuggestionsFragment groupsSuggestionsFragment) {
        this.b = groupsSuggestionsFragment;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<kru> O9(String str, com.vk.lists.c cVar) {
        if (!fkq0.c(this.e)) {
            ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GET_RECOM_GROUPS;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures)) {
                return rsg0.y0(yfb.y(new zqu().z(str, this.c, 30, this.d, e43.l(BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.ACTIVITY, BaseUserGroupFieldsDto.CITY, BaseUserGroupFieldsDto.COUNTRY, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.MEMBER_STATUS, BaseUserGroupFieldsDto.IS_CLOSED, BaseUserGroupFieldsDto.ADMIN_LEVEL, BaseUserGroupFieldsDto.PHOTO_AVG_COLOR, BaseUserGroupFieldsDto.COVER, BaseUserGroupFieldsDto.MEMBERS_COUNT)), new g8(26)), null, null, 3);
            }
            com.vk.api.groups.a aVar = new com.vk.api.groups.a(str, 30);
            String str2 = this.c;
            if (str2 != null && str2.length() != 0) {
                aVar.K("ref", str2);
            }
            String str3 = this.d;
            if (str3 != null && str3.length() != 0) {
                aVar.K("track_code", str3);
            }
            return rsg0.y0(aVar, null, null, 3).U(new pq(new azt(2), 10));
        }
        ComFeatures comFeatures2 = ComFeatures.COM_CODEGEN_GROUPS_SUGGESTIONS;
        comFeatures2.getClass();
        if (!com.vk.toggle.b.A.a(comFeatures2)) {
            GroupsGetSuggestions groupsGetSuggestions = new GroupsGetSuggestions(30, this.e, str);
            String str4 = this.d;
            if (str4 != null && str4.length() != 0) {
                groupsGetSuggestions.K("track_code", str4);
            }
            String str5 = this.c;
            if (str5 != null && str5.length() != 0) {
                groupsGetSuggestions.K("ref", str5);
            }
            return rsg0.y0(groupsGetSuggestions, null, null, 3);
        }
        zqu zquVar = new zqu();
        UserId a2 = fkq0.a(this.e);
        List l = e43.l(GroupsFieldsDto.PHOTO_BASE, GroupsFieldsDto.ACTIVITY, GroupsFieldsDto.CITY, GroupsFieldsDto.COUNTRY, GroupsFieldsDto.VERIFIED, GroupsFieldsDto.TRENDING, GroupsFieldsDto.MEMBER_STATUS, GroupsFieldsDto.IS_CLOSED, GroupsFieldsDto.ADMIN_LEVEL, GroupsFieldsDto.PHOTO_AVG_COLOR, GroupsFieldsDto.COVER, GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.FRIENDS);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(((GroupsFieldsDto) it.next()).k());
        }
        dz2 x = yfb.x(xqu.w(zquVar, a2, 30, str, arrayList, null, this.c, 16));
        String str6 = this.d;
        if (str6 != null && str6.length() != 0) {
            x.K("track_code", this.d);
        }
        return rsg0.y0(x, null, null, 3).U(new c8(new yy(28), 16));
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.gm6
    public final void d() {
        c.h hVar = new c.h(this);
        hVar.c = 10;
        hVar.i = 30;
        GroupsSuggestionsFragment groupsSuggestionsFragment = this.b;
        hVar.f = groupsSuggestionsFragment.W;
        com.vk.lists.f.a(hVar, groupsSuggestionsFragment.T);
        String str = this.f;
        if (str == null || str.length() == 0) {
            return;
        }
        groupsSuggestionsFragment.m(this.f);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<kru> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<kru> qVar, boolean z, com.vk.lists.c cVar) {
        this.b.eo(qVar.subscribe(new az(new fkj(cVar, z, this), 28), new ho1(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 26)));
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
