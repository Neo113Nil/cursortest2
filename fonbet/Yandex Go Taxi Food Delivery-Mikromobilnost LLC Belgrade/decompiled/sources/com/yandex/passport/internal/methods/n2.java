package com.yandex.passport.internal.methods;

import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class n2 extends x2 {
    public final m b;
    public final List c;
    public final d3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(boolean z) {
        super(MethodRef.SetVpnChallengeActivityDisabled);
        m mVar = new m(j.w, Boolean.valueOf(z));
        this.b = mVar;
        this.c = Collections.singletonList(mVar);
        this.d = d3.w;
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
