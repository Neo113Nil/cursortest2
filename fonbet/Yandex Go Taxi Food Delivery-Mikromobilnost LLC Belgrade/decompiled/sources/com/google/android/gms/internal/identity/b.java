package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import defpackage.atx0;
import defpackage.k991;
import defpackage.kzo;
import defpackage.luy;
import defpackage.ouy;
import defpackage.pui0;
import defpackage.y7b1;
import defpackage.zm2;
import java.util.Objects;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements pui0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Parcelable c;

    public /* synthetic */ b(Object obj, Parcelable parcelable, int i) {
        this.a = i;
        this.b = obj;
        this.c = parcelable;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:13:0x0068, B:17:0x0075, B:19:0x008a, B:20:0x00c1, B:23:0x00a1, B:24:0x007d), top: B:12:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:13:0x0068, B:17:0x0075, B:19:0x008a, B:20:0x00c1, B:23:0x00a1, B:24:0x007d), top: B:12:0x0068 }] */
    @Override // defpackage.pui0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj, Object obj2) {
        zzdy zzdyVar;
        switch (this.a) {
            case 0:
                atx0 atx0Var = (atx0) obj2;
                e eVar = (e) obj;
                zm2 zm2Var = k991.k;
                kzo kzoVar = (kzo) this.b;
                LocationRequest locationRequest = (LocationRequest) this.c;
                eVar.getClass();
                ouy zza = kzoVar.zza();
                luy luyVar = zza.c;
                Objects.requireNonNull(luyVar);
                boolean s = eVar.s(y7b1.c);
                synchronized (eVar.a0) {
                    try {
                        zzdy zzdyVar2 = (zzdy) eVar.a0.get(luyVar);
                        if (zzdyVar2 != null && !s) {
                            zzdyVar2.zzc(zza);
                            zzdyVar = zzdyVar2;
                            zzdyVar2 = null;
                            if (s) {
                                ((zzv) eVar.i()).zzv(new zzei(1, zzeg.zza(null, locationRequest), zzdyVar, null, null, new zzdo(atx0Var, zzdyVar), luyVar.a()));
                            } else {
                                ((zzv) eVar.i()).zzw(zzee.zza(zzdyVar2, zzdyVar, luyVar.a()), locationRequest, new zzdj(null, atx0Var));
                            }
                        }
                        zzdy zzdyVar3 = new zzdy(kzoVar);
                        eVar.a0.put(luyVar, zzdyVar3);
                        zzdyVar = zzdyVar3;
                        if (s) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                atx0 atx0Var2 = (atx0) obj2;
                e eVar2 = (e) obj;
                GeofencingRequest geofencingRequest = (GeofencingRequest) this.b;
                PendingIntent pendingIntent = (PendingIntent) this.c;
                eVar2.getClass();
                if (eVar2.s(y7b1.d)) {
                    ((zzv) eVar2.i()).zze(geofencingRequest, pendingIntent, new zzdj(null, atx0Var2));
                    return;
                } else {
                    ((zzv) eVar2.i()).zzd(geofencingRequest, pendingIntent, new zzdg(atx0Var2));
                    return;
                }
        }
    }
}
