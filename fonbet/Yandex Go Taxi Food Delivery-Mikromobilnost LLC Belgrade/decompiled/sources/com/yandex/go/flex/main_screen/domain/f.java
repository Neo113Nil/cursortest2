package com.yandex.go.flex.main_screen.domain;

import defpackage.avj0;
import defpackage.kyh0;
import defpackage.mwz0;
import defpackage.nwz0;
import defpackage.pwz0;
import defpackage.vpr;
import defpackage.z131;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class f implements vpr {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        SuperappFlexAddressInteractor$LocationState superappFlexAddressInteractor$LocationState;
        Pair pair = (Pair) obj;
        String str = (String) pair.getFirst();
        pwz0 pwz0Var = (pwz0) pair.getSecond();
        g gVar = this.a;
        zuj0 zuj0Var = gVar.d;
        com.yandex.div.core.expression.variables.a aVar = gVar.b;
        if (pwz0Var instanceof nwz0) {
            str = ((avj0) zuj0Var).h(kyh0.specify_the_system_address);
            superappFlexAddressInteractor$LocationState = SuperappFlexAddressInteractor$LocationState.LOCATION_DISABLED;
        } else if (pwz0Var instanceof mwz0) {
            str = ((avj0) zuj0Var).h(kyh0.specify_the_system_address);
            superappFlexAddressInteractor$LocationState = SuperappFlexAddressInteractor$LocationState.PERMISSION_DENIED;
        } else {
            superappFlexAddressInteractor$LocationState = SuperappFlexAddressInteractor$LocationState.OK;
        }
        if (str != null) {
            aVar.i(new z131("superapp.point_a.address_short_text", str));
        }
        aVar.i(new z131("superapp.location_state", superappFlexAddressInteractor$LocationState.getRawValue()));
        return zy11.a;
    }
}
