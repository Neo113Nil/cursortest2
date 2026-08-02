package com.yandex.passport.internal.ui.common;

import android.app.Activity;
import android.view.View;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.R;
import com.yandex.passport.api.ProgressBackground;
import com.yandex.passport.api.n3;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.p;
import defpackage.kp31;
import defpackage.li91;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class c extends t2y {
    public final ProgressPropertiesImpl c;
    public final View w;
    public final n3 x;

    public c(Activity activity, ProgressPropertiesImpl progressPropertiesImpl, p pVar) {
        super(activity);
        this.c = progressPropertiesImpl;
        this.w = com.yandex.passport.common.ui.b.b(this, activity, progressPropertiesImpl, pVar.w, 1.0f, 16);
        this.x = progressPropertiesImpl.getSize().toSize();
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(linearLayoutBuilder);
        }
        linearLayoutBuilder.setOrientation(1);
        ProgressPropertiesImpl progressPropertiesImpl = this.c;
        if (progressPropertiesImpl.getBackground() instanceof ProgressBackground.Custom) {
            linearLayoutBuilder.setBackgroundResource(((ProgressBackground.Custom) progressPropertiesImpl.getBackground()).getBackgroundResId());
        } else {
            li91.g(R.color.passport_roundabout_background, linearLayoutBuilder);
        }
        linearLayoutBuilder.setGravity(17);
        linearLayoutBuilder.invoke(this.w, new s0(19, linearLayoutBuilder, this));
        return linearLayoutBuilder;
    }
}
