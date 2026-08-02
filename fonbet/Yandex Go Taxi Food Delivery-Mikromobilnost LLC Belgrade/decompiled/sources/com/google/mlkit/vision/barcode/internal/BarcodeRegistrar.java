package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.alo;
import defpackage.daa1;
import defpackage.e1d;
import defpackage.g0d;
import defpackage.j0d;
import defpackage.qk20;
import defpackage.vwi;
import defpackage.yw91;
import java.util.List;

/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        g0d b = j0d.b(daa1.class);
        b.a(vwi.b(qk20.class));
        b.g = new e1d() { // from class: pc91
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                return new daa1((qk20) yuf0Var.a(qk20.class));
            }
        };
        j0d c = b.c();
        g0d b2 = j0d.b(yw91.class);
        b2.a(vwi.b(daa1.class));
        b2.a(vwi.b(alo.class));
        b2.a(vwi.b(qk20.class));
        b2.g = new e1d() { // from class: ug91
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                return new yw91((daa1) yuf0Var.a(daa1.class), (alo) yuf0Var.a(alo.class), (qk20) yuf0Var.a(qk20.class));
            }
        };
        return zzcs.i(c, b2.c());
    }
}
