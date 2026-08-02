package com.vungle.ads.internal.model;

import com.mbridge.msdk.MBridgeConstans;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class q0 implements vht {
    public static final q0 a;
    public static final /* synthetic */ xfb0 b;

    static {
        q0 q0Var = new q0();
        a = q0Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.CommonRequestBody", q0Var, 5);
        xfb0Var.j("device", false);
        xfb0Var.j(MBridgeConstans.DYNAMIC_VIEW_WX_APP, true);
        xfb0Var.j("user", true);
        xfb0Var.j("ext", true);
        xfb0Var.j("request", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w2.a, xn8.a(j0.a), xn8.a(q1.a), xn8.a(k1.a), xn8.a(n1.a)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                obj5 = d.y(xfb0Var, 0, w2.a, obj5);
                i |= 1;
            } else if (m == 1) {
                obj4 = d.i(xfb0Var, 1, j0.a, obj4);
                i |= 2;
            } else if (m == 2) {
                obj3 = d.i(xfb0Var, 2, q1.a, obj3);
                i |= 4;
            } else if (m == 3) {
                obj2 = d.i(xfb0Var, 3, k1.a, obj2);
                i |= 8;
            } else {
                if (m != 4) {
                    throw new UnknownFieldException(m);
                }
                obj = d.i(xfb0Var, 4, n1.a, obj);
                i |= 16;
            }
        }
        d.e(xfb0Var);
        return new t1(i, (b3) obj5, (l0) obj4, (s1) obj3, (m1) obj2, (p1) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        t1.a((t1) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
