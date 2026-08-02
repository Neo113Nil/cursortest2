package com.google.android.gms.internal.measurement;

import defpackage.cvw;
import defpackage.gp91;
import defpackage.j6b1;

/* loaded from: classes11.dex */
public final class a extends gp91 {
    public final /* synthetic */ j6b1 x;
    public final /* synthetic */ e y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, j6b1 j6b1Var) {
        super(eVar, true);
        this.x = j6b1Var;
        this.y = eVar;
    }

    @Override // defpackage.gp91
    public final void a() {
        zzcr zzcrVar = this.y.f;
        cvw.l(zzcrVar);
        zzcrVar.retrieveAndUploadBatches(new zzdu(this, this.x));
    }
}
