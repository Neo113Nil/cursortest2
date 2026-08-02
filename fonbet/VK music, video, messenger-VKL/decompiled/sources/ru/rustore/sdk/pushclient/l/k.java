package ru.rustore.sdk.pushclient.l;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.myc0;
import xsna.nyy0;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class k extends Lambda implements gzs<s3q0> {
    public final /* synthetic */ nyy0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(nyy0 nyy0Var) {
        super(0);
        this.a = nyy0Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        nyy0 nyy0Var = this.a;
        myc0.h(nyy0Var.d, null, null, new j(nyy0Var, null), 3);
        return s3q0.a;
    }
}
