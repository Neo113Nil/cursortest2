package com.yandex.go.flex.common.api.actions;

import com.yandex.go.flex.common.api.actions.CityModeAction;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.rcx;
import defpackage.sjd;
import defpackage.tfr;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/flex/common/api/actions/CityModeAction.$serializer", "Luxs;", "Lcom/yandex/go/flex/common/api/actions/CityModeAction;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/flex/common/api/actions/CityModeAction;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/flex/common/api/actions/CityModeAction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class CityModeAction$$serializer implements uxs {
    public static final CityModeAction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CityModeAction$$serializer cityModeAction$$serializer = new CityModeAction$$serializer();
        INSTANCE = cityModeAction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CityModeAction", cityModeAction$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("screen_name", true);
        pluginGeneratedSerialDescriptor.j("layers_context", true);
        pluginGeneratedSerialDescriptor.j("context", true);
        pluginGeneratedSerialDescriptor.l(new tfr());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CityModeAction$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(rcx.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, n, CityModeAction$CityModeContext$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final CityModeAction deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        kotlinx.serialization.json.b bVar = null;
        CityModeAction.CityModeContext cityModeContext = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                bVar = (kotlinx.serialization.json.b) b.s(serialDescriptor, 2, rcx.a, bVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                cityModeContext = (CityModeAction.CityModeContext) b.A(serialDescriptor, 3, CityModeAction$CityModeContext$$serializer.INSTANCE, cityModeContext);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new CityModeAction(i, str, str2, bVar, cityModeContext);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CityModeAction value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        f fVar = CityModeAction.Companion;
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 0, value.b);
        }
        if (b.F() || !jl40.l(value.c, "city-mode")) {
            b.o(serialDescriptor, 1, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 2, rcx.a, value.d);
        }
        if (b.F() || !jl40.l(value.e, new CityModeAction.CityModeContext(0))) {
            b.e(serialDescriptor, 3, CityModeAction$CityModeContext$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
