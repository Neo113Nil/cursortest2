package com.yandex.go.taxi.order.map.overlay;

import com.yandex.mapkit.map.CameraPosition;
import defpackage.gh00;
import defpackage.pzt0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class o implements vpr {
    public final /* synthetic */ c0 a;

    public o(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c0 c0Var = this.a;
        boolean z = c0Var.N0;
        if (booleanValue) {
            pzt0 pzt0Var = c0Var.P0;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            c0 c0Var2 = this.a;
            if (z) {
                c0Var2.O0 = null;
            } else {
                c0Var2.N0 = true;
                c0Var2.O0 = ((gh00) c0Var2.K).e.c;
            }
        } else if (z) {
            CameraPosition cameraPosition = c0Var.O0;
            c0Var.O0 = null;
            pzt0 pzt0Var2 = c0Var.P0;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            c0 c0Var3 = this.a;
            c0Var3.P0 = com.yandex.go.coroutines.b.g(c0Var3.Kg(), null, null, new OrderMapOverlayPresenter$onResume$20$1(this.a, cameraPosition, null), 3);
        }
        return zy11.a;
    }
}
