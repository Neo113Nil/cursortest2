package com.yandex.go.payments.addmethod.navigation;

import defpackage.a60;
import defpackage.evu0;
import defpackage.h55;
import defpackage.kg0;
import defpackage.p0;
import defpackage.qu;
import defpackage.tje;
import defpackage.uh0;
import defpackage.v770;
import defpackage.y50;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class b implements kg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ b(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.kg0
    public final void D0(uh0 uh0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                c.S((c) h55Var, EmptyList.a, uh0Var, null, null);
                break;
            default:
                e eVar = (e) h55Var;
                eVar.getClass();
                tje.N(eVar.o(), null, null, new AddWalletBindingBaseRouter$withSpinner$1(uh0Var, eVar, new AddWalletBindingBaseRouter$startBindPaymentMethod$bindAction$1(eVar, EmptyList.a, null, uh0Var, null, null), null), 3);
                break;
        }
    }

    @Override // defpackage.kg0
    public final void O(String str) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                c cVar = (c) h55Var;
                tje.N(cVar.o(), null, null, new AddFastshiftAccountBaseRouter$withSpinner$1(cVar, null, new AddFastshiftAccountBaseRouter$onLaunch$1$1$onOpenBindUrl$1(cVar, str, null), null), 3);
                break;
            default:
                e eVar = (e) h55Var;
                tje.N(eVar.o(), null, null, new AddWalletBindingBaseRouter$withSpinner$1(null, eVar, new AddWalletBindingBaseRouter$onLaunch$1$1$onOpenBindUrl$1(eVar, str, null), null), 3);
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                ((c) this.b).r(new qu(9));
                break;
            default:
                ((e) this.b).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.kg0
    public final void h0(String str) {
        int i = this.a;
        v770 v770Var = v770.c;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                c cVar = (c) h55Var;
                cVar.getClass();
                if (!evu0.J(str)) {
                    ((a60) cVar.F).c(str, v770Var);
                }
                cVar.r(new p0(17));
                break;
            default:
                e eVar = (e) h55Var;
                eVar.getClass();
                if (!evu0.J(str)) {
                    ((a60) ((y50) eVar.D.c)).c(str, v770Var);
                }
                eVar.r(new p0(26));
                break;
        }
    }
}
