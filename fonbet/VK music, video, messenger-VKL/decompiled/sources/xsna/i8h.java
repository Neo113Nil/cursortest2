package xsna;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* compiled from: CommunityLiveCoverDialogAnimator.kt */
/* loaded from: classes5.dex */
public final class i8h {
    public final f8h a;
    public final View b;
    public final int d;
    public final int e;
    public float g;
    public int h;
    public int i;
    public final float j;
    public ValueAnimator k;
    public boolean l;
    public boolean m;
    public final ilq c = new ilq();
    public final Rect f = new Rect();

    public i8h(f8h f8hVar, View view, View view2) {
        Drawable background;
        this.a = f8hVar;
        this.b = view;
        this.j = (view2 == null || (background = view2.getBackground()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : background.getAlpha() / 255.0f;
        Rect e = f4m.e(view);
        this.d = e.top;
        this.e = e.bottom;
    }

    public final void a(w8h w8hVar, View view, View view2) {
        FrameLayout frameLayout = w8hVar.a;
        int i = this.e;
        int i2 = this.d;
        int i3 = (i + i2) >> 1;
        this.g = i3 - f4m.e(frameLayout).centerY();
        this.b.getGlobalVisibleRect(this.f);
        this.h = (frameLayout.getMeasuredHeight() >> 1) - (i3 - i2);
        this.i = (i - i3) + (frameLayout.getMeasuredHeight() >> 1);
        view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        b(w8hVar, view, view2, 1.0f);
    }

    public final void b(w8h w8hVar, View view, View view2, float f) {
        FrameLayout frameLayout = w8hVar.a;
        float f2 = (this.g - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * f;
        frameLayout.setTranslationY(f2);
        float measuredHeight = (frameLayout.getMeasuredHeight() - this.i) * f;
        Rect rect = this.f;
        rect.set(frameLayout.getLeft(), (int) ((this.h * f) + 0), frameLayout.getRight(), (int) (frameLayout.getMeasuredHeight() - measuredHeight));
        if (this.m && view != null) {
            view.setTranslationY((-measuredHeight) + f2);
        }
        view2.setTranslationY((1.0f - f) * (((UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - this.g) + frameLayout.getMeasuredHeight()) - this.i));
        Iterator<View> it = w8hVar.c.iterator();
        while (it.hasNext()) {
            it.next().setTranslationY(-measuredHeight);
        }
        Iterator<View> it2 = w8hVar.d.iterator();
        while (it2.hasNext()) {
            it2.next().setTranslationY(this.h * f);
        }
        frameLayout.setClipBounds(rect);
        this.a.a(this.j * f);
        frameLayout.invalidate();
    }
}
