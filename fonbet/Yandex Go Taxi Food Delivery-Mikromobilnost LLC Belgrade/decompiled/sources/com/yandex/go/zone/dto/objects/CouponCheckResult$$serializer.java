package com.yandex.go.zone.dto.objects;

import defpackage.auu0;
import defpackage.e6m;
import defpackage.gef;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/CouponCheckResult.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/CouponCheckResult;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/CouponCheckResult;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/CouponCheckResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class CouponCheckResult$$serializer implements uxs {
    public static final CouponCheckResult$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CouponCheckResult$$serializer couponCheckResult$$serializer = new CouponCheckResult$$serializer();
        INSTANCE = couponCheckResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.CouponCheckResult", couponCheckResult$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("valid", true);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("value_as_str", true);
        pluginGeneratedSerialDescriptor.j("descr", true);
        pluginGeneratedSerialDescriptor.j("card_price_descr", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("valid_any", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("error_code", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CouponCheckResult$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = CouponCheckResult.j;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96Var, e6m.a, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(z96Var), qke.n(gef.a), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final CouponCheckResult deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = CouponCheckResult.j;
        b.getClass();
        double d = 0.0d;
        String str = null;
        boolean z = true;
        List list = null;
        ief iefVar = null;
        Boolean bool = null;
        int i = 0;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    d = b.E(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    bool = (Boolean) b.s(serialDescriptor, 6, z96.a, bool);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    iefVar = (ief) b.s(serialDescriptor, 7, gef.a, iefVar);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new CouponCheckResult(i, z2, d, str2, str3, str4, list, bool, iefVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CouponCheckResult value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CouponCheckResult.j;
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
        }
        if (b.F() || Double.compare(value.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, z96.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, gef.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, auu0.a, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
