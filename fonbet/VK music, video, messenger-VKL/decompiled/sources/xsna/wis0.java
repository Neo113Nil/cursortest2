package xsna;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.log.L;
import com.vkontakte.android.R;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

/* compiled from: VideoEmbedFragment.kt */
/* loaded from: classes14.dex */
public final class wis0 extends bir0 {
    public View e;
    public WebChromeClient.CustomViewCallback f;
    public final /* synthetic */ VideoEmbedFragment g;

    public wis0(VideoEmbedFragment videoEmbedFragment) {
        this.g = videoEmbedFragment;
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        VideoFile videoFile = this.g.c0;
        return ((videoFile == null || !videoFile.w8()) && defaultVideoPoster != null) ? defaultVideoPoster : Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        MaterialProgressBar materialProgressBar = new MaterialProgressBar(this.g.requireContext());
        materialProgressBar.setBackgroundResource(R.drawable.video_btn_bg_up);
        materialProgressBar.setPadding(iah0.a(10.0f), iah0.a(10.0f), iah0.a(10.0f), iah0.a(10.0f));
        return materialProgressBar;
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final void onHideCustomView() {
        L.e("vk", "On hide custom view");
        if (this.e == null || this.f == null) {
            return;
        }
        VideoEmbedFragment videoEmbedFragment = this.g;
        xy80 xy80Var = videoEmbedFragment.a0;
        if (xy80Var != null) {
            xy80Var.b(1);
        }
        FrameLayout frameLayout = videoEmbedFragment.X;
        if (frameLayout != null) {
            frameLayout.removeView(this.e);
        }
        this.f.onCustomViewHidden();
        this.e = null;
        this.f = null;
        WebView webView = videoEmbedFragment.S;
        if (webView != null) {
            webView.setVisibility(0);
        }
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        VkSpinnerContent vkSpinnerContent;
        VideoEmbedFragment videoEmbedFragment = this.g;
        if (i == 100 && (vkSpinnerContent = videoEmbedFragment.T) != null && vkSpinnerContent.getVisibility() == 0) {
            d3m.e(videoEmbedFragment.T, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            videoEmbedFragment.i0 = false;
            return;
        }
        VkSpinnerContent vkSpinnerContent2 = videoEmbedFragment.T;
        if (vkSpinnerContent2 != null && vkSpinnerContent2.getVisibility() == 8 && videoEmbedFragment.i0) {
            d3m.c(videoEmbedFragment.T, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        L.e("vk", "on show custom view");
        VideoEmbedFragment videoEmbedFragment = this.g;
        xy80 xy80Var = videoEmbedFragment.a0;
        if (xy80Var != null) {
            xy80Var.b(0);
        }
        if (this.e != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        this.e = view;
        this.f = customViewCallback;
        WebView webView = videoEmbedFragment.S;
        if (webView != null) {
            webView.setVisibility(8);
        }
        FrameLayout frameLayout = videoEmbedFragment.X;
        if (frameLayout != null) {
            frameLayout.addView(this.e, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }
}
