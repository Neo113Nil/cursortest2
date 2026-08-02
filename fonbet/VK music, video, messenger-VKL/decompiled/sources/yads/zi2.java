package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.n9x;
import xsna.oqm0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes10.dex */
public final class zi2 implements vht {
    public static final zi2 a;
    public static final /* synthetic */ xfb0 b;

    static {
        zi2 zi2Var = new zi2();
        a = zi2Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResult", zi2Var, 3);
        xfb0Var.j("status", false);
        xfb0Var.j("error_message", false);
        xfb0Var.j("status_code", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bj2.d[0], xn8.a(oqm0.a), xn8.a(n9x.a)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = bj2.d;
        ej2 ej2Var = null;
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                ej2Var = (ej2) d.y(xfb0Var, 0, kSerializerArr[0], ej2Var);
                i |= 1;
            } else if (m == 1) {
                str = (String) d.i(xfb0Var, 1, oqm0.a, str);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                num = (Integer) d.i(xfb0Var, 2, n9x.a, num);
                i |= 4;
            }
        }
        d.e(xfb0Var);
        return new bj2(i, ej2Var, str, num);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        bj2 bj2Var = (bj2) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.n(xfb0Var, 0, bj2.d[0], bj2Var.a);
        d.s(xfb0Var, 1, oqm0.a, bj2Var.b);
        d.s(xfb0Var, 2, n9x.a, bj2Var.c);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
