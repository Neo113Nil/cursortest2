package com.yandex.passport.api;

import defpackage.yhl;

/* loaded from: classes8.dex */
public final class d {
    public static KPassportEnvironment a(t0 t0Var) {
        KPassportEnvironment kPassportEnvironment;
        int integer = t0Var.getInteger();
        KPassportEnvironment[] values = KPassportEnvironment.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                kPassportEnvironment = null;
                break;
            }
            kPassportEnvironment = values[i];
            if (kPassportEnvironment.getEnvironment().getInteger() == integer) {
                break;
            }
            i++;
        }
        if (kPassportEnvironment != null) {
            return kPassportEnvironment;
        }
        yhl.d(t0Var, "Unknown environment ");
        return null;
    }
}
