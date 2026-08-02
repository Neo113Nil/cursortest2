package com.ybsdk.feature.savings.internal.screens.create;

import defpackage.ds31;
import defpackage.gdm0;
import defpackage.gya1;
import defpackage.o4m0;
import defpackage.p4m0;
import defpackage.q4m0;
import defpackage.r4m0;
import defpackage.s4m0;
import defpackage.sls;
import defpackage.t4m0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.w511;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountCreationFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements sls {
    public SavingsAccountCreationFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onPrimaryErrorButtonClick", "onPrimaryErrorButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        s4m0 s4m0Var = ((t4m0) aVar.X()).a;
        if (s4m0Var == null) {
            x4c.g("Savings Account Opening error primary button click without error in state", null, null, null, 14);
        } else {
            aVar.E.f0.a.a("savings.registration.retry", null);
            if (s4m0Var instanceof o4m0) {
                aVar.c0();
            } else if (s4m0Var instanceof p4m0) {
                tje.N(ds31.a(aVar), null, null, new SavingsAccountCreationViewModel$startStatusPolling$1(aVar, ((gya1) s4m0Var).f(), null), 3);
            } else if (s4m0Var instanceof q4m0) {
                String str = ((q4m0) s4m0Var).c;
                if (str == null) {
                    aVar.C.e();
                } else if (!aVar.H.b(str)) {
                    ((gdm0) aVar.G).a(str);
                }
            } else {
                if (!(s4m0Var instanceof r4m0)) {
                    w511.b();
                    return null;
                }
                x4c.g("Savings Account Opening error primary button click on polling timeout", null, null, null, 14);
            }
        }
        return zy11.a;
    }
}
