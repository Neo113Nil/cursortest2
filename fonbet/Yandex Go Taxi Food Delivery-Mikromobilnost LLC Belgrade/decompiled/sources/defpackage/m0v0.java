package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.plus.api.dto.state.subscription.SubscriptionStatusDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class m0v0 implements uxs {
    public static final m0v0 a;
    private static final SerialDescriptor descriptor;

    static {
        m0v0 m0v0Var = new m0v0();
        a = m0v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.subscription.SubscriptionDto", m0v0Var, 5);
        pluginGeneratedSerialDescriptor.j("subscription_id", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("need_upgrade", true);
        pluginGeneratedSerialDescriptor.j("pending_purchase_id", true);
        pluginGeneratedSerialDescriptor.j("webview", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = o0v0.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), i3yVarArr[1].getValue(), z96.a, qke.n(auu0Var), qke.n(tr41.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = o0v0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        SubscriptionStatusDto subscriptionStatusDto = null;
        String str2 = null;
        vr41 vr41Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                subscriptionStatusDto = (SubscriptionStatusDto) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), subscriptionStatusDto);
                i |= 2;
            } else if (v == 2) {
                z2 = b.C(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                vr41Var = (vr41) b.s(serialDescriptor, 4, tr41.a, vr41Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new o0v0(i, str, subscriptionStatusDto, z2, str2, vr41Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o0v0 o0v0Var = (o0v0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = o0v0.f;
        if (b.F() || o0v0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, o0v0Var.a);
        }
        if (b.F() || o0v0Var.b != SubscriptionStatusDto.UNRECOGNIZED) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), o0v0Var.b);
        }
        if (b.F() || o0v0Var.c) {
            b.n(serialDescriptor, 2, o0v0Var.c);
        }
        if (b.F() || o0v0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, o0v0Var.d);
        }
        if (b.F() || o0v0Var.e != null) {
            b.g(serialDescriptor, 4, tr41.a, o0v0Var.e);
        }
        b.c(serialDescriptor);
    }
}
