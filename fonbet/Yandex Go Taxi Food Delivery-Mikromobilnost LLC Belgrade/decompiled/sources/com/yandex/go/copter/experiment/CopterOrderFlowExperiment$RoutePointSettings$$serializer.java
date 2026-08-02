package com.yandex.go.copter.experiment;

import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/copter/experiment/CopterOrderFlowExperiment.RoutePointSettings.$serializer", "Luxs;", "Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment$RoutePointSettings;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment$RoutePointSettings;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment$RoutePointSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class CopterOrderFlowExperiment$RoutePointSettings$$serializer implements uxs {
    public static final int $stable = 0;
    public static final CopterOrderFlowExperiment$RoutePointSettings$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CopterOrderFlowExperiment$RoutePointSettings$$serializer copterOrderFlowExperiment$RoutePointSettings$$serializer = new CopterOrderFlowExperiment$RoutePointSettings$$serializer();
        INSTANCE = copterOrderFlowExperiment$RoutePointSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.copter.experiment.CopterOrderFlowExperiment.RoutePointSettings", copterOrderFlowExperiment$RoutePointSettings$$serializer, 6);
        pluginGeneratedSerialDescriptor.j(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, true);
        pluginGeneratedSerialDescriptor.j("source_selection", true);
        pluginGeneratedSerialDescriptor.j("destination_selection", true);
        pluginGeneratedSerialDescriptor.j("route_point", true);
        pluginGeneratedSerialDescriptor.j("return_button", true);
        pluginGeneratedSerialDescriptor.j("order_button_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CopterOrderFlowExperiment$RoutePointSettings$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        CopterOrderFlowExperiment$RoutePointSettings$PointSelection$$serializer copterOrderFlowExperiment$RoutePointSettings$PointSelection$$serializer = CopterOrderFlowExperiment$RoutePointSettings$PointSelection$$serializer.INSTANCE;
        KSerializer n = qke.n(copterOrderFlowExperiment$RoutePointSettings$PointSelection$$serializer);
        KSerializer n2 = qke.n(copterOrderFlowExperiment$RoutePointSettings$PointSelection$$serializer);
        KSerializer n3 = qke.n(CopterOrderFlowExperiment$RoutePointSettings$RoutePoint$$serializer.INSTANCE);
        KSerializer n4 = qke.n(CopterOrderFlowExperiment$RoutePointSettings$ReturnButton$$serializer.INSTANCE);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, n, n2, n3, n4, auu0Var};
    }

    @Override // defpackage.myi
    public final CopterOrderFlowExperiment.RoutePointSettings deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        CopterOrderFlowExperiment.RoutePointSettings.PointSelection pointSelection = null;
        CopterOrderFlowExperiment.RoutePointSettings.PointSelection pointSelection2 = null;
        CopterOrderFlowExperiment.RoutePointSettings.RoutePoint routePoint = null;
        CopterOrderFlowExperiment.RoutePointSettings.ReturnButton returnButton = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    pointSelection = (CopterOrderFlowExperiment.RoutePointSettings.PointSelection) b.s(serialDescriptor, 1, CopterOrderFlowExperiment$RoutePointSettings$PointSelection$$serializer.INSTANCE, pointSelection);
                    i |= 2;
                    break;
                case 2:
                    pointSelection2 = (CopterOrderFlowExperiment.RoutePointSettings.PointSelection) b.s(serialDescriptor, 2, CopterOrderFlowExperiment$RoutePointSettings$PointSelection$$serializer.INSTANCE, pointSelection2);
                    i |= 4;
                    break;
                case 3:
                    routePoint = (CopterOrderFlowExperiment.RoutePointSettings.RoutePoint) b.s(serialDescriptor, 3, CopterOrderFlowExperiment$RoutePointSettings$RoutePoint$$serializer.INSTANCE, routePoint);
                    i |= 8;
                    break;
                case 4:
                    returnButton = (CopterOrderFlowExperiment.RoutePointSettings.ReturnButton) b.s(serialDescriptor, 4, CopterOrderFlowExperiment$RoutePointSettings$ReturnButton$$serializer.INSTANCE, returnButton);
                    i |= 16;
                    break;
                case 5:
                    str2 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new CopterOrderFlowExperiment.RoutePointSettings(i, str, pointSelection, pointSelection2, routePoint, returnButton, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CopterOrderFlowExperiment.RoutePointSettings value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, CopterOrderFlowExperiment$RoutePointSettings$PointSelection$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, CopterOrderFlowExperiment$RoutePointSettings$PointSelection$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, CopterOrderFlowExperiment$RoutePointSettings$RoutePoint$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, CopterOrderFlowExperiment$RoutePointSettings$ReturnButton$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !jl40.l(value.f, "")) {
            b.o(serialDescriptor, 5, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
