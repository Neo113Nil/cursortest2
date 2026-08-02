package com.yandex.go.shortcuts.dto.response;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.xx;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/dto/response/VerticalStack.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/dto/response/VerticalStack;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/dto/response/VerticalStack;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/dto/response/VerticalStack;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class VerticalStack$$serializer implements uxs {
    public static final VerticalStack$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VerticalStack$$serializer verticalStack$$serializer = new VerticalStack$$serializer();
        INSTANCE = verticalStack$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.dto.response.VerticalStack", verticalStack$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("alignment_top_items", true);
        pluginGeneratedSerialDescriptor.j("alignment_bottom_items", true);
        pluginGeneratedSerialDescriptor.j("event_payload", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VerticalStack$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = VerticalStack.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, xx.f, i3yVarArr[3].getValue(), i3yVarArr[4].getValue(), auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final VerticalStack deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = VerticalStack.h;
        b.getClass();
        VerticalStack verticalStack = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        com.yandex.go.dto.response.q1 q1Var = null;
        List list = null;
        List list2 = null;
        String str3 = null;
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
                    q1Var = (com.yandex.go.dto.response.q1) b.A(serialDescriptor, 2, xx.f, q1Var);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    str3 = b.k(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    str4 = b.k(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    ny61.c(v);
                    return verticalStack;
            }
            verticalStack = null;
        }
        b.c(serialDescriptor);
        return new VerticalStack(i, str, str2, q1Var, list, list2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, VerticalStack value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        VerticalStack.b(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
