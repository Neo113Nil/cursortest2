package yads;

import android.content.Context;
import android.util.TypedValue;
import android.view.TextureView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.yandex.mobile.ads.R$drawable;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.an10;
import xsna.epx;

/* loaded from: classes10.dex */
public final class j82 {
    public final t0 a;
    public final jj3 b;

    public /* synthetic */ j82() {
        this(new t0(), new jj3());
    }

    public final g82 a(Context context, ej3 ej3Var, hm1 hm1Var, we3 we3Var, int i) {
        hm1 v20Var;
        TextureView textureView = new TextureView(context);
        textureView.setVisibility(8);
        t0 t0Var = this.a;
        gm1 gm1Var = t0Var.b;
        gm1Var.a.getClass();
        ImageView imageView = null;
        if (hm1Var.getMuteControl() == null && hm1Var.getVideoProgress() == null && hm1Var.getCountDownProgress() == null) {
            gm1Var.b.getClass();
            v20Var = (hm1) ft2.a(context, CorePlaybackControlsContainer.class, i, null);
        } else {
            v20Var = new v20(hm1Var.getMuteControl(), hm1Var.getVideoProgress(), hm1Var.getCountDownProgress());
        }
        Button a = t0Var.a.a.a(context);
        a.setTag(lm3.a("replay_button"));
        a.setVisibility(8);
        vo2 vo2Var = new vo2(context, a);
        vo2Var.addView(a);
        o62 o62Var = new o62(context, vo2Var, v20Var);
        t0Var.c.getClass();
        hm1 hm1Var2 = o62Var.b;
        o62Var.a.setVisibility(8);
        CheckBox muteControl = hm1Var2 != null ? hm1Var2.getMuteControl() : null;
        if (muteControl != null) {
            muteControl.setVisibility(8);
        }
        ProgressBar videoProgress = hm1Var2 != null ? hm1Var2.getVideoProgress() : null;
        if (videoProgress != null) {
            videoProgress.setVisibility(8);
        }
        TextView countDownProgress = hm1Var2 != null ? hm1Var2.getCountDownProgress() : null;
        if (countDownProgress != null) {
            countDownProgress.setVisibility(8);
        }
        CheckBox muteControl2 = hm1Var2 != null ? hm1Var2.getMuteControl() : null;
        if (muteControl2 != null) {
            muteControl2.setChecked(epx.b(ej3Var.d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE) || ej3Var.d == null);
        }
        o62Var.setVisibility(8);
        jj3 jj3Var = this.b;
        jj3Var.b.getClass();
        if ((we3Var != null ? we3Var.c : null) != null) {
            imageView = new ImageView(context);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        jk2 jk2Var = jj3Var.a;
        jk2Var.getClass();
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(context.getDrawable(R$drawable.monetization_ads_video_progress_bar_background));
        jk2Var.a.getClass();
        int b = an10.b(TypedValue.applyDimension(1, 45.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        progressBar.setVisibility(8);
        progressBar.setTag(lm3.a("video_placeholder_spinner"));
        ij3 ij3Var = new ij3(context, progressBar, imageView);
        ij3Var.addView(progressBar);
        if (imageView != null) {
            ij3Var.addView(imageView);
        }
        ij3Var.setBackgroundColor(-16777216);
        ij3Var.setVisibility(8);
        g82 g82Var = new g82(context, ij3Var, textureView, o62Var);
        g82Var.addView(ij3Var);
        g82Var.addView(textureView);
        g82Var.addView(o62Var);
        g82Var.setTag(lm3.a("native_video_view"));
        return g82Var;
    }

    public j82(t0 t0Var, jj3 jj3Var) {
        this.a = t0Var;
        this.b = jj3Var;
    }
}
