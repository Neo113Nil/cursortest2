package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public abstract class hh01 extends com.google.android.gms.internal.common.zzb implements fs01 {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public hh01(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        exc0.b(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public final boolean equals(@Nullable Object obj) {
        vnv zzd;
        if (obj instanceof fs01) {
            try {
                fs01 fs01Var = (fs01) obj;
                if (fs01Var.zze() == this.a && (zzd = fs01Var.zzd()) != null) {
                    return Arrays.equals(f(), (byte[]) bq70.g(zzd));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public abstract byte[] f();

    public final int hashCode() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            vnv zzd = zzd();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.zze(parcel2, zzd);
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.a);
        }
        return true;
    }

    @Override // xsna.fs01
    public final vnv zzd() {
        return new bq70(f());
    }

    @Override // xsna.fs01
    public final int zze() {
        return this.a;
    }
}
