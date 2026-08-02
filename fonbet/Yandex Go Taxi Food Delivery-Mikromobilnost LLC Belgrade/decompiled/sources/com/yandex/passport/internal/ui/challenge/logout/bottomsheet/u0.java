package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.mnq0;
import defpackage.tls;
import defpackage.uc20;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class u0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ u0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
                break;
            case 1:
                androidx.compose.ui.semantics.f.d((mnq0) obj);
                break;
            case 2:
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.bottomMargin = (int) (2.0f * uc20.a.density);
                view.setLayoutParams(marginLayoutParams);
                break;
            case 3:
                ViewGroup.LayoutParams layoutParams2 = ((ImageView) obj).getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams2.width = -2;
                marginLayoutParams2.height = -2;
                DisplayMetrics displayMetrics = uc20.a;
                marginLayoutParams2.setMarginEnd((int) (4.0f * displayMetrics.density));
                marginLayoutParams2.topMargin = (int) (1.0f * displayMetrics.density);
                break;
            default:
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) obj;
                int i2 = (int) (24.0f * uc20.a.density);
                ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = i2;
                ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = i2;
                break;
        }
        return zy11Var;
    }
}
