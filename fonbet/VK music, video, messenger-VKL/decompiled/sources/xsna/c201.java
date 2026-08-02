package xsna;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_barcode.zzca;
import com.google.android.gms.internal.mlkit_vision_barcode.zznd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzne;
import com.google.android.gms.internal.mlkit_vision_barcode.zznp;
import com.google.android.gms.internal.mlkit_vision_barcode.zznq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes13.dex */
public final class c201 {
    public static final SparseArray a;
    public static final SparseArray b;
    public static final AtomicReference c;

    @SuppressLint({"UseSparseArrays"})
    public static final HashMap d;

    static {
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        b = sparseArray2;
        c = new AtomicReference();
        sparseArray.put(-1, zznp.FORMAT_UNKNOWN);
        sparseArray.put(1, zznp.FORMAT_CODE_128);
        sparseArray.put(2, zznp.FORMAT_CODE_39);
        sparseArray.put(4, zznp.FORMAT_CODE_93);
        sparseArray.put(8, zznp.FORMAT_CODABAR);
        sparseArray.put(16, zznp.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zznp.FORMAT_EAN_13);
        sparseArray.put(64, zznp.FORMAT_EAN_8);
        sparseArray.put(128, zznp.FORMAT_ITF);
        sparseArray.put(256, zznp.FORMAT_QR_CODE);
        sparseArray.put(512, zznp.FORMAT_UPC_A);
        sparseArray.put(1024, zznp.FORMAT_UPC_E);
        sparseArray.put(2048, zznp.FORMAT_PDF417);
        sparseArray.put(4096, zznp.FORMAT_AZTEC);
        sparseArray2.put(0, zznq.TYPE_UNKNOWN);
        sparseArray2.put(1, zznq.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zznq.TYPE_EMAIL);
        sparseArray2.put(3, zznq.TYPE_ISBN);
        sparseArray2.put(4, zznq.TYPE_PHONE);
        sparseArray2.put(5, zznq.TYPE_PRODUCT);
        sparseArray2.put(6, zznq.TYPE_SMS);
        sparseArray2.put(7, zznq.TYPE_TEXT);
        sparseArray2.put(8, zznq.TYPE_URL);
        sparseArray2.put(9, zznq.TYPE_WIFI);
        sparseArray2.put(10, zznq.TYPE_GEO);
        sparseArray2.put(11, zznq.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zznq.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put(1, zzqs.CODE_128);
        hashMap.put(2, zzqs.CODE_39);
        hashMap.put(4, zzqs.CODE_93);
        hashMap.put(8, zzqs.CODABAR);
        hashMap.put(16, zzqs.DATA_MATRIX);
        hashMap.put(32, zzqs.EAN_13);
        hashMap.put(64, zzqs.EAN_8);
        hashMap.put(128, zzqs.ITF);
        hashMap.put(256, zzqs.QR_CODE);
        hashMap.put(512, zzqs.UPC_A);
        hashMap.put(1024, zzqs.UPC_E);
        hashMap.put(2048, zzqs.PDF417);
        hashMap.put(4096, zzqs.AZTEC);
    }

    public static zzqv a(b46 b46Var) {
        int i = b46Var.a;
        zzca zzcaVar = new zzca();
        HashMap hashMap = d;
        if (i == 0) {
            zzcaVar.zze(hashMap.values());
        } else {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & i) != 0) {
                    zzcaVar.zzd((zzqs) entry.getValue());
                }
            }
        }
        zzqt zzqtVar = new zzqt();
        zzqtVar.zzb(zzcaVar.zzf());
        return zzqtVar.zzc();
    }

    public static String b() {
        return true != d() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    public static void c(zzrl zzrlVar, zznd zzndVar) {
        zzrlVar.zzf(new k140(zzndVar), zzne.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean d() {
        AtomicReference atomicReference = c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean b2 = ik01.b(qt20.c().b());
        atomicReference.set(Boolean.valueOf(b2));
        return b2;
    }
}
