package com.yandex.passport.internal.methods;

import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class a2 extends x2 {
    public final b b;
    public final List c;
    public final d3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(boolean z) {
        super(MethodRef.OnAppBackgroundStateChanged);
        b bVar = new b(z, 15);
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
