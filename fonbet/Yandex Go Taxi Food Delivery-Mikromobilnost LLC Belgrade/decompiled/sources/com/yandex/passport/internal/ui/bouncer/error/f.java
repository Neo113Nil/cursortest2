package com.yandex.passport.internal.ui.bouncer.error;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationBarView;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.internal.ui.bouncer.roundabout.w;
import defpackage.tls;
import defpackage.uc20;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinearLayoutBuilder b;

    public /* synthetic */ f(LinearLayoutBuilder linearLayoutBuilder, int i) {
        this.a = i;
        this.b = linearLayoutBuilder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        LinearLayoutBuilder linearLayoutBuilder = this.b;
        switch (i) {
            case 0:
                ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
                layoutParams.width = -1;
                layoutParams.height = -2;
                ((ImageView) obj).setLayoutParams(generateLayoutParams);
                break;
            case 1:
                ViewGroup.LayoutParams generateLayoutParams2 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                ((TextView) obj).setLayoutParams(generateLayoutParams2);
                break;
            case 2:
                ViewGroup.LayoutParams generateLayoutParams3 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) generateLayoutParams3;
                layoutParams3.width = -1;
                layoutParams3.height = -2;
                ((Button) obj).setLayoutParams(generateLayoutParams3);
                break;
            case 3:
                Button button = (Button) obj;
                button.setVisibility(8);
                ViewGroup.LayoutParams generateLayoutParams4 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) generateLayoutParams4;
                layoutParams4.width = -1;
                layoutParams4.height = -2;
                button.setLayoutParams(generateLayoutParams4);
                break;
            case 4:
                ViewGroup.LayoutParams generateLayoutParams5 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) generateLayoutParams5;
                layoutParams5.width = -1;
                layoutParams5.height = -2;
                ((TextView) obj).setLayoutParams(generateLayoutParams5);
                break;
            case 5:
                ViewGroup.LayoutParams generateLayoutParams6 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) generateLayoutParams6;
                layoutParams6.width = -1;
                layoutParams6.height = -2;
                ((Button) obj).setLayoutParams(generateLayoutParams6);
                break;
            case 6:
                ViewGroup.LayoutParams generateLayoutParams7 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) generateLayoutParams7;
                int i2 = w.b;
                layoutParams7.width = i2;
                layoutParams7.height = i2;
                DisplayMetrics displayMetrics = uc20.a;
                layoutParams7.setMarginStart((int) (displayMetrics.density * 12.0f));
                layoutParams7.setMarginEnd((int) (displayMetrics.density * 12.0f));
                int i3 = (int) (12.0f * displayMetrics.density);
                ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = i3;
                ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin = i3;
                ((ImageView) obj).setLayoutParams(generateLayoutParams7);
                break;
            case 7:
                ViewGroup.LayoutParams generateLayoutParams8 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) generateLayoutParams8;
                layoutParams8.height = -2;
                layoutParams8.width = -1;
                layoutParams8.setMarginEnd((int) (12.0f * uc20.a.density));
                layoutParams8.gravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
                ((TextView) obj).setLayoutParams(generateLayoutParams8);
                break;
            default:
                View view = (View) obj;
                view.setVisibility(8);
                linearLayoutBuilder.setGravity(17);
                ViewGroup.LayoutParams generateLayoutParams9 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) generateLayoutParams9;
                int i4 = (int) (50.0f * uc20.a.density);
                layoutParams9.width = i4;
                layoutParams9.height = i4;
                view.setLayoutParams(generateLayoutParams9);
                break;
        }
        return zy11Var;
    }
}
