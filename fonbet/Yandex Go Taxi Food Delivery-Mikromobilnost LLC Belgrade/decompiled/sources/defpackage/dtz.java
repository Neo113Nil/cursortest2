package defpackage;

import android.animation.Animator;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div.lottie.LottieController$animatorListener$1;
import defpackage.dtz;
import defpackage.sls;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class dtz implements epl {
    public final LoadableImageView a;
    public final LottieDrawable b;
    public nsz c;
    public final boolean d;
    public RenderMode e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public gtz k;
    public final br60 l;
    public final LottieController$animatorListener$1 m;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.div.lottie.LottieController$animatorListener$1] */
    public dtz(LoadableImageView loadableImageView) {
        this.a = loadableImageView;
        LottieDrawable lottieDrawable = new LottieDrawable();
        this.b = lottieDrawable;
        this.e = RenderMode.AUTOMATIC;
        this.l = new br60();
        this.m = new Animator.AnimatorListener() { // from class: com.yandex.div.lottie.LottieController$animatorListener$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Iterator it = dtz.this.l.iterator();
                while (it.hasNext()) {
                    ((sls) it.next()).invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
            }
        };
        lottieDrawable.enableMergePathsForKitKatAndAbove(true);
        a();
        this.d = true;
    }

    public final void a() {
        nsz nszVar = this.c;
        int i = ctz.a[this.e.ordinal()];
        int i2 = 2;
        if (i != 1 && (i == 2 || i != 3 || (nszVar != null && nszVar.o > 4))) {
            i2 = 1;
        }
        LoadableImageView loadableImageView = this.a;
        if (i2 != loadableImageView.getLayerType()) {
            loadableImageView.setLayerType(i2, null);
        }
    }

    public final void b() {
        if (this.d) {
            if (!this.a.isShown()) {
                if (this.b.isAnimating()) {
                    c();
                    this.h = true;
                    return;
                }
                return;
            }
            if (this.h) {
                e();
            } else if (this.g) {
                d();
            }
            this.h = false;
            this.g = false;
        }
    }

    public final void c() {
        this.i = false;
        this.h = false;
        this.g = false;
        this.b.pauseAnimation();
        a();
    }

    public final void d() {
        if (!this.a.isShown()) {
            this.g = true;
        } else {
            this.b.playAnimation();
            a();
        }
    }

    public final void e() {
        if (this.a.isShown()) {
            this.b.resumeAnimation();
            a();
        } else {
            this.g = false;
            this.h = true;
        }
    }
}
