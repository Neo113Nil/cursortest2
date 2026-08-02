package com.google.android.gms.internal.identity;

import com.google.android.gms.location.LastLocationRequest;
import defpackage.atx0;
import defpackage.pui0;
import defpackage.y7b1;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements pui0 {
    public static final /* synthetic */ c a = new c();

    @Override // defpackage.pui0
    public final void accept(Object obj, Object obj2) {
        atx0 atx0Var = (atx0) obj2;
        e eVar = (e) obj;
        LastLocationRequest a2 = new LastLocationRequest.a().a();
        eVar.getClass();
        if (eVar.s(y7b1.c)) {
            ((zzv) eVar.i()).zzq(a2, zzee.zzd(new zzdk(atx0Var)));
        } else if (eVar.s(y7b1.b)) {
            ((zzv) eVar.i()).zzr(a2, new zzdk(atx0Var));
        } else {
            atx0Var.a(((zzv) eVar.i()).zzs());
        }
    }
}
