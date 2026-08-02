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
public final class ci2 implements vht {
    public static final ci2 a;
    public static final /* synthetic */ xfb0 b;

    static {
        ci2 ci2Var = new ci2();
        a = ci2Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationData", ci2Var, 1);
        xfb0Var.j("prefetched_mediation_data", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ei2.b[0]};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = ei2.b;
        List list = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else {
                if (m != 0) {
                    throw new UnknownFieldException(m);
                }
                list = (List) d.y(xfb0Var, 0, kSerializerArr[0], list);
                i = 1;
            }
        }
        d.e(xfb0Var);
        return new ei2(i, list);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.n(xfb0Var, 0, ei2.b[0], ((ei2) obj).a);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
