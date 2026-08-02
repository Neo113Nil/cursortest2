package xsna;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gyg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gyg(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap((Bitmap) obj, this.b, this.c, true);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        mog0 mog0Var = new mog0(context.getResources(), createScaledBitmap);
        mog0Var.a();
        return mog0Var.getCurrent();
    }
}
