package com.yandex.passport.internal.methods;

import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class z0 extends x2 {
    public final m b;
    public final List c;
    public final com.yandex.passport.internal.flags.experiments.d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(FlagName flagName) {
        super(MethodRef.GetBooleanFlag);
        m mVar = new m(r.w, flagName);
        this.b = mVar;
        this.c = Collections.singletonList(mVar);
        this.d = new com.yandex.passport.internal.flags.experiments.d("is_flag_enabled");
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.d;
    }
}
