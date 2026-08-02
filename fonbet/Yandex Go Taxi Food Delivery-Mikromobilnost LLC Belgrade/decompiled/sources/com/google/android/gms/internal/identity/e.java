package com.google.android.gms.internal.identity;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.location.LocationRequest;
import defpackage.atx0;
import defpackage.ek91;
import defpackage.luy;
import defpackage.ouy;
import defpackage.t4e;
import defpackage.ukt;
import defpackage.y2c;
import defpackage.y7b1;
import defpackage.ycs0;
import defpackage.yx60;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends ukt {
    public final ycs0 a0;
    public final ycs0 b0;
    public final ycs0 c0;

    public e(Context context, Looper looper, y2c y2cVar, t4e t4eVar, yx60 yx60Var) {
        super(context, looper, 23, y2cVar, t4eVar, yx60Var);
        this.a0 = new ycs0();
        this.b0 = new ycs0();
        this.c0 = new ycs0();
        new ycs0();
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzv ? (zzv) queryLocalInterface : new zzu(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Feature[] f() {
        return y7b1.e;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final void o(int i) {
        super.o(i);
        synchronized (this.a0) {
            this.a0.clear();
        }
        synchronized (this.b0) {
            this.b0.clear();
        }
        synchronized (this.c0) {
            this.c0.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean p() {
        return true;
    }

    public final boolean s(Feature feature) {
        Feature feature2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures != null) {
            int i = 0;
            while (true) {
                if (i >= availableFeatures.length) {
                    feature2 = null;
                    break;
                }
                feature2 = availableFeatures[i];
                if (feature.getName().equals(feature2.getName())) {
                    break;
                }
                i++;
            }
            if (feature2 != null && feature2.getVersion() >= feature.getVersion()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:10:0x003f, B:11:0x0074, B:15:0x0056, B:16:0x0030), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:10:0x003f, B:11:0x0074, B:15:0x0056, B:16:0x0030), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(ek91 ek91Var, LocationRequest locationRequest, atx0 atx0Var) {
        zzdv zzdvVar;
        ouy zza = ek91Var.zza();
        luy b = zza.b();
        Objects.requireNonNull(b);
        boolean s = s(y7b1.c);
        synchronized (this.b0) {
            try {
                zzdv zzdvVar2 = (zzdv) this.b0.get(b);
                if (zzdvVar2 != null && !s) {
                    zzdvVar2.zzc(zza);
                    zzdvVar = zzdvVar2;
                    zzdvVar2 = null;
                    if (s) {
                        ((zzv) i()).zzv(new zzei(1, zzeg.zza(null, locationRequest), null, zzdvVar, null, new zzdd(atx0Var, zzdvVar), b.a()));
                    } else {
                        ((zzv) i()).zzw(zzee.zzb(zzdvVar2, zzdvVar, b.a()), locationRequest, new zzdj(null, atx0Var));
                    }
                }
                zzdv zzdvVar3 = new zzdv(ek91Var);
                this.b0.put(b, zzdvVar3);
                zzdvVar = zzdvVar3;
                if (s) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(luy luyVar, boolean z, atx0 atx0Var) {
        synchronized (this.b0) {
            try {
                zzdv zzdvVar = (zzdv) this.b0.remove(luyVar);
                if (zzdvVar == null) {
                    atx0Var.a(Boolean.FALSE);
                    return;
                }
                zzdvVar.zzg();
                if (!z) {
                    atx0Var.a(Boolean.TRUE);
                } else if (s(y7b1.c)) {
                    zzv zzvVar = (zzv) i();
                    int identityHashCode = System.identityHashCode(zzdvVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(identityHashCode).length() + 18);
                    sb.append("ILocationCallback@");
                    sb.append(identityHashCode);
                    zzvVar.zzx(zzee.zzb(null, zzdvVar, sb.toString()), new zzdj(Boolean.TRUE, atx0Var));
                } else {
                    ((zzv) i()).zzv(new zzei(2, null, null, zzdvVar, null, new zzdn(Boolean.TRUE, atx0Var), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
