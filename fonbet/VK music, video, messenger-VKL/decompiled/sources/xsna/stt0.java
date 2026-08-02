package xsna;

import android.content.Context;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.video.stackedlist.VideosStackedListView$State;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.b;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import xsna.mno0;
import xsna.rmw;

/* compiled from: VideosStackedListViewStateMapper.kt */
/* loaded from: classes.dex */
public final class stt0 implements s2a<VideosStackedListView$State, rtt0> {
    public final Context b;
    public final hdt0 c;
    public final boolean d;
    public final w3k0 e;
    public final g7s0 f;
    public final f5o g;

    public stt0(Context context, hdt0 hdt0Var, boolean z, w3k0 w3k0Var, g7s0 g7s0Var, f5o f5oVar) {
        this.b = context;
        this.c = hdt0Var;
        this.d = z;
        this.e = w3k0Var;
        this.f = g7s0Var;
        this.g = f5oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0117, code lost:
    
        if (r6 != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0211  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.s2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rtt0 a(VideosStackedListView$State videosStackedListView$State) {
        String P;
        s3q0 s3q0Var;
        PreviewViewState.d nVar;
        boolean z;
        PreviewViewState b;
        boolean z2;
        DonutVideoUiModel.PreviewBadge e;
        DonutVideoUiModel.DescriptionChip d;
        VideosStackedListView$State videosStackedListView$State2 = videosStackedListView$State;
        DonutVideoUiModel donutVideoUiModel = videosStackedListView$State2.k;
        VideoFile videoFile = videosStackedListView$State2.g;
        VideoRestriction O = videoFile.O();
        boolean c = this.c.c(videoFile);
        CatalogViewStyle catalogViewStyle = videosStackedListView$State2.i;
        String str = videosStackedListView$State2.h;
        w3k0 w3k0Var = this.e;
        boolean z3 = w3k0Var.c;
        boolean z4 = this.d;
        Context context = this.b;
        b.C0795b c0795b = b.C0795b.a;
        if (z3) {
            if (w3k0Var.e(catalogViewStyle, str) && myc0.f(videoFile.P())) {
                P = videoFile instanceof MusicVideoFile ? c0795b.c(context, (MusicVideoFile) videoFile).toString() : videoFile.P();
            }
            P = null;
        } else if (videoFile instanceof MusicVideoFile) {
            P = c0795b.c(context, (MusicVideoFile) videoFile).toString();
        } else {
            if (!w3k0Var.d(videoFile)) {
                boolean f = new Regex(w3k0.i).f(str);
                if (!z4) {
                    List list = (List) w3k0.h.getValue();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((Regex) it.next()).f(str)) {
                                break;
                            }
                        }
                    }
                    if (!f) {
                        P = w3k0.b(context, videoFile);
                    }
                }
                P = videoFile.P();
            }
            P = null;
        }
        if (w3k0Var.c) {
            if (w3k0Var.e(catalogViewStyle, str) && myc0.f(videoFile.P()) && !(videoFile instanceof MusicVideoFile)) {
                VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                VerifyInfoHelper.a.d(context, false, videoFile.Y(), (r14 & 8) != 0 ? false : false, (r14 & 16) != 0, (r14 & 32) != 0 ? false : false);
                s3q0Var = s3q0.a;
            }
            s3q0Var = null;
        } else {
            boolean f2 = new Regex(w3k0.i).f(str);
            if (!z4) {
                List list2 = (List) w3k0.h.getValue();
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((Regex) it2.next()).f(str)) {
                            break;
                        }
                    }
                }
            }
            VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
            VerifyInfoHelper.a.d(context, false, videoFile.Y(), (r14 & 8) != 0 ? false : false, (r14 & 16) != 0, (r14 & 32) != 0 ? false : false);
            s3q0Var = s3q0.a;
        }
        boolean z5 = false;
        boolean z6 = s3q0Var != null;
        if (O == null || !c) {
            if (donutVideoUiModel == null || (e = donutVideoUiModel.e()) == null) {
                Integer a = hng.a(videoFile.getPrivacy());
                nVar = kpt0.e(videoFile) ? a != null ? new PreviewViewState.n(rmw.a.a(a.intValue()), null, null, VkColorToken.TextContrast, 4) : null : null;
            } else {
                nVar = new PreviewViewState.l(mno0.b.b(new hue(e, 13)), nno0.e(e.d()));
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
                    b = PreviewViewState.a0.b(d2, true, durationBadge, dVar, null, null, null, null, null, new PreviewViewState.w(TimelineViewState.a.a(longValue, v42 != null ? v42.longValue() : 0L, videoFile.getDuration())), VkColorToken.ImagePlaceholderAlpha, 496);
                }
            }
            z = false;
            PreviewViewState.DurationBadge durationBadge2 = new PreviewViewState.DurationBadge(d3, false, !z ? PreviewViewState.DurationBadge.IconState.MusicNote : null, 2);
            Long v43 = videoFile.v4();
            if (v43 == null) {
            }
            Long v422 = videoFile.v4();
            b = PreviewViewState.a0.b(d2, true, durationBadge2, dVar, null, null, null, null, null, new PreviewViewState.w(TimelineViewState.a.a(longValue, v422 != null ? v422.longValue() : 0L, videoFile.getDuration())), VkColorToken.ImagePlaceholderAlpha, 496);
        } else {
            PlaceholderViewState placeholderViewState = new PlaceholderViewState(smw.d(O.Db().b), nno0.e(O.getTitle()), null, null, null, 28);
            boolean Ab = O.Ab();
            PreviewViewState.a0 a0Var = PreviewViewState.a0.a;
            b = Ab ? a0Var.a(smw.d(videoFile.getImage().b), true, placeholderViewState) : a0Var.d(true, placeholderViewState);
        }
        VideoMetaViewState.c cVar = (donutVideoUiModel == null || (d = donutVideoUiModel.d()) == null) ? null : new VideoMetaViewState.c(mno0.b.b(new ncb(d, 17)), d.d());
        VideoCardViewState videoCardViewState = new VideoCardViewState(b, VideoCardViewState.a.b(new VideoMetaViewState(new VideoMetaViewState.i(nno0.e(videoFile.getTitle()), 1), new VideoMetaViewState.a(!z4 ? cVar : null, null, P != null ? nno0.e(P) : null, z6, kpt0.g(videoFile), nno0.d(pls0.b(context, videoFile)), z4 ? cVar : null, 0, 130), 4), !w3k0Var.c(videoFile, str, videosStackedListView$State2.d), 1));
        BlockId.CompositeId compositeId = videosStackedListView$State2.b;
        f5o f5oVar = this.g;
        if (f5oVar != null && f5oVar.a()) {
            z5 = true;
        }
        return new rtt0(compositeId, videoCardViewState, kpt0.h(videoFile, z5, this.f.J().Y1()));
    }
}
