package xsna;

import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.presentation.a;
import com.vk.geo.impl.presentation.b;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: DefaultMapEventListener.kt */
/* loaded from: classes2.dex */
public final class cil implements gl00 {
    public static final /* synthetic */ qcy<Object>[] f;
    public final bpn0 a;
    public final bpn0 b;
    public final bil c = new bil(this);
    public final Object d;
    public final Object e;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(cil.class, "outsideListener", "getOutsideListener()Lcom/vk/geo/api/MapEventListener;", 0);
        fpf0.a.getClass();
        f = new qcy[]{mutablePropertyReference1Impl};
    }

    public cil(bpn0 bpn0Var, bpn0 bpn0Var2) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.d = msy.a(lazyThreadSafetyMode, new sx0(this, 28));
        this.e = msy.a(lazyThreadSafetyMode, new cfl(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gl00
    public final boolean b(String str) {
        gl00 value = this.c.getValue(this, f[0]);
        if (value != null && value.b(str)) {
            return false;
        }
        k2l k2lVar = (k2l) this.d.getValue();
        if (!k2lVar.b) {
            return true;
        }
        k2lVar.b = false;
        ((com.vk.geo.impl.presentation.b) this.a.getValue()).C(new a.c(str, false));
        s3q0 s3q0Var = s3q0.a;
        k2lVar.a.postDelayed(k2lVar.c, 300L);
        return true;
    }

    @Override // xsna.gl00
    public final boolean c(double d, double d2, double d3, double d4, float f2, double d5, double d6) {
        return d(xf9.e.i((float) d2, (float) d3, (float) d4, (float) d, Coordinate.b, f2, Float.NaN, -1));
    }

    public final boolean d(CameraBounds cameraBounds) {
        boolean z;
        double Z = cameraBounds.Z();
        double G = cameraBounds.G();
        double D = cameraBounds.D();
        double R = cameraBounds.R();
        float F0 = cameraBounds.F0();
        long C = cameraBounds.C();
        Math.max(cameraBounds.a0(), cameraBounds.F());
        gl00 value = this.c.getValue(this, f[0]);
        if (value != null) {
            double e = Coordinate.e(C);
            double f2 = Coordinate.f(C);
            z = true;
            if (value.c(G, Z, R, D, F0, e, f2)) {
                return false;
            }
        } else {
            z = true;
        }
        com.vk.geo.impl.presentation.b bVar = (com.vk.geo.impl.presentation.b) this.a.getValue();
        qcy<Object>[] qcyVarArr = com.vk.geo.impl.presentation.b.H;
        b.C1083b c1083b = bVar.G;
        c1083b.c = cameraBounds;
        com.vk.mvi.core.internal.executors.a.b(c1083b);
        return z;
    }

    @Override // xsna.gl00
    public final void a() {
    }
}
