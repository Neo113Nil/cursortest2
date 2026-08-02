package yads;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.cti;
import xsna.epx;
import xsna.ssi;
import xsna.u500;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;

/* loaded from: classes10.dex */
public final class et1 implements vht {
    public static final et1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        et1 et1Var = new et1();
        a = et1Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchSettings", et1Var, 2);
        xfb0Var.j("load_timeout_millis", true);
        xfb0Var.j("mediation_prefetch_ad_units", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u500.a, ht1.d[1]};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = ht1.d;
        long j = 0;
        List list = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                j = d.r(xfb0Var, 0);
                i |= 1;
            } else {
                if (m != 1) {
                    throw new UnknownFieldException(m);
                }
                list = (List) d.y(xfb0Var, 1, kSerializerArr[1], list);
                i |= 2;
            }
        }
        d.e(xfb0Var);
        return new ht1(i, j, list);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        ht1 ht1Var = (ht1) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = ht1.d;
        if (d.z() || ht1Var.b != ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
            d.q(xfb0Var, 0, ht1Var.b);
        }
        if (d.z() || !epx.f(ht1Var.c, EmptyList.b)) {
            d.n(xfb0Var, 1, kSerializerArr[1], ht1Var.c);
        }
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
