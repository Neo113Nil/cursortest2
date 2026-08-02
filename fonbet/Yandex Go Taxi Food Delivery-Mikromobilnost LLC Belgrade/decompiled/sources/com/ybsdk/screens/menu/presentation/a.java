package com.ybsdk.screens.menu.presentation;

import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.a3z;
import defpackage.dn10;
import defpackage.ds31;
import defpackage.pz40;
import defpackage.tje;
import defpackage.v0h;
import defpackage.x0h;
import defpackage.y0h;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a implements a3z {
    public final /* synthetic */ DeeplinkHandleResult$DeeplinkType a;
    public final /* synthetic */ b b;

    public a(DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType, b bVar) {
        this.a = deeplinkHandleResult$DeeplinkType;
        this.b = bVar;
    }

    @Override // defpackage.a3z
    public final y0h a(Deeplink deeplink) {
        r0 r0Var;
        Object value;
        if (!(deeplink.getAction() instanceof DeeplinkAction.PassportAccount)) {
            return x0h.a;
        }
        b bVar = this.b;
        bVar.G.J.a.a("menu_screen.profile.click", null);
        if (bVar.B.getShowLogOut()) {
            pz40 Y = bVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, dn10.a((dn10) value, null, true, 15)));
            tje.N(ds31.a(bVar), null, null, new MenuViewModel$onLoginClick$2(bVar, null), 3);
        }
        return new v0h(EmptyList.a, this.a, 2);
    }
}
