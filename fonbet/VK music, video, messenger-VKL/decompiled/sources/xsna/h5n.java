package xsna;

import com.vk.stickers.settings.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5n implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h5n(Object obj, boolean z, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                f2c0<x960> f2c0Var = (f2c0) obj;
                try {
                    ((k5n) this.d).c0(this.c, (com.vk.lists.c) this.e, f2c0Var);
                    return s3q0.a;
                } catch (Exception e) {
                    x960 x960Var = f2c0Var.a;
                    awq b = x960Var.b();
                    if (b != null) {
                        b.j(e);
                    }
                    awq b2 = x960Var.b();
                    if (b2 != null) {
                        b2.h();
                    }
                    throw e;
                }
            default:
                u6l0 u6l0Var = (u6l0) this.d;
                v6l0 v6l0Var = (v6l0) this.e;
                u6l0Var.l.a.c.invoke(new b.n(this.c, v6l0Var.c.b.Ab()));
                return s3q0.a;
        }
    }
}
