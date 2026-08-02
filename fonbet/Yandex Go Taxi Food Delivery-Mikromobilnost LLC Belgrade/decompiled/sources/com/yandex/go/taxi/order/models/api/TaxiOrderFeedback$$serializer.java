package com.yandex.go.taxi.order.models.api;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState$$serializer;
import defpackage.auu0;
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
import defpackage.yjd;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/TaxiOrderFeedback.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrderFeedback;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/TaxiOrderFeedback;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/TaxiOrderFeedback;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class TaxiOrderFeedback$$serializer implements uxs {
    public static final TaxiOrderFeedback$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TaxiOrderFeedback$$serializer taxiOrderFeedback$$serializer = new TaxiOrderFeedback$$serializer();
        INSTANCE = taxiOrderFeedback$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.TaxiOrderFeedback", taxiOrderFeedback$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("rating", true);
        pluginGeneratedSerialDescriptor.j("selected_rating_reasons_names", true);
        pluginGeneratedSerialDescriptor.j("cancellation_reasons_ids", true);
        pluginGeneratedSerialDescriptor.j("selected_cancel_reason_groups", true);
        pluginGeneratedSerialDescriptor.j("cancelled_reason_rating", true);
        pluginGeneratedSerialDescriptor.j("comment", true);
        pluginGeneratedSerialDescriptor.j("tips", true);
        pluginGeneratedSerialDescriptor.j("survey", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TaxiOrderFeedback$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TaxiOrderFeedback.i;
        return new KSerializer[]{qke.n(h6w.a), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n(auu0.a), TaxiOrderTipsState$$serializer.INSTANCE, qke.n((KSerializer) i3yVarArr[7].getValue())};
    }

    @Override // defpackage.myi
    public final TaxiOrderFeedback deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiOrderFeedback.i;
        b.getClass();
        TaxiOrderFeedback taxiOrderFeedback = null;
        boolean z = true;
        List list = null;
        Integer num = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        Map map = null;
        String str = null;
        TaxiOrderTipsState taxiOrderTipsState = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    list3 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list3);
                    i |= 4;
                    break;
                case 3:
                    list4 = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list4);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), map);
                    i |= 16;
                    break;
                case 5:
                    str = (String) b.s(serialDescriptor, 5, auu0.a, str);
                    i |= 32;
                    break;
                case 6:
                    taxiOrderTipsState = (TaxiOrderTipsState) b.A(serialDescriptor, 6, TaxiOrderTipsState$$serializer.INSTANCE, taxiOrderTipsState);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return taxiOrderFeedback;
            }
            taxiOrderFeedback = null;
        }
        b.c(serialDescriptor);
        return new TaxiOrderFeedback(i, num, list2, list3, list4, map, str, taxiOrderTipsState, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState.f) == false) goto L43;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, TaxiOrderFeedback value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiOrderFeedback.i;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, h6w.a, value.a);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || !jl40.l(value.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        if (!b.F()) {
            TaxiOrderTipsState taxiOrderTipsState = value.g;
            TaxiOrderTipsState.Companion.getClass();
        }
        b.e(serialDescriptor, 6, TaxiOrderTipsState$$serializer.INSTANCE, value.g);
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
