package com.vungle.ads.internal.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.g18;
import xsna.n9x;
import xsna.oqm0;
import xsna.ssi;
import xsna.v6o;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class a1 implements vht {
    public static final a1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        a1 a1Var = new a1();
        a = a1Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.CommonRequestBody.CSBParam", a1Var, 7);
        xfb0Var.j("bidfloor", false);
        xfb0Var.j("phase", false);
        xfb0Var.j("is_vx_winner", false);
        xfb0Var.j("parent_auction_id", false);
        xfb0Var.j(CampaignEx.JSON_KEY_CREATIVE_ID, false);
        xfb0Var.j("ad_unit_id", false);
        xfb0Var.j("ext", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{v6o.a, n9x.a, g18.a, oqm0Var, oqm0Var, oqm0Var, xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        Object obj = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        double d2 = 0.0d;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z2 = true;
        while (z2) {
            int m = d.m(xfb0Var);
            switch (m) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    d2 = d.o(xfb0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = d.s(xfb0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    z = d.F(xfb0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str = d.u(xfb0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = d.u(xfb0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = d.u(xfb0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    obj = d.i(xfb0Var, 6, oqm0.a, obj);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(xfb0Var);
        return new c1(i, d2, i2, z, str, str2, str3, (String) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        c1.a((c1) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
