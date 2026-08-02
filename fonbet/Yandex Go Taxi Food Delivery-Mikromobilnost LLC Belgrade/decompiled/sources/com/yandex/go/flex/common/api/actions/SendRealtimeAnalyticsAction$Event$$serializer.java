package com.yandex.go.flex.common.api.actions;

import com.yandex.go.flex.common.api.actions.SendRealtimeAnalyticsAction;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.mdx;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/flex/common/api/actions/SendRealtimeAnalyticsAction.Event.$serializer", "Luxs;", "Lcom/yandex/go/flex/common/api/actions/SendRealtimeAnalyticsAction$Event;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/flex/common/api/actions/SendRealtimeAnalyticsAction$Event;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/flex/common/api/actions/SendRealtimeAnalyticsAction$Event;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class SendRealtimeAnalyticsAction$Event$$serializer implements uxs {
    public static final SendRealtimeAnalyticsAction$Event$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SendRealtimeAnalyticsAction$Event$$serializer sendRealtimeAnalyticsAction$Event$$serializer = new SendRealtimeAnalyticsAction$Event$$serializer();
        INSTANCE = sendRealtimeAnalyticsAction$Event$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.flex.common.api.actions.SendRealtimeAnalyticsAction.Event", sendRealtimeAnalyticsAction$Event$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("creative_id", false);
        pluginGeneratedSerialDescriptor.j("creative_type", false);
        pluginGeneratedSerialDescriptor.j("event_type", false);
        pluginGeneratedSerialDescriptor.j("payload", false);
        pluginGeneratedSerialDescriptor.j("client_payload", true);
        pluginGeneratedSerialDescriptor.j("element_payload", true);
        pluginGeneratedSerialDescriptor.j("is_unique", true);
        pluginGeneratedSerialDescriptor.j("report_group_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SendRealtimeAnalyticsAction$Event$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        mdx mdxVar = mdx.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, mdxVar, qke.n(mdxVar), qke.n(mdxVar), qke.n(z96.a), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final SendRealtimeAnalyticsAction.Event deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        SendRealtimeAnalyticsAction.Event event = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        kotlinx.serialization.json.c cVar = null;
        kotlinx.serialization.json.c cVar2 = null;
        kotlinx.serialization.json.c cVar3 = null;
        Boolean bool = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    cVar = (kotlinx.serialization.json.c) b.A(serialDescriptor, 3, mdx.a, cVar);
                    i |= 8;
                    break;
                case 4:
                    cVar2 = (kotlinx.serialization.json.c) b.s(serialDescriptor, 4, mdx.a, cVar2);
                    i |= 16;
                    break;
                case 5:
                    cVar3 = (kotlinx.serialization.json.c) b.s(serialDescriptor, 5, mdx.a, cVar3);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) b.s(serialDescriptor, 6, z96.a, bool);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) b.s(serialDescriptor, 7, auu0.a, str4);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return event;
            }
            event = null;
        }
        b.c(serialDescriptor);
        return new SendRealtimeAnalyticsAction.Event(i, str, str2, str3, cVar, cVar2, cVar3, bool, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SendRealtimeAnalyticsAction.Event value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = value.a;
        String str2 = value.h;
        Boolean bool = value.g;
        kotlinx.serialization.json.c cVar = value.f;
        kotlinx.serialization.json.c cVar2 = value.e;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, value.b);
        b.o(serialDescriptor, 2, value.c);
        mdx mdxVar = mdx.a;
        b.e(serialDescriptor, 3, mdxVar, value.d);
        if (b.F() || cVar2 != null) {
            b.g(serialDescriptor, 4, mdxVar, cVar2);
        }
        if (b.F() || cVar != null) {
            b.g(serialDescriptor, 5, mdxVar, cVar);
        }
        if (b.F() || !jl40.l(bool, Boolean.FALSE)) {
            b.g(serialDescriptor, 6, z96.a, bool);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 7, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
