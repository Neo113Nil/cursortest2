package com.yandex.passport.internal.flags.experiments;

import android.os.Bundle;

/* loaded from: classes8.dex */
public class d implements com.yandex.passport.internal.methods.f {
    public final String a;

    @Override // com.yandex.passport.internal.methods.f
    public Object c(Bundle bundle) {
        return Boolean.valueOf(bundle.getBoolean(this.a));
    }

    @Override // com.yandex.passport.internal.methods.f
    public void d(Bundle bundle, Object obj) {
        bundle.putBoolean(this.a, ((Boolean) obj).booleanValue());
    }

    @Override // com.yandex.passport.internal.methods.f
    public String getKey() {
        return this.a;
    }
}
