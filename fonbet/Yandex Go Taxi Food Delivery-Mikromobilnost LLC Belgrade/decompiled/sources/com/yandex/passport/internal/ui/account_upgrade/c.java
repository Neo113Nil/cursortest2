package com.yandex.passport.internal.ui.account_upgrade;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import com.yandex.passport.common.ui.view.CommonSpinner;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.uc20;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class c extends t2y {
    public final boolean c;

    public c(AccountUpgraderActivity accountUpgraderActivity, boolean z) {
        super(accountUpgraderActivity);
        this.c = z;
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        View e;
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(frameLayoutBuilder);
        }
        Context context = frameLayoutBuilder.getContext();
        View view = (View) AccountUpgraderActivityUi$layout$lambda$3$$inlined$commonSpinner$default$1.b.invoke(wj91.e(0, frameLayoutBuilder.getCtx()), 0, 0);
        frameLayoutBuilder.addToParent(view);
        e = com.yandex.passport.internal.ui.c.e(frameLayoutBuilder, context, this.c, (CommonSpinner) view, 1.0f, 0L);
        ViewGroup.LayoutParams generateLayoutParams = frameLayoutBuilder.generateLayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) generateLayoutParams;
        layoutParams.width = -2;
        layoutParams.height = (int) (50.0f * uc20.a.density);
        layoutParams.gravity = 17;
        e.setLayoutParams(generateLayoutParams);
        return frameLayoutBuilder;
    }
}
