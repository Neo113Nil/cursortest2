package com.yandex.go.eboks.objects.experiments;

import com.yandex.go.eboks.objects.experiments.EboksObjectsParamsExperiment;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/eboks/objects/experiments/EboksObjectsParamsExperiment.Params.$serializer", "Luxs;", "Lcom/yandex/go/eboks/objects/experiments/EboksObjectsParamsExperiment$Params;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/eboks/objects/experiments/EboksObjectsParamsExperiment$Params;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/eboks/objects/experiments/EboksObjectsParamsExperiment$Params;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class EboksObjectsParamsExperiment$Params$$serializer implements uxs {
    public static final EboksObjectsParamsExperiment$Params$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EboksObjectsParamsExperiment$Params$$serializer eboksObjectsParamsExperiment$Params$$serializer = new EboksObjectsParamsExperiment$Params$$serializer();
        INSTANCE = eboksObjectsParamsExperiment$Params$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.eboks.objects.experiments.EboksObjectsParamsExperiment.Params", eboksObjectsParamsExperiment$Params$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, true);
        pluginGeneratedSerialDescriptor.j("bbox_diff", true);
        pluginGeneratedSerialDescriptor.j("throttle_duration_ms", true);
        pluginGeneratedSerialDescriptor.j("thinning", true);
        pluginGeneratedSerialDescriptor.j("rowan_thinning", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EboksObjectsParamsExperiment$Params$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = EboksObjectsParamsExperiment.Params.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, nor.a, pnz.a, qke.n(EboksObjectsParamsExperiment$Thinning$$serializer.INSTANCE), i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final EboksObjectsParamsExperiment.Params deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = EboksObjectsParamsExperiment.Params.g;
        b.getClass();
        EboksObjectsParamsExperiment.Params params = null;
        int i = 0;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        long j = 0;
        boolean z = true;
        EboksObjectsParamsExperiment.Thinning thinning = null;
        List list = null;
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
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    f = b.y(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    j = b.f(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    thinning = (EboksObjectsParamsExperiment.Thinning) b.s(serialDescriptor, 4, EboksObjectsParamsExperiment$Thinning$$serializer.INSTANCE, thinning);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return params;
            }
            params = null;
        }
        b.c(serialDescriptor);
        return new EboksObjectsParamsExperiment.Params(i, str, str2, f, j, thinning, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EboksObjectsParamsExperiment.Params value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = EboksObjectsParamsExperiment.Params.g;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || Float.compare(value.c, 0.2f) != 0) {
            b.z(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != 100) {
            b.s(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, EboksObjectsParamsExperiment$Thinning$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !jl40.l(value.f, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
