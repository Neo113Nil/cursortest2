package ru.rustore.sdk.review;

import kotlin.jvm.internal.Lambda;
import xsna.bxy0;
import xsna.e4z0;
import xsna.gzs;
import xsna.jl20;
import xsna.oyy0;

/* loaded from: classes9.dex */
public final class i extends Lambda implements gzs<jl20> {
    public final /* synthetic */ e4z0 a;
    public final /* synthetic */ bxy0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e4z0 e4z0Var, bxy0 bxy0Var) {
        super(0);
        this.a = e4z0Var;
        this.b = bxy0Var;
    }

    @Override // xsna.gzs
    public final jl20 invoke() {
        oyy0 oyy0Var = this.a.a;
        bxy0 bxy0Var = this.b;
        oyy0Var.getClass();
        return new jl20("sdkInfo", bxy0Var.a);
    }
}
