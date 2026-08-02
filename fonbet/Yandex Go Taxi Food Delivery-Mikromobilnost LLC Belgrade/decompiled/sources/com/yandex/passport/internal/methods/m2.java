package com.yandex.passport.internal.methods;

import com.yandex.passport.api.PassportUidImpl;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class m2 extends x2 {
    public final b b;
    public final List c;
    public final d3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(PassportUidImpl passportUidImpl) {
        super(MethodRef.SetCurrentAccount);
        b bVar = new b(passportUidImpl);
        this.b = bVar;
        this.c = Collections.singletonList(bVar);
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
