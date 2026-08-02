package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.video.video.VideoView$State;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.mno0;
import xsna.rmw;

/* compiled from: VideoViewStateMapper.kt */
/* loaded from: classes.dex */
public final class ert0 implements s2a<VideoView$State, dqt0> {
    public static final l8s0 f;
    public static final l8s0 g;
    public static final l8s0 h;
    public static final l8s0 i;
    public static final l8s0 j;
    public final boolean b;
    public final boolean c;
    public final Context d;
    public final hdt0 e;

    /* compiled from: VideoViewStateMapper.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogBlockVariant.values().length];
            try {
                iArr[CatalogBlockVariant.VideosShowcaseWithDescription.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogBlockVariant.VideosSliderLargeStyle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogBlockVariant.VideosSlider.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f2 = 232;
        float f3 = (float) 174.5d;
        float f4 = (float) 130.5d;
        f = new l8s0(f2, f3, f2, f4);
        float f5 = 320;
        float f6 = 172;
        g = new l8s0(f5, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, f5, f6);
        float f7 = Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE;
        h = new l8s0(f7, 257, f7, f6);
        i = new l8s0(f2, f3, f2, f4);
        float f8 = 154;
        j = new l8s0(f8, 146, f8, 84);
        float f9 = 343;
        new l8s0(f9, 258, f9, PsExtractor.AUDIO_STREAM);
        new l8s0(206, 186, 194, 108);
    }

    public ert0(boolean z, boolean z2, Context context, hdt0 hdt0Var) {
        this.b = z;
        this.c = z2;
        this.d = context;
        this.e = hdt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x022d, code lost:
    
        if ((r3 && r9) != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0322  */
    @Override // xsna.s2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dqt0 a(VideoView$State videoView$State) {
        PreviewViewState.d nVar;
        boolean z;
        int[] iArr;
        PreviewViewState b;
        boolean z2;
        DonutVideoUiModel.PreviewBadge e;
        VideoMetaViewState.a aVar;
        VideoMetaViewState.a aVar2;
        VideoMetaViewState.a aVar3;
        boolean z3;
        DonutVideoUiModel.DescriptionChip d;
        Image Bb;
        VideoView$State videoView$State2 = videoView$State;
        CatalogBlockVariant catalogBlockVariant = videoView$State2.c;
        boolean z4 = catalogBlockVariant == CatalogBlockVariant.VideosSlider;
        int[] iArr2 = a.$EnumSwitchMapping$0;
        int i2 = iArr2[catalogBlockVariant.ordinal()];
        boolean z5 = this.b;
        l8s0 l8s0Var = h;
        if (i2 == 2 || i2 == 1) {
            if (!z5) {
                l8s0Var = i;
            }
        } else if (i2 == 3) {
            l8s0Var = z5 ? g : f;
        } else if (!z5) {
            l8s0Var = j;
        }
        VideoFile videoFile = videoView$State2.d;
        DonutVideoUiModel donutVideoUiModel = videoView$State2.g;
        VideoRestriction O = videoFile.O();
        boolean c = this.e.c(videoFile);
        Context context = this.d;
        if (!c || O == null || (e5o.b(O) && this.c)) {
            if (donutVideoUiModel == null || (e = donutVideoUiModel.e()) == null) {
                Integer a2 = hng.a(videoFile.getPrivacy());
                nVar = kpt0.e(videoFile) ? a2 != null ? new PreviewViewState.n(rmw.a.a(a2.intValue()), null, null, VkColorToken.TextContrast, 4) : null : null;
            } else {
                nVar = new PreviewViewState.l(mno0.b.b(new dv4(e, 12)), nno0.e(e.d()));
            }
            PreviewViewState.d dVar = nVar;
            rmw.g d2 = smw.d(videoFile.getImage().b);
            mno0 d3 = kpt0.d(videoFile);
            if (MusicFeatures.AUDIO_VIDEO_CARD_TRACK_NOTE.h()) {
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUSIC_NOTE_ON_TYPE;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    z2 = videoFile.t2();
                } else {
                    Integer a6 = videoFile.a6();
                    if (a6.intValue() != 0) {
                        if (a6.intValue() != videoFile.o0()) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    PreviewViewState.DurationBadge durationBadge = new PreviewViewState.DurationBadge(d3, false, !z ? PreviewViewState.DurationBadge.IconState.MusicNote : null, 2);
                    Long v4 = videoFile.v4();
                    long longValue = v4 == null ? v4.longValue() : 0L;
                    Long v42 = videoFile.v4();
                    iArr = iArr2;
                    b = PreviewViewState.a0.b(d2, true, durationBadge, dVar, null, null, null, null, null, new PreviewViewState.w(TimelineViewState.a.a(longValue, v42 != null ? v42.longValue() : 0L, videoFile.getDuration())), VkColorToken.BackgroundSecondaryAlpha, 496);
                }
            }
            z = false;
            PreviewViewState.DurationBadge durationBadge2 = new PreviewViewState.DurationBadge(d3, false, !z ? PreviewViewState.DurationBadge.IconState.MusicNote : null, 2);
            Long v43 = videoFile.v4();
            if (v43 == null) {
            }
            Long v422 = videoFile.v4();
            iArr = iArr2;
            b = PreviewViewState.a0.b(d2, true, durationBadge2, dVar, null, null, null, null, null, new PreviewViewState.w(TimelineViewState.a.a(longValue, v422 != null ? v422.longValue() : 0L, videoFile.getDuration())), VkColorToken.BackgroundSecondaryAlpha, 496);
        } else {
            ImageSize Cb = videoFile.getImage().Cb(an10.b(l8s0Var.c * context.getResources().getDisplayMetrics().density), true, false);
            PlaceholderViewState placeholderViewState = new PlaceholderViewState(smw.d(O.Db().b), nno0.e(O.getTitle()), null, null, null, 28);
            boolean Ab = O.Ab();
            PreviewViewState.a0 a0Var = PreviewViewState.a0.a;
            if (Ab) {
                b = a0Var.a((Cb == null || (Bb = Cb.Bb()) == null) ? smw.d(videoFile.getImage().b) : smw.c(Bb), true, placeholderViewState);
            } else {
                b = a0Var.d(true, placeholderViewState);
            }
            iArr = iArr2;
        }
        String f2 = kpt0.f(context, videoFile.getTitle(), videoFile instanceof MusicVideoFile);
        String P = videoFile.P();
        if (P == null) {
            P = "";
        }
        Resources resources = context.getResources();
        boolean z6 = P.length() + (uqm0.g(videoFile.L8()) ? resources.getString(R.string.views_count_raw, uqm0.e(videoFile.L8())) : resources.getQuantityString(R.plurals.views_count, videoFile.L8(), Integer.valueOf(videoFile.L8()))).length() > 30;
        VideoMetaViewState.c cVar = (donutVideoUiModel == null || (d = donutVideoUiModel.d()) == null) ? null : new VideoMetaViewState.c(mno0.b.b(new zu3(d, 17)), d.d());
        BlockId.CompositeId compositeId = videoView$State2.b;
        String M0 = videoFile.M0();
        if (M0 != null) {
        }
        M0 = null;
        VideoMetaViewState.i iVar = new VideoMetaViewState.i(nno0.e(f2), 2);
        if (z4 && z5) {
            aVar = new VideoMetaViewState.a(null, null, null, false, !z6 ? kpt0.g(videoFile) : null, nno0.d(pls0.b(context, videoFile)), null, 1, 79);
        } else {
            VideoMetaViewState.c cVar2 = !z5 ? cVar : null;
            String P2 = videoFile.P();
            aVar = new VideoMetaViewState.a(cVar2, null, P2 != null ? nno0.e(P2) : null, videoFile.Y().b, null, null, null, 1, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        }
        if (z5) {
            aVar3 = z6 ? new VideoMetaViewState.a(null, null, null, false, kpt0.g(videoFile), null, cVar, 1, 47) : new VideoMetaViewState.a(null, null, null, false, null, null, cVar, 1, 63);
        } else if (z4) {
            aVar3 = new VideoMetaViewState.a(null, null, null, false, null, null, cVar, 1, 63);
        } else {
            if (catalogBlockVariant != CatalogBlockVariant.VideosShowcaseWithDescription) {
                aVar2 = null;
                VideoMetaViewState videoMetaViewState = new VideoMetaViewState(iVar, aVar, aVar2);
                if (z4) {
                    z3 = true;
                    if (!(iArr[catalogBlockVariant.ordinal()] == 1)) {
                        z3 = false;
                    }
                } else {
                    z3 = true;
                }
                return new dqt0(compositeId, new VideoCardViewState(b, VideoCardViewState.a.a(M0, videoMetaViewState, z3)), l8s0Var);
            }
            aVar3 = new VideoMetaViewState.a(null, null, null, false, kpt0.g(videoFile), nno0.d(pls0.b(context, videoFile)), null, 1, 79);
        }
        aVar2 = aVar3;
        VideoMetaViewState videoMetaViewState2 = new VideoMetaViewState(iVar, aVar, aVar2);
        if (z4) {
        }
        return new dqt0(compositeId, new VideoCardViewState(b, VideoCardViewState.a.a(M0, videoMetaViewState2, z3)), l8s0Var);
    }
}
