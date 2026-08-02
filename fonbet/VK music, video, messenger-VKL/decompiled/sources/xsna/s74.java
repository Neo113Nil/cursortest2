package xsna;

import android.os.Parcelable;

/* compiled from: AttachmentPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class s74 extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 1;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        r74 r74Var = u1c0Var instanceof r74 ? (r74) u1c0Var : null;
        Parcelable parcelable = r74Var != null ? r74Var.q : null;
        tfw tfwVar = parcelable instanceof tfw ? (tfw) parcelable : null;
        if (tfwVar != null) {
            return tfwVar.h9();
        }
        return null;
    }
}
