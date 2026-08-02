package com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer;

import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction.$serializer", "Luxs;", "Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class IntercityOpenShuttleClarifyPointAction$$serializer implements uxs {
    public static final IntercityOpenShuttleClarifyPointAction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        IntercityOpenShuttleClarifyPointAction$$serializer intercityOpenShuttleClarifyPointAction$$serializer = new IntercityOpenShuttleClarifyPointAction$$serializer();
        INSTANCE = intercityOpenShuttleClarifyPointAction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction", intercityOpenShuttleClarifyPointAction$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("tariff_class", true);
        pluginGeneratedSerialDescriptor.j("clarify_point_type", true);
        pluginGeneratedSerialDescriptor.j("trip_id", true);
        pluginGeneratedSerialDescriptor.j("selected_point_id", true);
        pluginGeneratedSerialDescriptor.j("original_source_point", false);
        pluginGeneratedSerialDescriptor.j("source_route_info", true);
        pluginGeneratedSerialDescriptor.j("modal_screen_content", false);
        pluginGeneratedSerialDescriptor.j(CRLDistributionPointsExtension.POINTS, false);
        pluginGeneratedSerialDescriptor.j("trip_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntercityOpenShuttleClarifyPointAction$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = IntercityOpenShuttleClarifyPointAction.j;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n((KSerializer) i3yVarArr[1].getValue()), auu0Var, qke.n(auu0Var), IntercityOpenShuttleClarifyPointAction$ClarifyPointOriginalPoint$$serializer.INSTANCE, qke.n(IntercityOpenShuttleClarifyPointAction$SourceRouteInfo$$serializer.INSTANCE), IntercityOpenShuttleClarifyPointAction$ModalScreenContent$$serializer.INSTANCE, i3yVarArr[7].getValue(), IntercityOpenShuttleClarifyPointAction$TripInfo$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final IntercityOpenShuttleClarifyPointAction deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = IntercityOpenShuttleClarifyPointAction.j;
        b.getClass();
        IntercityOpenShuttleClarifyPointAction.TripInfo tripInfo = null;
        boolean z = true;
        List list = null;
        int i = 0;
        String str = null;
        IntercityOpenShuttleClarifyPointAction.FlexPointType flexPointType = null;
        String str2 = null;
        String str3 = null;
        IntercityOpenShuttleClarifyPointAction.ClarifyPointOriginalPoint clarifyPointOriginalPoint = null;
        IntercityOpenShuttleClarifyPointAction.SourceRouteInfo sourceRouteInfo = null;
        IntercityOpenShuttleClarifyPointAction.ModalScreenContent modalScreenContent = null;
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
                    flexPointType = (IntercityOpenShuttleClarifyPointAction.FlexPointType) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), flexPointType);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    clarifyPointOriginalPoint = (IntercityOpenShuttleClarifyPointAction.ClarifyPointOriginalPoint) b.A(serialDescriptor, 4, IntercityOpenShuttleClarifyPointAction$ClarifyPointOriginalPoint$$serializer.INSTANCE, clarifyPointOriginalPoint);
                    i |= 16;
                    break;
                case 5:
                    sourceRouteInfo = (IntercityOpenShuttleClarifyPointAction.SourceRouteInfo) b.s(serialDescriptor, 5, IntercityOpenShuttleClarifyPointAction$SourceRouteInfo$$serializer.INSTANCE, sourceRouteInfo);
                    i |= 32;
                    break;
                case 6:
                    modalScreenContent = (IntercityOpenShuttleClarifyPointAction.ModalScreenContent) b.A(serialDescriptor, 6, IntercityOpenShuttleClarifyPointAction$ModalScreenContent$$serializer.INSTANCE, modalScreenContent);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    tripInfo = (IntercityOpenShuttleClarifyPointAction.TripInfo) b.A(serialDescriptor, 8, IntercityOpenShuttleClarifyPointAction$TripInfo$$serializer.INSTANCE, tripInfo);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new IntercityOpenShuttleClarifyPointAction(i, str, flexPointType, str2, str3, clarifyPointOriginalPoint, sourceRouteInfo, modalScreenContent, list, tripInfo);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, IntercityOpenShuttleClarifyPointAction value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = IntercityOpenShuttleClarifyPointAction.j;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        IntercityOpenShuttleClarifyPointAction$ClarifyPointOriginalPoint$$serializer intercityOpenShuttleClarifyPointAction$ClarifyPointOriginalPoint$$serializer = IntercityOpenShuttleClarifyPointAction$ClarifyPointOriginalPoint$$serializer.INSTANCE;
        IntercityOpenShuttleClarifyPointAction.ClarifyPointOriginalPoint clarifyPointOriginalPoint = value.e;
        IntercityOpenShuttleClarifyPointAction.TripInfo tripInfo = value.i;
        IntercityOpenShuttleClarifyPointAction.SourceRouteInfo sourceRouteInfo = value.f;
        b.e(serialDescriptor, 4, intercityOpenShuttleClarifyPointAction$ClarifyPointOriginalPoint$$serializer, clarifyPointOriginalPoint);
        if (b.F() || sourceRouteInfo != null) {
            b.g(serialDescriptor, 5, IntercityOpenShuttleClarifyPointAction$SourceRouteInfo$$serializer.INSTANCE, sourceRouteInfo);
        }
        b.e(serialDescriptor, 6, IntercityOpenShuttleClarifyPointAction$ModalScreenContent$$serializer.INSTANCE, value.g);
        b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), value.h);
        if (b.F() || !jl40.l(tripInfo, new IntercityOpenShuttleClarifyPointAction.TripInfo(0))) {
            b.e(serialDescriptor, 8, IntercityOpenShuttleClarifyPointAction$TripInfo$$serializer.INSTANCE, tripInfo);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
