package com.yandex.passport.internal.methods;

import com.yandex.passport.api.impl.UserIdProperties;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class u1 extends x2 {
    public final h3 b;
    public final List c;
    public final g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(UserIdProperties userIdProperties) {
        super(MethodRef.GetUserIdUrl);
        h3 h3Var = new h3(userIdProperties);
        this.b = h3Var;
        this.c = Collections.singletonList(h3Var);
        this.d = g.T;
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
