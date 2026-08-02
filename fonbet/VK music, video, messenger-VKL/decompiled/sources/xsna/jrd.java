package xsna;

import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import xsna.z6x;

/* compiled from: ClipsDownloadController.kt */
/* loaded from: classes16.dex */
public final class jrd implements crc {
    public static final jrd a = new jrd();
    public static final SparseArray<brc> b = new SparseArray<>();
    public static final SparseArray<drc> c = new SparseArray<>();

    public static void e(int i) {
        SparseArray<brc> sparseArray = b;
        brc brcVar = sparseArray.get(i);
        if (brcVar != null) {
            rgl rglVar = z6x.a.a;
            if (rglVar == null) {
                rglVar = null;
            }
            ((y6x) rglVar.c()).l(new l5(brcVar, 22));
            sparseArray.remove(i);
            c.remove(i);
        }
    }

    @Override // xsna.crc
    public final void a(float f, int i) {
        drc drcVar;
        if (b.get(i) == null) {
            drcVar = null;
        } else {
            SparseArray<drc> sparseArray = c;
            drc drcVar2 = sparseArray.get(i);
            if (drcVar2 == null) {
                drcVar2 = new drc(i);
                drcVar2.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                sparseArray.append(i, drcVar2);
            }
            drcVar = drcVar2;
        }
        if (drcVar == null) {
            return;
        }
        drcVar.b = f;
        ysg0.b.a(drcVar);
    }

    @Override // xsna.crc
    public final void b(int i) {
        e(i);
        d(i);
    }

    @Override // xsna.crc
    public final void c(int i, frc frcVar) {
        b.append(i, frcVar);
        ysg0.b.a(new erc(i));
    }

    @Override // xsna.crc
    public final void d(int i) {
        c.remove(i);
        b.remove(i);
        ysg0.b.a(new arc(i));
    }
}
