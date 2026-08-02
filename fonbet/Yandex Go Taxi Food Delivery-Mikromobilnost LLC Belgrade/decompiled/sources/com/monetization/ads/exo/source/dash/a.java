package com.monetization.ads.exo.source.dash;

import defpackage.oaa1;

/* loaded from: classes7.dex */
public final class a {
    public final /* synthetic */ i a;

    public a(i iVar) {
        this.a = iVar;
    }

    public final void a() {
        long j;
        i iVar = this.a;
        synchronized (oaa1.b) {
            try {
                j = oaa1.c ? oaa1.d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        iVar.L = j;
        iVar.a(true);
    }
}
