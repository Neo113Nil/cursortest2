package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vk.video.ui.discovery.minimizable.related_videos.h;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BaseVideoRelatedVideosCollapsedContainerView.kt */
/* loaded from: classes7.dex */
public abstract class cr6 extends ConstraintLayout {
    public static final /* synthetic */ int D = 0;
    public com.vk.video.ui.discovery.minimizable.related_videos.h A;
    public VideoMinimizableState B;
    public boolean C;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public izs<? super c.s0.a, s3q0> x;
    public boolean y;
    public boolean z;

    public cr6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ConstraintLayout getContainerView() {
        return (ConstraintLayout) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageButton getIconView() {
        return (ImageButton) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getSubtitleView() {
        return (TextView) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getTitleView() {
        return (TextView) this.u.getValue();
    }

    public final void P4(com.vk.video.ui.discovery.minimizable.related_videos.h hVar) {
        this.A = hVar;
        if (Q4()) {
            getContainerView().setVisibility(4);
            this.z = false;
            return;
        }
        if (!(hVar instanceof h.a)) {
            if (!(hVar instanceof h.c) && !hVar.equals(h.b.a) && !hVar.equals(h.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            getContainerView().setVisibility(4);
            this.z = false;
            return;
        }
        h.a aVar = (h.a) hVar;
        getContainerView().setVisibility(0);
        VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource = aVar.h;
        VideoFile videoFile = aVar.b;
        if (!(videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.TemporaryPlaylist) && !(videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = videoDiscoveryRelatedVideosSource.b8().d;
        int i = videoDiscoveryRelatedVideosSource.b8().f;
        com.vk.video.ui.discovery.minimizable.related_videos.m mVar = aVar.f;
        if (!(mVar instanceof m.a)) {
            if (!(mVar instanceof m.b)) {
                if (!epx.f(mVar, m.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            getTitleView().setText(R.string.video_have_not_load_playlist);
            getSubtitleView().setText(getResources().getString(R.string.video_related_videos_playlist_subtitle, str, String.valueOf(videoDiscoveryRelatedVideosSource.b8().f)));
            getIconView().setImageResource(R.drawable.vk_icon_refresh_outline_24);
            this.y = true;
            U4();
            return;
        }
        TextView titleView = getTitleView();
        String title = videoFile != null ? videoFile.getTitle() : null;
        titleView.setText((title == null || title.length() == 0) ? getResources().getString(R.string.video_playlist_last_episode) : getResources().getString(R.string.video_playlist_next_episode, videoFile.getTitle()));
        TextView subtitleView = getSubtitleView();
        if (com.vk.video.ui.discovery.minimizable.related_videos.i.a(aVar) != -1) {
            str = getResources().getString(R.string.video_related_videos_playlist_subtitle, str, getResources().getString(R.string.video_related_videos_playlist_number, Integer.valueOf(com.vk.video.ui.discovery.minimizable.related_videos.i.a(aVar) + 1), Integer.valueOf(i)));
        }
        subtitleView.setText(str);
        getIconView().setImageResource(R.drawable.vk_icon_chevron_up_20);
        this.y = false;
        U4();
    }

    public boolean Q4() {
        return this.C;
    }

    public final void T4(VideoMinimizableState videoMinimizableState) {
        com.vk.video.ui.discovery.minimizable.related_videos.h hVar = this.A;
        if (hVar instanceof h.a) {
            h.a aVar = hVar != null ? (h.a) hVar : null;
            if (!((aVar != null ? aVar.h : null) instanceof VideoDiscoveryRelatedVideosSource.Playlist) || Q4()) {
                return;
            }
            if (!(videoMinimizableState instanceof VideoMinimizableState.Animating)) {
                this.B = videoMinimizableState;
                return;
            }
            VideoMinimizableState videoMinimizableState2 = this.B;
            boolean z = videoMinimizableState2 instanceof VideoMinimizableState.Collapsed;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (z || (videoMinimizableState2 instanceof VideoMinimizableState.FullscreenVertical) || (videoMinimizableState2 instanceof VideoMinimizableState.FullscreenHorizontal)) {
                f = swe0.f(((VideoMinimizableState.Animating) videoMinimizableState).d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f);
            } else if (videoMinimizableState2 instanceof VideoMinimizableState.Expanded) {
                VideoMinimizableState.Animating animating = (VideoMinimizableState.Animating) videoMinimizableState;
                if (!com.vk.libvideo.api.minimizable.a.b(animating, VideoMinimizableState.Expanded.Compact.class, VideoMinimizableState.Expanded.MatchRatio.class)) {
                    f = swe0.f(animating.d, 0.5f, 1.0f);
                }
            }
            boolean z2 = f <= 0.5f;
            if (this.z != z2) {
                if (z2) {
                    d3m.c(getContainerView(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    d3m.e(getContainerView(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
                this.z = z2;
            }
        }
    }

    public final void U4() {
        ConstraintLayout containerView = getContainerView();
        List l = e43.l(getTitleView().getText(), getSubtitleView().getText());
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            if (((CharSequence) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        containerView.setContentDescription(j5g.g0(arrayList, ". ", null, null, 0, null, 62));
    }

    public abstract int getContainerViewId();

    public abstract int getIconViewId();

    public abstract int getSubtitleViewId();

    public abstract int getTitleViewId();

    @Override // android.view.View
    public int getVisibility() {
        return this.z ? 0 : 4;
    }

    public final void setLandscape(boolean z) {
        boolean z2 = this.C;
        this.C = z;
        if (z != z2) {
            P4(this.A);
        }
    }

    public final void setSendAction(izs<? super c.s0.a, s3q0> izsVar) {
        this.x = izsVar;
    }

    public cr6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        ca caVar = new ca(this, 12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, caVar);
        this.u = msy.a(lazyThreadSafetyMode, new px0(this, 8));
        this.v = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.t(this, 9));
        this.w = msy.a(lazyThreadSafetyMode, new sx0(this, 7));
        this.x = new rl2(2);
        this.A = h.d.a;
        this.B = VideoMinimizableState.Hidden.b;
        this.C = getResources().getConfiguration().orientation == 2;
    }
}
