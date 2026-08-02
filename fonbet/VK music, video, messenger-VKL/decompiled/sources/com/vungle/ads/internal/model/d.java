package com.vungle.ads.internal.model;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ru.ok.android.utils.Logger;
import xsna.cti;
import xsna.n9x;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class d implements vht {
    public static final d a;
    public static final /* synthetic */ xfb0 b;

    static {
        d dVar = new d();
        a = dVar;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.AdPayload.AdSizeInfo", dVar, 2);
        xfb0Var.j(Logger.METHOD_W, true);
        xfb0Var.j("h", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        n9x n9xVar = n9x.a;
        return new KSerializer[]{xn8.a(n9xVar), xn8.a(n9xVar)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Object obj2 = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                obj2 = d.i(xfb0Var, 0, n9x.a, obj2);
                i |= 1;
            } else {
                if (m != 1) {
                    throw new UnknownFieldException(m);
                }
                obj = d.i(xfb0Var, 1, n9x.a, obj);
                i |= 2;
            }
        }
        d.e(xfb0Var);
        return new f(i, (Integer) obj2, (Integer) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        f.a((f) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
