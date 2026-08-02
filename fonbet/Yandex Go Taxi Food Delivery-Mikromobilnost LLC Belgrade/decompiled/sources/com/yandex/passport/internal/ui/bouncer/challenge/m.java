package com.yandex.passport.internal.ui.bouncer.challenge;

import defpackage.w511;
import defpackage.ymi0;

/* loaded from: classes2.dex */
public final class m implements ymi0 {
    public static final m a = new m();

    @Override // defpackage.ymi0
    public final Object a(Object obj, Object obj2) {
        q qVar = (q) obj;
        l lVar = (l) obj2;
        if (lVar instanceof k) {
            return new q(qVar.a, ((k) lVar).a);
        }
        if (lVar instanceof j) {
            return new q(((j) lVar).a, qVar.b);
        }
        w511.b();
        return null;
    }
}
