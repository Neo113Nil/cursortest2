package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5211u4 {
    public static InterfaceC5159s4 a(C4720b4 c4720b4) {
        switch (AbstractC5185t4.a[c4720b4.e.ordinal()]) {
            case 1:
                return new C5012mc();
            case 2:
                return new C5174sj();
            case 3:
                return new C5251vj();
            case 4:
                return new Mh(new Oh());
            case 5:
                return new Mh(new C4813ek());
            case 6:
                return new C5294xc();
            case 7:
                return new C5294xc();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
