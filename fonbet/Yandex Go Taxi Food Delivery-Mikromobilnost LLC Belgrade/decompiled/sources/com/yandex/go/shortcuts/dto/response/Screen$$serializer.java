package com.yandex.go.shortcuts.dto.response;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/dto/response/Screen.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/dto/response/Screen;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/dto/response/Screen;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/dto/response/Screen;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class Screen$$serializer implements uxs {
    public static final Screen$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Screen$$serializer screen$$serializer = new Screen$$serializer();
        INSTANCE = screen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.dto.response.Screen", screen$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("layout", true);
        pluginGeneratedSerialDescriptor.j("offers", true);
        pluginGeneratedSerialDescriptor.j("sections", true);
        pluginGeneratedSerialDescriptor.j("bottom_screen_objects", true);
        pluginGeneratedSerialDescriptor.j("suggest_mode", true);
        pluginGeneratedSerialDescriptor.j("event_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Screen$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = Screen.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{Layout$$serializer.INSTANCE, ProductsCommon$OfferItem$$serializer.INSTANCE, i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Screen deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = Screen.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        Layout layout = null;
        ProductsCommon$OfferItem productsCommon$OfferItem = null;
        List list = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    layout = (Layout) b.A(serialDescriptor, 0, Layout$$serializer.INSTANCE, layout);
                    i |= 1;
                    break;
                case 1:
                    productsCommon$OfferItem = (ProductsCommon$OfferItem) b.A(serialDescriptor, 1, ProductsCommon$OfferItem$$serializer.INSTANCE, productsCommon$OfferItem);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    str = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Screen(i, layout, productsCommon$OfferItem, list, list2, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Screen value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        Screen.c(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
