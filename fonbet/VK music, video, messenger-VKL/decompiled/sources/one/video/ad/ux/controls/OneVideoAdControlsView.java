package one.video.ad.ux.controls;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import one.video.ad.ux.ShoppableAdView;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.motion.view.OneVideoMotionView;
import one.video.ad.ux.playpause.PlayPauseFrameView;
import xsna.an10;
import xsna.ba30;
import xsna.c6u;
import xsna.c950;
import xsna.ep6;
import xsna.k9q0;
import xsna.n9c0;
import xsna.qej0;
import xsna.rh0;
import xsna.sc0;
import xsna.sws0;
import xsna.xj80;
import xsna.ybq;
import xsna.zjw;

/* compiled from: OneVideoAdControlsView.kt */
/* loaded from: classes8.dex */
public final class OneVideoAdControlsView extends ConstraintLayout implements OneVideoAdBaseControls {
    public static final /* synthetic */ int A = 0;
    public final xj80 t;
    public PlayPauseFrameView u;
    public final OneVideoAdControlsView v;
    public final a w;
    public OneVideoAdBaseControls.a x;
    public OneVideoAdBaseControls.c y;
    public boolean z;

    /* compiled from: OneVideoAdControlsView.kt */
    public final class a implements OneVideoAdBaseControls.b {
        public a() {
        }

        @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.b
        public final void a(boolean z) {
            OneVideoAdControlsView.this.t.g.setFullscreen(z);
        }

        @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.b
        public final void b(ba30 ba30Var) {
            OneVideoAdControlsView oneVideoAdControlsView = OneVideoAdControlsView.this;
            oneVideoAdControlsView.t.g.T4(ba30Var);
            oneVideoAdControlsView.t.g.setVisibility(ba30Var != null ? 0 : 8);
        }

        @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.b
        public final void c(sws0 sws0Var) {
            OneVideoAdControlsView.this.t.g.setController(sws0Var);
        }
    }

    public OneVideoAdControlsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public final void V2() {
        AnimatorSet animatorSet = this.t.d.g;
        if (animatorSet != null) {
            animatorSet.pause();
        }
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public final void c1() {
        AnimatorSet animatorSet = this.t.d.g;
        if (animatorSet != null) {
            animatorSet.resume();
        }
    }

    public OneVideoAdBaseControls.a getListener() {
        return this.x;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public OneVideoAdBaseControls.b getMotionDelegate() {
        return this.w;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public n9c0 getPostView() {
        return null;
    }

    public qej0 getShoppableAdViewListener() {
        return this.t.d.getListener();
    }

    public boolean getShowAdShoppableProducts() {
        return this.z;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public OneVideoAdBaseControls.c getState() {
        return this.y;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setAdBannerData(sc0 sc0Var) {
        ArrayList arrayList = sc0Var.g;
        xj80 xj80Var = this.t;
        AppCompatTextView appCompatTextView = xj80Var.f;
        ShoppableAdView shoppableAdView = xj80Var.d;
        if (sc0Var.e) {
            appCompatTextView.setOnClickListener(new ep6(this, 3));
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, appCompatTextView.getContext().getDrawable(R.drawable.one_video_info_outline_16), (Drawable) null);
        } else {
            appCompatTextView.setOnClickListener(null);
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (!getShowAdShoppableProducts() || arrayList.isEmpty()) {
            shoppableAdView.setVisibility(8);
        } else {
            shoppableAdView.setCardsList(arrayList);
            shoppableAdView.setVisibility(0);
        }
        AppCompatTextView appCompatTextView2 = xj80Var.c;
        if (shoppableAdView.getVisibility() == 0) {
            appCompatTextView2.setVisibility(8);
        } else {
            appCompatTextView2.setText(sc0Var.h.a);
            appCompatTextView2.setOnClickListener(new ybq(this, 4));
            appCompatTextView2.setVisibility(0);
        }
        xj80Var.b.setMax(sc0Var.c);
        xj80Var.g.setVisibility(8);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setAdProgress(rh0 rh0Var) {
        String valueOf;
        int i = rh0Var.a;
        xj80 xj80Var = this.t;
        AppCompatTextView appCompatTextView = xj80Var.e;
        appCompatTextView.setVisibility(0);
        appCompatTextView.setOnClickListener(new c6u(2, rh0Var, this));
        if (rh0Var.b == null) {
            valueOf = appCompatTextView.getContext().getString(R.string.one_video_ad_will_start_after_ad);
        } else {
            int b = an10.b(r7.intValue() / 1000.0f);
            valueOf = b > 0 ? String.valueOf(b) : appCompatTextView.getContext().getString(R.string.one_video_ad_skip);
        }
        appCompatTextView.setText(valueOf);
        ProgressBar progressBar = xj80Var.b;
        if (progressBar.getProgress() == 0 || Math.abs(progressBar.getProgress() - i) > 100) {
            progressBar.setProgress(i);
        }
        xj80Var.g.setVisibility(8);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setImageLoader(zjw zjwVar) {
        xj80 xj80Var = this.t;
        xj80Var.d.setImageLoader(zjwVar);
        xj80Var.g.setImageLoader(zjwVar);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setListener(OneVideoAdBaseControls.a aVar) {
        this.x = aVar;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setPlayPauseControl(boolean z) {
        if (this.u == null) {
            PlayPauseFrameView playPauseFrameView = new PlayPauseFrameView(getContext(), null, 0, 14, 0);
            playPauseFrameView.setId(View.generateViewId());
            playPauseFrameView.setVisibility(8);
            playPauseFrameView.setLayoutParams(new ConstraintLayout.b(-1, -1));
            addView(playPauseFrameView, 0);
            b bVar = new b();
            bVar.i(this);
            bVar.k(playPauseFrameView.getId(), 6, getId(), 6);
            bVar.k(playPauseFrameView.getId(), 7, getId(), 7);
            bVar.k(playPauseFrameView.getId(), 4, getId(), 4);
            bVar.k(playPauseFrameView.getId(), 3, getId(), 3);
            bVar.b(this);
            playPauseFrameView.setPlayPauseClickListener(new c950(this, 8));
            this.u = playPauseFrameView;
        }
        PlayPauseFrameView playPauseFrameView2 = this.u;
        if (playPauseFrameView2 != null) {
            playPauseFrameView2.c(z);
        }
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setShoppableAdViewListener(qej0 qej0Var) {
        this.t.d.setListener(qej0Var);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setShowAdShoppableProducts(boolean z) {
        this.z = z;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setState(OneVideoAdBaseControls.c cVar) {
        this.y = cVar;
    }

    public OneVideoAdControlsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public OneVideoAdControlsView getView() {
        return this.v;
    }

    public OneVideoAdControlsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ OneVideoAdControlsView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public OneVideoAdControlsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.one_video_ad_controls_view, this);
        int i3 = R.id.video_ad_progress_bar;
        ProgressBar progressBar = (ProgressBar) k9q0.j(R.id.video_ad_progress_bar, this);
        if (progressBar != null) {
            i3 = R.id.video_ad_redirect;
            AppCompatTextView appCompatTextView = (AppCompatTextView) k9q0.j(R.id.video_ad_redirect, this);
            if (appCompatTextView != null) {
                i3 = R.id.video_ad_shoppable_products;
                ShoppableAdView shoppableAdView = (ShoppableAdView) k9q0.j(R.id.video_ad_shoppable_products, this);
                if (shoppableAdView != null) {
                    i3 = R.id.video_ad_skip;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) k9q0.j(R.id.video_ad_skip, this);
                    if (appCompatTextView2 != null) {
                        i3 = R.id.video_ad_title;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) k9q0.j(R.id.video_ad_title, this);
                        if (appCompatTextView3 != null) {
                            i3 = R.id.video_motion_view;
                            OneVideoMotionView oneVideoMotionView = (OneVideoMotionView) k9q0.j(R.id.video_motion_view, this);
                            if (oneVideoMotionView != null) {
                                this.t = new xj80(this, progressBar, appCompatTextView, shoppableAdView, appCompatTextView2, appCompatTextView3, oneVideoMotionView);
                                this.v = this;
                                this.w = new a();
                                this.y = new OneVideoAdBaseControls.c(OneVideoAdBaseControls.Type.FULLSCREEN, OneVideoAdBaseControls.SoundState.OFF, false, -1, -1);
                                setClipChildren(false);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
