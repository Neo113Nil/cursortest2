package com.google.mlkit.vision.face.internal;

import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.alo;
import defpackage.g0d;
import defpackage.j0d;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qc91;
import defpackage.qk20;
import defpackage.seu;
import defpackage.vwi;
import defpackage.x4c;
import defpackage.y991;
import defpackage.zl91;
import java.util.List;

/* loaded from: classes.dex */
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        g0d b = j0d.b(zl91.class);
        b.a(vwi.b(qk20.class));
        b.g = x4c.W;
        j0d c = b.c();
        g0d b2 = j0d.b(qc91.class);
        b2.a(vwi.b(zl91.class));
        b2.a(vwi.b(alo.class));
        b2.g = seu.J;
        Object[] objArr = {c, b2.c()};
        for (int i = 0; i < 2; i++) {
            y991 y991Var = zzbn.b;
            if (objArr[i] == null) {
                ny61.t(oyr.i(i, "at index "));
                return null;
            }
        }
        return zzbn.i(2, objArr);
    }
}
