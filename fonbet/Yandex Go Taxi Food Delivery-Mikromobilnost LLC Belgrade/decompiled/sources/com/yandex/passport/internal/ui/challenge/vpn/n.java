package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.w511;
import defpackage.ymi0;

/* loaded from: classes2.dex */
public final class n implements ymi0 {
    public static final n a = new n();

    @Override // defpackage.ymi0
    public final Object a(Object obj, Object obj2) {
        s sVar = (s) obj;
        m mVar = (m) obj2;
        if (mVar instanceof l) {
            return s.a(sVar, ((l) mVar).a, false, 13);
        }
        if (mVar.equals(i.a)) {
            return s.a(sVar, null, false, 14);
        }
        if (mVar instanceof k) {
            return s.a(sVar, null, false, 11);
        }
        if (mVar instanceof j) {
            return s.a(sVar, null, ((j) mVar).a, 7);
        }
        w511.b();
        return null;
    }
}
