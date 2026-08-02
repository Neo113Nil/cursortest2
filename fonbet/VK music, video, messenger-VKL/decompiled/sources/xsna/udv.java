package xsna;

import android.os.Parcelable;

/* compiled from: HorizontalGalleryPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class udv extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        if (u1c0Var instanceof a160) {
            return ((a160) u1c0Var).q.size();
        }
        return 0;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        a160 a160Var = u1c0Var instanceof a160 ? (a160) u1c0Var : null;
        if (a160Var != null) {
            Object b0 = j5g.b0(i, a160Var.q);
            r74 r74Var = b0 instanceof r74 ? (r74) b0 : null;
            if (r74Var != null) {
                Parcelable parcelable = r74Var.q;
                tfw tfwVar = parcelable instanceof tfw ? (tfw) parcelable : null;
                if (tfwVar != null) {
                    return tfwVar.h9();
                }
            }
        }
        return null;
    }
}
