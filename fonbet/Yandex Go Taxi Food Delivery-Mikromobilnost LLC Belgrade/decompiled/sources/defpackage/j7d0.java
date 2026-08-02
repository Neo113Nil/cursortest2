package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.b;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.PlusPanelStatusAndFamilyView;
import java.util.ArrayList;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class j7d0 {
    public static final /* synthetic */ kgx[] i = {new PropertyReference1Impl("statusContainer", 0, "getStatusContainer()Landroid/view/ViewGroup;", j7d0.class), b64.x(qoi0.a, j7d0.class, "familyContainer", "getFamilyContainer()Landroid/view/ViewGroup;", 0), new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", j7d0.class), new PropertyReference1Impl("arrowIconImageView", 0, "getArrowIconImageView()Landroid/widget/ImageView;", j7d0.class), new PropertyReference1Impl("familyBackground", 0, "getFamilyBackground()Landroid/view/View;", j7d0.class), new PropertyReference1Impl("familyPlusImageView", 0, "getFamilyPlusImageView()Landroid/widget/ImageView;", j7d0.class), new PropertyReference1Impl("addFamilyTextView", 0, "getAddFamilyTextView()Landroid/widget/TextView;", j7d0.class), new PropertyReference1Impl("avatarsContainer", 0, "getAvatarsContainer()Landroid/view/ViewGroup;", j7d0.class)};
    public final PlusPanelStatusAndFamilyView a;
    public final sls b;
    public final wv5 c;
    public final wv5 d;
    public final wv5 e;
    public final wv5 f;
    public final float g;
    public b8u0 h;

    public j7d0(PlusPanelStatusAndFamilyView plusPanelStatusAndFamilyView, sls slsVar) {
        this.a = plusPanelStatusAndFamilyView;
        this.b = slsVar;
        this.c = new wv5(new i7d0(plusPanelStatusAndFamilyView, u9h0.plus_panel_status_container, 0));
        this.d = new wv5(new i7d0(plusPanelStatusAndFamilyView, u9h0.plus_panel_family_container, 1));
        this.e = new wv5(new i7d0(plusPanelStatusAndFamilyView, u9h0.plus_panel_status_title_text_view, 2));
        this.f = new wv5(new i7d0(plusPanelStatusAndFamilyView, u9h0.plus_panel_arrow_forward_image_view, 3));
        new wv5(new i7d0(plusPanelStatusAndFamilyView, u9h0.plus_panel_family_container_background, 4));
        new wv5(new i7d0(plusPanelStatusAndFamilyView, u9h0.plus_panel_family_plus_image_view, 5));
        new wv5(new i7d0(plusPanelStatusAndFamilyView, u9h0.plus_panel_family_add_text_view, 6));
        this.g = plusPanelStatusAndFamilyView.getResources().getDimension(nvg0.plus_sdk_panel_default_corner_radius);
        plusPanelStatusAndFamilyView.getResources().getDimension(nvg0.plus_sdk_panel_family_action_button_corner_radius);
        m810.b(plusPanelStatusAndFamilyView.getResources().getDimension(nvg0.plus_sdk_mu_0_75));
        new ArrayList();
    }

    public static final void a(j7d0 j7d0Var, String str, String str2) {
        wv5 wv5Var = j7d0Var.c;
        kgx[] kgxVarArr = i;
        ((ViewGroup) wv5Var.a(kgxVarArr[0])).setContentDescription(str);
        b.p((ViewGroup) j7d0Var.c.a(kgxVarArr[0]), new g7d0());
        wv5 wv5Var2 = j7d0Var.d;
        ((ViewGroup) wv5Var2.a(kgxVarArr[1])).setContentDescription(str2);
        b.p((ViewGroup) wv5Var2.a(kgxVarArr[1]), new h7d0());
    }

    public static final void b(j7d0 j7d0Var, PlusColor plusColor) {
        ((ImageView) j7d0Var.f.a(i[3])).setImageDrawable(plusColor != null ? s2d0.e(plusColor, j7d0Var.a.getThemedContext(), jxg0.plus_sdk_panel_ic_arrow_forward) : null);
    }

    public static final void c(j7d0 j7d0Var, PlusColor plusColor, int i2) {
        PlusPanelStatusAndFamilyView plusPanelStatusAndFamilyView = j7d0Var.a;
        float f = j7d0Var.g;
        plusPanelStatusAndFamilyView.setBackground(s2d0.b(plusColor, i2, f, f, f, f));
        wv5 wv5Var = j7d0Var.c;
        kgx[] kgxVarArr = i;
        ViewGroup viewGroup = (ViewGroup) wv5Var.a(kgxVarArr[0]);
        float f2 = j7d0Var.g;
        viewGroup.setBackground(d(j7d0Var, f2, 0.0f, 2));
        ((ViewGroup) j7d0Var.d.a(kgxVarArr[1])).setBackground(d(j7d0Var, 0.0f, f2, 1));
    }

    public static RippleDrawable d(j7d0 j7d0Var, float f, float f2, int i2) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return new RippleDrawable(ColorStateList.valueOf(vng.p(rng0.plus_sdk_panelDefaultRippleColor, j7d0Var.a.getThemedContext())), null, new ShapeDrawable(nbb1.a(f, f, f2, f2)));
    }
}
