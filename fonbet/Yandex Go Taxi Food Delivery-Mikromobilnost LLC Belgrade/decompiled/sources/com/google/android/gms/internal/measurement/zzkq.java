package com.google.android.gms.internal.measurement;

import defpackage.ny61;
import defpackage.yza1;

/* loaded from: classes.dex */
public enum zzkq implements yza1 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);

    private final int zzf;

    zzkq(int i) {
        this.zzf = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // defpackage.yza1
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzf;
        }
        ny61.g("Can't get the number of an unknown enum value.");
        return 0;
    }
}
