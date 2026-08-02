package com.yandex.go.chargers.discovery_flex.ui.action;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/discovery_flex/ui/action/ChargersFlexDiscoveryAction.OpenChargersAttentionInfoAction.$serializer", "Luxs;", "Lcom/yandex/go/chargers/discovery_flex/ui/action/ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/discovery_flex/ui/action/ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/discovery_flex/ui/action/ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction$$serializer implements uxs {
    public static final ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction$$serializer chargersFlexDiscoveryAction$OpenChargersAttentionInfoAction$$serializer = new ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction$$serializer();
        INSTANCE = chargersFlexDiscoveryAction$OpenChargersAttentionInfoAction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("OpenChargersAttentionInfoAction", chargersFlexDiscoveryAction$OpenChargersAttentionInfoAction$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("body", false);
        pluginGeneratedSerialDescriptor.j("icon_tag", false);
        pluginGeneratedSerialDescriptor.j("promo_offer_id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), qke.n(auu0Var), auu0Var};
    }

    @Override // defpackage.myi
    public final ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                charSequence = (CharSequence) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), charSequence);
                i |= 1;
            } else if (v == 1) {
                charSequence2 = (CharSequence) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), charSequence2);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction(i, charSequence, charSequence2, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction.f;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.b);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.c);
        b.g(serialDescriptor, 2, auu0.a, value.d);
        b.o(serialDescriptor, 3, value.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
