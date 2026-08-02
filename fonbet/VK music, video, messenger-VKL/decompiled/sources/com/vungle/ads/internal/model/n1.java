package com.vungle.ads.internal.model;

import com.ironsource.C4497pd;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.oqm0;
import xsna.ssi;
import xsna.u500;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class n1 implements vht {
    public static final n1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        n1 n1Var = new n1();
        a = n1Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", n1Var, 7);
        xfb0Var.j(C4497pd.c, true);
        xfb0Var.j("ad_size", true);
        xfb0Var.j("ad_start_time", true);
        xfb0Var.j("app_id", true);
        xfb0Var.j("placement_reference_id", true);
        xfb0Var.j("user", true);
        xfb0Var.j("csb", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{xn8.a(new yk3(oqm0Var)), xn8.a(r0.a), xn8.a(u500.a), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(a1.a)};
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
        Object obj6 = null;
        Object obj7 = null;
        while (z) {
            int m = d.m(xfb0Var);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    obj7 = d.i(xfb0Var, 0, new yk3(oqm0.a), obj7);
                    i |= 1;
                    break;
                case 1:
                    obj6 = d.i(xfb0Var, 1, r0.a, obj6);
                    i |= 2;
                    break;
                case 2:
                    obj5 = d.i(xfb0Var, 2, u500.a, obj5);
                    i |= 4;
                    break;
                case 3:
                    obj4 = d.i(xfb0Var, 3, oqm0.a, obj4);
                    i |= 8;
                    break;
                case 4:
                    obj3 = d.i(xfb0Var, 4, oqm0.a, obj3);
                    i |= 16;
                    break;
                case 5:
                    obj2 = d.i(xfb0Var, 5, oqm0.a, obj2);
                    i |= 32;
                    break;
                case 6:
                    obj = d.i(xfb0Var, 6, a1.a, obj);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(xfb0Var);
        return new p1(i, (List) obj7, (t0) obj6, (Long) obj5, (String) obj4, (String) obj3, (String) obj2, (c1) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        p1.a((p1) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
