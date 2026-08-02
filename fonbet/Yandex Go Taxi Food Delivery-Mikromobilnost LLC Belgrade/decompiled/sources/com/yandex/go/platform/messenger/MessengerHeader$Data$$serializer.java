package com.yandex.go.platform.messenger;

import defpackage.auu0;
import defpackage.jxi;
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
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/yandex/go/platform/messenger/MessengerHeader.Data.$serializer", "Luxs;", "Lcom/yandex/go/platform/messenger/MessengerHeader$Data;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/platform/messenger/MessengerHeader$Data;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/platform/messenger/MessengerHeader$Data;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final class MessengerHeader$Data$$serializer implements uxs {
    public static final MessengerHeader$Data$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessengerHeader$Data$$serializer messengerHeader$Data$$serializer = new MessengerHeader$Data$$serializer();
        INSTANCE = messengerHeader$Data$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.platform.messenger.MessengerHeader.Data", messengerHeader$Data$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("avatarUrl", true);
        pluginGeneratedSerialDescriptor.j("rating", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("with_close_btn", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessengerHeader$Data$$serializer() {
    }

    @Override // defpackage.uxs
    public KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), z96.a};
    }

    @Override // defpackage.myi
    public MessengerHeader$Data deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        sjd b = decoder.b(descriptor2);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int v = b.v(descriptor2);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(descriptor2, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(descriptor2, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(descriptor2, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.C(descriptor2, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(descriptor2);
        return new MessengerHeader$Data(i, str, str2, str3, str4, str5, z2);
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MessengerHeader$Data value) {
        SerialDescriptor descriptor2 = getDescriptor();
        yjd b = encoder.b(descriptor2);
        String str = value.a;
        boolean z = value.f;
        String str2 = value.e;
        String str3 = value.d;
        String str4 = value.c;
        b.o(descriptor2, 0, str);
        b.o(descriptor2, 1, value.b);
        if (b.F() || str4 != null) {
            b.g(descriptor2, 2, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(descriptor2, 3, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(descriptor2, 4, auu0.a, str2);
        }
        if (b.F() || z) {
            b.n(descriptor2, 5, z);
        }
        b.c(descriptor2);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
