package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzox implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        Rect rect = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 2:
                    rect = (Rect) cma1.y(parcel, readInt, Rect.CREATOR);
                    break;
                case 3:
                    f = cma1.o0(parcel, readInt);
                    break;
                case 4:
                    f2 = cma1.o0(parcel, readInt);
                    break;
                case 5:
                    f3 = cma1.o0(parcel, readInt);
                    break;
                case 6:
                    f4 = cma1.o0(parcel, readInt);
                    break;
                case 7:
                    f5 = cma1.o0(parcel, readInt);
                    break;
                case '\b':
                    f6 = cma1.o0(parcel, readInt);
                    break;
                case '\t':
                    f7 = cma1.o0(parcel, readInt);
                    break;
                case '\n':
                    arrayList = cma1.D(parcel, readInt, zzpc.CREATOR);
                    break;
                case 11:
                    arrayList2 = cma1.D(parcel, readInt, zzos.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzow(i, rect, f, f2, f3, f4, f5, f6, f7, arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzow[i];
    }
}
