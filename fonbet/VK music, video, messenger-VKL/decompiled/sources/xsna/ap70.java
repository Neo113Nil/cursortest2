package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.suspicious_auth.SuspiciousAuthComponent;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;

/* compiled from: OTPCheckMethodSelectorFragment.kt */
/* loaded from: classes15.dex */
public final class ap70 extends wa6<xo70> implements yo70 {
    public static final /* synthetic */ int U = 0;
    public io10 R;
    public final bpn0 S = new bpn0(new gu0(29));
    public View T;

    @Override // xsna.wa6, xsna.q0c
    public final void a9(MethodSelectorCodeState methodSelectorCodeState) {
        Context context;
        Context context2;
        View view;
        Context context3;
        Drawable findDrawableByLayerId;
        super.a9(methodSelectorCodeState);
        boolean z = methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger;
        bpn0 bpn0Var = this.S;
        if (!z) {
            io10 io10Var = this.R;
            if (io10Var != null && (view = io10Var.c) != null) {
                f4m.j(view);
            }
            ho10 ho10Var = (ho10) bpn0Var.getValue();
            VkAuthToolbar vkAuthToolbar = this.j;
            AppBarLayout appBarLayout = this.h;
            ycu0 ycu0Var = this.p;
            if (ycu0Var == null) {
                ycu0Var = null;
            }
            ho10Var.getClass();
            if (vkAuthToolbar != null && (context2 = vkAuthToolbar.getContext()) != null && ho10Var.a != null && ho10Var.b != null) {
                Drawable navigationIcon = vkAuthToolbar.getNavigationIcon();
                if (navigationIcon != null) {
                    navigationIcon.setColorFilter(ho10Var.a);
                }
                if (appBarLayout != null) {
                    appBarLayout.setBackground(ho10Var.b);
                }
                vkAuthToolbar.setTitleTextAppearance(R.style.VkAuth_ToolbarTitleTextAppearance);
                vkAuthToolbar.setPicture(ycu0Var.b(context2));
                ho10Var.b = null;
                ho10Var.a = null;
            }
            ho10 ho10Var2 = (ho10) bpn0Var.getValue();
            ImageView imageView = this.i;
            View view2 = this.n;
            View view3 = this.T;
            ho10Var2.getClass();
            if (imageView == null || (context = imageView.getContext()) == null) {
                return;
            }
            f4m.j(imageView);
            if ((view2 != null ? view2.getBackground() : null) == null && view2 != null) {
                view2.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, context));
            }
            if (view3 != null) {
                f4m.j(view3);
                return;
            }
            return;
        }
        ho10 ho10Var3 = (ho10) bpn0Var.getValue();
        VkAuthToolbar vkAuthToolbar2 = this.j;
        AppBarLayout appBarLayout2 = this.h;
        ycu0 ycu0Var2 = this.p;
        if (ycu0Var2 == null) {
            ycu0Var2 = null;
        }
        ho10Var3.getClass();
        if (vkAuthToolbar2 != null && (context3 = vkAuthToolbar2.getContext()) != null) {
            Drawable navigationIcon2 = vkAuthToolbar2.getNavigationIcon();
            ho10Var3.a = navigationIcon2 != null ? navigationIcon2.getColorFilter() : null;
            int m = krv0.m(R.attr.vk_ui_icon_contrast, context3);
            Drawable navigationIcon3 = vkAuthToolbar2.getNavigationIcon();
            if (navigationIcon3 != null) {
                sjo.b(navigationIcon3, m, PorterDuff.Mode.SRC_IN);
            }
            ho10Var3.b = appBarLayout2 != null ? appBarLayout2.getBackground() : null;
            if (appBarLayout2 != null) {
                appBarLayout2.setBackground(null);
            }
            vkAuthToolbar2.setTitleTextAppearance(R.style.VkAuth_ToolbarTitleForcedDarkTextAppearance);
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.getClass();
            dhr0.M();
            Drawable b = ycu0Var2.b(context3);
            LayerDrawable layerDrawable = b != null ? (LayerDrawable) b : null;
            if (layerDrawable != null && (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.text)) != null) {
                findDrawableByLayerId.setTint(krv0.m(R.attr.vk_ui_icon_contrast, context3));
            }
            vkAuthToolbar2.setPicture(b);
        }
        ho10 ho10Var4 = (ho10) bpn0Var.getValue();
        ImageView imageView2 = this.i;
        View view4 = this.n;
        View view5 = this.T;
        ho10Var4.getClass();
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.vk_auth_illustration_max_promo_background);
            imageView2.setVisibility(0);
        }
        if (view4 != null) {
            view4.setBackground(null);
        }
        if (view5 != null) {
            view5.setVisibility(0);
        }
        io10 io10Var2 = this.R;
        if (io10Var2 != null) {
            MethodSelectorCodeState.MaxMessenger maxMessenger = (MethodSelectorCodeState.MaxMessenger) methodSelectorCodeState;
            if (!io10Var2.e) {
                io10Var2.e = true;
                io10Var2.c = io10Var2.a.inflate();
            }
            View view6 = io10Var2.c;
            Button button = view6 != null ? (Button) view6.findViewById(R.id.max_messenger_open_button) : null;
            io10Var2.d = button;
            if (button != null) {
                jjc.g(button, new rh4(19, io10Var2, maxMessenger));
            }
            io10Var2.a(R.id.max_messenger_first_subtitle_cell, R.drawable.vk_icon_flash_outline_28, R.string.vk_auth_max_messenger_first_cell_title);
            io10Var2.a(R.id.max_messenger_second_subtitle_cell, R.drawable.vk_icon_key_square_outline_28, R.string.vk_auth_max_messenger_second_cell_title);
            io10Var2.a(R.id.max_messenger_third_subtitle_cell, R.drawable.vk_icon_check_shield_outline_28, R.string.vk_auth_max_messenger_third_cell_title);
            View view7 = io10Var2.c;
            if (view7 != null) {
                view7.setVisibility(0);
            }
        }
    }

    @Override // xsna.wa6, xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.R = null;
    }

    @Override // xsna.wa6, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.max_messenger_stub);
        viewStub.setLayoutResource(R.layout.vk_auth_check_max_messenger);
        this.R = new io10(viewStub, this.Q);
        this.T = view.findViewById(R.id.max_messenger_additional_background);
        super.onViewCreated(view, bundle);
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        VerificationMethodState verificationMethodState = this.v;
        String str = this.t;
        if (str == null) {
            str = null;
        }
        CheckPresenterInfo checkPresenterInfo = this.u;
        if (checkPresenterInfo == null) {
            checkPresenterInfo = null;
        }
        return new bp70(verificationMethodState, bundle, str, checkPresenterInfo, new zo70(2, this, ap70.class, "startActivityForResult", "startActivityForResult(Landroid/content/Intent;I)V", 0), ((SuspiciousAuthComponent) m7m.d(this).a(fpf0.a(SuspiciousAuthComponent.class))).c());
    }

    @Override // xsna.wa6, xsna.x65
    public final void wm(boolean z) {
        Button button;
        super.wm(z);
        io10 io10Var = this.R;
        if (io10Var != null) {
            boolean z2 = !z;
            if (io10Var.e && (button = io10Var.d) != null) {
                button.setEnabled(z2);
            }
        }
    }

    @Override // xsna.wa6
    public final void yn() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((xo70) obj).y0(this);
    }
}
