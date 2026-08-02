package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import defpackage.kxh0;
import defpackage.m1c;
import defpackage.wh;

/* loaded from: classes11.dex */
public final class e extends m1c {
    public final /* synthetic */ int b;
    public final /* synthetic */ f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Context context, int i, int i2) {
        super(context, i);
        this.b = i2;
        this.c = fVar;
    }

    @Override // defpackage.m1c, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        int i = this.b;
        f fVar = this.c;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                Resources resources = view.getResources();
                TimeModel timeModel = fVar.b;
                whVar.t(resources.getString(timeModel.getHourContentDescriptionResId(), String.valueOf(timeModel.getHourForDisplay())));
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.t(view.getResources().getString(kxh0.material_minute_suffix, String.valueOf(fVar.b.minute)));
                break;
        }
    }
}
