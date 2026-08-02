package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cti;
import xsna.ssi;
import xsna.v6o;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;

/* loaded from: classes10.dex */
public final class fj2 implements vht {
    public static final fj2 a;
    public static final /* synthetic */ xfb0 b;

    static {
        fj2 fj2Var = new fj2();
        a = fj2Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationRevenue", fj2Var, 1);
        xfb0Var.j("value", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v6o.a};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
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
                d2 = d.o(xfb0Var, 0);
                i = 1;
            }
        }
        d.e(xfb0Var);
        return new hj2(i, d2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.Q(xfb0Var, 0, ((hj2) obj).a);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
