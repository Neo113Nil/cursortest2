package xsna;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes.dex */
public final class jn01 {

    @Nullable
    public final Messenger a;

    @Nullable
    public final com.google.android.gms.cloudmessaging.zze b;

    public jn01(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor == "android.os.IMessenger" || (interfaceDescriptor != null && interfaceDescriptor.equals("android.os.IMessenger"))) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
                throw new RemoteException();
            }
            this.b = new com.google.android.gms.cloudmessaging.zze(iBinder);
            this.a = null;
        }
    }
}
