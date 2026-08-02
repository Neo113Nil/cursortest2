package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import defpackage.atx0;
import defpackage.cvw;
import defpackage.hn71;
import defpackage.jcz;
import defpackage.k991;
import defpackage.muy;
import defpackage.oi91;
import defpackage.ouy;
import defpackage.pui0;
import defpackage.puy;
import defpackage.r591;
import defpackage.y7b1;
import defpackage.zm2;
import java.util.Objects;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements pui0, muy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pui0
    public void accept(Object obj, Object obj2) {
        atx0 atx0Var = (atx0) obj2;
        e eVar = (e) obj;
        switch (this.a) {
            case 0:
                zm2 zm2Var = k991.k;
                CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) this.b;
                eVar.getClass();
                if (!eVar.s(y7b1.c)) {
                    if (!eVar.s(y7b1.a)) {
                        ouy b = puy.b(new oi91(eVar, atx0Var), "GetCurrentLocation", zzfb.zza);
                        Objects.requireNonNull(b.c);
                        hn71 hn71Var = new hn71(29, b, atx0Var);
                        atx0 atx0Var2 = new atx0();
                        jcz jczVar = new jcz(currentLocationRequest.getPriority(), 0L);
                        jczVar.e(0L);
                        jczVar.b(currentLocationRequest.getDurationMillis());
                        jczVar.c(currentLocationRequest.getGranularity());
                        jczVar.d(currentLocationRequest.getMaxUpdateAgeMillis());
                        jczVar.l = currentLocationRequest.zza();
                        jczVar.f(currentLocationRequest.zzb());
                        jczVar.h = true;
                        jczVar.m = currentLocationRequest.zzc();
                        eVar.t(hn71Var, jczVar.a(), atx0Var2);
                        atx0Var2.a.b(new r591(1, atx0Var));
                        break;
                    } else {
                        ((zzv) eVar.i()).zzu(currentLocationRequest, new zzdk(atx0Var));
                        break;
                    }
                } else {
                    ((zzv) eVar.i()).zzt(currentLocationRequest, zzee.zzd(new zzdk(atx0Var)));
                    break;
                }
            case 1:
                zzem zzb = zzem.zzb((PendingIntent) this.b);
                eVar.getClass();
                if (!eVar.s(y7b1.d)) {
                    ((zzv) eVar.i()).zzf(zzb, new zzdg(atx0Var));
                    break;
                } else {
                    ((zzv) eVar.i()).zzg(zzb, new zzdj(null, atx0Var));
                    break;
                }
            default:
                LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) this.b;
                cvw.d("locationSettingsRequest can't be null", locationSettingsRequest != null);
                ((zzv) eVar.i()).zzD(locationSettingsRequest, new zzde(atx0Var), null);
                break;
        }
    }

    @Override // defpackage.muy
    public /* bridge */ /* synthetic */ void e(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 3:
                ((zzdv) obj2).zzh().zzc();
                break;
            default:
                ((zzdy) obj2).zzg().zzc();
                break;
        }
    }
}
