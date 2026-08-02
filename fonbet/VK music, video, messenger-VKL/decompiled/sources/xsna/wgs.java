package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: FrescoCloseableDrawable.kt */
/* loaded from: classes2.dex */
public final class wgs implements tjo {
    @Override // xsna.tjo
    public final Drawable a(svf svfVar) {
        if (svfVar instanceof xgs) {
            return ((xgs) svfVar).x();
        }
        return null;
    }

    @Override // xsna.tjo
    public final boolean b(svf svfVar) {
        return svfVar instanceof xgs;
    }
}
