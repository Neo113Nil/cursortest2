package com.yandex.passport.internal.upgrader;

import defpackage.kgx;
import defpackage.qoi0;
import defpackage.z941;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes2.dex */
public final class f {
    public static final f a;
    public static final /* synthetic */ kgx[] b;
    public static final z941 c;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("cachedRef", 0, "getCachedRef()Lcom/yandex/passport/internal/upgrader/AccountUpgraderImpl;", f.class);
        qoi0.a.getClass();
        b = new kgx[]{mutablePropertyReference1Impl};
        a = new f();
        c = new z941(0);
    }

    public final g a(com.yandex.passport.internal.methods.requester.f fVar, h hVar) {
        kgx[] kgxVarArr = b;
        kgx kgxVar = kgxVarArr[0];
        z941 z941Var = c;
        g gVar = (g) z941Var.getValue(this, kgxVar);
        if (gVar != null) {
            return gVar;
        }
        com.yandex.passport.internal.methods.requester.d dVar = new com.yandex.passport.internal.methods.requester.d(fVar);
        g gVar2 = new g(dVar, new s(new t(new m(), new com.yandex.passport.common.a(), dVar, hVar)), hVar);
        f fVar2 = a;
        fVar2.getClass();
        z941Var.setValue(fVar2, kgxVarArr[0], gVar2);
        return gVar2;
    }
}
