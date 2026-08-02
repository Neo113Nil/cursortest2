package com.yandex.passport.internal.methods;

import com.yandex.passport.internal.properties.AutoLoginProperties;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class r2 extends x2 {
    public final k b;
    public final List c;
    public final o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(AutoLoginProperties autoLoginProperties) {
        super(MethodRef.TryAutoLogin);
        k kVar = new k(g.y, autoLoginProperties);
        this.b = kVar;
        this.c = Collections.singletonList(kVar);
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
