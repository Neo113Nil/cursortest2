package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.b;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.stories.presentation.story.StoryAnimationDirection;
import ru.yandex.taxi.stories.presentation.story.StoryContentView;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;
import ru.yandex.taxi.stories.presentation.story.StoryTopView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.RoundedCornersFrameLayout;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes6.dex */
public final class bqu0 extends hsf0 {
    public final StoryModalView g;
    public final spu0 h;
    public final wor0 i;
    public final RoundedCornersFrameLayout j;
    public final View k;
    public final RoundedCornersImageView l;
    public final RoundedCornersImageView m;
    public final StoryContentView n;
    public final StoryContentView o;
    public final StoryTopView p;
    public final StoryTopView q;
    public final TextView r;
    public final View s;
    public final float t;
    public ValueAnimator u;
    public long v;

    public bqu0(StoryModalView storyModalView, spu0 spu0Var, wor0 wor0Var) {
        super(storyModalView, wor0Var);
        this.g = storyModalView;
        this.h = spu0Var;
        this.i = wor0Var;
        int i = kdh0.story_animation_container;
        WeakHashMap weakHashMap = b.a;
        this.j = (RoundedCornersFrameLayout) ((View) rp31.d(storyModalView, i));
        this.k = (View) rp31.d(storyModalView, kdh0.loading_indicator_container);
        this.l = (RoundedCornersImageView) ((View) rp31.d(storyModalView, kdh0.snapshot_main));
        this.m = (RoundedCornersImageView) ((View) rp31.d(storyModalView, kdh0.snapshot_secondary));
        this.n = (StoryContentView) storyModalView.findViewById(kdh0.content_view_main);
        this.o = (StoryContentView) ((View) rp31.d(storyModalView, kdh0.content_view_secondary));
        this.p = (StoryTopView) ((View) rp31.d(storyModalView, kdh0.story_top_view_main));
        this.q = (StoryTopView) ((View) rp31.d(storyModalView, kdh0.story_top_view_secondary));
        this.r = (TextView) ((View) rp31.d(storyModalView, kdh0.notification));
        this.s = (View) rp31.d(storyModalView, kdh0.story_loading_container);
        this.t = spu0Var.d.d;
        this.v = -1L;
    }

    public static void t(float f, float f2, View view) {
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationX(f2);
    }

    @Override // defpackage.hsf0
    public final Rect c() {
        spu0 spu0Var = this.h;
        View b = spu0Var.b();
        Story d = spu0Var.b.d();
        Rect rect = null;
        String str = d != null ? d.b : null;
        if (str == null) {
            str = (String) spu0Var.d.c.get(0);
        }
        Iterator it = spu0Var.a.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Rect b2 = ((fnu0) it.next()).b(str);
            if (b2 != null) {
                rect = b2;
                break;
            }
        }
        if (b != null || rect == null) {
            if (b == null) {
                Context context = spu0Var.c;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(mrg0.story_card_width);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(mrg0.story_card_height);
                int v = (xw31.v() - dimensionPixelSize) / 2;
                int u = xw31.u();
                rect = new Rect(v, u, dimensionPixelSize + v, dimensionPixelSize2 + u);
            } else {
                int[] iArr = new int[2];
                b.getLocationOnScreen(iArr);
                int scaleX = (int) (b.getScaleX() * b.getWidth());
                int scaleY = (int) (b.getScaleY() * b.getHeight());
                int i = iArr[0];
                int i2 = iArr[1];
                rect = new Rect(i, i2, scaleX + i, scaleY + i2);
            }
        }
        Rect rect2 = new Rect(rect);
        int[] iArr2 = new int[2];
        this.g.getLocationOnScreen(iArr2);
        rect2.offset(-iArr2[0], -iArr2[1]);
        return rect2;
    }

    @Override // defpackage.hsf0
    public final void d() {
        Bitmap a;
        super.d();
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        RoundedCornersImageView roundedCornersImageView = this.m;
        roundedCornersImageView.setScaleType(scaleType);
        roundedCornersImageView.setRoundedBackgroundColor(0);
        spu0 spu0Var = this.h;
        View b = spu0Var.b();
        if (b == null) {
            a = spu0Var.a();
        } else if (b.getWidth() == 0 || b.getHeight() == 0) {
            a = spu0Var.a();
        } else {
            a = Bitmap.createBitmap(b.getWidth(), b.getHeight(), Bitmap.Config.ARGB_8888);
            b.draw(new Canvas(a));
        }
        roundedCornersImageView.setImageBitmap(a);
    }

    @Override // defpackage.hsf0
    public final float e() {
        return this.t;
    }

    @Override // defpackage.hsf0
    public final void f() {
        super.f();
        this.m.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // defpackage.hsf0
    public final void i(float f, float f2, float f3, float f4, float f5) {
        hsf0.h(this.l, f, f2, f3, f4, f5);
        hsf0.h(this.n, f, f2, f3, f4, f5);
        hsf0.h(this.p, f, f2, f3, f4, f5);
        hsf0.h(this.k, f, f2, f3, f4, f5);
        hsf0.h(this.j, f, f2, f3, f4, f5);
        hsf0.h(this.s, f, f2, f3, f4, f5);
    }

    @Override // defpackage.hsf0
    public final void j(float f, float f2, float f3, float f4) {
        hsf0.h(this.m, f, f2, f3, f4, 1.0f);
    }

    @Override // defpackage.hsf0
    public final void k(float f, float f2) {
        this.l.setCornerRadius(f, f2);
        this.m.setCornerRadius(f, f2);
        this.n.setCornerRadius(f, f2);
        this.o.setCornerRadius(f, f2);
        this.j.setCornerRadius(f, f2);
    }

    @Override // defpackage.hsf0
    public final void m(float f, float f2) {
        hsf0.l(f, f2, this.l);
        hsf0.l(f, f2, this.n);
        hsf0.l(f, f2, this.p);
        hsf0.l(f, f2, this.m);
        hsf0.l(f, f2, this.k);
        hsf0.l(f, f2, this.j);
        hsf0.l(f, f2, this.s);
    }

    public final void p(float f, Runnable runnable, Runnable runnable2) {
        float f2;
        f2 = ((StoryModalView) this.i.a).scroll;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new vf2(20, this, runnable));
        ofFloat.addListener(new AnimUtils$AnimationEndListener(new zpu0(this, runnable2, 0)));
        ofFloat.start();
        this.u = ofFloat;
    }

    public final void q() {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.u;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.removeAllListeners();
            valueAnimator2.cancel();
        }
    }

    public final boolean r() {
        ValueAnimator valueAnimator = this.u;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final void s(Runnable runnable) {
        t(1.0f, 0.0f, this.l);
        t(1.0f, 0.0f, this.n);
        t(1.0f, 0.0f, this.p);
        t(1.0f, 0.0f, this.k);
        t(1.0f, 0.0f, this.j);
        t(1.0f, 0.0f, this.s);
        runnable.run();
    }

    public final void u() {
        float f;
        float f2;
        int width;
        int width2;
        float f3;
        wor0 wor0Var = this.i;
        f = ((StoryModalView) wor0Var.a).scroll;
        this.l.setTranslationX(f);
        this.n.setTranslationX(f);
        this.k.setTranslationX(f);
        this.j.setTranslationX(f);
        this.s.setTranslationX(f);
        boolean n = xw31.n(this.g.getContext());
        StoryModalView storyModalView = (StoryModalView) wor0Var.a;
        ModalView modalView = this.a;
        if (n) {
            f3 = storyModalView.scroll;
            if (storyModalView.scrollToDirection(f3) == StoryAnimationDirection.PREVIOUS) {
                width2 = modalView.getWidth();
            } else {
                width = modalView.getWidth();
                width2 = -width;
            }
        } else {
            f2 = storyModalView.scroll;
            if (storyModalView.scrollToDirection(f2) == StoryAnimationDirection.NEXT) {
                width2 = modalView.getWidth();
            } else {
                width = modalView.getWidth();
                width2 = -width;
            }
        }
        float f4 = width2 + f;
        this.m.setTranslationX(f4);
        this.o.setTranslationX(f4);
    }

    public final void v() {
        float f;
        float f2;
        int width;
        int width2;
        float f3;
        wor0 wor0Var = this.i;
        f = ((StoryModalView) wor0Var.a).scroll;
        ModalView modalView = this.a;
        float abs = (float) Math.abs(f / modalView.getWidth());
        float f4 = 1.0f - abs;
        float f5 = (abs * 0.8f) + f4;
        t(f5, f, this.l);
        t(f5, f, this.n);
        t(f5, f, this.p);
        t(f5, f, this.k);
        t(f5, f, this.j);
        t(f5, f, this.s);
        float f6 = (f4 * 0.8f) + abs;
        boolean n = xw31.n(this.g.getContext());
        StoryModalView storyModalView = (StoryModalView) wor0Var.a;
        if (n) {
            f3 = storyModalView.scroll;
            if (storyModalView.scrollToDirection(f3) == StoryAnimationDirection.PREVIOUS) {
                width2 = modalView.getWidth();
            } else {
                width = modalView.getWidth();
                width2 = -width;
            }
        } else {
            f2 = storyModalView.scroll;
            if (storyModalView.scrollToDirection(f2) == StoryAnimationDirection.NEXT) {
                width2 = modalView.getWidth();
            } else {
                width = modalView.getWidth();
                width2 = -width;
            }
        }
        float f7 = width2 + f;
        t(f6, f7, this.m);
        t(f6, f7, this.o);
        t(f6, f7, this.q);
    }
}
