package com.yandex.passport.internal.methods;

import com.yandex.passport.internal.properties.AuthorizationUrlProperties;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class x0 extends x2 {
    public final h b;
    public final List c;
    public final c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(AuthorizationUrlProperties authorizationUrlProperties) {
        super(MethodRef.GetAuthorizationUrl);
        h hVar = new h(g.x, authorizationUrlProperties);
        this.b = hVar;
        this.c = Collections.singletonList(hVar);
        this.d = c.J;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.d;
    }

    public final AuthorizationUrlProperties e() {
        return (AuthorizationUrlProperties) this.b.c;
    }
}
