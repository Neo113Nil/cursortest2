package com.yandex.go.taxi_order.ws;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.mdx;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi_order/ws/WebSocketMessageDto.$serializer", "Luxs;", "Lcom/yandex/go/taxi_order/ws/WebSocketMessageDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi_order/ws/WebSocketMessageDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi_order/ws/WebSocketMessageDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ws"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class WebSocketMessageDto$$serializer implements uxs {
    public static final WebSocketMessageDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WebSocketMessageDto$$serializer webSocketMessageDto$$serializer = new WebSocketMessageDto$$serializer();
        INSTANCE = webSocketMessageDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi_order.ws.WebSocketMessageDto", webSocketMessageDto$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("ttl", false);
        pluginGeneratedSerialDescriptor.j("client_id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j(ClidProvider.TIMESTAMP, false);
        pluginGeneratedSerialDescriptor.j("version", false);
        pluginGeneratedSerialDescriptor.j("push_ts", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_DATA, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WebSocketMessageDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, qke.n(h6wVar), qke.n(h6wVar), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(pnz.a), qke.n(mdx.a)};
    }

    @Override // defpackage.myi
    public final WebSocketMessageDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        WebSocketMessageDto webSocketMessageDto = null;
        boolean z = true;
        kotlinx.serialization.json.c cVar = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b.s(serialDescriptor, 5, auu0.a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) b.s(serialDescriptor, 6, auu0.a, str5);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) b.s(serialDescriptor, 7, pnz.a, l);
                    i |= 128;
                    break;
                case 8:
                    cVar = (kotlinx.serialization.json.c) b.s(serialDescriptor, 8, mdx.a, cVar);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return webSocketMessageDto;
            }
            webSocketMessageDto = null;
        }
        b.c(serialDescriptor);
        return new WebSocketMessageDto(i, str, num, num2, str2, str3, str4, str5, l, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WebSocketMessageDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 0, auu0Var, value.a);
        h6w h6wVar = h6w.a;
        b.g(serialDescriptor, 1, h6wVar, value.b);
        b.g(serialDescriptor, 2, h6wVar, value.c);
        b.g(serialDescriptor, 3, auu0Var, value.d);
        b.g(serialDescriptor, 4, auu0Var, value.e);
        b.g(serialDescriptor, 5, auu0Var, value.f);
        b.g(serialDescriptor, 6, auu0Var, value.g);
        b.g(serialDescriptor, 7, pnz.a, value.h);
        b.g(serialDescriptor, 8, mdx.a, value.i);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
