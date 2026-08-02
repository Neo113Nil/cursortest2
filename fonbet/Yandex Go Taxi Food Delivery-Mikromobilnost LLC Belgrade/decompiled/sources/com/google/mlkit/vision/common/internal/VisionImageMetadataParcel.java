package com.google.mlkit.vision.common.internal;

import android.graphics.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class VisionImageMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new zzg();
    public final int height;
    public final int rotation;
    public final long timestampMillis;
    public final int width;
    public final int zza;

    public VisionImageMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.width = i;
        this.height = i2;
        this.zza = i3;
        this.timestampMillis = j;
        this.rotation = i4;
    }

    public Matrix getUprightRotationMatrix() {
        int i = this.width;
        int i2 = this.height;
        int i3 = this.rotation;
        if (i3 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
        matrix.postRotate(i3 * 90);
        int i4 = i3 % 2;
        int i5 = i4 != 0 ? i2 : i;
        if (i4 == 0) {
            i = i2;
        }
        matrix.postTranslate(i5 / 2.0f, i / 2.0f);
        return matrix;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.width;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.height;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i3);
        int i4 = this.zza;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i4);
        long j = this.timestampMillis;
        bb1.m0(4, parcel, 8);
        parcel.writeLong(j);
        int i5 = this.rotation;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i5);
        bb1.o0(parcel, n0);
    }
}
