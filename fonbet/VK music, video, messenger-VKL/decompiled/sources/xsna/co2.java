package xsna;

import android.R;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.wn2;

/* compiled from: AnimationDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class co2 implements wn2 {
    public final ViewGroup a;
    public float b = 0.5625f;
    public View c;
    public wn2.b d;
    public List<? extends View> e;

    public co2(ViewGroup viewGroup) {
        this.a = viewGroup;
        viewGroup.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        viewGroup.setPivotX(iah0.f().widthPixels / 2.0f);
        xwt0.a(iah0.f().widthPixels, (int) (iah0.f().widthPixels / this.b), viewGroup);
    }

    @Override // xsna.wn2
    public final Size a() {
        View view = this.c;
        if (view != null) {
            return new Size(view.getWidth(), view.getHeight());
        }
        return null;
    }

    @Override // xsna.wn2
    public final Float b() {
        View view = this.c;
        if (view != null) {
            return Float.valueOf(view.getY());
        }
        return null;
    }

    @Override // xsna.wn2
    public final void c(View view, View view2, wn2.b bVar, List list) {
        View view3;
        if (bVar.a) {
            view3 = view;
            d3m.c(view3, (r15 & 1) != 0 ? 300L : view.getContext().getResources().getInteger(R.integer.config_shortAnimTime), (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? new AccelerateDecelerateInterpolator() : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            view3 = view;
            view3.setAlpha(1.0f);
            view3.setVisibility(0);
        }
        this.c = view2;
        this.d = bVar;
        this.e = list;
        zn2 zn2Var = new zn2(view3, 0);
        if (view2 == null || list == null) {
            return;
        }
        xwt0.a(-1, -1, view2);
        view2.addOnLayoutChangeListener(new mwt0(view2, new ao2(this, view2, bVar, zn2Var, list)));
    }

    @Override // xsna.wn2
    public final void d(View view, odc0 odc0Var) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
            viewGroup.addView(view, 0);
        }
        d3m.e(view, (r15 & 1) != 0 ? 300L : view.getContext().getResources().getInteger(R.integer.config_mediumAnimTime), (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new g0(odc0Var, 2), (r15 & 8) == 0 ? new AccelerateDecelerateInterpolator() : null, (r15 & 16) != 0 ? false : true);
    }

    @Override // xsna.wn2
    public final void e(float f) {
        this.b = f;
        View view = this.c;
        wn2.b bVar = this.d;
        List<? extends View> list = this.e;
        if (view == null || bVar == null || list == null) {
            return;
        }
        xwt0.a(-1, -1, view);
        view.addOnLayoutChangeListener(new mwt0(view, new ao2(this, view, bVar, null, list)));
    }
}
