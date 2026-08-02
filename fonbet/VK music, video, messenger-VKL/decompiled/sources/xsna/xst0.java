package xsna;

import android.content.Context;
import com.vk.catalog.mvi.block.video.impl.video.list.VideosListView$State;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.utils.b;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import xsna.mno0;
import xsna.rmw;

/* compiled from: VideosListViewStateMapper.kt */
/* loaded from: classes.dex */
public final class xst0 implements s2a<VideosListView$State, vst0> {
    public final Context b;
    public final w3k0 c;
    public final hdt0 d;

    public xst0(Context context, w3k0 w3k0Var, hdt0 hdt0Var) {
        this.b = context;
        this.c = w3k0Var;
        this.d = hdt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x017e, code lost:
    
        if ((r1.c == com.vk.catalog.mvi.register.CatalogBlockVariant.VideosListVisibleAuthors) != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f6  */
    @Override // xsna.s2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vst0 a(VideosListView$State videosListView$State) {
        PreviewViewState.d nVar;
        long j;
        boolean z;
        PreviewViewState b;
        boolean z2;
        DonutVideoUiModel.PreviewBadge e;
        String obj;
        DonutVideoUiModel.DescriptionChip d;
        VideosListView$State videosListView$State2 = videosListView$State;
        boolean z3 = videosListView$State2.i;
        final String str = videosListView$State2.g;
        final VideoFile videoFile = videosListView$State2.f;
        DonutVideoUiModel donutVideoUiModel = videosListView$State2.j;
        VideoRestriction O = videoFile.O();
        if (!this.d.c(videoFile) || O == null) {
            if (donutVideoUiModel == null || (e = donutVideoUiModel.e()) == null) {
                Integer a = hng.a(videoFile.getPrivacy());
                nVar = kpt0.e(videoFile) ? a != null ? new PreviewViewState.n(rmw.a.a(a.intValue()), null, null, VkColorToken.TextContrast, 4) : null : null;
            } else {
                nVar = new PreviewViewState.l(mno0.b.b(new bn7(e, 17)), nno0.e(e.d()));
            }
            PreviewViewState.d dVar = nVar;
            rmw.f b2 = smw.b(videoFile.getImage(), 0.8f);
            mno0 d2 = kpt0.d(videoFile);
            boolean x0 = videoFile.x0();
            if (MusicFeatures.AUDIO_VIDEO_CARD_TRACK_NOTE.h()) {
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUSIC_NOTE_ON_TYPE;
                videoFeatures.getClass();
                j = 0;
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
                    PreviewViewState.DurationBadge durationBadge = new PreviewViewState.DurationBadge(d2, x0, !z ? PreviewViewState.DurationBadge.IconState.MusicNote : null);
                    Long v4 = videoFile.v4();
                    long longValue = v4 == null ? v4.longValue() : j;
                    Long v42 = videoFile.v4();
                    b = PreviewViewState.a0.b(b2, true, durationBadge, dVar, null, null, null, null, null, new PreviewViewState.w(TimelineViewState.a.a(longValue, v42 == null ? v42.longValue() : j, videoFile.getDuration())), VkColorToken.BackgroundSecondaryAlpha, 496);
                }
            } else {
                j = 0;
            }
            z = false;
            PreviewViewState.DurationBadge durationBadge2 = new PreviewViewState.DurationBadge(d2, x0, !z ? PreviewViewState.DurationBadge.IconState.MusicNote : null);
            Long v43 = videoFile.v4();
            if (v43 == null) {
            }
            Long v422 = videoFile.v4();
            b = PreviewViewState.a0.b(b2, true, durationBadge2, dVar, null, null, null, null, null, new PreviewViewState.w(TimelineViewState.a.a(longValue, v422 == null ? v422.longValue() : j, videoFile.getDuration())), VkColorToken.BackgroundSecondaryAlpha, 496);
        } else {
            PlaceholderViewState placeholderViewState = new PlaceholderViewState(smw.d(O.Db().b), null, null, null, null, 30);
            boolean Ab = O.Ab();
            PreviewViewState.a0 a0Var = PreviewViewState.a0.a;
            b = Ab ? a0Var.a(smw.d(videoFile.getImage().b), true, placeholderViewState) : a0Var.d(true, placeholderViewState);
            j = 0;
        }
        PreviewViewState previewViewState = b;
        boolean z4 = videoFile instanceof MusicVideoFile;
        String str2 = videosListView$State2.e;
        final Context context = this.b;
        String f = kpt0.f(context, str2, z4);
        UserId userId = videosListView$State2.d;
        final w3k0 w3k0Var = this.c;
        boolean c = w3k0Var.c(videoFile, str, userId);
        VideoMetaViewState.c cVar = (donutVideoUiModel == null || (d = donutVideoUiModel.d()) == null) ? null : new VideoMetaViewState.c(mno0.b.b(new oa5(d, 15)), d.d());
        String P = videoFile.P();
        if (P != null) {
        }
        P = null;
        VideoMetaViewState.c cVar2 = cVar;
        VideoMetaViewState.i iVar = new VideoMetaViewState.i(nno0.e(f));
        boolean z5 = w3k0Var.e;
        boolean z6 = w3k0Var.d;
        if (w3k0Var.c) {
            StringBuilder sb = new StringBuilder();
            if (videoFile.k1() <= 0 && !videoFile.z0() && (!fxc0.B().c(videoFile) || videoFile.L8() != 0)) {
                sb.append(w3k0.b(context, videoFile));
            }
            if (videoFile.b0() != 0 || videoFile.k1() > 0 || pls0.g(videoFile)) {
                if (!drm0.N(sb)) {
                    sb.append(" · ");
                }
                sb.append(pls0.d(context, videoFile));
            }
            obj = sb.toString();
        } else if (z3) {
            obj = (String) new gzs() { // from class: xsna.v3k0
                /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
                @Override // xsna.gzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    boolean z7;
                    StringBuilder sb2 = new StringBuilder();
                    w3k0 w3k0Var2 = w3k0.this;
                    VideoFile videoFile2 = videoFile;
                    boolean d3 = w3k0Var2.d(videoFile2);
                    Context context2 = context;
                    if (!d3) {
                        sb2.append(w3k0.b(context2, videoFile2));
                    }
                    if (pls0.a(videoFile2) == 0) {
                        if ((w3k0Var2.e ? pls0.e(videoFile2) : videoFile2.k1()) <= 0) {
                            z7 = true;
                            if (!z7) {
                                if (!drm0.N(sb2)) {
                                    sb2.append(" · ");
                                }
                                sb2.append(w3k0Var2.a(context2, videoFile2, str));
                            }
                            return sb2.toString();
                        }
                    }
                    z7 = false;
                    if (!z7) {
                    }
                    return sb2.toString();
                }
            }.invoke();
            boolean z7 = (videoFile.v() && videoFile.q0()) || (z6 && videoFile.k1() > 0);
            obj = !z5 ? null : null;
        } else {
            int e2 = z5 ? pls0.e(videoFile) : videoFile.k1();
            if (pls0.a(videoFile) != j || (!z4 && !z6 && e2 != 0)) {
                String b3 = z4 ? b.C0795b.a.b(context, videoFile) : w3k0Var.a(context, videoFile, str);
                if (b3 != null) {
                    obj = b3.toString();
                }
            }
        }
        return new vst0(videosListView$State2.b, new VideoCellViewState(previewViewState, new VideoCellViewState.g(new VideoMetaViewState(iVar, obj != null ? new VideoMetaViewState.a(null, null, null, videoFile.Y().b, nno0.e(obj), null, null, 0, 231) : null, new VideoMetaViewState.a(!z3 ? cVar2 : null, null, P != null ? nno0.e(P) : null, videoFile.Y().b, null, null, z3 ? cVar2 : null, 0, 178))), !c ? VideoCellViewState.c.a.a() : null, null, null, 24), videosListView$State2.l);
    }
}
