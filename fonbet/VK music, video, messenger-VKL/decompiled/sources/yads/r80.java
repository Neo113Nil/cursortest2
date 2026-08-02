package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.g18;
import xsna.oqm0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;

/* loaded from: classes10.dex */
public final class r80 implements vht {
    public static final r80 a;
    public static final /* synthetic */ xfb0 b;

    static {
        r80 r80Var = new r80();
        a = r80Var;
        xfb0 xfb0Var = new xfb0("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelSdkData", r80Var, 3);
        xfb0Var.j("version", false);
        xfb0Var.j("is_integrated", false);
        xfb0Var.j("integration_messages", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{oqm0.a, g18.a, t80.d[2]};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = t80.d;
        String str = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = d.u(xfb0Var, 0);
                i |= 1;
            } else if (m == 1) {
                z2 = d.F(xfb0Var, 1);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                list = (List) d.y(xfb0Var, 2, kSerializerArr[2], list);
                i |= 4;
            }
        }
        d.e(xfb0Var);
        return new t80(i, str, z2, list);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        t80 t80Var = (t80) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = t80.d;
        d.m(xfb0Var, 0, t80Var.a);
        d.l(xfb0Var, 1, t80Var.b);
        d.n(xfb0Var, 2, kSerializerArr[2], t80Var.c);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
