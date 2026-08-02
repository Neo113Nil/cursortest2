package yads;

import java.util.List;
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

/* loaded from: classes10.dex */
public final class k40 implements vht {
    public static final k40 a;
    public static final /* synthetic */ xfb0 b;

    static {
        k40 k40Var = new k40();
        a = k40Var;
        xfb0 xfb0Var = new xfb0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitMediation", k40Var, 2);
        xfb0Var.j(com.ironsource.mediationsdk.d.h, false);
        xfb0Var.j("bidding", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = m40.c;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = m40.c;
        List list = null;
        boolean z = true;
        int i = 0;
        List list2 = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                list = (List) d.y(xfb0Var, 0, kSerializerArr[0], list);
                i |= 1;
            } else {
                if (m != 1) {
                    throw new UnknownFieldException(m);
                }
                list2 = (List) d.y(xfb0Var, 1, kSerializerArr[1], list2);
                i |= 2;
            }
        }
        d.e(xfb0Var);
        return new m40(i, list, list2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        m40 m40Var = (m40) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = m40.c;
        d.n(xfb0Var, 0, kSerializerArr[0], m40Var.a);
        d.n(xfb0Var, 1, kSerializerArr[1], m40Var.b);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
