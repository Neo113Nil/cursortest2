package com.yandex.go.taxi.order.multi.feed.experiments;

import com.yandex.go.taxi.order.multi.feed.experiments.TaxiOrderFeedStateSettingsExperiment;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/multi/feed/experiments/TaxiOrderFeedStateSettingsExperiment.StateDto.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/multi/feed/experiments/TaxiOrderFeedStateSettingsExperiment$StateDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/multi/feed/experiments/TaxiOrderFeedStateSettingsExperiment$StateDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/multi/feed/experiments/TaxiOrderFeedStateSettingsExperiment$StateDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class TaxiOrderFeedStateSettingsExperiment$StateDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final TaxiOrderFeedStateSettingsExperiment$StateDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TaxiOrderFeedStateSettingsExperiment$StateDto$$serializer taxiOrderFeedStateSettingsExperiment$StateDto$$serializer = new TaxiOrderFeedStateSettingsExperiment$StateDto$$serializer();
        INSTANCE = taxiOrderFeedStateSettingsExperiment$StateDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.multi.feed.experiments.TaxiOrderFeedStateSettingsExperiment.StateDto", taxiOrderFeedStateSettingsExperiment$StateDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("tariffs", true);
        pluginGeneratedSerialDescriptor.j("feed_state", true);
        pluginGeneratedSerialDescriptor.j("haptic_enabled", true);
        pluginGeneratedSerialDescriptor.j("open_delay", true);
        pluginGeneratedSerialDescriptor.j("is_scroll_enabled", true);
        pluginGeneratedSerialDescriptor.j("is_multiple_height_change_enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TaxiOrderFeedStateSettingsExperiment$StateDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TaxiOrderFeedStateSettingsExperiment.StateDto.h;
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue()), i3yVarArr[2].getValue(), z96Var, h6w.a, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final TaxiOrderFeedStateSettingsExperiment.StateDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiOrderFeedStateSettingsExperiment.StateDto.h;
        b.getClass();
        TaxiOrderFeedStateSettingsExperiment.StateDto stateDto = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        DriveState driveState = null;
        List list = null;
        TaxiOrderFeedStateSettingsExperiment.StateDto.State state = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    driveState = (DriveState) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), driveState);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    state = (TaxiOrderFeedStateSettingsExperiment.StateDto.State) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), state);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    z4 = b.C(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    ny61.c(v);
                    return stateDto;
            }
            stateDto = null;
        }
        b.c(serialDescriptor);
        return new TaxiOrderFeedStateSettingsExperiment.StateDto(i, driveState, list, state, z2, i2, z3, z4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TaxiOrderFeedStateSettingsExperiment.StateDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiOrderFeedStateSettingsExperiment.StateDto.h;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c != TaxiOrderFeedStateSettingsExperiment.StateDto.State.EXPANDED) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e != 0) {
            b.A(4, value.e, serialDescriptor);
        }
        if (b.F() || !value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
