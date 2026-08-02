package xsna;

import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.dto.attaches.AttachWithDownload;
import xsna.u6x;

/* compiled from: AttachDownloadJob.kt */
/* loaded from: classes2.dex */
public final class s14 implements m7r0, ouf0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s14(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        ms01 ms01Var = (ms01) obj;
        a401 a401Var = (a401) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        exc0.k("Not connected to device", a401Var.e());
        nwz0 nwz0Var = (nwz0) ms01Var.getService();
        ApiMetadata zza = zzff.zza(ms01Var.getContext());
        Parcel zza2 = nwz0Var.zza();
        zza2.writeString(str);
        zza2.writeString(str2);
        com.google.android.gms.internal.cast.zzc.zzc(zza2, null);
        com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
        nwz0Var.zzd(14, zza2);
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

    @Override // xsna.m7r0
    public void onProgress(int i, int i2) {
        ((u6x.a) this.b).a(i, i2);
        ((w2w) this.c).S0().z((AttachWithDownload) this.d, i, i2);
    }
}
