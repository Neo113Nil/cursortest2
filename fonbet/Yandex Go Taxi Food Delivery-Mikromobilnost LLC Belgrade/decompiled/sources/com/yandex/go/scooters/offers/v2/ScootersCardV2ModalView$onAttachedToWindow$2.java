package com.yandex.go.scooters.offers.v2;

import defpackage.czm0;
import defpackage.h7n0;
import defpackage.m950;
import defpackage.rym0;
import defpackage.sy60;
import defpackage.sym0;
import defpackage.tls;
import defpackage.tym0;
import defpackage.uym0;
import defpackage.v6n0;
import defpackage.vym0;
import defpackage.w511;
import defpackage.xym0;
import defpackage.y7n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersCardV2ModalView$onAttachedToWindow$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        xym0 xym0Var = (xym0) obj;
        g gVar = ((h7n0) ((f) this.receiver).A).b;
        if (xym0Var instanceof vym0) {
            uym0 uym0Var = ((vym0) xym0Var).e;
            if (uym0Var instanceof rym0) {
                gVar.A((m950) gVar.f0.get(), new y7n0(((rym0) uym0Var).a), new v6n0(gVar.F, 0));
            } else if (uym0Var instanceof sym0) {
                sym0 sym0Var = (sym0) uym0Var;
                gVar.A((m950) gVar.V.get(), new czm0(sym0Var.a, sym0Var.b, sym0Var.c), sy60.Q2);
            } else if (!(uym0Var instanceof tym0)) {
                w511.b();
                return null;
            }
        }
        return zy11.a;
    }
}
