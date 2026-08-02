package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.xfo;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class t1 extends x2 {
    public final b b;
    public final List c;
    public final d3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(Bundle bundle) {
        super(MethodRef.GetUidByNormalizedLogin);
        String string = bundle.getString("normalized_display_login");
        if (string == null) {
            xfo.g("can't get required string normalized_display_login");
            throw null;
        }
        b bVar = new b(string, 18);
        this.b = bVar;
        this.c = Collections.singletonList(bVar);
        this.d = d3.c;
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
