package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zf80 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ zf80(Object obj, Object obj2, Object obj3, izs izsVar, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                mc90 mc90Var = (mc90) this.e;
                mc90 mc90Var2 = (mc90) this.f;
                hh80 hh80Var = (hh80) this.g;
                ((Integer) obj2).intValue();
                cg80.e(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, this.c, hh80Var, mc90Var, mc90Var2);
                break;
            default:
                ((Integer) obj2).getClass();
                ((wab0) this.e).j((i9b0) this.f, (List) this.g, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }
}
