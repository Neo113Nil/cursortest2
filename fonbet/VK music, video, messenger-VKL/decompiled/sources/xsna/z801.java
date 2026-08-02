package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class z801 extends com.google.android.gms.internal.cast.zza implements kc01 {
    @Override // xsna.kc01
    public final Bitmap T(Uri uri) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, uri);
        Parcel zzb = zzb(1, zza);
        Bitmap bitmap = (Bitmap) com.google.android.gms.internal.cast.zzc.zzb(zzb, Bitmap.CREATOR);
        zzb.recycle();
        return bitmap;
    }
}
