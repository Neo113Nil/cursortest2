package com.yandex.go.payments.paymentlist.experiments;

import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.jxi;
import defpackage.ksq0;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/paymentlist/experiments/MainMenuPaymentMethodsSelectorExperiment.PromoBannerConditions.$serializer", "Luxs;", "Lcom/yandex/go/payments/paymentlist/experiments/MainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/paymentlist/experiments/MainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/paymentlist/experiments/MainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class MainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions$$serializer implements uxs {
    public static final int $stable = 0;
    public static final MainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions$$serializer mainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions$$serializer = new MainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions$$serializer();
        INSTANCE = mainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment.PromoBannerConditions", mainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions$$serializer, 2);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, true);
        pluginGeneratedSerialDescriptor.j("payment_types", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MainMenuPaymentMethodsSelectorExperiment.PromoBannerConditions.c;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final MainMenuPaymentMethodsSelectorExperiment.PromoBannerConditions deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MainMenuPaymentMethodsSelectorExperiment.PromoBannerConditions.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        MainMenuPaymentMethodsSelectorExperiment.Screen screen = null;
        jsq0 jsq0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                screen = (MainMenuPaymentMethodsSelectorExperiment.Screen) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), screen);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                jsq0Var = (jsq0) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), jsq0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new MainMenuPaymentMethodsSelectorExperiment.PromoBannerConditions(i, screen, jsq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (defpackage.jl40.l(r1, new defpackage.jsq0(r2)) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, MainMenuPaymentMethodsSelectorExperiment.PromoBannerConditions value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MainMenuPaymentMethodsSelectorExperiment.PromoBannerConditions.c;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (!b.F()) {
            jsq0 jsq0Var = value.b;
            List singletonList = Collections.singletonList(MainMenuPaymentMethodsSelectorExperiment.PaymentTypes.UNKNOWN);
            jsq0 jsq0Var2 = ksq0.a;
        }
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
