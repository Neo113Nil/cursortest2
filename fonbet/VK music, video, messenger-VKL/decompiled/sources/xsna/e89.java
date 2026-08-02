package xsna;

import com.android.billingclient.api.BillingClient;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.groups.dto.GroupsCountersGroupDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.api.generated.identity.dto.IdentityLabelDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemVideoVideoDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.api.generated.users.dto.UsersUserCountersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.dto.user.deactivation.Deactivation;
import com.vk.dto.user.deactivation.DeactivationWithMessage;
import com.vk.log.L;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.EcosystemProfileView;
import com.vk.webapp.fragments.CommunityManageFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.b26;
import xsna.coe;
import xsna.h3k;
import xsna.xn50;

/* compiled from: CallParticipantsAdapterDiffer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class e89 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e89(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0483  */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ?? r14;
        ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto;
        Collection collection;
        ArrayList arrayList;
        List<NewsfeedNewsfeedItemDto> f;
        Iterable iterable;
        NewsfeedItemVideoVideoDto C;
        List<GroupsGroupFullDto> e;
        Iterator it;
        b590 b590Var;
        ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto2;
        long longValue;
        long j;
        long longValue2;
        String str;
        String str2;
        long longValue3;
        GroupsGroupFullDto groupsGroupFullDto;
        long longValue4;
        int i;
        DeactivationWithMessage deactivationWithMessage;
        Integer k;
        Integer f2;
        Iterator it2;
        ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto3;
        long longValue5;
        long j2;
        long longValue6;
        long j3;
        long j4;
        Pair pair;
        long j5;
        Long e2;
        Long d;
        Integer n;
        Integer o;
        Integer k2;
        Integer f3;
        b26.f fVar;
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                boe boeVar = (boe) obj;
                coe coeVar = (coe) this.receiver;
                coeVar.getClass();
                b590 b590Var2 = coeVar.a;
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto4 = boeVar.e;
                NewsfeedGenericResponseDto newsfeedGenericResponseDto = boeVar.f;
                UsersUserFullDto usersUserFullDto = boeVar.c;
                UserId userId = boeVar.a;
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto5 = boeVar.b;
                String str3 = "clips_views";
                String str4 = "clips_likes";
                if (usersUserFullDto != null) {
                    Collection values = b590.a(b590Var2, null, Collections.singletonList(usersUserFullDto), null, 11).values();
                    r14 = new ArrayList(c5g.u(values, 10));
                    Iterator it3 = values.iterator();
                    while (it3.hasNext()) {
                        Owner owner = (Owner) it3.next();
                        ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto6 = epx.f(usersUserFullDto.s1(), userId) ? shortVideoGetOwnerVideosResponseDto5 : null;
                        if (shortVideoGetOwnerVideosResponseDto6 == null || (f3 = shortVideoGetOwnerVideosResponseDto6.f()) == null) {
                            it2 = it3;
                            shortVideoGetOwnerVideosResponseDto3 = shortVideoGetOwnerVideosResponseDto6;
                            UsersUserCountersDto R = usersUserFullDto.R();
                            Long f4 = R != null ? R.f() : null;
                            longValue5 = f4 != null ? f4.longValue() : 0L;
                        } else {
                            int intValue = f3.intValue();
                            it2 = it3;
                            shortVideoGetOwnerVideosResponseDto3 = shortVideoGetOwnerVideosResponseDto6;
                            longValue5 = intValue;
                        }
                        if (shortVideoGetOwnerVideosResponseDto3 == null || (k2 = shortVideoGetOwnerVideosResponseDto3.k()) == null) {
                            j2 = longValue5;
                            UsersUserCountersDto R2 = usersUserFullDto.R();
                            Long g = R2 != null ? R2.g() : null;
                            longValue6 = g != null ? g.longValue() : 0L;
                        } else {
                            j2 = longValue5;
                            longValue6 = k2.intValue();
                        }
                        UsersUserCountersDto R3 = usersUserFullDto.R();
                        if (R3 == null || (o = R3.o()) == null) {
                            j3 = longValue6;
                            j4 = 0;
                        } else {
                            j3 = longValue6;
                            j4 = o.intValue();
                        }
                        Pair pair2 = new Pair(BillingClient.FeatureType.SUBSCRIPTIONS, Long.valueOf(j4));
                        UsersUserCountersDto R4 = usersUserFullDto.R();
                        if (R4 == null || (n = R4.n()) == null) {
                            pair = pair2;
                            j5 = 0;
                        } else {
                            pair = pair2;
                            j5 = n.intValue();
                        }
                        Pair pair3 = new Pair("pages", Long.valueOf(j5));
                        Pair pair4 = new Pair("clips_likes", Long.valueOf(j2));
                        Pair pair5 = new Pair("clips_views", Long.valueOf(j3));
                        UsersUserCountersDto R5 = usersUserFullDto.R();
                        Pair pair6 = new Pair("clips", Long.valueOf((R5 == null || (d = R5.d()) == null) ? 0L : d.longValue()));
                        UsersUserCountersDto R6 = usersUserFullDto.R();
                        LinkedHashMap m = pn00.m(pair, pair3, pair4, pair5, pair6, new Pair("clips_followers", Long.valueOf((R6 == null || (e2 = R6.e()) == null) ? 0L : e2.longValue())));
                        boolean i2 = owner.i(16);
                        String J2 = usersUserFullDto.J2();
                        FriendsFriendStatusStatusDto V0 = usersUserFullDto.V0();
                        r14.add(new ClipsAuthor(owner, m, i2 ? 1 : 0, J2, V0 != null ? V0.i() : 0, -1, 0, usersUserFullDto.d(), null, 256, null));
                        it3 = it2;
                    }
                } else {
                    r14 = EmptyList.b;
                }
                GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = boeVar.d;
                if (groupsGetObjectExtendedResponseDto == null || (e = groupsGetObjectExtendedResponseDto.e()) == null) {
                    shortVideoGetOwnerVideosResponseDto = shortVideoGetOwnerVideosResponseDto4;
                    collection = EmptyList.b;
                } else {
                    collection = new ArrayList();
                    Iterator it4 = e.iterator();
                    while (it4.hasNext()) {
                        GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) it4.next();
                        Collection values2 = b590.a(b590Var2, null, null, Collections.singletonList(groupsGroupFullDto2), 7).values();
                        Iterator it5 = it4;
                        ArrayList arrayList2 = new ArrayList(c5g.u(values2, 10));
                        Iterator it6 = values2.iterator();
                        while (it6.hasNext()) {
                            Owner owner2 = (Owner) it6.next();
                            ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto7 = epx.f(groupsGroupFullDto2.P0(), userId) ? shortVideoGetOwnerVideosResponseDto5 : null;
                            if (shortVideoGetOwnerVideosResponseDto7 == null || (f2 = shortVideoGetOwnerVideosResponseDto7.f()) == null) {
                                it = it6;
                                b590Var = b590Var2;
                                shortVideoGetOwnerVideosResponseDto2 = shortVideoGetOwnerVideosResponseDto4;
                                GroupsCountersGroupDto M = groupsGroupFullDto2.M();
                                Long f5 = M != null ? M.f() : null;
                                longValue = f5 != null ? f5.longValue() : 0L;
                            } else {
                                it = it6;
                                b590Var = b590Var2;
                                shortVideoGetOwnerVideosResponseDto2 = shortVideoGetOwnerVideosResponseDto4;
                                longValue = f2.intValue();
                            }
                            if (shortVideoGetOwnerVideosResponseDto7 == null || (k = shortVideoGetOwnerVideosResponseDto7.k()) == null) {
                                j = longValue;
                                GroupsCountersGroupDto M2 = groupsGroupFullDto2.M();
                                Long g2 = M2 != null ? M2.g() : null;
                                longValue2 = g2 != null ? g2.longValue() : 0L;
                            } else {
                                j = longValue;
                                longValue2 = k.intValue();
                            }
                            Pair pair7 = new Pair(str4, Long.valueOf(j));
                            Pair pair8 = new Pair(str3, Long.valueOf(longValue2));
                            Integer G = groupsGroupFullDto2.G();
                            if (G != null) {
                                str = str3;
                                str2 = str4;
                                longValue3 = G.intValue();
                            } else {
                                str = str3;
                                str2 = str4;
                                GroupsCountersGroupDto M3 = groupsGroupFullDto2.M();
                                Long d2 = M3 != null ? M3.d() : null;
                                longValue3 = d2 != null ? d2.longValue() : 0L;
                            }
                            Pair pair9 = new Pair("clips", Long.valueOf(longValue3));
                            Integer o1 = groupsGroupFullDto2.o1();
                            if (o1 != null) {
                                groupsGroupFullDto = groupsGroupFullDto2;
                                longValue4 = o1.intValue();
                            } else {
                                groupsGroupFullDto = groupsGroupFullDto2;
                                GroupsCountersGroupDto M4 = groupsGroupFullDto.M();
                                Long e3 = M4 != null ? M4.e() : null;
                                longValue4 = e3 != null ? e3.longValue() : 0L;
                            }
                            LinkedHashMap m2 = pn00.m(pair7, pair8, pair9, new Pair("clips_followers", Long.valueOf(longValue4)));
                            boolean i3 = owner2.i(16);
                            String l2 = groupsGroupFullDto.l2();
                            GroupsGroupFullMemberStatusDto n1 = groupsGroupFullDto.n1();
                            int i4 = n1 != null ? n1.i() : 0;
                            GroupsGroupTypeDto L2 = groupsGroupFullDto.L2();
                            int i5 = L2 == null ? -1 : coe.a.$EnumSwitchMapping$0[L2.ordinal()];
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    i = 1;
                                } else if (i5 == 3) {
                                    i = 2;
                                }
                                GroupsGroupAdminLevelDto f6 = groupsGroupFullDto.f();
                                int i6 = f6 == null ? f6.i() : 0;
                                String description = groupsGroupFullDto.getDescription();
                                if (groupsGroupFullDto.W() == null) {
                                    DeactivationWithMessage.a aVar = new DeactivationWithMessage.a();
                                    String W = groupsGroupFullDto.W();
                                    if (W == null) {
                                        W = "";
                                    }
                                    aVar.b(W);
                                    String Z = groupsGroupFullDto.Z();
                                    aVar.b = (Z == null && (Z = groupsGroupFullDto.getDescription()) == null) ? "" : Z;
                                    GroupsGroupFullDto.DeactivatedTypeDto a0 = groupsGroupFullDto.a0();
                                    String i7 = a0 != null ? a0.i() : null;
                                    Deactivation.Type.Companion.getClass();
                                    aVar.e = epx.f(i7, "geo_blocked") ? Deactivation.Type.GEO_BLOCKED : epx.f(i7, "banned") ? Deactivation.Type.BANNED : null;
                                    deactivationWithMessage = aVar.a();
                                } else {
                                    deactivationWithMessage = null;
                                }
                                arrayList2.add(new ClipsAuthor(owner2, m2, i3 ? 1 : 0, l2, i4, i, i6, description, deactivationWithMessage));
                                str3 = str;
                                it6 = it;
                                b590Var2 = b590Var;
                                shortVideoGetOwnerVideosResponseDto4 = shortVideoGetOwnerVideosResponseDto2;
                                str4 = str2;
                                groupsGroupFullDto2 = groupsGroupFullDto;
                            }
                            i = 0;
                            GroupsGroupAdminLevelDto f62 = groupsGroupFullDto.f();
                            if (f62 == null) {
                            }
                            String description2 = groupsGroupFullDto.getDescription();
                            if (groupsGroupFullDto.W() == null) {
                            }
                            arrayList2.add(new ClipsAuthor(owner2, m2, i3 ? 1 : 0, l2, i4, i, i6, description2, deactivationWithMessage));
                            str3 = str;
                            it6 = it;
                            b590Var2 = b590Var;
                            shortVideoGetOwnerVideosResponseDto4 = shortVideoGetOwnerVideosResponseDto2;
                            str4 = str2;
                            groupsGroupFullDto2 = groupsGroupFullDto;
                        }
                        g5g.y(arrayList2, collection);
                        str3 = str3;
                        it4 = it5;
                        shortVideoGetOwnerVideosResponseDto4 = shortVideoGetOwnerVideosResponseDto4;
                    }
                    shortVideoGetOwnerVideosResponseDto = shortVideoGetOwnerVideosResponseDto4;
                }
                ArrayList u0 = j5g.u0((Iterable) r14, collection);
                ArrayList arrayList3 = new ArrayList(c5g.u(u0, 10));
                Iterator it7 = u0.iterator();
                while (it7.hasNext()) {
                    arrayList3.add(new ClipGridParams.Data.Profile((ClipsAuthor) it7.next()));
                }
                ArrayList f7 = ums0.f(ums0.a, shortVideoGetOwnerVideosResponseDto5.e(), shortVideoGetOwnerVideosResponseDto5.j(), shortVideoGetOwnerVideosResponseDto5.d());
                String g3 = shortVideoGetOwnerVideosResponseDto5.g();
                PaginationKey next = (g3 == null || g3.length() == 0 || g3.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(g3);
                PaginationKey.LoadedFull loadedFull = PaginationKey.LoadedFull.b;
                if (newsfeedGenericResponseDto == null || (f = newsfeedGenericResponseDto.f()) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto : f) {
                        NewsfeedNewsfeedItemDto.NewsfeedItemVideoDto newsfeedItemVideoDto = newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemVideoDto ? (NewsfeedNewsfeedItemDto.NewsfeedItemVideoDto) newsfeedNewsfeedItemDto : null;
                        if (newsfeedItemVideoDto == null || (C = newsfeedItemVideoDto.C()) == null) {
                            iterable = EmptyList.b;
                        } else {
                            ums0 ums0Var = ums0.a;
                            List<VideoVideoFullDto> d3 = C.d();
                            if (d3 == null) {
                                d3 = EmptyList.b;
                            }
                            iterable = ums0.f(ums0Var, d3, newsfeedGenericResponseDto.i(), newsfeedGenericResponseDto.e());
                        }
                        g5g.y(iterable, arrayList4);
                    }
                    arrayList = arrayList4;
                }
                String g4 = newsfeedGenericResponseDto != null ? newsfeedGenericResponseDto.g() : null;
                long intValue2 = shortVideoGetOwnerVideosResponseDto5.k() != null ? r0.intValue() : 0L;
                long intValue3 = shortVideoGetOwnerVideosResponseDto5.f() != null ? r0.intValue() : 0L;
                int e4 = on00.e(c5g.u(arrayList3, 10));
                if (e4 < 16) {
                    e4 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e4);
                Iterator it8 = arrayList3.iterator();
                while (it8.hasNext()) {
                    ClipsAuthor clipsAuthor = ((ClipGridParams.Data.Profile) it8.next()).b;
                    linkedHashMap.put(clipsAuthor.b.b, Long.valueOf(clipsAuthor.j()));
                }
                List f8 = shortVideoGetOwnerVideosResponseDto != null ? ums0.f(ums0.a, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d()) : EmptyList.b;
                String g5 = shortVideoGetOwnerVideosResponseDto != null ? shortVideoGetOwnerVideosResponseDto.g() : null;
                PaginationKey next2 = (g5 == null || g5.length() == 0 || g5.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(g5);
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    arrayList5.add(((ClipGridParams.Data.Profile) it9.next()).b.b);
                }
                int e5 = on00.e(c5g.u(arrayList5, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(e5 < 16 ? 16 : e5);
                Iterator it10 = arrayList5.iterator();
                while (it10.hasNext()) {
                    Object next3 = it10.next();
                    linkedHashMap2.put(((Owner) next3).b, next3);
                }
                return new nee(f7, next, null, 0L, loadedFull, arrayList, g4, null, null, intValue2, intValue3, arrayList3, linkedHashMap, f8, next2, linkedHashMap2);
            case 2:
                h3k h3kVar = (h3k) obj;
                n9h n9hVar = (n9h) this.receiver;
                CommunityManageFragment communityManageFragment = n9hVar.a;
                if (h3kVar instanceof h3k.b) {
                    n9hVar.d = -1;
                    h3k.b bVar = (h3k.b) h3kVar;
                    if (epx.f(bVar, h3k.b.a.b)) {
                        mfu0 jo = communityManageFragment.jo();
                        if (jo != null) {
                            JsApiMethodType jsApiMethodType = JsApiMethodType.OPEN_LIVE_COVER_CAMERA;
                            JSONObject d4 = yq.d("status", "cancel");
                            s3q0 s3q0Var = s3q0.a;
                            jo.n(jsApiMethodType, d4);
                        }
                        communityManageFragment.qo(VkSpinnerContent.SpinnerState.Error);
                    } else if (bVar instanceof h3k.b.C2970b) {
                        h3k.b.C2970b c2970b = (h3k.b.C2970b) h3kVar;
                        mfu0 jo2 = communityManageFragment.jo();
                        if (jo2 != null) {
                            JsApiMethodType jsApiMethodType2 = JsApiMethodType.OPEN_LIVE_COVER_CAMERA;
                            JSONObject d5 = yq.d("status", "uploaded");
                            d5.put("story", c2970b.b);
                            s3q0 s3q0Var2 = s3q0.a;
                            jo2.n(jsApiMethodType2, d5);
                        }
                        communityManageFragment.qo(VkSpinnerContent.SpinnerState.Done);
                    } else {
                        if (!epx.f(bVar, h3k.b.c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mfu0 jo3 = communityManageFragment.jo();
                        if (jo3 != null) {
                            JsApiMethodType jsApiMethodType3 = JsApiMethodType.OPEN_LIVE_COVER_CAMERA;
                            JSONObject d6 = yq.d("status", "error");
                            s3q0 s3q0Var3 = s3q0.a;
                            jo3.n(jsApiMethodType3, d6);
                        }
                        communityManageFragment.qo(VkSpinnerContent.SpinnerState.Error);
                    }
                } else {
                    if (!(h3kVar instanceof h3k.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    communityManageFragment.ro(((h3k.a) h3kVar).b);
                }
                return s3q0.a;
            case 3:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 4:
                n1j n1jVar = (n1j) this.receiver;
                n1jVar.getClass();
                xn50.a.c(n1jVar, (v1j) obj);
                return s3q0.a;
            case 5:
                ((Boolean) obj).getClass();
                pim pimVar = (pim) this.receiver;
                f9w f9wVar = pim.q;
                btk0 btk0Var = pimVar.l;
                ?? r6 = btk0Var.f || btk0Var.g;
                if (btk0Var.g) {
                    btk0Var.g = false;
                    tim timVar = pimVar.m;
                    if (timVar != null) {
                        timVar.a();
                    }
                }
                s3q0 s3q0Var4 = s3q0.a;
                btk0 btk0Var2 = pimVar.l;
                ?? r2 = btk0Var2.f || btk0Var2.g;
                if (r6 != r2 && (fVar = pimVar.o) != null) {
                    b26 b26Var = b26.this;
                    if (r2 == true) {
                        b26.n(b26Var, b26.a.PINNED, false);
                    } else {
                        b26Var.g(b26.a.PINNED, true, 0L);
                    }
                }
                return s3q0.a;
            case 6:
                EcosystemProfileView ecosystemProfileView = (EcosystemProfileView) this.receiver;
                ecosystemProfileView.getClass();
                xn50.a.c(ecosystemProfileView, (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a) obj);
                return s3q0.a;
            case 7:
                ((mvv) this.receiver).getClass();
                List<IdentityLabelDto> list = (List) obj;
                ArrayList arrayList6 = new ArrayList(c5g.u(list, 10));
                for (IdentityLabelDto identityLabelDto : list) {
                    Integer d7 = identityLabelDto.d();
                    arrayList6.add(new WebIdentityLabel(d7 != null ? d7.intValue() : 0, identityLabelDto.e()));
                }
                return arrayList6;
            case 8:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((jzl0) this.receiver).getClass();
                return Float.valueOf(jzl0.h(booleanValue));
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e89(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, coe.class, "mapToData", "mapToData(Lcom/vk/clips/viewer/impl/grid/repository/source/request/ClipsOwnerGridBatchResponse;)Lcom/vk/api/clips/ClipsGridSourcesData;", 0);
                break;
            case 2:
                super(1, obj, n9h.class, "handleUploadEvent", "handleUploadEvent(Lcom/vk/webapp/CoverUploadEvents;)V", 0);
                break;
            case 3:
            case 4:
            case 6:
            case 7:
            default:
                break;
            case 5:
                super(1, obj, pim.class, "onPinnedMsgDetachProgressSuccess", "onPinnedMsgDetachProgressSuccess(Z)V", 0);
                break;
            case 8:
                super(1, obj, jzl0.class, "getAlpha", "getAlpha(Z)F", 0);
                break;
            case 9:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
