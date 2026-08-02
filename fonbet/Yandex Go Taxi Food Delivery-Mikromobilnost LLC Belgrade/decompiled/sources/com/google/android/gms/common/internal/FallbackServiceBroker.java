package com.google.android.gms.common.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* loaded from: classes11.dex */
public abstract class FallbackServiceBroker extends IGmsServiceBroker.Stub {
    @Override // com.google.android.gms.common.internal.IGmsServiceBroker.Stub, com.google.android.gms.common.internal.IGmsServiceBroker
    public abstract /* synthetic */ void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) throws RemoteException;
}
