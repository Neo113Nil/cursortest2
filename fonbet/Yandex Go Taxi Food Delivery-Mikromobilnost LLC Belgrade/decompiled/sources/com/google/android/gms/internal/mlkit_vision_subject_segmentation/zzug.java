package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzug implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float[] fArr = null;
        Bitmap bitmap = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    fArr = cma1.v(parcel, readInt);
                    break;
                case 2:
                    bitmap = (Bitmap) cma1.y(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 3:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 4:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 5:
                    i3 = cma1.r0(parcel, readInt);
                    break;
                case 6:
                    i4 = cma1.r0(parcel, readInt);
                    break;
                case 7:
                    i5 = cma1.r0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzuf(fArr, bitmap, i, i2, i3, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzuf[i];
    }
}
