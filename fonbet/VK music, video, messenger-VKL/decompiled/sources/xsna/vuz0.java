package xsna;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public abstract class vuz0 extends com.google.android.gms.internal.common.zzb implements evz0 {
    public static evz0 f(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof evz0 ? (evz0) queryLocalInterface : new nuz0(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }
}
