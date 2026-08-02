package com.google.android.gms.wallet.firstparty.setupwizard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class GetSetupWizardIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSetupWizardIntentRequest> CREATOR = new zza();
    public static final int FLOW_TYPE_INSTRUMENT_MANAGER = 1;
    public static final int UNKNOWN_FLOW_TYPE = 0;
    final int zza;
    final SetupWizardInstrumentManagerParams zzb;

    public GetSetupWizardIntentRequest(int i, SetupWizardInstrumentManagerParams setupWizardInstrumentManagerParams) {
        this.zza = i;
        this.zzb = setupWizardInstrumentManagerParams;
    }

    public SetupWizardInstrumentManagerParams getInstrumentManagerParams() {
        return this.zzb;
    }

    public int getSetupWizardFlow() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.f0(parcel, 2, this.zzb, i, false);
        bb1.o0(parcel, n0);
    }
}
