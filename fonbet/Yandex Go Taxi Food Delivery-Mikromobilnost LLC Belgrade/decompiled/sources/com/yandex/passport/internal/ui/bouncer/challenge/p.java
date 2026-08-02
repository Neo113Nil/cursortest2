package com.yandex.passport.internal.ui.bouncer.challenge;

import defpackage.hs31;
import defpackage.y8f;
import defpackage.yr31;

/* loaded from: classes15.dex */
public final class p implements hs31 {
    public final n a;

    public p(n nVar) {
        this.a = nVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        return new s(this.a);
    }
}
