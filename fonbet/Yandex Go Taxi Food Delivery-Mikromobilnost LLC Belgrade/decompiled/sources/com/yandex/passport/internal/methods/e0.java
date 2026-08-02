package com.yandex.passport.internal.methods;

import com.yandex.passport.internal.entities.UserCredentials;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class e0 extends x2 {
    public final h3 b;
    public final List c;
    public final o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(UserCredentials userCredentials) {
        super(MethodRef.AuthorizeByUserCredentials);
        h3 h3Var = new h3(userCredentials);
        this.b = h3Var;
        this.c = Collections.singletonList(h3Var);
        this.d = o.y;
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
