package com.yandex.go.zone.dto.objects;

import defpackage.auu0;
import defpackage.c7v;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.lji;
import defpackage.myi;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/DeliveryPin.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/DeliveryPin;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/DeliveryPin;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/DeliveryPin;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes15.dex */
public final /* synthetic */ class DeliveryPin$$serializer implements uxs {
    public static final DeliveryPin$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DeliveryPin$$serializer deliveryPin$$serializer = new DeliveryPin$$serializer();
        INSTANCE = deliveryPin$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.DeliveryPin", deliveryPin$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("show_on_summary", true);
        pluginGeneratedSerialDescriptor.j("lead", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("icon_background_color", true);
        pluginGeneratedSerialDescriptor.j("icon_tint_color", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("swap_texts", true);
        pluginGeneratedSerialDescriptor.j("has_chevron", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeliveryPin$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{DeliveryPin.k[0].getValue(), qke.n(z96Var), qke.n(lji.e), qke.n(c7v.a), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final DeliveryPin deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = DeliveryPin.k;
        b.getClass();
        Boolean bool = null;
        Boolean bool2 = null;
        boolean z = true;
        String str = null;
        int i = 0;
        DeliveryPinType deliveryPinType = null;
        Boolean bool3 = null;
        s1 s1Var = null;
        n7v n7vVar = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    deliveryPinType = (DeliveryPinType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), deliveryPinType);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    bool3 = (Boolean) b.s(serialDescriptor, 1, z96.a, bool3);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    s1Var = (s1) b.s(serialDescriptor, 2, lji.e, s1Var);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    n7vVar = (n7v) b.s(serialDescriptor, 3, c7v.a, n7vVar);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    str4 = (String) b.s(serialDescriptor, 6, auu0.a, str4);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 7, auu0.a, str);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    bool2 = (Boolean) b.s(serialDescriptor, 8, z96.a, bool2);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    bool = (Boolean) b.s(serialDescriptor, 9, z96.a, bool);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new DeliveryPin(i, deliveryPinType, bool3, s1Var, n7vVar, str2, str3, str4, str, bool2, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DeliveryPin value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryPin.k;
        if (b.F() || value.a != DeliveryPinType.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, z96.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, lji.e, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, c7v.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, auu0.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, z96.a, value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, z96.a, value.j);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
