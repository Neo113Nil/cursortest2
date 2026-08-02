package com.yandex.passport.internal.methods;

import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class n0 extends x2 {
    public final m b;
    public final List c;
    public final o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(boolean z) {
        super(MethodRef.ExecuteCheckVpnStatus);
        m mVar = new m(j.c, Boolean.valueOf(z));
        this.b = mVar;
        this.c = Collections.singletonList(mVar);
        this.d = o.B;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.d;
    }
}
