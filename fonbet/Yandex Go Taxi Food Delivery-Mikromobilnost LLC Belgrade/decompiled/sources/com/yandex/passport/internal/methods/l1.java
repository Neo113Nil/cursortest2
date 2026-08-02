package com.yandex.passport.internal.methods;

import com.yandex.passport.internal.push.PushPayload;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class l1 extends x2 {
    public final b b;
    public final List c;
    public final n d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(PushPayload pushPayload) {
        super(MethodRef.GetPushCode);
        b bVar = new b(pushPayload);
        this.b = bVar;
        this.c = Collections.singletonList(bVar);
        this.d = n.A;
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
