package xsna;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes13.dex */
public abstract class tnz0 extends com.google.android.gms.internal.base.zab implements aoz0 {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                com.google.android.gms.internal.base.zac.zad(parcel);
                break;
            case 4:
                com.google.android.gms.internal.base.zac.zad(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                com.google.android.gms.internal.base.zac.zad(parcel);
                break;
            case 7:
                com.google.android.gms.internal.base.zac.zad(parcel);
                break;
            case 8:
                com.google.android.gms.signin.internal.zak zakVar = (com.google.android.gms.signin.internal.zak) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.signin.internal.zak.CREATOR);
                com.google.android.gms.internal.base.zac.zad(parcel);
                V(zakVar);
                break;
            case 9:
                com.google.android.gms.internal.base.zac.zad(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
