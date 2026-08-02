package com.google.mlkit.common;

import defpackage.cvw;

/* loaded from: classes11.dex */
public class MlKitException extends Exception {
    private final int zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i) {
        super(str);
        cvw.j(str, "Provided message must not be empty.");
        this.zza = i;
    }

    public final int a() {
        return this.zza;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(int i, Exception exc, String str) {
        super(str, exc);
        cvw.j(str, "Provided message must not be empty.");
        this.zza = i;
    }
}
