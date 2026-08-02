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
public final class k80 implements vht {
    public static final k80 a;
    public static final /* synthetic */ xfb0 b;

    static {
        k80 k80Var = new k80();
        a = k80Var;
        xfb0 xfb0Var = new xfb0("com.yandex.mobile.ads.features.debugpanel.data.model.DebugPanelReportData", k80Var, 6);
        xfb0Var.j("app_data", false);
        xfb0Var.j("sdk_data", false);
        xfb0Var.j("adapters_data", false);
        xfb0Var.j("consents_data", false);
        xfb0Var.j("sdk_logs", false);
        xfb0Var.j("network_logs", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = m80.g;
        return new KSerializer[]{k50.a, r80.a, kSerializerArr[2], r50.a, kSerializerArr[4], kSerializerArr[5]};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = m80.g;
        int i = 0;
        m50 m50Var = null;
        t80 t80Var = null;
        List list = null;
        t50 t50Var = null;
        List list2 = null;
        List list3 = null;
        boolean z = true;
        while (z) {
            int m = d.m(xfb0Var);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    m50Var = (m50) d.y(xfb0Var, 0, k50.a, m50Var);
                    i |= 1;
                    break;
                case 1:
                    t80Var = (t80) d.y(xfb0Var, 1, r80.a, t80Var);
                    i |= 2;
                    break;
                case 2:
                    list = (List) d.y(xfb0Var, 2, kSerializerArr[2], list);
                    i |= 4;
                    break;
                case 3:
                    t50Var = (t50) d.y(xfb0Var, 3, r50.a, t50Var);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) d.y(xfb0Var, 4, kSerializerArr[4], list2);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) d.y(xfb0Var, 5, kSerializerArr[5], list3);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(xfb0Var);
        return new m80(i, m50Var, t80Var, list, t50Var, list2, list3);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        m80 m80Var = (m80) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = m80.g;
        d.n(xfb0Var, 0, k50.a, m80Var.a);
        d.n(xfb0Var, 1, r80.a, m80Var.b);
        d.n(xfb0Var, 2, kSerializerArr[2], m80Var.c);
        d.n(xfb0Var, 3, r50.a, m80Var.d);
        d.n(xfb0Var, 4, kSerializerArr[4], m80Var.e);
        d.n(xfb0Var, 5, kSerializerArr[5], m80Var.f);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
