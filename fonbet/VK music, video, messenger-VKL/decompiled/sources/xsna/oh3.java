package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.music.MusicSignalInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackVerticalListItemVh;
import com.vk.catalog2.common.ui.mvp.holder.video.ChildProfileVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicSignal;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh;
import com.vk.catalog2.feature.music.holders.curator.CuratorInfoVhOld;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListState;
import com.vk.clips.playlists.ClipsPlaylistsSmallFoldersLaunchParams;
import com.vk.clips.tool.view.newsfeed.mytarget.ClipEndOverlayAdWrapperView;
import com.vk.debug.internal.ApiResponseMocks;
import com.vk.debug.ui.dev.DebugMockApiResponsesFragment;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.folders.impl.configure.d;
import com.vk.folders.impl.configure.i;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.community.creationonboarding.impl.tasks.presentation.feature.SnackBar;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.story.api.LoadContext;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.api.dto.widgets.actions.WebActionSubscribe;
import com.vk.superapp.api.dto.widgets.actions.WebSubscribeExtra;
import com.vk.update.core.RuntimePermissionsNeededException;
import com.vk.update.core.a;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.cck;
import xsna.drz;
import xsna.e8v0;
import xsna.efc0;
import xsna.f4k0;
import xsna.fmc0;
import xsna.h7u0;
import xsna.i1s;
import xsna.kyh;
import xsna.mk50;
import xsna.nue;
import xsna.o2j;
import xsna.tba0;
import xsna.v1j;
import xsna.wk50;
import xsna.zi3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class oh3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oh3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x075b, code lost:
    
        if (r9.equals("offline_music_replacement_default") != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0795, code lost:
    
        if (((java.lang.Boolean) r10.k.getValue()).booleanValue() == false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:?, code lost:
    
        return xsna.j5g.D0(new xsna.sr4(1), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0787, code lost:
    
        if (r9.equals("offline_music_replacement_date_new") != false) goto L235;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        ApiResponseMocks.Mock.Type type;
        io.reactivex.rxjava3.disposables.c cVar;
        MusicTrack musicTrack;
        Object obj3;
        Object obj4;
        WebSubscribeExtra webSubscribeExtra;
        int i = this.b;
        int i2 = 2;
        int i3 = 10;
        int i4 = 1;
        int i5 = 0;
        VideoAuthorDo videoAuthorDo = null;
        Object obj5 = null;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                ((rh3) obj7).o.b(new zi3.g(new j7k0(hq.b(tlo0.Companion, R.plurals.photo_archive_unarchive_error, ((Set) obj6).size()), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), null, null, null, 32)));
                kwg0.b().accept((Throwable) obj);
                return s3q0.a;
            case 1:
                UserId userId = (UserId) obj7;
                gce0 gce0Var = (gce0) obj6;
                PublishState publishState = (PublishState) obj;
                if (epx.f(publishState.h, userId)) {
                    return publishState;
                }
                List<VideoAuthorDo> list = publishState.i;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((VideoAuthorDo) next).b.equals(userId)) {
                                obj5 = next;
                            }
                        }
                    }
                    videoAuthorDo = (VideoAuthorDo) obj5;
                }
                ArrayList b = rxw.b(gce0Var, userId);
                return PublishState.a(publishState, null, null, null, null, false, null, userId, null, null, videoAuthorDo, false, false, null, null, publishState.q, null, publishState.s, null, publishState.u, null, publishState.w, null, false, false, false, b, b, publishState.D, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -236274241, 2047);
            case 2:
                bn40.c((Throwable) obj, new Object[0]);
                ((dlb) obj7).invoke(null);
                ((com.vk.music.player.a) obj6).b();
                return s3q0.a;
            case 3:
                lgb lgbVar = (lgb) obj6;
                k26 k26Var = ((e26) obj7).l;
                String str = (k26Var != null ? k26Var : null).c;
                if (!drm0.N(str)) {
                    lgbVar.N(str);
                }
                return s3q0.a;
            case 4:
                z9a z9aVar = (z9a) obj7;
                String str2 = (String) obj6;
                List list2 = (List) obj;
                switch (str2.hashCode()) {
                    case -1581161142:
                        if (str2.equals("offline_music_replacement_artist")) {
                            return j5g.D0(new caa(0), list2);
                        }
                        throw new IllegalArgumentException("Unknown replacement = ".concat(str2));
                    case -1529764530:
                        int i6 = 1;
                        if (str2.equals("offline_music_replacement_name")) {
                            return j5g.D0(new xx8(i6), list2);
                        }
                        throw new IllegalArgumentException("Unknown replacement = ".concat(str2));
                    case -350924078:
                        break;
                    case -350922919:
                        if (str2.equals("offline_music_replacement_date_old")) {
                            return j5g.D0(new daa(i5), list2);
                        }
                        throw new IllegalArgumentException("Unknown replacement = ".concat(str2));
                    case -185433675:
                        if (str2.equals("offline_music_replacement_old_first")) {
                            return j5g.y0(list2);
                        }
                        throw new IllegalArgumentException("Unknown replacement = ".concat(str2));
                    case 505811102:
                        break;
                    case 1989951086:
                        if (str2.equals("offline_music_replacement_new_first")) {
                            return list2;
                        }
                        throw new IllegalArgumentException("Unknown replacement = ".concat(str2));
                    default:
                        throw new IllegalArgumentException("Unknown replacement = ".concat(str2));
                }
            case 5:
                ChannelFragment channelFragment = (ChannelFragment) obj7;
                int i7 = ChannelFragment.a1;
                StoryViewerRouter.d((StoryViewerRouter) channelFragment.a0.getValue(), channelFragment.requireContext(), null, ((StoryEntry) obj6).Gb(), MobileOfficialAppsConStoriesStat$ViewEntryPoint.REPOST_AUTO_TO_STORY_ACTIVITY, LoadContext.Owner.b, "story_view", null, null, null, 3906);
                ((ikv0) obj).a();
                return s3q0.a;
            case 6:
                ChildProfileVh childProfileVh = (ChildProfileVh) obj7;
                UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) ((UIBlock) obj6);
                Context context = ((View) obj).getContext();
                ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder.G;
                UIBlockAction uIBlockAction = (UIBlockAction) j5g.a0(arrayList);
                CatalogViewType catalogViewType = uIBlockAction != null ? uIBlockAction.d : null;
                int i8 = catalogViewType != null ? ChildProfileVh.a.$EnumSwitchMapping$0[catalogViewType.ordinal()] : -1;
                if (i8 != 1 && i8 != 2 && i8 == 3) {
                    Iterator<T> it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((UIBlockAction) obj2).d == CatalogViewType.SYNTHETIC_ACTION_OPEN_URL) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    UIBlockActionOpenUrl uIBlockActionOpenUrl = obj2 instanceof UIBlockActionOpenUrl ? (UIBlockActionOpenUrl) obj2 : null;
                    childProfileVh.d.a(new cfp0(uIBlockPlaceholder, null));
                    com.vk.catalog2.common.ui.mvp.util.a.e(childProfileVh.b, context, uIBlockPlaceholder, uIBlockActionOpenUrl, childProfileVh.c, 48);
                }
                return s3q0.a;
            case 7:
                UserId userId2 = (UserId) obj7;
                ClipCoauthorListItem clipCoauthorListItem = (ClipCoauthorListItem) obj6;
                ClipCoauthorListState clipCoauthorListState = (ClipCoauthorListState) obj;
                List<ClipCoauthorListItem> list3 = clipCoauthorListState.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                for (ClipCoauthorListItem clipCoauthorListItem2 : list3) {
                    if (clipCoauthorListItem2.b.b.equals(userId2) && (clipCoauthorListItem2.d instanceof ClipCoauthorListItem.SubscribeState.Visible)) {
                        clipCoauthorListItem2 = ClipCoauthorListItem.a(clipCoauthorListItem2, clipCoauthorListItem.b, clipCoauthorListItem.d, 58);
                    }
                    arrayList2.add(clipCoauthorListItem2);
                }
                return ClipCoauthorListState.a(clipCoauthorListState, arrayList2);
            case 8:
                ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView = (ClipEndOverlayAdWrapperView) obj7;
                clipEndOverlayAdWrapperView.c.c.clear();
                ((zu50) obj6).e(clipEndOverlayAdWrapperView.getContext());
                return s3q0.a;
            case 9:
                efc0.a aVar = ((lme) obj7).a;
                PostingStepScreen postingStepScreen = (PostingStepScreen) obj6;
                if (((Boolean) obj).booleanValue()) {
                    aVar.d(PostingAction.Navigation.OpenClipsPublication.b);
                } else {
                    aVar.e(fmc0.e.a);
                    aVar.d(new PostingAction.Navigation.RedirectFailed(postingStepScreen));
                }
                return s3q0.a;
            case 10:
                ClipsPlaylistsSmallFoldersLaunchParams clipsPlaylistsSmallFoldersLaunchParams = ((nue.f) obj6).b;
                ((uue) obj7).C(new nue.b((ShortVideoGetPlaylistsResponseDto) obj, clipsPlaylistsSmallFoldersLaunchParams.c, clipsPlaylistsSmallFoldersLaunchParams.b));
                return s3q0.a;
            case 11:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d((wk50.a) obj6, false);
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a) obj7).c.b(kyh.a.e.a);
                return s3q0.a;
            case 12:
                v1j.m mVar = (v1j.m) obj7;
                L.g("Error on remove session room " + mVar.b, (Throwable) obj);
                ((a2j) obj6).T(new o2j.k(mVar.c));
                return s3q0.a;
            case 13:
                return xck.a((xck) ((wck) obj7).b.getCurrentState(), null, ((cck.e) ((cck) obj6)).b, SnackBar.POST_CREATED, 63);
            case 14:
                CuratorInfoVhOld curatorInfoVhOld = (CuratorInfoVhOld) obj7;
                Curator curator = (Curator) obj6;
                curatorInfoVhOld.n = null;
                ImageView imageView = curatorInfoVhOld.h;
                if (imageView == null) {
                    imageView = null;
                }
                bwt0.p0(imageView, curator.h);
                ImageView imageView2 = curatorInfoVhOld.h;
                (imageView2 != null ? imageView2 : null).setImageDrawable(curatorInfoVhOld.o);
                return s3q0.a;
            case 15:
                DebugMockApiResponsesFragment debugMockApiResponsesFragment = (DebugMockApiResponsesFragment) obj7;
                Context context2 = (Context) obj6;
                List list4 = (List) obj;
                int i9 = DebugMockApiResponsesFragment.O;
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.FEED_MOCK_API.h(), null, "save", Integer.valueOf(list4.size()), String.valueOf(((b25) debugMockApiResponsesFragment.N.getValue()).c().b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -30, 3, null);
                l5mVar.q();
                ApiResponseMocks apiResponseMocks = ApiResponseMocks.a;
                List<uu20> list5 = list4;
                ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
                for (uu20 uu20Var : list5) {
                    String obj8 = drm0.p0(uu20Var.a).toString();
                    int i10 = e6l.$EnumSwitchMapping$1[uu20Var.b.ordinal()];
                    if (i10 == i4) {
                        type = ApiResponseMocks.Mock.Type.TEXT;
                    } else {
                        if (i10 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        type = ApiResponseMocks.Mock.Type.FILE;
                    }
                    String str3 = uu20Var.c;
                    List<rh90> list6 = uu20Var.e;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj9 : list6) {
                        if (!drm0.N(((rh90) obj9).a)) {
                            arrayList4.add(obj9);
                        }
                    }
                    int e = on00.e(c5g.u(arrayList4, i3));
                    if (e < 16) {
                        e = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        rh90 rh90Var = (rh90) it3.next();
                        Pair pair = new Pair(drm0.p0(rh90Var.a).toString(), rh90Var.b);
                        linkedHashMap.put(pair.i(), pair.j());
                    }
                    arrayList3.add(new ApiResponseMocks.Mock(obj8, type, str3, linkedHashMap));
                    i3 = 10;
                    i4 = 1;
                }
                apiResponseMocks.getClass();
                o2l o2lVar = o2l.a;
                JSONArray jSONArray = new JSONArray();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    ApiResponseMocks.Mock mock = (ApiResponseMocks.Mock) it4.next();
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : mock.d.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    jSONArray.put(new JSONObject().put("method", mock.a).put("type", mock.b.name()).put("value", mock.c).put("params", jSONObject));
                }
                String jSONArray2 = jSONArray.toString();
                o2lVar.getClass();
                o2l.j("mockApiResponses", jSONArray2);
                DebugMockApiResponsesFragment.c cVar2 = new DebugMockApiResponsesFragment.c(0, debugMockApiResponsesFragment, DebugMockApiResponsesFragment.class, "finish", "finish()V", 0);
                c6l c6lVar = new c6l(context2, 0);
                int i11 = h7u0.p;
                h7u0.a c = h7u0.b.c(context2);
                c.h0(context2.getString(R.string.debug_mock_api_responses_save_title));
                c.a.f = context2.getString(R.string.debug_mock_api_responses_save_message);
                c.d0(context2.getString(R.string.debug_mock_api_responses_save_ok), new nv(cVar2, i2));
                c.X(context2.getString(R.string.debug_mock_api_responses_save_restart), new d6l(c6lVar, 0));
                c.m();
                return s3q0.a;
            case 16:
                com.vk.folders.impl.configure.d dVar = (com.vk.folders.impl.configure.d) obj7;
                drz.a aVar2 = (drz.a) obj6;
                ayr ayrVar = (ayr) obj;
                Set<Long> set = ayrVar.h;
                Set<Long> set2 = ayrVar.i;
                dVar.n(i.a.a);
                xrm xrmVar = (xrm) aVar2.a;
                DialogsHistory dialogsHistory = xrmVar.b;
                Set<Long> set3 = xrmVar.c;
                ArrayList arrayList5 = new ArrayList();
                Iterator<Dialog> it5 = dialogsHistory.iterator();
                while (it5.hasNext()) {
                    Dialog next2 = it5.next();
                    if (set3.contains(next2.Sb())) {
                        arrayList5.add(next2);
                    }
                }
                f1e0 f1e0Var = new f1e0();
                Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    ijm.b((Dialog) it6.next(), f1e0Var);
                }
                dVar.l.a(f1e0Var.h());
                LinkedHashMap w = com.vk.folders.impl.configure.d.w(xrmVar.b.k(), ayrVar.f, set3, ayrVar.j);
                return ayr.a(ayrVar, d.a.a(ayrVar.e, w, ayrVar.i, ayrVar.h, ayrVar.a, null, Boolean.valueOf(aVar2.b), ayrVar.d, com.vk.folders.impl.configure.b.a(dVar.h), ayrVar.g, dVar.m, dVar.p), dVar.s(ayrVar.d, ayrVar.c, com.vk.folders.impl.configure.d.u(ayrVar.e, w, set2, set), com.vk.folders.impl.configure.d.v(set, set2)), false, null, null, w, null, null, null, null, false, 16348);
            case 17:
                ((etv0) obj).b(false);
                ((i1s) obj7).k.a(((i1s.c) obj6).a, VkOnboardingType.Tooltip, e8v0.e.b);
                return s3q0.a;
            case 18:
                Throwable th = (Throwable) obj7;
                a.C1935a c1935a = (a.C1935a) obj6;
                return ((gy90) obj).a.containsAll(rl3.u0(((RuntimePermissionsNeededException) th).d())) ? c1935a.b.b(c1935a.a) : io.reactivex.rxjava3.core.q.H(th);
            case 19:
                Good good = (Good) obj6;
                ((i910) obj7).g.a.b.d.j(new vu00(good.c, good.b, ((Integer) obj).intValue()));
                return s3q0.a;
            case 20:
                qn9 qn9Var = (qn9) obj7;
                p31 p31Var = (p31) obj6;
                if (((Group) obj).n()) {
                    qn9Var.run();
                } else {
                    p31Var.run();
                }
                return s3q0.a;
            case 21:
                MusicPageInfoBlockNewVh musicPageInfoBlockNewVh = (MusicPageInfoBlockNewVh) obj7;
                UIBlockMusicArtistNew uIBlockMusicArtistNew = (UIBlockMusicArtistNew) obj6;
                musicPageInfoBlockNewVh.c.a(new cfp0(uIBlockMusicArtistNew, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Unsubscribe)));
                io.reactivex.rxjava3.core.q<Integer> g = musicPageInfoBlockNewVh.g(uIBlockMusicArtistNew);
                if (g != null) {
                    int i12 = 9;
                    cVar = g.subscribe(new lav(new owv(musicPageInfoBlockNewVh, i3), i12), new jfx0(new e810(musicPageInfoBlockNewVh, i12), i4));
                } else {
                    cVar = null;
                }
                musicPageInfoBlockNewVh.p = cVar;
                dw20 dw20Var = musicPageInfoBlockNewVh.q;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                musicPageInfoBlockNewVh.q = null;
                return s3q0.a;
            case 22:
                yj50 yj50Var = (yj50) obj7;
                izs izsVar = (izs) obj6;
                mk50 mk50Var = (mk50) obj;
                if (mk50Var instanceof mk50.c) {
                    Iterator it7 = yj50Var.l.iterator();
                    while (it7.hasNext()) {
                        ((gzs) it7.next()).invoke();
                    }
                    yj50Var.l.clear();
                    izsVar.invoke(new mk50.c(((mk50.c) mk50Var).a));
                }
                return s3q0.a;
            case 23:
                bi20 bi20Var = (bi20) obj7;
                CatalogExtendedData catalogExtendedData = (CatalogExtendedData) obj6;
                MusicSignalInfo musicSignalInfo = (MusicSignalInfo) obj;
                Iterator<T> it8 = musicSignalInfo.g.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_MUSIC_TRACKS, (String) it8.next());
                        MusicTrack musicTrack2 = Ab instanceof MusicTrack ? (MusicTrack) Ab : null;
                        if (musicTrack2 != null) {
                            musicTrack = musicTrack2;
                        }
                    } else {
                        musicTrack = null;
                    }
                }
                Iterator<T> it9 = bi20Var.l.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        obj3 = it9.next();
                        if (obj3 != null ? obj3 instanceof UIBlockActionPlayAudiosFromBlock : true) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                if (!(obj3 instanceof UIBlockActionPlayAudiosFromBlock)) {
                    obj3 = null;
                }
                UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = (UIBlockActionPlayAudiosFromBlock) obj3;
                Iterator<T> it10 = bi20Var.l.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        obj4 = it10.next();
                        if (obj4 != null ? obj4 instanceof UIBlockActionOpenSection : true) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                return new UIBlockMusicSignal(bi20Var.b(), musicSignalInfo.b, musicSignalInfo.c, musicSignalInfo.d, musicSignalInfo.e, musicSignalInfo.f, musicTrack, uIBlockActionPlayAudiosFromBlock, (UIBlockActionOpenSection) (obj4 instanceof UIBlockActionOpenSection ? obj4 : null));
            case 24:
                ((izs) obj7).invoke(((tba0.b) ((bca0) obj6).m).a);
                return s3q0.a;
            case 25:
                PhotoVideoAttachActivity photoVideoAttachActivity = (PhotoVideoAttachActivity) obj7;
                int i13 = PhotoVideoAttachActivity.g0;
                photoVideoAttachActivity.getClass();
                photoVideoAttachActivity.U.setLayoutParams(new FrameLayout.LayoutParams(-1, ((ViewGroup) obj).getHeight()));
                ((FrameLayout) obj6).addView(photoVideoAttachActivity.U);
                return s3q0.a;
            case 26:
                bn50 bn50Var = (bn50) obj7;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(bn50Var), ((f4k0) obj6).b);
                g47Var.a(tci.k(bn50Var));
                g47Var.d(new f4k0.a(bn50Var));
                return s3q0.a;
            case 27:
                StickerPackPreview stickerPackPreview = (StickerPackPreview) obj7;
                StickerPackVerticalListItemVh stickerPackVerticalListItemVh = (StickerPackVerticalListItemVh) obj6;
                if (stickerPackPreview.h && bhu.g(stickerPackPreview)) {
                    f9l0 f9l0Var = stickerPackVerticalListItemVh.c;
                    Context context3 = stickerPackVerticalListItemVh.i;
                    f9l0Var.d(context3 != null ? context3 : null, stickerPackPreview, stickerPackVerticalListItemVh.d);
                } else {
                    f9l0 f9l0Var2 = stickerPackVerticalListItemVh.c;
                    Context context4 = stickerPackVerticalListItemVh.i;
                    f9l0Var2.b(context4 != null ? context4 : null, stickerPackPreview.b, stickerPackVerticalListItemVh.d, stickerPackVerticalListItemVh.e, stickerPackVerticalListItemVh.f, null);
                }
                return s3q0.a;
            case 28:
                String str4 = (String) obj6;
                ((fql0) obj7).i.put(str4, str4);
                return s3q0.a;
            default:
                acn0 acn0Var = (acn0) obj7;
                ien0 ien0Var = (ien0) obj6;
                AdminLeaveAction adminLeaveAction = (AdminLeaveAction) obj;
                WebActionSubscribe h = ien0Var.h();
                if (h != null && (webSubscribeExtra = h.e) != null) {
                    o0r0.e(xwk.e(), fkq0.e(new UserId(h.d)), null, null, adminLeaveAction, 6).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new s520(new pqe0(ien0.j(webSubscribeExtra), webSubscribeExtra), 24), new k5j0(new xbn0(webSubscribeExtra, webSubscribeExtra.e, webSubscribeExtra.d, acn0Var, ien0Var), 7));
                }
                return s3q0.a;
        }
    }
}
