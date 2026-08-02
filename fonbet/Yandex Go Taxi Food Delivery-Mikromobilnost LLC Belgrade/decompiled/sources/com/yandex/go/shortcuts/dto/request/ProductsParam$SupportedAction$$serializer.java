package com.yandex.go.shortcuts.dto.request;

import com.yandex.go.dto.response.ActionType;
import com.yandex.go.shortcuts.dto.request.ProductsParam;
import defpackage.i3y;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/dto/request/ProductsParam.SupportedAction.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/dto/request/ProductsParam$SupportedAction;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/dto/request/ProductsParam$SupportedAction;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/dto/request/ProductsParam$SupportedAction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ProductsParam$SupportedAction$$serializer implements uxs {
    public static final ProductsParam$SupportedAction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductsParam$SupportedAction$$serializer productsParam$SupportedAction$$serializer = new ProductsParam$SupportedAction$$serializer();
        INSTANCE = productsParam$SupportedAction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.dto.request.ProductsParam.SupportedAction", productsParam$SupportedAction$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("modes", true);
        pluginGeneratedSerialDescriptor.j("destination_support", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProductsParam$SupportedAction$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ProductsParam.SupportedAction.d;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final ProductsParam.SupportedAction deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ProductsParam.SupportedAction.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        ActionType actionType = null;
        List list = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                actionType = (ActionType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), actionType);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ProductsParam.SupportedAction(i, actionType, list, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ProductsParam.SupportedAction value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ProductsParam.SupportedAction.d;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        ActionType actionType = value.a;
        Boolean bool = value.c;
        List list = value.b;
        b.e(serialDescriptor, 0, kSerializer, actionType);
        if (b.F() || list != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), list);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 2, z96.a, bool);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
