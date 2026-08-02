package com.yandex.go.eboks.objects.data.model;

import defpackage.auu0;
import defpackage.dor;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/eboks/objects/data/model/EboksTypeOverlay.$serializer", "Luxs;", "Lcom/yandex/go/eboks/objects/data/model/EboksTypeOverlay;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/eboks/objects/data/model/EboksTypeOverlay;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/eboks/objects/data/model/EboksTypeOverlay;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class EboksTypeOverlay$$serializer implements uxs {
    public static final EboksTypeOverlay$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EboksTypeOverlay$$serializer eboksTypeOverlay$$serializer = new EboksTypeOverlay$$serializer();
        INSTANCE = eboksTypeOverlay$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.eboks.objects.data.model.EboksTypeOverlay", eboksTypeOverlay$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("anchor", true);
        pluginGeneratedSerialDescriptor.j("selected_anchor", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("selected_color", true);
        pluginGeneratedSerialDescriptor.j("attributed_text", true);
        pluginGeneratedSerialDescriptor.j("selected_attributed_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EboksTypeOverlay$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        dor dorVar = dor.c;
        KSerializer n = qke.n(dorVar);
        KSerializer n2 = qke.n(dorVar);
        auu0 auu0Var = auu0.a;
        KSerializer n3 = qke.n(auu0Var);
        KSerializer n4 = qke.n(auu0Var);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{n, n2, n3, n4, qke.n(w7sVar), qke.n(w7sVar)};
    }

    @Override // defpackage.myi
    public final EboksTypeOverlay deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        float[] fArr = null;
        float[] fArr2 = null;
        String str = null;
        String str2 = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    fArr = (float[]) b.s(serialDescriptor, 0, dor.c, fArr);
                    i |= 1;
                    break;
                case 1:
                    fArr2 = (float[]) b.s(serialDescriptor, 1, dor.c, fArr2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    formattedText = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText);
                    i |= 16;
                    break;
                case 5:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 5, w7s.a, formattedText2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new EboksTypeOverlay(i, fArr, fArr2, str, str2, formattedText, formattedText2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EboksTypeOverlay value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, dor.c, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, dor.c, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, w7s.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, w7s.a, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
