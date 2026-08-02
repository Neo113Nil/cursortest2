package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.core.text.PrecomputedTextCompat;
import com.google.android.gms.internal.mlkit_vision_common.zziv;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class hhe0 implements Callable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ hhe0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        dxa1 dxa1Var;
        int h;
        switch (this.a) {
            case 0:
                return PrecomputedTextCompat.create((CharSequence) this.c, (ghe0) this.b);
            case 1:
                hv20 hv20Var = (hv20) this.b;
                xzv xzvVar = (xzv) this.c;
                HashMap hashMap = dxa1.y;
                h2b1.k();
                int i = b2b1.a;
                h2b1.k();
                if (Boolean.parseBoolean("")) {
                    HashMap hashMap2 = dxa1.y;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new dxa1("detectorTaskWithResource#run"));
                    }
                    dxa1Var = (dxa1) hashMap2.get("detectorTaskWithResource#run");
                } else {
                    dxa1Var = swa1.z;
                }
                dxa1Var.a();
                try {
                    Object d = hv20Var.b.d(xzvVar);
                    dxa1Var.close();
                    return d;
                } finally {
                }
            case 2:
                i3a1 i3a1Var = (i3a1) this.b;
                mk20 mk20Var = (mk20) this.c;
                gr81 gr81Var = mk20Var.a;
                ic91 ic91Var = (ic91) gr81Var.c;
                int i2 = ((ic91) Collections.singletonList(ic91Var).get(0)).b;
                xzv xzvVar2 = null;
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (ic91Var.b != 2) {
                            ny61.g("Extract ByteBuffer from an MlImage created by objects other than Bytebuffer is not supported");
                            return null;
                        }
                        ny61.u();
                        return null;
                    }
                    if (i2 == 3) {
                        if (ic91Var.b != 3) {
                            ny61.g("Extract Media Image from an MlImage created by objects other than Media Image is not supported");
                            return null;
                        }
                        ny61.u();
                        return null;
                    }
                } else {
                    if (ic91Var.b != 1) {
                        ny61.g("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) gr81Var.b;
                    o1b1.d().a(new t1b1(-1, 1, bitmap.getAllocationByteCount(), mk20Var.c, mk20Var.b, SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime(), 0), zziv.ODML_IMAGE);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    xzvVar2 = new xzv(bitmap);
                    o1b1.d().a(new t1b1(-1, 1, bitmap.getAllocationByteCount(), bitmap.getHeight(), bitmap.getWidth(), SystemClock.elapsedRealtime() - elapsedRealtime, 0), zziv.INPUT_IMAGE_CONSTRUCTION);
                }
                if (xzvVar2 != null) {
                    h2b1.k();
                }
                if (xzvVar2 != null) {
                    return i3a1Var.b.d(xzvVar2);
                }
                throw new MlKitException("Current type of MlImage is not supported.", 13);
            case 3:
                zzjd zzjdVar = (zzjd) this.c;
                zzjdVar.zzL().w();
                b bVar = zzjdVar.zzL().c;
                n.O(bVar);
                return bVar.Bh((String) this.b);
            case 4:
                zzjd zzjdVar2 = (zzjd) this.c;
                zzjdVar2.zzL().w();
                return new zzao(zzjdVar2.zzL().j0(((zzr) this.b).zza));
            default:
                mvt0 mvt0Var = (mvt0) this.b;
                SplitInstallRequest splitInstallRequest = (SplitInstallRequest) this.c;
                if (mvt0Var == null || (h = mvt0Var.h()) == 0 || h == 5 || h == 6 || h == 7) {
                    return mvt0.b(mvt0Var != null ? 1 + mvt0Var.g() : 1, 1, 0, 0L, 0L, splitInstallRequest.a, new ArrayList());
                }
                throw new SplitInstallException(-1);
        }
    }

    public /* synthetic */ hhe0() {
        this.a = 0;
    }

    public /* synthetic */ hhe0(zzjd zzjdVar, Object obj, int i) {
        this.a = i;
        this.b = obj;
        this.c = zzjdVar;
    }
}
