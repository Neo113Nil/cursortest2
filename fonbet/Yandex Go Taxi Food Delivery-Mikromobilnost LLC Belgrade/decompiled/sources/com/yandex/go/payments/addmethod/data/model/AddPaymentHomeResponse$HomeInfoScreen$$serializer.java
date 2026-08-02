package com.yandex.go.payments.addmethod.data.model;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import defpackage.auu0;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse.HomeInfoScreen.$serializer", "Luxs;", "Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$HomeInfoScreen;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$HomeInfoScreen;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$HomeInfoScreen;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class AddPaymentHomeResponse$HomeInfoScreen$$serializer implements uxs {
    public static final int $stable = 0;
    public static final AddPaymentHomeResponse$HomeInfoScreen$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AddPaymentHomeResponse$HomeInfoScreen$$serializer addPaymentHomeResponse$HomeInfoScreen$$serializer = new AddPaymentHomeResponse$HomeInfoScreen$$serializer();
        INSTANCE = addPaymentHomeResponse$HomeInfoScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse.HomeInfoScreen", addPaymentHomeResponse$HomeInfoScreen$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("content_webview_url", true);
        pluginGeneratedSerialDescriptor.j("action_buttons", true);
        pluginGeneratedSerialDescriptor.j("footer", true);
        pluginGeneratedSerialDescriptor.j("toolbar", true);
        pluginGeneratedSerialDescriptor.j("display_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AddPaymentHomeResponse$HomeInfoScreen$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = AddPaymentHomeResponse.HomeInfoScreen.f;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), qke.n(AddPaymentHomeResponse$Footer$$serializer.INSTANCE), qke.n(AddPaymentHomeResponse$HomeToolbar$$serializer.INSTANCE), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final AddPaymentHomeResponse.HomeInfoScreen deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddPaymentHomeResponse.HomeInfoScreen.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        AddPaymentHomeResponse.Footer footer = null;
        AddPaymentHomeResponse.HomeToolbar homeToolbar = null;
        AddPaymentHomeResponse.DisplayType displayType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                footer = (AddPaymentHomeResponse.Footer) b.s(serialDescriptor, 2, AddPaymentHomeResponse$Footer$$serializer.INSTANCE, footer);
                i |= 4;
            } else if (v == 3) {
                homeToolbar = (AddPaymentHomeResponse.HomeToolbar) b.s(serialDescriptor, 3, AddPaymentHomeResponse$HomeToolbar$$serializer.INSTANCE, homeToolbar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                displayType = (AddPaymentHomeResponse.DisplayType) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), displayType);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new AddPaymentHomeResponse.HomeInfoScreen(i, str, list, footer, homeToolbar, displayType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AddPaymentHomeResponse.HomeInfoScreen value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddPaymentHomeResponse.HomeInfoScreen.f;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, AddPaymentHomeResponse$Footer$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, AddPaymentHomeResponse$HomeToolbar$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
