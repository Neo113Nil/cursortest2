package com.yandex.passport.internal.methods;

import android.os.Bundle;

/* loaded from: classes8.dex */
public abstract class t extends e {
    public final f b;
    public final Object c;

    public t(f fVar, Object obj) {
        super(fVar.getKey());
        this.b = fVar;
        this.c = obj;
    }

    @Override // com.yandex.passport.internal.methods.e
    public final Object a() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.methods.e
    public final void b(Bundle bundle) {
        this.b.d(bundle, this.c);
    }
}
