package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.g8e;
import defpackage.hwa1;
import defpackage.ooc;
import defpackage.rvr;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes11.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzh();
    public static final Comparator<ActivityTransition> IS_SAME_TRANSITION = new rvr(19);
    private final List zza;
    private final String zzb;
    private final List zzc;
    private String zzd;

    public ActivityTransitionRequest(List list, String str, List list2, String str2) {
        cvw.m(list, "transitions can't be null");
        cvw.d("transitions can't be empty.", !list.isEmpty());
        TreeSet treeSet = new TreeSet(IS_SAME_TRANSITION);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            cvw.d(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
        }
        this.zza = Collections.unmodifiableList(list);
        this.zzb = str;
        this.zzc = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.zzd = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (ooc.m(this.zza, activityTransitionRequest.zza) && ooc.m(this.zzb, activityTransitionRequest.zzb) && ooc.m(this.zzd, activityTransitionRequest.zzd) && ooc.m(this.zzc, activityTransitionRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.zzc;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.zzd;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public void serializeToIntentExtra(Intent intent) {
        cvw.l(intent);
        intent.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST", hwa1.f(this));
    }

    public String toString() {
        List list = this.zzc;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(list);
        String str = this.zzd;
        int length = valueOf.length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + valueOf2.length() + 18 + String.valueOf(str).length() + 1);
        g8e.D(sb, "ActivityTransitionRequest [mTransitions=", valueOf, ", mTag='", str2);
        g8e.D(sb, "', mClients=", valueOf2, ", mAttributionTag=", str);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cvw.l(parcel);
        List list = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 1, list, false);
        bb1.g0(parcel, 2, this.zzb, false);
        bb1.k0(parcel, 3, this.zzc, false);
        bb1.g0(parcel, 4, this.zzd, false);
        bb1.o0(parcel, n0);
    }

    public final ActivityTransitionRequest zza(String str) {
        this.zzd = str;
        return this;
    }

    public ActivityTransitionRequest(List<ActivityTransition> list) {
        this(list, null, null, null);
    }
}
