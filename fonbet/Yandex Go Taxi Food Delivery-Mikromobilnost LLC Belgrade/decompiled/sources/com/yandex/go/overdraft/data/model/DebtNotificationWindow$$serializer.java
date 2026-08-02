package com.yandex.go.overdraft.data.model;

import defpackage.auu0;
import defpackage.e6m;
import defpackage.gef;
import defpackage.ief;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/overdraft/data/model/DebtNotificationWindow.$serializer", "Luxs;", "Lcom/yandex/go/overdraft/data/model/DebtNotificationWindow;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/overdraft/data/model/DebtNotificationWindow;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/overdraft/data/model/DebtNotificationWindow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class DebtNotificationWindow$$serializer implements uxs {
    public static final DebtNotificationWindow$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DebtNotificationWindow$$serializer debtNotificationWindow$$serializer = new DebtNotificationWindow$$serializer();
        INSTANCE = debtNotificationWindow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.overdraft.data.model.DebtNotificationWindow", debtNotificationWindow$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("alternative_payment_methods_text", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("main_button", true);
        pluginGeneratedSerialDescriptor.j("debt_sum", true);
        pluginGeneratedSerialDescriptor.j("payment_type", true);
        pluginGeneratedSerialDescriptor.j("payment_method_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DebtNotificationWindow$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), auu0Var, gef.a, DebtNotificationButton$$serializer.INSTANCE, qke.n(e6m.a), auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final DebtNotificationWindow deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        DebtNotificationWindow debtNotificationWindow = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ief iefVar = null;
        DebtNotificationButton debtNotificationButton = null;
        Double d = null;
        String str5 = null;
        String str6 = null;
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
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iefVar = (ief) b.A(serialDescriptor, 4, gef.a, iefVar);
                    i |= 16;
                    break;
                case 5:
                    debtNotificationButton = (DebtNotificationButton) b.A(serialDescriptor, 5, DebtNotificationButton$$serializer.INSTANCE, debtNotificationButton);
                    i |= 32;
                    break;
                case 6:
                    d = (Double) b.s(serialDescriptor, 6, e6m.a, d);
                    i |= 64;
                    break;
                case 7:
                    str5 = b.k(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    str6 = b.k(serialDescriptor, 8);
                    i |= 256;
                    continue;
                default:
                    ny61.c(v);
                    return debtNotificationWindow;
            }
            debtNotificationWindow = null;
        }
        b.c(serialDescriptor);
        return new DebtNotificationWindow(i, str, str2, str3, str4, iefVar, debtNotificationButton, d, str5, str6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.overdraft.data.model.DebtNotificationButton.d) == false) goto L37;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, DebtNotificationWindow value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, ief.e)) {
            b.e(serialDescriptor, 4, gef.a, value.e);
        }
        if (!b.F()) {
            DebtNotificationButton debtNotificationButton = value.f;
            DebtNotificationButton.Companion.getClass();
        }
        b.e(serialDescriptor, 5, DebtNotificationButton$$serializer.INSTANCE, value.f);
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, e6m.a, value.g);
        }
        if (b.F() || !jl40.l(value.h, "")) {
            b.o(serialDescriptor, 7, value.h);
        }
        if (b.F() || !jl40.l(value.i, "")) {
            b.o(serialDescriptor, 8, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
