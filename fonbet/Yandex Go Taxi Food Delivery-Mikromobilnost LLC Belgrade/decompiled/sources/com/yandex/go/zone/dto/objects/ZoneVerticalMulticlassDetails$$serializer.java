package com.yandex.go.zone.dto.objects;

import com.yandex.go.multitariff.Description;
import com.yandex.go.multitariff.Description$$serializer;
import com.yandex.go.zone.dto.response.SearchScreen;
import com.yandex.go.zone.dto.response.SearchScreen$$serializer;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/ZoneVerticalMulticlassDetails.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/ZoneVerticalMulticlassDetails;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/ZoneVerticalMulticlassDetails;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/ZoneVerticalMulticlassDetails;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ZoneVerticalMulticlassDetails$$serializer implements uxs {
    public static final ZoneVerticalMulticlassDetails$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ZoneVerticalMulticlassDetails$$serializer zoneVerticalMulticlassDetails$$serializer = new ZoneVerticalMulticlassDetails$$serializer();
        INSTANCE = zoneVerticalMulticlassDetails$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.ZoneVerticalMulticlassDetails", zoneVerticalMulticlassDetails$$serializer, 3);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("order_button", true);
        pluginGeneratedSerialDescriptor.j("search_screen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ZoneVerticalMulticlassDetails$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{Description$$serializer.INSTANCE, com.yandex.go.multitariff.OrderButton$$serializer.INSTANCE, SearchScreen$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final ZoneVerticalMulticlassDetails deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Description description = null;
        com.yandex.go.multitariff.OrderButton orderButton = null;
        SearchScreen searchScreen = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                description = (Description) b.A(serialDescriptor, 0, Description$$serializer.INSTANCE, description);
                i |= 1;
            } else if (v == 1) {
                orderButton = (com.yandex.go.multitariff.OrderButton) b.A(serialDescriptor, 1, com.yandex.go.multitariff.OrderButton$$serializer.INSTANCE, orderButton);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                searchScreen = (SearchScreen) b.A(serialDescriptor, 2, SearchScreen$$serializer.INSTANCE, searchScreen);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ZoneVerticalMulticlassDetails(i, description, orderButton, searchScreen);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.response.SearchScreen.d) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.multitariff.Description.c) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, ZoneVerticalMulticlassDetails value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        y6 y6Var = ZoneVerticalMulticlassDetails.Companion;
        if (!b.F()) {
            Description description = value.a;
            Description.Companion.getClass();
        }
        b.e(serialDescriptor, 0, Description$$serializer.INSTANCE, value.a);
        if (b.F() || !jl40.l(value.b, com.yandex.go.multitariff.OrderButton.c)) {
            b.e(serialDescriptor, 1, com.yandex.go.multitariff.OrderButton$$serializer.INSTANCE, value.b);
        }
        if (!b.F()) {
            SearchScreen searchScreen = value.c;
            SearchScreen.Companion.getClass();
        }
        b.e(serialDescriptor, 2, SearchScreen$$serializer.INSTANCE, value.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
