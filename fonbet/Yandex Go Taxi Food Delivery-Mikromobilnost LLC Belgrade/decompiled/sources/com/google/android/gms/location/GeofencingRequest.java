package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.identity.zzek;
import defpackage.bb1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzp();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final List zza;
    private final int zzb;
    private final String zzc;

    /* loaded from: classes12.dex */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public int b = 5;
    }

    public GeofencingRequest(List list, int i, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
    }

    public List<zzek> getGeofences() {
        return new ArrayList(this.zza);
    }

    public int getInitialTrigger() {
        return this.zzb;
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        int length = valueOf.length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(i).length() + 1);
        sb.append("GeofencingRequest[geofences=");
        sb.append(valueOf);
        sb.append(", initialTrigger=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 1, list, false);
        int initialTrigger = getInitialTrigger();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(initialTrigger);
        bb1.g0(parcel, 4, this.zzc, false);
        bb1.o0(parcel, n0);
    }
}
