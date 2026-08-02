package com.yandex.passport.internal.upgrader;

import defpackage.k8u;
import defpackage.kgx;
import defpackage.pnz;
import defpackage.qoi0;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class m {
    public static final /* synthetic */ kgx[] b;
    public final com.yandex.passport.internal.util.storage.b a;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("storage", 0, "getStorage()Lcom/yandex/passport/internal/util/storage/PersistableMap;", m.class);
        qoi0.a.getClass();
        b = new kgx[]{propertyReference1Impl};
    }

    public m() {
        k8u k8uVar = new k8u(com.yandex.passport.internal.serialization.a.a, pnz.a, 1);
        this.a = new com.yandex.passport.internal.util.storage.b(null, new l(k8uVar, 0), new l(k8uVar, 1));
    }
}
