package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.ui.CircularProgressView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.newsfeed.common.views.video.VideoAutoPlayHolderView;
import com.vkontakte.android.R;

/* compiled from: ClipsBlockItemHolderView.kt */
/* loaded from: classes4.dex */
public final class zjd extends RatioFrameLayout {
    public final VideoTextureView e;
    public final FrescoImageView f;
    public final ImageView g;
    public final VideoOverlayView h;
    public final VideoErrorView i;
    public final CircularProgressView j;
    public final AppCompatImageView k;
    public final g690 l;
    public final ViewStub m;
    public final sej0 n;

    public zjd(Context context, boolean z, boolean z2, boolean z3) {
        super(context, null, 0);
        setId(R.id.video_wrap);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setContentDescription(context.getString(R.string.accessibility_video));
        setOrientation(0);
        VideoTextureView b = VideoAutoPlayHolderView.a.b(context);
        this.e = b;
        addView(b);
        FrescoImageView g = VideoAutoPlayHolderView.a.g(context);
        this.f = g;
        addView(g);
        ImageView f = VideoAutoPlayHolderView.a.f(context);
        this.g = f;
        addView(f);
        VideoOverlayView e = VideoAutoPlayHolderView.a.e(context);
        this.h = e;
        addView(e);
        VideoErrorView c = VideoAutoPlayHolderView.a.c(context);
        this.i = c;
        addView(c);
        CircularProgressView d = VideoAutoPlayHolderView.a.d(context);
        this.j = d;
        addView(d);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.video_single_clip_like);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        bwt0.p0(appCompatImageView, false);
        bwt0.o0(appCompatImageView, -1);
        f4m.m(8388693, appCompatImageView);
        int a = iah0.a(12);
        float f2 = 8;
        int a2 = iah0.a(f2);
        appCompatImageView.setPadding(a, a2, a, a2);
        this.k = appCompatImageView;
        addView(appCompatImageView);
        if (z) {
            g690 g690Var = new g690(context);
            g690Var.setId(R.id.clip_ozon_badge);
            bwt0.p0(g690Var, false);
            f4m.m(8388691, g690Var);
            int a3 = iah0.a(f2);
            f4m.s(a3, g690Var);
            f4m.q(a3, g690Var);
            this.l = g690Var;
            addView(g690Var);
        } else {
            this.l = null;
        }
        if (z2) {
            ViewStub viewStub = new ViewStub(context);
            viewStub.setId(R.id.clip_trend_badge_stub);
            viewStub.setLayoutResource(R.layout.trend_badge_layout);
            viewStub.setInflatedId(R.id.clip_trend_badge);
            this.m = viewStub;
            addView(viewStub);
        } else {
            this.m = null;
        }
        if (!z3) {
            this.n = null;
            return;
        }
        sej0 sej0Var = new sej0(context);
        sej0Var.setId(R.id.clip_shops_badge);
        sej0Var.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        bwt0.p0(sej0Var, false);
        f4m.m(8388691, sej0Var);
        int a4 = iah0.a(f2);
        f4m.s(a4, sej0Var);
        f4m.r(a4, sej0Var);
        f4m.q(a4, sej0Var);
        this.n = sej0Var;
        addView(sej0Var);
    }

    public final View getOzonBadge() {
        return this.l;
    }

    public final sej0 getShopsBadge() {
        return this.n;
    }

    public final ViewStub getTrendBadgeViewStub() {
        return this.m;
    }

    public final VideoTextureView getVideoDisplay() {
        return this.e;
    }

    public final VideoErrorView getVideoError() {
        return this.i;
    }

    public final ImageView getVideoLike() {
        return this.k;
    }

    public final CircularProgressView getVideoLoader() {
        return this.j;
    }

    public final VideoOverlayView getVideoOverlay() {
        return this.h;
    }

    public final ImageView getVideoPlay() {
        return this.g;
    }

    public final FrescoImageView getVideoPreview() {
        return this.f;
    }
}
