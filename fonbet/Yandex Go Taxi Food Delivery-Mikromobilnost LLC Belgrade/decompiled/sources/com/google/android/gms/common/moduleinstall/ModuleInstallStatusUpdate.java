package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.ny61;
import defpackage.s530;

/* loaded from: classes11.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new zae();
    private final int zaa;
    private final int zab;
    private final Long zac;
    private final Long zad;
    private final int zae;
    private final s530 zaf;

    public ModuleInstallStatusUpdate(int i, int i2, Long l, Long l2, int i3) {
        this.zaa = i;
        this.zab = i2;
        this.zac = l;
        this.zad = l2;
        this.zae = i3;
        if (l == null || l2 == null || l2.longValue() == 0) {
            this.zaf = null;
            return;
        }
        long longValue = l2.longValue();
        s530 s530Var = new s530();
        if (longValue != 0) {
            this.zaf = s530Var;
        } else {
            ny61.g("Given Long is zero");
            throw null;
        }
    }

    public int getErrorCode() {
        return this.zae;
    }

    public int getInstallState() {
        return this.zab;
    }

    public s530 getProgressInfo() {
        return this.zaf;
    }

    public int getSessionId() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int sessionId = getSessionId();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(sessionId);
        int installState = getInstallState();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(installState);
        bb1.e0(parcel, 3, this.zac);
        bb1.e0(parcel, 4, this.zad);
        int errorCode = getErrorCode();
        bb1.m0(5, parcel, 4);
        parcel.writeInt(errorCode);
        bb1.o0(parcel, n0);
    }
}
