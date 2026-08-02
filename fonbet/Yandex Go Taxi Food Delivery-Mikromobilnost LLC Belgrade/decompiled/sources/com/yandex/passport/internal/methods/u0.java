package com.yandex.passport.internal.methods;

import com.yandex.passport.internal.entities.Filter;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class u0 extends x2 {
    public final q b;
    public final List c;
    public final d3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Filter filter) {
        super(MethodRef.GetAccountsList);
        q qVar = new q(filter);
        this.b = qVar;
        this.c = Collections.singletonList(qVar);
        this.d = d3.b;
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
