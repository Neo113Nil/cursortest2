package xsna;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.vk.api.generated.audio.dto.AudioAlbumPartsFirstAudioDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.api.generated.audio.dto.AudioGetPlaylistExtendedResponseDto;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketGetCommunityShopConditionsResponseDto;
import com.vk.api.generated.market.dto.MarketItemOwnerInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemIntegrationInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemTypeDto;
import com.vk.api.generated.market.dto.MarketTextWithTitleDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.channels.impl.post_settings.e;
import com.vk.clips.design.view.interests.NextButton;
import com.vk.content.design.view.photo.flow.PhotoFlowHeaderView;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.StaticMapView;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.IntegrationInfo;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionEmpty;
import com.vk.dto.common.actions.ActionPerformActionWithUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.photo.Photo;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.ecomm.shop_conditions.impl.ui.dovdialog.data.model.ConditionType;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.multiplecoownership.model.MultipleCoownershipModel;
import com.vk.multiplecoownership.model.MultipleCoownershipType;
import com.vk.music.informer.mvi.d;
import com.vk.music.offline.ui.presentation.entity.MusicDownloadsSettingsState;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsFragmentMvi;
import com.vk.newsfeed.impl.posting.settings.mvi.a;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.photos.ui.profile.ProfilePhotoTag;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.aw9;
import xsna.cca0;
import xsna.kb70;
import xsna.kqb0;
import xsna.mot0;
import xsna.nn20;
import xsna.p410;
import xsna.pnb0;
import xsna.pqc0;
import xsna.utl0;
import xsna.wk50;
import xsna.xn50;
import xsna.yb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class es00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ es00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0245  */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Image image;
        MarketItemType marketItemType;
        BaseLinkButtonDto baseLinkButtonDto;
        String title;
        Action actionEmpty;
        ActionPerformActionWithUrl.PerformActionWithUrl performActionWithUrl;
        Map map;
        ArrayList arrayList;
        boolean z;
        Iterator it;
        Object[] objArr;
        boolean z2 = true;
        boolean z3 = false;
        r5 = null;
        String str = null;
        r5 = null;
        r5 = null;
        r5 = null;
        gej0 gej0Var = null;
        switch (this.b) {
            case 0:
                ((com.vk.ecomm.reviews.impl.allreviews.presentation.b) this.c).T((c.m) obj);
                return s3q0.a;
            case 1:
                a410 a410Var = (a410) this.c;
                Pair pair = (Pair) obj;
                n410 n410Var = (n410) pair.d();
                MarketMarketItemFullDto marketMarketItemFullDto = (MarketMarketItemFullDto) pair.g();
                String title2 = marketMarketItemFullDto.getTitle();
                List<BaseImageDto> K0 = marketMarketItemFullDto.K0();
                if (K0 != null) {
                    List<BaseImageDto> list = K0;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                    for (BaseImageDto baseImageDto : list) {
                        arrayList2.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                    }
                    image = new Image(arrayList2);
                } else {
                    image = null;
                }
                int i = n410Var.a;
                boolean z4 = n410Var.b;
                String str2 = n410Var.c;
                String str3 = str2 == null ? "" : str2;
                String str4 = n410Var.d;
                Float f = n410Var.e;
                LinkedHashMap linkedHashMap = n410Var.f;
                String str5 = n410Var.h;
                MarketItemOwnerInfoDto W = marketMarketItemFullDto.W();
                String e = W != null ? W.e() : null;
                String str6 = e == null ? "" : e;
                Map<UserId, big0> map2 = n410Var.g;
                UserId c = a410Var.j.c();
                MarketMarketItemTypeDto G = marketMarketItemFullDto.G();
                if (G != null) {
                    MarketItemType.a aVar = MarketItemType.Companion;
                    Integer valueOf = Integer.valueOf(G.i());
                    aVar.getClass();
                    marketItemType = MarketItemType.a.a(valueOf);
                } else {
                    marketItemType = null;
                }
                MarketMarketItemIntegrationInfoDto D = marketMarketItemFullDto.D();
                return new p410.d(title2, image, i, z4, str3, str4, f, linkedHashMap, str5, str6, map2, c, marketItemType, D != null ? new IntegrationInfo(D.getTitle()) : null, n410Var.i, n410Var.j, n410Var.k, n410Var.l);
            case 2:
                le10 le10Var = (le10) this.c;
                MarketGetCommunityShopConditionsResponseDto marketGetCommunityShopConditionsResponseDto = (MarketGetCommunityShopConditionsResponseDto) obj;
                sdz sdzVar = le10Var.b;
                ListBuilder e2 = e43.e();
                if (le10Var.c) {
                    MarketTextWithTitleDto e3 = marketGetCommunityShopConditionsResponseDto.e().e();
                    if (e3 != null) {
                        ListBuilder e4 = e43.e();
                        e4.add(le10Var.a(e3, ConditionType.PARTNER_INTEGRATION, sdzVar));
                        s3q0 s3q0Var = s3q0.a;
                        e2.add(new iej0(R.string.market_united_shop_condition_integration_title, e4.g()));
                    }
                } else {
                    MarketTextWithTitleDto f2 = marketGetCommunityShopConditionsResponseDto.e().f();
                    if (f2 != null) {
                        ListBuilder e5 = e43.e();
                        e5.add(le10Var.a(f2, ConditionType.PARTNER_INTEGRATION, sdzVar));
                        s3q0 s3q0Var2 = s3q0.a;
                        e2.add(new iej0(R.string.market_united_shop_condition_ozon_title, e5.g()));
                    }
                }
                ListBuilder e6 = e43.e();
                MarketTextWithTitleDto g = marketGetCommunityShopConditionsResponseDto.e().g();
                if (g != null) {
                    e6.add(le10Var.a(g, ConditionType.PAYMENT, sdzVar));
                }
                MarketTextWithTitleDto d = marketGetCommunityShopConditionsResponseDto.e().d();
                if (d != null) {
                    e6.add(le10Var.a(d, ConditionType.DELIVERY, sdzVar));
                }
                MarketTextWithTitleDto i2 = marketGetCommunityShopConditionsResponseDto.e().i();
                if (i2 != null) {
                    e6.add(le10Var.a(i2, ConditionType.REFUND, sdzVar));
                }
                s3q0 s3q0Var3 = s3q0.a;
                e2.add(new iej0(R.string.market_united_shop_condition_market_title, e6.g()));
                ListBuilder g2 = e2.g();
                List<BaseLinkButtonDto> d2 = marketGetCommunityShopConditionsResponseDto.d();
                if (d2 != null && (baseLinkButtonDto = (BaseLinkButtonDto) j5g.a0(d2)) != null && (title = baseLinkButtonDto.getTitle()) != null && title.length() != 0) {
                    BaseLinkButtonActionDto e7 = baseLinkButtonDto.e();
                    if (e7 == null || (actionEmpty = wf6.b(e7)) == null) {
                        actionEmpty = new ActionEmpty();
                    }
                    String title3 = baseLinkButtonDto.getTitle();
                    String str7 = title3 != null ? title3 : "";
                    ActionPerformActionWithUrl actionPerformActionWithUrl = actionEmpty instanceof ActionPerformActionWithUrl ? (ActionPerformActionWithUrl) actionEmpty : null;
                    if (actionPerformActionWithUrl != null && (performActionWithUrl = actionPerformActionWithUrl.d) != null) {
                        str = performActionWithUrl.b;
                    }
                    gej0Var = new gej0(str7, actionEmpty, epx.f(str, "open_shop_conditions_edit_action"));
                }
                return new hej0(g2, gej0Var);
            case 3:
                AdminLevel adminLevel = (AdminLevel) obj;
                lqb0 lqb0Var = ((sf20) this.c).i;
                lqb0Var.b = adminLevel == AdminLevel.ADMIN;
                Iterator it2 = lqb0Var.a.iterator();
                while (it2.hasNext()) {
                    ((kqb0.a) it2.next()).d(lqb0Var);
                }
                return s3q0.a;
            case 4:
                nn20.a aVar2 = (nn20.a) this.c;
                VkGroupHeader vkGroupHeader = (VkGroupHeader) obj;
                VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) vkGroupHeader.getHighlighter();
                vkGroupHeader.setLeft((VkGroupHeader.a) nn20.b.c.get((String) ((zak0) aVar2.c).getValue()));
                vkGroupHeader.setTitle((VkGroupHeader.d) nn20.b.b.get(aVar2.c()));
                vkGroupHeader.setSubtitle((VkGroupHeader.c) nn20.b.a.get(aVar2.b()));
                vkGroupHeader.setSize((VkGroupHeader.Size) nn20.b.g.get(aVar2.a()));
                vkGroupHeader.setRight(new VkGroupHeader.Right((VkGroupHeader.Right.ExtraContent) nn20.b.d.get((String) ((zak0) aVar2.d).getValue()), (VkGroupHeader.Right.b) nn20.b.e.get((String) ((zak0) aVar2.f).getValue()), (VkGroupHeader.Right.a) nn20.b.f.get((String) ((zak0) aVar2.e).getValue())));
                if (((Boolean) ((zak0) aVar2.i).getValue()).booleanValue()) {
                    VkOnboardingHighlighter.e(vkOnboardingHighlighter, true, null, true, null, 8);
                } else {
                    vkOnboardingHighlighter.c(false);
                }
                vkGroupHeader.setShowTopDivider(((Boolean) ((zak0) aVar2.h).getValue()).booleanValue());
                return s3q0.a;
            case 5:
                MusicDownloadsSettingsState musicDownloadsSettingsState = (MusicDownloadsSettingsState) obj;
                boolean P = ((ej40) this.c).c.a.P();
                long j = musicDownloadsSettingsState.c;
                musicDownloadsSettingsState.getClass();
                return new MusicDownloadsSettingsState(P, j);
            case 6:
                com.vk.music.informer.mvi.d dVar = (com.vk.music.informer.mvi.d) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                d.a aVar3 = dVar.l;
                c2u c2uVar = aVar3.a;
                if (booleanValue && !aVar3.b) {
                    c2uVar.invoke(Boolean.TRUE);
                    aVar3.b = true;
                } else if (!booleanValue && aVar3.b) {
                    c2uVar.invoke(Boolean.FALSE);
                    aVar3.b = false;
                }
                return s3q0.a;
            case 7:
                rz40 rz40Var = (rz40) this.c;
                JSONObject jSONObject = new JSONObject(new Gson().toJson((AudioPhotoDto) obj));
                jSONObject.put("owner_id", rz40Var.m.b);
                return new Photo(jSONObject);
            case 8:
                com.vk.music.playlist.display.data.a aVar4 = (com.vk.music.playlist.display.data.a) this.c;
                AudioGetPlaylistExtendedResponseDto audioGetPlaylistExtendedResponseDto = (AudioGetPlaylistExtendedResponseDto) obj;
                jt4 jt4Var = jt4.a;
                AudioPlaylistDto j2 = audioGetPlaylistExtendedResponseDto.j();
                jt4Var.getClass();
                Playlist a = jt4.a(j2);
                try {
                    abo aboVar = aVar4.b;
                    List<AudioAudioRawIdTrackedDto> f3 = audioGetPlaylistExtendedResponseDto.f();
                    if (f3 != null) {
                        List<AudioAudioRawIdTrackedDto> list2 = f3;
                        arrayList = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(a020.p((AudioAudioRawIdTrackedDto) it3.next()));
                        }
                    } else {
                        arrayList = null;
                    }
                    a = aboVar.g(a, arrayList);
                } catch (Throwable th) {
                    bn40.c(th, new Object[0]);
                }
                Playlist playlist = a;
                try {
                    List<AudioAlbumPartsFirstAudioDto> d3 = audioGetPlaylistExtendedResponseDto.d();
                    aVar4.getClass();
                    map = new LinkedHashMap();
                    if (d3 != null) {
                        for (AudioAlbumPartsFirstAudioDto audioAlbumPartsFirstAudioDto : d3) {
                            String d4 = audioAlbumPartsFirstAudioDto.d();
                            if (d4 != null) {
                                map.put(d4, String.valueOf(audioAlbumPartsFirstAudioDto.e()));
                            }
                        }
                    }
                } catch (Throwable th2) {
                    bn40.c(th2, new Object[0]);
                    map = jgp.b;
                }
                Map map3 = map;
                List<AudioArtistDto> e8 = audioGetPlaylistExtendedResponseDto.e();
                if (e8 == null) {
                    e8 = EmptyList.b;
                }
                List<AudioArtistDto> list3 = e8;
                List<GroupsGroupFullDto> i3 = audioGetPlaylistExtendedResponseDto.i();
                GroupsGroupFullDto groupsGroupFullDto = i3 != null ? (GroupsGroupFullDto) j5g.a0(i3) : null;
                List<UsersUserFullDto> k = audioGetPlaylistExtendedResponseDto.k();
                UsersUserFullDto usersUserFullDto = k != null ? (UsersUserFullDto) j5g.a0(k) : null;
                List<AudioAudioRawIdTrackedDto> f4 = audioGetPlaylistExtendedResponseDto.f();
                if (f4 == null) {
                    f4 = EmptyList.b;
                }
                return new iqz(playlist, list3, groupsGroupFullDto, usersUserFullDto, f4, audioGetPlaylistExtendedResponseDto.g(), map3);
            case 9:
                Object[] objArr2 = (Object[]) obj;
                return ((rph0) this.c).invoke(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4]);
            case 10:
                return Boolean.valueOf(epx.f(((utl0.c.b) obj).a, ((ep50) this.c).N));
            case 11:
                NewsfeedData newsfeedData = (NewsfeedData) obj;
                ce60 ce60Var = ((ss60) this.c).b;
                long j3 = newsfeedData.c.f;
                ce60Var.getClass();
                if (!ce60.f(j3)) {
                    return io.reactivex.rxjava3.core.q.T(newsfeedData);
                }
                Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
                NewsfeedData.Info info = newsfeedData.c;
                NewsfeedData.a.a(info.d, info.e);
                return io.reactivex.rxjava3.core.q.H(new RuntimeException("Cache expired"));
            case 12:
                int i4 = NextButton.d;
                ((NextButton.a) this.c).a((View) obj, NextButton.ClickType.SKIP);
                return s3q0.a;
            case 13:
                return ((s470) obj).c(null, (dnz) this.c);
            case 14:
                xb70 xb70Var = (xb70) this.c;
                dc70 dc70Var = (dc70) obj;
                List<o870> list4 = dc70Var.d;
                List<o870> list5 = list4;
                ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
                int i5 = 0;
                for (Object obj2 : list5) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    o870 o870Var = (o870) obj2;
                    yb70.d dVar2 = new yb70.d(o870Var.c, o870Var.b);
                    o870 o870Var2 = list4.get(i5);
                    ec70 ec70Var = (ec70) xb70Var.d.getValue();
                    List<kb70> list6 = o870Var2.d;
                    int i7 = o870Var2.a;
                    ec70Var.getClass();
                    List a2 = ec70.a(i7, list6);
                    s970 s970Var = (s970) xb70Var.e.getValue();
                    boolean z5 = dc70Var.j;
                    s970Var.getClass();
                    List list7 = a2;
                    boolean z6 = z2;
                    if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                        Iterator it4 = list7.iterator();
                        while (it4.hasNext()) {
                            if (((kb70) it4.next()) instanceof kb70.d) {
                                z = z6;
                                ArrayList arrayList4 = new ArrayList(a2);
                                if (!z) {
                                    arrayList4.add(new kb70.b(tq.h(tlo0.Companion, z5 ? R.string.notification_list_empty_tab_description : R.string.notification_list_empty_description)));
                                }
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList5 = new ArrayList();
                                it = arrayList4.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    boolean z7 = z3;
                                    if (hashSet.add(((kb70) next).getKey())) {
                                        arrayList5.add(next);
                                    }
                                    z3 = z7;
                                }
                                arrayList3.add(new yb70.e(dVar2, new yb70.c(arrayList5), dc70Var.k));
                                i5 = i6;
                                z2 = z6;
                            }
                        }
                    }
                    z = z3;
                    ArrayList arrayList42 = new ArrayList(a2);
                    if (!z) {
                    }
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList52 = new ArrayList();
                    it = arrayList42.iterator();
                    while (it.hasNext()) {
                    }
                    arrayList3.add(new yb70.e(dVar2, new yb70.c(arrayList52), dc70Var.k));
                    i5 = i6;
                    z2 = z6;
                }
                return new yb70.f(dc70Var.i, arrayList3, dc70Var.h);
            case 15:
                ((wk50.a) this.c).b(new aw9.d.c((List) obj));
                return s3q0.a;
            case 16:
                rw80 rw80Var = (rw80) this.c;
                T t = (T) obj;
                synchronized (rw80Var.a) {
                    rw80Var.c = t;
                }
                return s3q0.a;
            case 17:
                PhotoFlowHeaderView.a aVar5 = ((PhotoFlowHeaderView) this.c).y;
                if (aVar5 != null) {
                    aVar5.c();
                }
                return s3q0.a;
            case 18:
                ((kca0) this.c).a.getFeature().C(new cca0.e((qba0) obj));
                return s3q0.a;
            case 19:
                VideoAlbum videoAlbum = (VideoAlbum) this.c;
                qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
                mot0.b(mot0.a.a, (Context) obj, videoAlbum.c, videoAlbum.b, null, 24);
                return s3q0.a;
            case 20:
                job0 job0Var = (job0) this.c;
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
                if (vKApiExecutionException.s() == 100) {
                    String message = vKApiExecutionException.getMessage();
                    if (message != null ? drm0.D(message, "end_date should be greater than", false) : false) {
                        objArr = true;
                        if (objArr == true) {
                            z2 = false;
                        } else {
                            job0Var.a.b(new pnb0.c.j(vKApiExecutionException, R.string.poll_limit_error));
                        }
                        return Boolean.valueOf(z2);
                    }
                }
                objArr = false;
                if (objArr == true) {
                }
                return Boolean.valueOf(z2);
            case 21:
                PollResultsFragment pollResultsFragment = (PollResultsFragment) this.c;
                int i8 = PollResultsFragment.b0;
                pollResultsFragment.mo();
                return s3q0.a;
            case 22:
                return new i6l0((ViewGroup) obj, ((lxb0) this.c).i);
            case 23:
                j1c0 j1c0Var = (j1c0) this.c;
                m1c0 m1c0Var = (m1c0) j1c0Var.C;
                if (m1c0Var != null) {
                    Owner owner = m1c0Var.i;
                    Post post = m1c0Var.h;
                    NewsfeedCoowners newsfeedCoowners = post.f0;
                    List list8 = newsfeedCoowners != null ? newsfeedCoowners.g : null;
                    if (list8 == null) {
                        list8 = EmptyList.b;
                    }
                    if (!((t740) j1c0Var.F.getValue()).a(j1c0Var.itemView.getContext(), new MultipleCoownershipModel(list8, MultipleCoownershipType.Reject, post, owner.b))) {
                        ((c1c0) j1c0Var.E.getValue()).E(j1c0Var.itemView.getContext(), post, owner.b, m1c0Var.j.b);
                    }
                }
                return s3q0.a;
            case 24:
                xn50.a.c((com.vk.channels.impl.post_settings.a) this.c, new e.C0542e((pp80) obj));
                return s3q0.a;
            case 25:
                return Boolean.valueOf(epx.f(((PhotoAttachment) obj).l.e, ((Photo) this.c).e));
            case 26:
                PostingAttachLocationFragment postingAttachLocationFragment = (PostingAttachLocationFragment) this.c;
                Location location = (Location) obj;
                postingAttachLocationFragment.E0 = location;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                GeoLocation geoLocation = new GeoLocation(-1, 0, 0, 0, 0, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, context.getString(R.string.current_location), null, null, null, null, null, 8062, null);
                if (location != null) {
                    try {
                        Context context2 = e43.a;
                        if (context2 == null) {
                            context2 = null;
                        }
                        List<Address> fromLocation = new Geocoder(context2).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                        if (fromLocation != null) {
                            Address address = (Address) j5g.Y(fromLocation);
                            if (address != null) {
                                ArrayList arrayList6 = new ArrayList();
                                String thoroughfare = address.getThoroughfare();
                                if (thoroughfare != null && thoroughfare.length() != 0) {
                                    arrayList6.add(address.getThoroughfare());
                                }
                                String subThoroughfare = address.getSubThoroughfare();
                                if (subThoroughfare != null && subThoroughfare.length() != 0) {
                                    arrayList6.add(address.getSubThoroughfare());
                                }
                                String featureName = address.getFeatureName();
                                if (featureName != null && featureName.length() != 0 && !epx.f(address.getFeatureName(), address.getSubThoroughfare())) {
                                    arrayList6.add(address.getFeatureName());
                                }
                                String join = TextUtils.join(", ", arrayList6);
                                int i9 = geoLocation.b;
                                String str8 = geoLocation.i;
                                if (join == null || "null".equals(join)) {
                                    Context context3 = e43.a;
                                    join = (context3 != null ? context3 : null).getString(R.string.loading);
                                }
                                geoLocation = new GeoLocation(i9, 0, 0, 0, 0, location.getLatitude(), location.getLongitude(), str8, null, join, null, null, null, 7454, null);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                postingAttachLocationFragment.H0 = geoLocation;
                postingAttachLocationFragment.F0 = geoLocation.k;
                PostingAttachLocationFragment.c cVar2 = postingAttachLocationFragment.C0;
                if (cVar2 != null) {
                    Location location2 = postingAttachLocationFragment.E0;
                    if (location2 == null) {
                        return s3q0.a;
                    }
                    ((StaticMapView) cVar2.itemView).e(location2.getLatitude(), location2.getLongitude());
                }
                return s3q0.a;
            case 27:
                PostingSettingsFragmentMvi postingSettingsFragmentMvi = (PostingSettingsFragmentMvi) this.c;
                int i10 = PostingSettingsFragmentMvi.Y;
                xn50.a.c(postingSettingsFragmentMvi, new a.i.C1388a(((Date) obj).getTime()));
                return s3q0.a;
            case 28:
                ((oqc0) this.c).T(pqc0.b.b);
                return s3q0.a;
            default:
                kyd0 kyd0Var = (kyd0) this.c;
                wea0 wea0Var = (wea0) obj;
                BasePhotoListFragment basePhotoListFragment = kyd0Var.c;
                ((gyd0) basePhotoListFragment).P(wea0Var.a);
                kyd0Var.l.getClass();
                ArrayList<ProfilePhotoTag> b = dzd0.b(wea0Var);
                kyd0Var.m = b;
                gyd0 gyd0Var = (gyd0) basePhotoListFragment;
                gyd0Var.sh(b);
                gyd0Var.q();
                com.vk.lists.c cVar3 = kyd0Var.d;
                (cVar3 != null ? cVar3 : null).p(true);
                return s3q0.a;
        }
    }

    public /* synthetic */ es00(dt dtVar, dnz dnzVar) {
        this.b = 13;
        this.c = dnzVar;
    }
}
