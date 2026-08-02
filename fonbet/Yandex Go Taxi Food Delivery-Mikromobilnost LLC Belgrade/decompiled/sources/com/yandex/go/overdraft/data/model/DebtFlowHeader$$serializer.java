package com.yandex.go.overdraft.data.model;

import defpackage.auu0;
import defpackage.gef;
import defpackage.ief;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.u9x0;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/overdraft/data/model/DebtFlowHeader.$serializer", "Luxs;", "Lcom/yandex/go/overdraft/data/model/DebtFlowHeader;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/overdraft/data/model/DebtFlowHeader;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/overdraft/data/model/DebtFlowHeader;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class DebtFlowHeader$$serializer implements uxs {
    public static final DebtFlowHeader$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DebtFlowHeader$$serializer debtFlowHeader$$serializer = new DebtFlowHeader$$serializer();
        INSTANCE = debtFlowHeader$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.overdraft.data.model.DebtFlowHeader", debtFlowHeader$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("is_loading", true);
        pluginGeneratedSerialDescriptor.j("tap_action", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("loading_next_step_header", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DebtFlowHeader$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        DebtFlowHeaderText$$serializer debtFlowHeaderText$$serializer = DebtFlowHeaderText$$serializer.INSTANCE;
        return new KSerializer[]{debtFlowHeaderText$$serializer, qke.n(debtFlowHeaderText$$serializer), auu0.a, z96.a, u9x0.e, qke.n(gef.a), qke.n(LoadingNextStepHeader$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final DebtFlowHeader deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        DebtFlowHeaderText debtFlowHeaderText = null;
        DebtFlowHeaderText debtFlowHeaderText2 = null;
        String str = null;
        t0 t0Var = null;
        ief iefVar = null;
        LoadingNextStepHeader loadingNextStepHeader = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    debtFlowHeaderText = (DebtFlowHeaderText) b.A(serialDescriptor, 0, DebtFlowHeaderText$$serializer.INSTANCE, debtFlowHeaderText);
                    i |= 1;
                    break;
                case 1:
                    debtFlowHeaderText2 = (DebtFlowHeaderText) b.s(serialDescriptor, 1, DebtFlowHeaderText$$serializer.INSTANCE, debtFlowHeaderText2);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    t0Var = (t0) b.A(serialDescriptor, 4, u9x0.e, t0Var);
                    i |= 16;
                    break;
                case 5:
                    iefVar = (ief) b.s(serialDescriptor, 5, gef.a, iefVar);
                    i |= 32;
                    break;
                case 6:
                    loadingNextStepHeader = (LoadingNextStepHeader) b.s(serialDescriptor, 6, LoadingNextStepHeader$$serializer.INSTANCE, loadingNextStepHeader);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new DebtFlowHeader(i, debtFlowHeaderText, debtFlowHeaderText2, str, z2, t0Var, iefVar, loadingNextStepHeader);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.overdraft.data.model.DebtFlowHeaderText.c) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, DebtFlowHeader value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (!b.F()) {
            DebtFlowHeaderText debtFlowHeaderText = value.a;
            DebtFlowHeaderText.Companion.getClass();
        }
        b.e(serialDescriptor, 0, DebtFlowHeaderText$$serializer.INSTANCE, value.a);
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, DebtFlowHeaderText$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, s0.INSTANCE)) {
            b.e(serialDescriptor, 4, u9x0.e, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, gef.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, LoadingNextStepHeader$$serializer.INSTANCE, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
