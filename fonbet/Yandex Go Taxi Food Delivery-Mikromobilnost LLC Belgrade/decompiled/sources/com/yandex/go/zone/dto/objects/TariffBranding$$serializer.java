package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.TariffBranding;
import defpackage.auu0;
import defpackage.c7v;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.n7v;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/TariffBranding.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/TariffBranding;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/TariffBranding;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/TariffBranding;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class TariffBranding$$serializer implements uxs {
    public static final TariffBranding$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TariffBranding$$serializer tariffBranding$$serializer = new TariffBranding$$serializer();
        INSTANCE = tariffBranding$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.TariffBranding", tariffBranding$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("brand_color", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("inactive_icon", true);
        pluginGeneratedSerialDescriptor.j("card", true);
        pluginGeneratedSerialDescriptor.j("summary_payment_subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TariffBranding$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        c7v c7vVar = c7v.a;
        return new KSerializer[]{TariffBranding.h[0].getValue(), qke.n(auu0Var), qke.n(auu0Var), c7vVar, c7vVar, TariffBranding$Card$$serializer.INSTANCE, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final TariffBranding deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TariffBranding.h;
        b.getClass();
        TariffBranding tariffBranding = null;
        boolean z = true;
        int i = 0;
        BrandingType brandingType = null;
        String str = null;
        String str2 = null;
        n7v n7vVar = null;
        n7v n7vVar2 = null;
        TariffBranding.Card card = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    brandingType = (BrandingType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), brandingType);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    n7vVar = (n7v) b.A(serialDescriptor, 3, c7v.a, n7vVar);
                    i |= 8;
                    break;
                case 4:
                    n7vVar2 = (n7v) b.A(serialDescriptor, 4, c7v.a, n7vVar2);
                    i |= 16;
                    break;
                case 5:
                    card = (TariffBranding.Card) b.A(serialDescriptor, 5, TariffBranding$Card$$serializer.INSTANCE, card);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) b.s(serialDescriptor, 6, auu0.a, str3);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return tariffBranding;
            }
            tariffBranding = null;
        }
        b.c(serialDescriptor);
        return new TariffBranding(i, brandingType, str, str2, n7vVar, n7vVar2, card, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.objects.y5.a()) == false) goto L37;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, TariffBranding value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TariffBranding.h;
        if (b.F() || value.a != BrandingType.OTHER) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, n7v.f)) {
            b.e(serialDescriptor, 3, c7v.a, value.d);
        }
        if (b.F() || !jl40.l(value.e, n7v.f)) {
            b.e(serialDescriptor, 4, c7v.a, value.e);
        }
        if (!b.F()) {
            TariffBranding.Card card = value.f;
            TariffBranding.Card.Companion.getClass();
        }
        b.e(serialDescriptor, 5, TariffBranding$Card$$serializer.INSTANCE, value.f);
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
