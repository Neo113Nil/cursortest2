package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.bb1;
import defpackage.ca51;
import defpackage.cvw;
import defpackage.jcz;
import defpackage.ooc;
import java.util.Iterator;
import java.util.List;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Deprecated
/* loaded from: classes11.dex */
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = new zzeh();
    LocationRequest zza;

    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzeg(LocationRequest locationRequest, List list, boolean z, boolean z2, boolean z3, boolean z4, String str, long j) {
        int i;
        boolean z5;
        WorkSource workSource;
        jcz jczVar = new jcz(locationRequest.getPriority(), locationRequest.getIntervalMillis());
        jczVar.e(locationRequest.getMinUpdateIntervalMillis());
        long maxUpdateDelayMillis = locationRequest.getMaxUpdateDelayMillis();
        cvw.d("maxUpdateDelayMillis must be greater than or equal to 0", maxUpdateDelayMillis >= 0);
        jczVar.d = maxUpdateDelayMillis;
        jczVar.b(locationRequest.getDurationMillis());
        int maxUpdates = locationRequest.getMaxUpdates();
        cvw.d("maxUpdates must be greater than 0", maxUpdates > 0);
        jczVar.f = maxUpdates;
        float minUpdateDistanceMeters = locationRequest.getMinUpdateDistanceMeters();
        cvw.d("minUpdateDistanceMeters must be greater than or equal to 0", minUpdateDistanceMeters >= 0.0f);
        jczVar.g = minUpdateDistanceMeters;
        jczVar.h = locationRequest.isWaitForAccurateLocation();
        jczVar.d(locationRequest.getMaxUpdateAgeMillis());
        jczVar.c(locationRequest.getGranularity());
        int zza = locationRequest.zza();
        if (zza == 0 || zza == 1) {
            i = zza;
        } else {
            if (zza != 2) {
                i = zza;
                z5 = false;
                cvw.f(z5, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
                jczVar.k = zza;
                jczVar.l = locationRequest.zzb();
                jczVar.m = locationRequest.zzc();
                ClientIdentity zzd = locationRequest.zzd();
                cvw.e((zzd == null && zzd.zza()) ? false : true);
                jczVar.n = zzd;
                if (list != null) {
                    if (list.isEmpty()) {
                        workSource = null;
                    } else {
                        workSource = new WorkSource();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ClientIdentity clientIdentity = (ClientIdentity) it.next();
                            ca51.a(workSource, clientIdentity.uid, clientIdentity.packageName);
                        }
                    }
                    jczVar.m = workSource;
                }
                if (z) {
                    jczVar.c(1);
                }
                if (z2) {
                    jczVar.f(2);
                }
                if (z3) {
                    jczVar.l = true;
                }
                if (z4) {
                    jczVar.h = true;
                }
                if (j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                    jczVar.d(j);
                }
                this.zza = jczVar.a();
            }
            i = 2;
        }
        z5 = true;
        cvw.f(z5, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
        jczVar.k = zza;
        jczVar.l = locationRequest.zzb();
        jczVar.m = locationRequest.zzc();
        ClientIdentity zzd2 = locationRequest.zzd();
        cvw.e((zzd2 == null && zzd2.zza()) ? false : true);
        jczVar.n = zzd2;
        if (list != null) {
        }
        if (z) {
        }
        if (z2) {
        }
        if (z3) {
        }
        if (z4) {
        }
        if (j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
        }
        this.zza = jczVar.a();
    }

    @Deprecated
    public static zzeg zza(String str, LocationRequest locationRequest) {
        return new zzeg(locationRequest, null, false, false, false, false, null, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzeg) {
            return ooc.m(this.zza, ((zzeg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, this.zza, i, false);
        bb1.o0(parcel, n0);
    }
}
