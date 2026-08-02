package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.hzp0;

/* compiled from: CommunityProfileBaseLiveVideosViewHolder.kt */
/* loaded from: classes5.dex */
public abstract class reh extends vif0<VideoFile> implements sj0, ent0 {
    public final LinearLayout A;
    public VideoFile B;
    public boolean C;
    public final g7s0 n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final com.vk.catalog2.common.ui.mvp.holder.video.c t;
    public final VkText u;
    public final AspectRatioFrameLayout v;
    public final VideoOverlayView w;
    public final VideoTextureView x;
    public final VKImageView y;
    public final DurationView z;

    /* compiled from: CommunityProfileBaseLiveVideosViewHolder.kt */
    public final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reh(Context context, boolean z) {
        super(new LinearLayout(context));
        g7s0 B = fxc0.B();
        this.n = B;
        nh nhVar = new nh(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, nhVar);
        this.p = msy.a(lazyThreadSafetyMode, new sv0(9));
        this.q = msy.a(lazyThreadSafetyMode, new uv0(7));
        this.r = msy.a(lazyThreadSafetyMode, new yqf(this, 3));
        this.s = msy.a(lazyThreadSafetyMode, new zqf(this, 3));
        com.vk.catalog2.common.ui.mvp.holder.video.c cVar = new com.vk.catalog2.common.ui.mvp.holder.video.c(VideoItemListSettings.a.f(VideoItemListSettings.i), VideoItemListLargeVh.a.C0509a.a);
        this.t = cVar;
        a aVar = z ? new a(-1, -2, 0) : new a(iah0.a(320), iah0.a(195), iah0.a(8));
        LinearLayout linearLayout = (LinearLayout) this.itemView;
        VkText vkText = new VkText(context, null, 6, 0);
        this.u = vkText;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context, null, 6);
        this.v = aspectRatioFrameLayout;
        this.w = new VideoOverlayView(context, VideoOverlayView.VideoRestrictionSize.SMALL);
        this.x = new VideoTextureView(context, null, 6, 0);
        this.y = cVar.b(context);
        this.z = new DurationView(context, null, 6);
        this.A = new LinearLayout(context);
        linearLayout.setId(R.id.content);
        int i = aVar.a;
        RecyclerView.p pVar = new RecyclerView.p(i, -1);
        pVar.setMargins(((ViewGroup.MarginLayoutParams) pVar).leftMargin, ((ViewGroup.MarginLayoutParams) pVar).topMargin, aVar.c, ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        linearLayout.setLayoutParams(pVar);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_content));
        linearLayout.setForeground(m33.a(R.drawable.highlight, linearLayout.getContext()));
        bwt0.d(linearLayout, iah0.a(20), (r4 & 2) != 0, (r4 & 4) != 0);
        linearLayout.addView(aspectRatioFrameLayout, i, aVar.b);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setPadding(e3m.a(R.dimen.vk_ui_base_padding_horizontal, linearLayout.getContext()), e3m.a(R.dimen.vk_ui_spacing_size_l, linearLayout.getContext()), e3m.a(R.dimen.vk_ui_base_padding_horizontal, linearLayout.getContext()), e3m.a(R.dimen.vk_ui_spacing_size_l, linearLayout.getContext()));
        vkText.setTextAppearance(vkText.getContext(), R.style.VkUiTypography_SubheadMedium);
        vkText.setMinLines(2);
        vkText.setMaxLines(2);
        vkText.setEllipsize(TextUtils.TruncateAt.END);
        vkText.setTextColor(e3m.f(R.attr.vk_ui_text_primary, vkText.getContext()));
        vkText.setContentDescription(vkText.getContext().getString(R.string.accessibility_more));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(0), -2);
        float f = 2;
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, iah0.a(f), ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, iah0.a(f));
        layoutParams.weight = 1.0f;
        linearLayout2.addView(vkText, layoutParams);
        appCompatImageView.setImageResource(R.drawable.vk_icon_more_vertical_16);
        appCompatImageView.setPadding(e3m.a(R.dimen.vk_ui_spacing_size_m, linearLayout.getContext()), e3m.a(R.dimen.vk_ui_spacing_size_xl, linearLayout.getContext()), appCompatImageView.getPaddingRight(), e3m.a(R.dimen.vk_ui_spacing_size_xl, linearLayout.getContext()));
        bwt0.o0(appCompatImageView, e3m.f(R.attr.vk_ui_icon_secondary, linearLayout.getContext()));
        bwt0.i0(appCompatImageView, new com.vk.movika.sdk.base.observable.k(this, 26));
        appCompatImageView.setContentDescription(linearLayout.getContext().getString(R.string.videos_suggested_all));
        linearLayout2.addView(appCompatImageView, iah0.a(16), iah0.a(40));
        linearLayout.addView(linearLayout2, -1, -2);
        bwt0.i0(linearLayout, new mre(this, 7));
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    public final void i6(VideoFile videoFile) {
        VideoFile A;
        VideoFile videoFile2 = videoFile;
        if (epx.f(this.B, videoFile2) || videoFile2 == null) {
            return;
        }
        this.B = videoFile2;
        boolean z = this.C;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.v;
        boolean z2 = true;
        if (!z) {
            this.C = true;
            s6(aspectRatioFrameLayout);
        }
        q6(videoFile2, new com.vk.libvideo.autoplay.a(false, RepeatMode.BY_VIDEO_PARAMS, null, false, false, true, null, null, null, null, PlayerType.INLINE, ScreenType.INLINE, false, null, 424956));
        aspectRatioFrameLayout.setAspectRation(1.7777778f);
        bpn0 bpn0Var = VideoOverlayView.I;
        boolean c = this.n.c(videoFile2);
        VideoRestriction O = videoFile2.O();
        String str = null;
        com.vk.libvideo.design.view.overlay.b a2 = O != null ? ((a390) this.q.getValue()).a(O) : null;
        if (!videoFile2.d8() && !videoFile2.z0()) {
            z2 = false;
        }
        boolean z3 = z2;
        VideoPipStateHolder.a.getClass();
        yg5 c2 = VideoPipStateHolder.c();
        if (c2 != null && (A = c2.A()) != null) {
            str = A.a1();
        }
        VideoOverlayView.b.a(new VideoOverlayView.a(this.y, this.w, new k75(3, this, videoFile2), null, this.z, true, false, c, new y4(6, this, videoFile2), new cm(8, this, videoFile2), a2, z3, epx.f(str, videoFile2.a1()), new sje(this, 7), (i1t0) this.r.getValue(), null, 65704));
        this.u.setText(videoFile2.getTitle());
        new hzp0.l(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile2.o0()), Long.valueOf(videoFile2.I0().b), null, null, null, 56, null), MobileOfficialAppsCoreNavStat$EventScreen.COMMUNITY_PAGE, new com.vk.stat.scheme.f0(), getBindingAdapterPosition()).a();
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return t6();
    }

    public abstract void q6(VideoFile videoFile, com.vk.libvideo.autoplay.a aVar);

    public abstract void s6(FrameLayout frameLayout);

    public abstract uc t6();
}
