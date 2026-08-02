package com.yandex.quark.webchat.feature.dependencies;

import com.yandex.quark.utils.Disposable;
import defpackage.bvf0;
import defpackage.mth;
import defpackage.rs1;
import defpackage.xwf0;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class BufferingProfile {
    public final r0 a;
    public final LinkedHashMap b;
    public final g c;

    public BufferingProfile() {
        r0 c = bvf0.c(null);
        this.a = c;
        this.b = new LinkedHashMap();
        this.c = e.X(new mth(c, 6), new BufferingProfile$special$$inlined$flatMapLatest$1(3, null));
    }

    public final synchronized Disposable a(rs1 rs1Var) {
        BufferingProfile bufferingProfile = (BufferingProfile) this.a.getValue();
        if (bufferingProfile != null) {
            return bufferingProfile.a(rs1Var);
        }
        xwf0 xwf0Var = new xwf0();
        this.b.put(rs1Var, xwf0Var);
        return xwf0Var;
    }
}
