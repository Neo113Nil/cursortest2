package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.Task;

/* loaded from: classes11.dex */
public class OneoffTask extends Task {
    public static final Parcelable.Creator<OneoffTask> CREATOR = new zzi();
    private final long zzal;
    private final long zzam;

    public static class a extends Task.a {
        public final long d = -1;
        public final long e = -1;

        public a() {
            this.a = false;
        }
    }

    @Deprecated
    private OneoffTask(Parcel parcel) {
        super(parcel);
        this.zzal = parcel.readLong();
        this.zzam = parcel.readLong();
    }

    public long getWindowEnd() {
        return this.zzam;
    }

    public long getWindowStart() {
        return this.zzal;
    }

    @Override // com.google.android.gms.gcm.Task
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("window_start", this.zzal);
        bundle.putLong("window_end", this.zzam);
    }

    public String toString() {
        String obj = super.toString();
        long windowStart = getWindowStart();
        long windowEnd = getWindowEnd();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 64);
        sb.append(obj);
        sb.append(" windowStart=");
        sb.append(windowStart);
        sb.append(" windowEnd=");
        sb.append(windowEnd);
        return sb.toString();
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.zzal);
        parcel.writeLong(this.zzam);
    }

    private OneoffTask(a aVar) {
        super(aVar);
        this.zzal = aVar.d;
        this.zzam = aVar.e;
    }

    public /* synthetic */ OneoffTask(Parcel parcel, zzi zziVar) {
        this(parcel);
    }

    public /* synthetic */ OneoffTask(a aVar, zzi zziVar) {
        this(aVar);
    }
}
