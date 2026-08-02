package com.yandex.go.flex.common.api.actions;

import com.yandex.go.flex.common.api.actions.SummaryRedirectAction;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.rcx;
import defpackage.sjd;
import defpackage.tfr;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/flex/common/api/actions/SummaryRedirectAction.$serializer", "Luxs;", "Lcom/yandex/go/flex/common/api/actions/SummaryRedirectAction;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/flex/common/api/actions/SummaryRedirectAction;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/flex/common/api/actions/SummaryRedirectAction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class SummaryRedirectAction$$serializer implements uxs {
    public static final SummaryRedirectAction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SummaryRedirectAction$$serializer summaryRedirectAction$$serializer = new SummaryRedirectAction$$serializer();
        INSTANCE = summaryRedirectAction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("SummaryRedirectAction", summaryRedirectAction$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("class", true);
        pluginGeneratedSerialDescriptor.j("vertical", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("vertical_trap", true);
        pluginGeneratedSerialDescriptor.j("destination", true);
        pluginGeneratedSerialDescriptor.j("summary_context", true);
        pluginGeneratedSerialDescriptor.j("maybe_wait_for_routestats", true);
        pluginGeneratedSerialDescriptor.l(new tfr());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SummaryRedirectAction$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SummaryRedirectAction.i;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue(), z96Var, qke.n(SummaryRedirectAction$Destination$$serializer.INSTANCE), qke.n(rcx.a), z96Var};
    }

    @Override // defpackage.myi
    public final SummaryRedirectAction deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryRedirectAction.i;
        b.getClass();
        SummaryRedirectAction summaryRedirectAction = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        SummaryRedirectAction.State state = null;
        SummaryRedirectAction.Destination destination = null;
        kotlinx.serialization.json.b bVar = null;
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
                    state = (SummaryRedirectAction.State) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), state);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    destination = (SummaryRedirectAction.Destination) b.s(serialDescriptor, 4, SummaryRedirectAction$Destination$$serializer.INSTANCE, destination);
                    i |= 16;
                    break;
                case 5:
                    bVar = (kotlinx.serialization.json.b) b.s(serialDescriptor, 5, rcx.a, bVar);
                    i |= 32;
                    break;
                case 6:
                    z3 = b.C(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    ny61.c(v);
                    return summaryRedirectAction;
            }
            summaryRedirectAction = null;
        }
        b.c(serialDescriptor);
        return new SummaryRedirectAction(i, str, str2, state, z2, destination, bVar, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SummaryRedirectAction value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryRedirectAction.i;
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 0, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 1, value.c);
        }
        if (b.F() || value.d != SummaryRedirectAction.State.Collapsed) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.d);
        }
        if (b.F() || value.e) {
            b.n(serialDescriptor, 3, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 4, SummaryRedirectAction$Destination$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 5, rcx.a, value.g);
        }
        if (b.F() || value.h) {
            b.n(serialDescriptor, 6, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
