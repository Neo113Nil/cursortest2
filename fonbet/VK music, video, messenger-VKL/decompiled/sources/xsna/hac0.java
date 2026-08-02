package xsna;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PosterHoldersRotationSensorListener.kt */
/* loaded from: classes4.dex */
public final class hac0 implements hng0 {
    public final ArrayList b;

    public hac0(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.hng0
    public final void A1(float f, float f2) {
        gac0 gac0Var;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            WeakReference weakReference = (WeakReference) j5g.b0(i, arrayList);
            if (weakReference != null && (gac0Var = (gac0) weakReference.get()) != null) {
                gac0Var.A1(f, f2);
            }
        }
    }

    @Override // xsna.hng0
    public final void h4(float f, float f2) {
    }
}
