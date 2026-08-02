package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.splash.presentation.ClippedFrameLayout;
import defpackage.j250;
import defpackage.ny61;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class n450 {
    public final pav a;
    public final j250 b;

    public n450(Context context, oqt0 oqt0Var, pav pavVar, icc0 icc0Var) {
        View O;
        this.a = pavVar;
        View inflate = LayoutInflater.from(context).inflate(fkh0.native_animation_splash_layout, (ViewGroup) null, false);
        int i = v7h0.clipped_bg;
        ClippedFrameLayout clippedFrameLayout = (ClippedFrameLayout) cma1.O(i, inflate);
        if (clippedFrameLayout != null) {
            i = v7h0.image_city;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                i = v7h0.image_city_container;
                FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                if (frameLayout != null) {
                    i = v7h0.logo1;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
                    if (appCompatImageView2 != null) {
                        i = v7h0.logo2;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i, inflate);
                        if (appCompatImageView3 != null) {
                            i = v7h0.title;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView != null && (O = cma1.O((i = v7h0.white_background), inflate)) != null) {
                                FrameLayout frameLayout2 = (FrameLayout) inflate;
                                final j250 j250Var = new j250(frameLayout2, clippedFrameLayout, appCompatImageView, frameLayout, appCompatImageView2, appCompatImageView3, robotoTextView, O);
                                this.b = j250Var;
                                frameLayout2.getContext();
                                oqt0Var.getClass();
                                lqt0 lqt0Var = lqt0.e;
                                int i2 = lqt0Var.a;
                                int i3 = lqt0Var.c;
                                int i4 = lqt0Var.b;
                                appCompatImageView2.setImageResource(i2);
                                appCompatImageView2.setColorFilter(context.getColor(i3));
                                appCompatImageView3.setImageResource(lqt0Var.a);
                                appCompatImageView3.setColorFilter(context.getColor(i4));
                                clippedFrameLayout.setBackgroundResource(i4);
                                robotoTextView.setPivotX(0.0f);
                                robotoTextView.setPivotY(0.0f);
                                robotoTextView.setTextColor(context.getColor(i4));
                                robotoTextView.setTypeface(Typeface.DEFAULT);
                                O.setBackgroundResource(i3);
                                if (!frameLayout2.isLaidOut() || frameLayout2.isLayoutRequested()) {
                                    frameLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.splash.animated.NativeSplashViewHolder$_init_$lambda$0$$inlined$doOnLayout$1
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                                            view.removeOnLayoutChangeListener(this);
                                            j250 j250Var2 = j250.this;
                                            j250Var2.g.setX(j250Var2.e.getX());
                                            j250 j250Var3 = j250.this;
                                            j250Var3.g.setY(j250Var3.e.getY() + j250.this.e.getMeasuredHeight());
                                            RobotoTextView robotoTextView2 = j250.this.g;
                                            ViewGroup.LayoutParams layoutParams = robotoTextView2.getLayoutParams();
                                            if (layoutParams == null) {
                                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                            } else {
                                                layoutParams.width = j250.this.e.getMeasuredWidth();
                                                robotoTextView2.setLayoutParams(layoutParams);
                                            }
                                        }
                                    });
                                    return;
                                }
                                robotoTextView.setX(appCompatImageView2.getX());
                                robotoTextView.setY(appCompatImageView2.getY() + appCompatImageView2.getMeasuredHeight());
                                ViewGroup.LayoutParams layoutParams = robotoTextView.getLayoutParams();
                                if (layoutParams == null) {
                                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    throw null;
                                }
                                layoutParams.width = appCompatImageView2.getMeasuredWidth();
                                robotoTextView.setLayoutParams(layoutParams);
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public final j250 a() {
        return this.b;
    }
}
