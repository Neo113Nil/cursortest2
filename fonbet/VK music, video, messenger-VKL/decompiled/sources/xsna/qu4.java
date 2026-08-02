package xsna;

import android.animation.TimeInterpolator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cor;

/* compiled from: AudioRecordAnimator.kt */
/* loaded from: classes2.dex */
public final class qu4 {
    public static final float v = iah0.a(44.0f);
    public static final float w = -iah0.a(44.0f);
    public final View a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final TextView i;
    public final ImageView j;
    public final View k;
    public final View l;
    public final View m;
    public final io.reactivex.rxjava3.disposables.b n;
    public final j8z o;
    public final by6 p;
    public final long q;
    public final Drawable r;
    public final int s;
    public boolean t;
    public boolean u;

    public qu4(View view) {
        this.a = view;
        this.b = (ViewGroup) view.findViewById(R.id.vkim_wave_container);
        View findViewById = view.findViewById(R.id.vkim_cancel_container);
        this.c = findViewById;
        this.d = view.findViewById(R.id.vkim_audio_send);
        this.e = view.findViewById(R.id.vkim_play_pause);
        this.f = view.findViewById(R.id.vkim_voice_record_hold);
        this.g = view.findViewById(R.id.vkim_cancel_label);
        this.h = view.findViewById(R.id.vkim_processing_label);
        this.i = (TextView) view.findViewById(R.id.vkim_cancel);
        this.j = (ImageView) view.findViewById(R.id.vkim_cancel_arrow_img);
        this.k = view.findViewById(R.id.vkim_cancel_container_border);
        this.l = view.findViewById(R.id.vkim_cancel_mic_image);
        this.m = view.findViewById(R.id.vkim_proccessing_progress);
        this.n = new io.reactivex.rxjava3.disposables.b();
        this.o = new j8z();
        this.p = new by6();
        this.q = 130L;
        this.r = findViewById.getBackground();
        this.s = (iah0.a(44) * 2) + iah0.a(168);
    }

    public final void a(int i) {
        float f;
        boolean z = i != 1;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = z ? 0.7f : 0.0f;
        if (i != 0) {
            f = w;
            if (i != 1) {
                if (i != 2) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    f2 = f;
                }
            }
        } else {
            f = 0.0f;
            f2 = v;
        }
        TimeInterpolator decelerateInterpolator = z ? new DecelerateInterpolator() : new AccelerateInterpolator();
        TextView textView = this.i;
        textView.setTranslationX(f2);
        ViewPropertyAnimator interpolator = textView.animate().alpha(f3).setDuration(200L).setInterpolator(decelerateInterpolator);
        interpolator.translationX(f);
        interpolator.start();
        ImageView imageView = this.j;
        imageView.setTranslationX(f2);
        ViewPropertyAnimator interpolator2 = imageView.animate().alpha(f3).setDuration(200L).setInterpolator(decelerateInterpolator);
        interpolator2.translationX(f);
        interpolator2.start();
    }

    public final void b(boolean z) {
        ViewPropertyAnimator e;
        int i = 0;
        ViewGroup viewGroup = this.b;
        io.reactivex.rxjava3.disposables.b bVar = this.n;
        if (!z) {
            bVar.e();
            cor.a aVar = new cor.a(rli0.x(rli0.u(rl3.D(new View[]{this.m, this.h, this.f, this.g}), new af2(2)), rli0.u(rl3.D(new View[]{viewGroup, this.j, this.i, this.d, this.e}), new sm(3))));
            while (aVar.hasNext()) {
                View view = (View) aVar.next();
                d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            bwt0.r0(this.s, viewGroup);
            return;
        }
        ViewPropertyAnimator animate = viewGroup.animate();
        j8z j8zVar = this.o;
        animate.setInterpolator(j8zVar);
        animate.setDuration(130L);
        animate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        animate.translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        animate.withEndAction(new ou4(this, i));
        animate.start();
        xo2.b(animate, bVar);
        e = d3m.e(this.f, (r15 & 1) != 0 ? 300L : 130L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        if (e != null) {
            e.setInterpolator(j8zVar);
            xo2.b(e, bVar);
        }
    }
}
