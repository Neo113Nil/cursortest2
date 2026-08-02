package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.tool.view.vkblur.GradientDirection;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.im.ui.fragments.chat.ChatFragment;

/* compiled from: BlurController.kt */
/* loaded from: classes2.dex */
public final class ng7 {
    public final View a;
    public final View b;
    public final ChatFragment.a c;
    public int d = -1;
    public int e = -1;
    public final mg7 f;

    public ng7(View view, View view2, ChatFragment.a aVar, VkBlurView vkBlurView, VkBlurView vkBlurView2, VkBlurContentView vkBlurContentView) {
        this.a = view;
        this.b = view2;
        this.c = aVar;
        mg7 mg7Var = new mg7(this, 0);
        this.f = mg7Var;
        view.addOnLayoutChangeListener(mg7Var);
        view2.addOnLayoutChangeListener(mg7Var);
        c();
        if (vkBlurView != null && vkBlurContentView != null) {
            vkBlurView.setGradientDirection(GradientDirection.BottomTop);
            vkBlurView.setupWithContent(vkBlurContentView);
            vkBlurView.setVisibility(0);
            vkBlurView.setBlurRadius(12.0f);
            bwt0.S(vkBlurView, new vl1(vkBlurView, 10));
        }
        if (vkBlurView2 == null || vkBlurContentView == null) {
            return;
        }
        vkBlurView2.setGradientDirection(GradientDirection.TopBottom);
        vkBlurView2.setupWithContent(vkBlurContentView);
        vkBlurView2.setVisibility(0);
        vkBlurView2.setBlurRadius(15.0f);
        bwt0.S(vkBlurView2, new lb(vkBlurView2, 13));
    }

    public final void a() {
        View view = this.a;
        mg7 mg7Var = this.f;
        view.removeOnLayoutChangeListener(mg7Var);
        this.b.removeOnLayoutChangeListener(mg7Var);
    }

    public final void b() {
        c();
    }

    public final void c() {
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        View view2 = this.b;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int height = view.getHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        int height2 = view2.getHeight() + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        if (height == this.d && height2 == this.e) {
            return;
        }
        this.d = height;
        this.e = height2;
        com.vk.im.ui.components.msg_list.a aVar = ChatFragment.this.H0;
        vm30 vm30Var = (aVar != null ? aVar : null).o;
        if (vm30Var != null) {
            if (height == vm30Var.l0 && height2 == vm30Var.m0) {
                return;
            }
            vm30Var.l0 = height;
            vm30Var.m0 = height2;
            vm30Var.K.d = height2;
            vm30Var.Q(vm30Var.j0 + vm30Var.k0);
            vm30Var.J.c = iah0.a(12) + vm30Var.m0;
            vm30Var.u.invalidateItemDecorations();
            f4m.t(vm30Var.j0 + vm30Var.k0 + vm30Var.l0, vm30Var.v);
            f4m.q(height2, vm30Var.w);
        }
    }
}
