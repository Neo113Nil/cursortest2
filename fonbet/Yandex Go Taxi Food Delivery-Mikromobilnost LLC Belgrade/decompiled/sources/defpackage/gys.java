package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import flex.animation.player.interpolator.InterpolationType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class gys implements uxs {
    public static final gys a;
    private static final SerialDescriptor descriptor;

    static {
        gys gysVar = new gys();
        a = gysVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.animation.generic.parser.GenericAnimationParser.GenericAnimationSurrogate", gysVar, 7);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("duration", false);
        pluginGeneratedSerialDescriptor.j("delay", true);
        pluginGeneratedSerialDescriptor.j("interpolator", true);
        pluginGeneratedSerialDescriptor.j(CaretView.ALPHA_PROPERTY, true);
        pluginGeneratedSerialDescriptor.j("transform", true);
        pluginGeneratedSerialDescriptor.j("onComplete", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = iys.h;
        e6m e6mVar = e6m.a;
        return new KSerializer[]{auu0.a, e6mVar, qke.n(e6mVar), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(ju1.a), qke.n(ew01.a), qke.n((KSerializer) i3yVarArr[6].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = iys.h;
        b.getClass();
        Object obj = null;
        tg2 tg2Var = null;
        String str = null;
        Double d = null;
        InterpolationType interpolationType = null;
        lu1 lu1Var = null;
        double d2 = 0.0d;
        int i = 0;
        boolean z = true;
        gw01 gw01Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    d2 = b.E(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) b.s(serialDescriptor, 2, e6m.a, d);
                    i |= 4;
                    break;
                case 3:
                    interpolationType = (InterpolationType) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), interpolationType);
                    i |= 8;
                    break;
                case 4:
                    lu1Var = (lu1) b.s(serialDescriptor, 4, ju1.a, lu1Var);
                    i |= 16;
                    break;
                case 5:
                    gw01Var = (gw01) b.s(serialDescriptor, 5, ew01.a, gw01Var);
                    i |= 32;
                    break;
                case 6:
                    tg2Var = (tg2) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), tg2Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new iys(i, str, d2, d, interpolationType, lu1Var, gw01Var, tg2Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        iys iysVar = (iys) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = iys.h;
        String str = iysVar.a;
        tg2 tg2Var = iysVar.g;
        gw01 gw01Var = iysVar.f;
        lu1 lu1Var = iysVar.e;
        InterpolationType interpolationType = iysVar.d;
        Double d = iysVar.c;
        b.o(serialDescriptor, 0, str);
        b.E(serialDescriptor, 1, iysVar.b);
        if (b.F() || d != null) {
            b.g(serialDescriptor, 2, e6m.a, d);
        }
        if (b.F() || interpolationType != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), interpolationType);
        }
        if (b.F() || lu1Var != null) {
            b.g(serialDescriptor, 4, ju1.a, lu1Var);
        }
        if (b.F() || gw01Var != null) {
            b.g(serialDescriptor, 5, ew01.a, gw01Var);
        }
        if (b.F() || tg2Var != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), tg2Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
