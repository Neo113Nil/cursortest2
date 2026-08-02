package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.media.MediaBrowserServiceCompat;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.vk.api.generated.friends.dto.FriendsDeleteResponseDto;
import com.vk.api.generated.market.dto.MarketSuggestionDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.friend.FriendsSuggestsVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicCameraData;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayEntitySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.superapp.auth.js.bridge.api.events.GetAuthToken$Response;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkworkout.types.SyncWorkoutReason;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dtm;
import xsna.ems;
import xsna.f2w0;
import xsna.g7g0;
import xsna.hil;
import xsna.k840;
import xsna.u3f;
import xsna.wfu;
import xsna.yo60;
import xsna.ypt;
import xsna.ytm;
import xsna.zag;
import xsna.zgc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l22 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l22(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0203, code lost:
    
        if (r7.b(r0, r2.Rb(), r3, true) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0225, code lost:
    
        if (r7.b(r0, r2.Rb(), r3, true) != false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        s3q0 value$lambda$2$lambda$1$lambda$0;
        WebApiApplication v;
        String str;
        Activity h;
        MusicTrack musicTrack;
        CatalogLaunchOrigin catalogLaunchOrigin;
        int i = this.b;
        int i2 = 3;
        int i3 = 1;
        r5 = true;
        boolean z = true;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((m22) obj3).b((String) obj2, (List) obj);
                return s3q0.a;
            case 1:
                value$lambda$2$lambda$1$lambda$0 = AndroidUnityBootConfigDataSource.getValue$lambda$2$lambda$1$lambda$0((String) obj2, (Ref$ObjectRef) obj3, (String) obj);
                return value$lambda$2$lambda$1$lambda$0;
            case 2:
                bi9 bi9Var = (bi9) obj3;
                MusicCameraData musicCameraData = (MusicCameraData) obj2;
                List list = (List) obj;
                if (list.isEmpty()) {
                    bi9Var.d = false;
                    bi9Var.c(null, new RuntimeException("Empty list of music has been received in audioService.audioGetById"));
                } else {
                    MusicTrack musicTrack2 = (MusicTrack) j5g.Y(list);
                    bi9Var.getClass();
                    String str2 = musicTrack2.i;
                    StoryMusicInfo storyMusicInfo = new StoryMusicInfo(musicTrack2, str2 == null ? "" : str2, 0, 0, 0, null, false, 0, false, false, null, false, false, 8032, null);
                    if (musicCameraData.c) {
                        int i4 = 9;
                        bi9Var.c.b(ktr.d(bi9Var.g(musicCameraData.b)).subscribe(new m20(new aq1(i2, storyMusicInfo, bi9Var), i4), new n20(new g86(r5 ? 1 : 0, bi9Var, storyMusicInfo), i4)));
                    } else {
                        bi9Var.d = false;
                        bi9Var.a.x4(storyMusicInfo);
                        bi9Var.a(storyMusicInfo, null);
                    }
                }
                return s3q0.a;
            case 3:
                lna lnaVar = (lna) obj2;
                izs<MusicTrack, s3q0> izsVar = ((jna) obj3).d;
                if (izsVar != null) {
                    izsVar.invoke(lnaVar.a);
                }
                return s3q0.a;
            case 4:
                ((yu1) obj3).invoke((n4c) obj);
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 5:
                MarketSuggestionDto marketSuggestionDto = (MarketSuggestionDto) obj3;
                xgc xgcVar = (xgc) obj2;
                String d = marketSuggestionDto.d();
                View view = xgcVar.itemView;
                rgc rgcVar = xgcVar.m;
                if (epx.f(d, view.getContext().getString(zgc.a.f.d)) || epx.f(d, xgcVar.itemView.getContext().getString(zgc.b.f.d))) {
                    rgcVar.X0();
                } else {
                    String e = marketSuggestionDto.e();
                    if (!drm0.N(e)) {
                        d = e;
                    }
                    rgcVar.D4(marketSuggestionDto.f(), d, marketSuggestionDto.g());
                }
                return s3q0.a;
            case 6:
                eee eeeVar = (eee) obj3;
                wfu wfuVar = (wfu) obj2;
                wfu.a aVar = (wfu.a) obj;
                ufu ufuVar = eeeVar.b;
                ufuVar.e(wfuVar, aVar);
                wfu g = ufuVar.g(wfuVar, aVar);
                if (g == null) {
                    return s3q0.a;
                }
                eeeVar.a(g);
                return s3q0.a;
            case 7:
                vve.e(((com.vk.clips.playlists.di.a) obj3).c, mve.a, false, ((Boolean) ((lk) obj2).invoke()).booleanValue(), 2);
                return s3q0.a;
            case 8:
                u3f.a aVar2 = (u3f.a) obj3;
                t3f t3fVar = (t3f) obj2;
                if (aVar2.d) {
                    itg0.k(t3fVar.a(new u3f.b(aVar2.a, aVar2.b, false, 12)), null, null, 3);
                }
                return s3q0.a;
            case 9:
                zag.a aVar3 = (zag.a) obj3;
                abg abgVar = ((zag) obj2).o;
                aVar3.f((abgVar != null ? abgVar : null).b);
                return s3q0.a;
            case 10:
                com.vk.movika.sdk.base.observable.p pVar = (com.vk.movika.sdk.base.observable.p) obj3;
                ic icVar = (ic) obj2;
                Throwable th = (Throwable) obj;
                if (!(th instanceof VKApiExecutionException)) {
                    pVar.invoke(th);
                    return s3q0.a;
                }
                int s = ((VKApiExecutionException) th).s();
                if (s != 100) {
                    if (s == 713) {
                        cvk.u(R.string.community_invite_link_unavailable, false);
                        icVar.invoke();
                    } else if (s != 714) {
                        pVar.invoke(th);
                    }
                    return s3q0.a;
                }
                cvk.u(R.string.community_invite_link_expired, false);
                icVar.invoke();
                return s3q0.a;
            case 11:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj3;
                f2w0 f2w0Var = (f2w0) obj2;
                String[] strArr = DebugDevSettingsFragment.t0;
                if (jyu0.e((iyu0) obj)) {
                    f2w0Var.d(debugDevSettingsFragment.requireContext(), new ton0(SyncWorkoutReason.APP_START, true), new bvo0(), null, null, SelectedDataSource.GOOGLE_FIT);
                } else {
                    enj.r(debugDevSettingsFragment.requireContext(), "Отсутствуют разрешения для получения активности", 0);
                }
                return null;
            case 12:
                ((hv10) obj).g((ur4) obj3, (Uri) obj2);
                return s3q0.a;
            case 13:
                psm psmVar = (psm) obj2;
                ytm.x xVar = (ytm.x) ((ytm) obj3);
                qtd0 Bb = ((oum) obj).c.Bb(xVar.b);
                if (Bb == null) {
                    return s3q0.a;
                }
                psmVar.m(new dtm.l(Bb, xVar.c == ImStoryState.NEW, xVar.d));
                return s3q0.a;
            case 14:
                ((wsp) obj3).b.h((hyg0) obj, (xsp) obj2);
                return s3q0.a;
            case 15:
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj3;
                FriendsSuggestsVh friendsSuggestsVh = (FriendsSuggestsVh) obj2;
                FriendsDeleteResponseDto friendsDeleteResponseDto = (FriendsDeleteResponseDto) obj;
                uIBlockProfile.E = 0;
                if (friendsDeleteResponseDto.d() == FriendsDeleteResponseDto.FriendDeletedDto.OK) {
                    friendsSuggestsVh.b.j(new ems.d(uIBlockProfile));
                } else if (friendsDeleteResponseDto.f() == FriendsDeleteResponseDto.OutRequestDeletedDto.OK) {
                    friendsSuggestsVh.b.j(new ems.b(uIBlockProfile));
                }
                return s3q0.a;
            case 16:
                ypt yptVar = (ypt) obj3;
                ypt.a aVar4 = (ypt.a) obj2;
                g7g0.b bVar = (g7g0.b) obj;
                w1n0 w1n0Var = yptVar.d;
                String str3 = aVar4.a.b;
                String str4 = bVar.a;
                Long l = bVar.b;
                String str5 = aVar4.b;
                com.vk.superapp.base.js.bridge.b.p(w1n0Var.a, new JsMethod("VKWebAppGetAuthToken"), new GetAuthToken$Response(null, new GetAuthToken$Response.Data(str4, null, str3, l, Boolean.TRUE, str5), str5, 1, null), null, null, false, null, 60);
                xwv0 xwv0Var = (xwv0) yptVar.a.get();
                if (xwv0Var != null && (v = xwv0Var.v()) != null && !v.r) {
                    xwv0Var.getView().Qb();
                }
                return s3q0.a;
            case 17:
                ((MediaBrowserServiceCompat.g) obj3).f(new ArrayList(((a1z) obj2).c.d((List) obj)));
                return s3q0.a;
            case 18:
                k840.a.g().b().N0(new lqk0(new StartPlayEntitySource(StartPlayEntitySource.PlayEntitySource.CURATOR, (String) obj2, false, 4, null), (MusicTrack) null, (List) obj, (MusicPlaybackLaunchContext) obj3, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 882));
                return s3q0.a;
            case 19:
                Map map = (Map) obj3;
                nk40 nk40Var = (nk40) obj2;
                UIBlock uIBlock = (UIBlock) obj;
                if (!uIBlock.Ib().contains("music_audios_download")) {
                    if (!(uIBlock instanceof UIBlockMusicTrack)) {
                        if (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack) {
                            UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack = (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock;
                            MusicTrack musicTrack3 = (MusicTrack) map.get(uIBlockSearchHistoryTrack.Rb().Fb());
                            if (musicTrack3 != null) {
                                break;
                            }
                        }
                    } else {
                        UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) uIBlock;
                        MusicTrack musicTrack4 = (MusicTrack) map.get(uIBlockMusicTrack.Rb().Fb());
                        if (musicTrack4 != null) {
                            break;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 20:
                MusicTrackCellVh musicTrackCellVh = (MusicTrackCellVh) obj3;
                View view2 = (View) obj2;
                Set<String> set = MusicTrackCellVh.A;
                if (!musicTrackCellVh.d()) {
                    SearchStatInfoProvider searchStatInfoProvider = musicTrackCellVh.f;
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MUSIC;
                    UIBlockMusicTrack uIBlockMusicTrack2 = musicTrackCellVh.p;
                    if (uIBlockMusicTrack2 == null || (str = uIBlockMusicTrack2.z.y) == null) {
                        str = "";
                    }
                    SearchStatsLoggingInfo b = searchStatInfoProvider.b(type, str, false);
                    Context context = view2.getContext();
                    if (context != null && (h = e3m.h(context)) != null) {
                        UIBlockMusicTrack uIBlockMusicTrack3 = musicTrackCellVh.p;
                        p9a p9aVar = uIBlockMusicTrack3 != null ? new p9a(musicTrackCellVh.e, uIBlockMusicTrack3, b) : null;
                        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(uIBlockMusicTrack3 != null ? uIBlockMusicTrack3.f : null);
                        UIBlockMusicTrack uIBlockMusicTrack4 = musicTrackCellVh.p;
                        String h2 = (uIBlockMusicTrack4 == null || (catalogLaunchOrigin = uIBlockMusicTrack4.p) == null) ? null : catalogLaunchOrigin.h();
                        MusicPlaybackLaunchContext Cb = Fb.Cb(h2 != null ? h2 : "");
                        UIBlockMusicTrack uIBlockMusicTrack5 = musicTrackCellVh.p;
                        if (uIBlockMusicTrack5 != null && (musicTrack = uIBlockMusicTrack5.z) != null) {
                            ic40 w = ((fl4) musicTrackCellVh.h.getValue()).w();
                            MusicBottomSheetLaunchPoint.App app2 = MusicBottomSheetLaunchPoint.App.b;
                            UIBlockMusicTrack uIBlockMusicTrack6 = musicTrackCellVh.p;
                            ic40.r(w, h, app2, musicTrack, Cb, p9aVar, false, false, uIBlockMusicTrack6 != null ? uIBlockMusicTrack6.b : null, uIBlockMusicTrack6 != null ? uIBlockMusicTrack6.c : null, 64);
                        }
                    }
                }
                return s3q0.a;
            case 21:
                ar50 ar50Var = (ar50) obj3;
                hi60 hi60Var = ar50Var.D;
                Context context2 = ((View) obj).getContext();
                MyTargetNativeAdEntry myTargetNativeAdEntry = ((zq50) obj2).i;
                NewsfeedExternalAction.Navigation.OpenMyTargetAds.a aVar5 = new NewsfeedExternalAction.Navigation.OpenMyTargetAds.a(NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.BANNER, "DEFAULT", 1, null);
                u1c0 J0 = ar50Var.J0();
                hi60Var.sa(new NewsfeedExternalAction.Navigation.OpenMyTargetAds(context2, myTargetNativeAdEntry, aVar5, J0 != null ? J0.k : -1));
                return s3q0.a;
            case 22:
                ((fq60) obj3).d((Context) obj2, new yo60.g.c(R.string.error));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 23:
                ((h890) obj3).e.invoke((StickerStockItem) obj2);
                return s3q0.a;
            case 24:
                ucv0 ucv0Var = (ucv0) obj;
                return ((Set) obj3).contains(ucv0Var) ? ucv0.a(ucv0Var, false) : ((Set) obj2).contains(ucv0Var) ? ucv0.a(ucv0Var, true) : ucv0Var;
            case 25:
                k840.a.d().H();
                ((j7b0) obj3).f.E((Context) obj2, xx1.k((Playlist) ((Pair) obj).i()));
                return s3q0.a;
            case 26:
                qhb0 qhb0Var = (qhb0) obj3;
                ((whb0) qhb0Var.d.getValue()).b(((b25) qhb0Var.c.getValue()).c(), (UserId) obj2, false);
                return s3q0.a;
            case 27:
                ArrayList arrayList = (ArrayList) obj3;
                qyg0 V0 = ((hyg0) obj).V0((String) obj2);
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        V0.bindLong(i3, ((Number) it.next()).intValue());
                        i3++;
                    }
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            case 28:
                nkd nkdVar = (nkd) obj3;
                ikd ikdVar = (ikd) obj2;
                Throwable th3 = (Throwable) obj;
                if (nkdVar != null) {
                    ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions = ClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER;
                    SdkVideoFile sdkVideoFile = ikdVar.a;
                    nkdVar.b(clipsBottomSheetSideEffectOptions, th3);
                }
                return s3q0.a;
            default:
                xji0 xji0Var = (xji0) obj3;
                Context context3 = (Context) obj2;
                SelectedDataSource selectedDataSource = (SelectedDataSource) obj;
                if (selectedDataSource != SelectedDataSource.UNKNOWN && selectedDataSource != SelectedDataSource.HUAWEI_HEALTH) {
                    f2w0.b.a(xji0Var.c.Te(), context3, new ton0(SyncWorkoutReason.BACKGROUND_SYNC, false), null, null, selectedDataSource, 28);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ l22(int i, String str, Object obj) {
        this.b = i;
        this.c = str;
        this.d = obj;
    }

    public /* synthetic */ l22(hil.b bVar, ur4 ur4Var, Uri uri) {
        this.b = 12;
        this.d = ur4Var;
        this.c = uri;
    }
}
