package com.ybsdk.feature.pin.internal.screens.createpin;

import defpackage.b7f;
import defpackage.c7f;
import defpackage.evu0;
import defpackage.gvu0;
import defpackage.jl40;
import defpackage.pz40;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class CreatePinFragment$onViewCreated$1$4 extends FunctionReferenceImpl implements sls {
    public CreatePinFragment$onViewCreated$1$4(uc5 uc5Var) {
        super(0, uc5Var, a.class, "removeSymbol", "removeSymbol()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        c7f c7fVar;
        r0 r0Var2;
        Object value2;
        c7f c7fVar2;
        a aVar = (a) this.receiver;
        if (jl40.l(((c7f) aVar.X()).c, b7f.a)) {
            if (!evu0.J(((c7f) aVar.X()).b)) {
                pz40 Y = aVar.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                    c7fVar2 = (c7f) value2;
                } while (!r0Var2.k(value2, c7f.a(c7fVar2, null, gvu0.t0(1, c7fVar2.b), null, null, null, null, 253)));
            } else if (!evu0.J(((c7f) aVar.X()).a) && !evu0.J(((c7f) aVar.X()).a)) {
                pz40 Y2 = aVar.Y();
                do {
                    r0Var = (r0) Y2;
                    value = r0Var.getValue();
                    c7fVar = (c7f) value;
                } while (!r0Var.k(value, c7f.a(c7fVar, gvu0.t0(1, c7fVar.a), null, null, null, null, null, 254)));
            }
        }
        return zy11.a;
    }
}
