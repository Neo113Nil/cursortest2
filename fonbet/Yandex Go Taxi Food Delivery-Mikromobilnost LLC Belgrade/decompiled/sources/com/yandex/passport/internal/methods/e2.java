package com.yandex.passport.internal.methods;

import com.yandex.passport.api.PassportUidImpl;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class e2 extends x2 {
    public final f3 b;
    public final List c;
    public final d3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(PassportUidImpl passportUidImpl) {
        super(MethodRef.PerformSync);
        f3 f3Var = new f3(passportUidImpl);
        this.b = f3Var;
        this.c = Collections.singletonList(f3Var);
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
