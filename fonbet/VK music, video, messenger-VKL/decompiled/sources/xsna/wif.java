package xsna;

import xsna.awg0;
import xsna.hg1;
import xsna.k840;
import xsna.yaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wif implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wif(int i, el50 el50Var) {
        this.b = 2;
        this.c = i;
        this.d = el50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((izs) this.d).invoke(new yaf.b.h(this.c));
                return s3q0.a;
            case 1:
                ((hpm) this.d).b.b().execSQL("UPDATE dialogs SET flags = ? WHERE id = ?", new Object[]{Integer.valueOf(this.c), Long.valueOf(((com.vk.im.engine.models.dialogs.b) obj).b)});
                return s3q0.a;
            default:
                el50 el50Var = (el50) this.d;
                awg0 awg0Var = (awg0) obj;
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var == null) {
                    r5v0Var = null;
                }
                return awg0.a.b(awg0Var, new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(r5v0Var.a.a, new hg1.u2()).U(new hg1.t2()), new o40(new onm(this.c, 2), 26)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), null, null, new wmz(el50Var, 13), 3);
        }
    }

    public /* synthetic */ wif(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
