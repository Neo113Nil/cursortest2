package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzuh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuh> CREATOR = new zzui();
    private final List zza;
    private final float[] zzb;
    private final Bitmap zzc;
    private final List zzd;

    public zzuh(List list, float[] fArr, Bitmap bitmap, List list2) {
        this.zza = list;
        this.zzb = fArr;
        this.zzc = bitmap;
        this.zzd = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 1, list, false);
        bb1.Y(parcel, 2, this.zzb, false);
        bb1.f0(parcel, 3, this.zzc, i, false);
        List list2 = this.zzd;
        if (list2 != null) {
            int n02 = bb1.n0(parcel, 4);
            int size = list2.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeFloat(((Float) list2.get(i2)).floatValue());
            }
            bb1.o0(parcel, n02);
        }
        bb1.o0(parcel, n0);
    }

    public final Bitmap zza() {
        return this.zzc;
    }

    public final List zzb() {
        return this.zzd;
    }

    public final List zzc() {
        return this.zza;
    }

    public final float[] zzd() {
        return this.zzb;
    }
}
