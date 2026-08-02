package xsna;

import android.util.TypedValue;
import xsna.lrv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class me2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ me2(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [xsna.lrv0$a, xsna.uy5] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        final wh50 wh50Var = this.c;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                wh50Var.setValue(bool);
                break;
            case 1:
                ?? r3 = new lrv0.a() { // from class: xsna.uy5
                    @Override // xsna.lrv0.a
                    public final void xb() {
                        wh50 wh50Var2 = wh50.this;
                        TypedValue typedValue = krv0.a;
                        wh50Var2.setValue(Boolean.valueOf(epx.f(krv0.i(krv0.b != null ? dhr0.E() : null), Boolean.FALSE)));
                    }
                };
                TypedValue typedValue = krv0.a;
                krv0.a(r3);
                break;
            case 2:
                ((izs) wh50Var.getValue()).invoke((Throwable) obj);
                break;
            case 3:
                ((izs) wh50Var.getValue()).invoke((Throwable) obj);
                break;
            default:
                Integer num = (Integer) obj;
                num.intValue();
                wh50Var.setValue(num);
                break;
        }
        return s3q0.a;
    }
}
