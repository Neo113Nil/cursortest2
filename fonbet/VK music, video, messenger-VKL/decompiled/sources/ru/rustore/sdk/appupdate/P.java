package ru.rustore.sdk.appupdate;

import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.core.exception.RuStoreException;
import xsna.izs;
import xsna.s3q0;
import xsna.vtj0;

/* loaded from: classes9.dex */
public final class P extends Lambda implements izs<vtj0<Integer>, s3q0> {
    public P() {
        super(1);
    }

    @Override // xsna.izs
    public final s3q0 invoke(vtj0<Integer> vtj0Var) {
        vtj0Var.a(new RuStoreException("update not available"));
        return s3q0.a;
    }
}
