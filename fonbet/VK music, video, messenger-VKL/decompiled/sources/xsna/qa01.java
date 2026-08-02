package xsna;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrw;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final class qa01 extends jsy {
    public final qt20 a;

    public qa01(qt20 qt20Var) {
        this.a = qt20Var;
    }

    @Override // xsna.jsy
    public final Object create(Object obj) {
        eh01 ik01Var;
        b46 b46Var = (b46) obj;
        qt20 qt20Var = this.a;
        Context b = qt20Var.b();
        zzrl zzb = zzrw.zzb(c201.b());
        if (!ik01.b(b)) {
            com.google.android.gms.common.a.b.getClass();
            if (com.google.android.gms.common.a.a(b) < 204500000) {
                ik01Var = new zl01(b, b46Var, zzb);
                return new rf01(qt20Var, b46Var, ik01Var, zzb);
            }
        }
        ik01Var = new ik01(b, b46Var, zzb);
        return new rf01(qt20Var, b46Var, ik01Var, zzb);
    }
}
