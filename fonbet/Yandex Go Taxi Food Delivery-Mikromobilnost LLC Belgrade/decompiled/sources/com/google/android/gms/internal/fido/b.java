package com.google.android.gms.internal.fido;

import defpackage.ka91;
import defpackage.v491;

/* loaded from: classes11.dex */
public final class b implements ka91 {
    public final Object a;

    public b(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        int i = v491.a;
        if (a.b == null) {
            a.b = new zzag();
        }
        synchronized (a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
