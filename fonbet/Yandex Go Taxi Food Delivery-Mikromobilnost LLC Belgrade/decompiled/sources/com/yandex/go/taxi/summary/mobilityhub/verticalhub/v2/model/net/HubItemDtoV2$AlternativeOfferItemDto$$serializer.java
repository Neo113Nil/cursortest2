package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oyu;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.wfh;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2.AlternativeOfferItemDto.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2$AlternativeOfferItemDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2$AlternativeOfferItemDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2$AlternativeOfferItemDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class HubItemDtoV2$AlternativeOfferItemDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final HubItemDtoV2$AlternativeOfferItemDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HubItemDtoV2$AlternativeOfferItemDto$$serializer hubItemDtoV2$AlternativeOfferItemDto$$serializer = new HubItemDtoV2$AlternativeOfferItemDto$$serializer();
        INSTANCE = hubItemDtoV2$AlternativeOfferItemDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2.AlternativeOfferItemDto", hubItemDtoV2$AlternativeOfferItemDto$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("route_duration_min", true);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("body", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("secondary_action", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("selected_background_color", true);
        pluginGeneratedSerialDescriptor.j("analytics", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HubItemDtoV2$AlternativeOfferItemDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = HubItemDtoV2$AlternativeOfferItemDto.j;
        auu0 auu0Var = auu0.a;
        oyu oyuVar = oyu.e;
        return new KSerializer[]{qke.n(auu0Var), qke.n(h6w.a), HubItemDtoV2$DefaultOfferHeaderDtoV2$$serializer.INSTANCE, qke.n(wfh.e), qke.n(oyuVar), qke.n(oyuVar), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[8].getValue()};
    }

    @Override // defpackage.myi
    public final HubItemDtoV2$AlternativeOfferItemDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = HubItemDtoV2$AlternativeOfferItemDto.j;
        b.getClass();
        List list = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        Integer num = null;
        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV2 = null;
        f fVar = null;
        s0 s0Var = null;
        s0 s0Var2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) b.s(serialDescriptor, 0, auu0.a, str2);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    hubItemDtoV2$DefaultOfferHeaderDtoV2 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) b.A(serialDescriptor, 2, HubItemDtoV2$DefaultOfferHeaderDtoV2$$serializer.INSTANCE, hubItemDtoV2$DefaultOfferHeaderDtoV2);
                    i |= 4;
                    break;
                case 3:
                    fVar = (f) b.s(serialDescriptor, 3, wfh.e, fVar);
                    i |= 8;
                    break;
                case 4:
                    s0Var = (s0) b.s(serialDescriptor, 4, oyu.e, s0Var);
                    i |= 16;
                    break;
                case 5:
                    s0Var2 = (s0) b.s(serialDescriptor, 5, oyu.e, s0Var2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) b.s(serialDescriptor, 6, auu0.a, str3);
                    i |= 64;
                    break;
                case 7:
                    str = (String) b.s(serialDescriptor, 7, auu0.a, str);
                    i |= 128;
                    break;
                case 8:
                    list = (List) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new HubItemDtoV2$AlternativeOfferItemDto(i, str2, num, hubItemDtoV2$DefaultOfferHeaderDtoV2, fVar, s0Var, s0Var2, str3, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$DefaultOfferHeaderDtoV2.l) == false) goto L19;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, HubItemDtoV2$AlternativeOfferItemDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = HubItemDtoV2$AlternativeOfferItemDto.j;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, h6w.a, value.b);
        }
        if (!b.F()) {
            HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV2 = value.c;
            HubItemDtoV2$DefaultOfferHeaderDtoV2.Companion.getClass();
        }
        b.e(serialDescriptor, 2, HubItemDtoV2$DefaultOfferHeaderDtoV2$$serializer.INSTANCE, value.c);
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, wfh.e, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, oyu.e, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, oyu.e, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, auu0.a, value.h);
        }
        if (b.F() || !jl40.l(value.i, EmptyList.a)) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
