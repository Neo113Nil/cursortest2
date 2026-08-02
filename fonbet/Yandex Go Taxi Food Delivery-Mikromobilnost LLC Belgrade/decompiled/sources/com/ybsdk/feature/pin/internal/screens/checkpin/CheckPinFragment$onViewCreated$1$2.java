package com.ybsdk.feature.pin.internal.screens.checkpin;

import defpackage.evu0;
import defpackage.gvu0;
import defpackage.jl40;
import defpackage.khb;
import defpackage.phb;
import defpackage.pz40;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class CheckPinFragment$onViewCreated$1$2 extends FunctionReferenceImpl implements sls {
    public CheckPinFragment$onViewCreated$1$2(uc5 uc5Var) {
        super(0, uc5Var, b.class, "removeSymbol", "removeSymbol()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        phb phbVar;
        b bVar = (b) this.receiver;
        if (jl40.l(((phb) bVar.X()).g, khb.d) && !evu0.J(((phb) bVar.X()).f)) {
            pz40 Y = bVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                phbVar = (phb) value;
            } while (!r0Var.k(value, phb.a(phbVar, false, false, null, gvu0.t0(1, phbVar.f), null, null, null, null, false, null, 4063)));
        }
        return zy11.a;
    }
}
