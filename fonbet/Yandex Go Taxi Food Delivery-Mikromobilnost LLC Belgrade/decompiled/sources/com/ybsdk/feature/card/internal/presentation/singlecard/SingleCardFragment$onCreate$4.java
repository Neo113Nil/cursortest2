package com.ybsdk.feature.card.internal.presentation.singlecard;

import defpackage.e7r0;
import defpackage.pz40;
import defpackage.rgs0;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SingleCardFragment$onCreate$4 extends FunctionReferenceImpl implements sls {
    public SingleCardFragment$onCreate$4(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onSettings2faCancelled", "onSettings2faCancelled()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        a aVar = (a) this.receiver;
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, rgs0.a((rgs0) value, null, false, null, false, null, new e7r0((String) null, (String) null, 7), false, 895)));
        aVar.f0(false);
        return zy11.a;
    }
}
