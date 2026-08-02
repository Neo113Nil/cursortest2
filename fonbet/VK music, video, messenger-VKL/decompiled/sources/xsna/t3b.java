package xsna;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCommentsInfoDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.channels.dto.ChannelsMessageCountersDto;
import com.vk.api.generated.channels.dto.ChannelsMessagesPaidReactionCounterDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsTabContentShortVideosDto;
import com.vk.api.generated.likes.dto.LikesItemReactionDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.wall.dto.WallViewsDto;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.user.UserProfile;
import com.vk.dzenarticle.impl.ui.view.ad.TopAdView;
import com.vk.im.engine.models.attaches.AttachComments;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.PaidReaction;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import xsna.cvd0;
import xsna.gm50;
import xsna.n1j;
import xsna.r2j;
import xsna.uxv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t3b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t3b(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06df  */
    /* JADX WARN: Type inference failed for: r0v13, types: [xsna.n1j] */
    /* JADX WARN: Type inference failed for: r0v25, types: [xsna.t7w] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.ViewGroup, xsna.o1j] */
    /* JADX WARN: Type inference failed for: r7v2, types: [xsna.r3b] */
    /* JADX WARN: Type inference failed for: r8v13, types: [ru.ok.android.externcalls.sdk.factory.CreateConfParams$Builder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        LikesItemReactionsDto g;
        int i2;
        ItemReactions itemReactions;
        ChannelsMessagesPaidReactionCounterDto f;
        PaidReaction paidReaction;
        Integer d;
        BaseBoolIntDto d2;
        BaseBoolIntDto e;
        BaseBoolIntDto f2;
        BaseBoolIntDto g2;
        Integer i3;
        BaseRepostsInfoDto i4;
        PaidReaction paidReaction2;
        WallViewsDto j;
        BaseBoolIntDto g3;
        ?? r9;
        long j2;
        int i5;
        boolean z2;
        Map map;
        int i6;
        lj30 lj30Var = null;
        switch (this.b) {
            case 0:
                u3b u3bVar = (u3b) this.c;
                List list = (List) this.d;
                w2w w2wVar = (w2w) this.e;
                ?? y = ((xgl0) obj).y();
                long j3 = u3bVar.b;
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((ChannelsMessageCountersDto) it.next()).e()));
                }
                SparseArray<Msg> i7 = y.i(j3, arrayList);
                SparseArray sparseArray = new SparseArray();
                int size = i7.size();
                for (int i8 = 0; i8 < size; i8++) {
                    int keyAt = i7.keyAt(i8);
                    Msg valueAt = i7.valueAt(i8);
                    MsgFromChannel msgFromChannel = valueAt instanceof MsgFromChannel ? (MsgFromChannel) valueAt : null;
                    if (msgFromChannel != null) {
                        sparseArray.put(keyAt, msgFromChannel);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    ChannelsMessageCountersDto channelsMessageCountersDto = (ChannelsMessageCountersDto) obj2;
                    MsgFromChannel msgFromChannel2 = (MsgFromChannel) sparseArray.get(channelsMessageCountersDto.e());
                    AttachComments attachComments = msgFromChannel2.I.l;
                    Integer valueOf = attachComments != null ? Integer.valueOf(attachComments.b) : null;
                    BaseCommentsInfoDto d3 = channelsMessageCountersDto.d();
                    if (epx.f(valueOf, d3 != null ? d3.i() : null)) {
                        AttachComments attachComments2 = msgFromChannel2.I.l;
                        Integer valueOf2 = attachComments2 != null ? Integer.valueOf(attachComments2.c ? 1 : 0) : null;
                        BaseCommentsInfoDto d4 = channelsMessageCountersDto.d();
                        if (epx.f(valueOf2, (d4 == null || (g3 = d4.g()) == null) ? null : Integer.valueOf(g3.i())) && (i4 = channelsMessageCountersDto.i()) != null && msgFromChannel2.I.q == i4.getCount()) {
                            PaidReaction paidReaction3 = msgFromChannel2.I.o;
                            ChannelsMessagesPaidReactionCounterDto f3 = channelsMessageCountersDto.f();
                            if (f3 != null) {
                                int count = f3.getCount();
                                Integer d5 = f3.d();
                                paidReaction2 = new PaidReaction(count, d5 != null ? d5.intValue() : 0);
                            } else {
                                paidReaction2 = null;
                            }
                            if (epx.f(paidReaction3, paidReaction2)) {
                                ItemReactions itemReactions2 = msgFromChannel2.I.p;
                                Integer valueOf3 = itemReactions2 != null ? Integer.valueOf(itemReactions2.c) : null;
                                LikesItemReactionsDto g4 = channelsMessageCountersDto.g();
                                if (epx.f(valueOf3, g4 != null ? Integer.valueOf(g4.getCount()) : null)) {
                                    ItemReactions itemReactions3 = msgFromChannel2.I.p;
                                    Integer num = itemReactions3 != null ? itemReactions3.e : null;
                                    LikesItemReactionsDto g5 = channelsMessageCountersDto.g();
                                    if (epx.f(num, g5 != null ? g5.e() : null) && (j = channelsMessageCountersDto.j()) != null) {
                                        int i9 = msgFromChannel2.I.r;
                                        Integer d6 = j.d();
                                        if (d6 != null && i9 == d6.intValue()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList2.add(obj2);
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ChannelsMessageCountersDto channelsMessageCountersDto2 = (ChannelsMessageCountersDto) it2.next();
                    MsgFromChannel msgFromChannel3 = (MsgFromChannel) sparseArray.get(channelsMessageCountersDto2.e());
                    BaseCommentsInfoDto d7 = channelsMessageCountersDto2.d();
                    int intValue = (d7 == null || (i3 = d7.i()) == null) ? 0 : i3.intValue();
                    BaseCommentsInfoDto d8 = channelsMessageCountersDto2.d();
                    if (d8 == null || (g2 = d8.g()) == null) {
                        i = 1;
                    } else {
                        i = 1;
                        if (g2.i() == 1) {
                            z = true;
                            BaseCommentsInfoDto d9 = channelsMessageCountersDto2.d();
                            ?? r25 = (d9 == null && (f2 = d9.f()) != null && f2.i() == i) ? i : 0;
                            BaseCommentsInfoDto d10 = channelsMessageCountersDto2.d();
                            ?? r26 = (d10 == null && (e = d10.e()) != null && e.i() == i) ? i : 0;
                            BaseCommentsInfoDto d11 = channelsMessageCountersDto2.d();
                            msgFromChannel3.jc(new AttachComments(intValue, z, r25, r26, (d11 == null && (d2 = d11.d()) != null && d2.i() == i) ? i : 0));
                            BaseRepostsInfoDto i10 = channelsMessageCountersDto2.i();
                            msgFromChannel3.I = MsgFromChannel.b.a(msgFromChannel3.I, null, 0, null, null, null, null, false, null, null, i10 == null ? i10.getCount() : 0, 0, 0L, false, 67043327);
                            g = channelsMessageCountersDto2.g();
                            if (g == null) {
                                List<LikesItemReactionDto> d12 = g.d();
                                ArrayList arrayList4 = new ArrayList(c5g.u(d12, 10));
                                for (LikesItemReactionDto likesItemReactionDto : d12) {
                                    arrayList4.add(new ItemReaction(likesItemReactionDto.getId(), likesItemReactionDto.getCount()));
                                }
                                i2 = 0;
                                itemReactions = new ItemReactions(p4g.q(arrayList4), g.getCount(), 0, g.e());
                            } else {
                                i2 = 0;
                                itemReactions = null;
                            }
                            f = channelsMessageCountersDto2.f();
                            if (f == null) {
                                int count2 = f.getCount();
                                Integer d13 = f.d();
                                paidReaction = new PaidReaction(count2, d13 != null ? d13.intValue() : i2);
                            } else {
                                paidReaction = null;
                            }
                            msgFromChannel3.lc(paidReaction);
                            msgFromChannel3.kc(itemReactions);
                            WallViewsDto j4 = channelsMessageCountersDto2.j();
                            msgFromChannel3.I = MsgFromChannel.b.a(msgFromChannel3.I, null, 0, null, null, null, null, false, null, null, 0, (j4 != null || (d = j4.d()) == null) ? i2 : d.intValue(), 0L, false, 66977791);
                            arrayList3.add(msgFromChannel3);
                        }
                    }
                    z = false;
                    BaseCommentsInfoDto d92 = channelsMessageCountersDto2.d();
                    if (d92 == null) {
                    }
                    BaseCommentsInfoDto d102 = channelsMessageCountersDto2.d();
                    if (d102 == null) {
                    }
                    BaseCommentsInfoDto d112 = channelsMessageCountersDto2.d();
                    msgFromChannel3.jc(new AttachComments(intValue, z, r25, r26, (d112 == null && (d2 = d112.d()) != null && d2.i() == i) ? i : 0));
                    BaseRepostsInfoDto i102 = channelsMessageCountersDto2.i();
                    msgFromChannel3.I = MsgFromChannel.b.a(msgFromChannel3.I, null, 0, null, null, null, null, false, null, null, i102 == null ? i102.getCount() : 0, 0, 0L, false, 67043327);
                    g = channelsMessageCountersDto2.g();
                    if (g == null) {
                    }
                    f = channelsMessageCountersDto2.f();
                    if (f == null) {
                    }
                    msgFromChannel3.lc(paidReaction);
                    msgFromChannel3.kc(itemReactions);
                    WallViewsDto j42 = channelsMessageCountersDto2.j();
                    msgFromChannel3.I = MsgFromChannel.b.a(msgFromChannel3.I, null, 0, null, null, null, null, false, null, null, 0, (j42 != null || (d = j42.d()) == null) ? i2 : d.intValue(), 0L, false, 66977791);
                    arrayList3.add(msgFromChannel3);
                }
                if (!arrayList3.isEmpty()) {
                    y.a(arrayList3);
                    ArrayList arrayList5 = new ArrayList(c5g.u(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(Integer.valueOf(((MsgFromChannel) it3.next()).b));
                    }
                    w2wVar.e1(u3bVar, new o280(j3, "ChannelMessagesUpdateCountersCmd", arrayList5));
                }
                return s3q0.a;
            case 1:
                Clips clips = (Clips) this.c;
                dgh dghVar = (dgh) this.d;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.e;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                cvd0.f fVar = clips.j;
                if (fVar != null) {
                    ArrayList arrayList6 = fVar.a;
                    r9 = new ArrayList();
                    for (Object obj3 : arrayList6) {
                        if (!epx.f(((VideoFile) obj3).getType(), "short_video")) {
                            r9.add(obj3);
                        }
                    }
                } else {
                    r9 = EmptyList.b;
                }
                ArrayList arrayList7 = new ArrayList();
                new dqu();
                new j2r0();
                List<GroupsGroupFullDto> k = groupsGetContentForTabsResponseDto.k();
                if (k == null) {
                    k = EmptyList.b;
                }
                List<GroupsGroupFullDto> list3 = k;
                ArrayList arrayList8 = new ArrayList(c5g.u(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(dqu.a((GroupsGroupFullDto) it4.next()));
                }
                int e2 = on00.e(c5g.u(arrayList8, 10));
                if (e2 < 16) {
                    e2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
                Iterator it5 = arrayList8.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    linkedHashMap.put(((Group) next).c, next);
                }
                List<UsersUserFullDto> u = groupsGetContentForTabsResponseDto.u();
                if (u == null) {
                    u = EmptyList.b;
                }
                List<UsersUserFullDto> list4 = u;
                ArrayList arrayList9 = new ArrayList(c5g.u(list4, 10));
                Iterator it6 = list4.iterator();
                while (it6.hasNext()) {
                    arrayList9.add(j2r0.a((UsersUserFullDto) it6.next()));
                }
                int e3 = on00.e(c5g.u(arrayList9, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(e3 >= 16 ? e3 : 16);
                Iterator it7 = arrayList9.iterator();
                while (it7.hasNext()) {
                    Object next2 = it7.next();
                    linkedHashMap2.put(((UserProfile) next2).c, next2);
                }
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put(dghVar.a, extendedCommunityProfile.a.l0());
                pn00.q(mapBuilder, new ulp0(rn00.w(linkedHashMap), new jt(19)));
                pn00.q(mapBuilder, new ulp0(rn00.w(linkedHashMap2), new sm0(12)));
                MapBuilder h = mapBuilder.h();
                GroupsTabContentShortVideosDto C = groupsGetContentForTabsResponseDto.C();
                List<VideoVideoFullDto> d14 = C != null ? C.d() : null;
                if (d14 == null) {
                    d14 = EmptyList.b;
                }
                List<VideoVideoFullDto> list5 = d14;
                ArrayList arrayList10 = new ArrayList(c5g.u(list5, 10));
                Iterator it8 = list5.iterator();
                while (it8.hasNext()) {
                    arrayList10.add(ums0.d(ums0.a, (VideoVideoFullDto) it8.next(), h, null, null, 28));
                }
                arrayList7.addAll(arrayList10);
                return Clips.i(clips, new cvd0.f(j5g.u0(arrayList7, (Collection) r9)), null, null, null, myc0.f(C != null ? C.e() : null) && !arrayList10.isEmpty(), false, C != null ? C.e() : null, null, CommunityProfileContentItem.State.LOADED, null, null, null, false, 523694);
            case 2:
                ?? r0 = (n1j) this.c;
                ?? r2 = (o1j) this.d;
                u1j u1jVar = (u1j) this.e;
                r2j.g gVar = (r2j.g) obj;
                int i11 = n1j.k1;
                r0.bo(r2, n1j.a.READY);
                r2.setContentView(u1jVar);
                u1jVar.getClass();
                gm50.a.a(u1jVar, gVar.a, new r1j(1, u1jVar, u1j.class, "renderEditState", "renderEditState(Lcom/vk/voip/ui/sessionrooms/dialog/admin/configure/feature/ConfigureSessionRoomsState$RoomsReady$RoomEditState;)V", 0));
                gm50.a.a(u1jVar, gVar.b, new s1j(1, u1jVar, u1j.class, "renderReadyState", "renderReadyState(Lcom/vk/voip/ui/sessionrooms/dialog/admin/configure/feature/ConfigureSessionRoomsViewState$RoomsReadyState;)V", 0));
                gm50.a.a(u1jVar, gVar.c, new t1j(1, u1jVar, u1j.class, "renderError", "renderError(Lcom/vk/voip/ui/sessionrooms/dialog/admin/configure/feature/ConfigureSessionRoomsViewState$Error;)V", 0));
                return s3q0.a;
            case 3:
                uxv uxvVar = (uxv) this.c;
                Context context = (Context) this.d;
                String str = (String) this.e;
                int i12 = uxv.a.$EnumSwitchMapping$0[((LinkAction) obj).ordinal()];
                if (i12 == 1) {
                    uxvVar.c.b().Q(context, uxvVar.b, uxvVar.e, str);
                } else if (i12 == 2) {
                    uxv.a(context, str);
                }
                return s3q0.a;
            case 4:
                xgl0 xgl0Var = (xgl0) this.c;
                Map map2 = (Map) this.d;
                Map map3 = (Map) this.e;
                ?? j5 = xgl0Var.j();
                Collection values = map2.values();
                ArrayList arrayList11 = new ArrayList(c5g.u(values, 10));
                Iterator it9 = values.iterator();
                while (it9.hasNext()) {
                    bdb bdbVar = (bdb) it9.next();
                    long j6 = bdbVar.b;
                    ImItemType imItemType = ImItemType.CHANNEL;
                    b5w b5wVar = new b5w(j6, imItemType);
                    lj30 lj30Var2 = (lj30) map3.get(Long.valueOf(j6));
                    long j7 = bdbVar.b;
                    vcb vcbVar = bdbVar.i;
                    if (lj30Var2 == null || !lj30Var2.m || lj30Var2.j) {
                        lj30Var2 = lj30Var;
                    }
                    int i13 = vcbVar.b.b;
                    if (lj30Var2 == null || !lj30Var2.c()) {
                        j2 = j7;
                        i5 = i13;
                        z2 = false;
                    } else {
                        j2 = j7;
                        i5 = i13;
                        z2 = true;
                    }
                    int i14 = vcbVar.b.c;
                    Iterator it10 = it9;
                    if (lj30Var2 != null) {
                        map = map3;
                        i6 = (int) (lj30Var2.n / 1000);
                    } else {
                        map = map3;
                        i6 = i14;
                    }
                    arrayList11.add(new Pair(b5wVar, com.vk.im.engine.models.im_item.b.e(i5, z2, i14, imItemType, i6, lj30Var2 != null ? lj30Var2.c : 0, j2)));
                    it9 = it10;
                    map3 = map;
                    lj30Var = null;
                }
                j5.i(arrayList11);
                return s3q0.a;
            case 5:
                yvj yvjVar = (yvj) this.c;
                gdj0 gdj0Var = (gdj0) this.d;
                myc0.h(yvjVar, null, null, new ix20(gdj0Var, ((Float) obj).floatValue(), null), 3).E(new g84(18, gdj0Var, (gzs) this.e));
                return s3q0.a;
            case 6:
                dhw0 dhw0Var = (dhw0) this.c;
                UserId userId = dhw0Var.M;
                JSONObject jSONObject = (JSONObject) this.d;
                OKVoipEngine.c cVar = (OKVoipEngine.c) this.e;
                OKVoipEngine.d dVar = cVar.h;
                ?? r8 = (CreateConfParams.Builder) obj;
                Set<CallMemberId> set = dhw0Var.h;
                ArrayList arrayList12 = new ArrayList(c5g.u(set, 10));
                Iterator it11 = set.iterator();
                while (it11.hasNext()) {
                    arrayList12.add(mnh0.H((CallMemberId) it11.next()));
                }
                CreateConfParams.Builder anonForbidden = r8.setInitialIds(arrayList12).setPayload(jSONObject.toString()).setAnonForbidden(false);
                OKVoipEngine.b.getClass();
                return anonForbidden.setTokenInfoProvider(new vxb((c2p0) OKVoipEngine.F(), userId)).setWatchTogetherEnabledForAll(cVar.b.o).setMyId(new ParticipantId(String.valueOf(userId.b), false, 0)).setOnPrepared(dVar.a).setOnError(dVar.b).setStartWithVideo(cVar.d).setFrameInterceptor((CapturedFrameInterceptor) OKVoipEngine.A).setEventListener((ConversationEventsListener) dVar.c).build();
            case 7:
                Set set2 = (Set) this.c;
                s8i0 s8i0Var = (s8i0) this.d;
                Set set3 = (Set) this.e;
                boolean z3 = set2.size() > 0;
                Set set4 = z3 ? set2 : set3;
                boolean z4 = !z3;
                if (z3) {
                    set2 = set3;
                }
                s8i0.b(s8i0Var, set4, z4, set2, 8);
                return s3q0.a;
            case 8:
                ram0 ram0Var = (ram0) this.c;
                Activity activity = (Activity) this.d;
                String str2 = (String) this.e;
                ((ikv0) obj).a();
                maz.c(ram0Var.b.e(), activity, h5s.d(new StringBuilder("vk://"), a0a.d, "/story", str2, "?context=owner"), new LaunchContext(false, false, false, "story_view", null, null, null, null, null, "REPOST_AUTO_TO_STORY_ACTIVITY".toLowerCase(Locale.ROOT), null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108343), null, null, 24);
                return s3q0.a;
            case 9:
                fe0 fe0Var = (fe0) this.c;
                zu50 zu50Var = (zu50) this.d;
                VkText vkText = (VkText) this.e;
                int i15 = TopAdView.l;
                fe0Var.c.clear();
                zu50Var.e(vkText.getContext());
                return s3q0.a;
            default:
                i4s0 i4s0Var = (i4s0) this.c;
                n85 n85Var = (n85) this.d;
                q34 q34Var = (q34) this.e;
                ReentrantLock reentrantLock = i4s0Var.h;
                reentrantLock.lock();
                try {
                    c63 c63Var = c63.a;
                    if (!c63.f) {
                        i4s0Var.g = true;
                        i4s0Var.b();
                    } else if (!i4s0Var.f) {
                        long j8 = i4s0Var.e;
                        if (j8 > 0) {
                            n85Var.invoke(Long.valueOf(j8), Long.valueOf(i4s0Var.d));
                        } else {
                            i4s0Var.a();
                            q34Var.invoke();
                        }
                        i4s0Var.e--;
                    }
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    return s3q0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }
}
