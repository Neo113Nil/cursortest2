package com.yandex.div.util;

import com.yandex.div2.j3;

/* compiled from: DivDataUtils.kt */
/* loaded from: classes7.dex */
public final class DivDataUtilsKt {
    public static final long getINVALID_STATE_ID(j3.a aVar) {
        return -1L;
    }

    public static final long getInitialStateId(j3 j3Var) {
        return j3Var.c.isEmpty() ? getINVALID_STATE_ID(j3.j) : j3Var.c.get(0).b;
    }
}
