package defpackage;

import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$LegalInfo$Item$Type;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class dod implements uxs {
    public static final dod a;
    private static final SerialDescriptor descriptor;

    static {
        dod dodVar = new dod();
        a = dodVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto.LegalInfo.Item", dodVar, 3);
        pluginGeneratedSerialDescriptor.j("key", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_DATA, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, jod.d[1].getValue(), fod.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = jod.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        CompositeOfferDto$LegalInfo$Item$Type compositeOfferDto$LegalInfo$Item$Type = null;
        hod hodVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                compositeOfferDto$LegalInfo$Item$Type = (CompositeOfferDto$LegalInfo$Item$Type) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), compositeOfferDto$LegalInfo$Item$Type);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                hodVar = (hod) b.A(serialDescriptor, 2, fod.a, hodVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new jod(i, str, compositeOfferDto$LegalInfo$Item$Type, hodVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jod jodVar = (jod) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = jod.d;
        b.o(serialDescriptor, 0, jodVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), jodVar.b);
        b.e(serialDescriptor, 2, fod.a, jodVar.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
