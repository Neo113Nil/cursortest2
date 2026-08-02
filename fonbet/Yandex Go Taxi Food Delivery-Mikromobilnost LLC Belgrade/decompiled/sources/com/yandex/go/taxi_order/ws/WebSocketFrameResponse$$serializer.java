package com.yandex.go.taxi_order.ws;

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
import defpackage.z96;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi_order/ws/WebSocketFrameResponse.$serializer", "Luxs;", "Lcom/yandex/go/taxi_order/ws/WebSocketFrameResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi_order/ws/WebSocketFrameResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi_order/ws/WebSocketFrameResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ws"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class WebSocketFrameResponse$$serializer implements uxs {
    public static final WebSocketFrameResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WebSocketFrameResponse$$serializer webSocketFrameResponse$$serializer = new WebSocketFrameResponse$$serializer();
        INSTANCE = webSocketFrameResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi_order.ws.WebSocketFrameResponse", webSocketFrameResponse$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("operation", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, true);
        pluginGeneratedSerialDescriptor.j("server-interval-sec", true);
        pluginGeneratedSerialDescriptor.j("bright", true);
        pluginGeneratedSerialDescriptor.j("uid", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, false);
        pluginGeneratedSerialDescriptor.j("version", false);
        pluginGeneratedSerialDescriptor.j("lcn", false);
        pluginGeneratedSerialDescriptor.j("session_key", false);
        pluginGeneratedSerialDescriptor.j("server_notify_id", false);
        pluginGeneratedSerialDescriptor.j("tags", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WebSocketFrameResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = WebSocketFrameResponse.m;
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(h6wVar), z96.a, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[10].getValue(), h6wVar};
    }

    @Override // defpackage.myi
    public final WebSocketFrameResponse deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        i3y[] i3yVarArr2;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr3 = WebSocketFrameResponse.m;
        b.getClass();
        List list = null;
        String str = null;
        String str2 = null;
        boolean z2 = true;
        String str3 = null;
        int i = 0;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        boolean z3 = false;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i2 = 0;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                case 0:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str4 = (String) b.s(serialDescriptor, 0, auu0.a, str4);
                    i |= 1;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 1:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str5 = (String) b.s(serialDescriptor, 1, auu0.a, str5);
                    i |= 2;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 2:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                    i |= 4;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 3:
                    i3yVarArr = i3yVarArr3;
                    z3 = b.C(serialDescriptor, 3);
                    i |= 8;
                    i3yVarArr3 = i3yVarArr;
                case 4:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str6 = (String) b.s(serialDescriptor, 4, auu0.a, str6);
                    i |= 16;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 5:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str7 = (String) b.s(serialDescriptor, 5, auu0.a, str7);
                    i |= 32;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 6:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str8 = (String) b.s(serialDescriptor, 6, auu0.a, str8);
                    i |= 64;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 7:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str3 = (String) b.s(serialDescriptor, 7, auu0.a, str3);
                    i |= 128;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 8:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str2 = (String) b.s(serialDescriptor, 8, auu0.a, str2);
                    i |= 256;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 9:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str = (String) b.s(serialDescriptor, 9, auu0.a, str);
                    i |= 512;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 10:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    list = (List) b.A(serialDescriptor, 10, (myi) i3yVarArr2[10].getValue(), list);
                    i |= 1024;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 11:
                    i3yVarArr = i3yVarArr3;
                    i2 = b.h(serialDescriptor, 11);
                    i |= 2048;
                    i3yVarArr3 = i3yVarArr;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new WebSocketFrameResponse(i, str4, str5, num, z3, str6, str7, str8, str3, str2, str, list, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WebSocketFrameResponse value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = WebSocketFrameResponse.m;
        auu0 auu0Var = auu0.a;
        String str = value.a;
        int i = value.l;
        List list = value.k;
        boolean z = value.d;
        Integer num = value.c;
        String str2 = value.b;
        b.g(serialDescriptor, 0, auu0Var, str);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 1, auu0Var, str2);
        }
        if (b.F() || num != null) {
            b.g(serialDescriptor, 2, h6w.a, num);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 3, z);
        }
        b.g(serialDescriptor, 4, auu0Var, value.e);
        b.g(serialDescriptor, 5, auu0Var, value.f);
        b.g(serialDescriptor, 6, auu0Var, value.g);
        b.g(serialDescriptor, 7, auu0Var, value.h);
        b.g(serialDescriptor, 8, auu0Var, value.i);
        b.g(serialDescriptor, 9, auu0Var, value.j);
        if (b.F() || !jl40.l(list, EmptyList.a)) {
            b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), list);
        }
        if (b.F() || i != 0) {
            b.A(11, i, serialDescriptor);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
