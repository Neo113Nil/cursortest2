package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photoviewer.PhotoViewer;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.nlg;
import xsna.q4a0;

/* compiled from: VideoViewerPage.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class bst0 extends ggs {
    public final PhotoViewer.g d;
    public final q4a0.e e;
    public final ImageView f;
    public final vqt0 g;
    public final View h;
    public final View i;
    public final SeekBar j;
    public final TextView k;
    public final TextView l;
    public final coo m;
    public final StringBuilder n;
    public final Handler o;
    public boolean p;

    /* compiled from: VideoViewerPage.kt */
    public interface a {
    }

    /* compiled from: VideoViewerPage.kt */
    public final class b implements SeekBar.OnSeekBarChangeListener {
        public int b;

        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = i / 1000;
            if (i2 > this.b || i == 0 || z) {
                bst0 bst0Var = bst0.this;
                TextView textView = bst0Var.k;
                if (textView == null) {
                    textView = null;
                }
                StringBuilder sb = bst0Var.n;
                bst0Var.f(i, sb);
                textView.setText(sb);
                this.b = i2;
            }
            if (seekBar.getMax() == i) {
                this.b = 0;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            bst0 bst0Var = bst0.this;
            bst0Var.g.setPlayWhenReady(false);
            bst0Var.o.removeCallbacksAndMessages(null);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            int progress = seekBar.getProgress();
            bst0 bst0Var = bst0.this;
            bst0Var.g.seekTo(progress);
            if (bst0Var.f.getVisibility() != 0) {
                bst0Var.g.setPlayWhenReady(true);
                bst0Var.o.postDelayed(new d0(bst0Var, 14), 16L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bst0(Context context, int i, PhotoViewer.m mVar, q4a0.e eVar) {
        super(context, i, mVar);
        this.d = mVar;
        this.e = eVar;
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        bpn0 bpn0Var = y6l.b;
        nlg.a a2 = ((cea0) (bpn0Var == null ? null : bpn0Var).getValue()).a(context);
        this.g = a2;
        View view = a2.a;
        this.h = view;
        this.m = new coo(context.getApplicationContext());
        StringBuilder sb = new StringBuilder();
        this.n = sb;
        this.o = new Handler(Looper.getMainLooper());
        a2.c(((bt10) mVar).a.a(), (r22 & 4) == 0, (r22 & 8) != 0, (r22 & 64) != 0 ? new qpt0(0) : null, new ni0(28, this, mVar), new rrn0(this, 23), (r22 & 512) != 0 ? new bzq0(2) : null, (r22 & 1024) != 0 ? new w5k0(8) : null, (r22 & 2048) != 0 ? new fd90(20) : new kcj0(this, 24));
        setOnClickListener(new pc3(this, 10));
        view.setVisibility(4);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        g();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        imageView.setImageResource(R.drawable.vk_icon_play_button_56);
        addView(imageView, layoutParams);
        imageView.setOnClickListener(new w16(this, 13));
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.ast0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                bst0 bst0Var = bst0.this;
                boolean e = bst0Var.e();
                if (e != bst0Var.p) {
                    if (e) {
                        bst0Var.d();
                    } else {
                        bst0Var.b();
                    }
                    bst0Var.p = e;
                }
            }
        });
        this.i = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.video_progress_layout, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 48;
        View view2 = this.i;
        addView(view2 == null ? null : view2, layoutParams2);
        View view3 = this.i;
        this.j = (SeekBar) (view3 == null ? null : view3).findViewById(R.id.pv_video_progress_bar);
        View view4 = this.i;
        this.k = (TextView) (view4 == null ? null : view4).findViewById(R.id.pv_video_progress_time);
        View view5 = this.i;
        this.l = (TextView) (view5 == null ? null : view5).findViewById(R.id.pv_video_duration_time);
        SeekBar seekBar = this.j;
        (seekBar == null ? null : seekBar).setOnSeekBarChangeListener(new b());
        TextView textView = this.k;
        TextView textView2 = textView != null ? textView : null;
        f(0L, sb);
        textView2.setText(sb);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.zrt0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                bst0 bst0Var = bst0.this;
                q4a0.e eVar2 = bst0Var.e;
                if ((eVar2 != null ? q4a0.this.f.c.a() : null) == null || eVar2 == null || !eVar2.a()) {
                    View view6 = bst0Var.i;
                    (view6 != null ? view6 : null).setVisibility(8);
                    return;
                }
                View view7 = bst0Var.i;
                if (view7 == null) {
                    view7 = null;
                }
                if (view7.getVisibility() != 4) {
                    View view8 = bst0Var.i;
                    if (view8 == null) {
                        view8 = null;
                    }
                    view8.setVisibility(0);
                }
                View view9 = bst0Var.i;
                (view9 == null ? null : view9).setTranslationY(r3.bottom - (view9 != null ? view9 : null).getHeight());
            }
        });
    }

    @Override // xsna.ggs
    public final void a() {
        g();
        View view = this.i;
        if (view == null) {
            view = null;
        }
        d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        d3m.b(this.h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        this.g.release();
    }

    @Override // xsna.ggs
    public final void b() {
        View view = this.h;
        view.setVisibility(0);
        g();
        d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
    }

    @Override // xsna.ggs
    public final void d() {
        g();
        q4a0.e eVar = this.e;
        if (eVar == null || eVar.a()) {
            return;
        }
        View view = this.i;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
    }

    public final boolean e() {
        Rect rect = h2u0.a;
        getGlobalVisibleRect(rect);
        return ((float) (rect.height() * rect.width())) / ((float) (getWidth() * getHeight())) >= 0.5f && isAttachedToWindow() && getVisibility() == 0 && getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void f(long j, StringBuilder sb) {
        long abs = Math.abs(j / 1000);
        sb.setLength(0);
        this.m.getClass();
        coo.b((int) abs, sb);
    }

    public final boolean g() {
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            return false;
        }
        imageView.setVisibility(0);
        this.g.setPlayWhenReady(false);
        this.o.removeCallbacksAndMessages(null);
        return true;
    }

    public final a getCallback() {
        return this.e;
    }

    public final PhotoViewer.g getVideo() {
        return this.d;
    }

    @Override // xsna.ggs
    public List<View> getViewsForFade() {
        View view = this.i;
        if (view == null) {
            view = null;
        }
        return Collections.singletonList(view);
    }

    @Override // xsna.ggs
    public List<View> getViewsForTranslate() {
        return e43.l(this.h, this.f);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z || !this.p) {
            return;
        }
        b();
    }
}
