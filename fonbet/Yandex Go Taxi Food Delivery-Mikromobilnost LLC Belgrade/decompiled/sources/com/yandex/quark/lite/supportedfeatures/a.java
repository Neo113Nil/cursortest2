package com.yandex.quark.lite.supportedfeatures;

import defpackage.bvf0;
import defpackage.jl40;
import defpackage.jlw0;
import defpackage.tse;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public final com.yandex.quark.core.common.internal.consumer.a a;
    public final r0 b = bvf0.c(EmptySet.a);

    public a(com.yandex.quark.core.common.internal.consumer.a aVar, tse tseVar) {
        this.a = aVar;
        jl40.D(tseVar, "collect-supported-features", new DefaultSupportedFeaturesObserver$1(this, null));
    }

    public final void a(jlw0 jlw0Var) {
        r0 r0Var;
        Object value;
        Set set;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            set = (Set) value;
            if (set.contains(jlw0Var)) {
                set = kotlin.collections.a.M0(set);
                set.remove(jlw0Var);
            }
        } while (!r0Var.k(value, set));
    }
}
