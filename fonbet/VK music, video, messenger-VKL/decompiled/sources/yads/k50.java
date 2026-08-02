package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import xsna.cti;
import xsna.oqm0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;

/* loaded from: classes10.dex */
public final class k50 implements vht {
    public static final k50 a;
    public static final /* synthetic */ xfb0 b;

    static {
        k50 k50Var = new k50();
        a = k50Var;
        xfb0 xfb0Var = new xfb0("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelAppData", k50Var, 4);
        xfb0Var.j("app_id", false);
        xfb0Var.j(CallAnalyticsApiRequest.KEY_APP_VERSION, false);
        xfb0Var.j("system", false);
        xfb0Var.j("api_level", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, oqm0Var, oqm0Var, oqm0Var};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = d.u(xfb0Var, 0);
                i |= 1;
            } else if (m == 1) {
                str2 = d.u(xfb0Var, 1);
                i |= 2;
            } else if (m == 2) {
                str3 = d.u(xfb0Var, 2);
                i |= 4;
            } else {
                if (m != 3) {
                    throw new UnknownFieldException(m);
                }
                str4 = d.u(xfb0Var, 3);
                i |= 8;
            }
        }
        d.e(xfb0Var);
        return new m50(i, str, str2, str3, str4);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        m50 m50Var = (m50) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.m(xfb0Var, 0, m50Var.a);
        d.m(xfb0Var, 1, m50Var.b);
        d.m(xfb0Var, 2, m50Var.c);
        d.m(xfb0Var, 3, m50Var.d);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
