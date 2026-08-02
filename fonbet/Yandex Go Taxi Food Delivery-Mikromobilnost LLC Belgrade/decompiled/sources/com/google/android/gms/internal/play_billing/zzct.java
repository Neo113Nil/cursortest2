package com.google.android.gms.internal.play_billing;

import defpackage.le91;
import defpackage.p991;
import defpackage.rta1;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class zzct extends p991 implements Serializable {
    public static final zzct b;
    public static final zzct c;
    public final transient zzco a;

    static {
        le91 le91Var = zzco.b;
        b = new zzct(zzdk.x);
        Object[] objArr = {zzdh.a};
        rta1.h(0, objArr[0]);
        c = new zzct(zzco.l(1, objArr));
    }

    public zzct(zzco zzcoVar) {
        this.a = zzcoVar;
    }

    @Override // defpackage.p991
    public final /* bridge */ /* synthetic */ zzcv a() {
        zzco zzcoVar = this.a;
        return zzcoVar.isEmpty() ? zzdq.B : new zzdr(zzcoVar, zzdg.a);
    }
}
