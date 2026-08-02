package xsna;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzca;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmu;
import com.google.android.gms.internal.mlkit_vision_barcode.zznc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzne;
import com.google.android.gms.internal.mlkit_vision_barcode.zznf;
import com.google.android.gms.internal.mlkit_vision_barcode.zznp;
import com.google.android.gms.internal.mlkit_vision_barcode.zznq;
import com.google.android.gms.internal.mlkit_vision_barcode.zznr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes13.dex */
public final class rf01 extends ac00 {
    public static boolean j = true;
    public final b46 d;
    public final eh01 e;
    public final zzrl f;
    public final zzrn g;
    public final jc7 h = new jc7();
    public boolean i;

    public rf01(qt20 qt20Var, b46 b46Var, eh01 eh01Var, zzrl zzrlVar) {
        exc0.j(qt20Var, "MlKitContext can not be null");
        exc0.j(b46Var, "BarcodeScannerOptions can not be null");
        this.d = b46Var;
        this.e = eh01Var;
        this.f = zzrlVar;
        this.g = zzrn.zza(qt20Var.b());
    }

    @Override // xsna.ac00
    public final List b(@NonNull cc00 cc00Var) throws MlKitException {
        rf01 rf01Var;
        y1x y1xVar = (y1x) cc00Var;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.h.a(y1xVar);
                    try {
                        ArrayList a = this.e.a(y1xVar);
                        rf01Var = this;
                        try {
                            rf01Var.c(zznd.NO_ERROR, elapsedRealtime, y1xVar, a);
                            j = false;
                            return a;
                        } catch (MlKitException e) {
                            e = e;
                            MlKitException mlKitException = e;
                            rf01Var.c(mlKitException.d() == 14 ? zznd.MODEL_NOT_DOWNLOADED : zznd.UNKNOWN_ERROR, elapsedRealtime, y1xVar, null);
                            throw mlKitException;
                        }
                    } catch (MlKitException e2) {
                        e = e2;
                        rf01Var = this;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void c(final zznd zzndVar, long j2, @NonNull final y1x y1xVar, @Nullable List list) {
        final zzca zzcaVar = new zzca();
        final zzca zzcaVar2 = new zzca();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                y36 y36Var = (y36) it.next();
                int format = y36Var.a.getFormat();
                if (format > 4096 || format == 0) {
                    format = -1;
                }
                zznp zznpVar = (zznp) c201.a.get(format);
                if (zznpVar == null) {
                    zznpVar = zznp.FORMAT_UNKNOWN;
                }
                zzcaVar.zzd(zznpVar);
                zznq zznqVar = (zznq) c201.b.get(y36Var.a.h());
                if (zznqVar == null) {
                    zznqVar = zznq.TYPE_UNKNOWN;
                }
                zzcaVar2.zzd(zznqVar);
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
        this.f.zzf(new zzrk() { // from class: xsna.lc01
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzrk
            public final zzra zza() {
                int limit;
                rf01 rf01Var = rf01.this;
                long j3 = elapsedRealtime;
                zznd zzndVar2 = zzndVar;
                zzca zzcaVar3 = zzcaVar;
                zzca zzcaVar4 = zzcaVar2;
                y1x y1xVar2 = y1xVar;
                zznr zznrVar = new zznr();
                zzmu zzmuVar = new zzmu();
                zzmuVar.zzc(Long.valueOf(j3));
                zzmuVar.zzd(zzndVar2);
                zzmuVar.zze(Boolean.valueOf(rf01.j));
                Boolean bool = Boolean.TRUE;
                zzmuVar.zza(bool);
                zzmuVar.zzb(bool);
                zznrVar.zzh(zzmuVar.zzf());
                zznrVar.zzi(c201.a(rf01Var.d));
                zznrVar.zze(zzcaVar3.zzf());
                zznrVar.zzf(zzcaVar4.zzf());
                int i = y1xVar2.g;
                if (i == -1) {
                    Bitmap bitmap = y1xVar2.a;
                    exc0.i(bitmap);
                    limit = bitmap.getAllocationByteCount();
                } else if (i == 17 || i == 842094169) {
                    ByteBuffer byteBuffer = y1xVar2.b;
                    exc0.i(byteBuffer);
                    limit = byteBuffer.limit();
                } else if (i != 35) {
                    limit = 0;
                } else {
                    Image.Plane[] a = y1xVar2.a();
                    exc0.i(a);
                    limit = (a[0].getBuffer().limit() * 3) / 2;
                }
                zzmn zzmnVar = new zzmn();
                zzmnVar.zza(i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzmo.UNKNOWN_FORMAT : zzmo.NV21 : zzmo.NV16 : zzmo.YV12 : zzmo.YUV_420_888 : zzmo.BITMAP);
                zzmnVar.zzb(Integer.valueOf(limit));
                zznrVar.zzg(zzmnVar.zzd());
                zznf zznfVar = new zznf();
                zznfVar.zze(rf01Var.i ? zznc.TYPE_THICK : zznc.TYPE_THIN);
                zznfVar.zzg(zznrVar.zzj());
                return zzro.zzf(zznfVar);
            }
        }, zzne.ON_DEVICE_BARCODE_DETECT);
        zzdx zzdxVar = new zzdx();
        zzdxVar.zze(zzndVar);
        zzdxVar.zzf(Boolean.valueOf(j));
        zzdxVar.zzg(c201.a(this.d));
        zzdxVar.zzc(zzcaVar.zzf());
        zzdxVar.zzd(zzcaVar2.zzf());
        final zzdz zzh = zzdxVar.zzh();
        final ae01 ae01Var = new ae01(this);
        final zzne zzneVar = zzne.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        zd01 zd01Var = zd01.zza;
        final zzrl zzrlVar = this.f;
        zd01Var.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzri
            @Override // java.lang.Runnable
            public final void run() {
                zzrl.this.zzh(zzneVar, zzh, elapsedRealtime, ae01Var);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.g.zzc(true != this.i ? 24301 : 24302, zzndVar.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }
}
