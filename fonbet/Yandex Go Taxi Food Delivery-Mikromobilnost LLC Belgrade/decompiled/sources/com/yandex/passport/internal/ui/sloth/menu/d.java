package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class d implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        com.yandex.passport.internal.ui.sloth.plusdevices.e eVar;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((UserMenuActivity) obj).processError("Sloth returned crash");
                return zy11Var;
            case 1:
                ((sls) obj).invoke();
                return zy11Var;
            case 2:
                eVar = ((ManagingPlusDevicesHelperActivity) obj).ui;
                if (eVar == null) {
                    eVar = null;
                }
                eVar.c.setVisibility(0);
                return zy11Var;
            default:
                return ((com.yandex.passport.user_id.models.e) ((com.arkivanov.mvikotlin.extensions.coroutines.a) obj).getValue()).a;
        }
    }
}
