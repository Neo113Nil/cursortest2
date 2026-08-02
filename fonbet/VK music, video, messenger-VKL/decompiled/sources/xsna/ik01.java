package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode.zznd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzso;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsy;
import com.google.android.gms.internal.mlkit_vision_barcode.zztf;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes13.dex */
public final class ik01 implements eh01 {
    public static final zzcd h = zzcd.zzh("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");
    public boolean a;
    public boolean b;
    public boolean c;
    public final Context d;
    public final b46 e;
    public final zzrl f;

    @Nullable
    public zzsw g;

    public ik01(Context context, b46 b46Var, zzrl zzrlVar) {
        this.d = context;
        this.e = b46Var;
        this.f = zzrlVar;
    }

    public static boolean b(Context context) {
        return DynamiteModule.a(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    @Override // xsna.eh01
    public final ArrayList a(y1x y1xVar) throws MlKitException {
        bq70 bq70Var;
        if (this.g == null) {
            zzc();
        }
        zzsw zzswVar = this.g;
        exc0.i(zzswVar);
        if (!this.a) {
            try {
                zzswVar.zze();
                this.a = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init barcode scanner.", e);
            }
        }
        int i = y1xVar.d;
        if (y1xVar.g == 35) {
            Image.Plane[] a = y1xVar.a();
            exc0.i(a);
            i = a[0].getRowStride();
        }
        zztf zztfVar = new zztf(y1xVar.g, i, y1xVar.e, tig.a(y1xVar.f), SystemClock.elapsedRealtime());
        int i2 = y1xVar.g;
        if (i2 != -1) {
            if (i2 != 17) {
                if (i2 == 35) {
                    bq70Var = new bq70(y1xVar.c == null ? null : y1xVar.c.a);
                } else if (i2 != 842094169) {
                    throw new MlKitException(lhg.a(y1xVar.g, "Unsupported image format: "), 3);
                }
            }
            ByteBuffer byteBuffer = y1xVar.b;
            exc0.i(byteBuffer);
            bq70Var = new bq70(byteBuffer);
        } else {
            Bitmap bitmap = y1xVar.a;
            exc0.i(bitmap);
            bq70Var = new bq70(bitmap);
        }
        try {
            List zzd = zzswVar.zzd(bq70Var, zztfVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = zzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new y36(new itz0((zzsm) it.next())));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run barcode scanner.", e2);
        }
    }

    public final zzsw c(DynamiteModule.a aVar, String str, String str2) throws DynamiteModule.LoadingException, RemoteException {
        Context context = this.d;
        return zzsy.zza(DynamiteModule.c(context, aVar, str).b(str2)).zzd(new bq70(context), new zzso(this.e.a, false));
    }

    @Override // xsna.eh01
    public final void zzb() {
        zzsw zzswVar = this.g;
        if (zzswVar != null) {
            try {
                zzswVar.zzf();
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.g = null;
            this.a = false;
        }
    }

    @Override // xsna.eh01
    public final boolean zzc() throws MlKitException {
        if (this.g != null) {
            return this.b;
        }
        Context context = this.d;
        boolean b = b(context);
        zzrl zzrlVar = this.f;
        if (b) {
            this.b = true;
            try {
                this.g = c(DynamiteModule.c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create thick barcode scanner.", e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load the bundled barcode module.", e2);
            }
        } else {
            boolean z = false;
            this.b = false;
            Feature[] featureArr = pt80.a;
            com.google.android.gms.common.a.b.getClass();
            int a = com.google.android.gms.common.a.a(context);
            zzcd zzcdVar = h;
            if (a >= 221500000) {
                final Feature[] b2 = pt80.b(zzcdVar, pt80.d);
                try {
                    z = ((ModuleAvailabilityResponse) Tasks.await(new fqz0(context, fqz0.a, a.d.U6, b.a.c).a(new ot80() { // from class: xsna.om01
                        @Override // xsna.ot80
                        public final Feature[] m() {
                            Feature[] featureArr2 = pt80.a;
                            return b2;
                        }
                    }).addOnFailureListener(fn01.a))).b;
                } catch (InterruptedException | ExecutionException e3) {
                    Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e3);
                }
            } else {
                try {
                    Iterator it = zzcdVar.iterator();
                    while (it.hasNext()) {
                        DynamiteModule.c(context, DynamiteModule.b, (String) it.next());
                    }
                    z = true;
                } catch (DynamiteModule.LoadingException unused) {
                }
            }
            if (!z) {
                if (!this.c) {
                    pt80.a(context, zzcd.zzh("barcode", "tflite_dynamite"));
                    this.c = true;
                }
                c201.c(zzrlVar, zznd.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.g = c(DynamiteModule.b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e4) {
                c201.c(zzrlVar, zznd.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", e4);
            }
        }
        c201.c(zzrlVar, zznd.NO_ERROR);
        return this.b;
    }
}
