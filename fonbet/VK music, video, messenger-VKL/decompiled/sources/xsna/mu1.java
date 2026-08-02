package xsna;

import android.content.Context;
import android.os.Trace;
import android.util.ArraySet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.ui.UIBlockFriendsLiked;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupHorizontalListItemVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastSliderItem;
import com.vk.channels.api.ChannelFilter;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.community.design.view.components.catalog.CommunityCardView;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.podcast.FriendsLikedEpisode;
import com.vk.dto.podcast.PodcastSliderItem;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.users.UserStorageModel;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.catalog.impl.v2.catalog.cache.StreamParcelableCatalogData;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.internal.upload.DbUploader;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import ru.ok.android.webrtc.opengl.CallOpenGLDrawer;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import xsna.ctb0;
import xsna.dai;
import xsna.e8v0;
import xsna.ee60;
import xsna.hov;
import xsna.le60;
import xsna.lw8;
import xsna.pd30;
import xsna.q5b0;
import xsna.qd90;
import xsna.qr60;
import xsna.spt;
import xsna.t8a;
import xsna.tba0;
import xsna.v2a;
import xsna.vf60;
import xsna.xg10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mu1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mu1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x07f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x080c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07c0  */
    /* JADX WARN: Type inference failed for: r0v57, types: [xsna.j8i, xsna.xwb$a] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v27, types: [com.vk.channels.api.Channel] */
    /* JADX WARN: Type inference failed for: r6v30, types: [com.vk.channels.api.Channel] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Long l;
        boolean z;
        boolean z2;
        lw8.b bVar;
        Long l2;
        Long l3;
        Long l4;
        s3q0 upload$lambda$0$0;
        String a;
        MobileOfficialAppsCoreNavStat$EventScreen a2;
        dai.d<zhf0> a3;
        iie iieVar;
        int i = 12;
        int i2 = 6;
        int i3 = 7;
        switch (this.b) {
            case 0:
                nu1 nu1Var = (nu1) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ctb0.b bVar2 = (ctb0.b) obj;
                int i4 = nu1.n1;
                if (!(bVar2 instanceof ctb0.b.a)) {
                    return s3q0.a;
                }
                ctb0.b.a aVar = (ctb0.b.a) bVar2;
                int i5 = 0;
                for (Object obj2 : aVar.a) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    ((ype0) arrayList.get(i5)).setState((xpe0) obj2);
                    i5 = i6;
                }
                VkButton vkButton = nu1Var.k1;
                if (vkButton != null) {
                    vkButton.setEnabled(aVar.b);
                }
                return s3q0.a;
            case 1:
                VkAuthMetaInfo vkAuthMetaInfo = (VkAuthMetaInfo) this.c;
                UserId userId = (UserId) this.d;
                AuthResult authResult = (AuthResult) obj;
                r55 r55Var = r55.a;
                return r55.h().d(authResult).C(new i55(0, authResult, vkAuthMetaInfo, userId)).U(new sj4(new iz0(authResult, 2), 1));
            case 2:
                lw8 lw8Var = (lw8) this.c;
                ufb ufbVar = (ufb) this.d;
                w2w w2wVar = lw8Var.a;
                xgl0 I0 = w2wVar.I0();
                aeb aebVar = ufbVar.a;
                ChannelFilter channelFilter = ufbVar.b;
                int i7 = ufbVar.c;
                if (i7 <= 0) {
                    throw new IllegalArgumentException(lhg.a(i7, "Expect limit to be > 0. Given: "));
                }
                uib a4 = I0.a();
                int j = I0.system().j();
                com.vk.movika.sdk.base.observable.w wVar = new com.vk.movika.sdk.base.observable.w(lw8Var, i);
                wfb o = a4.o(channelFilter);
                boolean z3 = o != null && o.d == j;
                boolean z4 = o != null ? o.c : false;
                if (o == null) {
                    l = null;
                    bVar = new lw8.b(EmptyList.b, jgp.b, EmptySet.b, !aebVar.c(), false, true, false);
                } else {
                    l = null;
                    vcb vcbVar = (vcb) jw5.v(o.b, new vcb(0L, new vjm(0, 1)));
                    long j2 = vcbVar.c;
                    vjm vjmVar = vcbVar.b;
                    aeb aebVar2 = new aeb(new gkx0(xo9.x(xo9.x(xo9.x(xo9.x(0L, d370.d, 0L), d370.c, vjmVar.b), d370.e, vjmVar.c), d370.f, 0)), j2);
                    uib a5 = I0.a();
                    ChannelType.Companion.getClass();
                    zrp<ChannelType> h = ChannelType.h();
                    List<bdb> D = a5.D(aebVar, channelFilter, Direction.BEFORE, aebVar2, h, i7 + 1);
                    List<bdb> D2 = a5.D(aebVar, channelFilter, Direction.AFTER, aeb.e, h, 2);
                    ArrayList arrayList2 = (ArrayList) D;
                    List subList = arrayList2.subList(0, Math.min(arrayList2.size(), i7));
                    boolean z5 = arrayList2.size() > i7;
                    int size = ((ArrayList) D2).size();
                    lw8.a aVar2 = new lw8.a(subList, z5, (size == 0 || (size == 1 && epx.f(j5g.a0(D), j5g.a0(D2)))) ? false : true);
                    r3b y = I0.y();
                    List list = subList;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Long.valueOf(((bdb) it.next()).b));
                    }
                    Map<Long, Msg> t = y.t(arrayList3);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((HashMap) t).entrySet()) {
                        if (!((Msg) entry.getValue()).r) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Iterator it2 = subList.iterator();
                    int i8 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            bdb bdbVar = (bdb) it2.next();
                            boolean z6 = bdbVar.c > 0;
                            Msg msg = (Msg) linkedHashMap.get(Long.valueOf(bdbVar.b));
                            if (!z6 || msg != null) {
                                i8++;
                            }
                        } else {
                            i8 = -1;
                        }
                    }
                    if (i8 >= 0) {
                        aVar2 = new lw8.a(subList.subList(0, i8), false, aVar2.c);
                    }
                    boolean z7 = aVar2.c;
                    List<bdb> list2 = aVar2.a;
                    boolean z8 = list2.size() < subList.size();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        Msg msg2 = (Msg) linkedHashMap.get(Long.valueOf(((bdb) it3.next()).b));
                        if (msg2 != null) {
                            linkedHashMap2.put(Long.valueOf(msg2.c), msg2);
                        }
                    }
                    ArraySet arraySet = new ArraySet();
                    for (bdb bdbVar2 : list2) {
                        Msg msg3 = (Msg) linkedHashMap2.get(Long.valueOf(bdbVar2.b));
                        int intValue = ((Number) wVar.invoke(bdbVar2)).intValue();
                        boolean z9 = bdbVar2.r != intValue;
                        boolean z10 = (msg3 == null || msg3.u == intValue) ? false : true;
                        if (z9 || z10) {
                            arraySet.add(Long.valueOf(bdbVar2.b));
                        }
                    }
                    if (!list2.isEmpty()) {
                        bdb bdbVar3 = (bdb) j5g.Y(list2);
                        if (bdbVar3.r != ((Number) wVar.invoke(bdbVar3)).intValue()) {
                            z = true;
                            if (!list2.isEmpty()) {
                                bdb bdbVar4 = (bdb) j5g.i0(list2);
                                if (bdbVar4.r != ((Number) wVar.invoke(bdbVar4)).intValue()) {
                                    z2 = true;
                                    boolean z11 = !z3 && z4;
                                    boolean z12 = aebVar.c() && (z7 || z || !z3);
                                    boolean z13 = aebVar.c() && z7;
                                    boolean z14 = aVar2.b;
                                    bVar = new lw8.b(list2, linkedHashMap2, arraySet, z12, z13, !z14 || z8 || z2 || !z11, (z14 || z8) ? false : true);
                                }
                            }
                            z2 = false;
                            if (z3) {
                            }
                            if (aebVar.c()) {
                            }
                            if (aebVar.c()) {
                            }
                            boolean z142 = aVar2.b;
                            bVar = new lw8.b(list2, linkedHashMap2, arraySet, z12, z13, !z142 || z8 || z2 || !z11, (z142 || z8) ? false : true);
                        }
                    }
                    z = false;
                    if (!list2.isEmpty()) {
                    }
                    z2 = false;
                    if (z3) {
                    }
                    if (aebVar.c()) {
                    }
                    if (aebVar.c()) {
                    }
                    boolean z1422 = aVar2.b;
                    bVar = new lw8.b(list2, linkedHashMap2, arraySet, z12, z13, !z1422 || z8 || z2 || !z11, (z1422 || z8) ? false : true);
                }
                List<bdb> list3 = bVar.a;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (bdb bdbVar5 : list3) {
                    Long l5 = bdbVar5.w;
                    if (l5 != null) {
                        long longValue = l5.longValue();
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        l4 = Long.valueOf(Peer.a.d(longValue));
                    } else {
                        l4 = l;
                    }
                    ChannelType channelType = bdbVar5.v;
                    if ((channelType == null ? -1 : lw8.c.$EnumSwitchMapping$0[channelType.ordinal()]) != 1) {
                        arrayList4.add(Long.valueOf(l4 != null ? l4.longValue() : bdbVar5.b));
                    } else if (l4 != null) {
                        arrayList5.add(Long.valueOf(l4.longValue()));
                    }
                }
                Trace.beginSection(ndp0.f("CacheEngineChannelsProvider.loadChannels groups"));
                try {
                    Map<Long, Group> c = w2wVar.I0().n().c(arrayList4);
                    Trace.endSection();
                    Trace.beginSection(ndp0.f("CacheEngineChannelsProvider.loadChannels users"));
                    try {
                        Map<Long, UserStorageModel> c2 = w2wVar.I0().d().c(arrayList5);
                        Trace.endSection();
                        ArrayList arrayList6 = new ArrayList(0);
                        Trace.beginSection(ndp0.f("CacheEngineChannelsProvider.loadChannels channels"));
                        try {
                            ArrayList arrayList7 = new ArrayList();
                            for (bdb bdbVar6 : list3) {
                                Long l6 = bdbVar6.w;
                                if (l6 != null) {
                                    long longValue2 = l6.longValue();
                                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                                    l2 = Long.valueOf(Peer.a.d(longValue2));
                                } else {
                                    l2 = l;
                                }
                                ChannelType channelType2 = bdbVar6.v;
                                if ((channelType2 == null ? -1 : lw8.c.$EnumSwitchMapping$0[channelType2.ordinal()]) == 1) {
                                    UserStorageModel userStorageModel = c2.get(l2);
                                    if (userStorageModel != null) {
                                        l3 = tua.b(bdbVar6, userStorageModel);
                                    }
                                    l3 = l;
                                } else {
                                    long longValue3 = l2 != null ? l2.longValue() : bdbVar6.b;
                                    Serializer.c<Peer> cVar3 = Peer.CREATOR;
                                    Group group = c.get(Long.valueOf(Peer.a.d(longValue3)));
                                    if (group != null) {
                                        l3 = tua.a(bdbVar6, group);
                                    } else {
                                        arrayList6.add(Long.valueOf(longValue3));
                                        l3 = l;
                                    }
                                }
                                if (l3 != null) {
                                    arrayList7.add(l3);
                                }
                            }
                            Trace.endSection();
                            qfb qfbVar = new qfb(arrayList7, bVar.b, bVar.f, bVar.g, bVar.d, bVar.e);
                            qfbVar.d().addAll(bVar.c);
                            qfbVar.d().addAll(arrayList6);
                            return qfbVar;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } finally {
                    }
                } finally {
                }
            case 3:
                return CallOpenGLRenderer.a((CallOpenGLDrawer) this.c, (Surface) this.d, (CallOpenGLContext) obj);
            case 4:
                o7m0 o7m0Var = (o7m0) this.c;
                com.vk.cameraui.impl.a aVar3 = (com.vk.cameraui.impl.a) this.d;
                spt.a aVar4 = (spt.a) obj;
                new io.reactivex.rxjava3.disposables.b();
                return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.c(new v850(o7m0Var.getInfo().b.Fb(), aVar4.a)).l(new fr(new com.vk.movika.sdk.base.observable.e0(i3), i2)), new defpackage.x(new rm9(aVar3, o7m0Var, aVar4, r8), i2));
            case 5:
                v2a v2aVar = (v2a) this.c;
                qr0 qr0Var = (qr0) this.d;
                StreamParcelableCatalogData streamParcelableCatalogData = (StreamParcelableCatalogData) ((hov.a) obj).a;
                ke3 ke3Var = streamParcelableCatalogData != null ? streamParcelableCatalogData.b : null;
                List list4 = ke3Var != null ? (List) qr0Var.invoke(ke3Var) : null;
                s7n0 b = bbq.b();
                String d = b != null ? b.d() : null;
                if (ke3Var == null || list4 == null || !epx.f(ke3Var.e, d)) {
                    return io.reactivex.rxjava3.core.q.T(v2a.a.C3866a.a);
                }
                v2a.a.b bVar3 = new v2a.a.b(list4, ke3Var.b);
                v2aVar.getClass();
                if (!epx.f(v2a.b, bVar3)) {
                    v2a.b = bVar3;
                }
                return io.reactivex.rxjava3.core.q.T(bVar3);
            case 6:
                com.vk.search.fragment.a aVar5 = (com.vk.search.fragment.a) this.c;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) this.d;
                ((etv0) obj).b(false);
                aVar5.g.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.f.b);
                return s3q0.a;
            case 7:
                ((xwb) this.c).b.J((ph90) this.d, ((Integer) obj).intValue());
                return s3q0.a;
            case 8:
                return new pcd((com.vk.movika.sdk.base.observable.q) this.c, (tb) this.d, (ViewGroup) obj);
            case 9:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                srf srfVar = (srf) this.d;
                int i9 = ClipsWrapperFragment.Q0;
                clipsWrapperFragment.go(new mh4(i3, clipsWrapperFragment, srfVar.e));
                clipsWrapperFragment.so(srfVar.a);
                clipsWrapperFragment.ro(srfVar.f);
                clipsWrapperFragment.go(new defpackage.v(i2, clipsWrapperFragment, srfVar.b));
                clipsWrapperFragment.go(new bp7(i3, srfVar.c, clipsWrapperFragment));
                clipsWrapperFragment.go(new g22(9, srfVar.d, clipsWrapperFragment));
                return s3q0.a;
            case 10:
                com.vk.dto.group.Group group2 = (com.vk.dto.group.Group) this.c;
                CommunityCardView communityCardView = ((aug) this.d).o;
                communityCardView.setCardImage(new CommunityCardView.b(f870.s(group2, communityCardView.getWidth())));
                return s3q0.a;
            case 11:
                hd60.a().s1(((d4h) this.c).a, ((o0h) this.d).b, MusicPlaybackLaunchContext.l.t());
                return s3q0.a;
            case 12:
                ((djh) this.c).b.invoke(new d.t.a.C1621d(((f5u) this.d).b.b, (ProductTileCtaButtonType) obj));
                return s3q0.a;
            case 13:
                upload$lambda$0$0 = DbUploader.upload$lambda$0$0((DbUploader) this.c, (CallAnalyticsConfig) this.d, (Iterator) obj);
                return upload$lambda$0$0;
            case 14:
                WeakReference weakReference = (WeakReference) this.c;
                ou5 ou5Var = (ou5) this.d;
                ((Boolean) obj).getClass();
                View view = (View) weakReference.get();
                if (view != null) {
                    view.removeCallbacks(ou5Var);
                }
                return s3q0.a;
            case 15:
                ((gtq) this.c).b.g((hyg0) obj, (ArrayList) this.d);
                return s3q0.a;
            case 16:
                GroupHorizontalListItemVh groupHorizontalListItemVh = (GroupHorizontalListItemVh) this.c;
                com.vk.dto.group.Group group3 = (com.vk.dto.group.Group) this.d;
                Context context = ((View) obj).getContext();
                if (((Boolean) groupHorizontalListItemVh.g.getValue()).booleanValue() && groupHorizontalListItemVh.g()) {
                    m3a m3aVar = groupHorizontalListItemVh.j;
                    UserId userId2 = group3.c;
                    UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                    m3aVar.j(new t8a.a(context, userId2, uiTrackingScreen != null ? uiTrackingScreen.a : null, new eph(groupHorizontalListItemVh, 26)));
                } else {
                    groupHorizontalListItemVh.n(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
                    FullSourceJoinApi.EntryServiceType entryServiceType = FullSourceJoinApi.EntryServiceType.COMMUNITY;
                    String h2 = FullSourceJoinApi.SourceType.SIMILAR_GROUPS_BLOCK.h();
                    dha dhaVar = groupHorizontalListItemVh.k;
                    if (dhaVar == null || (a2 = dhaVar.a()) == null || (a = a2.name()) == null) {
                        a = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUPS_LIST);
                    }
                    groupHorizontalListItemVh.h(context, group3, entryServiceType, h2, a);
                }
                VkTile vkTile = groupHorizontalListItemVh.l;
                if (vkTile != null) {
                    VkTile.h visualContentParams = vkTile.getVisualContentParams();
                    GroupHorizontalListItemVh.b bVar4 = visualContentParams instanceof GroupHorizontalListItemVh.b ? (GroupHorizontalListItemVh.b) visualContentParams : null;
                    if (bVar4 != null) {
                        Integer num = bVar4.b;
                        if ((num != null ? num.intValue() : 0) != 0) {
                            vkTile.setVisualContentParams(new GroupHorizontalListItemVh.b(bVar4.a, null, bVar4.c, bVar4.d));
                        }
                    }
                }
                return s3q0.a;
            case 17:
                xg10.a aVar6 = (xg10.a) this.c;
                Mask mask = ((yh10) this.d).z;
                aVar6.b(mask != null ? mask : null);
                return s3q0.a;
            case 18:
                ((izs) this.c).invoke(new pd30.a(((yd30) this.d).b, !((zhf0) obj).equals(zhf0.e)));
                return s3q0.a;
            case 19:
                MsgViewFragment msgViewFragment = (MsgViewFragment) this.c;
                DialogExt dialogExt = (DialogExt) this.d;
                MsgFromUser msgFromUser = (MsgFromUser) obj;
                int i10 = MsgViewFragment.i0;
                msgViewFragment.io(msgFromUser, dialogExt);
                if (msgFromUser.B) {
                    lzv lzvVar = (lzv) msgViewFragment.W.getValue();
                    MsgIdType msgIdType = MsgIdType.CNV_ID;
                    List singletonList = Collections.singletonList(Integer.valueOf(msgFromUser.d));
                    long j3 = msgFromUser.c;
                    Serializer.c<Peer> cVar4 = Peer.CREATOR;
                    io.reactivex.rxjava3.core.x b2 = lzvVar.b(msgViewFragment, new dj30(msgIdType, singletonList, Peer.a.b(j3), Source.NETWORK, false, null, 48));
                    asu0 asu0Var = asu0.a;
                    msgViewFragment.P.b(hg1.i(b2.q(asu0Var.c()).m(asu0Var.d()).l(new v34(new l140(r8), i)), new s53(24, msgViewFragment, dialogExt)));
                }
                return s3q0.a;
            case 20:
                ge60 ge60Var = (ge60) this.c;
                le60 le60Var = (le60) this.d;
                int i11 = ge60.l1;
                ge60Var.getFeature().C(new ee60.d(((le60.b) le60Var).a.b));
                return s3q0.a;
            case 21:
                sg60 sg60Var = (sg60) this.c;
                a9q0 a9q0Var = (a9q0) this.d;
                xg60 xg60Var = (xg60) obj;
                String str = xg60Var.e;
                String str2 = xg60Var.f;
                if (str != null && str.length() != 0) {
                    sg60Var.e(new vf60.b(xg60Var.e));
                }
                if (str2 != null && str2.length() != 0 && epx.f(((xf60) sg60Var.b.getCurrentState()).e, "unknown")) {
                    sg60Var.e(new vf60.a(str2));
                }
                return new uf60(new qr60.a.g(xg60Var.a, xg60Var.b, xg60Var.d, true, false, null, a9q0Var, 32));
            case 22:
                qd90.b.a aVar7 = (qd90.b.a) this.c;
                k8r0 k8r0Var = (k8r0) this.d;
                int i12 = aVar7.y;
                zvx zvxVar = aVar7.x;
                int x4 = (zvxVar != null ? zvxVar : null).x4() * i12;
                int i13 = aVar7.z;
                k8r0Var.d(aVar7.getItem(), aVar7.getItem().l, (x4 + i13) - (i13 - aVar7.getBindingAdapterPosition()));
                return s3q0.a;
            case 23:
                u1a0 u1a0Var = (u1a0) this.c;
                String str3 = (String) this.d;
                u1a0Var.z1 = true;
                r1a0 r1a0Var = u1a0Var.u1;
                if (r1a0Var != null) {
                    r1a0Var.b(str3);
                }
                return s3q0.a;
            case 24:
                ((izs) this.c).invoke(((tba0.b) ((bca0) this.d).m).a);
                return s3q0.a;
            case 25:
                wh50 wh50Var = (wh50) this.c;
                q5b0 q5b0Var = (q5b0) this.d;
                tny tnyVar = (tny) obj;
                wh50Var.setValue(new q9x(tnyVar.a()));
                q5b0.a aVar8 = q5b0Var.b;
                if (aVar8 != null && (a3 = aVar8.a()) != null && (iieVar = a3.c) != null) {
                    iieVar.invoke(jgz.j(tnyVar, true));
                }
                return s3q0.a;
            case 26:
                CatalogExtendedData catalogExtendedData = (CatalogExtendedData) this.c;
                bi20 bi20Var = (bi20) this.d;
                FriendsLikedEpisode friendsLikedEpisode = (FriendsLikedEpisode) obj;
                List<Integer> list5 = friendsLikedEpisode.b;
                ArrayList arrayList8 = new ArrayList(c5g.u(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(new UserId(((Number) it4.next()).intValue()));
                }
                UserId[] userIdArr = (UserId[]) arrayList8.toArray(new UserId[0]);
                UserId[] userIdArr2 = (UserId[]) Arrays.copyOf(userIdArr, userIdArr.length);
                catalogExtendedData.getClass();
                friendsLikedEpisode.c = rli0.A(rli0.t(rl3.D(userIdArr2), new h5(catalogExtendedData, 19)));
                return new UIBlockFriendsLiked(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, friendsLikedEpisode, new UIBlockPodcastSliderItem(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, new PodcastSliderItem(bi20Var.a, PodcastSliderItem.Type.EPISODE, friendsLikedEpisode.d)));
            case 27:
                Post post = (Post) this.c;
                Context context2 = (Context) this.d;
                if (!((Post) obj).pc()) {
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                    jt50.a(SingleEvent.POST);
                }
                iuc0 iuc0Var = iuc0.b;
                iuc0.j0(context2, iuc0.i0(post.m));
                return s3q0.a;
            case 28:
                ((com.vk.attachpicker.stat.data.c) this.c).b.g((hyg0) obj, (ArrayList) this.d);
                return s3q0.a;
            default:
                as80 as80Var = (as80) this.c;
                ctl0 ctl0Var = (ctl0) this.d;
                as80Var.a.d = false;
                ctl0Var.b.e(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, as80Var);
                return s3q0.a;
        }
    }

    public /* synthetic */ mu1(xwb xwbVar, ph90 ph90Var, int i, int[] iArr) {
        this.b = 7;
        this.c = xwbVar;
        this.d = ph90Var;
    }
}
