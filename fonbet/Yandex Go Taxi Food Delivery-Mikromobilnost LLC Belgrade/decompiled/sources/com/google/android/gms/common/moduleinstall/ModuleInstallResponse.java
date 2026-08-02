package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zad();
    private final int zaa;
    private final boolean zab;

    public ModuleInstallResponse(int i, boolean z) {
        this.zaa = i;
        this.zab = z;
    }

    public boolean areModulesAlreadyInstalled() {
        return this.zaa == 0;
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
        boolean z = this.zab;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.o0(parcel, n0);
    }

    public final boolean zaa() {
        return this.zab;
    }

    public ModuleInstallResponse(int i) {
        this(i, false);
    }
}
