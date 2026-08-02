package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.w511;
import defpackage.ymi0;

/* loaded from: classes2.dex */
public final class u implements ymi0 {
    public static final u a = new u();

    @Override // defpackage.ymi0
    public final Object a(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        t tVar = (t) obj2;
        if (tVar instanceof q) {
            return a0.a(a0Var, null, ((q) tVar).a, null, null, 13);
        }
        if (tVar instanceof r) {
            return a0.a(a0Var, null, null, ((r) tVar).a, null, 11);
        }
        if (tVar instanceof p) {
            return a0.a(a0Var, null, null, null, ((p) tVar).a, 7);
        }
        if (tVar instanceof s) {
            return a0.a(a0Var, ((s) tVar).a, null, null, null, 14);
        }
        w511.b();
        return null;
    }
}
