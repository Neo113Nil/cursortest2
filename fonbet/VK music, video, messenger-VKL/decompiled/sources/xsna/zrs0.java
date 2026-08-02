package xsna;

import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.author.VideoPinType;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.libvideo.design.view.actionlink.b;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.mno0;
import xsna.rmw;

/* compiled from: VideoLargeListViewStateMapper.kt */
/* loaded from: classes16.dex */
public final class zrs0 {

    /* compiled from: VideoLargeListViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPinType.values().length];
            try {
                iArr[VideoPinType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPinType.SUBSCRIBERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPinType.NON_SUBSCRIBERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoPinType.CLIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int c(long j) {
        return (int) TimeUnit.MILLISECONDS.toSeconds(j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final PreviewViewState.n d(gi5 gi5Var) {
        b.C1229b.a aVar;
        ActionLinkSnippet actionLinkSnippet;
        ActionLink m1 = gi5Var.a.m1();
        if (m1 != null) {
            String str = m1.c;
            switch (str.hashCode()) {
                case -732377866:
                    if (str.equals("article")) {
                        aVar = b.C1229b.a.C1231b.c;
                        break;
                    }
                    aVar = b.C1229b.a.c.c;
                    break;
                case -378331237:
                    if (str.equals("video_postcard_gift")) {
                        aVar = b.C1229b.a.h.c;
                        break;
                    }
                    aVar = b.C1229b.a.c.c;
                    break;
                case -309474065:
                    if (str.equals("product")) {
                        aVar = b.C1229b.a.i.c;
                        break;
                    }
                    aVar = b.C1229b.a.c.c;
                    break;
                case 96801:
                    if (str.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                        aVar = b.C1229b.a.C1230a.c;
                        break;
                    }
                    aVar = b.C1229b.a.c.c;
                    break;
                case 3321850:
                    if (str.equals("link")) {
                        aVar = b.C1229b.a.e.c;
                        break;
                    }
                    aVar = b.C1229b.a.c.c;
                    break;
                case 3446719:
                    if (str.equals("poll")) {
                        aVar = b.C1229b.a.f.c;
                        break;
                    }
                    aVar = b.C1229b.a.c.c;
                    break;
                case 3446944:
                    if (str.equals("post")) {
                        aVar = b.C1229b.a.g.c;
                        break;
                    }
                    aVar = b.C1229b.a.c.c;
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        aVar = b.C1229b.a.k.c;
                        break;
                    }
                    aVar = b.C1229b.a.c.c;
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        aVar = b.C1229b.a.d.c;
                        break;
                    }
                    aVar = b.C1229b.a.c.c;
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        aVar = b.C1229b.a.l.c;
                        break;
                    }
                    aVar = b.C1229b.a.c.c;
                    break;
                default:
                    aVar = b.C1229b.a.c.c;
                    break;
            }
        } else {
            aVar = null;
        }
        int i = (m1 == null || (actionLinkSnippet = m1.f) == null) ? 0 : actionLinkSnippet.g;
        if (aVar == null || gi5Var.q < i) {
            return null;
        }
        rmw.d dVar = new rmw.d(aVar.a);
        Integer num = aVar.b;
        return new PreviewViewState.n(dVar, num != null ? new mno0.g(num.intValue()) : null, VkColorToken.IconContrast, VkColorToken.IconPrimaryInvariably);
    }

    public static final PreviewViewState e(gi5 gi5Var, com.vk.libvideo.autoplay.a aVar, mno0 mno0Var) {
        boolean f = aVar.f();
        return PreviewViewState.a0.b(null, false, null, null, null, new PreviewViewState.a((PreviewViewState.n) null, !(!gi5Var.B && aVar.k) ? null : (gi5Var.w > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (gi5Var.w == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) == 0 || f || gi5Var.a.k0() ? new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_mute_24), new mno0.g(R.string.video_accessibility_sound_on), VkColorToken.OverlayPrimary, VkColorToken.IconContrast) : new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_volume_20), new mno0.g(R.string.video_accessibility_sound_off), VkColorToken.OverlayPrimary, VkColorToken.IconContrast), 3), null, new PreviewViewState.v(mno0Var), null, null, null, 1884);
    }

    public static final PreviewViewState f(gi5 gi5Var, boolean z) {
        VideoFile videoFile = gi5Var.a;
        rmw.f f = smw.f(videoFile.getImage());
        PreviewViewState.n nVar = null;
        PreviewViewState.n nVar2 = new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_replay_outline_28), null, VkColorToken.OverlayPrimary, VkColorToken.IconContrast);
        PreviewViewState.n nVar3 = new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_share_outline_28), null, VkColorToken.OverlayPrimary, VkColorToken.IconContrast);
        if (z && !videoFile.H6() && videoFile.i9()) {
            nVar = new PreviewViewState.n(new rmw.d(videoFile.j0() ? R.drawable.vk_icon_done_outline_28 : R.drawable.vk_icon_add_outline_28), null, VkColorToken.OverlayPrimary, VkColorToken.IconContrast);
        }
        return PreviewViewState.a0.b(f, false, null, null, null, null, new PreviewViewState.m(nVar2, nVar3, nVar, VkColorToken.OverlayPrimary), null, null, null, null, 1980);
    }

    public static final VideoMetaViewState.c g(DonutVideoUiModel donutVideoUiModel) {
        DonutVideoUiModel.DescriptionChip descriptionChip = donutVideoUiModel.c;
        if (descriptionChip != null) {
            return new VideoMetaViewState.c(new mno0.a(new phg(descriptionChip, 13)), descriptionChip.d);
        }
        return null;
    }

    public static final PreviewViewState h(gi5 gi5Var, com.vk.libvideo.autoplay.a aVar, DonutVideoUiModel donutVideoUiModel, VideoPinType videoPinType) {
        return u(gi5Var, aVar, donutVideoUiModel, videoPinType);
    }

    public static final PreviewViewState j(gi5 gi5Var) {
        return PreviewViewState.a0.b(smw.f(gi5Var.a.getImage()), false, null, null, null, null, null, null, null, new PreviewViewState.q(gi5Var.a.x5() ? new PlaceholderViewState(null, new mno0.g(R.string.video_err_network), new mno0.g(R.string.video_error_retry), null, VkColorToken.OverlayPrimary, 9) : new PlaceholderViewState(null, new mno0.g(gpt0.p(gi5Var.j, false).a), new mno0.g(R.string.video_error_retry), null, VkColorToken.OverlayPrimary, 9)), null, 1532);
    }

    public static final PreviewViewState k() {
        return PreviewViewState.a0.a.d(false, new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_picture_in_picture_56), new mno0.g(R.string.video_pip_overlay), null, null, null, 28));
    }

    public static final PreviewViewState l(gi5 gi5Var, VideoRestriction videoRestriction) {
        String str;
        ArrayList arrayList;
        Image w2 = gi5Var.a.w2();
        mno0.i iVar = null;
        rmw.g gVar = (w2 == null || (arrayList = w2.b) == null) ? null : new rmw.g(arrayList);
        rmw.g gVar2 = new rmw.g(videoRestriction.h.b);
        mno0.i iVar2 = new mno0.i(videoRestriction.b);
        RestrictionButton restrictionButton = videoRestriction.e;
        if (restrictionButton != null && (str = restrictionButton.c) != null) {
            iVar = new mno0.i(str);
        }
        return PreviewViewState.a0.a.a(gVar, false, new PlaceholderViewState(gVar2, iVar2, iVar, null, null, 24));
    }

    public static final PreviewViewState.u m(List list) {
        String g0 = j5g.g0(list, "\n", null, null, 0, new l5r0(6), 30);
        if (g0.length() > 0) {
            return new PreviewViewState.u(g0);
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 com.vk.libvideo.design.compose.base.timeline.TimelineViewState, still in use, count: 2, list:
          (r4v0 com.vk.libvideo.design.compose.base.timeline.TimelineViewState) from 0x008e: PHI (r4v1 com.vk.libvideo.design.compose.base.timeline.TimelineViewState) = 
          (r4v0 com.vk.libvideo.design.compose.base.timeline.TimelineViewState)
          (r4v4 com.vk.libvideo.design.compose.base.timeline.TimelineViewState)
         binds: [B:20:0x0081, B:26:0x00bd] A[DONT_GENERATE, DONT_INLINE]
          (r4v0 com.vk.libvideo.design.compose.base.timeline.TimelineViewState) from 0x007c: MOVE (r23v4 com.vk.libvideo.design.compose.base.timeline.TimelineViewState) = (r4v0 com.vk.libvideo.design.compose.base.timeline.TimelineViewState) (LINE:125)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final com.vk.libvideo.design.compose.base.preview.PreviewViewState.w n(xsna.gi5 r22, boolean r23, xsna.ah50 r24, xsna.ah50 r25) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.zrs0.n(xsna.gi5, boolean, xsna.ah50, xsna.ah50):com.vk.libvideo.design.compose.base.preview.PreviewViewState$w");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final PreviewViewState.a o(gi5 gi5Var, boolean z, boolean z2, boolean z3, boolean z4) {
        PreviewViewState.n nVar;
        PreviewViewState.n nVar2;
        float f = gi5Var.w;
        VideoFile videoFile = gi5Var.a;
        boolean z5 = false;
        Object[] objArr = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || z2 || videoFile.k0();
        Object[] objArr2 = !videoFile.z0() && z3 && z;
        Object[] objArr3 = gi5Var.u != null;
        if (!videoFile.v() && z && gi5Var.v) {
            z5 = true;
        }
        PreviewViewState.n nVar3 = null;
        if (!z5) {
            nVar = null;
        } else if (objArr3 == true) {
            mno0.g gVar = new mno0.g(R.string.subtitles_on_content_description);
            rmw.d dVar = new rmw.d(R.drawable.vk_icon_subtitles_slash_24);
            VkColorToken vkColorToken = VkColorToken.OverlayPrimary;
            if (!z4) {
                vkColorToken = null;
            }
            nVar = new PreviewViewState.n(dVar, gVar, vkColorToken, VkColorToken.IconContrast);
        } else {
            mno0.g gVar2 = new mno0.g(R.string.subtitles_off_content_description);
            rmw.d dVar2 = new rmw.d(R.drawable.vk_icon_subtitles_24);
            VkColorToken vkColorToken2 = VkColorToken.OverlayPrimary;
            if (!z4) {
                vkColorToken2 = null;
            }
            nVar = new PreviewViewState.n(dVar2, gVar2, vkColorToken2, VkColorToken.IconContrast);
        }
        if (objArr2 != false) {
            if (objArr == true) {
                nVar2 = new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_mute_24), new mno0.g(R.string.video_accessibility_sound_on), z4 ? VkColorToken.OverlayPrimary : null, VkColorToken.IconContrast);
            } else {
                nVar2 = new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_volume_20), new mno0.g(R.string.video_accessibility_sound_off), z4 ? VkColorToken.OverlayPrimary : null, VkColorToken.IconContrast);
            }
            nVar3 = nVar2;
        }
        return new PreviewViewState.a(nVar, nVar3, 1);
    }

    public static final PreviewViewState.k q(VideoPinType videoPinType) {
        mno0.g gVar = null;
        if (videoPinType == null) {
            return null;
        }
        int i = a.$EnumSwitchMapping$0[videoPinType.ordinal()];
        if (i == 1) {
            gVar = new mno0.g(R.string.video_catalog_pinned_videos_all);
        } else if (i == 2) {
            gVar = new mno0.g(R.string.video_catalog_pinned_videos_sub);
        } else if (i == 3) {
            gVar = new mno0.g(R.string.video_catalog_pinned_videos_non_sub);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        mno0.g gVar2 = gVar;
        return new PreviewViewState.k(new PreviewViewState.j(ContentBadgeMode.Primary, ContentBadgeAppearance.Design.Overlay, new rmw.d(R.drawable.vk_icon_pin_16), null, gVar2, null, 40), 2);
    }

    public static final boolean r(gi5 gi5Var, boolean z) {
        return gi5Var.f ? gi5Var.n || !z : (gi5Var.h.h() || gi5Var.a.z0()) ? false : true;
    }

    public static final boolean s(VideoFile videoFile) {
        boolean z;
        if (MusicFeatures.AUDIO_VIDEO_CARD_TRACK_NOTE.h()) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUSIC_NOTE_ON_TYPE;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                z = videoFile.t2();
            } else {
                Integer a6 = videoFile.a6();
                if (a6.intValue() != 0) {
                    if (a6.intValue() != videoFile.o0()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static final PreviewViewState.DurationBadge t(VideoFile videoFile, boolean z, boolean z2, int i) {
        PreviewViewState.DurationBadge.IconState iconState = null;
        if (videoFile.v() && videoFile.q0()) {
            mno0 c = kpt0.c(0, videoFile);
            if (s(videoFile)) {
                iconState = PreviewViewState.DurationBadge.IconState.MusicNote;
            } else if (z2) {
                iconState = PreviewViewState.DurationBadge.IconState.Play;
            } else if (z) {
                iconState = PreviewViewState.DurationBadge.IconState.Progress;
            }
            return new PreviewViewState.DurationBadge(c, true, iconState);
        }
        mno0 c2 = kpt0.c(i, videoFile);
        if (s(videoFile)) {
            iconState = PreviewViewState.DurationBadge.IconState.MusicNote;
        } else if (z2) {
            iconState = PreviewViewState.DurationBadge.IconState.Play;
        } else if (z) {
            iconState = PreviewViewState.DurationBadge.IconState.Progress;
        }
        return new PreviewViewState.DurationBadge(c2, false, iconState);
    }

    public static final PreviewViewState u(gi5 gi5Var, com.vk.libvideo.autoplay.a aVar, DonutVideoUiModel donutVideoUiModel, VideoPinType videoPinType) {
        PreviewViewState.l lVar;
        boolean r = r(gi5Var, aVar.g);
        VideoFile videoFile = gi5Var.a;
        rmw.f f = smw.f(videoFile.getImage());
        PreviewViewState.w wVar = null;
        if (donutVideoUiModel != null) {
            DonutVideoUiModel.PreviewBadge previewBadge = donutVideoUiModel.b;
            lVar = previewBadge != null ? new PreviewViewState.l(new mno0.a(new com.vk.movika.tools.controls.seekbar.i(previewBadge, 22)), new mno0.i(previewBadge.d)) : null;
        } else {
            lVar = null;
        }
        PreviewViewState.DurationBadge t = t(videoFile, false, false, 0);
        PreviewViewState.n nVar = r ? new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_play_button_48), null, null, null, 14) : null;
        PreviewViewState.k q = q(videoPinType);
        boolean z = gi5Var.e;
        long j = gi5Var.q;
        if (!z && !gi5Var.k && com.vk.libvideo.autoplay.j.b(videoFile) != 0) {
            if (!gi5Var.m && j <= 0) {
                j = com.vk.libvideo.autoplay.j.b(videoFile);
            }
            wVar = new PreviewViewState.w(new TimelineViewState(new TimelineViewState.b(Long.valueOf(j)), new TimelineViewState.b(Long.valueOf(j)), gi5Var.r, false, false, TimelineViewState.TrackHeightType.Large, TimelineViewState.Style.Video, null, null));
        }
        return PreviewViewState.a0.b(f, false, t, lVar, q, null, nVar, null, null, wVar, null, 1440);
    }
}
