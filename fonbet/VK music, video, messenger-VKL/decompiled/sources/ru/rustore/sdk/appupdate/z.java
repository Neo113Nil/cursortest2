package ru.rustore.sdk.appupdate;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;
import xsna.vtj0;

/* loaded from: classes9.dex */
public final class z extends Lambda implements gzs<s3q0> {
    public final /* synthetic */ vtj0<s3q0> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(vtj0<s3q0> vtj0Var) {
        super(0);
        this.a = vtj0Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        vtj0<s3q0> vtj0Var = this.a;
        s3q0 s3q0Var = s3q0.a;
        vtj0Var.b(s3q0Var);
        return s3q0Var;
    }
}
