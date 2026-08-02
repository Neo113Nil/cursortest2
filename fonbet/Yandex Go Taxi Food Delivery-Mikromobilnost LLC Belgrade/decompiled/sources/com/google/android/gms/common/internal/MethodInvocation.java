package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();
    private final int zaa;
    private final int zab;
    private final int zac;
    private final long zad;
    private final long zae;
    private final String zaf;
    private final String zag;
    private final int zah;
    private final int zai;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = j;
        this.zae = j2;
        this.zaf = str;
        this.zag = str2;
        this.zah = i4;
        this.zai = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zab;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i3);
        int i4 = this.zac;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i4);
        long j = this.zad;
        bb1.m0(4, parcel, 8);
        parcel.writeLong(j);
        long j2 = this.zae;
        bb1.m0(5, parcel, 8);
        parcel.writeLong(j2);
        bb1.g0(parcel, 6, this.zaf, false);
        bb1.g0(parcel, 7, this.zag, false);
        int i5 = this.zah;
        bb1.m0(8, parcel, 4);
        parcel.writeInt(i5);
        int i6 = this.zai;
        bb1.m0(9, parcel, 4);
        parcel.writeInt(i6);
        bb1.o0(parcel, n0);
    }

    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }
}
