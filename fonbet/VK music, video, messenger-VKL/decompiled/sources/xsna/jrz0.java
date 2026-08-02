package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public abstract class jrz0 extends com.google.android.gms.internal.p000authapi.zbb implements lrz0 {
    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                com.google.android.gms.internal.p000authapi.zbc.zbb(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.zbb(parcel);
                R0(status);
                break;
            case 103:
                Status status2 = (Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.zbb(parcel);
                P0(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
