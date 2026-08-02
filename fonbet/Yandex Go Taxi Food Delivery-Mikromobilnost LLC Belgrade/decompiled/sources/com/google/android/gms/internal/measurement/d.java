package com.google.android.gms.internal.measurement;

import android.app.Activity;
import defpackage.cvw;
import defpackage.gp91;

/* loaded from: classes11.dex */
public final class d extends gp91 {
    public final /* synthetic */ Activity x;
    public final /* synthetic */ zzco y;
    public final /* synthetic */ zzfa z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zzfa zzfaVar, Activity activity, zzco zzcoVar) {
        super(zzfaVar.zza, true);
        this.x = activity;
        this.y = zzcoVar;
        this.z = zzfaVar;
    }

    @Override // defpackage.gp91
    public final void a() {
        zzcr zzcrVar = this.z.zza.f;
        cvw.l(zzcrVar);
        zzcrVar.onActivitySaveInstanceStateByScionActivityInfo(zzdf.zza(this.x), this.y, this.b);
    }
}
