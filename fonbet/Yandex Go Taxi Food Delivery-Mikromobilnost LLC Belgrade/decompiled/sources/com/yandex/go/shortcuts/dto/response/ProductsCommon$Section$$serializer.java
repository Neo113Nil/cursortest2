package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/dto/response/ProductsCommon.Section.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/dto/response/ProductsCommon$Section;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/dto/response/ProductsCommon$Section;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/dto/response/ProductsCommon$Section;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ProductsCommon$Section$$serializer implements uxs {
    public static final ProductsCommon$Section$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductsCommon$Section$$serializer productsCommon$Section$$serializer = new ProductsCommon$Section$$serializer();
        INSTANCE = productsCommon$Section$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.dto.response.ProductsCommon.Section", productsCommon$Section$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("shortcut_ids", true);
        pluginGeneratedSerialDescriptor.j("button_ids", true);
        pluginGeneratedSerialDescriptor.j("stack_item_ids", true);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("typed_header", true);
        pluginGeneratedSerialDescriptor.j("tags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProductsCommon$Section$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = ProductsCommon$Section.h;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), qke.n(ProductMode$Taxi$SectionHeader$$serializer.INSTANCE), qke.n(SectionTypedHeader$$serializer.INSTANCE), i3yVarArr[6].getValue()};
    }

    @Override // defpackage.myi
    public final ProductsCommon$Section deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = ProductsCommon$Section.h;
        b.getClass();
        ProductsCommon$Section productsCommon$Section = null;
        boolean z = true;
        int i = 0;
        ProductMode$Taxi.SectionType sectionType = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        ProductMode$Taxi.SectionHeader sectionHeader = null;
        SectionTypedHeader sectionTypedHeader = null;
        jsq0 jsq0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    sectionType = (ProductMode$Taxi.SectionType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), sectionType);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    list3 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list3);
                    i |= 8;
                    break;
                case 4:
                    sectionHeader = (ProductMode$Taxi.SectionHeader) b.s(serialDescriptor, 4, ProductMode$Taxi$SectionHeader$$serializer.INSTANCE, sectionHeader);
                    i |= 16;
                    break;
                case 5:
                    sectionTypedHeader = (SectionTypedHeader) b.s(serialDescriptor, 5, SectionTypedHeader$$serializer.INSTANCE, sectionTypedHeader);
                    i |= 32;
                    break;
                case 6:
                    jsq0Var = (jsq0) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), jsq0Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return productsCommon$Section;
            }
            productsCommon$Section = null;
        }
        b.c(serialDescriptor);
        return new ProductsCommon$Section(i, sectionType, list, list2, list3, sectionHeader, sectionTypedHeader, jsq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ProductsCommon$Section value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        ProductsCommon$Section.c(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
