package xsna;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.clips.design.view.timeline.TimelineView;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.stories.design.view.stats.tabs.info.mvi.g;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuActionsFragment;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsFragment;
import com.vk.voip.ui.settings.LinkFragment;
import com.vk.voip.ui.settings.participants_view.j;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.amw0;
import xsna.bwq0;
import xsna.d99;
import xsna.hjm0;
import xsna.o1x0;
import xsna.p0x0;
import xsna.r6v;
import xsna.tj50;
import xsna.tra0;
import xsna.xn50;
import xsna.zxw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hfm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hfm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<CatalogSection> list;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new g.a(((tj50.a) obj).a(new com.vk.stories.design.view.stats.tabs.info.mvi.e(1, (com.vk.stories.design.view.stats.tabs.info.mvi.f) obj2, com.vk.stories.design.view.stats.tabs.info.mvi.f.class, "buildListState", "buildListState(Lcom/vk/stories/design/view/stats/tabs/info/mvi/StoryStatisticsInfoState;)Lcom/vk/stories/design/view/stats/tabs/info/mvi/StoryStatisticsInfoViewState$ListState;", 0), ao8.d));
            case 1:
                ((ajm0) obj2).T(new hjm0.b((List) obj));
                return s3q0.a;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((sum0) obj2).j).setValue(bool);
                return s3q0.a;
            case 3:
                izs izsVar = (izs) obj2;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) obj;
                if (izsVar != null) {
                    izsVar.invoke((SdkClipVideoFile) sdkVideoFile);
                }
                return s3q0.a;
            case 4:
                ymn0 ymn0Var = (ymn0) obj2;
                float floatValue = ((Float) obj).floatValue();
                wh50 wh50Var = ymn0Var.g;
                Float f = (Float) ((zak0) wh50Var).getValue();
                ((zak0) wh50Var).setValue(Float.valueOf(swe0.f((f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + floatValue, ((Number) ymn0Var.j.getValue()).floatValue(), ((Number) ymn0Var.k.getValue()).floatValue())));
                return s3q0.a;
            case 5:
                Rect rect = (Rect) obj;
                wm4 wm4Var = ((TimelineView) obj2).r;
                ywo0 ywo0Var = wm4Var.b;
                oy4 e = ywo0Var.e();
                if (e == null) {
                    rect.setEmpty();
                } else {
                    b05 a = wm4Var.g.a(e);
                    if (a != null) {
                        float d = ywo0Var.r.d(e.b);
                        RectF rectF = e.v;
                        wm4Var.d(a, rect, rectF.left - d, rectF.top);
                        int i2 = -wm4.s;
                        rect.inset(i2, i2);
                    }
                }
                return s3q0.a;
            case 6:
                ((zak0) ((e6p0) obj2).o).setValue((upw) obj);
                return s3q0.a;
            case 7:
                isq0 isq0Var = (isq0) obj2;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                int size = wallWithCounters.size();
                isq0Var.x(wallWithCounters, true);
                isq0Var.e(new bwq0.a.m(size));
                return s3q0.a;
            case 8:
                tuq0 tuq0Var = (tuq0) obj2;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                tuq0Var.n = true;
                extendedUserProfile.v1 = tuq0Var.f.b(extendedUserProfile.a.c, extendedUserProfile.v1);
                return s3q0.a;
            case 9:
                ber0 ber0Var = (ber0) obj2;
                ggu0 ggu0Var = ber0Var.b;
                mfu0 mfu0Var = ber0Var.c;
                Boolean bool2 = (Boolean) obj;
                if (bool2.booleanValue()) {
                    mfu0Var.n(JsApiMethodType.ALLOW_NOTIFICATIONS, new JSONObject().put("result", true));
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).j(((ggu0) ber0Var.d.c).b.getString(R.string.vk_apps_mini_notifications_allowed));
                } else {
                    mfu0Var.m(JsApiMethodType.ALLOW_NOTIFICATIONS, VkAppsErrors.Client.USER_DENIED, null, null);
                }
                ggu0Var.m().g.g(bool2.booleanValue());
                if (!ber0Var.a.t().r) {
                    ggu0Var.Qb();
                }
                return s3q0.a;
            case 10:
                com.vk.movika.sdk.base.observable.a aVar = ((com.vk.voip.ui.settings.participants_view.k) obj2).l;
                if (aVar != null) {
                    aVar.invoke(j.d.a.a);
                }
                return s3q0.a;
            case 11:
                VideoFile videoFile = (VideoFile) obj2;
                if (((BaseOkResponseDto) obj) == BaseOkResponseDto.OK) {
                    wjs0.a(new wxr0(videoFile, "videos_history_remove", null, 4));
                } else {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.e, new Object[]{"Failed to delete " + videoFile.a1() + " from history"});
                    }
                    j03.l(new Exception());
                }
                return s3q0.a;
            case 12:
                mcs0 mcs0Var = (mcs0) obj2;
                vqt vqtVar = (vqt) obj;
                mcs0Var.i.l(vqtVar.b);
                com.vk.lists.c cVar = mcs0Var.i;
                String j = cVar.j();
                if (j == null || j.length() == 0 || vqtVar.a.isEmpty()) {
                    cVar.r(false);
                }
                return s3q0.a;
            case 13:
                ((com.vk.video.ui.discovery.minimizable.related_videos.k) obj2).e.invoke((c.s0.d) obj);
                return s3q0.a;
            case 14:
                UIBlockList uIBlockList = (UIBlockList) obj;
                return Boolean.valueOf(dd80.f(uIBlockList, new yyl0((dks0) obj2, uIBlockList)) != null);
            case 15:
                return ((yks0) obj2).e(false);
            case 16:
                ((pis0) obj2).invoke();
                return s3q0.a;
            case 17:
                zjt0 zjt0Var = (zjt0) obj2;
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar3 = zjt0Var.K;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                zjt0Var.K = cVar2;
                return s3q0.a;
            case 18:
                return VideoView.A((VideoView) obj2);
            case 19:
                est0 est0Var = (est0) obj2;
                est0Var.I.getClass();
                hda b = e3a.b((CatalogCatalogResponseObjectDto) obj);
                CatalogExtendedData catalogExtendedData = b.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Object obj3 = b.a;
                CatalogCatalog catalogCatalog = obj3 instanceof CatalogCatalog ? (CatalogCatalog) obj3 : null;
                if (catalogCatalog != null && (list = catalogCatalog.b) != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        List<CatalogBlock> list2 = ((CatalogSection) it.next()).i;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list2) {
                            if (((CatalogBlock) obj4).c == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS) {
                                arrayList.add(obj4);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            CatalogBlock catalogBlock = (CatalogBlock) it2.next();
                            if (catalogBlock.i.b != CatalogViewType.INVISIBLE) {
                                linkedHashMap.putAll(est0.z0(catalogBlock, catalogExtendedData));
                            }
                        }
                    }
                }
                est0Var.F = j5g.O0(linkedHashMap.values());
                catalogExtendedData.zb(new CatalogExtendedData(null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, 7, null));
                return b;
            case 20:
                ((ggu0) obj2).c.m(false);
                return s3q0.a;
            case 21:
                tra0.a.w((tra0.a) obj, (tra0) obj2, 0L);
                return s3q0.a;
            case 22:
                final h7v h7vVar = (h7v) obj2;
                r6v.a aVar2 = (r6v.a) obj;
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                aVar2.getClass();
                aVar2.m();
                aVar2.a(new DialogInterface.OnDismissListener() { // from class: xsna.ouv0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        qcy<Object>[] qcyVarArr2 = VkTopBarSearchQueryVh.s;
                        h7v.this.b("audio:following_updates");
                    }
                });
                return s3q0.a;
            case 23:
                vlw0 vlw0Var = (vlw0) obj2;
                Throwable th = (Throwable) obj;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 9002) {
                    vlw0Var.T(amw0.b.c.b);
                }
                return s3q0.a;
            case 24:
                VoipMainMenuActionsFragment voipMainMenuActionsFragment = (VoipMainMenuActionsFragment) obj2;
                d99 d99Var = (d99) obj;
                int i3 = VoipMainMenuActionsFragment.V;
                if (d99Var instanceof d99.i) {
                    if (voipMainMenuActionsFragment.getParentFragmentManager().H("LinkFragment") == null) {
                        new LinkFragment().Td(voipMainMenuActionsFragment.getParentFragmentManager(), "LinkFragment");
                        voipMainMenuActionsFragment.tn();
                    }
                } else if (d99Var instanceof d99.j) {
                    new o1x0.a(((d99.j) d99Var).a, null, voipMainMenuActionsFragment.requireContext(), 10).I0("VoipShareLinkPagerModalDialog");
                }
                return s3q0.a;
            case 25:
                int i4 = VoipScheduledCallSettingsFragment.T;
                xn50.a.c((VoipScheduledCallSettingsFragment) obj2, new zxw0.l((ScheduledVideoMuteOption) obj));
                return s3q0.a;
            case 26:
                return new p0x0.a(((tj50.a) obj).a(new m0x0(1, ((n0x0) obj2).d, l0x0.class, "toViewState", "toViewState(Lcom/vk/voip/ui/watchmovie/selectsource/tabs/feature/VoipSelectVideoPlaylistsState;)Lcom/vk/voip/ui/watchmovie/selectsource/tabs/ui/VoipSelectVideoPlaylistsTabViewState$ScreenState;", 0), ao8.d));
            default:
                com.vk.writebar.g gVar = (com.vk.writebar.g) obj2;
                WriteBar writeBar = gVar.b;
                if (gVar.e) {
                    writeBar.G();
                    h1y0 h1y0Var = gVar.d;
                    if (h1y0Var != null) {
                        h1y0Var.b0();
                    }
                } else {
                    writeBar.C();
                }
                return s3q0.a;
        }
    }
}
