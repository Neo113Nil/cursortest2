package com.yandex.go.chargers.tariff_item_info.api.data.model;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.rcx;
import defpackage.sjd;
import defpackage.uqa;
import defpackage.uxs;
import defpackage.vqa;
import defpackage.w7s;
import defpackage.xqa;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/tariff_item_info/api/data/model/ChargersStationButtonDto.$serializer", "Luxs;", "Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersStationButtonDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersStationButtonDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersStationButtonDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersStationButtonDto$$serializer implements uxs {
    public static final ChargersStationButtonDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersStationButtonDto$$serializer chargersStationButtonDto$$serializer = new ChargersStationButtonDto$$serializer();
        INSTANCE = chargersStationButtonDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersStationButtonDto", chargersStationButtonDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("is_accent", true);
        pluginGeneratedSerialDescriptor.j("is_enabled", true);
        pluginGeneratedSerialDescriptor.j("show_timer", true);
        pluginGeneratedSerialDescriptor.j("is_square", true);
        pluginGeneratedSerialDescriptor.j("args", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersStationButtonDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        KSerializer n2 = qke.n(rcx.a);
        z96 z96Var = z96.a;
        return new KSerializer[]{w7s.a, n, z96Var, z96Var, z96Var, z96Var, n2, vqa.e};
    }

    @Override // defpackage.myi
    public final ChargersStationButtonDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        ChargersStationButtonDto chargersStationButtonDto = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        FormattedText formattedText = null;
        String str = null;
        kotlinx.serialization.json.b bVar = null;
        uqa uqaVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                    i |= 2;
                    break;
                case 2:
                    z2 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z3 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z4 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z5 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    bVar = (kotlinx.serialization.json.b) b.s(serialDescriptor, 6, rcx.a, bVar);
                    i |= 64;
                    break;
                case 7:
                    uqaVar = (uqa) b.A(serialDescriptor, 7, vqa.e, uqaVar);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return chargersStationButtonDto;
            }
            chargersStationButtonDto = null;
        }
        b.c(serialDescriptor);
        return new ChargersStationButtonDto(i, formattedText, str, z2, z3, z4, z5, bVar, uqaVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersStationButtonDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c) {
            b.n(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, rcx.a, value.g);
        }
        if (b.F() || !jl40.l(value.h, xqa.INSTANCE)) {
            b.e(serialDescriptor, 7, vqa.e, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
