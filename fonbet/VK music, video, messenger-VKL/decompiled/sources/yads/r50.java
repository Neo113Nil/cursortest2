package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.g18;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes10.dex */
public final class r50 implements vht {
    public static final r50 a;
    public static final /* synthetic */ xfb0 b;

    static {
        r50 r50Var = new r50();
        a = r50Var;
        xfb0 xfb0Var = new xfb0("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelConsentsData", r50Var, 4);
        xfb0Var.j("has_location_consent", false);
        xfb0Var.j("age_restricted_user", false);
        xfb0Var.j("has_user_consent", false);
        xfb0Var.j("has_cmp_value", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        g18 g18Var = g18.a;
        return new KSerializer[]{g18Var, xn8.a(g18Var), xn8.a(g18Var), g18Var};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        Boolean bool = null;
        Boolean bool2 = null;
        boolean z3 = true;
        while (z3) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z3 = false;
            } else if (m == 0) {
                z = d.F(xfb0Var, 0);
                i |= 1;
            } else if (m == 1) {
                bool = (Boolean) d.i(xfb0Var, 1, g18.a, bool);
                i |= 2;
            } else if (m == 2) {
                bool2 = (Boolean) d.i(xfb0Var, 2, g18.a, bool2);
                i |= 4;
            } else {
                if (m != 3) {
                    throw new UnknownFieldException(m);
                }
                z2 = d.F(xfb0Var, 3);
                i |= 8;
            }
        }
        d.e(xfb0Var);
        return new t50(i, z, bool, bool2, z2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        t50 t50Var = (t50) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.l(xfb0Var, 0, t50Var.a);
        g18 g18Var = g18.a;
        d.s(xfb0Var, 1, g18Var, t50Var.b);
        d.s(xfb0Var, 2, g18Var, t50Var.c);
        d.l(xfb0Var, 3, t50Var.d);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
