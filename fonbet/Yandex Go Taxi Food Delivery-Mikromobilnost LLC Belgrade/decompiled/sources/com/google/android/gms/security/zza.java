package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.b;
import defpackage.dwf0;
import defpackage.ewf0;

/* loaded from: classes11.dex */
final class zza extends AsyncTask {
    final /* synthetic */ Context zza;
    final /* synthetic */ dwf0 zzb;

    public zza(Context context, dwf0 dwf0Var) {
        this.zza = context;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            ewf0.a(this.zza);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e) {
            return Integer.valueOf(e.errorCode);
        } catch (GooglePlayServicesRepairableException e2) {
            return Integer.valueOf(e2.a());
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            throw null;
        }
        Context context = this.zza;
        b bVar = ewf0.a;
        ewf0.a.b(context, num.intValue(), "pi");
        throw null;
    }
}
