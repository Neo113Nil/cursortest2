package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.Branding;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/Branding.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/Branding;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/Branding;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/Branding;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class Branding$$serializer implements uxs {
    public static final Branding$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Branding$$serializer branding$$serializer = new Branding$$serializer();
        INSTANCE = branding$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.Branding", branding$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("brand_color", true);
        pluginGeneratedSerialDescriptor.j("link", true);
        pluginGeneratedSerialDescriptor.j("profile", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Branding$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = Branding.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(Branding$Profile$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final Branding deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = Branding.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        BrandingType brandingType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Branding.Profile profile = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                brandingType = (BrandingType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), brandingType);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else if (v == 3) {
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                profile = (Branding.Profile) b.s(serialDescriptor, 4, Branding$Profile$$serializer.INSTANCE, profile);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new Branding(i, brandingType, str, str2, str3, profile);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Branding value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        Branding.b(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
