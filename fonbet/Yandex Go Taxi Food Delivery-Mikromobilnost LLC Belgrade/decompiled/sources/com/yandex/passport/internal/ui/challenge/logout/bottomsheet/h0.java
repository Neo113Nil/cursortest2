package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.w511;
import defpackage.ymi0;

/* loaded from: classes2.dex */
public final class h0 implements ymi0 {
    public static final h0 a = new h0();

    @Override // defpackage.ymi0
    public Object a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        g0 g0Var = (g0) obj2;
        if (g0Var instanceof f0) {
            return new l0(l0Var.a, ((f0) g0Var).a);
        }
        if (g0Var instanceof e0) {
            return new l0(((e0) g0Var).a, l0Var.b);
        }
        w511.b();
        return null;
    }
}
