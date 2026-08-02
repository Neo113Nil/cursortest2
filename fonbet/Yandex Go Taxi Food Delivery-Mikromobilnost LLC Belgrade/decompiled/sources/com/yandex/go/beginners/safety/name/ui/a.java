package com.yandex.go.beginners.safety.name.ui;

import com.yandex.go.beginners.safety.name.domain.model.SafetyNameInputScreenState$Type;
import defpackage.epl0;
import defpackage.evu0;
import defpackage.pwl0;
import defpackage.pzt0;
import defpackage.rvl0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uvl0;
import defpackage.vvl0;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.beginners.safety.name.domain.a a;
    public final epl0 b;
    public final pwl0 c = new pwl0();
    public pzt0 d;

    public a(com.yandex.go.beginners.safety.name.domain.a aVar, epl0 epl0Var) {
        this.a = aVar;
        this.b = epl0Var;
    }

    public final void a(tse tseVar, rvl0 rvl0Var, vvl0 vvl0Var) {
        Object value;
        Object value2;
        epl0 epl0Var = this.b;
        epl0Var.getClass();
        epl0Var.a.a("SafeNewbies.NameInput.Done.Tapped", new HashMap(), 1, new HashMap());
        r0 r0Var = vvl0Var.a;
        String str = ((uvl0) r0Var.getValue()).b;
        this.c.getClass();
        if (!pwl0.a(str)) {
            do {
                value2 = r0Var.getValue();
            } while (!r0Var.k(value2, uvl0.a((uvl0) value2, SafetyNameInputScreenState$Type.VALIDATION_ERROR_STATE)));
            return;
        }
        String obj = evu0.k0(str).toString();
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, uvl0.a((uvl0) value, SafetyNameInputScreenState$Type.SENDING_STATE)));
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = tje.N(tseVar, null, null, new SafetyNameInputUiActionHandler$onDoneClicked$3(this, obj, rvl0Var, vvl0Var, null), 3);
    }
}
