package com.yandex.go.overdraft.data.model;

import defpackage.dp3;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/overdraft/data/model/DebtFlow.$serializer", "Luxs;", "Lcom/yandex/go/overdraft/data/model/DebtFlow;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/overdraft/data/model/DebtFlow;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/overdraft/data/model/DebtFlow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class DebtFlow$$serializer implements uxs {
    public static final DebtFlow$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DebtFlow$$serializer debtFlow$$serializer = new DebtFlow$$serializer();
        INSTANCE = debtFlow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.overdraft.data.model.DebtFlow", debtFlow$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("auto_action", true);
        pluginGeneratedSerialDescriptor.j("notification", true);
        pluginGeneratedSerialDescriptor.j("top_notifications", true);
        pluginGeneratedSerialDescriptor.j("debt_info", true);
        pluginGeneratedSerialDescriptor.j("cvv_info", true);
        pluginGeneratedSerialDescriptor.j("overdraft", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DebtFlow$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(DebtFlowHeader$$serializer.INSTANCE), dp3.e, qke.n(DebtFlowNotification$$serializer.INSTANCE), DebtFlow.h[3].getValue(), qke.n(DebtInfo$$serializer.INSTANCE), qke.n(CvvInfo$$serializer.INSTANCE), OverdraftDto$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final DebtFlow deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DebtFlow.h;
        b.getClass();
        DebtFlow debtFlow = null;
        boolean z = true;
        int i = 0;
        DebtFlowHeader debtFlowHeader = null;
        e eVar = null;
        DebtFlowNotification debtFlowNotification = null;
        List list = null;
        DebtInfo debtInfo = null;
        CvvInfo cvvInfo = null;
        OverdraftDto overdraftDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    debtFlowHeader = (DebtFlowHeader) b.s(serialDescriptor, 0, DebtFlowHeader$$serializer.INSTANCE, debtFlowHeader);
                    i |= 1;
                    break;
                case 1:
                    eVar = (e) b.A(serialDescriptor, 1, dp3.e, eVar);
                    i |= 2;
                    break;
                case 2:
                    debtFlowNotification = (DebtFlowNotification) b.s(serialDescriptor, 2, DebtFlowNotification$$serializer.INSTANCE, debtFlowNotification);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    debtInfo = (DebtInfo) b.s(serialDescriptor, 4, DebtInfo$$serializer.INSTANCE, debtInfo);
                    i |= 16;
                    break;
                case 5:
                    cvvInfo = (CvvInfo) b.s(serialDescriptor, 5, CvvInfo$$serializer.INSTANCE, cvvInfo);
                    i |= 32;
                    break;
                case 6:
                    overdraftDto = (OverdraftDto) b.A(serialDescriptor, 6, OverdraftDto$$serializer.INSTANCE, overdraftDto);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return debtFlow;
            }
            debtFlow = null;
        }
        b.c(serialDescriptor);
        return new DebtFlow(i, debtFlowHeader, eVar, debtFlowNotification, list, debtInfo, cvvInfo, overdraftDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.overdraft.data.model.OverdraftDto.b) == false) goto L43;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, DebtFlow value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DebtFlow.h;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, DebtFlowHeader$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, d.INSTANCE)) {
            b.e(serialDescriptor, 1, dp3.e, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, DebtFlowNotification$$serializer.INSTANCE, value.c);
        }
        if (b.F() || !jl40.l(value.d, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, DebtInfo$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, CvvInfo$$serializer.INSTANCE, value.f);
        }
        if (!b.F()) {
            OverdraftDto overdraftDto = value.g;
            OverdraftDto.Companion.getClass();
        }
        b.e(serialDescriptor, 6, OverdraftDto$$serializer.INSTANCE, value.g);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
