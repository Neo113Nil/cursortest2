package one.video.ad.ux.playpause;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.dv2;
import xsna.ep6;
import xsna.gzs;
import xsna.k9q0;
import xsna.lva0;
import xsna.nm80;
import xsna.s3q0;
import xsna.wn80;
import xsna.x4u0;
import xsna.ybq;

/* compiled from: PlayPauseFrameView.kt */
/* loaded from: classes8.dex */
public final class PlayPauseFrameView extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public gzs<s3q0> b;
    public final nm80 c;
    public final bpn0 d;

    public PlayPauseFrameView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static void a(PlayPauseFrameView playPauseFrameView) {
        x4u0 visibilityHelper = playPauseFrameView.getVisibilityHelper();
        boolean z = visibilityHelper.c;
        AppCompatImageView appCompatImageView = visibilityHelper.a;
        if (z) {
            appCompatImageView.removeCallbacks(visibilityHelper.d);
        } else {
            appCompatImageView.postDelayed(visibilityHelper.d, 2000L);
        }
        playPauseFrameView.b.invoke();
    }

    public static void b(PlayPauseFrameView playPauseFrameView) {
        x4u0 visibilityHelper = playPauseFrameView.getVisibilityHelper();
        boolean z = visibilityHelper.b;
        ObjectAnimator objectAnimator = visibilityHelper.f;
        ObjectAnimator objectAnimator2 = visibilityHelper.e;
        AppCompatImageView appCompatImageView = visibilityHelper.a;
        if (z) {
            appCompatImageView.removeCallbacks(visibilityHelper.d);
            if (objectAnimator2.isRunning()) {
                objectAnimator2.end();
            }
            objectAnimator.start();
            return;
        }
        appCompatImageView.removeCallbacks(visibilityHelper.d);
        if (objectAnimator.isRunning()) {
            objectAnimator.end();
        }
        objectAnimator2.start();
        if (visibilityHelper.c) {
            appCompatImageView.postDelayed(visibilityHelper.d, 2000L);
        }
    }

    private final x4u0 getVisibilityHelper() {
        return (x4u0) this.d.getValue();
    }

    public final void c(boolean z) {
        setVisibility(0);
        getVisibilityHelper().c = z;
        AppCompatImageView appCompatImageView = this.c.b;
        int i = wn80.a;
        appCompatImageView.setImageResource(z ? R.drawable.one_video_icon_pause_button_64 : R.drawable.one_video_icon_play_button_64);
    }

    public final gzs<s3q0> getPlayPauseClickListener() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x4u0 visibilityHelper = getVisibilityHelper();
        AppCompatImageView appCompatImageView = visibilityHelper.a;
        appCompatImageView.removeCallbacks(visibilityHelper.d);
        visibilityHelper.e.isRunning();
        visibilityHelper.b = false;
        appCompatImageView.setVisibility(8);
        appCompatImageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (i == 8) {
            x4u0 visibilityHelper = getVisibilityHelper();
            AppCompatImageView appCompatImageView = visibilityHelper.a;
            appCompatImageView.removeCallbacks(visibilityHelper.d);
            visibilityHelper.e.isRunning();
            visibilityHelper.b = false;
            appCompatImageView.setVisibility(8);
            appCompatImageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final void setPlayPauseClickListener(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    public PlayPauseFrameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public PlayPauseFrameView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ PlayPauseFrameView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public PlayPauseFrameView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new dv2(27);
        LayoutInflater.from(context).inflate(R.layout.one_video_play_pause_frame_view, this);
        AppCompatImageView appCompatImageView = (AppCompatImageView) k9q0.j(R.id.button_play_pause, this);
        if (appCompatImageView != null) {
            this.c = new nm80(this, appCompatImageView);
            this.d = new bpn0(new lva0(this, 0));
            ep6 ep6Var = new ep6(this, 5);
            appCompatImageView.setOnClickListener(new ybq(this, 6));
            setOnClickListener(ep6Var);
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(R.id.button_play_pause)));
    }
}
