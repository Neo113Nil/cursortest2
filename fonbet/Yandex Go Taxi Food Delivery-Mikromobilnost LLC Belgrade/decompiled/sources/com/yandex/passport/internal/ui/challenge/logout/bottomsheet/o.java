package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.passport.common.ui.view.HorizontalScrollViewBuilder;
import defpackage.tls;
import defpackage.uc20;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.internal.ui.c.j((LogoutBottomSheetComposeActivity) obj2, (Throwable) obj);
                break;
            case 1:
                ViewGroup.LayoutParams generateLayoutParams = ((HorizontalScrollViewBuilder) obj2).generateLayoutParams(-2, -2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) generateLayoutParams;
                layoutParams.width = -1;
                layoutParams.height = -2;
                int i2 = (int) (32.0f * uc20.a.density);
                layoutParams.topMargin = i2;
                layoutParams.bottomMargin = i2;
                ((LinearLayout) obj).setLayoutParams(generateLayoutParams);
                break;
            default:
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) obj;
                layoutParams2.width = -1;
                layoutParams2.height = (int) (56.0f * uc20.a.density);
                ((u0) obj2).invoke(layoutParams2);
                break;
        }
        return zy11Var;
    }
}
