package xsna;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zznd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes13.dex */
public final class zl01 implements eh01 {
    public boolean a;
    public final Context b;
    public final zzad c;
    public final zzrl d;

    @Nullable
    public zzaf e;

    public zl01(Context context, b46 b46Var, zzrl zzrlVar) {
        zzad zzadVar = new zzad();
        this.c = zzadVar;
        this.b = context;
        zzadVar.zza = b46Var.a;
        this.d = zzrlVar;
    }

    @Override // xsna.eh01
    public final ArrayList a(y1x y1xVar) throws MlKitException {
        com.google.android.gms.internal.mlkit_vision_barcode.zzq[] zzf;
        if (this.e == null) {
            zzc();
        }
        zzaf zzafVar = this.e;
        if (zzafVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        zzaj zzajVar = new zzaj(y1xVar.d, y1xVar.e, 0, 0L, tig.a(y1xVar.f));
        try {
            int i = y1xVar.g;
            if (i == -1) {
                zzf = zzafVar.zzf(new bq70(y1xVar.a), zzajVar);
            } else if (i == 17) {
                zzf = zzafVar.zze(new bq70(y1xVar.b), zzajVar);
            } else if (i == 35) {
                Image.Plane[] a = y1xVar.a();
                exc0.i(a);
                zzajVar.zza = a[0].getRowStride();
                zzf = zzafVar.zze(new bq70(a[0].getBuffer()), zzajVar);
            } else {
                if (i != 842094169) {
                    throw new MlKitException("Unsupported image format: " + y1xVar.g, 3);
                }
                zzf = zzafVar.zze(new bq70(whw.a(y1xVar)), zzajVar);
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzq zzqVar : zzf) {
                arrayList.add(new y36(new e0a(zzqVar)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to detect with legacy barcode detector", e);
        }
    }

    @Override // xsna.eh01
    public final void zzb() {
        zzaf zzafVar = this.e;
        if (zzafVar != null) {
            try {
                zzafVar.zzd();
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.e = null;
        }
    }

    @Override // xsna.eh01
    public final boolean zzc() throws MlKitException {
        Context context = this.b;
        if (this.e != null) {
            return false;
        }
        try {
            zzaf zzd = zzah.zza(DynamiteModule.c(context, DynamiteModule.b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(new bq70(context), this.c);
            this.e = zzd;
            zzrl zzrlVar = this.d;
            if (zzd == null && !this.a) {
                Feature[] featureArr = pt80.a;
                pt80.a(context, zzar.zzh("barcode"));
                this.a = true;
                c201.c(zzrlVar, zznd.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            c201.c(zzrlVar, zznd.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy barcode detector.", e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", e2);
        }
    }
}
