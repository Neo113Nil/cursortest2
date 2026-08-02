package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzj();
    private static final String zza = "PatternItem";
    private final int zzb;
    private final Float zzc;

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        cvw.d(sb.toString(), z);
        this.zzb = i;
        this.zzc = f;
    }

    public static List<PatternItem> zza(List<PatternItem> list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (PatternItem patternItem : list) {
            if (patternItem == null) {
                patternItem = null;
            } else {
                int i = patternItem.zzb;
                if (i == 0) {
                    cvw.n("length must not be null.", patternItem.zzc != null);
                    dash = new Dash(patternItem.zzc.floatValue());
                } else if (i == 1) {
                    patternItem = new Dot();
                } else if (i == 2) {
                    cvw.n("length must not be null.", patternItem.zzc != null);
                    dash = new Gap(patternItem.zzc.floatValue());
                }
                patternItem = dash;
            }
            arrayList.add(patternItem);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.zzb == patternItem.zzb && ooc.m(this.zzc, patternItem.zzc);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc});
    }

    public String toString() {
        int i = this.zzb;
        String valueOf = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        bb1.Z(parcel, 3, this.zzc);
        bb1.o0(parcel, n0);
    }
}
