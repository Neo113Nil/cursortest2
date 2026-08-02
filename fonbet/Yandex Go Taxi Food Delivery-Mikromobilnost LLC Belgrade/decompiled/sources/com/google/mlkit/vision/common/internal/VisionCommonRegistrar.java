package com.google.mlkit.vision.common.internal;

import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.g0d;
import defpackage.h3b1;
import defpackage.j0d;
import defpackage.jl40;
import defpackage.kl40;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.vwi;
import defpackage.xw91;
import java.util.List;

/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        g0d b = j0d.b(kl40.class);
        b.a(new vwi(2, 0, jl40.class));
        b.g = xw91.H;
        Object[] objArr = {b.c()};
        for (int i = 0; i < 1; i++) {
            h3b1 h3b1Var = zzp.b;
            if (objArr[i] == null) {
                ny61.t(oyr.i(i, "at index "));
                return null;
            }
        }
        return zzp.i(1, objArr);
    }
}
