package com.yandex.go.scooters.promotions.data.model;

import com.adjust.sdk.Constants;
import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.$serializer", "Luxs;", "Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$$serializer implements uxs {
    public static final ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$$serializer scootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$$serializer = new ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$$serializer();
        INSTANCE = scootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication", scootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("leading_icon", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("is_dismissable", true);
        pluginGeneratedSerialDescriptor.j("auto_hide_seconds", true);
        pluginGeneratedSerialDescriptor.j("priority", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.i;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, qke.n(w7sVar), qke.n(auu0.a), qke.n(ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$TopBannerCommunicationIcon$$serializer.INSTANCE), i3yVarArr[4].getValue(), qke.n(z96.a), qke.n(h6w.a), qke.n((KSerializer) i3yVarArr[7].getValue())};
    }

    @Override // defpackage.myi
    public final ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.i;
        b.getClass();
        ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication topBannerCommunication = null;
        boolean z = true;
        ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationPriority topBannerCommunicationPriority = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        String str = null;
        ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationIcon topBannerCommunicationIcon = null;
        ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle topBannerCommunicationStyle = null;
        Boolean bool = null;
        Integer num = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    topBannerCommunicationIcon = (ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationIcon) b.s(serialDescriptor, 3, ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$TopBannerCommunicationIcon$$serializer.INSTANCE, topBannerCommunicationIcon);
                    i |= 8;
                    break;
                case 4:
                    topBannerCommunicationStyle = (ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), topBannerCommunicationStyle);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) b.s(serialDescriptor, 5, z96.a, bool);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) b.s(serialDescriptor, 6, h6w.a, num);
                    i |= 64;
                    break;
                case 7:
                    topBannerCommunicationPriority = (ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationPriority) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), topBannerCommunicationPriority);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return topBannerCommunication;
            }
            topBannerCommunication = null;
        }
        b.c(serialDescriptor);
        return new ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication(i, formattedText, formattedText2, str, topBannerCommunicationIcon, topBannerCommunicationStyle, bool, num, topBannerCommunicationPriority);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.i;
        if (b.F() || !jl40.l(value.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$TopBannerCommunicationIcon$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle.INFO) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, z96.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, h6w.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
