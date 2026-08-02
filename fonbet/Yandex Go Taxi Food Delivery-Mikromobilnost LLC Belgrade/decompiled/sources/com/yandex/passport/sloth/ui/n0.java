package com.yandex.passport.sloth.ui;

import defpackage.w511;
import defpackage.ymi0;

/* loaded from: classes2.dex */
public final class n0 implements ymi0 {
    public static final n0 a = new n0();

    @Override // defpackage.ymi0
    public final Object a(Object obj, Object obj2) {
        q1 q1Var = (q1) obj;
        m0 m0Var = (m0) obj2;
        if (m0Var instanceof l0) {
            return new q1(q1Var.a, ((l0) m0Var).a);
        }
        if (m0Var instanceof k0) {
            return new q1(true, null);
        }
        w511.b();
        return null;
    }
}
