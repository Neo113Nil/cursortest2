package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.w511;
import defpackage.ymi0;

/* loaded from: classes2.dex */
public final class n implements ymi0, o0 {
    public static final n a = new n();
    public static final n b = new n();
    public static final n c = new n();
    public static final n d = new n();
    public static final n e = new n();

    @Override // defpackage.ymi0
    public Object a(Object obj, Object obj2) {
        u uVar = (u) obj;
        m mVar = (m) obj2;
        if (mVar instanceof l) {
            return new u(uVar.a, ((l) mVar).a);
        }
        if (mVar instanceof k) {
            return new u(((k) mVar).a, uVar.b);
        }
        w511.b();
        return null;
    }
}
