package yads;

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

/* loaded from: classes10.dex */
public final class e50 implements vht {
    public static final e50 a;
    public static final /* synthetic */ xfb0 b;

    static {
        e50 e50Var = new e50();
        a = e50Var;
        xfb0 xfb0Var = new xfb0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAlert", e50Var, 3);
        xfb0Var.j("title", true);
        xfb0Var.j("message", true);
        xfb0Var.j("type", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = (String) d.i(xfb0Var, 0, oqm0.a, str);
                i |= 1;
            } else if (m == 1) {
                str2 = (String) d.i(xfb0Var, 1, oqm0.a, str2);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                str3 = (String) d.i(xfb0Var, 2, oqm0.a, str3);
                i |= 4;
            }
        }
        d.e(xfb0Var);
        return new g50(i, str, str2, str3);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        g50 g50Var = (g50) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        if (d.z() || g50Var.a != null) {
            d.s(xfb0Var, 0, oqm0.a, g50Var.a);
        }
        if (d.z() || g50Var.b != null) {
            d.s(xfb0Var, 1, oqm0.a, g50Var.b);
        }
        if (d.z() || g50Var.c != null) {
            d.s(xfb0Var, 2, oqm0.a, g50Var.c);
        }
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
