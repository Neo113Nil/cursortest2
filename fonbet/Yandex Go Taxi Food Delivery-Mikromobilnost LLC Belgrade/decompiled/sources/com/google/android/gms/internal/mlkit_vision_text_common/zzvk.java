package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzvk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        String str = null;
        Rect rect = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = cma1.z(parcel, readInt);
            } else if (c == 2) {
                rect = (Rect) cma1.y(parcel, readInt, Rect.CREATOR);
            } else if (c == 3) {
                arrayList = cma1.D(parcel, readInt, Point.CREATOR);
            } else if (c == 4) {
                f = cma1.o0(parcel, readInt);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                f2 = cma1.o0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzvj(str, rect, arrayList, f, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzvj[i];
    }
}
