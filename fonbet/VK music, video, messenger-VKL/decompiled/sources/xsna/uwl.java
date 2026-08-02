package xsna;

import android.graphics.Bitmap;

/* compiled from: DeliveryPointsItemIconProvider.kt */
/* loaded from: classes18.dex */
public final class uwl extends q76 {
    @Override // xsna.q76
    public final Object j(Object obj) {
        return ((lwl) obj).a.concat("_selected=false");
    }

    @Override // xsna.q76
    public final sb7 l(Object obj, Object obj2) {
        Bitmap bitmap = ((lwl) obj2).d;
        if (bitmap.isRecycled()) {
            return null;
        }
        vj00 vj00Var = ofx.a;
        (vj00Var != null ? vj00Var : null).getClass();
        return xx1.h(bitmap);
    }
}
