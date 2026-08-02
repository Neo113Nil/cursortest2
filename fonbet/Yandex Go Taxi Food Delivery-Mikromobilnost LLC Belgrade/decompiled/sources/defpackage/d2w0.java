package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperAppMainScreenHeader;
import java.util.WeakHashMap;
import ru.yandex.taxi.settings.MainMenuButton;
import ru.yandex.taxi.widget.OptimizedShimmeringImageView;
import ru.yandex.taxi.widget.OptimizedShimmeringRobotoTextView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringImageView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes.dex */
public final class d2w0 implements g0w0 {
    public final /* synthetic */ SuperAppMainScreenHeader a;

    public d2w0(SuperAppMainScreenHeader superAppMainScreenHeader) {
        this.a = superAppMainScreenHeader;
    }

    public final void h(boolean z, boolean z2) {
        boolean z3;
        c2w0 c2w0Var;
        View view;
        c2w0 c2w0Var2;
        c2w0 c2w0Var3;
        View view2;
        c2w0 c2w0Var4;
        View view3;
        c2w0 c2w0Var5;
        SuperAppMainScreenHeader superAppMainScreenHeader = this.a;
        superAppMainScreenHeader.loadingState = z;
        superAppMainScreenHeader.modalEnabled = z2;
        z3 = superAppMainScreenHeader.isOptimizedShimmeringEnabled;
        if (z3) {
            c2w0Var4 = superAppMainScreenHeader.holder;
            if (c2w0Var4 != null) {
                SuperAppMainScreenHeader superAppMainScreenHeader2 = c2w0Var4.m;
                int i = yih0.logo_view;
                WeakHashMap weakHashMap = b.a;
                view3 = (View) rp31.d(superAppMainScreenHeader2, i);
            } else {
                view3 = null;
            }
            OptimizedShimmeringImageView optimizedShimmeringImageView = view3 instanceof OptimizedShimmeringImageView ? (OptimizedShimmeringImageView) view3 : null;
            if (optimizedShimmeringImageView != null) {
                optimizedShimmeringImageView.setLoading(z);
            }
            c2w0Var5 = superAppMainScreenHeader.holder;
            RobotoTextView robotoTextView = c2w0Var5 != null ? c2w0Var5.d : null;
            OptimizedShimmeringRobotoTextView optimizedShimmeringRobotoTextView = robotoTextView instanceof OptimizedShimmeringRobotoTextView ? (OptimizedShimmeringRobotoTextView) robotoTextView : null;
            if (optimizedShimmeringRobotoTextView != null) {
                if (z) {
                    optimizedShimmeringRobotoTextView.startAnimation();
                } else {
                    optimizedShimmeringRobotoTextView.stopAnimation();
                }
            }
        } else {
            c2w0Var = superAppMainScreenHeader.holder;
            if (c2w0Var != null) {
                SuperAppMainScreenHeader superAppMainScreenHeader3 = c2w0Var.m;
                int i2 = yih0.logo_view;
                WeakHashMap weakHashMap2 = b.a;
                view = (View) rp31.d(superAppMainScreenHeader3, i2);
            } else {
                view = null;
            }
            ShimmeringImageView shimmeringImageView = view instanceof ShimmeringImageView ? (ShimmeringImageView) view : null;
            if (shimmeringImageView != null) {
                shimmeringImageView.setLoading(z);
            }
            c2w0Var2 = superAppMainScreenHeader.holder;
            AppCompatTextView appCompatTextView = c2w0Var2 != null ? c2w0Var2.d : null;
            ShimmeringRobotoTextView shimmeringRobotoTextView = appCompatTextView instanceof ShimmeringRobotoTextView ? (ShimmeringRobotoTextView) appCompatTextView : null;
            if (shimmeringRobotoTextView != null) {
                if (z) {
                    shimmeringRobotoTextView.startAnimation();
                } else {
                    shimmeringRobotoTextView.stopAnimation();
                }
            }
        }
        c2w0Var3 = superAppMainScreenHeader.holder;
        if (c2w0Var3 == null || (view2 = c2w0Var3.e) == null) {
            return;
        }
        view2.setEnabled(!z && z2);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        c2w0 c2w0Var;
        c2w0 c2w0Var2;
        c2w0 c2w0Var3;
        MainMenuButton mainMenuButton;
        c2w0 c2w0Var4;
        View view;
        RobotoTextView robotoTextView;
        i0w0 i0w0Var = (i0w0) obj;
        String str = i0w0Var.a;
        boolean z = i0w0Var.e;
        boolean z2 = i0w0Var.d;
        SuperAppMainScreenHeader superAppMainScreenHeader = this.a;
        c2w0Var = superAppMainScreenHeader.holder;
        if (c2w0Var != null && (robotoTextView = c2w0Var.c) != null) {
            robotoTextView.setText(str);
        }
        String str2 = i0w0Var.c;
        String str3 = i0w0Var.b;
        c2w0Var2 = superAppMainScreenHeader.holder;
        if (c2w0Var2 != null) {
            RobotoTextView robotoTextView2 = c2w0Var2.d;
            if (z2) {
                str2 = str3;
            }
            Drawable t = !z2 ? vng.t(m2h0.ic_current_address_arrow_big, robotoTextView2.getContext()) : null;
            robotoTextView2.setText(str2);
            robotoTextView2.setVisibility(!evu0.J(str2) ? 0 : 8);
            RobotoTextView robotoTextView3 = c2w0Var2.c;
            if (robotoTextView3 != null) {
                robotoTextView3.setVisibility(evu0.J(str2) ? 8 : 0);
            }
            robotoTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, t, (Drawable) null);
            superAppMainScreenHeader.updateCurrentAddressViewDrawableTint();
        }
        h(z2, z);
        String str4 = i0w0Var.f;
        if (z) {
            zry zryVar = new zry(str4);
            c2w0Var4 = superAppMainScreenHeader.holder;
            if (c2w0Var4 != null && (view = c2w0Var4.e) != null) {
                b.p(view, zryVar);
            }
        }
        bk10 bk10Var = i0w0Var.g;
        c2w0Var3 = superAppMainScreenHeader.holder;
        if (c2w0Var3 == null || (mainMenuButton = c2w0Var3.b) == null) {
            return;
        }
        wwg.U(mainMenuButton, bk10Var);
    }
}
