package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.design.view.buttons.EpisodeButton;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.cq5;

/* compiled from: BottomInfoView.kt */
/* loaded from: classes16.dex */
public final class a58 extends com.vk.catalog2.common.ui.holders.video.info_overlays.a {
    public final k7a d;
    public final boolean e;
    public final boolean f;
    public final boolean g = true;
    public final cqs0 h = new cqs0(null, 3);
    public TextView i;
    public VKAvatarView j;
    public TextView k;
    public View l;
    public ImageView m;
    public EpisodeButton n;
    public DurationView o;
    public yok0 p;
    public final Object q;
    public final Object r;
    public final int s;

    public a58(k7a k7aVar, boolean z, boolean z2) {
        this.d = k7aVar;
        this.e = z;
        this.f = z2;
        com.vk.movika.sdk.base.model.props.d dVar = new com.vk.movika.sdk.base.model.props.d(7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.q = msy.a(lazyThreadSafetyMode, dVar);
        this.r = msy.a(lazyThreadSafetyMode, new com.vk.movika.tools.controls.seekbar.n(8));
        this.s = z2 ? 0 : this.c;
    }

    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void a(VideoFile videoFile, UIBlock uIBlock, gqs0 gqs0Var) {
        Context context;
        String string;
        EpisodeButton episodeButton;
        String str;
        Context context2;
        DurationView durationView;
        Trace.beginSection("BottomInfoView.bindVideo");
        try {
            AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
            if (aspectRatioFrameLayout != null && (context = aspectRatioFrameLayout.getContext()) != null) {
                TextView textView = this.i;
                if (textView == null) {
                    Trace.endSection();
                    return;
                }
                VKAvatarView vKAvatarView = this.j;
                if (vKAvatarView == null) {
                    Trace.endSection();
                    return;
                }
                h(videoFile, gqs0Var);
                DurationView durationView2 = this.o;
                boolean z = true;
                if (durationView2 != null && (context2 = durationView2.getContext()) != null && (durationView = this.o) != null) {
                    durationView.setText(gpt0.m(context2, videoFile, true, false));
                }
                View view = this.l;
                if (view != null) {
                    view.setVisibility(8);
                }
                Owner s = videoFile.s();
                if (s == null || (str = s.c) == null || (string = context.getString(R.string.accessibility_video_author_avatar_with_name, str)) == null) {
                    string = context.getString(R.string.accessibility_video_author_avatar);
                }
                vKAvatarView.setContentDescription(string);
                if (((Boolean) this.q.getValue()).booleanValue()) {
                    far0 far0Var = vKAvatarView.m;
                    far0Var.h.clear();
                    far0Var.a.invalidate();
                }
                if (!(videoFile instanceof MusicVideoFile) || ((Boolean) this.r.getValue()).booleanValue()) {
                    g(textView, vKAvatarView, videoFile);
                } else {
                    f(context, textView, vKAvatarView, (MusicVideoFile) videoFile);
                }
                MusicVideoFile musicVideoFile = videoFile instanceof MusicVideoFile ? (MusicVideoFile) videoFile : null;
                if (musicVideoFile == null || !musicVideoFile.A1) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, textView.getContext()), (Drawable) null);
                    textView.setCompoundDrawablePadding(iah0.a(4));
                }
                boolean isEmpty = videoFile.Y3().isEmpty();
                UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
                if (uIBlockVideo == null || !uIBlockVideo.C || isEmpty) {
                    z = false;
                }
                if (z && (episodeButton = this.n) != null) {
                    episodeButton.P4(videoFile);
                }
                EpisodeButton episodeButton2 = this.n;
                if (episodeButton2 != null) {
                    episodeButton2.setVisibility(z ? 0 : 8);
                }
                ImageView imageView = this.m;
                if (imageView != null) {
                    imageView.setVisibility(fxc0.B().c(videoFile) ? 8 : 0);
                }
                s3q0 s3q0Var = s3q0.a;
                Trace.endSection();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void b(LayoutInflater layoutInflater, LinearLayout linearLayout, AspectRatioFrameLayout aspectRatioFrameLayout, View.OnClickListener onClickListener, izs izsVar) {
        this.b = aspectRatioFrameLayout;
        float f = 4;
        f4m.y(iah0.a(f), linearLayout);
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.catalog_video_bottom_info_view_nft_support, (ViewGroup) linearLayout, true);
        this.k = (TextView) viewGroup.findViewById(R.id.subtitle);
        this.j = (VKAvatarView) viewGroup.findViewById(R.id.avatar);
        this.i = (TextView) viewGroup.findViewById(R.id.title);
        View findViewById = viewGroup.findViewById(R.id.like);
        this.l = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new pi6(onClickListener, 2));
        }
        izsVar.invoke(this.l);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.menu);
        this.m = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new pi6(onClickListener, 2));
        }
        VKAvatarView vKAvatarView = this.j;
        if (vKAvatarView != null) {
            vKAvatarView.setOnClickListener(new pi6(onClickListener, 2));
        }
        EpisodeButton episodeButton = (EpisodeButton) viewGroup.findViewById(R.id.episodes);
        this.n = episodeButton;
        if (episodeButton != null) {
            episodeButton.setOnClickListener(new pi6(onClickListener, 2));
        }
        ViewGroup viewGroup2 = (ViewGroup) linearLayout.findViewById(R.id.duration_holder);
        this.o = viewGroup2 != null ? (DurationView) viewGroup2.findViewById(R.id.duration) : null;
        VKAvatarView vKAvatarView2 = this.j;
        if (vKAvatarView2 != null) {
            awt0.o(vKAvatarView2, new hb(vKAvatarView2, 11));
            if (((Boolean) this.q.getValue()).booleanValue()) {
                vKAvatarView2.setAvatarBorderConfigParamsOverride(o9r0.a(vKAvatarView2.getAvatarBorderConfigParamsOverride(), false, null, null, Float.valueOf(cn70.c(4)), null, null, null, null, true, 1015));
                ViewGroup.LayoutParams layoutParams = vKAvatarView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = cn70.b(4) + e3m.a(R.dimen.video_catalog_large_avatar_supported_nft_item_height, vKAvatarView2.getContext());
                vKAvatarView2.setLayoutParams(layoutParams);
                f4m.v(cn70.b(4), vKAvatarView2);
            }
        }
        if (this.f) {
            VKAvatarView vKAvatarView3 = this.j;
            if (vKAvatarView3 != null) {
                f4m.s(0, vKAvatarView3);
            }
            TextView textView = this.i;
            if (textView != null) {
                f4m.r(iah0.a(f), textView);
            }
            TextView textView2 = this.k;
            if (textView2 != null) {
                f4m.t(iah0.a(2), textView2);
            }
            ImageView imageView2 = this.m;
            if (imageView2 != null) {
                imageView2.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_primary, linearLayout.getContext())));
                bwt0.r0(iah0.a(12), imageView2);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final int c() {
        return this.s;
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final boolean d() {
        return this.g;
    }

    public final void f(Context context, TextView textView, VKAvatarView vKAvatarView, MusicVideoFile musicVideoFile) {
        Image image;
        ImageSize Cb;
        textView.setText(s490.d(context, musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary));
        this.d.b(vKAvatarView, ContentType.ARTIST, CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, CatalogViewType.LIST, -1.0f);
        vKAvatarView.setPlaceholderImage(R.drawable.user_placeholder);
        int width = vKAvatarView.getWidth();
        List<Artist> list = musicVideoFile.B1;
        String str = null;
        Artist artist = list != null ? (Artist) j5g.a0(list) : null;
        if (artist != null && (image = artist.f) != null && (Cb = image.Cb(width, true, false)) != null) {
            str = Cb.d.d;
        }
        VKAvatarView.Z0(vKAvatarView, str, null, AvatarBorderType.CIRCLE, null, 10);
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void g(TextView textView, VKAvatarView vKAvatarView, VideoFile videoFile) {
        Owner s;
        textView.setText(videoFile.getTitle());
        this.d.b(vKAvatarView, fkq0.b(videoFile.I0()) ? ContentType.GROUP : ContentType.PROFILE, CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, CatalogViewType.LIST, -1.0f);
        vKAvatarView.setPlaceholderImage(R.drawable.user_placeholder);
        boolean z = ((Boolean) this.q.getValue()).booleanValue() && (s = videoFile.s()) != null && s.w;
        String M0 = videoFile.M0();
        Owner s2 = videoFile.s();
        VKAvatarView.Z0(vKAvatarView, M0, null, (s2 == null || !s2.i(1024)) ? AvatarBorderType.CIRCLE : AvatarBorderType.HEXAGON, z ? cq5.g.a : cq5.b.a, 2);
        if (z) {
            com.vk.core.view.components.avatar.badge.b bVar = new com.vk.core.view.components.avatar.badge.b(null, true, null, null, 27);
            far0 far0Var = vKAvatarView.m;
            far0Var.h.add(bVar);
            far0Var.a.invalidate();
        }
    }

    public final void h(VideoFile videoFile, gqs0 gqs0Var) {
        Throwable th;
        Context context;
        VideoInfoTextView videoInfoTextView;
        Trace.beginSection("BottomInfoView.bindSubtitleView");
        try {
            AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
            if (aspectRatioFrameLayout == null || (context = aspectRatioFrameLayout.getContext()) == null) {
                Trace.endSection();
                return;
            }
            if (this.k == null) {
                Trace.endSection();
                return;
            }
            fqs0 fqs0Var = gqs0Var == null ? null : new fqs0(2, gqs0Var.a, null, 4);
            TextView textView = this.k;
            if (textView instanceof VideoInfoTextView) {
                try {
                    videoInfoTextView = (VideoInfoTextView) textView;
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } else {
                videoInfoTextView = null;
            }
            if (videoInfoTextView != null) {
                videoInfoTextView.setMaxLines((gqs0Var != null ? gqs0Var.a : null) != null ? 3 : 2);
            }
            try {
                if (fxc0.B().J().O()) {
                    TextView textView2 = this.k;
                    if (textView2 != null) {
                        textView2.setText("");
                    }
                    yok0 yok0Var = this.p;
                    if (yok0Var != null) {
                        yok0Var.b(null);
                    }
                    try {
                        this.p = myc0.h(zvj.a(hqu0.a()), null, null, new z48(this, videoFile, context, fqs0Var, null), 3);
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    zps0 c = this.e ? this.h.c(videoFile, context, fqs0Var) : cqs0.f(this.h, videoFile, context, null, fqs0Var, 4);
                    TextView textView3 = this.k;
                    VideoInfoTextView videoInfoTextView2 = textView3 instanceof VideoInfoTextView ? (VideoInfoTextView) textView3 : null;
                    if (videoInfoTextView2 != null) {
                        videoInfoTextView2.setText(c);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                }
                Trace.endSection();
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
