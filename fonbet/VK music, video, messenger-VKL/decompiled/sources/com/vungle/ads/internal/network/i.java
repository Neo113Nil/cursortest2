package com.vungle.ads.internal.network;

import java.io.IOException;
import xsna.bn8;
import xsna.cas;
import xsna.vl8;

/* loaded from: classes7.dex */
public final class i extends cas {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, bn8 bn8Var) {
        super(bn8Var);
        this.a = jVar;
    }

    @Override // xsna.cas, xsna.agk0
    public final long read(vl8 vl8Var, long j) {
        try {
            return super.read(vl8Var, j);
        } catch (IOException e) {
            this.a.a(e);
            throw e;
        }
    }
}
