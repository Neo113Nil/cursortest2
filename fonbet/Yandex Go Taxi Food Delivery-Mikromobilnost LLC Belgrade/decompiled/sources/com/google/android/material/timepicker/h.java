package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import defpackage.kxh0;
import defpackage.m1c;
import defpackage.wh;

/* loaded from: classes11.dex */
public final class h extends m1c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Resources c;
    public final /* synthetic */ TimeModel w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Context context, int i, Resources resources, TimeModel timeModel, int i2) {
        super(context, i);
        this.b = i2;
        this.c = resources;
        this.w = timeModel;
    }

    @Override // defpackage.m1c, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        int i = this.b;
        TimeModel timeModel = this.w;
        Resources resources = this.c;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.t(resources.getString(kxh0.material_timepicker_hour) + " " + view.getResources().getString(timeModel.getHourContentDescriptionResId(), String.valueOf(timeModel.getHourForDisplay())));
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.t(resources.getString(kxh0.material_timepicker_minute) + " " + view.getResources().getString(kxh0.material_minute_suffix, String.valueOf(timeModel.minute)));
                break;
        }
    }
}
