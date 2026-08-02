package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.xfo;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class o0 extends x2 {
    public final b b;
    public final List c;
    public final o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Bundle bundle) {
        super(MethodRef.GetAccountByMachineReadableLogin);
        String string = bundle.getString("machine-readable-login");
        if (string == null) {
            xfo.g("can't get required string machine-readable-login");
            throw null;
        }
        b bVar = new b(string, 16);
        this.b = bVar;
        this.c = Collections.singletonList(bVar);
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
