package com.yandex.passport.internal.methods;

import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class i0 extends x2 {
    public final b b;
    public final List c;
    public final a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(String str) {
        super(MethodRef.DeleteSavedPushPayload);
        b bVar = new b(str, 25);
        this.b = bVar;
        this.c = Collections.singletonList(bVar);
        this.d = a.c;
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
