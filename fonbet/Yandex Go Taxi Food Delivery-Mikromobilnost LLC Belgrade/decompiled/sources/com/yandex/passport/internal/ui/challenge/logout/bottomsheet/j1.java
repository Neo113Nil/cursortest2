package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import defpackage.tls;
import defpackage.uc20;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class j1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinearLayoutBuilder b;

    public /* synthetic */ j1(LinearLayoutBuilder linearLayoutBuilder, int i) {
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
                ((View) obj).setLayoutParams(linearLayoutBuilder.generateLayoutParams(-1, -2));
                break;
            case 1:
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutBuilder.generateLayoutParams(-2, -2);
                layoutParams.width = -1;
                layoutParams.height = -2;
                break;
            case 2:
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayoutBuilder.generateLayoutParams(-2, -2);
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                break;
            case 3:
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) linearLayoutBuilder.generateLayoutParams(-2, -2);
                layoutParams3.width = -2;
                layoutParams3.height = -2;
                break;
            case 4:
                ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) generateLayoutParams;
                layoutParams4.width = -1;
                layoutParams4.height = -2;
                ((HorizontalScrollView) obj).setLayoutParams(generateLayoutParams);
                break;
            default:
                ViewGroup.LayoutParams generateLayoutParams2 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) generateLayoutParams2;
                layoutParams5.width = -1;
                layoutParams5.height = (int) (32.0f * uc20.a.density);
                ((View) obj).setLayoutParams(generateLayoutParams2);
                break;
        }
        return zy11Var;
    }
}
