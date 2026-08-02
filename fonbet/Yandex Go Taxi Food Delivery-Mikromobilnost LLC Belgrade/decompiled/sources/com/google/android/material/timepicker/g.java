package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;
import defpackage.k710;
import defpackage.leh0;

/* loaded from: classes11.dex */
public final /* synthetic */ class g implements k710 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k710
    public final void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                i iVar = (i) obj;
                if (z) {
                    iVar.b.setPeriod(i == leh0.material_clock_period_pm_button ? 1 : 0);
                    break;
                }
                break;
            default:
                ((TimePickerView) obj).lambda$new$0(materialButtonToggleGroup, i, z);
                break;
        }
    }
}
