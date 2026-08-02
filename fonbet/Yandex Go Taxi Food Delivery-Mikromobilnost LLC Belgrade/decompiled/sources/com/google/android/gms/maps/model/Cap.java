package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.a06;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();
    private static final String zza = "Cap";
    private final int zzb;
    private final a06 zzc;
    private final Float zzd;

    private Cap(int i, a06 a06Var, Float f) {
        boolean z = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            r0 = a06Var != null && z;
            i = 3;
        }
        cvw.d("Invalid Cap: type=" + i + " bitmapDescriptor=" + a06Var + " bitmapRefWidth=" + f, r0);
        this.zzb = i;
        this.zzc = a06Var;
        this.zzd = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.zzb == cap.zzb && ooc.m(this.zzc, cap.zzc) && ooc.m(this.zzd, cap.zzd);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public String toString() {
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        a06 a06Var = this.zzc;
        bb1.a0(parcel, 3, a06Var == null ? null : a06Var.a.asBinder());
        bb1.Z(parcel, 4, this.zzd);
        bb1.o0(parcel, n0);
    }

    public final Cap zza() {
        int i = this.zzb;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i != 3) {
            return this;
        }
        cvw.n("bitmapDescriptor must not be null", this.zzc != null);
        cvw.n("bitmapRefWidth must not be null", this.zzd != null);
        return new CustomCap(this.zzc, this.zzd.floatValue());
    }

    public Cap(int i, IBinder iBinder, Float f) {
        this(i, iBinder == null ? null : new a06(IObjectWrapper.Stub.asInterface(iBinder)), f);
    }

    public Cap(int i) {
        this(i, (a06) null, (Float) null);
    }

    public Cap(a06 a06Var, float f) {
        this(3, a06Var, Float.valueOf(f));
    }
}
