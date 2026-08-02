package com.vungle.ads.internal.network.converters;

import com.vungle.ads.internal.network.j;
import xsna.ro;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class b implements a {
    @Override // com.vungle.ads.internal.network.converters.a
    public final Object a(j jVar) {
        try {
            jVar.close();
            s3q0 s3q0Var = s3q0.a;
            jVar.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(jVar, th);
                throw th2;
            }
        }
    }
}
