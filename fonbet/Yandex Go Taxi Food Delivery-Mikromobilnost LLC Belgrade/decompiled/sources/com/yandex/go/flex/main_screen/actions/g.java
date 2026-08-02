package com.yandex.go.flex.main_screen.actions;

import com.yandex.go.flex.main_screen.actions.SdcRouteSelectionAction;
import com.yandex.go.sdc.api.SdcRouteSelectionAction$Origin;
import defpackage.amp0;
import defpackage.dw;
import defpackage.epo0;
import defpackage.kr;
import defpackage.lmp0;
import defpackage.n6u;
import defpackage.rg7;
import defpackage.tcc;
import defpackage.vmn0;
import defpackage.w511;
import defpackage.ylp0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class g implements dw {
    public final amp0 a;

    public g(amp0 amp0Var) {
        this.a = amp0Var;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        com.yandex.go.sdc.api.SdcRouteSelectionAction$ScreenType sdcRouteSelectionAction$ScreenType;
        SdcRouteSelectionAction sdcRouteSelectionAction = (SdcRouteSelectionAction) krVar;
        String str = sdcRouteSelectionAction.a;
        String str2 = sdcRouteSelectionAction.b;
        List<SdcRouteSelectionAction.Screen> list = sdcRouteSelectionAction.c;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (SdcRouteSelectionAction.Screen screen : list) {
            SdcRouteSelectionAction.ScreenType screenType = screen.a;
            int i = screenType == null ? -1 : f.a[screenType.ordinal()];
            if (i == -1) {
                sdcRouteSelectionAction$ScreenType = null;
            } else if (i == 1) {
                sdcRouteSelectionAction$ScreenType = com.yandex.go.sdc.api.SdcRouteSelectionAction$ScreenType.SOURCE;
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                sdcRouteSelectionAction$ScreenType = com.yandex.go.sdc.api.SdcRouteSelectionAction$ScreenType.DESTINATION;
            }
            String str3 = screen.b;
            String str4 = screen.c;
            SdcRouteSelectionAction.Button button = screen.d;
            arrayList.add(new lmp0(sdcRouteSelectionAction$ScreenType, str3, str4, new rg7(button.a, button.b, button.c)));
        }
        vmn0 vmn0Var = new vmn0(str, str2, arrayList, sdcRouteSelectionAction.e, sdcRouteSelectionAction.d, SdcRouteSelectionAction$Origin.SuperappMain);
        amp0 amp0Var = this.a;
        ((ylp0) amp0Var.a).a(vmn0Var, new epo0(8, amp0Var, vmn0Var));
    }
}
