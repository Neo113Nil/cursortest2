package com.yandex.go.scooters.passes;

import defpackage.ggo0;
import defpackage.h55;
import defpackage.iin0;
import defpackage.jeo0;
import defpackage.jl40;
import defpackage.keo0;
import defpackage.leo0;
import defpackage.m950;
import defpackage.meo0;
import defpackage.neo0;
import defpackage.q8p0;
import defpackage.sy60;
import defpackage.tje;
import defpackage.uem;
import defpackage.vpr;
import defpackage.w511;
import defpackage.w8p0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ b(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                neo0 neo0Var = (neo0) obj;
                c cVar = (c) h55Var;
                if (neo0Var instanceof meo0) {
                    meo0 meo0Var = (meo0) neo0Var;
                    cVar.A((m950) cVar.D.get(), new w8p0(new q8p0(meo0Var.a, meo0Var.b), (com.yandex.go.scooters.mosru.b) null, 6), sy60.Q2);
                    return zy11Var;
                }
                if (neo0Var instanceof leo0) {
                    leo0 leo0Var = (leo0) neo0Var;
                    cVar.getClass();
                    if (leo0Var.b) {
                        cVar.r(new a(leo0Var));
                        return zy11Var;
                    }
                    cVar.N.a(leo0Var.a);
                    return zy11Var;
                }
                if (neo0Var instanceof jeo0) {
                    jeo0 jeo0Var = (jeo0) neo0Var;
                    uem uemVar = jeo0Var.b;
                    tje.N(cVar.o(), null, null, new ScootersPassesDocumentRouter$openPaymentMethods$1(cVar, jeo0Var.a, uemVar, null), 3);
                    return zy11Var;
                }
                cVar.getClass();
                if (jl40.l(neo0Var, keo0.b)) {
                    tje.N(cVar.o(), null, null, new ScootersPassesDocumentRouter$openPaymentMethods$1(cVar, new iin0(15, cVar), null, null), 3);
                    return zy11Var;
                }
                if (jl40.l(neo0Var, keo0.a)) {
                    cVar.P();
                    return zy11Var;
                }
                w511.b();
                return null;
            default:
                i iVar = (i) h55Var;
                tje.N(iVar.o(), null, null, new ScootersPassesRouterImpl$showDocumentRouter$1(iVar, (ggo0) obj, null), 3);
                return zy11Var;
        }
    }
}
