package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.common.images.WebImage;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class b601 extends com.google.android.gms.internal.cast.zzb implements e701 {
    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            MediaMetadata mediaMetadata = (MediaMetadata) com.google.android.gms.internal.cast.zzc.zzb(parcel, MediaMetadata.CREATOR);
            parcel.readInt();
            com.google.android.gms.internal.cast.zzc.zzf(parcel);
            ((sf01) this).a.getClass();
            WebImage a = okw.a(mediaMetadata);
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zzd(parcel2, a);
            return true;
        }
        if (i == 2) {
            vnv zzf = ((sf01) this).zzf();
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zze(parcel2, zzf);
            return true;
        }
        if (i == 3) {
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        if (i != 4) {
            return false;
        }
        MediaMetadata mediaMetadata2 = (MediaMetadata) com.google.android.gms.internal.cast.zzc.zzb(parcel, MediaMetadata.CREATOR);
        ImageHints imageHints = (ImageHints) com.google.android.gms.internal.cast.zzc.zzb(parcel, ImageHints.CREATOR);
        com.google.android.gms.internal.cast.zzc.zzf(parcel);
        ((sf01) this).a.getClass();
        int i3 = imageHints.b;
        WebImage a2 = okw.a(mediaMetadata2);
        parcel2.writeNoException();
        com.google.android.gms.internal.cast.zzc.zzd(parcel2, a2);
        return true;
    }
}
