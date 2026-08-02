package xsna;

import com.vk.api.generated.donut.dto.DonutGetLevelsResponseDto;
import com.vk.api.generated.donut.dto.DonutLevelDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsTabContentVideosDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbum;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import xsna.cvd0;
import xsna.deb;
import xsna.sst0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class beb implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ beb(Collection collection, boolean z, xgl0 xgl0Var) {
        this.d = collection;
        this.c = z;
        this.e = xgl0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        deb.a aVar;
        boolean z;
        int i;
        List<sst0.b> list;
        List<sst0.b> list2;
        Iterable iterable;
        switch (this.b) {
            case 0:
                Collection collection = (Collection) this.d;
                xgl0 xgl0Var = (xgl0) this.e;
                xgl0 xgl0Var2 = (xgl0) obj;
                boolean isEmpty = collection.isEmpty();
                boolean z2 = this.c;
                if (isEmpty) {
                    jgp jgpVar = jgp.b;
                    aVar = new deb.a(jgpVar, jgpVar, jgpVar);
                } else {
                    aVar = (deb.a) xgl0Var2.c(new ceb(collection, z2, 0));
                }
                ?? r4 = aVar.a;
                Map<Long, bdb> map = aVar.b;
                Map<Long, lj30> map2 = aVar.c;
                for (Map.Entry entry : r4.entrySet()) {
                    xgl0Var2.a().u(((Number) entry.getKey()).longValue(), (aeb) entry.getValue());
                }
                if (z2) {
                    xgl0Var.u(new t3b(xgl0Var, map, map2, 4));
                }
                return r4;
            default:
                qlh qlhVar = (qlh) this.d;
                sst0 sst0Var = (sst0) this.e;
                Triple triple = (Triple) obj;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) ((it80) triple.i()).a;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto2 = (GroupsGetContentForTabsResponseDto) ((it80) triple.j()).a;
                DonutGetLevelsResponseDto donutGetLevelsResponseDto = (DonutGetLevelsResponseDto) ((it80) triple.k()).a;
                GroupsTabContentVideosDto D = groupsGetContentForTabsResponseDto != null ? groupsGetContentForTabsResponseDto.D() : null;
                GroupsTabContentVideosDto D2 = groupsGetContentForTabsResponseDto2 != null ? groupsGetContentForTabsResponseDto2.D() : null;
                if (sst0Var.l.h()) {
                    List<VideoVideoAlbumFullDto> d = D2 != null ? D2.d() : null;
                    if (d == null || d.isEmpty()) {
                        cvd0.e eVar = sst0Var.k;
                        List<VideoAlbum> list3 = eVar != null ? eVar.a : null;
                        if (list3 == null || list3.isEmpty()) {
                            qlhVar.t(sst0.i(sst0Var, null, null, CommunityProfileContentItem.ContentType.ITEMS, null, false, false, null, null, null, 32763), true);
                            return s3q0.a;
                        }
                    }
                }
                boolean z3 = this.c;
                if (z3) {
                    List<VideoVideoFullDto> f = D != null ? D.f() : null;
                    if (f == null || f.isEmpty()) {
                        List<VideoVideoAlbumFullDto> d2 = D2 != null ? D2.d() : null;
                        if (d2 == null || d2.isEmpty()) {
                            qlhVar.w(sst0.i(sst0Var, null, null, null, null, false, false, null, CommunityProfileContentItem.State.EMPTY, null, 31743));
                            return s3q0.a;
                        }
                    }
                }
                if (D != null) {
                    List<UsersUserFullDto> u = groupsGetContentForTabsResponseDto != null ? groupsGetContentForTabsResponseDto.u() : null;
                    if (u == null) {
                        u = EmptyList.b;
                    }
                    List<UsersUserFullDto> list4 = u;
                    List<GroupsGroupFullDto> k = groupsGetContentForTabsResponseDto != null ? groupsGetContentForTabsResponseDto.k() : null;
                    if (k == null) {
                        k = EmptyList.b;
                    }
                    List<GroupsGroupFullDto> list5 = k;
                    List<DonutLevelDto> e = donutGetLevelsResponseDto != null ? donutGetLevelsResponseDto.e() : null;
                    if (e == null) {
                        e = EmptyList.b;
                    }
                    ArrayList arrayList = new ArrayList();
                    tuh tuhVar = new tuh(((DonutPriceComponent) qlhVar.j.Z0.getValue()).kf());
                    List<sst0.b> list6 = sst0Var.j;
                    if (list6 != null) {
                        arrayList.addAll(list6);
                    }
                    List<VideoVideoFullDto> f2 = D.f();
                    if (f2 == null) {
                        f2 = EmptyList.b;
                    }
                    List e2 = ums0.e(ums0.a, f2, list4, list5, false, 52);
                    ArrayList arrayList2 = new ArrayList(c5g.u(e2, 10));
                    Iterator it = e2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(tuhVar.a(e, (VideoFile) it.next()));
                    }
                    arrayList.addAll(arrayList2);
                    z = z3;
                    i = 10;
                    sst0Var = sst0.i(sst0Var, arrayList, null, null, null, myc0.f(D.g()) && !arrayList2.isEmpty(), false, D.g(), z3 ? CommunityProfileContentItem.State.LOADED : sst0Var.t, z3 ? sst0Var.v : CommunityProfileContentItem.State.LOADED, 27502);
                } else {
                    z = z3;
                    i = 10;
                }
                if (D2 != null) {
                    List<VideoVideoAlbumFullDto> d3 = D2.d();
                    if (d3 != null) {
                        List<VideoVideoAlbumFullDto> list7 = d3;
                        iterable = new ArrayList(c5g.u(list7, i));
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            iterable.add(b1s0.a((VideoVideoAlbumFullDto) it2.next()));
                        }
                    } else {
                        iterable = 0;
                    }
                    if (iterable == 0) {
                        iterable = EmptyList.b;
                    }
                    cvd0.e eVar2 = sst0Var.k;
                    List<VideoAlbum> list8 = eVar2 != null ? eVar2.a : null;
                    if (list8 == null) {
                        list8 = EmptyList.b;
                    }
                    sst0 i2 = sst0.i(sst0Var, null, new cvd0.e(j5g.u0(iterable, list8)), null, null, false, false, null, null, null, 32765);
                    boolean z4 = myc0.f(D2.e()) && !((Collection) iterable).isEmpty();
                    sst0Var = i2.l.h() ? sst0.i(i2, null, null, null, D2.e(), z4, false, null, z ? CommunityProfileContentItem.State.LOADED : i2.t, z ? i2.v : CommunityProfileContentItem.State.LOADED, 27623) : sst0.i(i2, null, null, null, null, false, z4, null, null, null, 32735);
                }
                if (z) {
                    CommunityProfileContentItem.ContentType contentType = sst0Var.l;
                    cvd0.e eVar3 = sst0Var.k;
                    List<sst0.b> list9 = sst0Var.j;
                    if (contentType.l() && ((list2 = list9) == null || list2.isEmpty())) {
                        sst0Var = sst0.i(sst0Var, null, null, CommunityProfileContentItem.ContentType.ALBUMS, null, false, false, null, null, null, 32763);
                    } else {
                        if (contentType.l()) {
                            List<VideoAlbum> list10 = eVar3 != null ? eVar3.a : null;
                            if (list10 == null || list10.isEmpty()) {
                                sst0Var = sst0.i(sst0Var, null, null, CommunityProfileContentItem.ContentType.ITEMS, null, false, false, null, null, null, 32763);
                            }
                        }
                        if (contentType.h() && (list = list9) != null && !list.isEmpty()) {
                            sst0Var = sst0.i(sst0Var, null, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, null, null, null, 32763);
                        } else if (contentType.j()) {
                            List<VideoAlbum> list11 = eVar3 != null ? eVar3.a : null;
                            if (list11 != null && !list11.isEmpty()) {
                                sst0Var = sst0.i(sst0Var, null, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, null, null, null, 32763);
                            }
                        }
                    }
                }
                qlhVar.w(sst0Var);
                return s3q0.a;
        }
    }

    public /* synthetic */ beb(qlh qlhVar, sst0 sst0Var, boolean z) {
        this.d = qlhVar;
        this.e = sst0Var;
        this.c = z;
    }
}
