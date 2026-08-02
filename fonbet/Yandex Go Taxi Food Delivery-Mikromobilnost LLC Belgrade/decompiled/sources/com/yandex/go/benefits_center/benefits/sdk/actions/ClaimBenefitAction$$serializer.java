package com.yandex.go.benefits_center.benefits.sdk.actions;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.kr;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/benefits_center/benefits/sdk/actions/ClaimBenefitAction.$serializer", "Luxs;", "Lcom/yandex/go/benefits_center/benefits/sdk/actions/ClaimBenefitAction;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/benefits_center/benefits/sdk/actions/ClaimBenefitAction;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/benefits_center/benefits/sdk/actions/ClaimBenefitAction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ClaimBenefitAction$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ClaimBenefitAction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ClaimBenefitAction$$serializer claimBenefitAction$$serializer = new ClaimBenefitAction$$serializer();
        INSTANCE = claimBenefitAction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.benefits_center.benefits.sdk.actions.ClaimBenefitAction", claimBenefitAction$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("admin_reward_id", true);
        pluginGeneratedSerialDescriptor.j("reward_id", true);
        pluginGeneratedSerialDescriptor.j("on_error_action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ClaimBenefitAction$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ClaimBenefitAction.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final ClaimBenefitAction deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ClaimBenefitAction.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        kr krVar = null;
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
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                krVar = (kr) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), krVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ClaimBenefitAction(i, str, str2, str3, krVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ClaimBenefitAction value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ClaimBenefitAction.f;
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 0, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 1, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 2, value.d);
        }
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
