package com.yandex.passport.internal.ui.sloth.plusdevices;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class e extends t2y {
    public final View c;

    public e(ManagingPlusDevicesHelperActivity managingPlusDevicesHelperActivity) {
        super(managingPlusDevicesHelperActivity);
        this.c = com.yandex.passport.common.ui.b.b(this, managingPlusDevicesHelperActivity, null, true, 1.0f, 18);
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(linearLayoutBuilder);
        }
        linearLayoutBuilder.invoke(this.c, new com.yandex.passport.internal.ui.bouncer.error.f(linearLayoutBuilder, 8));
        ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder.generateLayoutParams(-2, -2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
        layoutParams.width = -1;
        layoutParams.height = -1;
        linearLayoutBuilder.setLayoutParams(generateLayoutParams);
        return linearLayoutBuilder;
    }
}
