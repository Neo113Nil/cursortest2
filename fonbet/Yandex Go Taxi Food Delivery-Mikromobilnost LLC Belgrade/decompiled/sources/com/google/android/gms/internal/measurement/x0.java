package com.google.android.gms.internal.measurement;

import defpackage.ny61;

/* loaded from: classes11.dex */
public abstract class x0 {
    public static final zzlh a(y0 y0Var, byte[] bArr) {
        if (y0Var.c - y0Var.d == 0) {
            return new zzlg(bArr);
        }
        ny61.r("Did not write as much data as expected.");
        return null;
    }
}
