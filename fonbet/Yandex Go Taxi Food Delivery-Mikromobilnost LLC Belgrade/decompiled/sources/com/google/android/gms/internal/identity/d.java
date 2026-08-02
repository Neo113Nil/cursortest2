package com.google.android.gms.internal.identity;

import defpackage.atx0;
import defpackage.g991;
import defpackage.luy;
import defpackage.y7b1;

/* loaded from: classes11.dex */
public final /* synthetic */ class d implements g991 {
    public static final /* synthetic */ d a = new d();

    @Override // defpackage.g991
    public final void b(e eVar, luy luyVar, boolean z, atx0 atx0Var) {
        synchronized (eVar.a0) {
            try {
                zzdy zzdyVar = (zzdy) eVar.a0.remove(luyVar);
                if (zzdyVar == null) {
                    atx0Var.a(Boolean.FALSE);
                    return;
                }
                zzdyVar.zzf();
                if (!z) {
                    atx0Var.a(Boolean.TRUE);
                } else if (eVar.s(y7b1.c)) {
                    zzv zzvVar = (zzv) eVar.i();
                    int identityHashCode = System.identityHashCode(zzdyVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(identityHashCode).length() + 18);
                    sb.append("ILocationListener@");
                    sb.append(identityHashCode);
                    zzvVar.zzx(zzee.zza(null, zzdyVar, sb.toString()), new zzdj(Boolean.TRUE, atx0Var));
                } else {
                    ((zzv) eVar.i()).zzv(new zzei(2, null, zzdyVar, null, null, new zzdn(Boolean.TRUE, atx0Var), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
