package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.log.L;
import com.vk.money.createtransfer.people.pin.VkPayPinFragment;
import com.vk.newsfeed.common.views.SnackbarGroupSubscriptionView;
import com.vk.sharing.core.view.TargetSendActionView;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.g650;
import xsna.ghw0;
import xsna.m8v0;
import xsna.obi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class waf0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ waf0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        obi0.a aVar;
        obi0.a aVar2;
        int i = this.b;
        int i2 = 7;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                x8c x8cVar = (x8c) obj2;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((lq40) x8cVar.b).G((Playlist) it.next(), false);
                }
                break;
            case 2:
                ((zak0) ((c1h) obj2).e).setValue(new q9x(((q9x) obj).a));
                break;
            case 3:
                ((sph0) obj2).getClass();
                break;
            case 4:
                orh0 orh0Var = (orh0) obj2;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                orh0Var.c.invoke(bool);
                bwt0.p0(orh0Var.b, booleanValue);
                break;
            case 5:
                SearchQueryVh searchQueryVh = (SearchQueryVh) obj2;
                pno0 pno0Var = (pno0) obj;
                boolean z = searchQueryVh.h;
                boolean z2 = searchQueryVh.g;
                break;
            case 6:
                bei0 bei0Var = (bei0) obj2;
                long longValue = ((Long) obj).longValue();
                obi0 f = bei0Var.f();
                if (f != null && (aVar2 = f.a) != null && longValue == aVar2.c) {
                    ((zak0) bei0Var.q).setValue(null);
                }
                obi0 f2 = bei0Var.f();
                if (f2 != null && (aVar = f2.b) != null && longValue == aVar.c) {
                    ((zak0) bei0Var.r).setValue(null);
                }
                if (bei0Var.a.i().a(longValue)) {
                    bei0Var.o();
                }
                break;
            case 7:
                psi0 psi0Var = (psi0) obj2;
                int i3 = m8v0.M;
                m8v0.a.a(psi0Var.a.getSideControlPanel().getAddStickerButtonView(), (String) obj, null, VkTooltip$MarkerStyle.Style4, VkTooltip$MarkerSize.Size64, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new fv90(psi0Var, 22), new qcw(25), null, null, null, null, null, 0, false, null, null, false, null, false, 16776228);
                break;
            case 8:
                break;
            case 9:
                SnackbarGroupSubscriptionView snackbarGroupSubscriptionView = (SnackbarGroupSubscriptionView) obj2;
                kym0 kym0Var = (kym0) obj;
                yzm0 yzm0Var = snackbarGroupSubscriptionView.c;
                if (yzm0Var != null) {
                    yzm0Var.a.g(4, kym0Var.a == SubscribeStatus.MEMBER_STATUS_MEMBER);
                }
                int i4 = SnackbarGroupSubscriptionView.a.$EnumSwitchMapping$0[kym0Var.a.ordinal()];
                if (i4 == 1) {
                    snackbarGroupSubscriptionView.c(SnackbarGroupSubscriptionView.ViewState.SUBSCRIBED);
                } else if (i4 == 2) {
                    snackbarGroupSubscriptionView.c(SnackbarGroupSubscriptionView.ViewState.UNSUBSCRIBED);
                }
                break;
            case 10:
                ((xbk0) obj2).m.invoke(g650.c.a.b);
                break;
            case 11:
                ((awk0) obj2).a.a(StaticAdsItemViewEvent.a.b);
                break;
            case 12:
                StoryMusicInfo storyMusicInfo = (StoryMusicInfo) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.g("music_track", storyMusicInfo.b);
                w9yVar.e(storyMusicInfo.c, "track_url");
                w9yVar.c(Integer.valueOf(storyMusicInfo.d), "start_ms");
                w9yVar.c(Integer.valueOf(storyMusicInfo.e), "finish_ms");
                w9yVar.c(Integer.valueOf(storyMusicInfo.f), "delay_ms");
                w9yVar.e(storyMusicInfo.g, "file_path");
                w9yVar.b(Boolean.valueOf(storyMusicInfo.h), "encode_music");
                w9yVar.c(Integer.valueOf(storyMusicInfo.i), "recommended_time");
                w9yVar.b(Boolean.valueOf(storyMusicInfo.j), "from_duet");
                w9yVar.b(Boolean.valueOf(storyMusicInfo.k), "from_local_video");
                w9yVar.g("music_catalog_info", storyMusicInfo.l);
                w9yVar.b(Boolean.valueOf(storyMusicInfo.m), "from_voice_over");
                w9yVar.b(Boolean.valueOf(storyMusicInfo.n), "from_storybox");
                break;
            case 13:
                l9m0 l9m0Var = (l9m0) obj2;
                l9m0Var.h(StoryPrivacyType.ALL, l9m0Var.g, l9m0Var.k, l9m0Var.l, l9m0Var.m, true, true);
                gzs<s3q0> gzsVar = l9m0Var.n;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 14:
                break;
            case 15:
                com.vk.sharing.core.view.j jVar = (com.vk.sharing.core.view.j) obj2;
                if (jVar.e != null) {
                    TargetSendActionView targetSendActionView = jVar.m;
                    targetSendActionView.getClass();
                    Intent intent = new Intent("com.vkontakte.android.ACTION_SHARING_ERROR_STATUS");
                    intent.putExtra("extra_show_failure_sharing_msg", y8g0.e(R.string.vk_apps_error_has_occured));
                    cuz.a(targetSendActionView.getContext()).c(intent);
                }
                break;
            case 16:
                ((g7q0) obj2).b.i1(R.string.default_network_error, new Object[0]);
                L.i((Throwable) obj);
                break;
            case 17:
                tuq0 tuq0Var = (tuq0) obj2;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                tuq0Var.n = true;
                extendedUserProfile.v1 = tuq0Var.f.b(extendedUserProfile.a.c, extendedUserProfile.v1);
                break;
            case 18:
                break;
            case 19:
                ((j6) obj2).invoke();
                break;
            case 20:
                ((gcs0) obj2).z7((Throwable) obj);
                break;
            case 21:
                ((com.vk.video.ui.discovery.minimizable.related_videos.e) obj2).e.invoke(new c.s0.e(new m.b(false)));
                break;
            case 22:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj2;
                ListBuilder e = e43.e();
                x4r0 x4r0Var = gVar.o;
                io.reactivex.rxjava3.subjects.d<lgs0> dVar = gVar.d0;
                fgs0 fgs0Var = gVar.b0;
                if (x4r0Var.a.c()) {
                    e.add(fgs0Var.b(dVar, gVar.h));
                }
                yat0 yat0Var = fgs0Var.f;
                yat0Var.getClass();
                e.add(dVar.s0(new or20(new efr0(yat0Var, i2), 18)));
                break;
            case 23:
                c2t0 c2t0Var = ((f3t0) obj2).e;
                e3t0 e3t0Var = (e3t0) obj;
                ArrayList arrayList = e3t0Var.a;
                if (e3t0Var.c) {
                    c2t0Var.submitList(arrayList);
                } else {
                    c2t0Var.submitList(j5g.u0(arrayList, c2t0Var.getCurrentList()));
                }
                break;
            case 24:
                ((MusicTrack) obj2).P = false;
                break;
            case 25:
                ((ihu0) obj2).o();
                break;
            case 26:
                int i5 = VkInputSelect.m;
                ((gzs) obj2).invoke();
                break;
            case 27:
                xbv0 xbv0Var = (xbv0) obj2;
                VkPayPinFragment vkPayPinFragment = xbv0Var.f;
                fux0 fux0Var = (fux0) obj;
                int i6 = 24;
                if (fux0Var instanceof w7i) {
                    vkPayPinFragment.lo(new dzk0(R.drawable.vk_icon_check_circle_outline_56, R.attr.vk_legacy_accent, vkPayPinFragment.getActivity().getString(R.string.vkpay_pin_success_status_title), vkPayPinFragment.getActivity().getString(R.string.vkpay_pin_success_status_description), null));
                    xbv0Var.g = true;
                    vkPayPinFragment.getClass();
                    new Handler().postDelayed(new kv3(vkPayPinFragment, i6), 3000L);
                } else if (fux0Var instanceof wup) {
                    vkPayPinFragment.lo(new dzk0(R.drawable.vk_icon_error_circle_outline_32, R.attr.vk_legacy_dynamic_orange, vkPayPinFragment.getActivity().getString(R.string.vkpay_pin_error_title), vkPayPinFragment.getActivity().getString(R.string.vkpay_pin_error_description), null));
                    xbv0Var.g = false;
                    vkPayPinFragment.getClass();
                    new Handler().postDelayed(new kv3(vkPayPinFragment, i6), 3000L);
                }
                break;
            case 28:
                ((ihw0) obj2).a(ghw0.b.a);
                break;
            default:
                ((mjw0) obj2).s();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ waf0(j6 j6Var, abs0 abs0Var, Context context) {
        this.b = 19;
        this.c = j6Var;
    }
}
