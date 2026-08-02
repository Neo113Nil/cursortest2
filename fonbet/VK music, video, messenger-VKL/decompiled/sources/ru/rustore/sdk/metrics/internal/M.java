package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.jl20;

/* loaded from: classes11.dex */
public final class M extends Lambda implements gzs<String> {
    public final /* synthetic */ jl20 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(jl20 jl20Var) {
        super(0);
        this.a = jl20Var;
    }

    @Override // xsna.gzs
    public final String invoke() {
        return "Insert new event with name: " + this.a.a;
    }
}
