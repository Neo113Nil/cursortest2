package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.w511;
import defpackage.ymi0;

/* loaded from: classes8.dex */
public final class b0 implements ymi0 {
    public static final b0 a = new b0();

    @Override // defpackage.ymi0
    public final Object a(Object obj, Object obj2) {
        q qVar = (q) obj;
        a0 a0Var = (a0) obj2;
        if (a0Var instanceof x) {
            return q.a(qVar, null, null, null, Boolean.valueOf(((x) a0Var).a), null, 23);
        }
        if (a0Var instanceof v) {
            return q.a(qVar, ((v) a0Var).a(), null, null, null, null, 30);
        }
        if (a0Var instanceof z) {
            return q.a(qVar, null, null, null, null, ((z) a0Var).a(), 15);
        }
        if (a0Var instanceof y) {
            return q.a(qVar, null, null, null, null, null, 27);
        }
        if (a0Var instanceof w) {
            return q.a(qVar, null, ((w) a0Var).a(), null, null, null, 29);
        }
        w511.b();
        return null;
    }
}
