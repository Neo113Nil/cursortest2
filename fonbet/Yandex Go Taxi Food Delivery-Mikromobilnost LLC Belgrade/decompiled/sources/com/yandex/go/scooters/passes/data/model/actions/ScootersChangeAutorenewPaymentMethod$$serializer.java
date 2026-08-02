package com.yandex.go.scooters.passes.data.model.actions;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.kr;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/passes/data/model/actions/ScootersChangeAutorenewPaymentMethod.$serializer", "Luxs;", "Lcom/yandex/go/scooters/passes/data/model/actions/ScootersChangeAutorenewPaymentMethod;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/passes/data/model/actions/ScootersChangeAutorenewPaymentMethod;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/passes/data/model/actions/ScootersChangeAutorenewPaymentMethod;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersChangeAutorenewPaymentMethod$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ScootersChangeAutorenewPaymentMethod$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersChangeAutorenewPaymentMethod$$serializer scootersChangeAutorenewPaymentMethod$$serializer = new ScootersChangeAutorenewPaymentMethod$$serializer();
        INSTANCE = scootersChangeAutorenewPaymentMethod$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.passes.data.model.actions.ScootersChangeAutorenewPaymentMethod", scootersChangeAutorenewPaymentMethod$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("pass_id", false);
        pluginGeneratedSerialDescriptor.j("on_success", false);
        pluginGeneratedSerialDescriptor.j("on_failure", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersChangeAutorenewPaymentMethod$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersChangeAutorenewPaymentMethod.d;
        return new KSerializer[]{auu0.a, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final ScootersChangeAutorenewPaymentMethod deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersChangeAutorenewPaymentMethod.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        kr krVar = null;
        kr krVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                krVar = (kr) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), krVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                krVar2 = (kr) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), krVar2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ScootersChangeAutorenewPaymentMethod(i, str, krVar, krVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersChangeAutorenewPaymentMethod value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersChangeAutorenewPaymentMethod.d;
        b.o(serialDescriptor, 0, value.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
