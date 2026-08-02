package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public abstract class pnz0 extends com.google.android.gms.internal.base.zab implements wnz0 {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Status status = (Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleAvailabilityResponse.CREATOR);
            com.google.android.gms.internal.base.zac.zad(parcel);
            Z0(status, moduleAvailabilityResponse);
            return true;
        }
        if (i == 2) {
            Status status2 = (Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleInstallResponse.CREATOR);
            com.google.android.gms.internal.base.zac.zad(parcel);
            C(status2, moduleInstallResponse);
            return true;
        }
        if (i == 3) {
            com.google.android.gms.internal.base.zac.zad(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 4) {
            return false;
        }
        com.google.android.gms.internal.base.zac.zad(parcel);
        throw new UnsupportedOperationException();
    }
}
