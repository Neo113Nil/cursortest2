package com.vungle.ads.internal.model;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.fpf0;
import xsna.g18;
import xsna.jdz;
import xsna.oqm0;
import xsna.rfc;
import xsna.rpj;
import xsna.ssi;
import xsna.u500;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class c implements vht {
    public static final c a;
    public static final /* synthetic */ xfb0 b;

    static {
        c cVar = new c();
        a = cVar;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.AdPayload", cVar, 7);
        xfb0Var.j(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
        xfb0Var.j("config", true);
        xfb0Var.j("expiryWindowStart", true);
        xfb0Var.j("mraidFiles", true);
        xfb0Var.j("incentivizedTextSettings", true);
        xfb0Var.j("assetsFullyDownloaded", true);
        xfb0Var.j("indexFilePath", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer a2 = xn8.a(new yk3(q.a));
        KSerializer a3 = xn8.a(u1.a);
        KSerializer a4 = xn8.a(u500.a);
        rfc a5 = fpf0.a(ConcurrentHashMap.class);
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{a2, a3, a4, new rpj(a5, null, new KSerializer[]{oqm0Var, oqm0Var}), new jdz(oqm0Var, oqm0Var), g18.a, xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (z) {
            int m = d.m(xfb0Var);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    obj6 = d.i(xfb0Var, 0, new yk3(q.a), obj6);
                    i |= 1;
                    break;
                case 1:
                    obj5 = d.i(xfb0Var, 1, u1.a, obj5);
                    i |= 2;
                    break;
                case 2:
                    obj4 = d.i(xfb0Var, 2, u500.a, obj4);
                    i |= 4;
                    break;
                case 3:
                    rfc a2 = fpf0.a(ConcurrentHashMap.class);
                    oqm0 oqm0Var = oqm0.a;
                    obj3 = d.y(xfb0Var, 3, new rpj(a2, null, new KSerializer[]{oqm0Var, oqm0Var}), obj3);
                    i |= 8;
                    break;
                case 4:
                    oqm0 oqm0Var2 = oqm0.a;
                    obj2 = d.y(xfb0Var, 4, new jdz(oqm0Var2, oqm0Var2), obj2);
                    i |= 16;
                    break;
                case 5:
                    z2 = d.F(xfb0Var, 5);
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
        return new h0(i, (List) obj6, (v2) obj5, (Long) obj4, (ConcurrentHashMap) obj3, (Map) obj2, z2, (String) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        h0.a((h0) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
