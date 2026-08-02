package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzvc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        Rect rect = null;
        ArrayList arrayList = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = cma1.z(parcel, readInt);
                    break;
                case 2:
                    rect = (Rect) cma1.y(parcel, readInt, Rect.CREATOR);
                    break;
                case 3:
                    arrayList = cma1.D(parcel, readInt, Point.CREATOR);
                    break;
                case 4:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 5:
                    f = cma1.o0(parcel, readInt);
                    break;
                case 6:
                    f2 = cma1.o0(parcel, readInt);
                    break;
                case 7:
                    arrayList2 = cma1.D(parcel, readInt, zzvj.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzvb(str, rect, arrayList, str2, f, f2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzvb[i];
    }
}
