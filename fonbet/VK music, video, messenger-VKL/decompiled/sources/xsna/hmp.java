package xsna;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.FlowLayout;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.Image;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.discover.description.FeedDiscoverDescriptionView;
import com.vk.feed.design.view.newsfeed.discover.video.EnhancedFeedVideoDiscoverItemView;
import com.vk.feed.design.view.newsfeed.discover.video.FeedVideoDiscoverItemView;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.am;
import xsna.fh5;

/* compiled from: EnhancedVideoDiscoverGridItemV3Holder.kt */
/* loaded from: classes4.dex */
public final class hmp extends uc6<VideoDiscoverGridItem> implements View.OnAttachStateChangeListener, ent0, sj0, fh5.b {
    public final EnhancedFeedVideoDiscoverItemView I;
    public final com.vk.libvideo.autoplay.b J;
    public final fh5 K;
    public final com.vk.libvideo.autoplay.a L;
    public final Object M;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    public hmp(ViewGroup viewGroup, m2c0 m2c0Var, h170 h170Var) {
        super(tf3.b(viewGroup, R.layout.item_discover_grid_enhanced_video_v3, viewGroup, false), viewGroup);
        EnhancedFeedVideoDiscoverItemView enhancedFeedVideoDiscoverItemView = (EnhancedFeedVideoDiscoverItemView) this.itemView;
        this.I = enhancedFeedVideoDiscoverItemView;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        this.J = b.C1208b.a();
        this.L = new com.vk.libvideo.autoplay.a(false, RepeatMode.BY_VIDEO_PARAMS, null, false, false, false, null, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, null, null, null, false, null, 519165);
        this.M = msy.a(LazyThreadSafetyMode.NONE, new qzg(m2c0Var, 12));
        enhancedFeedVideoDiscoverItemView.setUseThumbHash(((Boolean) h170Var.H.getValue()).booleanValue() && h170Var.h());
        enhancedFeedVideoDiscoverItemView.setOnClickListener(this);
        enhancedFeedVideoDiscoverItemView.setOnLongClickListener(this);
        iut0.o(enhancedFeedVideoDiscoverItemView, am.a.e, this.itemView.getContext().getString(R.string.accessibility_discover_media_go), null);
        iut0.o(enhancedFeedVideoDiscoverItemView, am.a.f, this.itemView.getContext().getString(R.string.accessibility_discover_media_open_menu), null);
        fh5 fh5Var = new fh5(this, enhancedFeedVideoDiscoverItemView.i, enhancedFeedVideoDiscoverItemView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, enhancedFeedVideoDiscoverItemView.h, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, new jh5(false), null, -4194328, 23);
        this.K = fh5Var;
        fh5Var.z0 = this;
        enhancedFeedVideoDiscoverItemView.setOnErrorViewClickListener(new gmp(this, 0));
        this.itemView.addOnAttachStateChangeListener(this);
        enhancedFeedVideoDiscoverItemView.setPreviewPlaceholder(new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, this.itemView.getContext())));
        enhancedFeedVideoDiscoverItemView.setDontLoadAgainIfSameResource(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        enhancedFeedVideoDiscoverItemView.d = 1;
        enhancedFeedVideoDiscoverItemView.e = truncateAt;
        FeedDiscoverDescriptionView feedDiscoverDescriptionView = enhancedFeedVideoDiscoverItemView.k;
        if (feedDiscoverDescriptionView != null) {
            feedDiscoverDescriptionView.b(1, truncateAt);
        }
        enhancedFeedVideoDiscoverItemView.f = 2;
        enhancedFeedVideoDiscoverItemView.g = truncateAt;
        FeedDiscoverDescriptionView feedDiscoverDescriptionView2 = enhancedFeedVideoDiscoverItemView.k;
        if (feedDiscoverDescriptionView2 != null) {
            feedDiscoverDescriptionView2.a(2, truncateAt);
        }
    }

    @Override // xsna.fh5.b
    public final void U1(fh5.a aVar) {
        if (aVar.b()) {
            this.K.n0();
        }
        EnhancedFeedVideoDiscoverItemView enhancedFeedVideoDiscoverItemView = this.I;
        boolean z = (enhancedFeedVideoDiscoverItemView.o == aVar.e && enhancedFeedVideoDiscoverItemView.p == aVar.c()) ? false : true;
        enhancedFeedVideoDiscoverItemView.setLoadingState(aVar.e);
        enhancedFeedVideoDiscoverItemView.setErrorState(aVar.c());
        if (z) {
            this.itemView.requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uc6
    public final void U6(VideoDiscoverGridItem videoDiscoverGridItem) {
        NewsEntry.TrackData Cb;
        VideoDiscoverGridItem videoDiscoverGridItem2 = videoDiscoverGridItem;
        VideoAttachment videoAttachment = videoDiscoverGridItem2.j;
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        b6n b6nVar = ol60Var instanceof b6n ? (b6n) ol60Var : null;
        if (b6nVar != null) {
            VideoFile videoFile = videoAttachment.k;
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            yg5 e = this.J.e(videoFile, null);
            videoAttachment.Kb(e.V());
            e.Q(false);
            fh5 fh5Var = this.K;
            fh5Var.A0 = null;
            PostInteract postInteract = videoAttachment.g;
            String str = postInteract != null ? postInteract.b : null;
            fh5Var.w(videoAttachment.l);
            NewsEntry q6 = q6();
            fh5Var.l = (q6 == null || (Cb = q6.Cb()) == null) ? null : Cb.b;
            fh5Var.s(str);
            fh5Var.k(videoAttachment.k, e, this.L);
            String str2 = b6nVar.h;
            ArrayList arrayList = b6nVar.r;
            String F5 = videoAttachment.k.F5();
            EnhancedFeedVideoDiscoverItemView enhancedFeedVideoDiscoverItemView = this.I;
            VkEnhancedImageView vkEnhancedImageView = enhancedFeedVideoDiscoverItemView.h;
            if (enhancedFeedVideoDiscoverItemView.b) {
                String b = com.vk.toggle.d.s().b(F5, enhancedFeedVideoDiscoverItemView.b);
                if (b != null) {
                    vkEnhancedImageView.setThumbHash(b);
                }
                vkEnhancedImageView.setRemoteImage(new Image(String.valueOf(str2)));
            } else {
                vkEnhancedImageView.o0(str2, null);
            }
            enhancedFeedVideoDiscoverItemView.setForeground(b6nVar.p);
            FlowLayout flowLayout = enhancedFeedVideoDiscoverItemView.m;
            if (flowLayout != null) {
                f4m.j(flowLayout);
                if (flowLayout.getChildCount() != 0) {
                    flowLayout.removeAllViews();
                }
            }
            ?? r0 = this.M;
            ((x1n) r0.getValue()).b();
            if (!b6nVar.k || b6nVar.m) {
                enhancedFeedVideoDiscoverItemView.setBottom((FeedVideoDiscoverItemView.a) null);
                if (!arrayList.isEmpty()) {
                    ArrayList<ean> arrayList2 = ((x1n) r0.getValue()).a.c;
                    arrayList2.clear();
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList2.addAll(arrayList);
                    }
                    x1n x1nVar = (x1n) r0.getValue();
                    FlowLayout flowLayout2 = enhancedFeedVideoDiscoverItemView.m;
                    if (flowLayout2 == null) {
                        flowLayout2 = new FlowLayout(enhancedFeedVideoDiscoverItemView.getContext());
                        flowLayout2.setId(R.id.discover_grid_item_tags);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 8388691;
                        layoutParams.leftMargin = cn70.b(8);
                        layoutParams.topMargin = cn70.b(2);
                        layoutParams.rightMargin = cn70.b(8);
                        layoutParams.bottomMargin = cn70.b(2);
                        flowLayout2.setLayoutParams(layoutParams);
                        flowLayout2.setRowsStartFromBottom(true);
                        enhancedFeedVideoDiscoverItemView.m = flowLayout2;
                        enhancedFeedVideoDiscoverItemView.addView(flowLayout2);
                    }
                    flowLayout2.setVisibility(0);
                    int tagsCount = x1nVar.getTagsCount();
                    for (int i = 0; i < tagsCount; i++) {
                        flowLayout2.addView(x1nVar.a(i, flowLayout2));
                    }
                }
            } else {
                enhancedFeedVideoDiscoverItemView.setTextStyle(b6nVar.l ? FeedVideoDiscoverItemView.TextStyle.Small : FeedVideoDiscoverItemView.TextStyle.Medium);
                DiscoverGridItem.a aVar = videoDiscoverGridItem2.g;
                String str3 = aVar.a;
                String str4 = aVar.c;
                enhancedFeedVideoDiscoverItemView.setBottom(new FeedVideoDiscoverItemView.a.C1049a(str3, str4 != null ? str4.toString() : null));
            }
            enhancedFeedVideoDiscoverItemView.setContentDescription(b6nVar.n);
        }
    }

    @Override // xsna.fh5.b
    public final void i5(fh5.a aVar, fh5.a aVar2) {
        if (aVar.b() == aVar2.b() && aVar.f() == aVar2.f() && aVar.e == aVar2.e && aVar.c() == aVar2.c()) {
            return;
        }
        U1(aVar2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.K.S();
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.K;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
