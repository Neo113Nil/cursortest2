package com.yandex.go.payments.shared.business.accountcreation.corp.experiment;

import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.$serializer", "Luxs;", "Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CorpCreationNavigatorModalDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CorpCreationNavigatorModalDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CorpCreationNavigatorModalDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$$serializer corpAccountFlowExperiment$CorpCreationNavigatorModalDto$$serializer = new CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$$serializer();
        INSTANCE = corpAccountFlowExperiment$CorpCreationNavigatorModalDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment.CorpCreationNavigatorModalDto", corpAccountFlowExperiment$CorpCreationNavigatorModalDto$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("image_key", true);
        pluginGeneratedSerialDescriptor.j("title_key", true);
        pluginGeneratedSerialDescriptor.j("text_key", true);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        pluginGeneratedSerialDescriptor.j("employee_access_info_modal", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[3].getValue(), qke.n(CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$EmployeeAccessInfoModalDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final CorpAccountFlowExperiment.CorpCreationNavigatorModalDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.EmployeeAccessInfoModalDto employeeAccessInfoModalDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                employeeAccessInfoModalDto = (CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.EmployeeAccessInfoModalDto) b.s(serialDescriptor, 4, CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$EmployeeAccessInfoModalDto$$serializer.INSTANCE, employeeAccessInfoModalDto);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new CorpAccountFlowExperiment.CorpCreationNavigatorModalDto(i, str, str2, str3, list, employeeAccessInfoModalDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CorpAccountFlowExperiment.CorpCreationNavigatorModalDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.f;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$EmployeeAccessInfoModalDto$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
