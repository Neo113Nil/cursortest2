package com.yandex.passport.user_id.ui;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.common.ui.view.CommonSpinner;
import defpackage.abe;
import defpackage.acx;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.tls;
import defpackage.uc20;
import defpackage.wj91;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements tls {
    public final /* synthetic */ int a;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        View e;
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                kp31 abeVar = new abe(context, false, false);
                View view = (View) UserIdUiKt$LoadingPage$lambda$3$lambda$2$lambda$1$$inlined$commonSpinner$default$1.b.invoke(wj91.e(0, context), 0, 0);
                if (abeVar instanceof lzx) {
                    ((lzx) abeVar).addToParent(view);
                }
                CommonSpinner commonSpinner = (CommonSpinner) view;
                DisplayMetrics displayMetrics = uc20.a;
                int i = (int) (displayMetrics.density * 50.0f);
                commonSpinner.setLayoutParams(new ViewGroup.LayoutParams(i, i));
                float f = displayMetrics.density;
                commonSpinner.setTranslationX((((int) (80.0f * f)) - ((int) (f * 50.0f))) / 2.0f);
                float f2 = displayMetrics.density;
                commonSpinner.setTranslationY((((int) (80.0f * f2)) - ((int) (50.0f * f2))) / 2.0f);
                e = com.yandex.passport.internal.ui.c.e(abeVar, context, false, commonSpinner, 1.0f, 0L);
                return e;
            default:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.m = true;
                return zy11.a;
        }
    }
}
