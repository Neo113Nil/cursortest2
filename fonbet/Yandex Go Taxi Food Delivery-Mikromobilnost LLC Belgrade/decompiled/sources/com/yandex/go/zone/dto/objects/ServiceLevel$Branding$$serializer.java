package com.yandex.go.zone.dto.objects;

import com.adjust.sdk.Constants;
import com.yandex.go.zone.dto.objects.ServiceLevel;
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
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/ServiceLevel.Branding.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/ServiceLevel$Branding;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/ServiceLevel$Branding;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/ServiceLevel$Branding;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ServiceLevel$Branding$$serializer implements uxs {
    public static final ServiceLevel$Branding$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ServiceLevel$Branding$$serializer serviceLevel$Branding$$serializer = new ServiceLevel$Branding$$serializer();
        INSTANCE = serviceLevel$Branding$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.ServiceLevel.Branding", serviceLevel$Branding$$serializer, 22);
        pluginGeneratedSerialDescriptor.j("tooltip", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("redirect_class", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("has_chevron", true);
        pluginGeneratedSerialDescriptor.j("should_swap_texts", true);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("extra", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("attributed_info", true);
        pluginGeneratedSerialDescriptor.j("long_search_v2", true);
        pluginGeneratedSerialDescriptor.j("popup", true);
        pluginGeneratedSerialDescriptor.j("card", true);
        pluginGeneratedSerialDescriptor.j("text_color", true);
        pluginGeneratedSerialDescriptor.j("icon_appearance", true);
        pluginGeneratedSerialDescriptor.j("ride_time_appearance", true);
        pluginGeneratedSerialDescriptor.j("active_state", true);
        pluginGeneratedSerialDescriptor.j("inactive_state", true);
        pluginGeneratedSerialDescriptor.j("values", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ServiceLevel$Branding$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = ServiceLevel.Branding.w;
        KSerializer n = qke.n(ServiceLevel$Branding$Tooltip$$serializer.INSTANCE);
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[1].getValue());
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[2].getValue());
        auu0 auu0Var = auu0.a;
        KSerializer n4 = qke.n(auu0Var);
        KSerializer n5 = qke.n(auu0Var);
        KSerializer n6 = qke.n(auu0Var);
        KSerializer n7 = qke.n(auu0Var);
        KSerializer n8 = qke.n(auu0Var);
        KSerializer n9 = qke.n(auu0Var);
        KSerializer n10 = qke.n(ServiceLevel$LongSearchV2$$serializer.INSTANCE);
        KSerializer n11 = qke.n(ServiceLevel$TariffPopup$$serializer.INSTANCE);
        KSerializer n12 = qke.n(SummaryCardPromo$$serializer.INSTANCE);
        KSerializer n13 = qke.n(auu0Var);
        KSerializer n14 = qke.n(ServiceLevel$Branding$IconAppearance$$serializer.INSTANCE);
        KSerializer n15 = qke.n(ServiceLevel$Branding$RideTimeAppearance$$serializer.INSTANCE);
        z96 z96Var = z96.a;
        BrandingCashbackStyle$$serializer brandingCashbackStyle$$serializer = BrandingCashbackStyle$$serializer.INSTANCE;
        return new KSerializer[]{n, n2, n3, n4, n5, n6, z96Var, z96Var, n7, ServiceLevel$Branding$Extra$$serializer.INSTANCE, n8, n9, TariffModifierInfo$$serializer.INSTANCE, n10, n11, n12, n13, n14, n15, brandingCashbackStyle$$serializer, brandingCashbackStyle$$serializer, BrandingValues$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final ServiceLevel.Branding deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        String str;
        ServiceLevel.Branding.Extra extra;
        int i;
        TariffModifierInfo tariffModifierInfo;
        ServiceLevel.Branding.Tooltip tooltip;
        String str2;
        ServiceLevel.Branding.Extra extra2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = ServiceLevel.Branding.w;
        b.getClass();
        TariffModifierInfo tariffModifierInfo2 = null;
        String str3 = null;
        String str4 = null;
        ServiceLevel.Branding.Extra extra3 = null;
        ServiceLevel.LongSearchV2 longSearchV2 = null;
        BrandingValues brandingValues = null;
        int i2 = 0;
        SummaryCardPromo summaryCardPromo = null;
        String str5 = null;
        ServiceLevel.Branding.IconAppearance iconAppearance = null;
        ServiceLevel.Branding.RideTimeAppearance rideTimeAppearance = null;
        BrandingCashbackStyle brandingCashbackStyle = null;
        BrandingCashbackStyle brandingCashbackStyle2 = null;
        ServiceLevel.TariffPopup tariffPopup = null;
        boolean z = false;
        int i3 = 1;
        boolean z2 = true;
        boolean z3 = false;
        ServiceLevel.Branding.Tooltip tooltip2 = null;
        ServiceLevel.Branding.Action action = null;
        ServiceLevel.Branding.Type type = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    tariffModifierInfo = tariffModifierInfo2;
                    tooltip = tooltip2;
                    z2 = false;
                    str3 = str3;
                    extra3 = extra3;
                    i3 = 1;
                    tooltip2 = tooltip;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 0:
                    tariffModifierInfo = tariffModifierInfo2;
                    tooltip = (ServiceLevel.Branding.Tooltip) b.s(serialDescriptor, 0, ServiceLevel$Branding$Tooltip$$serializer.INSTANCE, tooltip2);
                    i2 |= 1;
                    str3 = str3;
                    extra3 = extra3;
                    str4 = str4;
                    i3 = 1;
                    tooltip2 = tooltip;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 1:
                    tariffModifierInfo = tariffModifierInfo2;
                    ServiceLevel.Branding.Extra extra4 = extra3;
                    int i4 = i3;
                    action = (ServiceLevel.Branding.Action) b.s(serialDescriptor, i4, (myi) i3yVarArr[i3].getValue(), action);
                    i2 |= 2;
                    type = type;
                    extra3 = extra4;
                    str4 = str4;
                    i3 = i4;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 2:
                    tariffModifierInfo = tariffModifierInfo2;
                    str2 = str4;
                    extra2 = extra3;
                    type = (ServiceLevel.Branding.Type) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), type);
                    i2 |= 4;
                    extra3 = extra2;
                    str4 = str2;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 3:
                    tariffModifierInfo = tariffModifierInfo2;
                    str2 = str4;
                    extra2 = extra3;
                    str6 = (String) b.s(serialDescriptor, 3, auu0.a, str6);
                    i2 |= 8;
                    extra3 = extra2;
                    str4 = str2;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 4:
                    tariffModifierInfo = tariffModifierInfo2;
                    str2 = str4;
                    extra2 = extra3;
                    str7 = (String) b.s(serialDescriptor, 4, auu0.a, str7);
                    i2 |= 16;
                    extra3 = extra2;
                    str4 = str2;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 5:
                    tariffModifierInfo = tariffModifierInfo2;
                    str2 = str4;
                    extra2 = extra3;
                    str8 = (String) b.s(serialDescriptor, 5, auu0.a, str8);
                    i2 |= 32;
                    extra3 = extra2;
                    str4 = str2;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 6:
                    tariffModifierInfo = tariffModifierInfo2;
                    str2 = str4;
                    z3 = b.C(serialDescriptor, 6);
                    i2 |= 64;
                    str4 = str2;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 7:
                    tariffModifierInfo = tariffModifierInfo2;
                    str2 = str4;
                    z = b.C(serialDescriptor, 7);
                    i2 |= 128;
                    str4 = str2;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 8:
                    tariffModifierInfo = tariffModifierInfo2;
                    str2 = str4;
                    extra2 = extra3;
                    str9 = (String) b.s(serialDescriptor, 8, auu0.a, str9);
                    i2 |= 256;
                    extra3 = extra2;
                    str4 = str2;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 9:
                    tariffModifierInfo = tariffModifierInfo2;
                    str2 = str4;
                    extra3 = (ServiceLevel.Branding.Extra) b.A(serialDescriptor, 9, ServiceLevel$Branding$Extra$$serializer.INSTANCE, extra3);
                    i2 |= 512;
                    str4 = str2;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 10:
                    tariffModifierInfo = tariffModifierInfo2;
                    str4 = (String) b.s(serialDescriptor, 10, auu0.a, str4);
                    i2 |= 1024;
                    extra3 = extra3;
                    tariffModifierInfo2 = tariffModifierInfo;
                case 11:
                    str = str4;
                    extra = extra3;
                    str3 = (String) b.s(serialDescriptor, 11, auu0.a, str3);
                    i2 |= 2048;
                    extra3 = extra;
                    str4 = str;
                case 12:
                    str = str4;
                    extra = extra3;
                    tariffModifierInfo2 = (TariffModifierInfo) b.A(serialDescriptor, 12, TariffModifierInfo$$serializer.INSTANCE, tariffModifierInfo2);
                    i2 |= 4096;
                    extra3 = extra;
                    str4 = str;
                case 13:
                    str = str4;
                    extra = extra3;
                    longSearchV2 = (ServiceLevel.LongSearchV2) b.s(serialDescriptor, 13, ServiceLevel$LongSearchV2$$serializer.INSTANCE, longSearchV2);
                    i2 |= 8192;
                    extra3 = extra;
                    str4 = str;
                case 14:
                    str = str4;
                    extra = extra3;
                    tariffPopup = (ServiceLevel.TariffPopup) b.s(serialDescriptor, 14, ServiceLevel$TariffPopup$$serializer.INSTANCE, tariffPopup);
                    i2 |= 16384;
                    extra3 = extra;
                    str4 = str;
                case 15:
                    str = str4;
                    extra = extra3;
                    summaryCardPromo = (SummaryCardPromo) b.s(serialDescriptor, 15, SummaryCardPromo$$serializer.INSTANCE, summaryCardPromo);
                    i = 32768;
                    i2 |= i;
                    extra3 = extra;
                    str4 = str;
                case 16:
                    str = str4;
                    extra = extra3;
                    str5 = (String) b.s(serialDescriptor, 16, auu0.a, str5);
                    i = 65536;
                    i2 |= i;
                    extra3 = extra;
                    str4 = str;
                case 17:
                    str = str4;
                    extra = extra3;
                    iconAppearance = (ServiceLevel.Branding.IconAppearance) b.s(serialDescriptor, 17, ServiceLevel$Branding$IconAppearance$$serializer.INSTANCE, iconAppearance);
                    i = 131072;
                    i2 |= i;
                    extra3 = extra;
                    str4 = str;
                case 18:
                    str = str4;
                    extra = extra3;
                    rideTimeAppearance = (ServiceLevel.Branding.RideTimeAppearance) b.s(serialDescriptor, 18, ServiceLevel$Branding$RideTimeAppearance$$serializer.INSTANCE, rideTimeAppearance);
                    i = 262144;
                    i2 |= i;
                    extra3 = extra;
                    str4 = str;
                case 19:
                    str = str4;
                    extra = extra3;
                    brandingCashbackStyle = (BrandingCashbackStyle) b.A(serialDescriptor, 19, BrandingCashbackStyle$$serializer.INSTANCE, brandingCashbackStyle);
                    i = 524288;
                    i2 |= i;
                    extra3 = extra;
                    str4 = str;
                case 20:
                    str = str4;
                    extra = extra3;
                    brandingCashbackStyle2 = (BrandingCashbackStyle) b.A(serialDescriptor, 20, BrandingCashbackStyle$$serializer.INSTANCE, brandingCashbackStyle2);
                    i = 1048576;
                    i2 |= i;
                    extra3 = extra;
                    str4 = str;
                case 21:
                    extra = extra3;
                    str = str4;
                    brandingValues = (BrandingValues) b.A(serialDescriptor, 21, BrandingValues$$serializer.INSTANCE, brandingValues);
                    i = 2097152;
                    i2 |= i;
                    extra3 = extra;
                    str4 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        TariffModifierInfo tariffModifierInfo3 = tariffModifierInfo2;
        ServiceLevel.Branding.Extra extra5 = extra3;
        ServiceLevel.Branding.Tooltip tooltip3 = tooltip2;
        ServiceLevel.Branding.Action action2 = action;
        ServiceLevel.Branding.Type type2 = type;
        b.c(serialDescriptor);
        return new ServiceLevel.Branding(i2, tooltip3, action2, type2, str6, str7, str8, z3, z, str9, extra5, str4, str3, tariffModifierInfo3, longSearchV2, tariffPopup, summaryCardPromo, str5, iconAppearance, rideTimeAppearance, brandingCashbackStyle, brandingCashbackStyle2, brandingValues);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ServiceLevel.Branding value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        ServiceLevel.Branding.e(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
