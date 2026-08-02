package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzf();
    private final int zza;
    private final int zzb;
    private final long zzc;

    public ActivityTransitionEvent(int i, int i2, long j) {
        ActivityTransition.zza(i2);
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.zza == activityTransitionEvent.zza && this.zzb == activityTransitionEvent.zzb && this.zzc == activityTransitionEvent.zzc;
    }

    public int getActivityType() {
        return this.zza;
    }

    public long getElapsedRealTimeNanos() {
        return this.zzc;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 13);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.zzb;
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.zzc;
        StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 21);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cvw.l(parcel);
        int n0 = bb1.n0(parcel, 20293);
        int activityType = getActivityType();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(activityType);
        int transitionType = getTransitionType();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(transitionType);
        long elapsedRealTimeNanos = getElapsedRealTimeNanos();
        bb1.m0(3, parcel, 8);
        parcel.writeLong(elapsedRealTimeNanos);
        bb1.o0(parcel, n0);
    }
}
