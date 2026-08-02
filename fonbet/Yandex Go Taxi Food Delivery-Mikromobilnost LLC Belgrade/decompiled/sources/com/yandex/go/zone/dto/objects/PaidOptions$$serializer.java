package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.PaidOptions;
import defpackage.e6m;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k480;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/PaidOptions.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/PaidOptions;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/PaidOptions;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/PaidOptions;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class PaidOptions$$serializer implements uxs {
    public static final PaidOptions$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaidOptions$$serializer paidOptions$$serializer = new PaidOptions$$serializer();
        INSTANCE = paidOptions$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.PaidOptions", paidOptions$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("display_card_icon", true);
        pluginGeneratedSerialDescriptor.j("color_button", true);
        pluginGeneratedSerialDescriptor.j("alert_properties", true);
        pluginGeneratedSerialDescriptor.j("show_order_popup", true);
        pluginGeneratedSerialDescriptor.j("order_popup_properties", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaidOptions$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{e6m.a, qke.n(z96Var), z96Var, PaidOptions$Alert$$serializer.INSTANCE, z96Var, k480.e};
    }

    @Override // defpackage.myi
    public final PaidOptions deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        double d = 0.0d;
        Boolean bool = null;
        PaidOptions.Alert alert = null;
        u2 u2Var = null;
        boolean z3 = true;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    d = b.E(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) b.s(serialDescriptor, 1, z96.a, bool);
                    i |= 2;
                    break;
                case 2:
                    z = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    alert = (PaidOptions.Alert) b.A(serialDescriptor, 3, PaidOptions$Alert$$serializer.INSTANCE, alert);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    u2Var = (u2) b.A(serialDescriptor, 5, k480.e, u2Var);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PaidOptions(i, d, bool, z, alert, z2, u2Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.objects.PaidOptions.Alert.e) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, PaidOptions value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        y2 y2Var = PaidOptions.Companion;
        if (b.F() || Double.compare(value.a, 0.0d) != 0) {
            b.E(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, z96.a, value.b);
        }
        if (b.F() || value.c) {
            b.n(serialDescriptor, 2, value.c);
        }
        if (!b.F()) {
            PaidOptions.Alert alert = value.d;
            PaidOptions.Alert.Companion.getClass();
        }
        b.e(serialDescriptor, 3, PaidOptions$Alert$$serializer.INSTANCE, value.d);
        if (b.F() || value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || !jl40.l(value.f, s6.INSTANCE)) {
            b.e(serialDescriptor, 5, k480.e, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
