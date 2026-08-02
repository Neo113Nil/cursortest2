package com.ybsdk.feature.autotopup.internal.presentation.result;

import defpackage.ba4;
import defpackage.ds31;
import defpackage.lrp0;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.wy3;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.k0();
                lrp0 lrp0Var = lrp0.b;
                ba4 ba4Var = ((wy3) bVar.X()).i;
                if (ba4Var != null) {
                    String str = ba4Var.f;
                    if (str != null) {
                        bVar.M = true;
                        pzt0 pzt0Var = bVar.J;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        bVar.J = tje.N(ds31.a(bVar), null, null, new AutoTopupResultViewModel$retryPayment$1(bVar, ba4Var, str, null), 3);
                        break;
                    } else {
                        x4c.g("Can't retry autotopup payment without retry data", null, null, Collections.singletonList(lrp0Var), 6);
                        break;
                    }
                } else {
                    x4c.g("Can't retry autotopup payment without payment data", null, null, Collections.singletonList(lrp0Var), 6);
                    break;
                }
            default:
                bVar.k0();
                pzt0 pzt0Var2 = bVar.L;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                bVar.L = tje.N(ds31.a(bVar), null, null, new AutoTopupResultViewModel$saveDraft$1(bVar, null), 3);
                break;
        }
        return zy11Var;
    }
}
