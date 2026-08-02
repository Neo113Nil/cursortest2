package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.internal.zzf;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes11.dex */
public abstract class dw00 {
    public static boolean a;

    public static synchronized int a(Context context) {
        synchronized (dw00.class) {
            cvw.m(context, "Context is null");
            if (a) {
                return 0;
            }
            try {
                zzf a2 = cd91.a(context);
                try {
                    ICameraUpdateFactoryDelegate zze = a2.zze();
                    cvw.l(zze);
                    deb1.a = zze;
                    zzi zzj = a2.zzj();
                    if (l7b1.a == null) {
                        cvw.m(zzj, "delegate must not be null");
                        l7b1.a = zzj;
                    }
                    a = true;
                    try {
                        a2.zzd();
                        a2.zzl(ObjectWrapper.wrap(context), 0);
                    } catch (RemoteException e) {
                        Log.e("dw00", "Failed to retrieve renderer type or log initialization.", e);
                    }
                    return 0;
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
            } catch (GooglePlayServicesNotAvailableException e3) {
                return e3.errorCode;
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (dw00.class) {
            a(context);
        }
    }
}
