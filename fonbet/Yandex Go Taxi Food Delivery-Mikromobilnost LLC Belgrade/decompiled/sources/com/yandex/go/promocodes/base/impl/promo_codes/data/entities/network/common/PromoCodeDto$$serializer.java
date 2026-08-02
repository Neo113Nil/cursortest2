package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.auu0;
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
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeDto.$serializer", "Luxs;", "Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class PromoCodeDto$$serializer implements uxs {
    public static final PromoCodeDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PromoCodeDto$$serializer promoCodeDto$$serializer = new PromoCodeDto$$serializer();
        INSTANCE = promoCodeDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDto", promoCodeDto$$serializer, 14);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_CODE, true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("selected", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("services", true);
        pluginGeneratedSerialDescriptor.j("id_for_section_split", true);
        pluginGeneratedSerialDescriptor.j("classes", true);
        pluginGeneratedSerialDescriptor.j("additional_discount_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PromoCodeDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PromoCodeDto.o;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[4].getValue()), z96.a, qke.n(auu0Var), qke.n(PromoCodeErrorDto$$serializer.INSTANCE), qke.n(gef.a), qke.n(PromoCodeActionDto$$serializer.INSTANCE), i3yVarArr[10].getValue(), qke.n(auu0Var), i3yVarArr[12].getValue(), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final PromoCodeDto deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        String str;
        boolean z;
        String str2;
        boolean z2;
        String str3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PromoCodeDto.o;
        b.getClass();
        String str4 = null;
        List list = null;
        PromoCodeActionDto promoCodeActionDto = null;
        ief iefVar = null;
        List list2 = null;
        PromoCodeErrorDto promoCodeErrorDto = null;
        int i = 0;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        PromoCodeStatusDto promoCodeStatusDto = null;
        boolean z3 = false;
        String str9 = null;
        boolean z4 = true;
        String str10 = null;
        while (z4) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str2 = str4;
                    z2 = z3;
                    str3 = str6;
                    z4 = false;
                    str6 = str3;
                    str4 = str2;
                    z3 = z2;
                case 0:
                    str2 = str4;
                    z2 = z3;
                    str3 = str6;
                    str10 = b.k(serialDescriptor, 0);
                    i |= 1;
                    str6 = str3;
                    str4 = str2;
                    z3 = z2;
                case 1:
                    z2 = z3;
                    str2 = str4;
                    str6 = (String) b.s(serialDescriptor, 1, auu0.a, str6);
                    i |= 2;
                    str4 = str2;
                    z3 = z2;
                case 2:
                    str = str6;
                    z = z3;
                    str7 = (String) b.s(serialDescriptor, 2, auu0.a, str7);
                    i |= 4;
                    z3 = z;
                    str6 = str;
                case 3:
                    str = str6;
                    z = z3;
                    str8 = (String) b.s(serialDescriptor, 3, auu0.a, str8);
                    i |= 8;
                    z3 = z;
                    str6 = str;
                case 4:
                    str = str6;
                    z = z3;
                    promoCodeStatusDto = (PromoCodeStatusDto) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), promoCodeStatusDto);
                    i |= 16;
                    z3 = z;
                    str6 = str;
                case 5:
                    str = str6;
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    str6 = str;
                case 6:
                    str = str6;
                    z = z3;
                    str9 = (String) b.s(serialDescriptor, 6, auu0.a, str9);
                    i |= 64;
                    z3 = z;
                    str6 = str;
                case 7:
                    str = str6;
                    z = z3;
                    promoCodeErrorDto = (PromoCodeErrorDto) b.s(serialDescriptor, 7, PromoCodeErrorDto$$serializer.INSTANCE, promoCodeErrorDto);
                    i |= 128;
                    z3 = z;
                    str6 = str;
                case 8:
                    str = str6;
                    z = z3;
                    iefVar = (ief) b.s(serialDescriptor, 8, gef.a, iefVar);
                    i |= 256;
                    z3 = z;
                    str6 = str;
                case 9:
                    str = str6;
                    z = z3;
                    promoCodeActionDto = (PromoCodeActionDto) b.s(serialDescriptor, 9, PromoCodeActionDto$$serializer.INSTANCE, promoCodeActionDto);
                    i |= 512;
                    z3 = z;
                    str6 = str;
                case 10:
                    str = str6;
                    z = z3;
                    list = (List) b.A(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), list);
                    i |= 1024;
                    z3 = z;
                    str6 = str;
                case 11:
                    str = str6;
                    z = z3;
                    str4 = (String) b.s(serialDescriptor, 11, auu0.a, str4);
                    i |= 2048;
                    z3 = z;
                    str6 = str;
                case 12:
                    str = str6;
                    z = z3;
                    list2 = (List) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), list2);
                    i |= 4096;
                    z3 = z;
                    str6 = str;
                case 13:
                    z = z3;
                    str = str6;
                    str5 = (String) b.s(serialDescriptor, 13, auu0.a, str5);
                    i |= 8192;
                    z3 = z;
                    str6 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        boolean z5 = z3;
        String str11 = str6;
        b.c(serialDescriptor);
        return new PromoCodeDto(i, str10, str11, str7, str8, promoCodeStatusDto, z5, str9, promoCodeErrorDto, iefVar, promoCodeActionDto, list, str4, list2, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PromoCodeDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PromoCodeDto.b(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
