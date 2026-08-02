package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import defpackage.cvw;
import defpackage.gp91;

/* loaded from: classes.dex */
public final class b extends gp91 {
    public final /* synthetic */ Bundle x;
    public final /* synthetic */ Activity y;
    public final /* synthetic */ zzfa z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zzfa zzfaVar, Bundle bundle, Activity activity) {
        super(zzfaVar.zza, true);
        this.x = bundle;
        this.y = activity;
        this.z = zzfaVar;
    }

    @Override // defpackage.gp91
    public final void a() {
        Bundle bundle;
        Bundle bundle2 = this.x;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzcr zzcrVar = this.z.zza.f;
        cvw.l(zzcrVar);
        Activity activity = this.y;
        zzcrVar.onActivityCreatedByScionActivityInfo(zzdf.zza(activity), bundle, this.b);
    }
}
