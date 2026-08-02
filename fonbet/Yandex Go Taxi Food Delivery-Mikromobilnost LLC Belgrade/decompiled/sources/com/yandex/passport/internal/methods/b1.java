package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.internal.entities.Cookie;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class b1 extends x2 {
    public final b b;
    public final List c;
    public final g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Bundle bundle) {
        super(MethodRef.GetCodeByCookie);
        b bVar = new b((Cookie) g.B.b(bundle));
        this.b = bVar;
        this.c = Collections.singletonList(bVar);
        this.d = g.A;
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
