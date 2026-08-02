package com.google.android.gms.internal.play_billing;

import defpackage.ny61;
import defpackage.ofa1;
import defpackage.ov91;
import defpackage.oyr;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class m {
    protected int zza = 0;

    public abstract ov91 a();

    public int b(ofa1 ofa1Var) {
        throw null;
    }

    public final zzgk c() {
        try {
            p pVar = (p) this;
            int h = pVar.h();
            zzgk zzgkVar = zzgk.a;
            byte[] bArr = new byte[h];
            n nVar = new n(bArr, h);
            pVar.f(nVar);
            if (nVar.c - nVar.d == 0) {
                return new zzgi(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            ny61.n(oyr.p("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final byte[] d() {
        try {
            p pVar = (p) this;
            int h = pVar.h();
            byte[] bArr = new byte[h];
            n nVar = new n(bArr, h);
            pVar.f(nVar);
            if (nVar.c - nVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            ny61.n(oyr.p("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
