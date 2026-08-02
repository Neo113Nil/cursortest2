package xsna;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public abstract class jwz0 extends com.google.android.gms.internal.maps.zzb {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jwz0(String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.a) {
            case 0:
                if (i == 1) {
                    ((t601) this).b.a(new eo00(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder())));
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i == 1) {
                } else if (i == 2) {
                } else if (i == 3) {
                }
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
