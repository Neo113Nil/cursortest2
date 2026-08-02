package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.audio.dto.AudioRadioStationDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.docs.dto.DocsDocDto;
import com.vk.api.generated.docs.dto.DocsDocTypesDto;
import com.vk.api.generated.docs.dto.DocsGetResponseDto;
import com.vk.api.generated.docs.dto.DocsGetTypesResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.catalog2.common.dto.ui.actions.UIBlockPlayMixAction;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsViewState;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.ExternalAudio;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.search.SearchItem;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.StoryUploadType;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import com.vk.im.engine.models.messages.MsgTemplate;
import com.vk.log.L;
import com.vk.media.entities.StoryEditorParams;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import com.vk.notifications.list.impl.presentation.model.common.ListNextState;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.pushes.receivers.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stickers.ContextUser;
import com.vk.stories.design.view.ReactionView;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.api.media.StoryMediaData;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.auth.js.bridge.api.events.GetSilentToken$Response;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.browser.internal.ui.changephone.VkChangePhoneResult;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.BaseItem;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import com.vkontakte.android.api.DocsGetTypesResult;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.awg0;
import xsna.c0e;
import xsna.c7g0;
import xsna.c99;
import xsna.dis0;
import xsna.dou;
import xsna.dra0;
import xsna.dra0.b;
import xsna.f0r;
import xsna.fh8;
import xsna.gh8;
import xsna.gm50;
import xsna.je4;
import xsna.k840;
import xsna.n040;
import xsna.orx;
import xsna.p4v0;
import xsna.p8c0;
import xsna.s9t0;
import xsna.tra0;
import xsna.uyh0;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yl0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v89, types: [xsna.m8c0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        BaseItem baseItem;
        BaseItem baseItem2;
        VkPaginationList vkPaginationList;
        List<GroupsGroupFullDto> d;
        GroupsGroupFullDto groupsGroupFullDto;
        Thumb thumb;
        Collection collection;
        UserId e;
        Integer num;
        StoryBottomViewGroup storyBottomViewGroup;
        ebm0 ebm0Var;
        int i = 2;
        boolean z = false;
        BaseBoolIntDto baseBoolIntDto = null;
        baseBoolIntDto = null;
        baseBoolIntDto = null;
        int i2 = 1;
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.c;
                AddLinkPresenter addLinkPresenter = (AddLinkPresenter) this.d;
                VKList<SearchItem> vKList = (VKList) obj;
                if (vKList.size() == 0) {
                    vKList.l(false);
                    cVar.r(false);
                } else {
                    cVar.l(vKList.i());
                    cVar.r(true);
                }
                VKList vKList2 = new VKList();
                ArrayList arrayList = new ArrayList(c5g.u(vKList, 10));
                for (SearchItem searchItem : vKList) {
                    int i3 = w20.$EnumSwitchMapping$0[searchItem.b.ordinal()];
                    if (i3 == 1) {
                        UserProfile userProfile = searchItem.c;
                        com.vkontakte.android.actionlinks.h hVar = new com.vkontakte.android.actionlinks.h(BaseItem.Type.USER);
                        hVar.e = userProfile;
                        baseItem = hVar;
                    } else if (i3 != 2) {
                        baseItem2 = new com.vkontakte.android.actionlinks.d(BaseItem.Type.EMPTY);
                        arrayList.add(baseItem2);
                    } else {
                        Group group = searchItem.d;
                        com.vkontakte.android.actionlinks.e eVar = new com.vkontakte.android.actionlinks.e(BaseItem.Type.GROUP);
                        eVar.e = group;
                        baseItem = eVar;
                    }
                    baseItem2 = baseItem;
                    arrayList.add(baseItem2);
                }
                vKList2.addAll(arrayList);
                addLinkPresenter.m.n0(vKList2);
                if (addLinkPresenter.m.E0() >= vKList.i()) {
                    cVar.r(false);
                }
                Iterator<T> it = vKList2.iterator();
                while (it.hasNext()) {
                    BaseItem baseItem3 = (BaseItem) it.next();
                    baseItem3.b = new com.vk.movika.sdk.base.ui.r0(i, addLinkPresenter, baseItem3);
                }
                return s3q0.a;
            case 1:
                je4.a aVar = (je4.a) ((je4) this.c);
                return awg0.a.a((awg0) obj, k840.a.d().D(aVar.b, aVar.c), null, new re4((el50) this.d, z ? 1 : 0), 1);
            case 2:
                String str = (String) this.c;
                c0e.a aVar2 = new c0e.a(WebStickerType.LOTTIE, null, null, null, null, (AnimatedStickerInfo) obj, (String) this.d, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                if (str != null) {
                    c0e.a.a(aVar2, str);
                }
                return aVar2;
            case 3:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) this.c;
                ClipsEntryPointsFragment.b bVar = (ClipsEntryPointsFragment.b) this.d;
                int i4 = ClipsEntryPointsFragment.i0;
                gm50.a.a(clipsEntryPointsFragment, ((ClipsEntryPointsViewState.a) obj).a, new ij8(i2, clipsEntryPointsFragment, bVar));
                return s3q0.a;
            case 4:
                k9f k9fVar = (k9f) this.c;
                gzs gzsVar = (gzs) this.d;
                enj.q(R.string.vk_error, 0, k9fVar.a);
                gzsVar.invoke();
                return s3q0.a;
            case 5:
                ContextUser contextUser = (ContextUser) this.c;
                izs izsVar = (izs) this.d;
                Collection<Integer> collection2 = (Collection) obj;
                if (contextUser != null) {
                    contextUser.e = collection2;
                }
                izsVar.invoke(collection2);
                return s3q0.a;
            case 6:
                ((hv10) obj).f((ur4) this.c, (Uri) this.d);
                return s3q0.a;
            case 7:
                com.vk.music.playlist.display.domain.b bVar2 = (com.vk.music.playlist.display.domain.b) this.c;
                Playlist playlist = (Playlist) this.d;
                if (((Playlist) obj) != null) {
                    bVar2.k.G(playlist, true);
                }
                return s3q0.a;
            case 8:
                DocsGetTypesResponseDto docsGetTypesResponseDto = (DocsGetTypesResponseDto) this.c;
                Optional optional = (Optional) this.d;
                DocsGetResponseDto docsGetResponseDto = (DocsGetResponseDto) ((Optional) obj).orElse(null);
                GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto = (GroupsGetByIdObjectResponseDto) optional.orElse(null);
                ArrayList a = e43.a(new DocsGetTypesResult.DocType(DocsGetTypesResult.DocType.Type.ALL, 0));
                for (DocsDocTypesDto docsDocTypesDto : docsGetTypesResponseDto.d()) {
                    DocsGetTypesResult.DocType.Type.a aVar3 = DocsGetTypesResult.DocType.Type.Companion;
                    int id = docsDocTypesDto.getId();
                    aVar3.getClass();
                    a.add(new DocsGetTypesResult.DocType(DocsGetTypesResult.DocType.Type.a.a(id), docsDocTypesDto.getCount()));
                }
                if (docsGetResponseDto != null) {
                    List<DocsDocDto> d2 = docsGetResponseDto.d();
                    ArrayList arrayList2 = new ArrayList(c5g.u(d2, 10));
                    Iterator<T> it2 = d2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(ao8.k((DocsDocDto) it2.next()));
                    }
                    vkPaginationList = new VkPaginationList(arrayList2, docsGetResponseDto.getCount(), docsGetResponseDto.d().size() < docsGetResponseDto.getCount(), 0, 8, null);
                } else {
                    vkPaginationList = new VkPaginationList(null, 0, false, 0, 15, null);
                }
                if (groupsGetByIdObjectResponseDto != null && (d = groupsGetByIdObjectResponseDto.d()) != null && (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d)) != null) {
                    baseBoolIntDto = groupsGroupFullDto.B();
                }
                return new DocsGetTypesResult(vkPaginationList, a, baseBoolIntDto == BaseBoolIntDto.YES);
            case 9:
                ((f0r.n) this.c).h((wk50.a) this.d, (Throwable) obj);
                return s3q0.a;
            case 10:
                ((q7u) this.c).n.b((Context) this.d, (String) obj);
                return s3q0.a;
            case 11:
                izs izsVar2 = (izs) this.c;
                nvy nvyVar = (nvy) obj;
                ListNextState listNextState = (ListNextState) ((mtk0) this.d).getValue();
                int i5 = listNextState == null ? -1 : dou.a.$EnumSwitchMapping$0[listNextState.ordinal()];
                if (i5 == 1) {
                    nvy.g(nvyVar, "next_loader", null, ogi.a, 2);
                } else if (i5 == 2) {
                    nvy.g(nvyVar, null, null, new jai(-1824921792, new etp(izsVar2, 2), true), 3);
                }
                return s3q0.a;
            case 12:
                return uyh0.a((uyh0) obj, false, false, ((orx.d.g) this.c).b, (uyh0.a) this.d, 3);
            case 13:
                l2y l2yVar = (l2y) this.c;
                String str2 = (String) this.d;
                com.vk.superapp.base.js.bridge.b bVar3 = l2yVar.L0().a;
                JsMethod jsMethod = new JsMethod("VKWebAppGetSilentToken");
                List<qbu0> list = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                for (qbu0 qbu0Var : list) {
                    arrayList3.add(new GetSilentToken$Response.Data.Tokens(qbu0Var.a, qbu0Var.b, qbu0Var.d, qbu0Var.e, qbu0Var.c, qbu0Var.g, qbu0Var.h, qbu0Var.i, qbu0Var.f));
                }
                com.vk.superapp.base.js.bridge.b.p(bVar3, jsMethod, new GetSilentToken$Response(null, new GetSilentToken$Response.Data(arrayList3, str2), str2, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 14:
                n040 n040Var = (n040) this.c;
                ArrayList<MsgTemplate> arrayList4 = (ArrayList) this.d;
                tgl0 tgl0Var = n040Var.c;
                e0w b = tgl0Var.b();
                StringBuilder sb = new StringBuilder("SELECT ");
                sb.append(n040.a.ID);
                sb.append(" FROM ");
                sgl0 sgl0Var = n040Var.b;
                sb.append(sgl0Var.a);
                Cursor d3 = b.d(sb.toString(), null);
                ArrayList arrayList5 = new ArrayList(d3.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d3.moveToFirst()) {
                            while (!d3.isAfterLast()) {
                                arrayList5.add(Integer.valueOf(fl3.A(d3, ChannelsDb.Column.ID.getKey())));
                                d3.moveToNext();
                            }
                        }
                        Trace.endSection();
                        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList4, 10));
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(Integer.valueOf(((MsgTemplate) it3.next()).b));
                        }
                        Iterator it4 = j5g.t0(arrayList5, j5g.S0(arrayList6)).iterator();
                        while (it4.hasNext()) {
                            n040Var.P(((Number) it4.next()).intValue());
                        }
                        SQLiteStatement g = tgl0Var.b().g(sgl0Var.e());
                        for (MsgTemplate msgTemplate : arrayList4) {
                            g.clearBindings();
                            g.bindLong(n040.a.ID.h(), msgTemplate.b);
                            g.bindString(n040.a.NAME.h(), msgTemplate.c);
                            g.bindString(n040.a.TEXT.h(), msgTemplate.d);
                            g.executeInsert();
                        }
                        return s3q0.a;
                    } finally {
                        d3.close();
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 15:
                c.a aVar4 = com.vk.pushes.receivers.c.b;
                c.a.e((Context) this.c, (Intent) this.d, (Throwable) obj);
                return s3q0.a;
            case 16:
                ArrayList<gza0> arrayList7 = (ArrayList) this.c;
                com.vk.music.player.playback.a aVar5 = (com.vk.music.player.playback.a) this.d;
                List list2 = (List) obj;
                int e2 = on00.e(c5g.u(arrayList7, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(e2 >= 16 ? e2 : 16);
                for (gza0 gza0Var : arrayList7) {
                    Pair pair = new Pair(gza0Var.a, gza0Var.e);
                    linkedHashMap.put(pair.i(), pair.j());
                }
                List<AudioRadioStationDto> list3 = list2;
                ArrayList arrayList8 = new ArrayList(c5g.u(list3, 10));
                for (AudioRadioStationDto audioRadioStationDto : list3) {
                    tt4 tt4Var = aVar5.d;
                    UserId c = aVar5.b.c();
                    tt4Var.getClass();
                    int id2 = audioRadioStationDto.getId();
                    if (!epx.f(audioRadioStationDto.j(), Boolean.TRUE)) {
                        c = UserId.d;
                    }
                    UserId userId = c;
                    String f = audioRadioStationDto.f();
                    String g2 = audioRadioStationDto.g();
                    UserId userId2 = UserId.d;
                    String e3 = audioRadioStationDto.e();
                    if (e3 == null || drm0.N(e3)) {
                        thumb = null;
                    } else {
                        Uri parse = Uri.parse(e3);
                        u4q0 u4q0Var = zik0.a;
                        SparseArray sparseArray = new SparseArray(1);
                        sparseArray.put(72, parse);
                        thumb = new Thumb((SparseArray<Uri>) sparseArray);
                    }
                    MusicTrack musicTrack = new MusicTrack(id2, userId, f, null, 0, 0, null, g2, null, 0, false, false, 0, null, false, new AlbumLink(0, userId2, null, null, thumb, null, 32, null), null, false, null, null, null, null, null, audioRadioStationDto.r(), 0L, 0, false, 0L, null, false, false, false, new ExternalAudio(null, null, null, 2, 6, null), null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -8421512, 1048574, null);
                    Object obj2 = linkedHashMap.get(String.valueOf(musicTrack.b));
                    if (obj2 == null) {
                        bn40.h("audio.radioGetById returned an unknown radio!");
                        Object obj3 = PlaybackLaunchMeta.g;
                        obj2 = PlaybackLaunchMeta.a.a();
                    }
                    arrayList8.add(new xd50(musicTrack, (PlaybackLaunchMeta) obj2));
                }
                return arrayList8;
            case 17:
                Context context = (Context) this.c;
                yp80 yp80Var = (yp80) this.d;
                Pair pair2 = (Pair) obj;
                jbh jbhVar = (jbh) pair2.d();
                Boolean bool = (Boolean) pair2.g();
                CommunityNotificationSettingsFragment.a aVar6 = new CommunityNotificationSettingsFragment.a(jbhVar.a, jbhVar.b);
                aVar6.j.putBoolean("from_url", true);
                if (bool.booleanValue()) {
                    aVar6.y();
                }
                aVar6.k(context);
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return s3q0.a;
            case 18:
                dra0 dra0Var = (dra0) this.c;
                PlacePickerState placePickerState = (PlacePickerState) this.d;
                return io.reactivex.rxjava3.core.x.x(dra0Var.new b().b(dra0Var.b.b(placePickerState.e, ((dra0.c) obj).a, dra0Var.d, placePickerState.d))).l(new ie40(new hxl(dra0Var, 27), 7));
            case 19:
                UIBlockPlayMixAction uIBlockPlayMixAction = (UIBlockPlayMixAction) this.c;
                ava0 ava0Var = (ava0) this.d;
                String str3 = uIBlockPlayMixAction.B;
                ava0Var.b(str3 != null ? p4v0.a.a(str3, uIBlockPlayMixAction.C.a) : null, uIBlockPlayMixAction);
                return s3q0.a;
            case 20:
                final p8c0 p8c0Var = (p8c0) this.c;
                final c7g0 c7g0Var = (c7g0) this.d;
                p8c0.c cVar2 = (p8c0.c) obj;
                bpn0 bpn0Var = p8c0Var.c;
                p7c0 p7c0Var = cVar2.a;
                nov novVar = p7c0Var instanceof nov ? (nov) p7c0Var : null;
                if (novVar == null || (collection = aal0.a(novVar)) == null) {
                    collection = EmptyList.b;
                }
                ArrayList arrayList9 = new ArrayList(collection);
                cVar2.a.i();
                StoryUploadParams storyUploadParams = new StoryUploadParams();
                storyUploadParams.f = StoryUploadParams.CameraType.REPOST;
                storyUploadParams.j = new ClickableStickers(1080, 1920, arrayList9);
                String privacy = c7g0Var.getPrivacy();
                if (privacy != null) {
                    storyUploadParams.C = privacy;
                }
                if (c7g0Var instanceof c7g0.a) {
                    long j = ((c7g0.a) c7g0Var).a.a;
                    gzs<s3q0> gzsVar2 = fkq0.a;
                    e = fkq0.a(new UserId(j));
                } else {
                    if (!(c7g0Var instanceof c7g0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u7c0 u7c0Var = ((c7g0.b) c7g0Var).a;
                    e = fkq0.b(u7c0Var.b) ? fkq0.e(u7c0Var.b) : null;
                }
                Serializer.c<StoryMediaData> cVar3 = StoryMediaData.CREATOR;
                List singletonList = Collections.singletonList(new StoryMediaData(cVar2.b, null, storyUploadParams, null));
                StoryEditorParams storyEditorParams = new StoryEditorParams(1080, 1920);
                CommonUploadParams commonUploadParams = new CommonUploadParams(p8c0Var.d.c(), true, null, null, null, null, null, null, null, StoryUploadType.PUBLISH_NOW, null, false, null, false, null, null, 65020, null);
                if (e != null) {
                    commonUploadParams.e = e;
                }
                commonUploadParams.o = false;
                commonUploadParams.h = "REPOST_AUTO_TO_STORY_ACTIVITY".toLowerCase(Locale.ROOT);
                String ref = c7g0Var.getRef();
                if (ref != null) {
                    commonUploadParams.j = ref;
                }
                StoryMultiData storyMultiData = new StoryMultiData(singletonList, storyEditorParams, commonUploadParams, 0, null, 24, null);
                p8c0Var.f = new bd70() { // from class: xsna.m8c0
                    @Override // xsna.bd70
                    public final void x0(int i6, int i7, Object obj4) {
                        c7g0 c7g0Var2 = c7g0Var;
                        zjm0 zjm0Var = (zjm0) obj4;
                        if (zjm0Var != null) {
                            int i8 = zjm0Var.b;
                            p8c0 p8c0Var2 = p8c0.this;
                            if (i8 == p8c0Var2.e) {
                                p8c0Var2.a();
                                if (i6 == 102) {
                                    try {
                                        c7g0Var2.c().invoke(zjm0Var);
                                    } catch (Throwable th2) {
                                        StringBuilder a2 = odj.a(i6, i7, "Failed to handle story upload event ", "::", "::");
                                        a2.append(zjm0Var.g);
                                        L.j(th2, a2.toString());
                                    }
                                }
                            }
                        }
                    }
                };
                ((p870) bpn0Var.getValue()).b(102, p8c0Var.f);
                ((p870) bpn0Var.getValue()).b(104, p8c0Var.f);
                ((p870) bpn0Var.getValue()).b(109, p8c0Var.f);
                p8c0Var.e = ((uvl0) p8c0Var.b.getValue()).b(storyMultiData);
                return s3q0.a;
            case 21:
                Object obj4 = this.c;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.d;
                Map map = (Map) obj;
                synchronized (obj4) {
                    linkedHashMap2.putAll(map);
                    obj4.notify();
                }
                return s3q0.a;
            case 22:
                ReactionView reactionView = (ReactionView) this.c;
                e2f0 e2f0Var = (e2f0) this.d;
                y0f0 reactionItem = reactionView.getReactionItem();
                StoryEntry storyEntry = e2f0Var.f;
                if (reactionItem != null) {
                    int i6 = reactionItem.a;
                    if (storyEntry != null) {
                        reactionView.c();
                        reactionView.performHapticFeedback(16);
                        if (!e2f0Var.a.getStoriesContainer().Rb() && (((num = storyEntry.g0) == null || num.intValue() != i6) && (storyBottomViewGroup = e2f0Var.b.a.G) != null && (ebm0Var = storyBottomViewGroup.B.m) != null)) {
                            StoryEntry storyEntry2 = ebm0Var.e;
                            nzl0 nzl0Var = ebm0Var.b;
                            MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_LIKE;
                            String str4 = i6 == 0 ? "like" : reactionItem.e;
                            ebm0Var.h.g(reactionItem, false, false);
                            ebm0Var.i.b(nzl0Var.i(storyEntry2, true, Integer.valueOf(i6)).subscribe());
                            ((anm0) ebm0Var.g.getValue()).q(eventType, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, ebm0Var.f, storyEntry2, nzl0Var.p(), new dnh0(5, str4, ebm0Var));
                        }
                    }
                }
                return s3q0.a;
            case 23:
                p7j0 p7j0Var = (p7j0) this.c;
                m99 m99Var = (m99) this.d;
                p7j0Var.getClass();
                m99Var.b(c99.k0.a);
                m99Var.b(c99.h0.a);
                return s3q0.a;
            case 24:
                clj0 clj0Var = (clj0) this.c;
                gh8.d.a aVar7 = (gh8.d.a) this.d;
                clj0Var.e.invoke(new fh8.h.a(aVar7.a, aVar7.b, (Throwable) obj));
                return s3q0.a;
            case 25:
                izs izsVar3 = (izs) this.c;
                gzs gzsVar3 = (gzs) this.d;
                VkChangePhoneResult vkChangePhoneResult = (VkChangePhoneResult) obj;
                if (vkChangePhoneResult instanceof VkChangePhoneResult.Success) {
                    izsVar3.invoke(((VkChangePhoneResult.Success) vkChangePhoneResult).b);
                } else {
                    if (!(vkChangePhoneResult instanceof VkChangePhoneResult.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gzsVar3.invoke();
                }
                return s3q0.a;
            case 26:
                mol0 mol0Var = (mol0) this.c;
                wyh0 wyh0Var = (wyh0) this.d;
                mol0 mol0Var2 = (mol0) obj;
                wyh0 wyh0Var2 = mol0Var.f;
                return mol0.a(mol0Var2, null, null, null, wyh0Var == null ? wyh0Var2 : new wyh0(wyh0Var.b, wyh0Var.c, pn00.n(wyh0Var2.a, wyh0Var.a)), null, LoadingState.None, 175);
            case 27:
                ArrayList arrayList10 = (ArrayList) this.c;
                tra0 tra0Var = (tra0) this.d;
                tra0.a aVar8 = (tra0.a) obj;
                aVar8.q((tra0) arrayList10.get(0), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                aVar8.q((tra0) arrayList10.get(1), ((tra0) arrayList10.get(0)).b, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                aVar8.q(tra0Var, ((tra0) arrayList10.get(0)).b - (tra0Var.b / 2), 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            default:
                dis0 dis0Var = (dis0) this.c;
                s9t0.d dVar = (s9t0.d) this.d;
                Activity h = e3m.h(dis0Var.getContext());
                if (h == null) {
                    c63 c63Var = c63.a;
                    h = c63.b();
                    if (h == null) {
                        return s3q0.a;
                    }
                }
                Object obj5 = dis0.t;
                VideoFile videoFile = dis0Var.h;
                dis0Var.i = dis0.a.a(videoFile != null ? videoFile : null, h, true, dis0Var.j, dVar.c, true);
                return s3q0.a;
        }
    }

    public /* synthetic */ yl0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj2;
        this.d = obj3;
    }
}
