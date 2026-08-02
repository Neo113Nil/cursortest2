package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsTabContentShortVideosDto;
import com.vk.api.generated.owners.dto.OwnersGetContentTabsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.user.UserProfile;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.toggle.b;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cvd0;
import xsna.ggh;
import xsna.it80;
import xsna.xqu;

/* compiled from: CommunityProfileContentClipsFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class dgh extends ggh {
    public static final /* synthetic */ int x = 0;
    public final ynh t;
    public final wi50 u;
    public final nm8 v;
    public yok0 w;

    /* compiled from: CommunityProfileContentClipsFeatureDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<GroupsGetContentForTabsResponseDto, it80<GroupsGetContentForTabsResponseDto>> {
        @Override // xsna.izs
        public final it80<GroupsGetContentForTabsResponseDto> invoke(GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(groupsGetContentForTabsResponseDto);
        }
    }

    /* compiled from: CommunityProfileContentClipsFeatureDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<gud, it80<gud>> {
        @Override // xsna.izs
        public final it80<gud> invoke(gud gudVar) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(gudVar);
        }
    }

    /* compiled from: CommunityProfileContentClipsFeatureDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<GroupsGetByIdObjectResponseDto, it80<GroupsGetByIdObjectResponseDto>> {
        @Override // xsna.izs
        public final it80<GroupsGetByIdObjectResponseDto> invoke(GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(groupsGetByIdObjectResponseDto);
        }
    }

    /* compiled from: CommunityProfileContentClipsFeatureDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<GroupsGetContentForTabsResponseDto, it80<GroupsGetContentForTabsResponseDto>> {
        @Override // xsna.izs
        public final it80<GroupsGetContentForTabsResponseDto> invoke(GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(groupsGetContentForTabsResponseDto);
        }
    }

    /* compiled from: CommunityProfileContentClipsFeatureDelegate.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<OwnersGetContentTabsResponseDto, it80<OwnersGetContentTabsResponseDto>> {
        @Override // xsna.izs
        public final it80<OwnersGetContentTabsResponseDto> invoke(OwnersGetContentTabsResponseDto ownersGetContentTabsResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(ownersGetContentTabsResponseDto);
        }
    }

    public dgh(UserId userId, io.reactivex.rxjava3.disposables.b bVar, po5 po5Var, bw6 bw6Var, p99 p99Var, ynh ynhVar, boolean z) {
        super(userId, bVar, po5Var, bw6Var, p99Var, ynhVar, z);
        this.t = ynhVar;
        this.u = bay.a();
        this.v = w0b.a(-2, null, null, 6);
    }

    public static final io.reactivex.rxjava3.internal.operators.single.d0 B(dgh dghVar, Clips clips) {
        Clips clips2 = dghVar.m;
        if (clips2 == null) {
            io.reactivex.rxjava3.core.x.k(null);
            throw null;
        }
        ExtendedCommunityProfile extendedCommunityProfile = dghVar.k;
        if (extendedCommunityProfile == null) {
            io.reactivex.rxjava3.core.x.k(null);
            throw null;
        }
        return new io.reactivex.rxjava3.internal.operators.single.d0(rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(dghVar.a), Collections.singletonList(GroupsContentTabsDto.SHORT_VIDEOS), j5g.u0(ggh.s, ggh.r), clips2.p, GroupsGetContentForTabsContentDto.SHORT_VIDEOS, 45, 52)), 7).l(new rt0(new t3b(clips, dghVar, extendedCommunityProfile, 1), 9)), new eq(6), null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final io.reactivex.rxjava3.internal.operators.single.d0 C(dgh dghVar, Clips clips) {
        ExtendedCommunityProfile extendedCommunityProfile = dghVar.k;
        if (extendedCommunityProfile != null) {
            return new io.reactivex.rxjava3.internal.operators.single.d0(((nud) dghVar.t.E.getValue()).a().l(new j7(new com.vk.movika.sdk.base.logic.processor.d(dghVar, extendedCommunityProfile, clips, 5), 16)), new eq(6), null);
        }
        io.reactivex.rxjava3.core.x.k(null);
        throw null;
    }

    public static final io.reactivex.rxjava3.internal.operators.single.d0 D(dgh dghVar, Clips clips) {
        Clips clips2 = dghVar.m;
        if (clips2 == null) {
            io.reactivex.rxjava3.core.x.k(null);
            throw null;
        }
        return new io.reactivex.rxjava3.internal.operators.single.d0(rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(dghVar.a), Collections.singletonList(GroupsContentTabsDto.SHORT_VIDEOS), j5g.u0(ggh.s, ggh.r), clips2.m, GroupsGetContentForTabsContentDto.SHORT_VIDEOS_PLAYLISTS, 15, 52)), 7).l(new pa(new g84(7, clips, dghVar), 13)), new eq(6), null);
    }

    public static final void E(dgh dghVar, Clips clips) {
        cvd0.f fVar;
        Clips i;
        if (clips == null) {
            Clips clips2 = dghVar.l;
            if (clips2 != null) {
                dghVar.z(clips2);
                return;
            }
            return;
        }
        cvd0.f fVar2 = clips.j;
        if (fVar2 == null || !fVar2.a.isEmpty()) {
            fVar = fVar2;
            i = Clips.i(clips, null, null, null, null, false, false, null, null, CommunityProfileContentItem.State.LOADED, null, null, null, true, 261631);
        } else {
            fVar = fVar2;
            i = Clips.i(clips, null, null, null, null, false, false, null, null, CommunityProfileContentItem.State.LOADED, null, null, null, true, 261589);
        }
        dghVar.q(i);
        ggh.s(i);
        cvd0.f fVar3 = fVar;
        if (fVar3 != null && fVar3.a.isEmpty()) {
            ggh.A(dghVar, i, CommunityProfileContentItem.State.EMPTY, null, null, 12);
        }
        dghVar.l = i;
    }

    public static final io.reactivex.rxjava3.internal.operators.single.y F(dgh dghVar, Clips clips) {
        UserId userId = dghVar.a;
        Clips clips2 = dghVar.m;
        if (clips2 == null) {
            io.reactivex.rxjava3.core.x.k(null);
            throw null;
        }
        dz2 x2 = yfb.x(xqu.i(new zqu(), fkq0.e(userId), Collections.singletonList(GroupsContentTabsDto.SHORT_VIDEOS), j5g.u0(ggh.s, ggh.r), clips2.p, GroupsGetContentForTabsContentDto.SHORT_VIDEOS, 45, 52));
        List singletonList = Collections.singletonList(fkq0.e(userId));
        List singletonList2 = Collections.singletonList(GroupsFieldsDto.TABS);
        if ((4 & 2) != 0) {
            singletonList2 = null;
        }
        dz2 x3 = yfb.x(xqu.a.a(null, singletonList, singletonList2));
        tfx tfxVar = new tfx("owners.getContentTabs", new dt(22), new et(26));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        return G() ? rsg0.W(new com.vk.api.request.rx.batch.e(x2, yfb.x(tfxVar), new com.vk.movika.tools.controls.seekbar.o(4)), 7).l(new e8(new ml1(7, dghVar, clips), 15)) : rsg0.W(new com.vk.api.request.rx.batch.e(x2, x3, new jue(1)), 7).l(new h8(new com.vk.libvideo.design.view.video.a(10, dghVar, clips), 11));
    }

    public static boolean G() {
        b.d i = com.vk.toggle.b.A.i(ComFeatures.COM_SECTIONS_REDESIGN);
        String d2 = i != null ? i.d() : null;
        return epx.f(d2, "B") || epx.f(d2, "C");
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void H(Clips clips, ExtendedCommunityProfile extendedCommunityProfile, boolean z, boolean z2) {
        io.reactivex.rxjava3.core.x b2;
        List<BaseUserGroupFieldsDto> list = ggh.s;
        List<BaseUserGroupFieldsDto> list2 = ggh.r;
        UserId userId = this.a;
        io.reactivex.rxjava3.core.x l = (z || !z2) ? rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(userId), Collections.singletonList(GroupsContentTabsDto.SHORT_VIDEOS), j5g.u0(list, list2), clips.p, GroupsGetContentForTabsContentDto.SHORT_VIDEOS, 45, 52)), 7).l(new lh3(new a(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 8)) : tr.b(it80.b);
        io.reactivex.rxjava3.core.x l2 = z2 ? rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(userId), Collections.singletonList(GroupsContentTabsDto.SHORT_VIDEOS), j5g.u0(list, list2), clips.m, GroupsGetContentForTabsContentDto.SHORT_VIDEOS_PLAYLISTS, 15, 52)), 7).l(new tp1(new d(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 7)) : tr.b(it80.b);
        boolean z3 = false;
        if (extendedCommunityProfile != null && w2h.b(extendedCommunityProfile)) {
            z3 = true;
        }
        if (z3) {
            List singletonList = Collections.singletonList(fkq0.e(userId));
            List singletonList2 = Collections.singletonList(GroupsFieldsDto.TABS);
            if ((4 & 2) != 0) {
                singletonList2 = null;
            }
            b2 = rsg0.W(yfb.x(xqu.a.a(null, singletonList, singletonList2)), 7).l(new e7(new c(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 16));
        } else {
            b2 = tr.b(it80.b);
        }
        io.reactivex.rxjava3.core.x xVar = b2;
        tfx tfxVar = new tfx("owners.getContentTabs", new dt(22), new et(26));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        io.reactivex.rxjava3.internal.operators.observable.f0 W = rsg0.W(yfb.x(tfxVar), 7);
        it80.a aVar = it80.b;
        io.reactivex.rxjava3.internal.operators.single.y l3 = W.l(new bk1(new e(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 9));
        io.reactivex.rxjava3.core.x l4 = z3 ? ((nud) this.t.E.getValue()).a().l(new g7(new b(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 14)) : tr.b(aVar);
        if (G()) {
            l(io.reactivex.rxjava3.core.x.z(l, l2, l3, l4, new t7(new zfh(0), 10)), new agh(0, this, clips, extendedCommunityProfile, z), new uf1(17, this, clips));
        } else {
            l(io.reactivex.rxjava3.core.x.z(l, l2, xVar, l4, new y7(new bgh(), 10)), new cgh(this, clips, extendedCommunityProfile, z), new qb6(8, this, clips));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public final Clips I(Clips clips, ggh.a aVar) {
        ?? r5;
        cvd0.f fVar;
        ExtendedCommunityProfile extendedCommunityProfile = this.k;
        String str = null;
        if (extendedCommunityProfile == null) {
            return null;
        }
        Clips clips2 = this.l;
        if (clips2 == null || (fVar = clips2.j) == null) {
            r5 = EmptyList.b;
        } else {
            ArrayList arrayList = fVar.a;
            r5 = new ArrayList();
            for (Object obj : arrayList) {
                if (epx.f(((VideoFile) obj).getType(), "tab_collection_draft_dummy")) {
                    r5.add(obj);
                }
            }
        }
        Clips.ContentTabCollection contentTabCollection = aVar.d;
        GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = aVar.a;
        VideoFileOld v = ggh.v(contentTabCollection, extendedCommunityProfile);
        Iterable singletonList = v != null ? Collections.singletonList(v) : EmptyList.b;
        ArrayList arrayList2 = new ArrayList();
        new dqu();
        new j2r0();
        List<GroupsGroupFullDto> k = groupsGetContentForTabsResponseDto != null ? groupsGetContentForTabsResponseDto.k() : null;
        if (k == null) {
            k = EmptyList.b;
        }
        List<GroupsGroupFullDto> list = k;
        ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(dqu.a((GroupsGroupFullDto) it.next()));
        }
        int e2 = on00.e(c5g.u(arrayList3, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((Group) next).c, next);
        }
        List<UsersUserFullDto> u = groupsGetContentForTabsResponseDto != null ? groupsGetContentForTabsResponseDto.u() : null;
        if (u == null) {
            u = EmptyList.b;
        }
        List<UsersUserFullDto> list2 = u;
        ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(j2r0.a((UsersUserFullDto) it3.next()));
        }
        int e3 = on00.e(c5g.u(arrayList4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e3 >= 16 ? e3 : 16);
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            linkedHashMap2.put(((UserProfile) next2).c, next2);
        }
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(this.a, extendedCommunityProfile.a.l0());
        pn00.q(mapBuilder, new ulp0(rn00.w(linkedHashMap), new ol(13)));
        pn00.q(mapBuilder, new ulp0(rn00.w(linkedHashMap2), new yy(16)));
        MapBuilder h = mapBuilder.h();
        GroupsTabContentShortVideosDto C = groupsGetContentForTabsResponseDto != null ? groupsGetContentForTabsResponseDto.C() : null;
        List<VideoVideoFullDto> d2 = C != null ? C.d() : null;
        if (d2 == null) {
            d2 = EmptyList.b;
        }
        List<VideoVideoFullDto> list3 = d2;
        ArrayList arrayList5 = new ArrayList(c5g.u(list3, 10));
        Iterator it5 = list3.iterator();
        while (it5.hasNext()) {
            arrayList5.add(ums0.d(ums0.a, (VideoVideoFullDto) it5.next(), h, null, null, 28));
        }
        arrayList2.addAll(arrayList5);
        Integer num = aVar.e;
        cvd0.f fVar2 = new cvd0.f(j5g.u0(arrayList2, j5g.u0(singletonList, (Collection) r5)));
        boolean z = myc0.f(C != null ? C.e() : null) && !arrayList5.isEmpty();
        String e4 = C != null ? C.e() : null;
        CommunityProfileContentItem.State state = CommunityProfileContentItem.State.LOADED;
        CommunityProfileContentItem.b bVar = clips.q;
        if (num != null) {
            Context context = e43.a;
            str = (context != null ? context : null).getResources().getQuantityString(R.plurals.community_profile_coauthors_invitations, num.intValue(), num);
        }
        return Clips.i(clips, fVar2, null, null, null, z, false, e4, CommunityProfileContentItem.b.a(bVar, str), state, null, null, num, false, 458030);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(ggh.b bVar, ggh.a aVar) {
        GroupsTabContentShortVideosDto C;
        GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = aVar.a;
        gud gudVar = aVar.c;
        GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto2 = aVar.b;
        GroupsTabContentShortVideosDto C2 = groupsGetContentForTabsResponseDto2 != null ? groupsGetContentForTabsResponseDto2.C() : null;
        ExtendedCommunityProfile extendedCommunityProfile = bVar.b;
        boolean z = bVar.c;
        VideoFileOld u = ggh.u(gudVar, extendedCommunityProfile != null ? bwd0.i(extendedCommunityProfile) : null);
        VideoFileOld v = ggh.v(aVar.d, extendedCommunityProfile);
        GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto3 = aVar.a;
        VideoFileOld u2 = ggh.u(gudVar, extendedCommunityProfile != null ? bwd0.i(extendedCommunityProfile) : null);
        if (z) {
            List<VideoVideoFullDto> d2 = (groupsGetContentForTabsResponseDto3 == null || (C = groupsGetContentForTabsResponseDto3.C()) == null) ? null : C.d();
            if ((d2 == null || d2.isEmpty()) && v == null && u2 == null) {
                ggh.A(this, bVar.a, CommunityProfileContentItem.State.EMPTY, null, null, 12);
                this.l = bVar.a;
                return;
            }
        }
        Integer num = aVar.e;
        Clips i = Clips.i(bVar.a, null, null, null, null, false, false, null, null, null, null, null, null, false, 524287);
        if (groupsGetContentForTabsResponseDto != null) {
            ArrayList arrayList = new ArrayList();
            cvd0.f fVar = i.j;
            if (fVar != null) {
                arrayList.addAll(fVar.a);
            }
            new dqu();
            new j2r0();
            List<GroupsGroupFullDto> k = groupsGetContentForTabsResponseDto.k();
            if (k == null) {
                k = EmptyList.b;
            }
            List<GroupsGroupFullDto> list = k;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(dqu.a((GroupsGroupFullDto) it.next()));
            }
            int e2 = on00.e(c5g.u(arrayList2, 10));
            if (e2 < 16) {
                e2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                linkedHashMap.put(((Group) next).c, next);
            }
            List<UsersUserFullDto> u3 = groupsGetContentForTabsResponseDto.u();
            if (u3 == null) {
                u3 = EmptyList.b;
            }
            List<UsersUserFullDto> list2 = u3;
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(j2r0.a((UsersUserFullDto) it3.next()));
            }
            int e3 = on00.e(c5g.u(arrayList3, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e3 >= 16 ? e3 : 16);
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                linkedHashMap2.put(((UserProfile) next2).c, next2);
            }
            MapBuilder mapBuilder = new MapBuilder();
            pn00.q(mapBuilder, new ulp0(rn00.w(linkedHashMap), new ob(15)));
            pn00.q(mapBuilder, new ulp0(rn00.w(linkedHashMap2), new mo1(20)));
            if (extendedCommunityProfile != null) {
                mapBuilder.put(this.a, extendedCommunityProfile.a.l0());
            }
            MapBuilder h = mapBuilder.h();
            GroupsTabContentShortVideosDto C3 = groupsGetContentForTabsResponseDto.C();
            List<VideoVideoFullDto> d3 = C3 != null ? C3.d() : null;
            if (d3 == null) {
                d3 = EmptyList.b;
            }
            List<VideoVideoFullDto> list3 = d3;
            ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList4.add(ums0.d(ums0.a, (VideoVideoFullDto) it5.next(), h, null, null, 28));
            }
            arrayList.addAll(arrayList4);
            i = Clips.i(i, new cvd0.f(arrayList), null, null, null, myc0.f(C3 != null ? C3.e() : null) && !arrayList4.isEmpty(), false, C3 != null ? C3.e() : null, null, z ? CommunityProfileContentItem.State.LOADED : i.s, z ? i.u : CommunityProfileContentItem.State.LOADED, null, null, false, 259502);
        }
        if (C2 != null) {
            ArrayList arrayList5 = new ArrayList();
            List<ClipsPlaylist> list4 = i.k;
            if (list4 != null) {
                arrayList5.addAll(list4);
            }
            List<ShortVideoPlaylistFullDto> d0 = C2.d0();
            if (d0 != null) {
                List<ShortVideoPlaylistFullDto> list5 = d0;
                ArrayList arrayList6 = new ArrayList(c5g.u(list5, 10));
                Iterator<T> it6 = list5.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(x((ShortVideoPlaylistFullDto) it6.next()));
                }
                arrayList5.addAll(arrayList6);
                i = Clips.i(i, null, arrayList5, null, C2.f(), false, myc0.f(C2.f()) && !arrayList6.isEmpty(), null, null, null, null, CommunityProfileContentItem.State.LOADED, null, false, 258005);
                if (z) {
                    i = ggh.s(i);
                }
                if (v != null) {
                    i = ggh.r(i, v);
                }
                if (u != null) {
                    i = ggh.r(i, u);
                }
                Clips clips = i;
                this.c.invoke(new d.f(Clips.i(clips, null, null, null, null, false, false, null, null, null, null, null, num, false, 458751)));
                this.l = clips;
            }
        }
        if (z) {
        }
        if (v != null) {
        }
        if (u != null) {
        }
        Clips clips2 = i;
        this.c.invoke(new d.f(Clips.i(clips2, null, null, null, null, false, false, null, null, null, null, null, num, false, 458751)));
        this.l = clips2;
    }

    public final void K(xaf xafVar) {
        this.v.f(xafVar);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void j(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        Clips clips = (Clips) communityProfileContentItem;
        if (clips.o) {
            ggh.A(this, clips, null, null, CommunityProfileContentItem.State.LOADING, 6);
            H(clips, extendedCommunityProfile, false, true);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void k(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        Clips clips = (Clips) communityProfileContentItem;
        yok0 yok0Var = this.w;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.w = myc0.h(zvj.a(hqu0.b()), null, null, new egh(this, null), 3);
        this.n = false;
        ggh.A(this, clips, CommunityProfileContentItem.State.LOADING, null, null, 12);
        super.k(clips, extendedCommunityProfile);
        GroupContentTabSetting w = w(extendedCommunityProfile);
        if (w == null || !w.i) {
            H(clips, extendedCommunityProfile, true, true);
        } else {
            ggh.A(this, clips, CommunityProfileContentItem.State.EMPTY, null, null, 12);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nfh
    public final void o(Clips clips) {
        Clips clips2 = clips;
        ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_NEW_UPLOADER;
        clipsFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(clipsFeatures);
        ynh ynhVar = this.t;
        io.reactivex.rxjava3.disposables.b bVar = this.b;
        if (a2) {
            bVar.b(((eef) ynhVar.H.getValue()).b().r0(asu0.a.c()).subscribe(new np3(new n6f(4, this, clips2), 12)));
        } else {
            bVar.b(((ylf) ynhVar.G.getValue()).b().r0(asu0.a.c()).subscribe(new st0(new i4h(this, clips2), 9)));
        }
        io.reactivex.rxjava3.disposables.c subscribe = m().r0(asu0.a.c()).subscribe(new m20(new com.vk.im.engine.internal.api_commands.messages.a(26, this, clips2), 16));
        if (subscribe != null) {
            bVar.b(subscribe);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void onDestroy() {
        this.v.B(null);
        yok0 yok0Var = this.w;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
    }

    @Override // xsna.ggh
    public final GroupContentTabSetting w(ExtendedCommunityProfile extendedCommunityProfile) {
        List<GroupContentTabSetting> list;
        Object obj = null;
        if (extendedCommunityProfile == null || (list = extendedCommunityProfile.U2) == null) {
            return null;
        }
        for (Object obj2 : list) {
            GroupContentTabType groupContentTabType = ((GroupContentTabSetting) obj2).b;
            if (groupContentTabType == GroupContentTabType.SHORT_VIDEOS || groupContentTabType == GroupContentTabType.SHORT_VIDEOS_PLAYLISTS) {
                obj = obj2;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    @Override // xsna.ggh
    /* renamed from: y */
    public final void f(Clips clips, ExtendedCommunityProfile extendedCommunityProfile) {
        if (clips.n) {
            ggh.A(this, clips, null, CommunityProfileContentItem.State.LOADING, null, 10);
            H(clips, extendedCommunityProfile, false, false);
        }
    }
}
