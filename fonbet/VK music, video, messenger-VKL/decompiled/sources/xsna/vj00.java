package xsna;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: MapBridgeImpl.kt */
/* loaded from: classes.dex */
public final class vj00 implements uj00 {
    public final b5o a;

    public vj00(b5o b5oVar) {
        this.a = b5oVar;
    }

    @Override // xsna.uj00
    public final jar0 a(Bitmap bitmap) {
        return xx1.h(bitmap);
    }

    @Override // xsna.uj00
    public final sar0 b(edr0 edr0Var, float f, float f2, float f3) {
        return new sar0(edr0Var, f, f2, f3);
    }

    public final rdr0 c() {
        return new rdr0(0);
    }

    public final pdr0 d(Context context, xl00 xl00Var) {
        return new pdr0(context, xl00Var);
    }
}
