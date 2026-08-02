package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.BindDialog;
import defpackage.auu0;
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
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/data/model/response/BindDialog.Overrides.BindingDialogOverride.$serializer", "Luxs;", "Lcom/yandex/go/payments/data/model/response/BindDialog$Overrides$BindingDialogOverride;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/data/model/response/BindDialog$Overrides$BindingDialogOverride;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/data/model/response/BindDialog$Overrides$BindingDialogOverride;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class BindDialog$Overrides$BindingDialogOverride$$serializer implements uxs {
    public static final int $stable = 0;
    public static final BindDialog$Overrides$BindingDialogOverride$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BindDialog$Overrides$BindingDialogOverride$$serializer bindDialog$Overrides$BindingDialogOverride$$serializer = new BindDialog$Overrides$BindingDialogOverride$$serializer();
        INSTANCE = bindDialog$Overrides$BindingDialogOverride$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.data.model.response.BindDialog.Overrides.BindingDialogOverride", bindDialog$Overrides$BindingDialogOverride$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("additional_button", true);
        pluginGeneratedSerialDescriptor.j("main_button", true);
        pluginGeneratedSerialDescriptor.j("legal_footer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BindDialog$Overrides$BindingDialogOverride$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        ActionButton$$serializer actionButton$$serializer = ActionButton$$serializer.INSTANCE;
        return new KSerializer[]{n, n2, qke.n(actionButton$$serializer), qke.n(actionButton$$serializer), qke.n(BindDialog$LegalFooter$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final BindDialog.Overrides.BindingDialogOverride deserialize(Decoder decoder) {
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                actionButton = (ActionButton) b.s(serialDescriptor, 2, ActionButton$$serializer.INSTANCE, actionButton);
                i |= 4;
            } else if (v == 3) {
                actionButton2 = (ActionButton) b.s(serialDescriptor, 3, ActionButton$$serializer.INSTANCE, actionButton2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                legalFooter = (BindDialog.LegalFooter) b.s(serialDescriptor, 4, BindDialog$LegalFooter$$serializer.INSTANCE, legalFooter);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new BindDialog.Overrides.BindingDialogOverride(i, str, str2, actionButton, actionButton2, legalFooter);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BindDialog.Overrides.BindingDialogOverride value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, ActionButton$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, ActionButton$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, BindDialog$LegalFooter$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
