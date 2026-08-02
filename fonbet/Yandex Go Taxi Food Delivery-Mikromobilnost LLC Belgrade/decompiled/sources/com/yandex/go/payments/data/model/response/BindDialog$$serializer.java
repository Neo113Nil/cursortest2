package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.BindDialog;
import defpackage.auu0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/data/model/response/BindDialog.$serializer", "Luxs;", "Lcom/yandex/go/payments/data/model/response/BindDialog;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/data/model/response/BindDialog;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/data/model/response/BindDialog;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class BindDialog$$serializer implements uxs {
    public static final int $stable = 0;
    public static final BindDialog$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BindDialog$$serializer bindDialog$$serializer = new BindDialog$$serializer();
        INSTANCE = bindDialog$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.data.model.response.BindDialog", bindDialog$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("descriptions", true);
        pluginGeneratedSerialDescriptor.j("additional_button", true);
        pluginGeneratedSerialDescriptor.j("main_button", true);
        pluginGeneratedSerialDescriptor.j("legal_footer", true);
        pluginGeneratedSerialDescriptor.j("overrides", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BindDialog$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        ActionButton$$serializer actionButton$$serializer = ActionButton$$serializer.INSTANCE;
        return new KSerializer[]{auu0Var, n, qke.n(actionButton$$serializer), actionButton$$serializer, qke.n(BindDialog$LegalFooter$$serializer.INSTANCE), qke.n(BindDialog$Overrides$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final BindDialog deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        ActionButton actionButton = null;
        ActionButton actionButton2 = null;
        BindDialog.LegalFooter legalFooter = null;
        BindDialog.Overrides overrides = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    actionButton = (ActionButton) b.s(serialDescriptor, 2, ActionButton$$serializer.INSTANCE, actionButton);
                    i |= 4;
                    break;
                case 3:
                    actionButton2 = (ActionButton) b.A(serialDescriptor, 3, ActionButton$$serializer.INSTANCE, actionButton2);
                    i |= 8;
                    break;
                case 4:
                    legalFooter = (BindDialog.LegalFooter) b.s(serialDescriptor, 4, BindDialog$LegalFooter$$serializer.INSTANCE, legalFooter);
                    i |= 16;
                    break;
                case 5:
                    overrides = (BindDialog.Overrides) b.s(serialDescriptor, 5, BindDialog$Overrides$$serializer.INSTANCE, overrides);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new BindDialog(i, str, str2, actionButton, actionButton2, legalFooter, overrides);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.payments.data.model.response.ActionButton.d) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, BindDialog value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        o oVar = BindDialog.Companion;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, ActionButton$$serializer.INSTANCE, value.c);
        }
        if (!b.F()) {
            ActionButton actionButton = value.d;
            ActionButton.Companion.getClass();
        }
        b.e(serialDescriptor, 3, ActionButton$$serializer.INSTANCE, value.d);
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, BindDialog$LegalFooter$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, BindDialog$Overrides$$serializer.INSTANCE, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
