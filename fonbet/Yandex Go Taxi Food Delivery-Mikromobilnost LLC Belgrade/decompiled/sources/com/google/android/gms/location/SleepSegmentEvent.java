package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.hwa1;
import defpackage.x4e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzap();
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL = 0;
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;

    public SleepSegmentEvent(long j, long j2, int i, int i2, int i3) {
        cvw.d("endTimeMillis must be greater than or equal to startTimeMillis", j <= j2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
    }

    public static List<SleepSegmentEvent> extractEvents(Intent intent) {
        ArrayList arrayList;
        cvw.l(intent);
        if (hasEvents(intent) && (arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT")) != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                byte[] bArr = (byte[]) arrayList.get(i);
                cvw.l(bArr);
                arrayList2.add((SleepSegmentEvent) hwa1.a(bArr, CREATOR));
            }
            return Collections.unmodifiableList(arrayList2);
        }
        return Collections.EMPTY_LIST;
    }

    public static boolean hasEvents(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.zza == sleepSegmentEvent.getStartTimeMillis() && this.zzb == sleepSegmentEvent.getEndTimeMillis() && this.zzc == sleepSegmentEvent.getStatus() && this.zzd == sleepSegmentEvent.zzd && this.zze == sleepSegmentEvent.zze) {
                return true;
            }
        }
        return false;
    }

    public long getEndTimeMillis() {
        return this.zzb;
    }

    public long getSegmentDurationMillis() {
        return this.zzb - this.zza;
    }

    public long getStartTimeMillis() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzc;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = String.valueOf(j2).length();
        int i = this.zzc;
        StringBuilder sb = new StringBuilder(length + 24 + length2 + 9 + String.valueOf(i).length());
        x4e.A(j, "startMillis=", ", endMillis=", sb);
        sb.append(j2);
        sb.append(", status=");
        sb.append(i);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cvw.l(parcel);
        int n0 = bb1.n0(parcel, 20293);
        long startTimeMillis = getStartTimeMillis();
        bb1.m0(1, parcel, 8);
        parcel.writeLong(startTimeMillis);
        long endTimeMillis = getEndTimeMillis();
        bb1.m0(2, parcel, 8);
        parcel.writeLong(endTimeMillis);
        int status = getStatus();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(status);
        int i2 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i3);
        bb1.o0(parcel, n0);
    }
}
