package com.yandex.passport.internal.flags;

import defpackage.bvu0;

/* loaded from: classes8.dex */
public final class l extends g {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(String str, int i) {
        super(str, r3);
        Integer valueOf = Integer.valueOf(i);
        Flag$Type flag$Type = Flag$Type.BOOLEAN;
    }

    @Override // com.yandex.passport.internal.flags.g
    public final Object a(String str) {
        Integer l = bvu0.l(10, str);
        return Integer.valueOf(l != null ? l.intValue() : ((Number) this.b).intValue());
    }
}
