package yads;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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

/* loaded from: classes10.dex */
public final class cx0 implements vht {
    public static final cx0 a;
    public static final /* synthetic */ xfb0 b;

    static {
        cx0 cx0Var = new cx0();
        a = cx0Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.base.model.fonts.FontUrls", cx0Var, 4);
        xfb0Var.j("regular", false);
        xfb0Var.j(TtmlNode.BOLD, false);
        xfb0Var.j("light", false);
        xfb0Var.j("medium", false);
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
        return new ex0(i, str, str2, str3, str4);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        ex0 ex0Var = (ex0) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.m(xfb0Var, 0, ex0Var.a);
        d.m(xfb0Var, 1, ex0Var.b);
        d.m(xfb0Var, 2, ex0Var.c);
        d.m(xfb0Var, 3, ex0Var.d);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
