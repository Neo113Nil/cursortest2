package com.yandex.go.shortcuts.dto.request;

import com.yandex.go.shortcuts.dto.request.ProductsParam;
import com.yandex.go.shortcuts.dto.response.ShortcutIconSize;
import com.yandex.go.shortcuts.dto.response.ShortcutTitleSize;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.jxi;
import defpackage.ksq0;
import defpackage.myi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/dto/request/ProductsParam.Shortcuts.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/dto/request/ProductsParam$Shortcuts;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/dto/request/ProductsParam$Shortcuts;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/dto/request/ProductsParam$Shortcuts;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ProductsParam$Shortcuts$$serializer implements uxs {
    public static final ProductsParam$Shortcuts$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductsParam$Shortcuts$$serializer productsParam$Shortcuts$$serializer = new ProductsParam$Shortcuts$$serializer();
        INSTANCE = productsParam$Shortcuts$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.dto.request.ProductsParam.Shortcuts", productsParam$Shortcuts$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("supported_features", true);
        pluginGeneratedSerialDescriptor.j("supported_actions", true);
        pluginGeneratedSerialDescriptor.j("supported_sections", true);
        pluginGeneratedSerialDescriptor.j("mdash_width", true);
        pluginGeneratedSerialDescriptor.j("ndash_width", true);
        pluginGeneratedSerialDescriptor.j("grids_support", true);
        pluginGeneratedSerialDescriptor.j("multicolor_service_icons_supported", true);
        pluginGeneratedSerialDescriptor.j("supported_icon_sizes", true);
        pluginGeneratedSerialDescriptor.j("supported_title_sizes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProductsParam$Shortcuts$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ProductsParam.Shortcuts.j;
        nor norVar = nor.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), norVar, norVar, i3yVarArr[5].getValue(), z96.a, i3yVarArr[7].getValue(), i3yVarArr[8].getValue()};
    }

    @Override // defpackage.myi
    public final ProductsParam.Shortcuts deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ProductsParam.Shortcuts.j;
        b.getClass();
        float f = 0.0f;
        float f2 = 0.0f;
        jsq0 jsq0Var = null;
        boolean z = true;
        jsq0 jsq0Var2 = null;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    list3 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list3);
                    i |= 4;
                    break;
                case 3:
                    f = b.y(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    f2 = b.y(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list4 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list4);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    jsq0Var2 = (jsq0) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), jsq0Var2);
                    i |= 128;
                    break;
                case 8:
                    jsq0Var = (jsq0) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), jsq0Var);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ProductsParam.Shortcuts(i, list, list2, list3, f, f2, list4, z2, jsq0Var2, jsq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        if (defpackage.jl40.l(r1, new defpackage.jsq0(r2)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010b, code lost:
    
        if (defpackage.jl40.l(r1, new defpackage.jsq0(r2)) == false) goto L55;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, ProductsParam.Shortcuts value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ProductsParam.Shortcuts.j;
        int i = 0;
        if (b.F() || !jl40.l(value.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || !jl40.l(value.b, ProductsParam.l)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || !jl40.l(value.c, ProductsParam.m)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || Float.compare(value.d, 0.0f) != 0) {
            b.z(serialDescriptor, 3, value.d);
        }
        if (b.F() || Float.compare(value.e, 0.0f) != 0) {
            b.z(serialDescriptor, 4, value.e);
        }
        if (b.F() || !jl40.l(value.f, Collections.singletonList(new ProductsParam.SupportedGrid(i)))) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        if (b.F() || !value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        if (!b.F()) {
            jsq0 jsq0Var = value.h;
            List singletonList = Collections.singletonList(ShortcutIconSize.MEDIUM);
            jsq0 jsq0Var2 = ksq0.a;
        }
        b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), value.h);
        if (!b.F()) {
            jsq0 jsq0Var3 = value.i;
            List singletonList2 = Collections.singletonList(ShortcutTitleSize.REGULAR);
            jsq0 jsq0Var4 = ksq0.a;
        }
        b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), value.i);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
