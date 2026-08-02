package xsna;

import android.graphics.Typeface;
import xsna.oup0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ab2 implements zzs {
    public final /* synthetic */ bb2 b;

    public /* synthetic */ ab2(bb2 bb2Var) {
        this.b = bb2Var;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        bb2 bb2Var = this.b;
        oup0 a = bb2Var.e.a((v4s) obj, (b6s) obj2, ((u5s) obj3).a, ((v5s) obj4).a);
        if (a instanceof oup0.b) {
            return (Typeface) ((oup0.b) a).b;
        }
        ras rasVar = new ras(a, bb2Var.j);
        bb2Var.j = rasVar;
        return (Typeface) rasVar.b;
    }
}
