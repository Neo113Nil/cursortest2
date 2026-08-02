package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.video.ui.share.api.ScreenMode;
import com.vk.video.ui.share.api.ShareItemType;
import com.vk.video.ui.share.api.ShareSource;
import com.vk.video.ui.share.api.StatsArguments;
import com.vk.video.ui.share.api.VideoShareArguments;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.OneVideoPlayer;
import xsna.b4;
import xsna.dai;
import xsna.kef0;
import xsna.n4;
import xsna.rfb;
import xsna.rhw0;
import xsna.xx30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ShareSource shareSource;
        int i = this.b;
        int i2 = 2;
        int i3 = 28;
        int i4 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                n4 n4Var = (n4) obj2;
                MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource = ((b4.f0) ((b4) obj)).a;
                FragmentActivity fragmentActivity = n4Var.b;
                n4.b bVar = n4Var.d;
                yks0 yks0Var = n4Var.e;
                if (!n4Var.c(yks0Var.e)) {
                    n4Var.c.c();
                    VideoFile videoFile = yks0Var.e;
                    if (o25.a().b() && fxc0.B().J().m(videoFile.C2())) {
                        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                        long position = b.C1208b.a().e(videoFile, null).getPosition() / 1000;
                        ShareItemType shareItemType = videoFile.C2() ? ShareItemType.CLIP : ShareItemType.VIDEO;
                        com.vk.video.ui.share.api.a aVar = bVar.j;
                        String a = fss0.a(videoFile);
                        int i5 = (int) position;
                        long j = videoFile.I0().b;
                        long o0 = videoFile.o0();
                        String r = videoFile.r();
                        ows0 ows0Var = bVar.l;
                        ScreenMode screenMode = (ScreenMode) new ScreenModeVideoStatMapper(ows0Var != null ? ows0Var.b3() : null).b(videoFile, new l4(0));
                        int i6 = n4.c.$EnumSwitchMapping$0[mobileOfficialAppsSharingStat$TypeEventSource.ordinal()];
                        if (i6 == 1) {
                            shareSource = ShareSource.ACTION_MENU;
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            shareSource = ShareSource.BUTTON;
                        }
                        aVar.a(fragmentActivity, new VideoShareArguments(a, i5, true, new StatsArguments(shareItemType, j, o0, r, screenMode, shareSource)), videoFile);
                    } else {
                        VideoFile videoFile2 = yks0Var.e;
                        w1s0 w1s0Var = w1s0.b;
                        kbj0.u(nr4.b(), fragmentActivity, videoFile2, true, false, null, mobileOfficialAppsSharingStat$TypeEventSource, 24);
                    }
                }
                return s3q0.a;
            case 1:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) obj2;
                com.vk.movika.sdk.base.logic.processor.h hVar = new com.vk.movika.sdk.base.logic.processor.h(cVar, 1);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                Lazy a2 = msy.a(lazyThreadSafetyMode, hVar);
                return new vy0(msy.a(lazyThreadSafetyMode, new cy0(0, cVar, (Context) obj)), msy.a(lazyThreadSafetyMode, new dy0(i4, cVar, a2)), a2, cVar.r);
            case 2:
                Article article = ((ym3) obj2).a;
                enq.g(((hn3) obj).itemView.getContext(), new ArticleAttachment(article), new pqq(article.d, null, null, null, 14), null, null);
                return s3q0.a;
            case 3:
                return ((wgb) obj2).s + ": updateExpiredHistory: load from cache, args=" + ((rfb.a.b) obj);
            case 4:
                ((p4e) obj2).m = null;
                ((i5) obj).invoke();
                return s3q0.a;
            case 5:
                ((f6s) obj2).o7(((q6s) obj).g0);
                return s3q0.a;
            case 6:
                View view = (View) obj;
                ((wzs) obj2).invoke(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
                return s3q0.a;
            case 7:
                InfoBar.Payload.GiftsBirthdays.User user = (InfoBar.Payload.GiftsBirthdays.User) obj2;
                UserId userId = user.b;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("gifts_birthdays_single", MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_PROFILE, Long.valueOf(userId.b)), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                ((ovw) obj).l.y(user.b);
                return s3q0.a;
            case 8:
                a500 a500Var = (a500) obj;
                return ((c500) obj2).c(a500Var.b, a500Var.p);
            case 9:
                return new fot((Context) obj2, new zp00(((com.vk.clips.sdk.shared.item.market_ads.b) obj).z), null);
            case 10:
                sw30 sw30Var = (sw30) obj;
                return new tw30((a1w) obj2, new dx30(1, sw30Var, xx30.a.class, "isDialogAllowed", "isDialogAllowed(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0), new ex30(1, sw30Var, xx30.a.class, "isDialogActive", "isDialogActive(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0));
            case 11:
                ((izs) obj2).invoke(((MusicPlayerInformerViewState.a) obj).b);
                return s3q0.a;
            case 12:
                ((h7f0) obj2).l((hn50) obj);
                return s3q0.a;
            case 13:
                ((wh50) obj2).setValue(Boolean.TRUE);
                ((wh50) obj).setValue(Boolean.FALSE);
                return s3q0.a;
            case 14:
                ((izs) obj2).invoke(new OrderAction.h(((gpd0) obj).d));
                return s3q0.a;
            case 15:
                ((dai.d) ((kef0) obj2).m.getValue()).c.invoke(new kef0.a(((ee50) obj).a));
                return s3q0.a;
            case 16:
                return "this.player (" + ((one.video.stat2.a) obj2).r + ") differs from passed player (" + ((OneVideoPlayer) obj) + ")";
            case 17:
                dmb0 dmb0Var = (dmb0) obj2;
                zhf0 zhf0Var = (zhf0) ((bpn0) obj).getValue();
                float I0 = dmb0Var.I0(wrp0.d);
                float f = wrp0.b;
                return new zhf0(I0, dmb0Var.I0(f), zhf0Var.a, dmb0Var.I0(f + wrp0.e));
            case 18:
                j2s0 j2s0Var = (j2s0) obj2;
                AttachVideo attachVideo = (AttachVideo) obj;
                io.reactivex.rxjava3.core.x n = hg1.n(j2s0Var.j.F(j2s0Var, new qes0(attachVideo.getId(), attachVideo.b.I0())), j2s0Var.l, false, null, 62);
                uk40 uk40Var = new uk40(new ito0(i2, j2s0Var, attachVideo), 23);
                ips0 ips0Var = j2s0Var.v;
                j2s0Var.I0(n.subscribe(uk40Var, new a960(new q69(1, ips0Var == null ? null : ips0Var, ips0.class, "showError", "showError(Ljava/lang/Throwable;)V", 0, 15), i3)));
                return s3q0.a;
            default:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj2;
                VkTopBar vkTopBar = (VkTopBar) obj;
                int i7 = VoipCallServiceFragment.Y;
                voipCallServiceFragment.getFeature().C(rhw0.l.b);
                Rect n2 = zjq.n(vkTopBar.getRightMainRect());
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                vkTopBar.getContext();
                e.c cVar2 = new e.c(null, n2, vkTopBar, l, 1);
                VkContextMenu.c.c(cVar2, R.string.voip_vkapp_services_call_join_by_link, dhr0.x(R.drawable.vk_icon_linked_24, R.attr.vk_ui_icon_accent_themed, voipCallServiceFragment.requireContext()), false, null, new d8t0(voipCallServiceFragment, 10), 28);
                VkContextMenu.c.c(cVar2, R.string.voip_vkapp_services_call_schedule_call, dhr0.x(R.drawable.vk_icon_calendar_add_outline_28, R.attr.vk_ui_icon_accent_themed, voipCallServiceFragment.requireContext()), false, null, new hsv0(voipCallServiceFragment, 3), 28);
                VkContextMenu.c.c(cVar2, R.string.voip_vkapp_services_call_open_records, dhr0.x(R.drawable.vk_icon_recorder_tape_outline_28, R.attr.vk_ui_icon_accent_themed, voipCallServiceFragment.requireContext()), false, null, new l6n0(voipCallServiceFragment, 24), 28);
                VkContextMenu.c.c(cVar2, R.string.voip_vkapp_services_call_open_asr, dhr0.x(R.drawable.vk_icon_articles_outline_28, R.attr.vk_ui_icon_accent_themed, voipCallServiceFragment.requireContext()), false, null, new iml0(voipCallServiceFragment, 28), 28);
                cVar2.l(false);
                return s3q0.a;
        }
    }

    public /* synthetic */ i4(c500 c500Var, String str, a500 a500Var) {
        this.b = 8;
        this.c = c500Var;
        this.d = a500Var;
    }
}
