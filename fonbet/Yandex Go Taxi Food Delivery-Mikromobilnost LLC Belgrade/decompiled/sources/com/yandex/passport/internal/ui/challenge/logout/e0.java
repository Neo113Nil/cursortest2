package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.w511;
import defpackage.ymi0;

/* loaded from: classes2.dex */
public final class e0 implements ymi0 {
    public static final e0 a = new e0();

    @Override // defpackage.ymi0
    public final Object a(Object obj, Object obj2) {
        p pVar = (p) obj;
        d0 d0Var = (d0) obj2;
        if (d0Var instanceof b0) {
            return p.a(pVar, null, null, Boolean.valueOf(((b0) d0Var).a), null, 11);
        }
        if (d0Var instanceof z) {
            return p.a(pVar, ((z) d0Var).a, null, null, null, 14);
        }
        if (d0Var instanceof c0) {
            return p.a(pVar, null, null, null, ((c0) d0Var).a, 7);
        }
        if (d0Var instanceof a0) {
            return p.a(pVar, null, ((a0) d0Var).a, null, null, 13);
        }
        w511.b();
        return null;
    }
}
