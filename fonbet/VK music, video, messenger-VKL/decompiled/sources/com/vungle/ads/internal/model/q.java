package com.vungle.ads.internal.model;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.oqm0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class q implements vht {
    public static final q a;
    public static final /* synthetic */ xfb0 b;

    static {
        q qVar = new q();
        a = qVar;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", qVar, 3);
        xfb0Var.j("placement_reference_id", true);
        xfb0Var.j("ad_markup", true);
        xfb0Var.j("csb", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xn8.a(oqm0.a), xn8.a(g.a), xn8.a(j.a)};
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
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                obj3 = d.i(xfb0Var, 0, oqm0.a, obj3);
                i |= 1;
            } else if (m == 1) {
                obj2 = d.i(xfb0Var, 1, g.a, obj2);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                obj = d.i(xfb0Var, 2, j.a, obj);
                i |= 4;
            }
        }
        d.e(xfb0Var);
        return new s(i, (String) obj3, (i) obj2, (l) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        s.a((s) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
