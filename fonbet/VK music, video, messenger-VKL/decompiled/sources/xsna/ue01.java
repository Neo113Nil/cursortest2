package xsna;

import android.os.Bundle;
import com.google.android.gms.internal.mlkit_common.zzox;
import com.google.android.gms.internal.mlkit_vision_barcode.zznc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzne;
import com.google.android.gms.internal.mlkit_vision_barcode.zznf;
import com.google.android.gms.internal.mlkit_vision_barcode.zznr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ue01 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ue01(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                synchronized (((AtomicReference) this.c)) {
                    try {
                        try {
                            AtomicReference atomicReference = (AtomicReference) this.c;
                            mb01 mb01Var = (mb01) ((bf01) this.d).b;
                            atomicReference.set(Integer.valueOf(mb01Var.h.o(mb01Var.o().o(), s701.N)));
                        } finally {
                            ((AtomicReference) this.c).notify();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                e330 e330Var = (e330) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                int decrementAndGet = e330Var.b.decrementAndGet();
                exc0.l(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    rf01 rf01Var = (rf01) e330Var;
                    synchronized (rf01Var) {
                        try {
                            rf01Var.e.zzb();
                            rf01.j = true;
                            zzrl zzrlVar = rf01Var.f;
                            zznf zznfVar = new zznf();
                            zznfVar.zze(rf01Var.i ? zznc.TYPE_THICK : zznc.TYPE_THIN);
                            zznr zznrVar = new zznr();
                            zznrVar.zzi(c201.a(rf01Var.d));
                            zznfVar.zzg(zznrVar.zzj());
                            zzrlVar.zzd(zzro.zzf(zznfVar), zzne.ON_DEVICE_BARCODE_CLOSE);
                        } finally {
                        }
                    }
                    e330Var.c.set(false);
                }
                zzox.zza();
                taskCompletionSource.setResult(null);
                return;
            default:
                bs01 bs01Var = ((wtz0) this.d).b;
                nlk0 nlk0Var = (nlk0) this.c;
                ArrayList arrayList = nlk0Var.a;
                ArrayList f = wtz0.f(nlk0Var.b);
                Bundle bundle = new Bundle();
                bundle.putInt("session_id", 0);
                bundle.putInt("status", 5);
                bundle.putInt("error_code", 0);
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("module_names", new ArrayList<>(arrayList));
                }
                if (!f.isEmpty()) {
                    bundle.putStringArrayList("languages", new ArrayList<>(f));
                }
                bundle.putLong("total_bytes_to_download", 0L);
                bundle.putLong("bytes_downloaded", 0L);
                bs01Var.d(olk0.m(bundle));
                return;
        }
    }

    public /* synthetic */ ue01(e330 e330Var, TaskCompletionSource taskCompletionSource) {
        this.b = 1;
        this.c = e330Var;
        this.d = taskCompletionSource;
    }
}
