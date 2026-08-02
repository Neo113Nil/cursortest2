package xsna;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: Explode.java */
/* loaded from: classes12.dex */
public final class x9q extends p4u0 {
    public static final DecelerateInterpolator c = new DecelerateInterpolator();
    public static final AccelerateInterpolator d = new AccelerateInterpolator();
    public final int[] b;

    public x9q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new int[2];
        setPropagation(new wdc());
    }

    public final void a(ViewGroup viewGroup, Rect rect, int[] iArr) {
        int centerX;
        int centerY;
        int[] iArr2 = this.b;
        viewGroup.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        int i2 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            centerX = Math.round(viewGroup.getTranslationX()) + (viewGroup.getWidth() / 2) + i;
            centerY = Math.round(viewGroup.getTranslationY()) + (viewGroup.getHeight() / 2) + i2;
        } else {
            centerX = epicenter.centerX();
            centerY = epicenter.centerY();
        }
        float centerX2 = rect.centerX() - centerX;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && centerY2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float sqrt = (float) Math.sqrt((centerY2 * centerY2) + (centerX2 * centerX2));
        int i3 = centerX - i;
        int i4 = centerY - i2;
        float max = Math.max(i3, viewGroup.getWidth() - i3);
        float max2 = Math.max(i4, viewGroup.getHeight() - i4);
        float sqrt2 = (float) Math.sqrt((max2 * max2) + (max * max));
        iArr[0] = Math.round((centerX2 / sqrt) * sqrt2);
        iArr[1] = Math.round(sqrt2 * (centerY2 / sqrt));
    }

    public final void b(gnp0 gnp0Var) {
        View view = gnp0Var.b;
        int[] iArr = this.b;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        gnp0Var.a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // xsna.p4u0, xsna.vlp0
    public final void captureEndValues(gnp0 gnp0Var) {
        super.captureEndValues(gnp0Var);
        b(gnp0Var);
    }

    @Override // xsna.p4u0, xsna.vlp0
    public final void captureStartValues(gnp0 gnp0Var) {
        super.captureStartValues(gnp0Var);
        b(gnp0Var);
    }

    @Override // xsna.vlp0
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // xsna.p4u0
    public final Animator onAppear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) gnp0Var2.a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        a(viewGroup, rect, this.b);
        return fop0.a(view, gnp0Var2, rect.left, rect.top, translationX + r0[0], translationY + r0[1], translationX, translationY, c, this);
    }

    @Override // xsna.p4u0
    public final Animator onDisappear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        float f;
        float f2;
        if (gnp0Var == null) {
            return null;
        }
        Rect rect = (Rect) gnp0Var.a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) gnp0Var.b.getTag(R.id.transition_position);
        if (iArr != null) {
            f = (r7 - rect.left) + translationX;
            f2 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        a(viewGroup, rect, this.b);
        return fop0.a(view, gnp0Var, i, i2, translationX, translationY, f + r0[0], f2 + r0[1], d, this);
    }
}
