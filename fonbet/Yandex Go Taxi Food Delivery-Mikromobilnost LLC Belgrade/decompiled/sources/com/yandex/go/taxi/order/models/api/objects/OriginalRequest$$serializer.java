package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.cost_center.CostCenterRideStatus;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterRideStatus$$serializer;
import defpackage.auu0;
import defpackage.e6m;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.vmt;
import defpackage.yjd;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/objects/OriginalRequest.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/objects/OriginalRequest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/objects/OriginalRequest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/objects/OriginalRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class OriginalRequest$$serializer implements uxs {
    public static final OriginalRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OriginalRequest$$serializer originalRequest$$serializer = new OriginalRequest$$serializer();
        INSTANCE = originalRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.objects.OriginalRequest", originalRequest$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("comment", true);
        pluginGeneratedSerialDescriptor.j("due", true);
        pluginGeneratedSerialDescriptor.j("till_due", true);
        pluginGeneratedSerialDescriptor.j("route", true);
        pluginGeneratedSerialDescriptor.j("surge_value", true);
        pluginGeneratedSerialDescriptor.j("service_level", true);
        pluginGeneratedSerialDescriptor.j("cost_centers", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OriginalRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = OriginalRequest.h;
        vmt vmtVar = vmt.a;
        return new KSerializer[]{qke.n(auu0.a), qke.n(vmtVar), qke.n(vmtVar), i3yVarArr[3].getValue(), e6m.a, h6w.a, qke.n(CostCenterRideStatus$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final OriginalRequest deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = OriginalRequest.h;
        b.getClass();
        OriginalRequest originalRequest = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        Calendar calendar = null;
        Calendar calendar2 = null;
        List list = null;
        double d = 0.0d;
        boolean z = true;
        CostCenterRideStatus costCenterRideStatus = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    calendar = (Calendar) b.s(serialDescriptor, 1, vmt.a, calendar);
                    i |= 2;
                    break;
                case 2:
                    calendar2 = (Calendar) b.s(serialDescriptor, 2, vmt.a, calendar2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    d = b.E(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i2 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    costCenterRideStatus = (CostCenterRideStatus) b.s(serialDescriptor, 6, CostCenterRideStatus$$serializer.INSTANCE, costCenterRideStatus);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return originalRequest;
            }
            originalRequest = null;
        }
        b.c(serialDescriptor);
        return new OriginalRequest(i, str, calendar, calendar2, list, d, i2, costCenterRideStatus);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, OriginalRequest value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = OriginalRequest.h;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, vmt.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, vmt.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || Double.compare(value.e, 0.0d) != 0) {
            b.E(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f != -1) {
            b.A(5, value.f, serialDescriptor);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, CostCenterRideStatus$$serializer.INSTANCE, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
