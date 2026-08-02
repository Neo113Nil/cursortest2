package xsna;

import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.dz9;

/* compiled from: UserProfileOnBoardingBannerView.kt */
/* loaded from: classes5.dex */
public final class o36 implements ouf0 {
    public final String b;
    public final Object c;
    public final Object d;

    public /* synthetic */ o36(a401 a401Var, dz9.d dVar, String str) {
        this.c = a401Var;
        this.d = dVar;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        a401 a401Var = (a401) this.c;
        dz9.d dVar = (dz9.d) this.d;
        ms01 ms01Var = (ms01) obj;
        exc0.k("Not active connection", a401Var.v != 1);
        if (dVar != null) {
            nwz0 nwz0Var = (nwz0) ms01Var.getService();
            ApiMetadata zza = zzff.zza(ms01Var.getContext());
            Parcel zza2 = nwz0Var.zza();
            zza2.writeString(this.b);
            com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
            nwz0Var.zzd(12, zza2);
        }
        taskCompletionSource.setResult(null);
    }

    public o36(String str, String str2, lg90 lg90Var) {
        this.b = str;
        this.c = str2;
        this.d = lg90Var;
    }
}
