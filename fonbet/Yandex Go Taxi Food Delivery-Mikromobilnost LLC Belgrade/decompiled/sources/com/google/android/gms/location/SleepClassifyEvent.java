package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.hwa1;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new zzao();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final boolean zzh;
    private final int zzi;

    public SleepClassifyEvent(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzh = z;
        this.zzi = i8;
    }

    public static List<SleepClassifyEvent> extractEvents(Intent intent) {
        ArrayList arrayList;
        cvw.l(intent);
        if (hasEvents(intent) && (arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT")) != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                byte[] bArr = (byte[]) arrayList.get(i);
                cvw.l(bArr);
                arrayList2.add((SleepClassifyEvent) hwa1.a(bArr, CREATOR));
            }
            return Collections.unmodifiableList(arrayList2);
        }
        return Collections.EMPTY_LIST;
    }

    public static boolean hasEvents(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.zza == sleepClassifyEvent.zza && this.zzb == sleepClassifyEvent.zzb;
    }

    public int getConfidence() {
        return this.zzb;
    }

    public int getLight() {
        return this.zzd;
    }

    public int getMotion() {
        return this.zzc;
    }

    public long getTimestampMillis() {
        return this.zza * 1000;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb)});
    }

    public String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        int i3 = this.zzc;
        int length3 = String.valueOf(i3).length();
        int i4 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 6 + length2 + 8 + length3 + 7 + String.valueOf(i4).length());
        vfc.u(i, i2, " Conf:", " Motion:", sb);
        sb.append(i3);
        sb.append(" Light:");
        sb.append(i4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cvw.l(parcel);
        int i2 = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        int confidence = getConfidence();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(confidence);
        int motion = getMotion();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(motion);
        int light = getLight();
        bb1.m0(4, parcel, 4);
        parcel.writeInt(light);
        int i3 = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i3);
        int i4 = this.zzf;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(i4);
        int i5 = this.zzg;
        bb1.m0(7, parcel, 4);
        parcel.writeInt(i5);
        boolean z = this.zzh;
        bb1.m0(8, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        int i6 = this.zzi;
        bb1.m0(9, parcel, 4);
        parcel.writeInt(i6);
        bb1.o0(parcel, n0);
    }
}
