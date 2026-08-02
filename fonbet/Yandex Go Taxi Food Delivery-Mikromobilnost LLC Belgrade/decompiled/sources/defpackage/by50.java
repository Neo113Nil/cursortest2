package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.plus.home.datasource.openapi.models.NetworkPlaquePayloadRequestModel$RestrictionMode;
import com.yandex.plus.home.datasource.openapi.models.NetworkPlaquePayloadRequestModel$Theme;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class by50 implements uxs {
    public static final by50 a;
    private static final SerialDescriptor descriptor;

    static {
        by50 by50Var = new by50();
        a = by50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkPlaquePayloadRequestModel", by50Var, 3);
        pluginGeneratedSerialDescriptor.j(DivkitThemeChangeListener.THEME_VARIABLE_NAME, false);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("restrictionMode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = dy50.d;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(lw50.a), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = dy50.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        NetworkPlaquePayloadRequestModel$Theme networkPlaquePayloadRequestModel$Theme = null;
        nw50 nw50Var = null;
        NetworkPlaquePayloadRequestModel$RestrictionMode networkPlaquePayloadRequestModel$RestrictionMode = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                networkPlaquePayloadRequestModel$Theme = (NetworkPlaquePayloadRequestModel$Theme) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), networkPlaquePayloadRequestModel$Theme);
                i |= 1;
            } else if (v == 1) {
                nw50Var = (nw50) b.s(serialDescriptor, 1, lw50.a, nw50Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                networkPlaquePayloadRequestModel$RestrictionMode = (NetworkPlaquePayloadRequestModel$RestrictionMode) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), networkPlaquePayloadRequestModel$RestrictionMode);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new dy50(i, networkPlaquePayloadRequestModel$Theme, nw50Var, networkPlaquePayloadRequestModel$RestrictionMode);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dy50 dy50Var = (dy50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = dy50.d;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        NetworkPlaquePayloadRequestModel$Theme networkPlaquePayloadRequestModel$Theme = dy50Var.a;
        NetworkPlaquePayloadRequestModel$RestrictionMode networkPlaquePayloadRequestModel$RestrictionMode = dy50Var.c;
        nw50 nw50Var = dy50Var.b;
        b.e(serialDescriptor, 0, kSerializer, networkPlaquePayloadRequestModel$Theme);
        if (b.F() || nw50Var != null) {
            b.g(serialDescriptor, 1, lw50.a, nw50Var);
        }
        if (b.F() || networkPlaquePayloadRequestModel$RestrictionMode != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), networkPlaquePayloadRequestModel$RestrictionMode);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
