package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.healthCommon.dto.HealthCommonClientConfigDto;
import com.vk.api.generated.healthCommon.dto.HealthCommonClientConfigVkstartWidgetDto;
import com.vk.api.generated.healthCommon.dto.HealthCommonVkrunSyncBackgroundConfigDto;
import com.vk.api.generated.healthCommon.dto.HealthCommonVkstartWidgetSyncBackgroundConfigDto;
import com.vk.api.generated.healthCommon.dto.HealthCommonVkstartWidgetSyncConfigDto;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.actions.ActionPerformClick;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.polls.Poll;
import com.vk.dto.status.StatusImagePopup;
import com.vk.dto.stickers.StickerItem;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.log.L;
import com.vk.movika.sdk.android.defaultplayer.container.e;
import com.vk.movika.sdk.base.ui.p;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.a;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.photo.editor.ivm.collage.c;
import com.vk.pushes.receivers.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.InteractivePollStickerView;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.d;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.f;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import io.reactivex.rxjava3.internal.operators.observable.f0;
import io.reactivex.rxjava3.internal.operators.single.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.ag1;
import xsna.aue;
import xsna.av20;
import xsna.ayu0;
import xsna.b3g;
import xsna.boz;
import xsna.bp90;
import xsna.c5g;
import xsna.ck;
import xsna.d1v;
import xsna.de2;
import xsna.drm0;
import xsna.dwg;
import xsna.efc0;
import xsna.epx;
import xsna.ew60;
import xsna.eyi;
import xsna.fb50;
import xsna.fco0;
import xsna.fwx0;
import xsna.g07;
import xsna.gl7;
import xsna.gvo;
import xsna.hg1;
import xsna.hnd;
import xsna.hs50;
import xsna.hyg0;
import xsna.iid0;
import xsna.ikv0;
import xsna.iw60;
import xsna.izs;
import xsna.j8;
import xsna.jaa0;
import xsna.jh;
import xsna.jh3;
import xsna.jtq;
import xsna.jw60;
import xsna.jwy;
import xsna.k59;
import xsna.k720;
import xsna.kb50;
import xsna.klu;
import xsna.krv0;
import xsna.kzr;
import xsna.l1h0;
import xsna.lfg;
import xsna.lu60;
import xsna.m1h0;
import xsna.m5y;
import xsna.m8b0;
import xsna.m9l0;
import xsna.mp90;
import xsna.oo5;
import xsna.p2y;
import xsna.p3y;
import xsna.p9a0;
import xsna.pzr;
import xsna.q9a0;
import xsna.qcy;
import xsna.qgi0;
import xsna.qyg0;
import xsna.rsg0;
import xsna.rtb0;
import xsna.s3q0;
import xsna.s53;
import xsna.ste;
import xsna.szr;
import xsna.t2w0;
import xsna.tfx;
import xsna.tgi0;
import xsna.tho0;
import xsna.tk40;
import xsna.uab0;
import xsna.uje;
import xsna.us2;
import xsna.ush;
import xsna.vgu;
import xsna.vte;
import xsna.vzr;
import xsna.wfi0;
import xsna.wh50;
import xsna.wls;
import xsna.wzs;
import xsna.xgx0;
import xsna.xls;
import xsna.xo90;
import xsna.yfb;
import xsna.yqf;
import xsna.yvj;
import xsna.zak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class s implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, xsna.kte$b] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ActionPerformClick actionPerformClick;
        String str;
        HealthCommonVkstartWidgetSyncConfigDto d;
        DownloadingState downloadingState;
        int i = this.b;
        int i2 = 26;
        int i3 = 24;
        int i4 = 4;
        int i5 = 3;
        int i6 = 0;
        uab0 uab0Var = null;
        r7 = null;
        HealthCommonVkstartWidgetSyncBackgroundConfigDto healthCommonVkstartWidgetSyncBackgroundConfigDto = null;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((l0) obj3).w0().l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), ((p2y) obj2).b(), 1, null));
                return s3q0.a;
            case 1:
                return new b(new oo5((PlaybackLaunchMeta) obj2, (StartPlayVkMixSource) obj, (a) obj3));
            case 2:
                g07 g07Var = (g07) obj3;
                yvj yvjVar = (yvj) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                if (g07Var.c.c().getSize() > 1) {
                    if (((zak0) g07Var.c.g).getValue() == BigPlayerBottomSheetValue.Collapsed) {
                        ag1 ag1Var = new ag1(i5, g07Var, yvjVar);
                        qcy<Object>[] qcyVarArr = qgi0.a;
                        tgi0Var.a(wfi0.t, new ck(null, ag1Var));
                    } else {
                        e eVar = new e(i4, g07Var, yvjVar);
                        qcy<Object>[] qcyVarArr2 = qgi0.a;
                        tgi0Var.a(wfi0.u, new ck(null, eVar));
                    }
                }
                return s3q0.a;
            case 3:
                new BonusCatalogFragment.a().k((Context) obj3);
                ikv0 ikv0Var = ((gl7) obj2).b;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                return s3q0.a;
            case 4:
                ((hnd.f) obj3).a.invoke();
                int i7 = ikv0.e;
                ikv0.b.a((Window) obj2);
                return s3q0.a;
            case 5:
                izs izsVar = (izs) obj3;
                wh50 wh50Var = (wh50) obj2;
                tho0 tho0Var = (tho0) obj;
                us2 us2Var = tho0Var.a;
                if (!b.b(us2Var.c)) {
                    wh50Var.setValue(tho0Var);
                    izsVar.invoke(new uje.c(us2Var.c));
                }
                return s3q0.a;
            case 6:
                L.i((Throwable) obj);
                ((ste) obj3).T(new vte.d(((aue.a) obj2).c.a));
                return s3q0.a;
            case 7:
                ((lfg) obj3).Q8((String) obj2);
                return s3q0.a;
            case 8:
                ((wzs) obj3).invoke((ush.a) obj, (ExtendedCommunityProfile) obj2);
                return s3q0.a;
            case 9:
                ((eyi) obj3).b.g((hyg0) obj, (List) obj2);
                return s3q0.a;
            case 10:
                StatusImagePopup statusImagePopup = (StatusImagePopup) obj3;
                VKActivity vKActivity = (VKActivity) obj2;
                if (!((Boolean) obj).booleanValue() && (actionPerformClick = statusImagePopup.k) != null && (str = actionPerformClick.c) != null) {
                    tfx tfxVar = new tfx("specials.performAction", new j8(26), new jh(24));
                    tfx.o(tfxVar, "jwt", str, 0, 0, 12);
                    hg1.a(yfb.x(tfxVar).p(), vKActivity);
                }
                return s3q0.a;
            case 11:
                ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.b) obj3).f.a((UserId) obj2);
                return s3q0.a;
            case 12:
                jtq jtqVar = (jtq) obj3;
                List<StickerItem> list = (List) obj;
                jtqVar.c.onNext(list);
                m9l0 m9l0Var = jtqVar.a;
                m9l0Var.a(new jaa0(list, m9l0Var));
                ((p) obj2).invoke();
                return s3q0.a;
            case 13:
                FeedAnimatedView feedAnimatedView = (FeedAnimatedView) obj3;
                feedAnimatedView.v = 0;
                feedAnimatedView.h((String) obj, (String) obj2);
                return s3q0.a;
            case 14:
                vzr vzrVar = (vzr) obj;
                kzr kzrVar = ((pzr) obj3).i;
                String str2 = ((szr.c) ((szr) obj2)).b;
                if (!str2.equals(kzrVar.e)) {
                    kzrVar.e = str2;
                    kzrVar.a(str2);
                }
                return vzr.a(vzrVar, null, null, null, null, null, !drm0.N(r9.b), null, null, null, null, 8159);
            case 15:
                xls xlsVar = (xls) obj3;
                String str3 = xlsVar.b.b;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem(str3, MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_GIFTS_ACTION_BUTTON, null), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                ((wls) obj2).l.f(xlsVar.b);
                return s3q0.a;
            case 16:
                vgu vguVar = (vgu) obj3;
                c cVar = (c) obj2;
                RecyclerView.o layoutManager = vguVar.b.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                int v = linearLayoutManager != null ? linearLayoutManager.v() : 0;
                int x = linearLayoutManager != null ? linearLayoutManager.x() : 0;
                Iterator<b3g> it = cVar.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i6 = -1;
                    } else if (!it.next().e) {
                        i6++;
                    }
                }
                if (i6 >= 0 && i6 < vguVar.c.getItemCount() && (v > i6 || i6 > x)) {
                    vguVar.b.smoothScrollToPosition(i6);
                }
                return s3q0.a;
            case 17:
                d1v d1vVar = (d1v) obj3;
                VKApplication vKApplication = (VKApplication) obj2;
                HealthCommonClientConfigDto healthCommonClientConfigDto = (HealthCommonClientConfigDto) obj;
                xgx0.a.getClass();
                xgx0.a("HealthUtilsImpl loadHealthCommonClientConfig -> config: " + healthCommonClientConfigDto);
                k720 k720Var = k720.a;
                Preference.F(System.currentTimeMillis(), "menu_items", (String) k720.e.getValue());
                HealthCommonVkrunSyncBackgroundConfigDto d2 = healthCommonClientConfigDto.d().d().d();
                ayu0 ayu0Var = d1vVar.a;
                ayu0Var.j(vKApplication, RequestedMiniApp.VK_STEPS, null, new y(11, d2, d1vVar));
                ayu0Var.j(vKApplication, RequestedMiniApp.VK_WORKOUT, null, new s53(19, d1vVar, healthCommonClientConfigDto.e().d().d()));
                HealthCommonClientConfigVkstartWidgetDto f = healthCommonClientConfigDto.f();
                if (f != null && (d = f.d()) != null) {
                    healthCommonVkstartWidgetSyncBackgroundConfigDto = d.d();
                }
                if (healthCommonVkstartWidgetSyncBackgroundConfigDto != null) {
                    t2w0 t2w0Var = d1vVar.c;
                    boolean e = healthCommonVkstartWidgetSyncBackgroundConfigDto.e();
                    List<String> d3 = healthCommonVkstartWidgetSyncBackgroundConfigDto.d();
                    if (d3 == null) {
                        d3 = EmptyList.b;
                    }
                    t2w0Var.h(d3, e);
                }
                return s3q0.a;
            case 18:
                Poll poll = (Poll) obj2;
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar2 = ((InteractivePollStickerView) obj3).l;
                d dVar = cVar2.c;
                ArrayList arrayList = cVar2.d;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(poll.f.get(((Number) it2.next()).intValue()).b));
                }
                UserId userId = poll.c;
                int i8 = poll.b;
                boolean z = poll.j;
                InteractivePollStickerView.b bVar = cVar2.a;
                dVar.b();
                dVar.f(true);
                f fVar = cVar2.b;
                dwg dwgVar = new dwg(cVar2, i3);
                yqf yqfVar = new yqf(cVar2, i2);
                f0 D0 = rsg0.D0(new rtb0(userId, bVar.a, bVar.b, z, arrayList2, i8, ""));
                int i9 = 9;
                fVar.a.b(D0.subscribe(new tk40(new jh3(fVar, dwgVar, yqfVar, i9), i9), new m5y(new de2(1, yqfVar), 17)));
                return s3q0.a;
            case 19:
                p3y p3yVar = (p3y) obj3;
                String str4 = (String) obj2;
                Throwable th = (Throwable) obj;
                if (fco0.d(th)) {
                    p3yVar.L0().b(fco0.h(str4, th));
                } else {
                    p3yVar.L0().a(fco0.g(th), str4);
                }
                return s3q0.a;
            case 20:
                return new jwy((m1h0) obj3, (Map) obj, (l1h0) obj2);
            case 21:
                boz bozVar = (boz) obj3;
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = (ModalSettingsPrivacyOption) obj2;
                if (epx.f(bozVar.S0(), modalSettingsPrivacyOption.getTag())) {
                    return s3q0.a;
                }
                bozVar.T0((klu) modalSettingsPrivacyOption.getTag());
                return s3q0.a;
            case 22:
                ((fb50) obj3).b.h((hyg0) obj, (kb50) obj2);
                return s3q0.a;
            case 23:
                ((hs50) obj3).E.a(((Integer) obj).intValue(), (MyTargetNativeAdEntry) obj2);
                return s3q0.a;
            case 24:
                iw60 iw60Var = (iw60) obj3;
                jw60 jw60Var = (jw60) obj2;
                lu60 lu60Var = (lu60) obj;
                String str5 = iw60Var.a;
                if (str5 == null || str5.length() == 0) {
                    jw60Var.b.reset();
                }
                return (iw60Var.c == 0 && jw60Var.b.a(lu60Var.a(), iw60Var.a, lu60Var.b(), jw60Var.a, System.currentTimeMillis(), null)) ? new ew60(EmptyList.b, null, lu60Var.c(), null, null) : lu60Var;
            case 25:
                c.a aVar = com.vk.pushes.receivers.c.b;
                c.a.e((Context) obj3, (Intent) obj2, (Throwable) obj);
                return s3q0.a;
            case 26:
                k59<mp90.b> k59Var = ((bp90) obj3).t;
                ((xo90.a.h) ((xo90.a) obj2)).getClass();
                k59Var.a(new mp90.b.a.h());
                return s3q0.a;
            case 27:
                com.vk.photogallery.c cVar3 = (com.vk.photogallery.c) obj3;
                View view = (View) obj2;
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                view.getContext();
                e.b bVar2 = new e.b(view, null, null, l, 6);
                bVar2.w = R.layout.ds_internal_context_menu_item;
                av20.a aVar2 = new av20.a();
                aVar2.d(R.layout.lg_spinner_item, cVar3.g);
                aVar2.d = new p9a0();
                aVar2.e = new q9a0(cVar3);
                aVar2.f = (List) obj;
                bVar2.l = aVar2.b();
                VkContextMenu a = bVar2.a();
                a.g();
                cVar3.h = a;
                return s3q0.a;
            case 28:
                String str6 = (String) obj3;
                String str7 = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT id, uid, pid, downloading_state, json_raw FROM playlist WHERE uid = ? AND pid = ? LIMIT 1");
                try {
                    V0.D3(1, str6);
                    V0.D3(2, str7);
                    if (V0.step()) {
                        int i10 = (int) V0.getLong(0);
                        UserId b2 = fwx0.b(V0.l2(1));
                        String l2 = V0.l2(2);
                        int i11 = (int) V0.getLong(3);
                        if (i11 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i11 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i11 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i11 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i11 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        uab0Var = new uab0(i10, downloadingState, b2, l2, V0.l2(4));
                    }
                    return uab0Var;
                } finally {
                    V0.close();
                }
            default:
                ((efc0) obj3).C(new PostingAction.Init.NewPost(((PostingAction.Init.RestoreStateFromDisk) obj2).b.b.b, PostEditableData.D));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ s(String str, String str2, m8b0 m8b0Var) {
        this.b = 28;
        this.c = str;
        this.d = str2;
    }

    public /* synthetic */ s(gvo gvoVar, StatusImagePopup statusImagePopup, VKActivity vKActivity) {
        this.b = 10;
        this.c = statusImagePopup;
        this.d = vKActivity;
    }
}
