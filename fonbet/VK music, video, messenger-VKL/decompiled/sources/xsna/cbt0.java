package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.auth.validation.VkValidatePhoneInfo;
import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.toggle.features.VideoFeatures;
import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.media_options.MediaOption;
import xsna.e6w0;
import xsna.e8v0;
import xsna.gm50;
import xsna.ikv0;
import xsna.jct0;
import xsna.mot0;
import xsna.mox0;
import xsna.o0r0;
import xsna.p7w0;
import xsna.pxw0;
import xsna.spw0;
import xsna.xn50;
import xsna.zxw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class cbt0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cbt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Activity h;
        izs<? super Long, s3q0> izsVar;
        int i = this.b;
        int i2 = 13;
        int i3 = 10;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                hbt0 hbt0Var = (hbt0) obj2;
                hbt0Var.g.post(new h12(i2, hbt0Var, (ci5) obj));
                return s3q0.a;
            case 1:
                ect0 ect0Var = (ect0) obj2;
                jct0 jct0Var = (jct0) obj;
                if (jct0Var instanceof jct0.c) {
                    xwk.e().m(ect0Var.requireContext(), ((jct0.c) jct0Var).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    ect0Var.dismiss();
                } else if (jct0Var instanceof jct0.a) {
                    Context requireContext = ect0Var.requireContext();
                    String str = ((jct0.a) jct0Var).a;
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        str = ((com.vk.video.ui.share.api.b) ect0Var.l1.getValue()).c(str.toString());
                    }
                    ((ClipboardManager) requireContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
                    cvk.u(R.string.link_copied, false);
                    ect0Var.dismiss();
                } else if (jct0Var instanceof jct0.d) {
                    jct0.d dVar = (jct0.d) jct0Var;
                    izs<Boolean, s3q0> izsVar2 = ect0Var.i1;
                    if (dVar instanceof jct0.d.b) {
                        Context mo2getContext = ect0Var.mo2getContext();
                        if (mo2getContext != null && (h = e3m.h(mo2getContext)) != null) {
                            fxc0.B().g(h, dVar.a, true);
                        }
                    } else if (dVar instanceof jct0.d.c) {
                        fxc0.B().h(ect0Var.requireContext(), dVar.a);
                    } else if (dVar instanceof jct0.d.C3116d) {
                        VideoAlbum videoAlbum = dVar.a;
                        if (!BuildInfo.q()) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_PLAYLIST_SHARING;
                            videoFeatures2.getClass();
                            if (!com.vk.toggle.b.A.a(videoFeatures2)) {
                                if (ect0Var.bo().s().b()) {
                                    kbj0.c(ect0Var.bo().h8(), ect0Var.requireContext(), videoAlbum.Eb(), false, null, null, false, 120);
                                } else {
                                    ect0Var.bo().h8().y(ect0Var.requireContext(), videoAlbum.Eb());
                                }
                            }
                        }
                        ect0Var.bo().h8().s(ect0Var.requireContext(), videoAlbum, true);
                    } else if (dVar instanceof jct0.d.a) {
                        Activity h2 = e3m.h(ect0Var.requireContext());
                        if (h2 != null) {
                            g7s0 B = fxc0.B();
                            VideoAlbum videoAlbum2 = dVar.a;
                            B.i0(h2, videoAlbum2.c, videoAlbum2.b);
                        }
                    } else if (dVar instanceof jct0.d.e) {
                        mot0.b(mot0.a.a, ect0Var.requireContext(), ect0Var.bo().s().L(), dVar.a.b, null, 24);
                    } else if (dVar instanceof jct0.d.f) {
                        b25 s = ect0Var.bo().s();
                        ect0Var.requireContext();
                        s.getClass();
                        izsVar2.invoke(Boolean.TRUE);
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        if (!(dVar instanceof jct0.d.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b25 s2 = ect0Var.bo().s();
                        ect0Var.requireContext();
                        s2.getClass();
                        izsVar2.invoke(Boolean.FALSE);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    ect0Var.dismiss();
                } else {
                    if (!jct0Var.equals(jct0.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ect0Var.dismiss();
                }
                return s3q0.a;
            case 2:
                nht0 nht0Var = (nht0) obj2;
                cd80 cd80Var = (cd80) obj;
                ikv0 ikv0Var = nht0Var.f;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                Context context = nht0Var.a;
                ikv0.a aVar = new ikv0.a(context);
                kht0 e0 = fxc0.B().J().e0();
                int i4 = 4;
                if (e0.a) {
                    int i5 = 12;
                    if (e0.b) {
                        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_accent_themed);
                        if (fxc0.B().s().p()) {
                            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_download_check_outline_28, valueOf, (Size) null, 12);
                            aVar.u = new ikv0.d(context.getString(R.string.video_slow_network_snackbar_title), context.getString(R.string.video_slow_network_snackbar_description), (ikv0.d.a) null, 4);
                            aVar.s = new ikv0.e.b(R.drawable.vk_icon_chevron_right_small_outline_24, (Integer) null, (Size) null, new q7a0(i2, aVar, nht0Var), 14);
                        } else {
                            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_warning_triangle_outline_28, valueOf, (Size) null, 12);
                            aVar.u = new ikv0.d(context.getString(R.string.video_slow_network_snackbar_empty_title), (String) null, (ikv0.d.a) null, 6);
                        }
                    } else {
                        Integer valueOf2 = Integer.valueOf(R.attr.vk_ui_icon_secondary);
                        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_download_check_outline_28, valueOf2, (Size) null, 12);
                        aVar.u = new ikv0.d(context.getString(R.string.video_slow_network_snack_text), (String) null, new ikv0.d.a(context.getString(R.string.video_slow_network_action_btn), null, new pm90(i3, aVar, nht0Var), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2);
                        aVar.s = new ikv0.e.b(R.drawable.vk_icon_cancel_outline_24, valueOf2, (Size) null, new bjm0(nht0Var, i5), 12);
                    }
                }
                s3q0 s3q0Var3 = s3q0.a;
                aVar.e = 5000L;
                aVar.h = new g6m0(i4, nht0Var, cd80Var);
                if (fxc0.B().J().E0()) {
                    HashSet hashSet = iah0.a;
                    if (fnj.d(context)) {
                        aVar.g(1);
                    }
                }
                nht0Var.f = aVar.n();
                return s3q0.a;
            case 3:
                yg5 yg5Var = (yg5) obj2;
                return VideoTrailerView$State.a((VideoTrailerView$State) obj, yg5Var.A(), yg5Var, new com.vk.libvideo.autoplay.a(false, RepeatMode.BY_VIDEO_PARAMS, null, true, false, true, null, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, null, PlayerType.INLINE, ScreenType.INLINE, false, null, 289724), ii5.a(yg5Var), null, null, false, false, false, 8131);
            case 4:
                PlaybackLaunchMeta playbackLaunchMeta = ((h4v0) obj2).b.b;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new xd50(oc4.d((AudioAudioDto) it.next()), playbackLaunchMeta));
                }
                return arrayList;
            case 5:
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) obj2;
                ((ggj) obj).s1();
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.m.b);
                }
                return s3q0.a;
            case 6:
                ((u3a0) obj).b((VkValidatePhoneInfo) obj2);
                return s3q0.a;
            case 7:
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                RectF o = zjq.o(((VkTopBar) obj2).getSearchRightIconRect());
                Rect rect = new Rect();
                o.roundOut(rect);
                return rect;
            case 8:
                Throwable th = (Throwable) obj;
                ((m6w0) obj2).T(new p7w0.c.a(th));
                h03.b(th);
                return s3q0.a;
            case 9:
                ((VmojiCharacterFragment.c) obj2).invoke(e6w0.a.b);
                return s3q0.a;
            case 10:
                mjw0 mjw0Var = (mjw0) obj2;
                dhw0 L = com.vk.voip.ui.c.b.L();
                long j = L != null ? L.b : 0L;
                if (j != 0 && (izsVar = mjw0Var.d1) != null) {
                    izsVar.invoke(Long.valueOf(j));
                }
                return s3q0.a;
            case 11:
                ((kpw0) obj2).T(new spw0.b.a((Throwable) obj));
                return s3q0.a;
            case 12:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i6 = otw0.i1;
                ((otw0) obj2).Zn(booleanValue, MediaOption.SCREEN_SHARING);
                return s3q0.a;
            case 13:
                lww0 lww0Var = (lww0) obj2;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                if (!booleanValue2) {
                    lww0Var.o.clearFocus();
                }
                lww0Var.l.a(new pxw0.g(booleanValue2));
                return s3q0.a;
            case 14:
                int i7 = VoipScheduledCallSettingsFragment.T;
                xn50.a.c((VoipScheduledCallSettingsFragment) obj2, new zxw0.m((ScheduledAudioMuteOption) obj));
                return s3q0.a;
            case 15:
                View view = ((c2x0) obj2).f1;
                if (view != null) {
                    bwt0.p0(view, true);
                }
                return s3q0.a;
            case 16:
                hox0 hox0Var = (hox0) obj2;
                gm50.a.a(hox0Var, ((mox0.a) obj).a, new n9t0(hox0Var, 9));
                return s3q0.a;
            default:
                com.vk.writebar.g gVar = (com.vk.writebar.g) obj2;
                gVar.g();
                com.vk.writebar.a aVar2 = gVar.o;
                (aVar2 != null ? aVar2 : null).e(false);
                return s3q0.a;
        }
    }
}
