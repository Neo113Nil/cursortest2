package defpackage;

import just.adapter.snapping.IntervalType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class puw implements uxs {
    public static final puw a;
    private static final SerialDescriptor descriptor;

    static {
        puw puwVar = new puw();
        a = puwVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("just.adapter.snapping.Interval", puwVar, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("anchor", true);
        pluginGeneratedSerialDescriptor.j("absoluteOffset", true);
        pluginGeneratedSerialDescriptor.j("relativeOffset", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ruw.e[0].getValue(), qke.n(auu0.a), qke.n(h6w.a), qke.n(nor.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ruw.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        IntervalType intervalType = null;
        String str = null;
        Integer num = null;
        Float f = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                intervalType = (IntervalType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), intervalType);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                f = (Float) b.s(serialDescriptor, 3, nor.a, f);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ruw(i, intervalType, str, num, f);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ruw ruwVar = (ruw) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ruw.e;
        if (b.F() || ruwVar.a != IntervalType.RELATIVE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), ruwVar.a);
        }
        if (b.F() || ruwVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, ruwVar.b);
        }
        if (b.F() || ruwVar.c != null) {
            b.g(serialDescriptor, 2, h6w.a, ruwVar.c);
        }
        if (b.F() || ruwVar.d != null) {
            b.g(serialDescriptor, 3, nor.a, ruwVar.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
