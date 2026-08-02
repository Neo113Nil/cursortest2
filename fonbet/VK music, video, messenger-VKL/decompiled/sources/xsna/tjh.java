package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsTabContentNarrativesDto;
import com.vk.api.generated.narratives.dto.NarrativesNarrativeDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.cvd0;

/* compiled from: CommunityProfileContentNarrativeFeatureDelegates.kt */
/* loaded from: classes5.dex */
public final class tjh extends nfh<uu50, s3q0> {
    public final ynh j;
    public boolean k;

    public tjh(UserId userId, io.reactivex.rxjava3.disposables.b bVar, bw6 bw6Var, p99 p99Var, po5 po5Var, ynh ynhVar) {
        super(userId, bVar, bw6Var, p99Var, po5Var, false);
        this.j = ynhVar;
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        GroupContentTabSetting s;
        this.i = true;
        if (this.k && (contentTab instanceof ContentTab.Narrative) && (s = s(extendedCommunityProfile)) != null) {
            uu50 r = r(s, true);
            this.c.invoke(new d.f(r));
            k(r, extendedCommunityProfile);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        GroupContentTabSetting s = s(extendedCommunityProfile);
        if (s != null) {
            uu50 r = r(s, true);
            this.c.invoke(new d.f(r));
            if (this.i && (communityProfileState.e instanceof ContentTab.Narrative)) {
                k(r, extendedCommunityProfile);
            } else {
                this.k = true;
            }
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        k((uu50) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.C1599j(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        uu50 i = uu50.i((uu50) communityProfileContentItem, null, false, null, null, null, CommunityProfileContentItem.State.LOADING, false, 1919);
        q(i);
        t(i, false);
    }

    @Override // xsna.jxg
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.AbstractC1595d.f(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        uu50 i = uu50.i((uu50) communityProfileContentItem, null, false, null, null, null, CommunityProfileContentItem.State.LOADING, false, 1919);
        q(i);
        t(i, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nfh
    public final io.reactivex.rxjava3.core.q<s3q0> m() {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(((gu50) this.j.S.getValue()).a().a.a0(io.reactivex.rxjava3.android.schedulers.a.b()), new q40(new rmg(this, 2), 10)).U(new zn(new nj(11), 10));
    }

    public final uu50 r(GroupContentTabSetting groupContentTabSetting, boolean z) {
        return new uu50(nfh.p(this, groupContentTabSetting, R.string.community_content_narratives_empty, Integer.valueOf(R.string.community_content_create_narrative), null, 12), new CommunityProfileContentItem.c(R.string.community_content_narratives_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, nfh.n(this, groupContentTabSetting, 0, 0, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), CommunityProfileContentItem.State.INITIAL, false, false, 1792);
    }

    public final GroupContentTabSetting s(ExtendedCommunityProfile extendedCommunityProfile) {
        List<GroupContentTabSetting> list;
        Object obj = null;
        if (extendedCommunityProfile == null || (list = extendedCommunityProfile.U2) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((GroupContentTabSetting) next).b == GroupContentTabType.NARRATIVES) {
                obj = next;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    public final void t(final uu50 uu50Var, final boolean z) {
        l(rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(this.a), Collections.singletonList(GroupsContentTabsDto.NARRATIVES), null, uu50Var.l, GroupsGetContentForTabsContentDto.NARRATIVES, 45, 60)), 7), new izs() { // from class: xsna.sjh
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                LinkedHashMap linkedHashMap;
                LinkedHashMap linkedHashMap2;
                Map map;
                Map map2;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentNarrativesDto n = groupsGetContentForTabsResponseDto.n();
                List<NarrativesNarrativeDto> d = n != null ? n.d() : null;
                if (d == null) {
                    d = EmptyList.b;
                }
                tjh tjhVar = tjh.this;
                uu50 uu50Var2 = uu50Var;
                boolean z2 = z;
                if (z2 && d.isEmpty()) {
                    tjhVar.q(uu50.i(uu50Var2, null, false, null, null, CommunityProfileContentItem.State.EMPTY, null, false, 2015));
                } else {
                    new dqu();
                    new j2r0();
                    List<GroupsGroupFullDto> k = groupsGetContentForTabsResponseDto.k();
                    if (k != null) {
                        List<GroupsGroupFullDto> list = k;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(dqu.a((GroupsGroupFullDto) it.next()));
                        }
                        int e = on00.e(c5g.u(arrayList, 10));
                        if (e < 16) {
                            e = 16;
                        }
                        linkedHashMap = new LinkedHashMap(e);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            linkedHashMap.put(((Group) next).c, next);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    List<UsersUserFullDto> u = groupsGetContentForTabsResponseDto.u();
                    if (u != null) {
                        List<UsersUserFullDto> list2 = u;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(j2r0.a((UsersUserFullDto) it3.next()));
                        }
                        int e2 = on00.e(c5g.u(arrayList2, 10));
                        if (e2 < 16) {
                            e2 = 16;
                        }
                        linkedHashMap2 = new LinkedHashMap(e2);
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            linkedHashMap2.put(((UserProfile) next2).c, next2);
                        }
                    } else {
                        linkedHashMap2 = null;
                    }
                    k2r0 k2r0Var = new k2r0();
                    List<GroupsGroupFullDto> k2 = groupsGetContentForTabsResponseDto.k();
                    if (k2 != null) {
                        List<GroupsGroupFullDto> list3 = k2;
                        ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                        Iterator<T> it5 = list3.iterator();
                        while (it5.hasNext()) {
                            arrayList3.add(equ.a((GroupsGroupFullDto) it5.next()));
                        }
                        int e3 = on00.e(c5g.u(arrayList3, 10));
                        if (e3 < 16) {
                            e3 = 16;
                        }
                        map = new LinkedHashMap(e3);
                        Iterator it6 = arrayList3.iterator();
                        while (it6.hasNext()) {
                            Object next3 = it6.next();
                            map.put(((Owner) next3).b, next3);
                        }
                    } else {
                        map = null;
                    }
                    Map map3 = jgp.b;
                    if (map == null) {
                        map = map3;
                    }
                    List<UsersUserFullDto> u2 = groupsGetContentForTabsResponseDto.u();
                    if (u2 != null) {
                        List<UsersUserFullDto> list4 = u2;
                        ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                        Iterator<T> it7 = list4.iterator();
                        while (it7.hasNext()) {
                            arrayList4.add(k2r0Var.a((UsersUserFullDto) it7.next()));
                        }
                        int e4 = on00.e(c5g.u(arrayList4, 10));
                        map2 = new LinkedHashMap(e4 >= 16 ? e4 : 16);
                        Iterator it8 = arrayList4.iterator();
                        while (it8.hasNext()) {
                            Object next4 = it8.next();
                            map2.put(((Owner) next4).b, next4);
                        }
                    } else {
                        map2 = null;
                    }
                    if (map2 != null) {
                        map3 = map2;
                    }
                    LinkedHashMap n2 = pn00.n(map, map3);
                    cvd0.b bVar = uu50Var2.j;
                    Collection collection = bVar != null ? bVar.a : null;
                    if (collection == null) {
                        collection = EmptyList.b;
                    }
                    Collection collection2 = collection;
                    List<NarrativesNarrativeDto> list5 = d;
                    ArrayList arrayList5 = new ArrayList(c5g.u(list5, 10));
                    Iterator<T> it9 = list5.iterator();
                    while (it9.hasNext()) {
                        arrayList5.add(f370.F((NarrativesNarrativeDto) it9.next(), n2, linkedHashMap2, linkedHashMap));
                    }
                    cvd0.b bVar2 = new cvd0.b(j5g.u0(arrayList5, collection2));
                    GroupsTabContentNarrativesDto n3 = groupsGetContentForTabsResponseDto.n();
                    boolean f = myc0.f(n3 != null ? n3.e() : null);
                    GroupsTabContentNarrativesDto n4 = groupsGetContentForTabsResponseDto.n();
                    tjhVar.q(uu50.i(uu50Var2, bVar2, f, n4 != null ? n4.e() : null, null, z2 ? CommunityProfileContentItem.State.LOADED : uu50Var2.o, z2 ? uu50Var2.q : CommunityProfileContentItem.State.LOADED, false, 1880));
                }
                return s3q0.a;
            }
        }, new vn(this, uu50Var, z, 1));
    }

    @Override // xsna.nfh, xsna.jxg
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void k(uu50 uu50Var, ExtendedCommunityProfile extendedCommunityProfile) {
        this.k = false;
        uu50 i = uu50.i(uu50Var, null, false, null, null, CommunityProfileContentItem.State.LOADING, null, false, 2015);
        q(i);
        super.k(uu50Var, extendedCommunityProfile);
        t(i, true);
    }
}
