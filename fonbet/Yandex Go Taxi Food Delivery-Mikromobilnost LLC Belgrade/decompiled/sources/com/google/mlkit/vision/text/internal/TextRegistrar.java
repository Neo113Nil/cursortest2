package com.google.mlkit.vision.text.internal;

import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.alo;
import defpackage.e1d;
import defpackage.g0d;
import defpackage.j0d;
import defpackage.ny61;
import defpackage.o991;
import defpackage.oyr;
import defpackage.qk20;
import defpackage.rbb1;
import defpackage.v7b1;
import defpackage.vwi;
import java.util.List;

/* loaded from: classes.dex */
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        g0d b = j0d.b(rbb1.class);
        b.a(vwi.b(qk20.class));
        b.g = new e1d() { // from class: bnb1
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                return new rbb1((qk20) yuf0Var.a(qk20.class));
            }
        };
        j0d c = b.c();
        g0d b2 = j0d.b(v7b1.class);
        b2.a(vwi.b(rbb1.class));
        b2.a(vwi.b(alo.class));
        b2.g = new e1d() { // from class: kqb1
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                return new v7b1((rbb1) yuf0Var.a(rbb1.class), (alo) yuf0Var.a(alo.class));
            }
        };
        Object[] objArr = {c, b2.c()};
        for (int i = 0; i < 2; i++) {
            o991 o991Var = zzbk.b;
            if (objArr[i] == null) {
                ny61.t(oyr.i(i, "at index "));
                return null;
            }
        }
        return zzbk.i(2, objArr);
    }
}
