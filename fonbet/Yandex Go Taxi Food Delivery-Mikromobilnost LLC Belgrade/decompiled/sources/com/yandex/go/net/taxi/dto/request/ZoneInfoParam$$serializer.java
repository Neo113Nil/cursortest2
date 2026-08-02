package com.yandex.go.net.taxi.dto.request;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jsq0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/net/taxi/dto/request/ZoneInfoParam.$serializer", "Luxs;", "Lcom/yandex/go/net/taxi/dto/request/ZoneInfoParam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/net/taxi/dto/request/ZoneInfoParam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/net/taxi/dto/request/ZoneInfoParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ZoneInfoParam$$serializer implements uxs {
    public static final ZoneInfoParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ZoneInfoParam$$serializer zoneInfoParam$$serializer = new ZoneInfoParam$$serializer();
        INSTANCE = zoneInfoParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.net.taxi.dto.request.ZoneInfoParam", zoneInfoParam$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("zone_name", false);
        pluginGeneratedSerialDescriptor.j("size_hint", false);
        pluginGeneratedSerialDescriptor.j("skin_version", false);
        pluginGeneratedSerialDescriptor.j("supported", false);
        pluginGeneratedSerialDescriptor.j("supported_vertical_types", false);
        pluginGeneratedSerialDescriptor.j("supports_hideable_tariffs", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        pluginGeneratedSerialDescriptor.j("zone_cached_at", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ZoneInfoParam$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ZoneInfoParam.j;
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), h6wVar, h6wVar, i3yVarArr[4].getValue(), i3yVarArr[5].getValue(), z96Var, z96Var, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final ZoneInfoParam deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ZoneInfoParam.j;
        b.getClass();
        ZoneInfoParam zoneInfoParam = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        jsq0 jsq0Var = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) b.s(serialDescriptor, 1, auu0.a, str3);
                    i |= 2;
                    break;
                case 2:
                    i2 = b.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    jsq0Var = (jsq0) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), jsq0Var);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z3 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return zoneInfoParam;
            }
            zoneInfoParam = null;
        }
        b.c(serialDescriptor);
        return new ZoneInfoParam(i, str2, str3, i2, i3, list, jsq0Var, z2, z3, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ZoneInfoParam value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ZoneInfoParam.j;
        String str = value.a;
        boolean z = value.h;
        boolean z2 = value.g;
        b.o(serialDescriptor, 0, str);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 1, auu0Var, value.b);
        b.A(2, value.c, serialDescriptor);
        b.A(3, value.d, serialDescriptor);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        if (b.F() || !z2) {
            b.n(serialDescriptor, 6, z2);
        }
        if (b.F() || !z) {
            b.n(serialDescriptor, 7, z);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, auu0Var, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
