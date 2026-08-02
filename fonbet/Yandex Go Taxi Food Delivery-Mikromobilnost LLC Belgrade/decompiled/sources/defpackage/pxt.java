package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class pxt implements uxs {
    public static final pxt a;
    private static final SerialDescriptor descriptor;

    static {
        pxt pxtVar = new pxt();
        a = pxtVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.GradientComponentContent.GradientLineItem.TextItem", pxtVar, 4);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("font_size", true);
        pluginGeneratedSerialDescriptor.j(FontsContractCompat$Columns.WEIGHT, true);
        pluginGeneratedSerialDescriptor.j("color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{cm2.a, e6m.a, rxt.e[2].getValue(), auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = rxt.e;
        b.getClass();
        int i = 0;
        Object obj = null;
        FormattedText.FontWeight fontWeight = null;
        String str = null;
        double d = 0.0d;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                obj = b.A(serialDescriptor, 0, cm2.a, obj);
                i |= 1;
            } else if (v == 1) {
                d = b.E(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                fontWeight = (FormattedText.FontWeight) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), fontWeight);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new rxt(i, obj, d, fontWeight, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rxt rxtVar = (rxt) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = rxt.e;
        if (b.F() || !jl40.l(rxtVar.a, "")) {
            b.e(serialDescriptor, 0, cm2.a, rxtVar.a);
        }
        if (b.F() || Double.compare(rxtVar.b, 13.0d) != 0) {
            b.E(serialDescriptor, 1, rxtVar.b);
        }
        if (b.F() || rxtVar.c != FormattedText.FontWeight.REGULAR) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), rxtVar.c);
        }
        if (b.F() || !jl40.l(rxtVar.d, "")) {
            b.o(serialDescriptor, 3, rxtVar.d);
        }
        b.c(serialDescriptor);
    }
}
