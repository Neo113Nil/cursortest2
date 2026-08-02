package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzui implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = null;
        float[] fArr = null;
        Bitmap bitmap = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = cma1.D(parcel, readInt, zzuf.CREATOR);
            } else if (c == 2) {
                fArr = cma1.v(parcel, readInt);
            } else if (c == 3) {
                bitmap = (Bitmap) cma1.y(parcel, readInt, Bitmap.CREATOR);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                int w0 = cma1.w0(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (w0 == 0) {
                    arrayList2 = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int readInt2 = parcel.readInt();
                    for (int i = 0; i < readInt2; i++) {
                        arrayList3.add(Float.valueOf(parcel.readFloat()));
                    }
                    parcel.setDataPosition(dataPosition + w0);
                    arrayList2 = arrayList3;
                }
            }
        }
        cma1.E(parcel, P0);
        return new zzuh(arrayList, fArr, bitmap, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzuh[i];
    }
}
