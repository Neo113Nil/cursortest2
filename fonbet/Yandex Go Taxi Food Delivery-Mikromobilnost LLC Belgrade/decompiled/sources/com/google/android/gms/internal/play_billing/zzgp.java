package com.google.android.gms.internal.play_billing;

import defpackage.unr0;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class zzgp extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgp(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder w = unr0.w(j, "Pos: ", ", limit: ");
        w.append(j2);
        w.append(", len: ");
        w.append(i);
    }

    public zzgp(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
