package com.google.android.gms.wallet.firstparty.setupwizard;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        SetupWizardInstrumentManagerParams setupWizardInstrumentManagerParams = null;
        int i = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c != 2) {
                cma1.A0(parcel, readInt);
            } else {
                setupWizardInstrumentManagerParams = (SetupWizardInstrumentManagerParams) cma1.y(parcel, readInt, SetupWizardInstrumentManagerParams.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new GetSetupWizardIntentRequest(i, setupWizardInstrumentManagerParams);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSetupWizardIntentRequest[i];
    }
}
