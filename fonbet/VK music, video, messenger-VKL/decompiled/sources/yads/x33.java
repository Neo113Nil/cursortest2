package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class x33 extends n33 {
    public static final Parcelable.Creator<x33> CREATOR = new u33();
    public final List b;

    public x33(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(w33.a(parcel));
        }
        this.b = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.b.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            w33 w33Var = (w33) this.b.get(i2);
            parcel.writeLong(w33Var.a);
            parcel.writeByte(w33Var.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(w33Var.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(w33Var.d ? (byte) 1 : (byte) 0);
            int size2 = w33Var.f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                v33 v33Var = (v33) w33Var.f.get(i3);
                parcel.writeInt(v33Var.a);
                parcel.writeLong(v33Var.b);
            }
            parcel.writeLong(w33Var.e);
            parcel.writeByte(w33Var.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(w33Var.h);
            parcel.writeInt(w33Var.i);
            parcel.writeInt(w33Var.j);
            parcel.writeInt(w33Var.k);
        }
    }

    public x33(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
    }
}
