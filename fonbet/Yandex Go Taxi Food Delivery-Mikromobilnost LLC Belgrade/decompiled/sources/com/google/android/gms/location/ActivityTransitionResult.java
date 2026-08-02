package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.hwa1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzi();
    private final List zza;
    private Bundle zzb;

    public ActivityTransitionResult(List<ActivityTransitionEvent> list) {
        this.zzb = null;
        cvw.m(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                int i2 = i - 1;
                cvw.f(list.get(i).getElapsedRealTimeNanos() >= list.get(i2).getElapsedRealTimeNanos(), "Transition out of order: ts1=%d, ts2=%d", Long.valueOf(list.get(i).getElapsedRealTimeNanos()), Long.valueOf(list.get(i2).getElapsedRealTimeNanos()));
            }
        }
        this.zza = Collections.unmodifiableList(list);
    }

    public static ActivityTransitionResult extractResult(Intent intent) {
        if (hasResult(intent)) {
            return (ActivityTransitionResult) hwa1.b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
        }
        return null;
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((ActivityTransitionResult) obj).zza);
    }

    public List<ActivityTransitionEvent> getTransitionEvents() {
        return this.zza;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cvw.l(parcel);
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 1, getTransitionEvents(), false);
        bb1.U(parcel, 2, this.zzb, false);
        bb1.o0(parcel, n0);
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        this(list);
        this.zzb = bundle;
    }
}
