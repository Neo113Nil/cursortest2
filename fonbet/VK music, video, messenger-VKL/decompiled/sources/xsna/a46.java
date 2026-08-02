package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zznc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzne;
import com.google.android.gms.internal.mlkit_vision_barcode.zznf;
import com.google.android.gms.internal.mlkit_vision_barcode.zznr;
import com.google.android.gms.internal.mlkit_vision_barcode.zznt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes13.dex */
public final class a46 extends ru20<List<y36>> implements z36 {
    public final boolean g;

    public a46(@NonNull b46 b46Var, @NonNull rf01 rf01Var, @NonNull Executor executor, @NonNull zzrl zzrlVar) {
        super(rf01Var, executor);
        boolean d = c201.d();
        this.g = d;
        zznr zznrVar = new zznr();
        zznrVar.zzi(c201.a(b46Var));
        zznt zzj = zznrVar.zzj();
        zznf zznfVar = new zznf();
        zznfVar.zze(d ? zznc.TYPE_THICK : zznc.TYPE_THIN);
        zznfVar.zzg(zzj);
        zzrlVar.zzd(zzro.zzg(zznfVar, 1), zzne.ON_DEVICE_BARCODE_CREATE);
    }

    @NonNull
    public final Task<List<y36>> b(@NonNull final y1x y1xVar) {
        synchronized (this) {
            if (this.b.get()) {
                return Tasks.forException(new MlKitException("This detector is already closed!", 14));
            }
            if (y1xVar.d < 32 || y1xVar.e < 32) {
                return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
            }
            return this.c.a(this.e, new Callable() { // from class: xsna.otz0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    a46 a46Var = a46.this;
                    y1x y1xVar2 = y1xVar;
                    zzlx zze = zzlx.zze("detectorTaskWithResource#run");
                    zze.zzb();
                    try {
                        List b = a46Var.c.b(y1xVar2);
                        zze.close();
                        return b;
                    } catch (Throwable th) {
                        try {
                            zze.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                }
            }, this.d.getToken());
        }
    }

    @Override // xsna.ot80
    @NonNull
    public final Feature[] m() {
        return this.g ? pt80.a : new Feature[]{pt80.b};
    }
}
