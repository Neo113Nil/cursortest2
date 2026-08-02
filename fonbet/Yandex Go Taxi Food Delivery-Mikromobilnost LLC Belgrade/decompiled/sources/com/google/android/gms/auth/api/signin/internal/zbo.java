package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p000authapi.zbb;

/* loaded from: classes11.dex */
public abstract class zbo extends zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zbc();
        } else {
            if (i != 2) {
                return false;
            }
            zbb();
        }
        return true;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public abstract /* synthetic */ void zbb() throws RemoteException;

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public abstract /* synthetic */ void zbc() throws RemoteException;
}
