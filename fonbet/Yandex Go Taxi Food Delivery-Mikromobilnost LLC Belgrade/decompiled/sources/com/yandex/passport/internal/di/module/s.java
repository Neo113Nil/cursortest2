package com.yandex.passport.internal.di.module;

import defpackage.hs31;
import defpackage.yr31;
import defpackage.yvf0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class s implements hs31 {
    public final Map a;

    public s(Map map) {
        this.a = map;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        yvf0 yvf0Var = (yvf0) this.a.get(cls);
        if (yvf0Var != null) {
            return (yr31) yvf0Var.get();
        }
        return null;
    }
}
