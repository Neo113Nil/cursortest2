package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardButtonsDataDto.Button.$serializer", "Luxs;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardButtonsDataDto$Button;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardButtonsDataDto$Button;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardButtonsDataDto$Button;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class IntercityDashboardButtonsDataDto$Button$$serializer implements uxs {
    public static final IntercityDashboardButtonsDataDto$Button$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        IntercityDashboardButtonsDataDto$Button$$serializer intercityDashboardButtonsDataDto$Button$$serializer = new IntercityDashboardButtonsDataDto$Button$$serializer();
        INSTANCE = intercityDashboardButtonsDataDto$Button$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDataDto.Button", intercityDashboardButtonsDataDto$Button$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("is_auto_confirm_action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntercityDashboardButtonsDataDto$Button$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = IntercityDashboardButtonsDataDto$Button.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue(), qke.n(IntercityDashboardButtonsDataDto$ButtonAction$$serializer.INSTANCE), z96.a};
    }

    @Override // defpackage.myi
    public final IntercityDashboardButtonsDataDto$Button deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = IntercityDashboardButtonsDataDto$Button.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        IntercityDashboardButtonsDataDto$ButtonStyle intercityDashboardButtonsDataDto$ButtonStyle = null;
        IntercityDashboardButtonsDataDto$ButtonAction intercityDashboardButtonsDataDto$ButtonAction = null;
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
                intercityDashboardButtonsDataDto$ButtonStyle = (IntercityDashboardButtonsDataDto$ButtonStyle) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), intercityDashboardButtonsDataDto$ButtonStyle);
                i |= 4;
            } else if (v == 3) {
                intercityDashboardButtonsDataDto$ButtonAction = (IntercityDashboardButtonsDataDto$ButtonAction) b.s(serialDescriptor, 3, IntercityDashboardButtonsDataDto$ButtonAction$$serializer.INSTANCE, intercityDashboardButtonsDataDto$ButtonAction);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new IntercityDashboardButtonsDataDto$Button(i, str, str2, intercityDashboardButtonsDataDto$ButtonStyle, intercityDashboardButtonsDataDto$ButtonAction, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, IntercityDashboardButtonsDataDto$Button value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = IntercityDashboardButtonsDataDto$Button.f;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != IntercityDashboardButtonsDataDto$ButtonStyle.UNSUPPORTED) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, IntercityDashboardButtonsDataDto$ButtonAction$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
