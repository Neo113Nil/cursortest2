package xsna;

import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;

/* compiled from: MethodSelectorCallback.kt */
/* loaded from: classes3.dex */
public final class sj20 implements rj20, ouf0 {
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ sj20(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.rj20
    public void D() {
        ((gzs) this.c).invoke();
    }

    @Override // xsna.rj20
    public void E(VerificationMethodTypes verificationMethodTypes) {
        ((izs) this.b).invoke(verificationMethodTypes);
    }

    @Override // xsna.rj20
    public void a() {
        ((gzs) this.d).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        a401 a401Var = (a401) this.b;
        String str = (String) this.c;
        LaunchOptions launchOptions = (LaunchOptions) this.d;
        ms01 ms01Var = (ms01) obj;
        exc0.k("Not connected to device", a401Var.e());
        nwz0 nwz0Var = (nwz0) ms01Var.getService();
        ApiMetadata zza = zzff.zza(ms01Var.getContext());
        Parcel zza2 = nwz0Var.zza();
        zza2.writeString(str);
        com.google.android.gms.internal.cast.zzc.zzc(zza2, launchOptions);
        com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
        nwz0Var.zzd(13, zza2);
        synchronized (a401Var.h) {
            try {
                if (a401Var.e != null) {
                    a401Var.f(2477);
                }
                a401Var.e = taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ sj20(gzs gzsVar, izs izsVar) {
        this(izsVar, gzsVar, new e20(16));
    }
}
